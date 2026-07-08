package X;

import Y.ACListenerS72S0300000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ENN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENN extends AbstractC21673619ry<C0ENO> {
    public final Context LL;
    public List<C0EN8> LLILLJJLI;
    public C0ENQ LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public boolean LLIZ;
    public final LayerDrawable LLIZLLLIL;
    public final LayerDrawable LLJ;

    public C0ENN() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0ENN(Context context) {
        ArrayList arrayList = new ArrayList();
        this.LL = context;
        this.LLILLJJLI = arrayList;
        int iMin = Math.min((int) (((double) C497820Jfg.LIZIZ(context)) * 0.185d), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
        this.LLILZ = iMin;
        int iMin2 = Math.min((int) (((double) C497820Jfg.LIZIZ(context)) * 0.14d), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZIL = iMin2;
        this.LLILZLL = ((iMin - iMin2) / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLIZ = true;
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf = Integer.valueOf(R.attr.dz);
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context)});
        layerDrawable.setLayerInset(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLIZLLLIL = layerDrawable;
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
        c384050F3z2.LJFF = Integer.valueOf(R.attr.a1h);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = numValueOf;
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{c384050F3z2.LIZ(context), c384050F3z3.LIZ(context)});
        layerDrawable2.setLayerInset(1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLJ = layerDrawable2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        LayerDrawable layerDrawable;
        C0ENO c0eno = (C0ENO) viewHolder;
        C0EN8 c0en8 = (C0EN8) ListProtector.get(this.LLILLJJLI, i);
        TuxTextView tuxTextView = c0eno.LL;
        int i2 = c0en8.LIZJ;
        if (i2 != 0) {
            string = this.LL.getString(i2);
        } else {
            string = "";
        }
        tuxTextView.setText(string);
        TuxIconView tuxIconView = c0eno.LLILLJJLI;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = c0en8.LIZIZ;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        tuxIconView.setTuxIcon(c419910GdJ);
        FrameLayout frameLayout = c0eno.LLILLL;
        if (c0en8.LJ) {
            layerDrawable = this.LLJ;
        } else {
            layerDrawable = this.LLIZLLLIL;
        }
        frameLayout.setBackground(layerDrawable);
        C786410Ut5.I7(new ACListenerS72S0300000_5(this, c0en8, c0eno, 5), c0eno.itemView);
        EnumC1641380soa enumC1641380soa = c0en8.LJII;
        int i3 = c0en8.LJIIIIZZ;
        if (enumC1641380soa == EnumC1641380soa.FAILED) {
            C786410Ut5.LJLLLLLL(0, c0eno.LLILZIL);
        } else {
            C786410Ut5.LJLLLLLL(8, c0eno.LLILZIL);
        }
        if (enumC1641380soa == EnumC1641380soa.START && i3 >= 0 && i3 <= 100) {
            C786410Ut5.I1(c0eno.LLILZ, 0);
            c0eno.LLILZ.setProgress(i3);
        } else {
            C786410Ut5.I1(c0eno.LLILZ, 8);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c1r, viewGroup, false);
        C0ENO c0eno = new C0ENO(this.LL, viewTd);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.LLILZ;
        }
        ViewGroup.LayoutParams layoutParams2 = c0eno.LLILLL.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = this.LLILZIL;
        }
        ViewGroup.LayoutParams layoutParams3 = c0eno.LLILLL.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = this.LLILZIL;
        }
        try {
            View view = c0eno.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0eno.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0eno.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0ENO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0eno.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0eno.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0ENO.class.getName();
        return c0eno;
    }
}
