package X;

import Y.ARunnableS107S0100000_7;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusItem;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import webcast.api.room.NearbyGuideConfig;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0J58, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J58 implements C0J5C, C0CW2<DownlinkLiveStatusData> {
    public static final /* synthetic */ int LLJILLL = 0;
    public C19EG LL;
    public View LLILLJJLI;
    public boolean LLILZLL;
    public int LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC482890Iwh LLJIJIL;
    public C0J71 LLJILJILJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(152));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(153));
    public String LLILZIL = "HOME";
    public final C630740Ooa LLIZLLLIL = C628500Oky.LIZ(new AwS551S0100000_7(this, 317));
    public final C0J59 LLJILJIL = new C0J5M() { // from class: X.0J59
        @Override // X.C0J5M
        public final void LIZ(C0J5L c0j5l) {
            c0j5l.LJIIJ = true;
            this.LIZ.LJIIIZ(true);
            this.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C0J58.LIZ(c2344009Gk, c0j5l);
            C20684815ws.LJIILLIIL("livesdk_toplive_nearby_guide_click", c2344009Gk.LIZ);
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LLJIJIL;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZ();
            }
        }

        @Override // X.C0J5M
        public final void LIZIZ(C0J5L c0j5l) {
            C0J58 c0j58 = this.LIZ;
            c0j58.getClass();
            String strLIZ = C0J53.LIZ("bubble_show_count_total");
            c0j58.LJI().storeInt(strLIZ, ((Number) C12848051a.LIZ(c0j58.LJI(), 0, strLIZ)).intValue() + 1);
            c0j58.LJI().storeLong(C0J53.LIZ("bubble_last_show_time"), System.currentTimeMillis());
            this.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C0J58.LIZ(c2344009Gk, c0j5l);
            C20684815ws.LJIILLIIL("livesdk_toplive_nearby_guide_show", c2344009Gk.LIZ);
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LLJIJIL;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZJ();
            }
        }

        @Override // X.C0J5M
        public final void LIZJ(C0J5L c0j5l) {
            if (!c0j5l.LJIIJ) {
                this.LIZ.LJIIIZ(false);
            }
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LLJIJIL;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZIZ();
            }
        }
    };

    public final Keva LJI() {
        return (Keva) this.LLILLL.getValue();
    }

    public final void LJIIJ() {
        C19EG c19eg;
        LifecycleCoroutineScope lifecycleScope;
        C20441214yg.LJIIIZ("LiveNearByGuideManager", "startRequest");
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (!((abstractC1387200mCcLJFF != null ? abstractC1387200mCcLJFF.LIZ : null) instanceof InterfaceC1711206n0) || !Intrinsics.LJFF(this.LLILZIL, "HOME") || (c19eg = this.LL) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19eg)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0J57(this, null), 2);
    }

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
    public final void LIZJ() {
        EventBus.LIZLLL().LJJI(this);
        if (this.LLJI) {
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
                c0j66.LJII(this);
            }
            this.LLJI = false;
        }
        this.LL = null;
        this.LLILLJJLI = null;
        C0J71 c0j71 = this.LLJILJILJ;
        if (c0j71 != null) {
            c0j71.LLZZ();
        }
        C0J71 c0j712 = this.LLJILJILJ;
        if (c0j712 != null) {
            c0j712.LIZIZ(this.LLJILJIL);
        }
        this.LLJILJILJ = null;
    }

    public final boolean LJFF() {
        ShowMode showMode;
        NearbyGuideConfig nearbyGuideConfig;
        Integer numValueOf;
        int i = LJI().getInt(C0J53.LIZ("bubble_show_count_total"), 0);
        boolean z = System.currentTimeMillis() - LJI().getLong(C0J53.LIZ("bubble_last_show_time"), 0L) < 86400000;
        if (i >= 5 || z || LJI().getInt(C0J53.LIZ("bubble_show_no_click"), 0) >= 3) {
            return true;
        }
        StrategyData strategyData = (StrategyData) this.LLILZ.getValue();
        if (strategyData != null && (showMode = strategyData.showMode) != null && (nearbyGuideConfig = showMode.nearbyGuideConfig) != null && (numValueOf = Integer.valueOf(nearbyGuideConfig.group)) != null) {
            if (numValueOf.intValue() != 1 && numValueOf.intValue() != 2 && numValueOf.intValue() != 3) {
                numValueOf.intValue();
                return false;
            }
            if (LJI().getBoolean(C0J53.LIZ("bubble_enter"), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.model.FeedItem> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C0J5A
            if (r0 == 0) goto L21
            r3 = r13
            X.0J5A r3 = (X.C0J5A) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L69
        L21:
            X.0J5A r3 = new X.0J5A
            r3.<init>(r12, r13)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L7c
            java.lang.Class<com.bytedance.android.feed.api.FeedApi> r0 = com.bytedance.android.feed.api.FeedApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L7c
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L7c
            com.bytedance.android.feed.api.FeedApi r6 = (com.bytedance.android.feed.api.FeedApi) r6     // Catch: java.lang.Exception -> L7c
            java.lang.String r7 = "/webcast/feed/"
            r8 = 0
            java.lang.String r10 = "tikcast_nearby_guide"
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L7c
            r11.<init>()     // Catch: java.lang.Exception -> L7c
            X.11NZ r1 = r6.feed(r7, r8, r10, r11)     // Catch: java.lang.Exception -> L7c
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Exception -> L7c
            X.11Hw r1 = r1.LJL(r0)     // Catch: java.lang.Exception -> L7c
            X.11RO r0 = X.C1701940uOG.LIZIZ()     // Catch: java.lang.Exception -> L7c
            X.11O8 r0 = r1.LJJJLZIJ(r0)     // Catch: java.lang.Exception -> L7c
            r3.LLILLL = r2     // Catch: java.lang.Exception -> L7c
            java.lang.Object r1 = X.C384401eU.LIZ(r0, r3)     // Catch: java.lang.Exception -> L7c
            if (r1 != r4) goto L6c
            return r4
        L69:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7c
        L6c:
            com.bytedance.android.live.network.response.BaseListResponse r1 = (com.bytedance.android.live.network.response.BaseListResponse) r1     // Catch: java.lang.Exception -> L7c
            if (r1 == 0) goto L7b
            java.util.List<T> r0 = r1.data     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L7b
            java.lang.Object r0 = X.C13LP.LJJJJZI(r0)     // Catch: java.lang.Exception -> L7c
            com.bytedance.android.livesdk.model.FeedItem r0 = (com.bytedance.android.livesdk.model.FeedItem) r0     // Catch: java.lang.Exception -> L7c
            return r0
        L7b:
            return r5
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J58.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super X.C0J5L> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C0J5B
            r6 = r15
            if (r0 == 0) goto L37
            r5 = r3
            X.0J5B r5 = (X.C0J5B) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLL = r2
        L15:
            java.lang.Object r3 = r5.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto Lba
            X.C155000ia.LIZIZ(r3)
        L25:
            com.bytedance.android.livesdk.model.FeedItem r3 = (com.bytedance.android.livesdk.model.FeedItem) r3
            r12 = 0
            if (r3 != 0) goto L3d
            return r12
        L2b:
            X.C155000ia.LIZIZ(r3)
            r5.LLILLL = r4
            java.lang.Object r3 = r6.LIZLLL(r5)
            if (r3 != r1) goto L25
            return r1
        L37:
            X.0J5B r5 = new X.0J5B
            r5.<init>(r6, r3)
            goto L15
        L3d:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.getRoom()
            if (r0 == 0) goto Lb7
            long r10 = r0.getId()
        L47:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.getRoom()
            if (r0 == 0) goto Lb4
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto Lb4
            long r13 = r0.getId()
        L57:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.getRoom()
            if (r0 == 0) goto L6d
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L6d
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            if (r0 == 0) goto L6d
            java.util.List r12 = X.C842240X2g.LIZ(r0)
        L6d:
            int r0 = r3.skylightRelationType
            if (r0 != r4) goto Lb2
            r2 = 1
        L72:
            int r1 = r3.type
            r0 = 19
            if (r1 != r0) goto Lb0
            r0 = 1
        L79:
            if (r2 != 0) goto L7d
            if (r0 == 0) goto Lae
        L7d:
            if (r12 == 0) goto Lae
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto Lae
            r9 = 1
        L88:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.getRoom()
            r1 = 0
            if (r0 == 0) goto Lab
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto Lab
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            if (r0 == 0) goto Lab
            long r7 = r0.getFollowStatus()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto La6
            r7 = 1
        La6:
            X.0J5L r0 = r6.LIZIZ(r7, r9, r10, r12, r13)
            return r0
        Lab:
            r7 = 0
            goto La6
        Lae:
            r9 = 0
            goto L88
        Lb0:
            r0 = 0
            goto L79
        Lb2:
            r2 = 0
            goto L72
        Lb4:
            r13 = -1
            goto L57
        Lb7:
            r10 = -1
            goto L47
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J58.LJ(X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(C0J5L c0j5l) {
        Object obj;
        C19EG c19eg;
        View view;
        C20441214yg.LJIIIZ("LiveNearByGuideManager", "innerShowBubble");
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            obj = abstractC1387200mCcLJFF.LIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof InterfaceC1711206n0) && Intrinsics.LJFF(this.LLILZIL, "HOME") && (c19eg = this.LL) != null && (view = this.LLILLJJLI) != null) {
            C0J71 c0j71 = new C0J71(c19eg, view, c0j5l);
            c0j71.LJ.add(this.LLJILJIL);
            HandlerHook.viewPost(view, new ARunnableS107S0100000_7(c0j71, 135));
            this.LLJILJILJ = c0j71;
        }
    }

    public final void LJIIIZ(boolean z) {
        String strLIZ = C0J53.LIZ("bubble_show_no_click");
        if (z) {
            LJI().storeInt(strLIZ, 0);
        } else {
            LJI().storeInt(strLIZ, ((Number) C12848051a.LIZ(LJI(), 0, strLIZ)).intValue() + 1);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveExitEvent(C2037107yT c2037107yT) {
        if (c2037107yT != null && Intrinsics.LJFF(c2037107yT.LIZ, "homepage_hot") && Intrinsics.LJFF(c2037107yT.LIZIZ, "live_cell")) {
            this.LLILZLL = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0J59] */
    public C0J58(View view, C19EG c19eg) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
    }

    public static void LIZ(C2344009Gk c2344009Gk, C0J5L c0j5l) {
        c2344009Gk.LIZLLL(UserService.getInstance().user().getCurrentUserId(), "user_id");
        c2344009Gk.LIZLLL(c0j5l.LIZLLL, "room_id");
        c2344009Gk.LIZLLL(c0j5l.LJ, "anchor_id");
        c2344009Gk.LIZLLL(c0j5l.LJFF, "follow_status");
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
        DownlinkLiveStatusItem downlinkLiveStatusItem;
        boolean z;
        final long j;
        final boolean z2;
        ShowMode showMode;
        NearbyGuideConfig nearbyGuideConfig;
        List<DownlinkLiveStatusItem> liveStatusChangeList = ((DownlinkLiveStatusData) baseDownlinkData).getLiveStatusChangeList();
        if (liveStatusChangeList != null && (downlinkLiveStatusItem = (DownlinkLiveStatusItem) C13LP.LJJJJZI(liveStatusChangeList)) != null && downlinkLiveStatusItem.roomStatus == 2) {
            String str = null;
            if (1 != 0) {
                if (LJFF()) {
                    C20441214yg.LJIIIZ("LiveNearByGuideManager", "frequencyControlAndExitLogic");
                    return;
                }
                final long j2 = downlinkLiveStatusItem.roomId;
                final long j3 = downlinkLiveStatusItem.anchorId;
                final List<String> list = downlinkLiveStatusItem.avatarUrl;
                StrategyData strategyData = (StrategyData) this.LLILZ.getValue();
                if (strategyData != null && (showMode = strategyData.showMode) != null && (nearbyGuideConfig = showMode.nearbyGuideConfig) != null) {
                    str = nearbyGuideConfig.geoKey;
                }
                String str2 = downlinkLiveStatusItem.region;
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && u.LJJIIJZLJL(str, str2, false) && (str.length() <= str2.length() || str.charAt(str2.length()) == ':')) {
                    z = true;
                } else {
                    z = false;
                }
                if (Intrinsics.LJFF(uplinkMessageResponse.bizType, "fyp_skylight_refresh")) {
                    j = 1;
                } else {
                    j = 0;
                }
                if (!z) {
                    C20441214yg.LJIIIZ("LiveNearByGuideManager", "handleSignal:Not nearby");
                    return;
                }
                if (list != null && (!list.isEmpty())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                HashMap<String, String> map = new HashMap<>();
                map.put("room_ids", String.valueOf(j2));
                map.put("enter_from", "nearby_push_inspection");
                map.put("check_params", "common");
                C480460Ism.LIZ().getClass();
                ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0J56
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        RoomStatsModel roomStatsModel;
                        Boolean boolValueOf;
                        C1C7U.LIZ("LiveNearByGuideManager@ef5d.handleSignal$2$1");
                        BaseListResponse baseListResponse = (BaseListResponse) obj;
                        if ((!baseListResponse.data.isEmpty()) && (roomStatsModel = (RoomStatsModel) ListProtector.get(baseListResponse.data, 0)) != null) {
                            C0J58 c0j58 = this.LL;
                            long j4 = j;
                            boolean z3 = z2;
                            long j5 = j2;
                            long j6 = j3;
                            List<String> list2 = list;
                            FilterInfoData filterInfoData = roomStatsModel.filterInfo;
                            if (filterInfoData != null && filterInfoData.isFiltered) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("checkRoom failed, isFiltered: ");
                                FilterInfoData filterInfoData2 = roomStatsModel.filterInfo;
                                String str3 = null;
                                if (filterInfoData2 != null) {
                                    boolValueOf = Boolean.valueOf(filterInfoData2.isFiltered);
                                } else {
                                    boolValueOf = null;
                                }
                                sbLIZ.append(boolValueOf);
                                sbLIZ.append(", reason: ");
                                FilterInfoData filterInfoData3 = roomStatsModel.filterInfo;
                                if (filterInfoData3 != null) {
                                    str3 = filterInfoData3.reason;
                                }
                                sbLIZ.append(str3);
                                C20441214yg.LJIIIZ("LiveNearByGuideManager", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                c0j58.LJIIIIZZ(c0j58.LIZIZ(j4, z3, j5, list2, j6));
                            }
                        }
                        C1C7U.LIZIZ("LiveNearByGuideManager@ef5d.handleSignal$2$1");
                    }
                }, new C09JN() { // from class: X.00Jz
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveNearByGuideManager@ef5d.handleSignal$2$2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkRoom failed");
                        sbLIZ.append(((Throwable) obj).getMessage());
                        C20441214yg.LJIIIZ("LiveNearByGuideManager", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("LiveNearByGuideManager@ef5d.handleSignal$2$2");
                    }
                });
            }
        }
    }

    public final C0J5L LIZIZ(long j, boolean z, long j2, List list, long j3) {
        int i;
        String str;
        ShowMode showMode;
        NearbyGuideConfig nearbyGuideConfig;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        StrategyData strategyData = (StrategyData) this.LLILZ.getValue();
        if (strategyData != null && (showMode = strategyData.showMode) != null && (nearbyGuideConfig = showMode.nearbyGuideConfig) != null) {
            str = nearbyGuideConfig.text;
        } else {
            str = null;
        }
        return new C0J5L(null, i, false, j2, j3, j, list, str, "live_toplive_nearby", 2058);
    }
}
