package X;

/* JADX INFO: renamed from: X.0oXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477210oXn {
    public final InterfaceC1477240oXq LIZ;
    public final String LIZIZ;
    public C1477230oXp LIZJ;
    public boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Output{url='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", urlHook=");
        InterfaceC1477240oXq interfaceC1477240oXq = this.LIZ;
        sbLIZ.append(interfaceC1477240oXq == null ? "null" : interfaceC1477240oXq.getName());
        sbLIZ.append(", videoProcessedUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", forceSoftwareDecode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1477210oXn(String str) {
        this.LIZIZ = str;
    }

    public C1477210oXn(String str, InterfaceC1477240oXq interfaceC1477240oXq) {
        this.LIZIZ = str;
        this.LIZ = interfaceC1477240oXq;
    }
}
