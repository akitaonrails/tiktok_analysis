package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.0xpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834230xpd {
    public static final C1834230xpd LIZ = new C1834230xpd();
    public static volatile boolean LIZIZ;

    public static void LIZIZ() {
        C20441214yg.LIZIZ("LiveReplyVideoPlayer", "try registerNetworkListener");
        if (LIZIZ) {
            return;
        }
        C20441214yg.LIZIZ("LiveReplyVideoPlayer", "registed NetworkListener");
        LIZIZ = true;
        try {
            Map<String, String> mapLIZIZ = InterfaceC1833600xoc.ya.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("taskMap init: ");
            sbLIZ.append(mapLIZIZ);
            C20441214yg.LIZIZ("LiveReplyVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1833600xoc.ya.LJFF(new LinkedHashMap());
        }
        C1835240xrG.LIZ("LiveReplayVideoNetworkKey", new InterfaceC473790Ii1() { // from class: X.0xpc
            @Override // X.InterfaceC473790Ii1
            public final void LIZ(EnumC804620VhM enumC804620VhM) {
                if (enumC804620VhM.isWifi()) {
                    C20441214yg.LIZIZ("LiveReplyVideoPlayer", "registerNetworkListener: is wifi");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(InterfaceC1833600xoc.ya.LIZIZ());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("taskMap: ");
                    sbLIZ2.append(linkedHashMap);
                    C20441214yg.LIZIZ("LiveReplyVideoPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        C1834710xqP.LIZJ().getClass();
                        int iLIZLLL = C1834710xqP.LIZLLL(str2, str);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("foreach replayId: ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", downloadUrl: ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(" downloadStatus:");
                        sbLIZ3.append(iLIZLLL);
                        C20441214yg.LIZIZ("LiveReplyVideoPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                        if (iLIZLLL != 2 && iLIZLLL != 4) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("postDownloadTask replayId: ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(", url; ");
                            sbLIZ4.append(str2);
                            C20441214yg.LIZIZ("LiveReplyVideoPlayer", C2188811AlT.LIZIZ(sbLIZ4));
                            if (!TextUtils.isEmpty(str2)) {
                                C1834230xpd.LIZ.getClass();
                                C1834230xpd.LIZ(str2, str);
                            }
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("toBeRemoveSet replayId: ");
                            sbLIZ5.append(str);
                            C20441214yg.LIZIZ("LiveReplyVideoPlayer", C2188811AlT.LIZIZ(sbLIZ5));
                            str.toString();
                            linkedHashSet.add(str);
                        }
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.remove(it2.next());
                    }
                    InterfaceC1833600xoc.ya.LJFF(linkedHashMap);
                    return;
                }
                C20441214yg.LIZIZ("LiveReplyVideoPlayer", "registerNetworkListener: is not wifi");
            }
        });
    }

    public static void LIZ(String str, String str2) {
        InterfaceC1835200xrC c1835180xrA;
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.remove(str2);
        c20337914i1.LJFF(mapLIZIZ);
        C1834710xqP.LIZJ().getClass();
        if (!TextUtils.isEmpty(str2)) {
            c1835180xrA = C1836420xtA.LJFF().LIZIZ.get(str2);
        } else {
            c1835180xrA = C1836420xtA.LJFF().LIZIZ.get(str);
        }
        C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
        Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
        if (c1835180xrA == null) {
            c1835180xrA = new C1835180xrA(str, str2);
        }
        c1834710xqPLIZJ.getClass();
        C1834710xqP.LJI(topActivity, 0, str, str2, c1835180xrA);
    }
}
