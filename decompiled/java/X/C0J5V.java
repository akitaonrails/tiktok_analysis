package X;

import Y.ARunnableS107S0100000_7;
import android.view.View;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchGuideSetting;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchShowIntervalSetting;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusItem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0J5V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J5V implements InterfaceC486260J5c, C0CW2<DownlinkLiveStatusData> {
    public C19EG LL;
    public View LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public C0J71 LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public final boolean LLJ;
    public final C0J5W LLJI;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean LJIIIZ() {
        boolean zLJIIIIZZ = LJIIIIZZ(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRegisterSignaling position: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasRegisteredSignaling: ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", passFreqControl: ");
        sbLIZ.append(zLJIIIIZZ);
        sbLIZ.append(", skipFreqControl: ");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL) {
            return false;
        }
        if (!zLJIIIIZZ && !this.LLJ) {
            return false;
        }
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C486370J5n.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486370J5n;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            c0j66.LIZ(this, C1697810uHb.LJIIJJI("fyp_skylight_refresh", "home_unfollow"));
            c0j66.LJIIJ(new C486380J5o(null, "fyp_skylight_refresh", null, 59));
            c0j66.LJIIJ(new C486380J5o(null, "home_unfollow", null, 59));
        }
        this.LLILZLL = true;
        return true;
    }

    public static List LIZLLL() {
        ArrayList arrayList;
        C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.K9;
        if (c0jt6 == null || (arrayList = (ArrayList) c0jt6.LIZ()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"_"}, 0, 6);
            arrayList2.add(new Pair(Long.valueOf(CastLongProtector.parseLong((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))), Long.valueOf(CastLongProtector.parseLong((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)))));
        }
        return arrayList2;
    }

    public static Integer LJ(String str) {
        Object objG4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (objG4 = iLiveOuterService.g4("default", "server_feature", str)) == null || !(objG4 instanceof String)) {
            return null;
        }
        return C2095008Iq.LJIIJJI((String) objG4);
    }

    public final boolean LIZ(Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowToday anchorId = ");
        sbLIZ.append(l);
        sbLIZ.append(", skipFreqControl: ");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJ) {
            return true;
        }
        List listLIZLLL = LIZLLL();
        Object obj = null;
        if (listLIZLLL != null) {
            Iterator it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                long jLongValue = ((Number) ((Pair) next).getFirst()).longValue();
                if (l != null && jLongValue == l.longValue()) {
                    obj = next;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                boolean z = !LJI(((Number) pair.getSecond()).longValue(), System.currentTimeMillis());
                if (!z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("canShowToday filtered anchorId because is shown today. anchorId=");
                    sbLIZ2.append(l);
                    sbLIZ2.append(" record=");
                    sbLIZ2.append(pair);
                    C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
                return z;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.model.FeedItem> r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J5V.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[PHI: r17
      0x00ba: PHI (r17v1 java.util.List<java.lang.String>) = 
      (r17v0 java.util.List<java.lang.String>)
      (r17v3 java.util.List<java.lang.String>)
      (r17v3 java.util.List<java.lang.String>)
      (r17v3 java.util.List<java.lang.String>)
     binds: [B:45:0x00b7, B:31:0x0063, B:33:0x0069, B:35:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C0J5L> r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J5V.LIZJ(X.05Vn):java.lang.Object");
    }

    public final void LJFF(C0J5L c0j5l) {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("innerTriggerBubble roomId=");
        sbLIZ.append(c0j5l.LIZLLL);
        sbLIZ.append(" anchorId=");
        sbLIZ.append(c0j5l.LJ);
        sbLIZ.append(" activity=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" targetView=");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        C0J71 c0j71 = this.LLILZIL;
        if (c0j71 != null) {
            c0j71.LIZIZ(this.LLJI);
        }
        C19EG c19eg = this.LL;
        if (c19eg != null && (view = this.LLILLJJLI) != null) {
            C0J71 c0j712 = new C0J71(c19eg, view, c0j5l);
            c0j712.LJ.add(this.LLJI);
            HandlerHook.viewPost(view, new ARunnableS107S0100000_7(c0j712, 131));
            this.LLILZIL = c0j712;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(boolean r10) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J5V.LJIIIIZZ(boolean):boolean");
    }

    public static final boolean LJI(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, final UplinkMessageResponse uplinkMessageResponse, final AwS125S0110000_7 awS125S0110000_7) {
        Integer numValueOf;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        DownlinkLiveStatusItem downlinkLiveStatusItem;
        DownlinkLiveStatusData downlinkLiveStatusData = (DownlinkLiveStatusData) baseDownlinkData;
        boolean zLJIIIIZZ = LJIIIIZZ(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleSignal: roomStatus: ");
        List<DownlinkLiveStatusItem> liveStatusChangeList = downlinkLiveStatusData.getLiveStatusChangeList();
        if (liveStatusChangeList != null && (downlinkLiveStatusItem = (DownlinkLiveStatusItem) ListProtector.get(liveStatusChangeList, 0)) != null) {
            numValueOf = Integer.valueOf(downlinkLiveStatusItem.roomStatus);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" passFreqControl: ");
        sbLIZ.append(zLJIIIIZZ);
        sbLIZ.append(", skipFreqControl: ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", message: ");
        sbLIZ.append(downlinkLiveStatusData);
        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        if (downlinkLiveStatusData.getLiveStatusChangeList() != null) {
            if (!zLJIIIIZZ && !this.LLJ) {
                return;
            }
            for (DownlinkLiveStatusItem downlinkLiveStatusItem2 : downlinkLiveStatusData.getLiveStatusChangeList()) {
                final long j = downlinkLiveStatusItem2.roomId;
                final long j2 = downlinkLiveStatusItem2.anchorId;
                final List<String> list = downlinkLiveStatusItem2.avatarUrl;
                if (downlinkLiveStatusItem2.roomStatus == 2 && LIZ(Long.valueOf(j2))) {
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) {
                        return;
                    }
                    interfaceC20673515v3K4.LJI("relation_push_inspection", "common", downlinkLiveStatusItem2.roomId, new InterfaceC472850IgV() { // from class: X.0J5X
                        @Override // X.InterfaceC472850IgV
                        public final void onFailed() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("handleSignal asyncCheckRoomStatus failed, roomId: ");
                            sbLIZ2.append(j);
                            C20441214yg.LJIIL("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                        }

                        @Override // X.InterfaceC472850IgV
                        public final void LIZ(FilterInfoData filterInfoData, boolean z) {
                            Boolean boolValueOf;
                            String str;
                            if (z) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("handleSignal asyncCheckRoomStatus is alive, roomId: ");
                                sbLIZ2.append(j);
                                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                                C0J5V c0j5v = this;
                                String str2 = c0j5v.LLILLL;
                                int i = c0j5v.LLILZ;
                                boolean zLJFF = Intrinsics.LJFF(uplinkMessageResponse.subType, "fyp_skylight_refresh");
                                long j3 = j;
                                long j4 = j2;
                                List<String> list2 = list;
                                String str3 = this.LLILLL;
                                if (Intrinsics.LJFF(str3, "toplive")) {
                                    str = "live_toplive_active_watch";
                                } else if (Intrinsics.LJFF(str3, "following")) {
                                    str = "live_following_active_watch";
                                } else {
                                    str = "";
                                }
                                this.LJFF(new C0J5L(str2, i, zLJFF, j3, j4, 0L, list2, null, str, 2880));
                                awS125S0110000_7.invoke();
                                return;
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("handleSignal asyncCheckRoomStatus not alive, isFiltered: ");
                            String str4 = null;
                            if (filterInfoData != null) {
                                boolValueOf = Boolean.valueOf(filterInfoData.isFiltered);
                            } else {
                                boolValueOf = null;
                            }
                            sbLIZ3.append(boolValueOf);
                            sbLIZ3.append(", reason: ");
                            if (filterInfoData != null) {
                                str4 = filterInfoData.reason;
                            }
                            sbLIZ3.append(str4);
                            C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    });
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0J5W] */
    public C0J5V(C19EG c19eg, View view, String str, int i) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveActiveWatchGuideManager init, position: ");
        sbLIZ.append(str);
        sbLIZ.append(", style: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ();
        this.LLIZLLLIL = "HOME";
        this.LLJ = LiveActiveWatchGuideSetting.INSTANCE.getConfig().skipFreqControl;
        this.LLJI = new C0J5M() { // from class: X.0J5W
            @Override // X.C0J5M
            public final void LIZ(C0J5L c0j5l) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bubbleClick position: ");
                sbLIZ2.append(this.LIZ.LLILLL);
                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                c0j5l.LJIIJ = true;
                this.LIZ.getClass();
                C0JT6<List<Long>> c0jt6 = InterfaceC1106030et7.L9;
                if (c0jt6 != null) {
                    ArrayList arrayList = new ArrayList();
                    c0jt6.LIZJ(arrayList);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("notifyBubbleClick [cleared]dismiss_no_click_timestamps=");
                    sbLIZ3.append(arrayList);
                    C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }

            @Override // X.C0J5M
            public final void LIZIZ(C0J5L c0j5l) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bubbleShow position: ");
                sbLIZ2.append(this.LIZ.LLILLL);
                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                C0J5V c0j5v = this.LIZ;
                c0j5v.getClass();
                long j = c0j5l.LJ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.K9;
                if (c0jt6 != null) {
                    ArrayList arrayList = (ArrayList) c0jt6.LIZ();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(j);
                    sbLIZ3.append('_');
                    sbLIZ3.append(jCurrentTimeMillis);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
                    if (arrayList.size() > 2) {
                        ListProtector.remove(arrayList, 0);
                    }
                    c0jt6.LIZJ(arrayList);
                }
                c0j5v.LLIZ = true;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("notifyBubbleShow bubble_show_records=");
                sbLIZ4.append(C0J5V.LIZLLL());
                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ4));
            }

            @Override // X.C0J5M
            public final void LIZJ(C0J5L c0j5l) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bubbleDismiss position: ");
                sbLIZ2.append(this.LIZ.LLILLL);
                C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (!c0j5l.LJIIJ) {
                    this.LIZ.getClass();
                    C0JT6<List<Long>> c0jt6 = InterfaceC1106030et7.L9;
                    if (c0jt6 != null) {
                        ArrayList arrayList = (ArrayList) c0jt6.LIZ();
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(Long.valueOf(System.currentTimeMillis()));
                        if (arrayList.size() > 3) {
                            ListProtector.remove(arrayList, 0);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (System.currentTimeMillis() - ((Number) obj).longValue() < LiveActiveWatchShowIntervalSetting.INSTANCE.getValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        c0jt6.LIZJ(arrayList3);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("notifyBubbleDismissNoClick dismiss_no_click_timestamps=");
                        sbLIZ3.append(arrayList3);
                        C20441214yg.LJIIIZ("LiveActiveWatchGuideManager", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }
        };
    }
}
