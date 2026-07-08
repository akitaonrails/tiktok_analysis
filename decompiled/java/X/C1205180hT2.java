package X;

import Y.AObserverS222S0100000_18;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.nearby.settings.NearbyTabConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205180hT2 implements InterfaceC1583070rIX, LifecycleOwner {
    public final View LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public final TextView LLIZ;
    public final AObserverS222S0100000_18 LLIZLLLIL;
    public final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(this);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2468));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2467));

    @Override // X.InterfaceC1583070rIX
    public final void setText(String str) {
    }

    public final void LIZJ() {
        if (this.LLILLL) {
            this.LLILLL = false;
            this.LLILZ = false;
            this.LLIZ.setCompoundDrawablesRelative(null, null, null, null);
        }
    }

    @Override // X.InterfaceC1583070rIX
    public final float getTextWidth() {
        TextPaint paint = this.LLIZ.getPaint();
        if (paint != null) {
            return paint.measureText(this.LLIZ.getText().toString());
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1583070rIX
    public final int LIZ() {
        return getView().getWidth();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1583070rIX
    public final View getView() {
        return this.LL;
    }

    public final Drawable LIZIZ(boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.raw.icon_chevron_up_fill;
            i2 = R.drawable.bua;
        } else {
            i = R.raw.icon_chevron_down_fill;
            i2 = R.drawable.bu_;
        }
        if (C1591480rW6.LIZ() == 3 && C960203pA.LIZIZ(this.LL.getContext())) {
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LL.getContext(), i2);
            if (drawableLIZIZ != null) {
                drawableLIZIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
            return drawableLIZIZ;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, this.LL.getContext());
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        return tuxIconDrawableLIZ;
    }

    public C1205180hT2(View view, String str) {
        this.LL = view;
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText(str);
        C1205170hT1.LIZ.getClass();
        C1205170hT1.LIZLLL = str;
        this.LLIZ = textView;
        this.LLIZLLLIL = new AObserverS222S0100000_18(this, 20);
        String str2 = NearbyTabConfig.LIZ().isRecallNearbyTab;
        if (str2 != null && str2.length() > 0) {
            C1204940hSe c1204940hSe = C1204940hSe.LIZ;
            PageFinder pageFinderVia = PageFinder.via(view);
            c1204940hSe.getClass();
            C1204940hSe.LIZJ(str2, pageFinderVia);
        }
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1208760hYo(this, 1));
        C629410OmR.LIZIZ(new AwS562S0100000_18(this, 2466));
    }
}
