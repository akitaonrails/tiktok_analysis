package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0f0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110440f0E {
    public final SparseIntArray LIZ;
    public final SparseIntArray LIZIZ;
    public final SparseIntArray LIZJ;

    public C1110440f0E() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        this.LIZ = sparseIntArray;
        this.LIZIZ = sparseIntArray2;
        this.LIZJ = sparseIntArray3;
        LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), EnumC1110450f0F.REPLY_STAYTYPE);
        LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE);
        LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), EnumC1110450f0F.INPUT_PANNEL);
    }

    public final void LIZ(int i, int i2, int i3, EnumC1110450f0F enumC1110450f0F) {
        this.LIZ.put(enumC1110450f0F.ordinal(), i);
        this.LIZIZ.put(enumC1110450f0F.ordinal(), i2);
        this.LIZJ.put(enumC1110450f0F.ordinal(), i3);
    }
}
