package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NEA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEA {
    public static volatile int LIZLLL;
    public static volatile boolean LJ;
    public static final C0NEA LIZ = new C0NEA();
    public static boolean LIZIZ = true;
    public static volatile CopyOnWriteArrayList<C0NE9> LIZJ = new CopyOnWriteArrayList<>();
    public static volatile C0NE7 LJFF = new InterfaceC1475290oUh() { // from class: X.0NE7
        @Override // X.InterfaceC1475290oUh
        public final void LIZJ(Pair<SimVideoUrlModel, String> pair) {
            String sourceId;
            String str;
            SimVideoUrlModel simVideoUrlModel;
            for (C0NE9 c0ne9 : C0NEA.LIZJ) {
                String aid = c0ne9.LIZ.getAid();
                String aid2 = null;
                if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null) {
                    sourceId = simVideoUrlModel.getSourceId();
                } else {
                    sourceId = null;
                }
                if (Intrinsics.LJFF(aid, sourceId) && c0ne9.LIZIZ) {
                    C0NEA c0nea = C0NEA.LIZ;
                    if (pair != null) {
                        str = (String) pair.second;
                    } else {
                        str = null;
                    }
                    final Aweme aweme = c0ne9.LIZ;
                    c0nea.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("refactor getVideo from foreground, onPreloadDone aid:");
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    }
                    sbLIZ.append(aid2);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (str != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onPreloadDone local path: ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1483340ohg.LJIIJJI(aweme, C0NFP.LIZJ(aweme.getAid()), true, false, new InterfaceC1475840oVa() { // from class: X.0NE8
                            @Override // X.InterfaceC1475840oVa
                            public final /* synthetic */ void LIZ(long j, long j2) {
                            }

                            @Override // X.InterfaceC1475840oVa
                            public final void LIZIZ(int i) {
                                C0NEA c0nea2 = C0NEA.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("mdl copy cache error ");
                                sbLIZ3.append(i);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                c0nea2.getClass();
                            }

                            @Override // X.InterfaceC1475840oVa
                            public final void onCopyComplete(boolean z, int i, String str2) {
                                String aid3;
                                C0NEA c0nea2 = C0NEA.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("mdl copy cache complete ");
                                sbLIZ3.append(str2);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                c0nea2.getClass();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("refactor getVideo from foreground, onCopyComplete aid:");
                                Aweme aweme2 = aweme;
                                if (aweme2 != null) {
                                    aid3 = aweme2.getAid();
                                } else {
                                    aid3 = null;
                                }
                                sbLIZ4.append(aid3);
                                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                C590420NDs.LIZ.getClass();
                                if (C590420NDs.LJII() == C0NEV.NEVER_DOWNLOAD_VIDEO_SUC.getType()) {
                                    C590420NDs.LJIILLIIL(C0NEV.HAD_DOWNLOAD_VIDEO.getType());
                                }
                            }
                        });
                    }
                    C0NDE c0nde = C0NDE.LIZ;
                    boolean z = C0NEA.LJ;
                    String aid3 = aweme.getAid();
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0ne9.LIZLLL;
                    c0nde.getClass();
                    C0NDE.LIZIZ(1, aid3, "", 0, jCurrentTimeMillis, z);
                    c0ne9.LIZJ.onSuccess(c0ne9.LIZ.getAid());
                    c0ne9.LIZIZ = false;
                    return;
                }
            }
        }

        @Override // X.InterfaceC1475290oUh
        public final void LIZLLL(List<SimVideoUrlModel> list) {
            String aid;
            for (C0NE9 c0ne9 : C0NEA.LIZJ) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(c0ne9.LIZ.getAid(), ((SimVideoUrlModel) it2.next()).getSourceId())) {
                        C0NEA c0nea = C0NEA.LIZ;
                        Aweme aweme = c0ne9.LIZ;
                        c0nea.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("refactor getVideo from foreground, onPreloadCancel aid:");
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        sbLIZ.append(aid);
                        C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C1483340ohg.LJJII(aweme);
                        return;
                    }
                    arrayList.add(Unit.LIZ);
                }
            }
        }

        @Override // X.InterfaceC1475290oUh
        public final void LJFF(SimVideoUrlModel simVideoUrlModel) {
            String sourceId;
            for (C0NE9 c0ne9 : C0NEA.LIZJ) {
                String aid = c0ne9.LIZ.getAid();
                String aid2 = null;
                if (simVideoUrlModel != null) {
                    sourceId = simVideoUrlModel.getSourceId();
                } else {
                    sourceId = null;
                }
                if (Intrinsics.LJFF(aid, sourceId)) {
                    C0NEA.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("refactor getVideo from foreground, onPreloadError aid:");
                    sbLIZ.append(c0ne9.LIZ.getAid());
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (C0NEA.LIZLLL >= 2) {
                        C0NEA.LIZLLL = 0;
                        C0NDE c0nde = C0NDE.LIZ;
                        boolean z = C0NEA.LJ;
                        Aweme aweme = c0ne9.LIZ;
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - c0ne9.LIZLLL;
                        c0nde.getClass();
                        C0NDE.LIZIZ(0, aid2, "", 1024, jCurrentTimeMillis, z);
                        c0ne9.LIZIZ = false;
                        C0NEE c0nee = c0ne9.LIZJ;
                        c0ne9.LIZ.getAid();
                        c0nee.LIZJ();
                        return;
                    }
                    C0NEA.LIZLLL++;
                    c0ne9.LIZIZ = true;
                    C1483340ohg.LJJII(c0ne9.LIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPreloadError retryCount:");
                    sbLIZ2.append(C0NEA.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
            }
        }
    };

    public static void LIZ(C0NEF c0nef, Aweme aweme, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refactor getVideo from foreground, begin aid:");
        sbLIZ.append(aweme.getAid());
        C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start preload groupId:");
        sbLIZ2.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ2);
        LJ = z;
        C0NDE c0nde = C0NDE.LIZ;
        boolean z2 = LJ;
        c0nde.getClass();
        C0NDE.LIZ("", z2);
        if (((Boolean) C0BMH.LIZ.getValue()).booleanValue()) {
            c0nef.LJIIJ(aweme.getAid());
        }
        if (LIZIZ) {
            LIZIZ = false;
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                interfaceC1482870ogvLIZ.LJJI(LJFF);
            }
        }
        LIZJ.add(new C0NE9(aweme, c0nef, System.currentTimeMillis()));
        C1483340ohg.LJJII(aweme);
        C609810Nvv c609810Nvv = C609810Nvv.LIZ;
        Video video = aweme.getVideo();
        c609810Nvv.getClass();
        C609810Nvv.LIZ(aweme, video);
    }
}
