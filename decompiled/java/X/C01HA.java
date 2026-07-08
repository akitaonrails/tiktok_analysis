package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowAnchorTransitionCountDownEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TransitionInfo;

/* JADX INFO: renamed from: X.01HA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HA {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJI() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        ShowContent content;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return false;
        }
        String strLIZLLL = C01HE.LIZLLL(room.getOwnerUserId());
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            InterfaceC937840aVq interfaceC937840aVqLJI = interfaceC937900aVwLLIIJLIL.LJI(strLIZLLL);
            Rect rectLJIIJ = interfaceC937840aVqLJI != null ? interfaceC937840aVqLJI.LJIIJ() : null;
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null && (content = interfaceC302601FgLIZ.getContent()) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(content.showingAndReadyList);
                arrayList.addAll(content.finishedList);
                ArrayList<Rect> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC937840aVq interfaceC937840aVqLJI2 = interfaceC937900aVwLLIIJLIL.LJI(((ShowListUser) it2.next()).linkmicIdStr);
                    arrayList2.add(interfaceC937840aVqLJI2 != null ? interfaceC937840aVqLJI2.LJIIJ() : null);
                }
                if (rectLJIIJ != null) {
                    for (Rect rect : arrayList2) {
                        if (rect != null && (rectLJIIJ.width() <= rect.width() || rectLJIIJ.height() <= rect.height())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIIIIZZ() {
        /*
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.0It8 r0 = r0.YY()
            X.0Isr r0 = r0.LIZIZ
            r1 = 0
            if (r0 == 0) goto L42
            long r5 = r0.LJJIIJ()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting r7 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting.INSTANCE
            long r3 = r7.getValue()
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L2e
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2e
            long r5 = r7.getValue()
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = " seiDelay: "
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "LiveShowUtil"
            X.C20441214yg.LJIIIZ(r0, r1)
            return r5
        L42:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting.INSTANCE
            long r5 = r0.getValue()
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01HA.LJIIIIZZ():long");
    }

    public static void LIZIZ(Integer num) {
        Map<Integer, Boolean> mapLJIIJJI;
        DataChannel dataChannelLJIJ;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (dataChannelLJIJ = interfaceC302601FgLIZ.LJIJ()) != null) {
            dataChannelLJIJ.LC0(LiveShowAnchorTransitionCountDownEvent.class, new C938110aWH(0, 0L, 0L, ""));
        }
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null && (mapLJIIJJI = interfaceC302601FgLIZ2.LJIIJJI()) != null) {
            if (num == null) {
                Iterator<Map.Entry<Integer, Boolean>> it2 = mapLJIIJJI.entrySet().iterator();
                while (it2.hasNext()) {
                    mapLJIIJJI.put(it2.next().getKey(), Boolean.FALSE);
                }
                return;
            }
            mapLJIIJJI.put(num, Boolean.FALSE);
        }
    }

    public static String LJII(long j) {
        int i = (int) (j / 60);
        int i2 = (int) (j - (((long) i) * 60));
        if (i < 10) {
            if (i2 < 10) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
                sbLIZ.append(i);
                sbLIZ.append(":0");
                sbLIZ.append(i2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (i2 < 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append(":0");
            sbLIZ2.append(i2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (i < 10) {
            if (i2 >= 10) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('0');
                sbLIZ3.append(i);
                sbLIZ3.append(':');
                sbLIZ3.append(i2);
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
        } else if (i2 >= 10) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(i);
            sbLIZ4.append(':');
            sbLIZ4.append(i2);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(i);
        sbLIZ5.append(':');
        sbLIZ5.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    public static boolean LIZJ(ShowListUser showListUser, ShowListUser showListUser2) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        String str;
        String str2 = null;
        if (showListUser != null) {
            numValueOf = Integer.valueOf(showListUser.order);
        } else {
            numValueOf = null;
        }
        if (showListUser2 != null) {
            numValueOf2 = Integer.valueOf(showListUser2.order);
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            if (showListUser != null) {
                numValueOf3 = Integer.valueOf(showListUser.status);
            } else {
                numValueOf3 = null;
            }
            if (showListUser2 != null) {
                numValueOf4 = Integer.valueOf(showListUser2.status);
            } else {
                numValueOf4 = null;
            }
            if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                if (showListUser != null) {
                    lValueOf = Long.valueOf(showListUser.userId);
                } else {
                    lValueOf = null;
                }
                if (showListUser2 != null) {
                    lValueOf2 = Long.valueOf(showListUser2.userId);
                } else {
                    lValueOf2 = null;
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    if (showListUser != null) {
                        lValueOf3 = Long.valueOf(showListUser.showStartTime);
                    } else {
                        lValueOf3 = null;
                    }
                    if (showListUser2 != null) {
                        lValueOf4 = Long.valueOf(showListUser2.showStartTime);
                    } else {
                        lValueOf4 = null;
                    }
                    if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                        if (showListUser != null) {
                            str = showListUser.linkmicIdStr;
                        } else {
                            str = null;
                        }
                        if (showListUser2 != null) {
                            str2 = showListUser2.linkmicIdStr;
                        }
                        if (Intrinsics.LJFF(str, str2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZLLL(List list, List list2) {
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        if (list == null) {
            if (list2 != null) {
                return false;
            }
            return true;
        }
        if (list2 == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!LIZJ((ShowListUser) ListProtector.get(list, i), (ShowListUser) ListProtector.get(list2, i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJ(C01H9 c01h9, C01H9 c01h92) {
        ShowListUser showListUser;
        List<ShowListUser> list;
        List<ShowListUser> list2 = null;
        if (c01h9 != null) {
            showListUser = c01h9.LIZ;
        } else {
            showListUser = null;
        }
        if (!LIZJ(showListUser, c01h92.LIZ)) {
            return false;
        }
        if (c01h9 != null) {
            list = c01h9.LIZIZ;
        } else {
            list = null;
        }
        if (!LIZLLL(list, c01h92.LIZIZ)) {
            return false;
        }
        if (c01h9 != null) {
            list2 = c01h9.LIZJ;
        }
        if (!LIZLLL(list2, c01h92.LIZJ)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(ShowConfig showConfig, ShowConfig showConfig2) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4 = null;
        if (showConfig != null) {
            boolValueOf = Boolean.valueOf(showConfig.allowOpenMicFreely);
        } else {
            boolValueOf = null;
        }
        if (showConfig2 != null) {
            boolValueOf2 = Boolean.valueOf(showConfig2.allowOpenMicFreely);
        } else {
            boolValueOf2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(boolValueOf, boolValueOf2);
        if (showConfig != null) {
            lValueOf = Long.valueOf(showConfig.durationPerGuest);
        } else {
            lValueOf = null;
        }
        if (showConfig2 != null) {
            lValueOf2 = Long.valueOf(showConfig2.durationPerGuest);
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            zLJFF = false;
        }
        if (showConfig != null) {
            lValueOf3 = Long.valueOf(showConfig.transitionDurationOfConfig);
        } else {
            lValueOf3 = null;
        }
        if (showConfig2 != null) {
            lValueOf4 = Long.valueOf(showConfig2.transitionDurationOfConfig);
        }
        if (!Intrinsics.LJFF(lValueOf3, lValueOf4)) {
            return false;
        }
        return zLJFF;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.01kM] */
    public static void LJIIIZ(final C5185020h c5185020h, final BaseLiveShowViewModel baseLiveShowViewModel) {
        ShowContent content;
        TransitionInfo transitionInfo;
        final long jLIZ;
        final ShowListUser showListUserLJIILL;
        final Map<Integer, Boolean> mapLJIIJJI;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        final DataChannel dataChannelLJIJ;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null && (content = interfaceC302601FgLIZ2.getContent()) != null && (transitionInfo = content.transitionInfo) != null) {
            final long j = transitionInfo.transitionDurationOfCurrent;
            if (C01HE.LJ() == C01FV.AUDIENCE) {
                long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                jLIZ = ((j * j2) - ((C158B.LIZ() - transitionInfo.transitionStartTime) - LJIIIIZZ())) / j2;
            } else {
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                jLIZ = ((j * j3) - (C158B.LIZ() - transitionInfo.transitionStartTime)) / j3;
            }
            final ShowListUser showListUserLJIILLIIL = null;
            if (jLIZ <= 0) {
                LIZIZ(null);
                return;
            }
            InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ3 != null) {
                showListUserLJIILL = interfaceC302601FgLIZ3.LJIILL();
            } else {
                showListUserLJIILL = null;
            }
            InterfaceC302601Fg interfaceC302601FgLIZ4 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ4 != null) {
                showListUserLJIILLIIL = interfaceC302601FgLIZ4.LJIILLIIL();
            }
            InterfaceC302601Fg interfaceC302601FgLIZ5 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ5 != null && (mapLJIIJJI = interfaceC302601FgLIZ5.LJIIJJI()) != null && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && (dataChannelLJIJ = interfaceC302601FgLIZ.LJIJ()) != null) {
                final int size = mapLJIIJJI.size();
                mapLJIIJJI.put(Integer.valueOf(size), Boolean.TRUE);
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = C11NZ.LJJJJLL(1L, jLIZ, 0L, 1L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIII(new C09JN() { // from class: X.01H8
                    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r15) {
                        /*
                            r14 = this;
                            java.lang.String r6 = "LiveShowUtil@4544.startHostCountDown$timerObservable$1"
                            X.C1C7U.LIZ(r6)
                            java.lang.Long r15 = (java.lang.Long) r15
                            boolean r0 = X.C01HT.LIZJ()
                            if (r0 == 0) goto L6b
                            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = r1
                            int r0 = r2
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            java.lang.Object r0 = r1.get(r0)
                            java.lang.Boolean r5 = java.lang.Boolean.TRUE
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                            if (r0 == 0) goto L6b
                            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r3
                            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowAnchorTransitionCountDownEvent> r2 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowAnchorTransitionCountDownEvent.class
                            X.0aWH r7 = new X.0aWH
                            long r9 = r4
                            long r11 = r6
                            long r0 = r15.longValue()
                            long r11 = r11 - r0
                            r8 = 0
                            java.lang.String r13 = ""
                            r7.<init>(r8, r9, r11, r13)
                            r3.LC0(r2, r7)
                            kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Boolean, kotlin.Unit> r4 = r8
                            if (r4 == 0) goto L4b
                            long r2 = r6
                            long r0 = r15.longValue()
                            long r2 = r2 - r0
                            java.lang.Long r0 = java.lang.Long.valueOf(r2)
                            r4.invoke(r0, r5)
                        L4b:
                            long r3 = r6
                            long r0 = r15.longValue()
                            long r3 = r3 - r0
                            r1 = 1
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 != 0) goto L67
                            com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel r1 = r9
                            if (r1 == 0) goto L67
                            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting.INSTANCE
                            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfig r0 = r0.getSettingValue()
                            int r0 = r0.startAnimationDuration
                            r1.yQ2(r0)
                        L67:
                            X.C1C7U.LIZIZ(r6)
                            return
                        L6b:
                            X.00zU<X.01kM> r0 = r10
                            T r0 = r0.element
                            X.01kM r0 = (X.InterfaceC420801kM) r0
                            if (r0 == 0) goto L76
                            r0.dispose()
                        L76:
                            java.util.Map<java.lang.Integer, java.lang.Boolean> r2 = r1
                            int r0 = r2
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            r2.put(r1, r0)
                            goto L67
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C01H8.accept(java.lang.Object):void");
                    }
                }).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.01Ga
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        ShowListUser showListUser;
                        String string;
                        Long lLJII;
                        C01HA.LIZIZ(Integer.valueOf(size));
                        if (C01HE.LJ() != C01FV.ANCHOR || (showListUser = showListUserLJIILLIIL) == null || showListUserLJIILL == null) {
                            return;
                        }
                        String strValueOf = String.valueOf(showListUser.userId);
                        String strValueOf2 = String.valueOf(showListUserLJIILL.userId);
                        long j4 = j;
                        Map mapLIZ = C306901Gx.LIZ();
                        InterfaceC302601Fg interfaceC302601FgLIZ6 = C01FQ.LIZ();
                        if (interfaceC302601FgLIZ6 == null || (lLJII = interfaceC302601FgLIZ6.LJII()) == null || (string = lLJII.toString()) == null) {
                            string = "";
                        }
                        mapLIZ.put("multiguest_liveshow_id", string);
                        mapLIZ.put("next_uid", strValueOf);
                        mapLIZ.put("last_uid", strValueOf2);
                        mapLIZ.put("duration", String.valueOf(j4));
                        C306901Gx.LJIL("livesdk_mg_anchor_liveshow_interval_onstage_over", mapLIZ);
                    }
                }).LJJLJ();
            }
        }
    }

    public static C01H9 LIZ(List list, List list2, boolean z) {
        ShowListUser showListUser;
        Object next;
        ArrayList arrayList = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((ShowListUser) next).status == 2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            showListUser = (ShowListUser) next;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ShowListUser) obj).status == 1) {
                    arrayList.add(obj);
                }
            }
        } else {
            showListUser = null;
        }
        return new C01H9(showListUser, arrayList, list2, z);
    }
}
