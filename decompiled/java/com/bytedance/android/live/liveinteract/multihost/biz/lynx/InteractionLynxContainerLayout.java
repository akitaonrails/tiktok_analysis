package com.bytedance.android.live.liveinteract.multihost.biz.lynx;

import X.C01GW;
import X.C1058250de3;
import X.C1155220gAS;
import X.C1199804mi;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C16A4;
import X.C16A8;
import X.C1871910yoP;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C262100zr;
import X.C452501pT;
import X.C497740JfY;
import X.C5183020f;
import X.C723590SZx;
import X.C786410Ut5;
import X.C963550bBJ;
import X.C963590bBN;
import X.C963860bBo;
import X.EnumC125100dl;
import X.EnumC1779770wPn;
import X.EnumC976700bWW;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS42S0101000_31;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.EventParams$OpenContributorList;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxAudioStatusChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxBattleInfoUpdatedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxBattleResultAnimationEndChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxFollowStatusChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxInteractiveStatusChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxLayoutDidChangeChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxLinkedListChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchSourceChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchStartAnimationEnd;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchStartAnimationShow;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxOpenContributorListChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxStreamSizeChangeChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxVideoStatusChangedChannel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class InteractionLynxContainerLayout extends UISlotAssem implements InterfaceC1141530foN {
    public static final List<C16A8<?>> LLJLLL = C1697810uHb.LJIIJJI(new C16A8<Unit>() { // from class: X.16AC
        @Override // X.C16A4
        public final String getEventName() {
            return "liverevenue_gameplay_event_common_request_data_snapshot";
        }
    }, new C16A8<Object>() { // from class: X.16AA
        @Override // X.C16A4
        public final String getEventName() {
            return "liverevenue_gameplay_event_common_component_did_show";
        }
    }, new C16A8<Object>() { // from class: X.16A9
        @Override // X.C16A4
        public final String getEventName() {
            return "liverevenue_gameplay_event_common_component_did_hide";
        }
    }, new C16A8<EventParams$OpenContributorList>() { // from class: X.16AB
        @Override // X.C16A4
        public final String getEventName() {
            return "liverevenue_gameplay_event_common_open_contributor_list";
        }
    });
    public InterfaceC1541990qEH LLJJIJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJ;
    public ARunnableS42S0101000_31 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public DataChannel LLJLLIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(77));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(75));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(76));
    public EnumC976700bWW LLJJJIL = EnumC976700bWW.NONE;
    public Rect LLJJJJ = new Rect();
    public final List<Pair<C16A4<?>, Object>> LLJJJJJIL = new ArrayList();
    public final List<C1199804mi> LLJJJJLIIL = new ArrayList();
    public EnumC1779770wPn LLJJL = EnumC1779770wPn.LL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h08;
    }

    public final boolean ip() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    public final boolean kp() {
        return ip() ? this.LLJJIJIL != null : this.LLJJJ != null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", "onDestroy");
        Iterator<C16A8<?>> it2 = LLJLLL.iterator();
        while (it2.hasNext()) {
            C1548820qPI.LJIIIIZZ(it2.next().getEventName(), this);
        }
        tp();
        DataChannel dataChannel = this.LLJLLIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJLLIL = null;
    }

    public final void tp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseSparkLynxView state=");
        sbLIZ.append(this.LLJJL);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS42S0101000_31 aRunnableS42S0101000_31 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS42S0101000_31 != null) {
            HandlerHook.viewRemoveCallbacks(getContentView(), aRunnableS42S0101000_31);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJJL = EnumC1779770wPn.LL;
        ((ArrayList) this.LLJJJJJIL).clear();
        ((ArrayList) this.LLJJJJLIIL).clear();
        Iterator<C16A8<?>> it2 = LLJLLL.iterator();
        while (it2.hasNext()) {
            C1548820qPI.LJIIIIZZ(it2.next().getEventName(), this);
        }
        this.LLJLILLLLZIIL++;
        this.LLJL = false;
        this.LLJLIL = false;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJIJIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
        this.LLJJIJIL = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLJJJ = null;
        C786410Ut5.LJJJJI((ViewGroup) getContentView());
    }

    public final Rect hp(Rect rect) {
        DataChannel dataChannel;
        C963860bBo c963860bBo;
        if (((C1155220gAS) this.LLJJI.getValue()).LL || rect.top != 0 || (dataChannel = this.LLJLLIL) == null || (c963860bBo = (C963860bBo) dataChannel.gg0(AdjustVideoInteractStreamBottomEvent.class)) == null || c963860bBo.LIZIZ == 0) {
            return rect;
        }
        Rect rect2 = new Rect(rect.left, c963860bBo.LIZIZ, rect.right, c963860bBo.LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newRect = ");
        sbLIZ.append(rect2);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        return rect2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(X.EnumC976700bWW r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.lynx.InteractionLynxContainerLayout.lp(X.0bWW):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent, jsEvent=");
        sbLIZ.append(c262100zr);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        String str = c262100zr.LIZ;
        Integer numValueOf = null;
        C963590bBN c963590bBN = null;
        Integer numValueOf2 = null;
        if (Intrinsics.LJFF(str, "liverevenue_gameplay_event_common_request_data_snapshot")) {
            DataChannel dataChannel4 = this.LLJLLIL;
            if (dataChannel4 != null) {
                c963590bBN = (C963590bBN) dataChannel4.gg0(LynxMatchSourceChannel.class);
            }
            up(new C16A4() { // from class: X.16AD
                @Override // X.C16A4
                public final String getEventName() {
                    return "liverevenue_gameplay_event_common_data_snapshot";
                }
            }, C963550bBJ.LIZJ(new AwS381S0200000_15(this, c963590bBN, 61)));
            return;
        }
        boolean z = false;
        if (Intrinsics.LJFF(str, "liverevenue_gameplay_event_common_component_did_show")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                numValueOf2 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "component_type", 0));
            }
            int value = EnumC125100dl.BATTLE_START_ANIMATION.getValue();
            if (numValueOf2 == null || numValueOf2.intValue() != value || (dataChannel3 = this.LLJLLIL) == null) {
                return;
            }
            dataChannel3.zW(LynxMatchStartAnimationShow.class, Unit.LIZ);
            return;
        }
        if (Intrinsics.LJFF(str, "liverevenue_gameplay_event_common_component_did_hide")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd2, "component_type", 0));
            }
            int value2 = EnumC125100dl.BATTLE_START_ANIMATION.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2 || (dataChannel2 = this.LLJLLIL) == null) {
                return;
            }
            dataChannel2.zW(LynxMatchStartAnimationEnd.class, Unit.LIZ);
            return;
        }
        if (!Intrinsics.LJFF(str, "liverevenue_gameplay_event_common_open_contributor_list") || (dataChannel = this.LLJLLIL) == null) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 != null && C1871910yoP.LIZIZ(interfaceC1107590evd3, "is_self_team", false)) {
            z = true;
        }
        dataChannel.zW(LynxOpenContributorListChannel.class, new EventParams$OpenContributorList(z));
    }

    public final void mp(Rect rect) {
        Rect rect2 = this.LLJJJJ;
        if (rect2.left == rect.left && rect2.top == rect.top && rect2.width() == rect.width() && this.LLJJJJ.height() == rect.height()) {
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", "stream size not changed");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamSizeChange size=");
        sbLIZ.append(rect);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        Rect rect3 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        this.LLJJJJ = rect3;
        C1199804mi c1199804mi = new C1199804mi(C2097908Jt.LIZJ(new Pair("stream_container_frame", C2097608Jq.LJIIIIZZ(new Pair("x", Float.valueOf(C497740JfY.LJJI(rect3.left))), new Pair("y", Float.valueOf(C497740JfY.LJJI(this.LLJJJJ.top))), new Pair("w", Float.valueOf(C497740JfY.LJJI(this.LLJJJJ.width()))), new Pair("h", Float.valueOf(C497740JfY.LJJI(this.LLJJJJ.height())))))));
        if (this.LLJJL == EnumC1779770wPn.LL) {
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", "updateData failed, lynx is not started");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateData isLynxLoadFinish=");
        sbLIZ2.append(this.LLJLIL);
        sbLIZ2.append(", isLynxViewCreated=");
        sbLIZ2.append(kp());
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJLIL && kp()) {
            sp(c1199804mi);
        } else {
            ((ArrayList) this.LLJJJJLIIL).add(c1199804mi);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC976700bWW enumC976700bWW;
        Rect rect;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated useSparkLite=");
        sbLIZ.append(ip());
        C20441214yg.LJIIIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = ((C1155220gAS) this.LLJJI.getValue()).LLILLJJLI;
        this.LLJLLIL = dataChannel;
        if (dataChannel != null && (rect = (Rect) dataChannel.gg0(LynxStreamSizeChangeChannel.class)) != null) {
            Rect rectHp = hp(rect);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onViewCreated pull current StreamSize=");
            sbLIZ2.append(rectHp);
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
            mp(rectHp);
        }
        DataChannel dataChannel2 = this.LLJLLIL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(LynxStreamSizeChangeChannel.class, this, new AwS610S0100000_31(this, 69));
        }
        DataChannel dataChannel3 = this.LLJLLIL;
        if (dataChannel3 != null && (enumC976700bWW = (EnumC976700bWW) dataChannel3.gg0(LynxInteractiveStatusChannel.class)) != null && enumC976700bWW != EnumC976700bWW.NONE) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onViewCreated pull current InteractiveStatus=");
            sbLIZ3.append(enumC976700bWW);
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ3));
            lp(enumC976700bWW);
        }
        DataChannel dataChannel4 = this.LLJLLIL;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(LynxInteractiveStatusChannel.class, this, new C5183020f(this, 78));
        }
        DataChannel dataChannel5 = this.LLJLLIL;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(LynxLinkedListChangedChannel.class, this, new C5183020f(this, 290));
        }
        DataChannel dataChannel6 = this.LLJLLIL;
        if (dataChannel6 != null) {
            dataChannel6.CQ2(LynxLayoutDidChangeChannel.class, this, new C5183020f(this, 79));
        }
        DataChannel dataChannel7 = this.LLJLLIL;
        if (dataChannel7 != null) {
            dataChannel7.CQ2(LynxFollowStatusChangedChannel.class, this, new AwS614S0100000_35(this, 38));
        }
        DataChannel dataChannel8 = this.LLJLLIL;
        if (dataChannel8 != null) {
            dataChannel8.CQ2(LynxAudioStatusChangedChannel.class, this, new AwS614S0100000_35(this, 39));
        }
        DataChannel dataChannel9 = this.LLJLLIL;
        if (dataChannel9 != null) {
            dataChannel9.CQ2(LynxVideoStatusChangedChannel.class, this, new AwS614S0100000_35(this, 40));
        }
        DataChannel dataChannel10 = this.LLJLLIL;
        if (dataChannel10 != null) {
            dataChannel10.CQ2(LynxBattleInfoUpdatedChannel.class, this, new C5183020f(this, 291));
        }
        DataChannel dataChannel11 = this.LLJLLIL;
        if (dataChannel11 != null) {
            dataChannel11.CQ2(LynxBattleResultAnimationEndChannel.class, this, new C5183020f(this, 292));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r1
      0x000d: PHI (r1v4 X.0qEH) = (r1v1 X.0qEH), (r1v5 X.0qEH) binds: [B:19:0x0030, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(X.C1199804mi r4) {
        /*
            r3 = this;
            boolean r0 = r3.ip()
            r2 = 0
            if (r0 == 0) goto L26
            X.0qEH r1 = r3.LLJJIJIL
            boolean r0 = r1 instanceof com.lynx.tasm.LynxView
            if (r0 == 0) goto L10
        Ld:
            r2 = r1
            com.lynx.tasm.LynxView r2 = (com.lynx.tasm.LynxView) r2
        L10:
            java.lang.String r0 = r4.LIZIZ
            if (r0 == 0) goto L1e
            if (r2 == 0) goto L1d
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.LIZ
            java.lang.String r0 = r4.LIZIZ
            r2.updateData(r1, r0)
        L1d:
            return
        L1e:
            if (r2 == 0) goto L1d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.LIZ
            r2.updateData(r0)
            return
        L26:
            X.0qEB r0 = r3.LLJJJ
            if (r0 == 0) goto L33
            X.0qEH r1 = r0.getKitView()
        L2e:
            boolean r0 = r1 instanceof com.lynx.tasm.LynxView
            if (r0 == 0) goto L10
            goto Ld
        L33:
            r1 = r2
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.lynx.InteractionLynxContainerLayout.sp(X.04mi):void");
    }

    public final void op(C16A4<?> c16a4, Object obj) {
        JSONObject jSONObject;
        if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            jSONObject = new JSONObject(GsonProtectorUtils.toJson(C1058250de3.LIZIZ(), obj));
        }
        if (ip()) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJIJIL;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ(c16a4.getEventName(), jSONObject);
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ(c16a4.getEventName(), jSONObject);
    }

    public final <T> void up(C16A4<T> c16a4, T t) {
        if (this.LLJJL == EnumC1779770wPn.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendEvent failed, event = ");
            sbLIZ.append(c16a4.getEventName());
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (t instanceof Unit) {
            t = (T) new JSONObject();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendEvent isLynxJSReady=");
        sbLIZ2.append(this.LLJL);
        sbLIZ2.append(", isLynxViewCreated=");
        sbLIZ2.append(kp());
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJL && kp()) {
            op(c16a4, t);
            return;
        }
        ((ArrayList) this.LLJJJJJIL).add(new Pair(c16a4, t));
    }
}
