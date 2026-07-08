package X;

import Y.ACListenerS61S0101000_29;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19401510vN extends AbstractC21673619ry<C19401610vO> {
    public final C19401910vR LL;
    public final InterfaceC19401710vP LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.LIZ.size();
    }

    public C19401510vN(C19401910vR c19401910vR, InterfaceC19401710vP interfaceC19401710vP) {
        this.LL = c19401910vR;
        this.LLILLJJLI = interfaceC19401710vP;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C19401610vO c19401610vO = (C19401610vO) viewHolder;
        C19402010vS c19402010vS = (C19402010vS) ListProtector.get(this.LL.LIZ, i);
        boolean zLJFF = Intrinsics.LJFF(c19402010vS, this.LL.LIZIZ);
        RoundedFrameLayout roundedFrameLayout = c19401610vO.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(roundedFrameLayout);
        roundedFrameLayout.setRotation(0.0f);
        RoundedFrameLayout roundedFrameLayout2 = c19401610vO.LLILLJJLI;
        int visibility = roundedFrameLayout2.getVisibility();
        roundedFrameLayout2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, roundedFrameLayout2);
        C786410Ut5.p(c19401610vO.LL, 8);
        C786410Ut5.LJLLLLLL(8, c19401610vO.LLILLL);
        if (zLJFF) {
            C786410Ut5.LJLLLLLL(0, c19401610vO.LLILLL);
        }
        c19401610vO.LLILLJJLI.setRadius((int) c19401610vO.LLILZ);
        if (c19402010vS instanceof C19401810vQ) {
            C19401810vQ c19401810vQ = (C19401810vQ) c19402010vS;
            GradientDrawable gradientDrawable = new GradientDrawable();
            int[] iArr = new int[c19401810vQ.LJ.size()];
            int size = c19401810vQ.LJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = ((C19402010vS) ListProtector.get(c19401810vQ.LJ, i2)).LIZIZ;
                if (str != null) {
                    iArr[i2] = ColorProtector.parseColor(str);
                }
            }
            gradientDrawable.setColors(iArr);
            c19401610vO.LLILLJJLI.setBackground(gradientDrawable);
            RoundedFrameLayout roundedFrameLayout3 = c19401610vO.LLILLJJLI;
            float f = c19401810vQ.LIZLLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(roundedFrameLayout3);
            roundedFrameLayout3.setRotation(f);
        } else if (c19402010vS.LIZJ != null) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331750klB.LJ = c19401610vO.LLILZ;
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            c19401610vO.LL.setCircleOptions(c1331730kl9);
            C786410Ut5.p(c19401610vO.LL, 0);
            RoundedFrameLayout roundedFrameLayout4 = c19401610vO.LLILLJJLI;
            int visibility2 = roundedFrameLayout4.getVisibility();
            roundedFrameLayout4.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, roundedFrameLayout4);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(c19402010vS.LIZJ);
            c1331670kl3LJIIIIZZ.LJJIJL(c19401610vO.LL.getContext());
            c1331670kl3LJIIIIZZ.LJJ(c19401610vO.LL);
            c1331670kl3LJIIIIZZ.LJJI = c1331730kl9;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else if (c19402010vS.LIZIZ != null) {
            C786410Ut5.p(c19401610vO.LL, 8);
            RoundedFrameLayout roundedFrameLayout5 = c19401610vO.LLILLJJLI;
            int visibility3 = roundedFrameLayout5.getVisibility();
            roundedFrameLayout5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, roundedFrameLayout5);
            c19401610vO.LLILLJJLI.setBackgroundColor(ColorProtector.parseColor(c19402010vS.LIZIZ));
        }
        C786410Ut5.I7(new ACListenerS61S0101000_29(this, i, 8), c19401610vO.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19401610vO c19401610vO = new C19401610vO(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.egx, viewGroup, false));
        try {
            View view = c19401610vO.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19401610vO.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19401610vO.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19401610vO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19401610vO.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19401610vO.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19401610vO.class.getName();
        return c19401610vO;
    }
}
