package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468800IZy implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LL;
    public LiveEventModule LLILLJJLI;
    public InterfaceC468830Ia1 LLILLL;
    public boolean LLILZ;
    public String LLILZIL = "";
    public String LLILZLL = "";

    public final String LIZ() {
        LiveEventModule liveEventModule = this.LLILLJJLI;
        if (liveEventModule != null) {
            return liveEventModule.id;
        }
        return null;
    }

    public final void LJII() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_card_show");
        C464740IKi c464740IKi = C0IH6.LIZ;
        int i = 0;
        c474500IjALIZ.LJJII((c464740IKi == null || !c464740IKi.LJIIIIZZ) ? "end_live" : "guest_end_panel", "enter_from");
        c474500IjALIZ.LJJII(this.LLILZLL, "anchor_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "user_id");
        LiveEventModule liveEventModule = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule != null ? liveEventModule.id : null, "live_event_id");
        LiveEventModule liveEventModule2 = this.LLILLJJLI;
        if (liveEventModule2 != null && liveEventModule2.isPaidEvent) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_free");
        LiveEventModule liveEventModule3 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule3 != null ? Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(liveEventModule3.subscribed)) ? 1 : 0) : null, "has_registered");
        LiveEventModule liveEventModule4 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule4 != null ? liveEventModule4.LIZ() : null, "live_event_type");
        c474500IjALIZ.LJJII(this.LL ? "1" : CardStruct.IStatusCode.DEFAULT, "is_half_screen");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIIIZZ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register");
        c474500IjALIZ.LJJII("end_live", "enter_from");
        c474500IjALIZ.LJJII("end_live", "register_position");
        LiveEventModule liveEventModule = this.LLILLJJLI;
        c474500IjALIZ.LJJII(Integer.valueOf((liveEventModule == null || liveEventModule.isPaidEvent) ? 0 : 1), "is_free");
        c474500IjALIZ.LJJII(this.LLILZLL, "author_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "user_id");
        LiveEventModule liveEventModule2 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule2 != null ? liveEventModule2.id : null, "live_event_id");
        LiveEventModule liveEventModule3 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule3 != null ? liveEventModule3.LIZ() : null, "live_event_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIIZ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_cancel");
        c474500IjALIZ.LJJII("end_live", "enter_from");
        c474500IjALIZ.LJJII("end_live", "register_position");
        LiveEventModule liveEventModule = this.LLILLJJLI;
        c474500IjALIZ.LJJII(Integer.valueOf((liveEventModule == null || liveEventModule.isPaidEvent) ? 0 : 1), "is_free");
        c474500IjALIZ.LJJII(this.LLILZLL, "anchor_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "user_id");
        c474500IjALIZ.LJJII("upcoming", "event_status");
        LiveEventModule liveEventModule2 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule2 != null ? liveEventModule2.id : null, "live_event_id");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_success");
        c474500IjALIZ.LJJII("end_live", "enter_from");
        c474500IjALIZ.LJJII("end_live", "register_position");
        LiveEventModule liveEventModule = this.LLILLJJLI;
        c474500IjALIZ.LJJII(Integer.valueOf((liveEventModule == null || liveEventModule.isPaidEvent) ? 0 : 1), "is_free");
        c474500IjALIZ.LJJII(this.LLILZLL, "author_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "user_id");
        c474500IjALIZ.LJJII("upcoming", "event_status");
        LiveEventModule liveEventModule2 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEventModule2 != null ? liveEventModule2.id : null, "live_event_id");
        c474500IjALIZ.LIZ();
    }

    public static String LIZIZ(long j) {
        String strGr1;
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
        if (iHostCreativeTool == null || (strGr1 = iHostCreativeTool.Gr1(Long.valueOf(j))) == null) {
            return "";
        }
        return strGr1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C468810IZz
            if (r0 == 0) goto L6c
            r7 = r9
            X.0IZz r7 = (X.C468810IZz) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r5 = 0
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L7a
            if (r1 != r4) goto L72
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule r2 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            r2.subscribed = r3
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L37:
            X.C155000ia.LIZIZ(r0)
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule r2 = r8.LLILLJJLI
            if (r2 == 0) goto L8e
            java.lang.String r1 = r2.id
            if (r1 == 0) goto L8e
            boolean r0 = r2.subscribed
            if (r0 == 0) goto L59
            java.lang.Class<com.bytedance.android.livesdk.comp.api.event.ILiveEventService> r0 = com.bytedance.android.livesdk.comp.api.event.ILiveEventService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r0 = (com.bytedance.android.livesdk.comp.api.event.ILiveEventService) r0
            r7.LL = r2
            r7.LLILZ = r3
            java.lang.Object r0 = r0.NH2(r1, r7)
            if (r0 != r6) goto L7f
            return r6
        L59:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.event.ILiveEventService> r0 = com.bytedance.android.livesdk.comp.api.event.ILiveEventService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r0 = (com.bytedance.android.livesdk.comp.api.event.ILiveEventService) r0
            r7.LL = r2
            r7.LLILZ = r4
            java.lang.Object r0 = r0.ZC2(r1, r7)
            if (r0 != r6) goto L28
            return r6
        L6c:
            X.0IZz r7 = new X.0IZz
            r7.<init>(r8, r9)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7a:
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule r2 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L7f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L89
            r2.subscribed = r5
        L89:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468800IZy.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final void LJI(String str) {
        Object obj;
        Object obj2;
        Object objValueOf;
        Object obj3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_card_click");
        C464740IKi c464740IKi = C0IH6.LIZ;
        int i = 0;
        if (c464740IKi != null && c464740IKi.LJIIIIZZ) {
            obj = "guest_end_panel";
        } else {
            obj = "end_live";
        }
        c474500IjALIZ.LJJII(obj, "enter_from");
        c474500IjALIZ.LJJII(this.LLILZLL, "anchor_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "user_id");
        LiveEventModule liveEventModule = this.LLILLJJLI;
        Object objLIZ = null;
        if (liveEventModule != null) {
            obj2 = liveEventModule.id;
        } else {
            obj2 = null;
        }
        c474500IjALIZ.LJJII(obj2, "live_event_id");
        c474500IjALIZ.LJJII(str, "click_area");
        LiveEventModule liveEventModule2 = this.LLILLJJLI;
        if (liveEventModule2 != null && liveEventModule2.isPaidEvent) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_free");
        LiveEventModule liveEventModule3 = this.LLILLJJLI;
        if (liveEventModule3 != null) {
            objValueOf = Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(liveEventModule3.subscribed)) ? 1 : 0);
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "has_registered");
        LiveEventModule liveEventModule4 = this.LLILLJJLI;
        if (liveEventModule4 != null) {
            objLIZ = liveEventModule4.LIZ();
        }
        c474500IjALIZ.LJJII(objLIZ, "live_event_type");
        if (this.LL) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_half_screen");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        LiveEventModule liveEventModuleLIZ;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (liveEventModuleLIZ = C477380Ino.LIZ(interfaceC1107590evd)) == null) {
            return;
        }
        LiveEventModule liveEventModule = this.LLILLJJLI;
        if (liveEventModule != null) {
            liveEventModule.subscribed = liveEventModuleLIZ.subscribed;
        }
        InterfaceC468830Ia1 interfaceC468830Ia1 = this.LLILLL;
        if (interfaceC468830Ia1 != null) {
            interfaceC468830Ia1.Gf(liveEventModuleLIZ.subscribed);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r13, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C468820Ia0
            if (r0 == 0) goto L61
            r11 = r14
            X.0Ia0 r11 = (X.C468820Ia0) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r11.LLILLL = r2
        L12:
            java.lang.Object r3 = r11.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 != r2) goto L69
            X.C155000ia.LIZIZ(r3)
        L22:
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse r3 = (com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse) r3
            r1 = 0
            if (r3 == 0) goto L67
            java.util.List<com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule> r0 = r3.eventList
            if (r0 == 0) goto L67
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L67
            java.util.List<com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule> r0 = r3.eventList
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule r2 = (com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule) r2
            java.lang.String r1 = r2.id
            java.lang.String r0 = "Event"
            X.C20441214yg.LJIIIZ(r0, r1)
            return r2
        L43:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.event.ILiveEventService> r0 = com.bytedance.android.livesdk.comp.api.event.ILiveEventService.class
            X.006A r3 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r3 = (com.bytedance.android.livesdk.comp.api.event.ILiveEventService) r3
            r4 = 0
            r5 = 2
            java.lang.Integer r9 = X.C2286608xc.LJ(r5)
            r11.LLILLL = r2
            r10 = 0
            r7 = 1
            r6 = r13
            java.lang.Object r3 = r3.Rk1(r4, r5, r6, r7, r9, r10, r11)
            if (r3 != r1) goto L22
            return r1
        L61:
            X.0Ia0 r11 = new X.0Ia0
            r11.<init>(r12, r14)
            goto L12
        L67:
            r0 = 0
            return r0
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468800IZy.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJFF(Context context, String str, String str2) {
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, new AwS121S1100000_7(str2, this, 1));
    }

    public final void LJ(String str, String str2, boolean z, LiveEventModule liveEventModule, InterfaceC468830Ia1 interfaceC468830Ia1) {
        if (this.LLILLJJLI == null) {
            C1548820qPI.LIZLLL("live_event_update_result", this);
        }
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLILLJJLI = liveEventModule;
        this.LL = z;
        this.LLILLL = interfaceC468830Ia1;
    }
}
