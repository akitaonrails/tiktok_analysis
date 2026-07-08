package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0MP1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MP1 {
    public final C0MOK LIZ;
    public final String LIZIZ;

    public C0MP1(CreativeInfo creativeInfo, C0MOK c0mok) {
        this.LIZ = c0mok;
        this.LIZIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIZ(creativeInfo);
    }

    public static C11O8 LIZJ(final C0MP1 c0mp1, final String str) {
        final String str2 = c0mp1.LIZIZ;
        final String str3 = "";
        return C11NZ.LJJJJI(new Callable() { // from class: X.0MP2
            public final /* synthetic */ boolean LLILLL = false;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("CanvasDataGenerator@ce8f.prepareOriginFileWithoutSkip$1");
                C0MOZ c0mozLIZIZ = this.LL.LIZIZ(str, str2, str3, this.LLILLL, false, false);
                C1C7U.LIZIZ("CanvasDataGenerator@ce8f.prepareOriginFileWithoutSkip$1");
                return c0mozLIZIZ;
            }
        }).LJJJLZIJ(C11S5.LIZ());
    }

    public static C11O8 LIZ(final C0MP1 c0mp1, final String str, final boolean z, String str2, boolean z2, int i) {
        final String str3;
        final boolean z3 = z2;
        final String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c0mp1.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        final boolean z4 = false;
        if ((i & 32) != 0) {
            z3 = false;
        }
        return C11NZ.LJJJJI(new Callable() { // from class: X.0MP0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C0MOZ c0mozLIZIZ;
                Object c098200Yq;
                String strLIZ;
                Object c098200Yq2;
                C1C7U.LIZ("CanvasDataGenerator@ce8f.prepareOriginFile$1");
                boolean z5 = z3;
                if (z5 || !C0BUE.LIZJ) {
                    c0mozLIZIZ = c0mp1.LIZIZ(str, str3, str4, z, z4, z5);
                } else {
                    C0MP1 c0mp12 = c0mp1;
                    String str5 = str;
                    boolean z6 = z;
                    String str6 = str3;
                    String str7 = str4;
                    boolean z7 = z4;
                    c0mp12.getClass();
                    if (C2471909mP.LJJIIZI(str5)) {
                        try {
                            c098200Yq = UriProtector.parse(str5);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        strLIZ = C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) c098200Yq);
                    } else {
                        strLIZ = str5;
                    }
                    C0VSJ c0vsj = new C0VSJ(strLIZ);
                    if (C2477909nN.LIZLLL(c0vsj.getPath()) % 180 == 90) {
                        c0mozLIZIZ = c0mp12.LIZIZ(str5, str6, str7, z6, z7, z5);
                    } else {
                        String path = c0vsj.getPath();
                        if (!new C0VSJ(str6).exists()) {
                            new C0VSJ(str6).mkdirs();
                        }
                        if (C296170BjD.LIZ() && C2471909mP.LJJIIZI(path)) {
                            try {
                                c098200Yq2 = UriProtector.parse(path);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            path = C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2));
                        }
                        C0VSJ c0vsj2 = new C0VSJ(path);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str6);
                        sbLIZ.append("origin_");
                        sbLIZ.append(c0vsj2.getName());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c0mozLIZIZ = new C0MOZ();
                        C201955140j.LIZ("editor#uploader copy source file only");
                        if (!C2286708xd.LJFF(path, strLIZIZ)) {
                            throw new IllegalArgumentException("prepareOriginFile, create file failed");
                        }
                        c0mozLIZIZ.LIZ = strLIZIZ;
                    }
                }
                C1C7U.LIZIZ("CanvasDataGenerator@ce8f.prepareOriginFile$1");
                return c0mozLIZIZ;
            }
        }).LJJJLZIJ(C11S5.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0MOZ LIZIZ(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MP1.LIZIZ(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):X.0MOZ");
    }
}
