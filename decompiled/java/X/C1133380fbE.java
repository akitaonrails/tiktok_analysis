package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.api.BattleTaskGuideTipShowChannel;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayInitEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayRebindEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayStateEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchVirtualTicketTrayVisibilityEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.InRoomGiftTrayCountEvent;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133380fbE extends AbstractC1100450ek7 {
    public IMessageManager LLIZ;
    public final Map<Long, C1135030fdt> LLIZLLLIL;
    public C1135030fdt LLJ;
    public int LLJI;
    public final Map<Long, WeakReference<ConstraintLayout>> LLJIJIL;
    public final Map<Long, Boolean> LLJILJIL;
    public final Map<Long, C1135030fdt> LLJILJILJ;
    public long LLJILLL;
    public final C1133390fbF LLJJ;

    @Override // X.AbstractC1100450ek7
    public final void LJIILJJIL() {
        C20441214yg.LJIIIZ("GiftMatchTrayLeaf", "onEnd");
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            dataChannel.SX0(C973780bRo.class, null);
            dataChannel.SX0(C750410Tc7.class, null);
        }
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJJ);
        }
        Iterator it2 = ((LinkedHashMap) this.LLIZLLLIL).values().iterator();
        while (it2.hasNext()) {
            ((C1135030fdt) it2.next()).LJI();
        }
        ((LinkedHashMap) this.LLIZLLLIL).clear();
        Iterator it3 = ((LinkedHashMap) this.LLJILJILJ).values().iterator();
        while (it3.hasNext()) {
            ((C1135030fdt) it3.next()).LJI();
        }
        ((LinkedHashMap) this.LLJILJILJ).clear();
        this.LLJILLL = 0L;
        ((LinkedHashMap) this.LLJIJIL).clear();
        ((LinkedHashMap) this.LLJILJIL).clear();
        this.LLJ = null;
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.LC0(MatchVirtualTicketTrayVisibilityEvent.class, Boolean.FALSE);
        }
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZI() {
        C20441214yg.LJIIIZ("GiftMatchTrayLeaf", "onStart");
        Collection collectionValues = ((LinkedHashMap) this.LLIZLLLIL).values();
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            dataChannel.SX0(C973780bRo.class, new AwS561S0100000_17(collectionValues, (Collection<C1135030fdt>) 470));
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.SX0(C750410Tc7.class, new AwS561S0100000_17(this, 471));
        }
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_ARMIES.getIntType(), (OnIMMessageListener) this.LLJJ);
            iMessageManager.addMessageListener(C001A.LINK_MIC_OPPONENT_GIFTS.getIntType(), (OnIMMessageListener) this.LLJJ);
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_ARTIFACT_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJJ);
        }
        Iterator it2 = ((LinkedHashMap) this.LLIZLLLIL).values().iterator();
        while (it2.hasNext()) {
            ((C1135030fdt) it2.next()).LIZJ();
        }
        Iterator it3 = ((LinkedHashMap) this.LLJILJILJ).values().iterator();
        while (it3.hasNext()) {
            ((C1135030fdt) it3.next()).LIZJ();
        }
    }

    public final DataChannel getDataChannel() {
        Fragment fragment;
        GiftLeafRootViewModel giftLeafRootViewModel;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || (giftLeafRootViewModel = (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class)) == null) {
            return null;
        }
        return giftLeafRootViewModel.LL;
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRegister ");
        sbLIZ.append(this);
        C20441214yg.LJIIIZ("GiftMatchTrayLeaf", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = getDataChannel();
        this.LLIZ = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            C1100420ek4 c1100420ek4 = this.LLILZIL;
            dataChannel2.BQ2(c1100420ek4 != null ? c1100420ek4.getFragment() : null, MatchGiftTrayInitEvent.class, new AwS596S0100000_17(this, 461));
            C1100420ek4 c1100420ek42 = this.LLILZIL;
            dataChannel2.BQ2(c1100420ek42 != null ? c1100420ek42.getFragment() : null, MatchGiftTrayRebindEvent.class, new AwS596S0100000_17(this, 462));
            C1100420ek4 c1100420ek43 = this.LLILZIL;
            dataChannel2.BQ2(c1100420ek43 != null ? c1100420ek43.getFragment() : null, MatchGiftTrayStateEvent.class, new AwS596S0100000_17(this, 463));
            C1100420ek4 c1100420ek44 = this.LLILZIL;
            dataChannel2.BQ2(c1100420ek44 != null ? c1100420ek44.getFragment() : null, BattleTaskGuideTipShowChannel.class, new C1100700ekW(this));
            C1100420ek4 c1100420ek45 = this.LLILZIL;
            dataChannel2.BQ2(c1100420ek45 != null ? c1100420ek45.getFragment() : null, InRoomGiftTrayCountEvent.class, new AwS596S0100000_17(this, 464));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0fbF] */
    public C1133380fbE(Context context) {
        super(context, EnumC1129580fV6.GIFT_MATCH_TRAY_LEAF.getZIndex());
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILJILJ = new LinkedHashMap();
        this.LLJJ = new OnIMMessageListener() { // from class: X.0fbF
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "GiftMatchTrayLeaf";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x023a  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x03b6  */
            /* JADX WARN: Removed duplicated region for block: B:171:0x03ca  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x0405  */
            /* JADX WARN: Removed duplicated region for block: B:193:0x043d  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x044a  */
            /* JADX WARN: Removed duplicated region for block: B:241:0x0545  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x054f  */
            /* JADX WARN: Removed duplicated region for block: B:245:0x0552  */
            /* JADX WARN: Removed duplicated region for block: B:267:0x025d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onMessage(final com.ss.ugc.live.sdk.message.data.IMessage r26) {
                /*
                    Method dump skipped, instruction units count: 1366
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1133390fbF.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
            }
        };
    }

    public static boolean LJJJIL(long j) {
        Object c098200Yq;
        InterfaceC973730bRj interfaceC973730bRjYf2;
        BattleUserInfo battleUserInfoLJJI;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        try {
            ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
            boolean z = false;
            if (iLiveMatchService != null && (interfaceC973730bRjYf2 = iLiveMatchService.yf2(false)) != null && (battleUserInfoLJJI = interfaceC973730bRjYf2.LJJI()) != null && (battleBaseUserInfo = battleUserInfoLJJI.user) != null && (l = battleBaseUserInfo.userId) != null && l.longValue() == j) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public final void LJJJJ(C1135030fdt c1135030fdt, ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        int i = this.LLJI;
        if (i == 0) {
            i = R.id.virtual_ticket_space;
        }
        ViewParent parent = null;
        ConstraintLayout constraintLayout3 = c1135030fdt.LLJ;
        if (constraintLayout3 != null && Intrinsics.LJFF(constraintLayout3.getParent(), constraintLayout)) {
            C20441214yg.LIZIZ("GiftMatchTray", "attachViewInPlaceholderSlot; already attached to container, no-op");
            return;
        }
        View viewFindViewById = constraintLayout.findViewById(i);
        if (viewFindViewById == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachViewInPlaceholderSlot; placeholderViewId=");
            sbLIZ.append(i);
            sbLIZ.append(" not in container, skip");
            C20441214yg.LJIIL("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("attachViewInPlaceholderSlot; placeholderViewId=");
        sbLIZ2.append(i);
        sbLIZ2.append(" placeholder=");
        sbLIZ2.append(viewFindViewById);
        C20441214yg.LJIIIZ("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ2));
        ConstraintLayout constraintLayout4 = c1135030fdt.LLJ;
        if (constraintLayout4 != null) {
            parent = constraintLayout4.getParent();
        }
        if ((parent instanceof ConstraintLayout) && (constraintLayout2 = (ConstraintLayout) parent) != null) {
            C786410Ut5.LJJLI(c1135030fdt.LLJ, constraintLayout2);
        }
        c1135030fdt.LIZLLL(constraintLayout);
        ConstraintLayout constraintLayout5 = c1135030fdt.LLJ;
        if (constraintLayout5 == null) {
            return;
        }
        constraintLayout.addView(constraintLayout5);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(constraintLayout5.getId(), 6, i, 6);
        c19mb.LJIIIIZZ(constraintLayout5.getId(), 3, i, 3);
        c19mb.LIZIZ(constraintLayout);
    }

    public final void LJJJJI(Long l, Map map) {
        for (Map.Entry entry : ((LinkedHashMap) this.LLIZLLLIL).entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            C1135030fdt c1135030fdt = (C1135030fdt) entry.getValue();
            Integer num = (Integer) map.get(Long.valueOf(jLongValue));
            if (num != null) {
                c1135030fdt.LLJJ = num.intValue();
            }
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.LLJILJILJ).entrySet()) {
            long jLongValue2 = ((Number) entry2.getKey()).longValue();
            C1135030fdt c1135030fdt2 = (C1135030fdt) entry2.getValue();
            Integer num2 = (Integer) map.get(Long.valueOf(jLongValue2));
            if (num2 != null) {
                c1135030fdt2.LLJJ = num2.intValue();
            }
        }
        if (l != null) {
            long jLongValue3 = l.longValue();
            this.LLJ = (C1135030fdt) ((LinkedHashMap) this.LLIZLLLIL).get(Long.valueOf(jLongValue3));
        }
    }
}
