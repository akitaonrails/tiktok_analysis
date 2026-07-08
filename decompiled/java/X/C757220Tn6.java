package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.ext.BusinessLinksLiveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757220Tn6 extends AbstractC21213317zv<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements InterfaceC484670IzZ {
    public Room LLILZIL;
    public InterfaceC21213717zz LLILZLL;
    public IIconSlot.SlotViewModel LLIZ;
    public BusinessLinksCardList LLIZLLLIL;
    public long LLJ;
    public String LLJI;
    public String LLJIJIL;
    public Integer LLJILJIL = 0;
    public final List<ActiveCard> LLJILJILJ = new ArrayList();

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final String LLILZIL() {
        return "AudienceBALinks";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(20000);
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJ() {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_link;
        return c419910GdJ.LIZ(context);
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJIFFI() {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_link_fill;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exs, context);
        return c419910GdJ.LIZ(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TnC] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0TnC
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                ActiveCard activeCard;
                Long lValueOf;
                String string;
                String str2;
                Context context;
                Long lValueOf2;
                String string2;
                String strValueOf;
                String str3;
                if (((ArrayList) this.LIZ.LLJILJILJ).size() == 0) {
                    return;
                }
                ActiveCard activeCard2 = (ActiveCard) ListProtector.get(this.LIZ.LLJILJILJ, 0);
                InterfaceC21213717zz interfaceC21213717zz = this.LIZ.LLILZLL;
                String str4 = "";
                if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
                    C757220Tn6 c757220Tn6 = this.LIZ;
                    if (activeCard2.cardType == 2 && (str3 = activeCard2.gameUrl) != null) {
                        SmartRouter.buildRoute(context, str3).open();
                    } else {
                        Activity activityLIZJ = C0J3A.LIZJ(context);
                        if (activityLIZJ == null && (activityLIZJ = C2214201BlK.LJFF()) == null) {
                            return;
                        }
                        C1546210qL5.LIZ.getClass();
                        Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", activeCard2.url).appendQueryParameter("type", "popup").appendQueryParameter("title", activeCard2.title).appendQueryParameter("height", String.valueOf((int) (C445490HdT.LIZIZ(activityLIZJ, Integer.valueOf(C1546210qL5.LJIIL(C1546210qL5.LJII(activityLIZJ), activityLIZJ))) * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                        c757220Tn6.getClass();
                        SettingsManager.LIZLLL().getClass();
                        String str5 = "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1";
                        String strLJI = SettingsManager.LJI("live_links_report_schema", "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1");
                        if (!TextUtils.isEmpty(strLJI)) {
                            str5 = strLJI;
                        }
                        Uri.Builder builderBuildUpon = UriProtector.parse(str5).buildUpon();
                        Room room = c757220Tn6.LLILZIL;
                        if (room != null) {
                            lValueOf2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            lValueOf2 = null;
                        }
                        Uri.Builder builderAppendQueryParameter2 = builderBuildUpon.appendQueryParameter("anchor_id", String.valueOf(lValueOf2));
                        Room room2 = c757220Tn6.LLILZIL;
                        if (room2 != null) {
                            string2 = Long.valueOf(room2.getId()).toString();
                        } else {
                            string2 = null;
                        }
                        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("room_id", string2);
                        if (((ArrayList) c757220Tn6.LLJILJILJ).size() == 0) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(((ActiveCard) ListProtector.get(c757220Tn6.LLJILJILJ, 0)).id);
                        }
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).W3(context, builderAppendQueryParameter.appendQueryParameter("report_schema", UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builderAppendQueryParameter3.appendQueryParameter("link_id", strValueOf).appendQueryParameter("enter_from_merge", c757220Tn6.LLJI).appendQueryParameter("enter_method", c757220Tn6.LLJIJIL).toString()).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_bdx", "1").appendQueryParameter("trans_status_bar", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("hybrid_sdk_version", "bullet").appendQueryParameter("webview_clear_color", "1").appendQueryParameter("container_bg_color", "00000000").appendQueryParameter("keyboard_adjust", CardStruct.IStatusCode.DEFAULT).toString()).appendQueryParameter("gravity", "bottom").build().toString(), new AwS378S0200000_12(c757220Tn6, activeCard2, 118));
                    }
                }
                C757220Tn6 c757220Tn62 = this.LIZ;
                if (((ArrayList) c757220Tn62.LLJILJILJ).size() == 0) {
                    activeCard = null;
                } else {
                    activeCard = (ActiveCard) ListProtector.get(c757220Tn62.LLJILJILJ, 0);
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                Room room3 = c757220Tn62.LLILZIL;
                if (room3 != null) {
                    lValueOf = Long.valueOf(room3.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(lValueOf));
                Room room4 = c757220Tn62.LLILZIL;
                if (room4 != null) {
                    string = Long.valueOf(room4.getId()).toString();
                } else {
                    string = null;
                }
                c2344009Gk.LJIIIIZZ("room_id", string);
                c2344009Gk.LJIIIIZZ("link_id", "");
                c2344009Gk.LJIIIIZZ("enter_from_merge", c757220Tn62.LLJI);
                c2344009Gk.LJIIIIZZ("enter_method", c757220Tn62.LLJIJIL);
                c2344009Gk.LIZJ(1, "enter_source");
                c2344009Gk.LJ(c757220Tn62.LLJILJIL, "is_ad");
                ArrayMap arrayMap = new ArrayMap();
                if (activeCard != null && (str2 = activeCard.url) != null) {
                    str4 = str2;
                }
                arrayMap.put("ba_url", str4);
                C757330TnH.LIZ(c2344009Gk, activeCard, arrayMap);
                C20684815ws.LJIILLIIL("livesdk_links_click", c2344009Gk.LIZ);
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tn7
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(8);
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final InterfaceC752610Tff LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = r0;
            }
        };
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 161;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        BusinessLinksLiveMessage businessLinksLiveMessage;
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        if ((iMessage instanceof BusinessLinksLiveMessage) && (businessLinksLiveMessage = (BusinessLinksLiveMessage) iMessage) != null) {
            long j = businessLinksLiveMessage.opTime;
            if (j < this.LLJ) {
                return;
            }
            this.LLJ = j;
            int i = businessLinksLiveMessage.op;
            if (i == EnumC757240Tn8.ADD.getValue()) {
                long j2 = businessLinksLiveMessage.id;
                String str = businessLinksLiveMessage.title;
                String str2 = businessLinksLiveMessage.subtitle;
                if (str2 == null) {
                    str2 = "";
                }
                ListProtector.add(this.LLJILJILJ, 0, new ActiveCard(j2, str, str2, businessLinksLiveMessage.url, businessLinksLiveMessage.f317pic, businessLinksLiveMessage.cardType, businessLinksLiveMessage.gameUrl, false, businessLinksLiveMessage.liveLogExtra));
                IIconSlot.SlotViewModel slotViewModel3 = this.LLIZ;
                if ((slotViewModel3 == null || (mutableLiveData4 = slotViewModel3.LLILZ) == null || !Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) && (slotViewModel2 = this.LLIZ) != null && (mutableLiveData3 = slotViewModel2.LLILZ) != null) {
                    mutableLiveData3.setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (i != EnumC757240Tn8.REMOVE.getValue()) {
                return;
            }
            Iterator it2 = ((ArrayList) this.LLJILJILJ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (businessLinksLiveMessage.id == ((ActiveCard) next).id) {
                    if (next != null) {
                        ((ArrayList) this.LLJILJILJ).remove(next);
                    }
                }
            }
            IIconSlot.SlotViewModel slotViewModel4 = this.LLIZ;
            if (slotViewModel4 == null || (mutableLiveData = slotViewModel4.LLILZ) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE) || (slotViewModel = this.LLIZ) == null || (mutableLiveData2 = slotViewModel.LLILZ) == null) {
                return;
            }
            mutableLiveData2.setValue(Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        boolean z;
        List<ActiveCard> list;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZLL = interfaceC21213717zz;
        this.LLIZ = slotViewModel;
        BusinessLinksCardList businessLinksCardList = this.LLIZLLLIL;
        if (businessLinksCardList != null && (list = businessLinksCardList.cardList) != null) {
            z = !list.isEmpty();
        } else {
            z = false;
        }
        slotViewModel.LLILZ.setValue(Boolean.valueOf(z));
        slotViewModel.LLJ.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwu)));
        slotViewModel.LLJI.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.bwv)));
        slotViewModel.LLJILJILJ.setValue(interfaceC21213717zz.getContext().getString(2131821822));
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        String str;
        String str2;
        BALinkStruct bALinkStruct;
        List<ActiveCard> list;
        Object obj;
        BALinkStruct bALinkStruct2;
        String str3;
        Object obj2 = map.get("param_room");
        BusinessLinksCardList businessLinksCardList = null;
        if (obj2 instanceof Room) {
            room = (Room) obj2;
        } else {
            room = null;
        }
        this.LLILZIL = room;
        Object obj3 = map.get("param_live_enter_from_merge");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        this.LLJI = str;
        Object obj4 = map.get("param_live_enter_method_merge");
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        } else {
            str2 = null;
        }
        this.LLJIJIL = str2;
        Object obj5 = map.get("param_enter_from_effect_ad_bool");
        if (!(obj5 instanceof Boolean)) {
            obj5 = null;
        }
        this.LLJILJIL = Integer.valueOf(Intrinsics.LJFF(obj5, Boolean.TRUE) ? 1 : 0);
        Room room2 = this.LLILZIL;
        if (room2 != null && (bALinkStruct2 = room2.getBALinkStruct()) != null && (str3 = bALinkStruct2.baLinkData) != null) {
            try {
                businessLinksCardList = (BusinessLinksCardList) new Gson().LJII(str3, BusinessLinksCardList.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        this.LLIZLLLIL = businessLinksCardList;
        boolean z = false;
        if (businessLinksCardList != null && (list = businessLinksCardList.cardList) != null && (obj = ListProtector.get(list, 0)) != null) {
            ((ArrayList) this.LLJILJILJ).add(obj);
        }
        Room room3 = this.LLILZIL;
        if (room3 != null && (bALinkStruct = room3.getBALinkStruct()) != null && bALinkStruct.baLinkPermission == 1) {
            z = true;
        }
        interfaceC756140TlM.LIZ(z);
    }
}
