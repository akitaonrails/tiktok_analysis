package X;

/* JADX INFO: renamed from: X.0VFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794780VFs implements InterfaceC794630VFd {
    public final String LIZ;

    @Override // X.InterfaceC794630VFd
    public final String generate() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(C794830VFx.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C794780VFs(String str) {
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length > 0 && "03".equals(strArrSplit[0])) {
            this.LIZ = strArrSplit[1].substring(0, 16);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("traceparent format not supported: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
