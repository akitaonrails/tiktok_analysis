package X;

/* JADX INFO: renamed from: X.1DSS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DSS extends C1DST {
    public final String LIZIZ = C1DSL.LIZJ("ro.vivo.os.build.display.id");
    public final String LIZJ = C1DSL.LIZJ("ro.vivo.product.version");

    @Override // X.C1DST
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
