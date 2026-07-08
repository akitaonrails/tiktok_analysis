package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1436160nTa extends C2217421BqW implements Function0<InterfaceC1452170ntP> {
    public C1436160nTa(Object obj) {
        super(0, obj, C1440960nbK.class, "tryCreateEditor", "tryCreateEditor()Lcom/ss/android/ugc/asve/editor/IASVEEditor;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0ntP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1452170ntP invoke() {
        ?? r1;
        C1440960nbK c1440960nbK = (C1440960nbK) this.receiver;
        c1440960nbK.getClass();
        try {
            c1440960nbK.LJIIIZ().LIZLLL();
            C1434960nRe c1434960nRe = c1440960nbK.LLIZ;
            if (c1434960nRe == null) {
                c1434960nRe = null;
            }
            InterfaceC1452170ntP interfaceC1452170ntPLIZ = C1441820nci.LIZ(c1434960nRe.LIZ, new AwS601S0100000_22(c1440960nbK, 849));
            C189200o6.m2constructorimpl(interfaceC1452170ntPLIZ);
            r1 = interfaceC1452170ntPLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r1 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r1)) {
            return null;
        }
        return r1;
    }
}
