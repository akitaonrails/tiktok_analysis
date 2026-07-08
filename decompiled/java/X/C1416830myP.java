package X;

import android.os.Handler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS85S1300000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0myP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416830myP {
    public static final C1416830myP LIZ = new C1416830myP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(479));
    public static final ConcurrentHashMap<String, AVMusic> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1416860myS> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1416870myT> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC1416890myV> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC1416880myU> LJI = new ConcurrentHashMap<>();

    public static void LIZLLL(String str, String str2) {
        ConcurrentHashMap<String, C1416860myS> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.get(str) != null && (!r0.LIZJ)) {
            concurrentHashMap.remove(str);
        }
        LJI.remove(str2);
    }

    public static void LJ(String str, String str2) {
        ConcurrentHashMap<String, C1416870myT> concurrentHashMap = LJ;
        if (concurrentHashMap.get(str) != null && (!r0.LIZJ)) {
            concurrentHashMap.remove(str);
        }
        LJFF.remove(str2);
    }

    public static void LIZ(String str, String str2, boolean z) {
        ConcurrentHashMap<String, C1416870myT> concurrentHashMap = LJ;
        C1416870myT c1416870myT = concurrentHashMap.get(str);
        ConcurrentHashMap<String, InterfaceC1416890myV> concurrentHashMap2 = LJFF;
        InterfaceC1416890myV interfaceC1416890myV = concurrentHashMap2.get(str2);
        if (interfaceC1416890myV != null) {
            if (c1416870myT != null) {
                if (c1416870myT.LIZJ) {
                    c1416870myT.LIZ().remove(interfaceC1416890myV);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cancel request music info in MusicDownloadManager, isTimeout = ");
                    sbLIZ.append(z);
                    interfaceC1416890myV.LIZIZ(new C1416460mxo(10001, C2188811AlT.LIZIZ(sbLIZ)));
                    if (c1416870myT.LIZ().isEmpty()) {
                    }
                    concurrentHashMap2.remove(str2);
                } else {
                    c1416870myT.LIZ().clear();
                }
                concurrentHashMap.remove(str);
                concurrentHashMap2.remove(str2);
            } else {
                concurrentHashMap.remove(str);
                concurrentHashMap2.remove(str2);
            }
        }
        ConcurrentHashMap<String, C1416860myS> concurrentHashMap3 = LIZLLL;
        C1416860myS c1416860myS = concurrentHashMap3.get(str);
        ConcurrentHashMap<String, InterfaceC1416880myU> concurrentHashMap4 = LJI;
        InterfaceC1416880myU interfaceC1416880myU = concurrentHashMap4.get(str2);
        if (interfaceC1416880myU != null) {
            if (c1416860myS != null) {
                if (c1416860myS.LIZJ) {
                    c1416860myS.LIZ().remove(interfaceC1416880myU);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cancel download in MusicDownloadManager, isTimeout = ");
                    sbLIZ2.append(z);
                    interfaceC1416880myU.LIZ(10001, C2188811AlT.LIZIZ(sbLIZ2));
                    if (c1416860myS.LIZ().isEmpty()) {
                        C1403010mc7.LIZ.getMusicService().LIZLLL(c1416860myS.LIZ.getMusicId());
                    }
                } else {
                    c1416860myS.LIZ().clear();
                }
                concurrentHashMap3.remove(str);
            } else {
                concurrentHashMap3.remove(str);
            }
            concurrentHashMap4.remove(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (X.C2486109oh.LIZ(r3) == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(final com.ss.android.ugc.aweme.creative.model.music.AVMusic r6, final X.InterfaceC1416820myO r7, final java.lang.Runnable r8, final java.lang.String r9) {
        /*
            boolean r0 = r6.isLocalMusic()
            r4 = 1
            r2 = 2
            if (r0 == 0) goto L60
            java.lang.String r3 = r6.path
        La:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "studio_mix_material_anr_fix_opt"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)
            r1 = 0
            if (r0 == 0) goto L53
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L32
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r3)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L32
            int r0 = X.C2486109oh.LIZ(r3)
            if (r0 != 0) goto L32
            r1 = 1
        L32:
            int r0 = r6.musicType
            if (r0 == r4) goto L4e
            if (r0 == r2) goto L4e
            if (r1 == 0) goto L73
        L3a:
            r6.getMusicId()
            if (r8 == 0) goto L4a
            X.01GW r0 = X.C1416830myP.LIZIZ
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r8)
        L4a:
            r7.LIZIZ(r6, r4)
            return
        L4e:
            if (r1 == 0) goto L73
            r6.path = r3
            goto L3a
        L53:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L73
            int r0 = X.C2486109oh.LIZ(r3)
            if (r0 != 0) goto L73
            goto L3a
        L60:
            int r0 = r6.musicType
            if (r0 == r4) goto L68
            if (r0 == r2) goto L68
            r3 = 0
            goto La
        L68:
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            java.lang.String r3 = r0.LJI(r6)
            goto La
        L73:
            X.0myN r3 = new X.0myN
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0myS> r2 = X.C1416830myP.LIZLLL
            java.lang.String r0 = r6.getMusicId()
            java.lang.Object r1 = r2.get(r0)
            X.0myS r1 = (X.C1416860myS) r1
            if (r1 != 0) goto L92
            X.0myS r1 = new X.0myS
            r1.<init>(r6)
            java.lang.String r0 = r6.getMusicId()
            r2.put(r0, r1)
        L92:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0myU> r0 = X.C1416830myP.LJI
            r0.put(r9, r3)
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto La3
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.LIZ()
            r0.add(r3)
            return
        La3:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.LIZ()
            r0.add(r3)
            r1.LIZJ = r4
            X.0nlB r0 = X.C1403010mc7.LIZ
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r2 = r0.getMusicService()
            java.lang.String r3 = "mix_editing"
            android.app.Application r4 = X.C0CHQ.LIZ
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r5 = r1.LIZ
            X.0myQ r8 = new X.0myQ
            r8.<init>()
            r6 = 0
            r7 = r6
            r9 = r6
            r2.LJ(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1416830myP.LIZIZ(com.ss.android.ugc.aweme.creative.model.music.AVMusic, X.0myO, java.lang.Runnable, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0mwz] */
    public static void LIZJ(C1416830myP c1416830myP, final String str, final String str2, final InterfaceC1416820myO interfaceC1416820myO) {
        AVMusic aVMusic;
        c1416830myP.getClass();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new Runnable() { // from class: X.0mwz
            public final void LIZ() {
                C1416830myP c1416830myP2 = C1416830myP.LIZ;
                String str3 = str;
                String str4 = str2;
                c1416830myP2.getClass();
                C1416830myP.LIZ(str3, str4, true);
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time out, ");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(str2);
                C201955140j.LIZLLL(c0mj8, "MusicDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MusicDownloadManager@ed93.downloadMusic$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MusicDownloadManager@ed93.downloadMusic$1");
            }
        };
        C786410Ut5.LJLIIL(10000L, (Handler) LIZIZ.getValue(), (Runnable) c259800zU.element);
        interfaceC1416820myO.onStart();
        C1452640nuA.LIZ.getClass();
        if (!Intrinsics.LJFF(str, C1452640nuA.LIZIZ) && (aVMusic = LIZJ.get(str)) != null) {
            LIZIZ(aVMusic, interfaceC1416820myO, (Runnable) c259800zU.element, str2);
            return;
        }
        InterfaceC1416890myV interfaceC1416890myV = new InterfaceC1416890myV() { // from class: X.0myM
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                String message;
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestMusicInfo ");
                sbLIZ.append(str);
                sbLIZ.append(" failed, ");
                String message2 = null;
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                sbLIZ.append(' ');
                sbLIZ.append(C786410Ut5.u3().getName());
                C201955140j.LJIIIIZZ(c0mj8, "MusicDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
                C1416830myP c1416830myP2 = C1416830myP.LIZ;
                Runnable runnable = c259800zU.element;
                c1416830myP2.getClass();
                if (runnable != null) {
                    ((Handler) C1416830myP.LIZIZ.getValue()).removeCallbacks(runnable);
                }
                C1416830myP.LJ(str, str2);
                if (exc instanceof C1416460mxo) {
                    C1416460mxo c1416460mxo = (C1416460mxo) exc;
                    interfaceC1416820myO.LIZ(Integer.valueOf(c1416460mxo.getCode()), c1416460mxo.getMessage());
                } else {
                    InterfaceC1416820myO interfaceC1416820myO2 = interfaceC1416820myO;
                    if (exc != null) {
                        message2 = exc.getMessage();
                    }
                    interfaceC1416820myO2.LIZ(-1001, String.valueOf(message2));
                }
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(AVMusic aVMusic2) {
                if (aVMusic2 != null) {
                    C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestMusicInfo ");
                    sbLIZ.append(str);
                    sbLIZ.append(" success, ");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    C201955140j.LIZLLL(c0mj8, "MusicDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
                    C1416830myP.LIZJ.put(str, aVMusic2);
                    C1416830myP c1416830myP2 = C1416830myP.LIZ;
                    String str3 = str;
                    String str4 = str2;
                    c1416830myP2.getClass();
                    C1416830myP.LJ(str3, str4);
                    if (!C123100dR.LIZ(aVMusic2.offlineDesc)) {
                        C0CNO.LIZ(C15O7.LJI, new AwS85S1300000_22(aVMusic2, (AVMusic) str2, (String) interfaceC1416820myO, (InterfaceC1416820myO) c259800zU, (C259800zU<Runnable>) 3));
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(aVMusic2.offlineDesc);
                    sbLIZ2.append(", status = ");
                    sbLIZ2.append(aVMusic2.musicStatus);
                    LIZIZ(new C1416460mxo(-1002, C2188811AlT.LIZIZ(sbLIZ2)));
                    return;
                }
                LIZIZ(new Exception("requestMusicInfo, music result is null"));
            }
        };
        ConcurrentHashMap<String, C1416870myT> concurrentHashMap = LJ;
        final C1416870myT c1416870myT = concurrentHashMap.get(str);
        if (c1416870myT == null) {
            c1416870myT = new C1416870myT(str);
            concurrentHashMap.put(str, c1416870myT);
        }
        LJFF.put(str2, interfaceC1416890myV);
        boolean zLJI = MethodIDManager.LJI(137850);
        if (c1416870myT.LIZJ) {
            c1416870myT.LIZ().add(interfaceC1416890myV);
        } else {
            c1416870myT.LIZ().add(interfaceC1416890myV);
            c1416870myT.LIZJ = true;
            C1403010mc7.LIZ.getMusicService().requestMusic(c1416870myT.LIZ, new InterfaceC1416890myV() { // from class: X.0myR
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    c1416870myT.LIZJ = false;
                    Iterator<InterfaceC1416890myV> it2 = c1416870myT.LIZ().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(exc);
                    }
                    c1416870myT.LIZ().clear();
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic2) {
                    c1416870myT.LIZJ = false;
                    Iterator<InterfaceC1416890myV> it2 = c1416870myT.LIZ().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZLLL(aVMusic2);
                    }
                    c1416870myT.LIZ().clear();
                }
            });
        }
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }
}
