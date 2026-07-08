package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811500xEy implements InterfaceC1811720xFK {
    public static final C1778090wN5 LJ = new C1778090wN5(0.0f, 12.0f, 18.0f, 18.0f, 27.0f, 11.0f, true);
    public static final C1778090wN5 LJFF = new C1778090wN5(0.0f, 8.0f, 16.0f, 16.0f, 32.0f, 13.0f, false);
    public static final C1778090wN5 LJI = new C1778090wN5(1.0f, 8.0f, 16.0f, 20.0f, 32.0f, 13.0f, false);
    public final C1121720fIQ LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1141));

    public static C1778090wN5 LIZJ(AbstractC1811580xF6 abstractC1811580xF6) {
        if (abstractC1811580xF6 instanceof AbstractC1811550xF3) {
            return LJ;
        }
        if (abstractC1811580xF6 instanceof C1811530xF1) {
            if (((C1811530xF1) abstractC1811580xF6).LIZIZ.LIZ) {
                return LJFF;
            }
            return LJI;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1811720xFK
    public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
        C1778090wN5 c1778090wN5LIZJ = LIZJ(abstractC1811580xF6);
        C1121720fIQ c1121720fIQ = this.LIZ;
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        Float fValueOf = Float.valueOf(c1778090wN5LIZJ.LIZJ);
        c1546210qL5.getClass();
        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), c1121720fIQ);
        C1121720fIQ c1121720fIQ2 = this.LIZ;
        boolean z = c1778090wN5LIZJ.LJI;
        int i = R.drawable.f2q;
        if (z) {
            c1121720fIQ2.setBackgroundResource(R.drawable.f2q);
            c1121720fIQ2.LIZJ(22.0f, 11.0f);
        } else {
            c1121720fIQ2.setBackgroundResource(R.drawable.f2p);
            c1121720fIQ2.LIZJ(24.0f, 12.0f);
        }
        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1778090wN5LIZJ.LIZLLL))), this.LIZIZ);
        View view = this.LIZIZ;
        if (!c1778090wN5LIZJ.LJI) {
            i = R.drawable.f2p;
        }
        view.setBackgroundResource(i);
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1778090wN5LIZJ.LJ)));
                layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1778090wN5LIZJ.LJFF)));
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    public C1811500xEy(C1121720fIQ c1121720fIQ, View view, C973130bQl c973130bQl) {
        this.LIZ = c1121720fIQ;
        this.LIZIZ = view;
        this.LIZJ = c973130bQl;
    }

    @Override // X.InterfaceC1811720xFK
    public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
        C1778090wN5 c1778090wN5LIZJ = LIZJ(abstractC1811580xF6);
        c19mb.LJJII(c1778090wN5LIZJ.LIZ, this.LIZ.getId());
        c19mb.LJJII(c1778090wN5LIZJ.LIZ, this.LIZIZ.getId());
        c19mb.LJJII(c1778090wN5LIZJ.LIZ, this.LIZJ.getId());
        int i = 0;
        int[] iArr = {this.LIZ.getId(), this.LIZIZ.getId(), this.LIZJ.getId()};
        do {
            int i2 = iArr[i];
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Float fValueOf = Float.valueOf(c1778090wN5LIZJ.LIZIZ);
            c1546210qL5.getClass();
            c19mb.LJJIIJZLJL(i2, 6, C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)));
            c19mb.LJJIIJZLJL(i2, 7, C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(c1778090wN5LIZJ.LIZIZ))));
            i++;
        } while (i < 3);
    }
}
