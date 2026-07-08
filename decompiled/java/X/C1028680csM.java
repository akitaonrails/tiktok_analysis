package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import mf.a;

/* JADX INFO: renamed from: X.0csM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028680csM extends RelativeLayout {
    public SmartImageView LL;
    public ImageView LLILLJJLI;
    public FrameLayout LLILLL;
    public final C01GW LLILZ;
    public InterfaceC1028690csN LLILZIL;

    public final SmartImageView getAwardImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bla);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final FrameLayout getAwardLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.blb);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final ImageView getCloseImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e1n);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final InterfaceC1000280c8Y getFeedAdDepend() {
        return (InterfaceC1000280c8Y) this.LLILZ.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(C960203pA.LIZ(R.attr.a1_, getContext()));
        View.OnClickListener aCListenerS151S0100000_16 = new ACListenerS151S0100000_16(this, 8);
        if (C1848410yCV.LIZ) {
            aCListenerS151S0100000_16 = new f(aCListenerS151S0100000_16);
        }
        a aVar = new a(aCListenerS151S0100000_16);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final InterfaceC1028690csN getCallback() {
        return this.LLILZIL;
    }

    public final void setAwardImageFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setAwardLayoutFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setCallback(InterfaceC1028690csN interfaceC1028690csN) {
        this.LLILZIL = interfaceC1028690csN;
    }

    public final void setCloseImageFromXml(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public C1028680csM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(370));
    }
}
