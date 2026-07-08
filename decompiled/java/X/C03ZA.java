package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;

/* JADX INFO: renamed from: X.03ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZA {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public final Object LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethodVO(paymentMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", need_verify=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", useDefaultRadio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCredit=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hidePromotionWhenSubShowed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hideDiscountPromotionWhenSubShowed=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hideInterestFeePromotionWhenSubShowed=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hideRadio=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", refreshView=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (System.identityHashCode(this) == System.identityHashCode(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C03ZA(PaymentMethod paymentMethod, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(paymentMethod, false, 0, z3, (i & 16) != 0 ? false : z5, false, false, false, (i & 256) != 0 ? false : z4, null);
    }

    public static C03ZA LIZ(C03ZA c03za, PaymentMethod paymentMethod, Object obj, int i) {
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj2 = obj;
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i & 1) != 0) {
            paymentMethod2 = c03za.LIZ;
        }
        if ((i & 2) != 0) {
            z = c03za.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = c03za.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            z2 = c03za.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = c03za.LJ;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = c03za.LJFF;
        } else {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = c03za.LJI;
        } else {
            z5 = false;
        }
        if ((i & 128) != 0) {
            z6 = c03za.LJII;
        } else {
            z6 = false;
        }
        if ((i & 256) != 0) {
            z7 = c03za.LJIIIIZZ;
        } else {
            z7 = false;
        }
        if ((i & 512) != 0) {
            obj2 = c03za.LJIIIZ;
        }
        c03za.getClass();
        return new C03ZA(paymentMethod2, z, i2, z2, z3, z4, z5, z6, z7, obj2);
    }

    public C03ZA(PaymentMethod paymentMethod, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Object obj) {
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = obj;
    }
}
