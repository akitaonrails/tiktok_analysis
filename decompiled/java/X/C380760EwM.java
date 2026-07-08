package X;

import Y.ACListenerS72S0300000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380760EwM extends AbstractC21673619ry<C380770EwN> {
    public final Context LL;
    public List<C380780EwO> LLILLJJLI;
    public C380800EwQ LLILLL;
    public final boolean LLILZ;
    public final C01GW LLILZIL;
    public final LayerDrawable LLILZLL;
    public final LayerDrawable LLIZ;
    public final C419910GdJ LLIZLLLIL;
    public final C419910GdJ LLJ;

    public C380760EwM() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C380760EwM(Context context) {
        ArrayList arrayList = new ArrayList();
        this.LL = context;
        this.LLILLJJLI = arrayList;
        this.LLILZ = true;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 568));
        this.LLILZIL = c01gwLIZIZ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, (Context) c01gwLIZIZ.getValue());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context)});
        layerDrawable.setLayerInset(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLILZLL = layerDrawable;
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z2.LJ = C1308910kAL.LIZJ(R.attr.a1h, (Context) c01gwLIZIZ.getValue());
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.a03, (Context) c01gwLIZIZ.getValue());
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{c384050F3z2.LIZ(context), c384050F3z3.LIZ(context)});
        layerDrawable2.setLayerInset(1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        this.LLIZ = layerDrawable2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_block;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, (Context) c01gwLIZIZ.getValue());
        this.LLIZLLLIL = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_control;
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, (Context) c01gwLIZIZ.getValue());
        this.LLJ = c419910GdJ2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LayerDrawable layerDrawable;
        C380770EwN c380770EwN = (C380770EwN) viewHolder;
        C380780EwO c380780EwO = (C380780EwO) ListProtector.get(this.LLILLJJLI, i);
        View view = c380770EwN.LLILLL;
        if (c380780EwO.LJI) {
            layerDrawable = this.LLIZ;
        } else {
            layerDrawable = this.LLILZLL;
        }
        view.setBackground(layerDrawable);
        C786410Ut5.I7(new ACListenerS72S0300000_5(this, c380780EwO, c380770EwN, 4), c380770EwN.itemView);
        if (C383430F1p.LIZ(c380780EwO)) {
            c380770EwN.LLILLJJLI.setTuxIcon(this.LLIZLLLIL);
            C383710F2r c383710F2r = c380770EwN.LL;
            int visibility = c383710F2r.getVisibility();
            c383710F2r.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c383710F2r);
            C786410Ut5.LLLLLLZZ(c380770EwN.LLILLJJLI, 0);
            C786410Ut5.LJLLLLLL(4, c380770EwN.LLILZLL);
            C786410Ut5.I1(c380770EwN.LLILZIL, 4);
            C786410Ut5.LJLLLLLL(4, c380770EwN.LLILZ);
            return;
        }
        C383710F2r c383710F2r2 = c380770EwN.LL;
        int visibility2 = c383710F2r2.getVisibility();
        c383710F2r2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c383710F2r2);
        if (c380780EwO.LJI) {
            C786410Ut5.LJLLLLLL(0, c380770EwN.LLILZ);
            C786410Ut5.LLLLLLZZ(c380770EwN.LLILLJJLI, 0);
            c380770EwN.LLILLJJLI.setTuxIcon(this.LLJ);
        } else {
            C786410Ut5.LJLLLLLL(4, c380770EwN.LLILZ);
            C786410Ut5.LLLLLLZZ(c380770EwN.LLILLJJLI, 4);
        }
        C383710F2r c383710F2r3 = c380770EwN.LL;
        if (!Intrinsics.LJFF(c383710F2r3.getTag(c383710F2r3.getId()), c380780EwO.LIZIZ)) {
            C383710F2r c383710F2r4 = c380770EwN.LL;
            c383710F2r4.setTag(c383710F2r4.getId(), c380780EwO.LIZIZ);
            C383660F2m.LIZ(this.LL, c380780EwO.LIZIZ, c380770EwN.LL, new C370690Eg7(new C370680Eg6()));
        }
        EnumC1641380soa enumC1641380soa = c380780EwO.LJIIIIZZ;
        int i2 = c380780EwO.LJIIIZ;
        if (enumC1641380soa == EnumC1641380soa.FAILED) {
            C786410Ut5.LJLLLLLL(0, c380770EwN.LLILZ);
            C786410Ut5.LJLLLLLL(0, c380770EwN.LLILZLL);
        } else {
            C786410Ut5.LJLLLLLL(8, c380770EwN.LLILZLL);
        }
        if (enumC1641380soa == EnumC1641380soa.START && i2 >= 0 && i2 <= 100) {
            C786410Ut5.I1(c380770EwN.LLILZIL, 0);
            c380770EwN.LLILZIL.setProgress(i2);
        } else {
            C786410Ut5.I1(c380770EwN.LLILZIL, 8);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C380770EwN c380770EwN = new C380770EwN(this.LL, C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c0r, viewGroup, false));
        try {
            View view = c380770EwN.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c380770EwN.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c380770EwN.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C380770EwN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c380770EwN.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c380770EwN.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C380770EwN.class.getName();
        return c380770EwN;
    }
}
