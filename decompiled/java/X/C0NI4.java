package X;

/* JADX INFO: renamed from: X.0NI4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NI4 {
    public final int LIZ;
    public final EnumC591520NHy LIZIZ;
    public final C0NIL LIZJ;
    public InterfaceC1475420oUu LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTaskInfo{mSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mPriority=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NI4(int i, EnumC591520NHy enumC591520NHy, C0NIL c0nil, InterfaceC1475420oUu interfaceC1475420oUu) {
        this.LIZIZ = EnumC591520NHy.PRELOAD_TASK_PRIORITY_DEFAULT;
        this.LIZ = i;
        this.LIZIZ = enumC591520NHy;
        this.LIZJ = c0nil;
        this.LIZLLL = interfaceC1475420oUu;
    }
}
