package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1A53, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1A53 implements C1APR {
    public final /* synthetic */ Class LIZ;

    /* JADX WARN: Type inference failed for: r0v8, types: [R, java.lang.Object] */
    @Override // X.C1APR
    public final C1APX LIZ(C1APX c1apx) {
        Class cls = this.LIZ;
        try {
            c1apx.LIZ = cls.newInstance();
            return c1apx;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: ");
            sbLIZ2.append(cls.getName());
            sbLIZ2.append(".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
