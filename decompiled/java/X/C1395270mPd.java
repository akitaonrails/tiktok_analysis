package X;

/* JADX INFO: renamed from: X.0mPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395270mPd implements InterfaceC1475560oV8 {
    public final /* synthetic */ String LIZ;

    public C1395270mPd(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1475560oV8
    public final void LIZ(C1475490oV1 c1475490oV1) {
        int i = c1475490oV1.LIZ;
        if (i != 2 && i == 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("video preload failed, key = ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" , error = ");
            sbLIZ.append(c1475490oV1.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C1720306oT.LIZ;
        }
    }
}
