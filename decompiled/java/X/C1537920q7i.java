package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.tiktok.forestx.RequestParamsX;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537920q7i extends AbstractC1299960jvu {
    public final /* synthetic */ C1537480q70 LIZ;

    public C1537920q7i(C1537480q70 c1537480q70) {
        this.LIZ = c1537480q70;
    }

    @Override // X.AbstractC1299960jvu
    public final void LIZ(C1301600jyY c1301600jyY, InterfaceC1290540jgi<byte[]> interfaceC1290540jgi) throws ExecutionException, InterruptedException {
        List listLJJLIIIJILLIZJL;
        Object obj;
        final C1536070q4j c1536070q4j;
        String str;
        FutureTask<byte[]> futureTask;
        int iLJJJ;
        String str2 = c1301600jyY.LIZ;
        if (str2 != null && !Intrinsics.LJFF(str2, "/lynx_core.js")) {
            final C1538210q8B c1538210q8B = this.LIZ.codeCacheInfo;
            if (c1538210q8B == null) {
                interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Throwable("not enable code cache v2")));
                return;
            }
            String strLJJJJZ = a0.LJJJJZ("dynamic-component/", c1301600jyY.LIZ);
            if (!Intrinsics.LJFF(strLJJJJZ, c1301600jyY.LIZ)) {
                int iLJJJ2 = a0.LJJJ(strLJJJJZ, "https://", 0, false, 6);
                if (iLJJJ2 == -1) {
                    iLJJJ = a0.LJJJ(strLJJJJZ, "//", 0, false, 6);
                } else {
                    iLJJJ = a0.LJJJ(strLJJJJZ, "//", iLJJJ2 + 8, false, 4);
                }
                if (iLJJJ == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cannot solve corresponding information from url, ");
                    sbLIZ.append(c1301600jyY.LIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1538210q8B.LIZ(c1301600jyY.LIZ);
                    interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Throwable(strLIZIZ)));
                    return;
                }
                listLJJLIIIJILLIZJL = C1697810uHb.LJIIJJI(strLJJJJZ.substring(0, iLJJJ), strLJJJJZ.substring(iLJJJ + 2));
            } else {
                listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(c1301600jyY.LIZ, new String[]{"##/"}, 0, 6);
            }
            if (listLJJLIIIJILLIZJL.size() != 2) {
                String str3 = "cannot solve corresponding information from url, " + c1301600jyY.LIZ;
                c1538210q8B.LIZ(c1301600jyY.LIZ);
                interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Throwable(str3)));
                return;
            }
            Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, 0);
            ConcurrentHashMap<String, Object> concurrentHashMap = c1538210q8B.LIZIZ;
            if (concurrentHashMap != null) {
                obj = concurrentHashMap.get(obj2);
            } else {
                obj = null;
            }
            if (obj instanceof C1536070q4j) {
                c1536070q4j = (C1536070q4j) obj;
                if (c1536070q4j != null) {
                    String strLJJI = u.LJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1), '/', '#', false);
                    if (c1536070q4j.isSuccess()) {
                        if (c1536070q4j.LIZLLL == 0) {
                            C1532960pzi.LIZLLL(new Runnable() { // from class: X.0q4i
                                public final void LIZ() {
                                    C1536030q4f c1536030q4f = C1536030q4f.LIZ;
                                    AbstractC1536120q4o abstractC1536120q4o = c1536070q4j.LIZ;
                                    c1536030q4f.getClass();
                                    String strLIZIZ2 = abstractC1536120q4o.LIZIZ();
                                    Keva kevaLJ = C1536030q4f.LJ();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZIZ2);
                                    sbLIZ2.append("_total");
                                    int i = kevaLJ.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0) + 1;
                                    Keva kevaLJ2 = C1536030q4f.LJ();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLIZIZ2);
                                    sbLIZ3.append("_recent");
                                    int i2 = kevaLJ2.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0) + 1;
                                    Keva kevaLJ3 = C1536030q4f.LJ();
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(strLIZIZ2);
                                    sbLIZ4.append("_total");
                                    kevaLJ3.storeInt(C2188811AlT.LIZIZ(sbLIZ4), i);
                                    Keva kevaLJ4 = C1536030q4f.LJ();
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(strLIZIZ2);
                                    sbLIZ5.append("_recent");
                                    kevaLJ4.storeInt(C2188811AlT.LIZIZ(sbLIZ5), i2);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("JsCodeCacheEntry@27f0.getContent$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("JsCodeCacheEntry@27f0.getContent$1");
                                }
                            });
                        }
                        int i = c1536070q4j.LIZLLL + 1;
                        c1536070q4j.LIZLLL = i;
                        Map<String, FutureTask<byte[]>> map = c1536070q4j.LIZIZ;
                        if (map != null && i == map.size()) {
                            c1536070q4j.LIZLLL = 0;
                        }
                        Map<String, FutureTask<byte[]>> map2 = c1536070q4j.LIZIZ;
                        if (map2 != null && (futureTask = map2.get(strLJJI)) != null) {
                            futureTask.run();
                            byte[] bArr = futureTask.get();
                            if (bArr != null) {
                                String str4 = c1301600jyY.LIZ;
                                StringBuffer stringBuffer = c1538210q8B.LIZJ;
                                stringBuffer.append(str4);
                                stringBuffer.append("  ");
                                c1538210q8B.LJ = true;
                                C1532960pzi.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, new Runnable() { // from class: X.0q8E
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("CodeCacheInfo@293d.recordHitCacheId$1");
                                        try {
                                            if (c1538210q8B.LJ) {
                                                c1538210q8B.LJ = false;
                                                C1538210q8B c1538210q8B2 = c1538210q8B;
                                                C1530570pvr.LJ(c1538210q8B2.LIZ, "opt_lynx_code_cache_consumed_id", c1538210q8B2.LIZJ.toString());
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("CodeCacheInfo@293d.recordHitCacheId$1");
                                    }
                                });
                                interfaceC1290540jgi.LIZ(C1289590jfB.LIZIZ(bArr));
                                return;
                            }
                        }
                    }
                }
            } else {
                c1536070q4j = null;
            }
            c1538210q8B.LIZ(c1301600jyY.LIZ);
            if (c1536070q4j == null || (str = c1536070q4j.LIZJ) == null) {
                str = "fetch cache failed";
            }
            interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Throwable(str)));
            return;
        }
        interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Throwable("cannot get request")));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // X.AbstractC1299960jvu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1301600jyY r7, X.InterfaceC1290540jgi<byte[]> r8) throws org.json.JSONException {
        /*
            r6 = this;
            X.0jvm r1 = r7.LIZIZ
            X.0jvm r0 = X.EnumC1299880jvm.LynxResourceTypeFont
            r5 = 1
            if (r1 != r0) goto L59
            java.util.List<java.util.regex.Pattern> r1 = X.C1533710q0v.LIZIZ
            if (r1 == 0) goto L57
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L57
            java.util.Iterator r2 = r1.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.lang.String r0 = r7.LIZ
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L15
            r2 = 1
        L2e:
            org.json.JSONArray r0 = X.C1533710q0v.LIZ
            java.lang.String r1 = r7.LIZ
            r0 = 0
            X.C1533710q0v.LJIILJJIL(r1, r0, r0, r0, r2)
            if (r2 == 0) goto L61
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "font is blocked, url: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            X.0jfB r0 = X.C1289590jfB.LIZ(r2)
            r8.LIZ(r0)
            return
        L57:
            r2 = 0
            goto L2e
        L59:
            X.0jvm r0 = X.EnumC1299880jvm.LynxResourceTypeExternalByteCode
            if (r1 != r0) goto L61
            r6.LIZ(r7, r8)
            return
        L61:
            X.0q7f r1 = X.C1537890q7f.LIZ
            X.0q70 r4 = r6.LIZ
            com.tiktok.forestx.RequestParamsX r3 = new com.tiktok.forestx.RequestParamsX
            X.0jvm r0 = r7.LIZIZ
            if (r0 != 0) goto L6d
            X.0jvm r0 = X.EnumC1299880jvm.LynxResourceTypeTemplate
        L6d:
            r1.getClass()
            X.0q1M r1 = X.C1537890q7f.LIZLLL(r0)
            java.lang.Class<byte[]> r0 = byte[].class
            r3.<init>(r1, r0)
            X.0q70 r2 = r6.LIZ
            X.0jvo r1 = r7.LIZJ
            X.0jvo r0 = X.EnumC1299900jvo.EXACTLY_SYNC
            if (r1 != r0) goto L83
            r3.onlyLocal = r5
        L83:
            java.lang.String r0 = r2.containerId
            r3.groupId = r0
            java.lang.String r0 = "new_lynx_resource_interface"
            r3.source = r0
            X.0q83 r0 = new X.0q83
            r0.<init>(r6)
            X.C1537890q7f.LIZ(r4, r7, r8, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1537920q7i.LIZIZ(X.0jyY, X.0jgi):void");
    }

    @Override // X.AbstractC1299960jvu
    public final void LIZJ(C1301600jyY c1301600jyY, InterfaceC1290540jgi<String> interfaceC1290540jgi) {
        C1537890q7f c1537890q7f = C1537890q7f.LIZ;
        C1537480q70 c1537480q70 = this.LIZ;
        EnumC1299880jvm enumC1299880jvm = c1301600jyY.LIZIZ;
        if (enumC1299880jvm == null) {
            enumC1299880jvm = EnumC1299880jvm.LynxResourceTypeTemplate;
        }
        c1537890q7f.getClass();
        RequestParamsX requestParamsX = new RequestParamsX(C1537890q7f.LIZLLL(enumC1299880jvm), null, 2, null);
        requestParamsX.groupId = this.LIZ.containerId;
        if (c1301600jyY.LIZJ == EnumC1299900jvo.EXACTLY_SYNC) {
            requestParamsX.onlyLocal = true;
        }
        C1537890q7f.LIZ(c1537480q70, c1301600jyY, interfaceC1290540jgi, requestParamsX, new C1538100q80(this));
    }
}
