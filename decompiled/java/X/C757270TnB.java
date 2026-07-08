package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.BusinessLinksLiveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757270TnB extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> {
    public Room LLILLL;
    public IFrameSlot.SlotViewModel LLILZ;
    public InterfaceC21213717zz LLILZIL;
    public BusinessLinksCardList LLILZLL;
    public ActiveCard LLIZLLLIL;
    public long LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public final C1125520fOY LLIZ = new C1125520fOY();
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 706));
    public Integer LLJILJILJ = 0;
    public final BPEAHandler LLJILLL = new BPEAHandler(new Handler.Callback() { // from class: X.0TnD
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            MutableLiveData<Pair<Boolean, String>> mutableLiveData;
            Pair<Boolean, String> value;
            IFrameSlot.SlotViewModel slotViewModel;
            MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
            IFrameSlot.SlotViewModel slotViewModel2 = this.LL.LLILZ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (slotViewModel = this.LL.LLILZ) != null && (mutableLiveData2 = slotViewModel.LL) != null) {
                mutableLiveData2.setValue(new Pair<>(Boolean.FALSE, "business_links"));
                return true;
            }
            return true;
        }
    });

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(20000);
    }

    public final void LJJ() {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        IFrameSlot.SlotViewModel slotViewModel2 = this.LLILZ;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE) && (slotViewModel = this.LLILZ) != null && (mutableLiveData2 = slotViewModel.LL) != null) {
            mutableLiveData2.setValue(new Pair<>(Boolean.FALSE, "business_links"));
        }
        this.LLJILLL.removeMessages(0);
    }

    public final boolean LJJI() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        LJJ();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP;
    }

    public final void LJJIFFI(ActiveCard activeCard) {
        Long lValueOf;
        Long lValueOf2;
        String string;
        String string2;
        Long lValueOf3;
        String string3;
        String str;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Context context;
        Context context2;
        this.LLIZ.LL = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZIZ.getValue()).liveLinkPreview.LIZ();
        C1125520fOY c1125520fOY = this.LLIZ;
        Bundle bundle = new Bundle();
        Room room = this.LLILLL;
        String string4 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        C786410Ut5.LJJJI("room_id", String.valueOf(lValueOf), bundle);
        Room room2 = this.LLILLL;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        C786410Ut5.LJJJI("anchor_id", String.valueOf(lValueOf2), bundle);
        C786410Ut5.LJJJI("enter_from_merge", this.LLJIJIL, bundle);
        C786410Ut5.LJJJI("enter_method", this.LLJILJIL, bundle);
        C786410Ut5.LJJJI("title", activeCard.title, bundle);
        C786410Ut5.LJJJI("subtitle", activeCard.subtitle, bundle);
        C786410Ut5.LJJJI("pic_url", activeCard.f336pic, bundle);
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZIL;
        if (interfaceC21213717zz != null && (context2 = interfaceC21213717zz.getContext()) != null) {
            string = context2.getString(2131821935);
        } else {
            string = null;
        }
        C786410Ut5.LJJJI("pin_text", string, bundle);
        InterfaceC21213717zz interfaceC21213717zz2 = this.LLILZIL;
        if (interfaceC21213717zz2 != null && (context = interfaceC21213717zz2.getContext()) != null) {
            string2 = context.getString(2131821817);
        } else {
            string2 = null;
        }
        C786410Ut5.LJJJI("more_text", string2, bundle);
        C786410Ut5.LJJJI("link_id", String.valueOf(activeCard.id), bundle);
        c1125520fOY.LLILLJJLI = bundle;
        IFrameSlot.SlotViewModel slotViewModel = this.LLILZ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null) {
            mutableLiveData.setValue(new Pair<>(Boolean.TRUE, "business_links"));
        }
        C786410Ut5.LJLJJI(0, 10000L, this.LLJILLL);
        C2344009Gk c2344009Gk = new C2344009Gk();
        Room room3 = this.LLILLL;
        if (room3 != null) {
            lValueOf3 = Long.valueOf(room3.getOwnerUserId());
        } else {
            lValueOf3 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(lValueOf3));
        Room room4 = this.LLILLL;
        if (room4 != null) {
            string3 = Long.valueOf(room4.getId()).toString();
        } else {
            string3 = null;
        }
        c2344009Gk.LJIIIIZZ("room_id", string3);
        ActiveCard activeCard2 = this.LLIZLLLIL;
        if (activeCard2 != null) {
            string4 = Long.valueOf(activeCard2.id).toString();
        }
        c2344009Gk.LJIIIIZZ("link_id", string4);
        c2344009Gk.LJIIIIZZ("enter_from_merge", this.LLJIJIL);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJILJIL);
        c2344009Gk.LJ(this.LLJILJILJ, "is_ad");
        ActiveCard activeCard3 = this.LLIZLLLIL;
        ArrayMap arrayMap = new ArrayMap();
        ActiveCard activeCard4 = this.LLIZLLLIL;
        if (activeCard4 == null || (str = activeCard4.url) == null) {
            str = "";
        }
        arrayMap.put("ba_url", str);
        C757330TnH.LIZ(c2344009Gk, activeCard3, arrayMap);
        C20684815ws.LJIILLIIL("livesdk_links_show_notify", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void listenToLinksLiveEvent(X.C756350Tlh r15) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757270TnB.listenToLinksLiveEvent(X.0Tlh):void");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof BusinessLinksLiveMessage) || LJJI()) {
            return;
        }
        BusinessLinksLiveMessage businessLinksLiveMessage = (BusinessLinksLiveMessage) iMessage;
        long j = businessLinksLiveMessage.opTime;
        if (j < this.LLJI) {
            return;
        }
        this.LLJI = j;
        int i = businessLinksLiveMessage.op;
        if (i == EnumC757240Tn8.PIN.getValue()) {
            long j2 = businessLinksLiveMessage.id;
            String str = businessLinksLiveMessage.title;
            String str2 = businessLinksLiveMessage.subtitle;
            if (str2 == null) {
                str2 = "";
            }
            ActiveCard activeCard = new ActiveCard(j2, str, str2, businessLinksLiveMessage.url, businessLinksLiveMessage.f317pic, businessLinksLiveMessage.cardType, businessLinksLiveMessage.gameUrl, true, businessLinksLiveMessage.liveLogExtra);
            this.LLIZLLLIL = activeCard;
            LJJIFFI(activeCard);
            return;
        }
        if (i != EnumC757240Tn8.UNPIN.getValue()) {
            return;
        }
        this.LLIZLLLIL = null;
        LJJ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        List<ActiveCard> list;
        IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZ = slotViewModel;
        this.LLILZIL = interfaceC21213717zz;
        if (!LJJI()) {
            BusinessLinksCardList businessLinksCardList = this.LLILZLL;
            ActiveCard activeCard = null;
            if (businessLinksCardList != null && (list = businessLinksCardList.cardList) != null) {
                Iterator<ActiveCard> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ActiveCard next = it2.next();
                    if (next.isPinned()) {
                        activeCard = next;
                        break;
                    }
                }
                activeCard = activeCard;
            }
            this.LLIZLLLIL = activeCard;
            if (activeCard != null) {
                LJJIFFI(activeCard);
            } else {
                LJJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r5, X.InterfaceC756140TlM r6) {
        /*
            r4 = this;
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            r3 = 0
            if (r0 == 0) goto L55
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        Ld:
            r4.LLILLL = r1
            java.lang.String r0 = "param_live_enter_from_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L53
            java.lang.String r1 = (java.lang.String) r1
        L1b:
            r4.LLJIJIL = r1
            java.lang.String r0 = "param_live_enter_method_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L51
            java.lang.String r1 = (java.lang.String) r1
        L29:
            r4.LLJILJIL = r1
            java.lang.String r0 = "param_enter_from_effect_ad_bool"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L36
            r1 = r3
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.LLJILJILJ = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLILLL
            if (r0 == 0) goto L6d
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L6d
            java.lang.String r2 = r0.baLinkData
            if (r2 == 0) goto L6d
            goto L57
        L51:
            r1 = r3
            goto L29
        L53:
            r1 = r3
            goto L1b
        L55:
            r1 = r3
            goto Ld
        L57:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList> r0 = com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L66
            com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList r0 = (com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList) r0     // Catch: java.lang.Exception -> L66
            r3 = r0
            goto L6d
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L6d:
            r4.LLILZLL = r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLILLL
            if (r0 == 0) goto L82
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L82
            int r1 = r0.baLinkPermission
            r0 = 1
            if (r1 != r0) goto L82
        L7e:
            r6.LIZ(r0)
            return
        L82:
            r0 = 0
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757270TnB.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
