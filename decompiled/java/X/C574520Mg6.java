package X;

import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0Mg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574520Mg6 extends AbstractC574600MgE {
    public final String[] LIZ;
    public final EnumC1464490oDH LIZIZ;

    public C574520Mg6(String[] strArr, EnumC1464490oDH enumC1464490oDH) {
        this.LIZ = strArr;
        this.LIZIZ = enumC1464490oDH;
    }

    @Override // X.AbstractC574600MgE
    public final int LIZ(VEEditor vEEditor, boolean z) {
        return vEEditor.LLILLL.initWithAlgorithm(this.LIZ, this.LIZIZ);
    }
}
