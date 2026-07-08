package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545410qJn {
    public static Keva LIZIZ;
    public static C1545400qJm LIZJ;
    public static String LIZLLL;
    public static Uri LJ;
    public static long LJFF;
    public static String LJIIJ;
    public static final C1545410qJn LIZ = new C1545410qJn();
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final boolean LJIIIIZZ = true;
    public static final Set<String> LJIIIZ = new LinkedHashSet();
    public static final ArrayList<String> LJIIJJI = new ArrayList<>();

    public static void LIZLLL() {
        InterfaceC1535500q3o defaultResourceLoader;
        if (LIZJ == null || !LJI.compareAndSet(false, true)) {
            return;
        }
        C1545400qJm c1545400qJm = LIZJ;
        if (c1545400qJm == null) {
            c1545400qJm = null;
        }
        c1545400qJm.getClass();
        if (LJII.get()) {
            C1545400qJm c1545400qJm2 = LIZJ;
            if (c1545400qJm2 == null) {
                c1545400qJm2 = null;
            }
            long j = c1545400qJm2.LIZIZ;
            if (j <= 0 || System.currentTimeMillis() - LJFF < j * ((long) 60) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                return;
            }
        }
        C1545400qJm c1545400qJm3 = LIZJ;
        if (c1545400qJm3 == null) {
            c1545400qJm3 = null;
        }
        c1545400qJm3.getClass();
        boolean zLJI = MethodIDManager.LJI(137365);
        final Uri uriBuild = LJ;
        if (uriBuild != null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            if (LIZJ == null || LIZLLL == null) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https");
            String str = LIZLLL;
            if (str == null) {
                str = null;
            }
            builder.authority(str);
            builder.appendPath("common");
            builder.appendQueryParameter("app_id", "349653");
            C1545400qJm c1545400qJm4 = LIZJ;
            if (c1545400qJm4 == null) {
                c1545400qJm4 = null;
            }
            builder.appendQueryParameter("device_id", c1545400qJm4.LIZJ);
            C1545400qJm c1545400qJm5 = LIZJ;
            if (c1545400qJm5 == null) {
                c1545400qJm5 = null;
            }
            c1545400qJm5.getClass();
            builder.appendQueryParameter("user_id", "");
            C1545400qJm c1545400qJm6 = LIZJ;
            if (c1545400qJm6 == null) {
                c1545400qJm6 = null;
            }
            builder.appendQueryParameter("channel", c1545400qJm6.LJ);
            C1545400qJm c1545400qJm7 = LIZJ;
            if (c1545400qJm7 == null) {
                c1545400qJm7 = null;
            }
            builder.appendQueryParameter("device_type", c1545400qJm7.LJFF);
            builder.appendQueryParameter("device_platform", "Android");
            C1545400qJm c1545400qJm8 = LIZJ;
            if (c1545400qJm8 == null) {
                c1545400qJm8 = null;
            }
            builder.appendQueryParameter("os_version", c1545400qJm8.LJI);
            C1545400qJm c1545400qJm9 = LIZJ;
            if (c1545400qJm9 == null) {
                c1545400qJm9 = null;
            }
            builder.appendQueryParameter("host_app_id", String.valueOf(c1545400qJm9.LIZ));
            C1545400qJm c1545400qJm10 = LIZJ;
            if (c1545400qJm10 == null) {
                c1545400qJm10 = null;
            }
            builder.appendQueryParameter("host_app_name", c1545400qJm10.LIZLLL);
            C1545400qJm c1545400qJm11 = LIZJ;
            if (c1545400qJm11 == null) {
                c1545400qJm11 = null;
            }
            builder.appendQueryParameter("host_version", c1545400qJm11.LJII);
            builder.appendQueryParameter("sdk_version", "2.5.3");
            uriBuild = builder.build();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PIA Settings Url: ");
            sbLIZ.append(uriBuild);
            C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ), null);
            LJ = uriBuild;
            if (zLJI) {
                MethodIDManager.LJ();
            }
            if (uriBuild == null) {
                return;
            }
        }
        InterfaceC1537230q6b<InterfaceC1535500q3o> interfaceC1537230q6b = C1542560qFC.LJ;
        if (interfaceC1537230q6b == null || (defaultResourceLoader = interfaceC1537230q6b.create()) == null) {
            defaultResourceLoader = new DefaultResourceLoader(null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[PIASettings] start fetching settings, URL: ");
        sbLIZ2.append(uriBuild);
        C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ2), null);
        defaultResourceLoader.LIZIZ(EnumC1535440q3i.Online, new InterfaceC1535470q3l() { // from class: X.0qJr
            @Override // X.InterfaceC1535470q3l
            public final /* synthetic */ Map getRequestHeaders() {
                return null;
            }

            @Override // X.InterfaceC1535470q3l
            public final /* synthetic */ boolean isForMainFrame() {
                return false;
            }

            @Override // X.InterfaceC1535470q3l
            public final Uri getUrl() {
                return uriBuild;
            }
        }, new InterfaceC1530550pvp() { // from class: X.0qJo
            public final /* synthetic */ InterfaceC1530550pvp<C2204191BOn> LIZ = null;
            public final /* synthetic */ InterfaceC1530550pvp<Unit> LIZIZ = null;

            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                InputStream data;
                Object c098200Yq;
                InterfaceC1532650pzD interfaceC1532650pzD = (InterfaceC1532650pzD) obj;
                C1545410qJn.LJI.set(false);
                C1545410qJn.LJII.set(true);
                C1545410qJn.LJFF = System.currentTimeMillis();
                if (interfaceC1532650pzD != null && (data = interfaceC1532650pzD.getData()) != null) {
                    InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp = this.LIZ;
                    InterfaceC1530550pvp<Unit> interfaceC1530550pvp2 = this.LIZIZ;
                    try {
                        C1545410qJn.LIZ.getClass();
                        C1545410qJn.LIZJ(data);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        if (interfaceC1530550pvp != null) {
                            interfaceC1530550pvp.accept(new C2204191BOn(-10002, thM5exceptionOrNullimpl.getMessage()));
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[PIASettings] Exception happened when handling settings stream. Error: ");
                        sbLIZ3.append(thM5exceptionOrNullimpl);
                        C1BPP.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ3), null);
                    }
                    if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                        if (interfaceC1530550pvp2 != null) {
                            interfaceC1530550pvp2.accept(null);
                        }
                        C1BPP.LJFF(6, "[PIASettings] Update Async settings success.", null);
                    }
                }
            }
        }, new InterfaceC1530550pvp() { // from class: X.0qJp
            public final /* synthetic */ InterfaceC1530550pvp<C2204191BOn> LIZ = null;

            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C1545410qJn c1545410qJn = C1545410qJn.LIZ;
                InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp = this.LIZ;
                if (interfaceC1530550pvp != null) {
                    interfaceC1530550pvp.accept(new C2204191BOn(-10001, th.getMessage()));
                }
                c1545410qJn.getClass();
                C1545410qJn.LJI.set(false);
                C1BPP.LIZJ(4, "Update settings error:", th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[PIASettings] Update Async settings failed. Error: ");
                sbLIZ3.append(th.getMessage());
                C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        });
    }

    public static void LIZ(C09CU c09cu) {
        Object c098200Yq;
        if (c09cu.LJJLIIIJ() == C09D6.BEGIN_OBJECT) {
            c09cu.LIZIZ();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (u.LJJIIJZLJL(strLJJJJ, "page/", false)) {
                    try {
                        LIZ.getClass();
                        LIZIZ(strLJJJJ, c09cu, linkedHashSet);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
            Set<String> set = LJIIIZ;
            set.clear();
            set.addAll(linkedHashSet);
            return;
        }
        c09cu.LJJZ();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0056
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(java.io.InputStream r4) {
        /*
            X.09CU r3 = new X.09CU
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r4)
            r3.<init>(r0)
            r2 = 0
            r3.LIZIZ()     // Catch: java.lang.Throwable -> L4e
        Le:
            boolean r0 = r3.LJIIZILJ()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L47
            java.lang.String r1 = r3.LJJJJ()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "data"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L43
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = ""
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> L4e
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            X.0qJn r0 = X.C1545410qJn.LIZ     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L4e
            r1.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4e
            X.C1545410qJn.LJIIJ = r0     // Catch: java.lang.Throwable -> L4e
            LIZ(r3)     // Catch: java.lang.Throwable -> L4e
            goto Le
        L43:
            r3.LJJZ()     // Catch: java.lang.Throwable -> L4e
            goto Le
        L47:
            r3.LJII()     // Catch: java.lang.Throwable -> L4e
            X.C2107108Nh.LIZ(r3, r2)
            return
        L4e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L56
            throw r1     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            r2 = r1
            goto L57
        L56:
            r0 = move-exception
        L57:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L56
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1545410qJn.LIZJ(java.io.InputStream):void");
    }

    public static void LIZIZ(String str, C09CU c09cu, Set set) {
        Object c098200Yq;
        if (c09cu.LJJLIIIJ() != C09D6.BEGIN_OBJECT) {
            c09cu.LJJZ();
            return;
        }
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "val")) {
                if (u.LJJIIJZLJL(str, "page/", false)) {
                    if (c09cu.LJJLIIIJ() == C09D6.BEGIN_OBJECT) {
                        c09cu.LIZIZ();
                        h hVar = new h();
                        Keva keva = null;
                        String strLJJJZ = null;
                        String strLJJJZ2 = null;
                        while (c09cu.LJIIZILJ()) {
                            String strLJJJJ = c09cu.LJJJJ();
                            if (strLJJJJ != null) {
                                int iHashCode = strLJJJJ.hashCode();
                                if (iHashCode != -290659267) {
                                    if (iHashCode != 116079) {
                                        if (iHashCode == 351608024 && strLJJJJ.equals("version")) {
                                            if (c09cu.LJJLIIIJ() == C09D6.STRING) {
                                                strLJJJZ2 = c09cu.LJJJZ();
                                            } else {
                                                c09cu.LJJZ();
                                            }
                                        }
                                    } else if (strLJJJJ.equals("url")) {
                                        if (c09cu.LJJLIIIJ() == C09D6.STRING) {
                                            strLJJJZ = c09cu.LJJJZ();
                                        } else {
                                            c09cu.LJJZ();
                                        }
                                    }
                                } else if (strLJJJJ.equals("features")) {
                                    if (c09cu.LJJLIIIJ() == C09D6.BEGIN_ARRAY) {
                                        c09cu.LIZ();
                                        while (c09cu.LJIIZILJ()) {
                                            if (c09cu.LJJLIIIJ() == C09D6.STRING) {
                                                hVar.LJJIII(c09cu.LJJJZ());
                                            } else {
                                                c09cu.LJJZ();
                                            }
                                        }
                                        c09cu.LJI();
                                    } else {
                                        c09cu.LJJZ();
                                    }
                                }
                            }
                            c09cu.LJJZ();
                        }
                        c09cu.LJII();
                        if (strLJJJZ != null && strLJJJZ.length() != 0) {
                            try {
                                c098200Yq = C1953107kv.LIZJ(UriProtector.parse(strLJJJZ), null);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            String str2 = (String) c098200Yq;
                            if (str2 != null && str2.length() != 0) {
                                n nVar = new n();
                                String str3 = LJIIJ;
                                if (str3 == null) {
                                    str3 = null;
                                }
                                nVar.LJJIIJ("version", str3);
                                nVar.LJJIIJ("url", strLJJJZ);
                                nVar.LJJIIJ("manifestVersion", strLJJJZ2);
                                nVar.LJJIFFI("features", hVar);
                                Keva keva2 = LIZIZ;
                                if (keva2 != null) {
                                    keva = keva2;
                                }
                                keva.storeString(str2, nVar.toString());
                                set.add(str2);
                            }
                        }
                    } else {
                        c09cu.LJJZ();
                    }
                } else {
                    c09cu.LJJZ();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
    }
}
