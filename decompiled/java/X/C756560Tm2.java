package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.message.BALeadGenMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756560Tm2 extends AbstractC21213317zv<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> {
    public static final /* synthetic */ int LLJJ = 0;
    public Room LLILZIL;
    public InterfaceC21213717zz LLILZLL;
    public IIconSlot.SlotViewModel LLIZ;
    public long LLJ;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILLL;
    public final Keva LLIZLLLIL = Keva.getRepo("commercialize_live_leads_gen_keva_name");
    public Integer LLJI = 0;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(379));

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ba_leads_gen";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final String LLILZIL() {
        return "AudienceBALeadsGen";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return C1697810uHb.LJIILJJIL(Integer.valueOf(C001A.BA_LEAD_GEN.getIntType()));
    }

    @Override // X.AbstractC21213317zv
    public final TuxIconDrawable LJJ() {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILLJJLI;
        if (interfaceC21213717zz == null || (context = interfaceC21213717zz.getContext()) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_clipboard_fill_ltr;
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
        c419910GdJ.LIZ = R.raw.icon_clipboard_fill_ltr;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exs, context);
        return c419910GdJ.LIZ(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Tm7] */
    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        final ?? r0 = new InterfaceC752610Tff() { // from class: X.0Tm7
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                this.LIZ.LJJII(null);
            }
        };
        return new IIconSlot(r0) { // from class: X.0Tm6
            public final InterfaceC752610Tff LIZ;

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final void getScheme() {
            }

            @Override // com.bytedance.android.live.slot.IIconSlot
            public final Animator.AnimatorListener LIZ() {
                return new ALAdapterS0S0000000_12(5);
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

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLIZLLLIL.storeInt("audience_report_show_event_times", 0);
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    public final void LJJII(String str) {
        Context context;
        Activity activityLIZ;
        Long lValueOf;
        String str2;
        String nickName;
        User owner;
        User owner2;
        User owner3;
        ImageModel avatarLarge;
        List urls;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZLL;
        if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            if (!(activityLIZ instanceof C19EG)) {
                C1AF0.LIZJ("slotGate's context is not FragmentActivity");
                return;
            }
            if (str == null) {
                str = "during_live";
            }
            String str3 = this.LLJIJIL;
            if (str3 == null) {
                return;
            }
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(str3).buildUpon().appendQueryParameter("enter_from", str).appendQueryParameter("title", this.LLJILJIL);
            Room room = this.LLILZIL;
            Long lValueOf2 = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("ba_uid", String.valueOf(lValueOf)).appendQueryParameter("is_ad", String.valueOf(this.LLJI));
            Room room2 = this.LLILZIL;
            if (room2 != null && (owner3 = room2.getOwner()) != null && (avatarLarge = owner3.getAvatarLarge()) != null && (urls = avatarLarge.getUrls()) != null) {
                str2 = (String) ListProtector.get(urls, 0);
            } else {
                str2 = null;
            }
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("avatar", str2);
            Room room3 = this.LLILZIL;
            if (room3 != null && (owner2 = room3.getOwner()) != null) {
                nickName = owner2.getNickName();
            } else {
                nickName = null;
            }
            String string = builderAppendQueryParameter3.appendQueryParameter("name", nickName).appendQueryParameter("iab_click_time", String.valueOf(System.currentTimeMillis())).appendQueryParameter("ttclid", this.LLJILLL).toString();
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            Uri uri = UriProtector.parse(string);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                String string2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon().appendQueryParameter("ttclid", this.LLJILLL).toString();
                Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                Uri.Builder builderFragment = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
                for (String str4 : queryParameterNames) {
                    if (Intrinsics.LJFF(str4, "url")) {
                        builderFragment.appendQueryParameter(str4, string2);
                    } else {
                        builderFragment.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                    }
                }
                string = builderFragment.toString();
            }
            sparkContext.LJJLIIJ(string);
            sparkContext.LJJJZ("container_bg_color", "00000000");
            c1537900q7g.getClass();
            new C1541950qED(activityLIZ, sparkContext).LIZIZ();
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            Room room4 = this.LLILZIL;
            if (room4 != null && (owner = room4.getOwner()) != null) {
                lValueOf2 = Long.valueOf(owner.getId());
            }
            String strValueOf = String.valueOf(lValueOf2);
            Integer num = this.LLJI;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "live_anchor");
            c2344009Gk.LJIIIIZZ("from_uid_id", currentUserID);
            c2344009Gk.LJIIIIZZ("to_user_id", strValueOf);
            c2344009Gk.LJ(num, "is_ad");
            C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_click_cta", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).o3().LIZIZ(EnumC1107860ew4.LIVE_LEADS_GEN, new C756540Tm0());
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        Long lValueOf;
        User owner;
        int i = this.LLIZLLLIL.getInt("audience_report_show_event_times", 0);
        if (i < 1) {
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            Room room = this.LLILZIL;
            if (room != null && (owner = room.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Integer num = this.LLJI;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "live_anchor");
            c2344009Gk.LJIIIIZZ("from_uid_id", currentUserID);
            c2344009Gk.LJIIIIZZ("to_user_id", strValueOf);
            c2344009Gk.LJ(num, "is_ad");
            C20684815ws.LJIILLIIL("ttelite_ba_lead_tt_show_cta", c2344009Gk.LIZ);
        }
        this.LLIZLLLIL.storeInt("audience_report_show_event_times", i + 1);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6;
        long j;
        IIconSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Boolean> mutableLiveData7;
        if (!(iMessage instanceof BALeadGenMessage)) {
            return;
        }
        BALeadGenMessage bALeadGenMessage = (BALeadGenMessage) iMessage;
        long j2 = bALeadGenMessage.opTime;
        if (j2 < this.LLJ) {
            return;
        }
        this.LLJ = j2;
        int i = bALeadGenMessage.op;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (slotViewModel2 = this.LLIZ) != null && (mutableLiveData7 = slotViewModel2.LLILZ) != null && Intrinsics.LJFF(mutableLiveData7.getValue(), Boolean.TRUE)) {
                        ((InterfaceC756510Tlx) this.LLJILJILJ.getValue()).LIZIZ(EnumC1108010ewJ.OTHERS);
                        return;
                    }
                    return;
                }
                IIconSlot.SlotViewModel slotViewModel3 = this.LLIZ;
                if (slotViewModel3 != null && (mutableLiveData6 = slotViewModel3.LLILZ) != null && Intrinsics.LJFF(mutableLiveData6.getValue(), Boolean.TRUE)) {
                    InterfaceC756510Tlx interfaceC756510Tlx = (InterfaceC756510Tlx) this.LLJILJILJ.getValue();
                    EnumC756450Tlr enumC756450Tlr = EnumC756450Tlr.LEADS_GEN_AUDIENCE;
                    int i2 = bALeadGenMessage.pinPeriod;
                    String str = bALeadGenMessage.cardTitle;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = bALeadGenMessage.cardIntro;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = bALeadGenMessage.cardButtonText;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    CommonMessageData commonMessageData = bALeadGenMessage.baseMessage;
                    if (commonMessageData != null) {
                        j = commonMessageData.createTime;
                    } else {
                        j = -2;
                    }
                    interfaceC756510Tlx.LIZ(C756490Tlv.LIZ(new C756500Tlw(enumC756450Tlr, i2, str, str3, str2, new C1107970ewF(j))), new C756570Tm3(this));
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel4 = this.LLIZ;
            if (slotViewModel4 == null || (mutableLiveData4 = slotViewModel4.LLILZ) == null || !Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) {
                return;
            }
            IIconSlot.SlotViewModel slotViewModel5 = this.LLIZ;
            if (slotViewModel5 != null && (mutableLiveData5 = slotViewModel5.LLILZ) != null) {
                mutableLiveData5.setValue(Boolean.FALSE);
            }
            ((InterfaceC756510Tlx) this.LLJILJILJ.getValue()).LIZIZ(EnumC1108010ewJ.OTHERS);
            return;
        }
        String strLIZ = C756590Tm5.LIZ(bALeadGenMessage.ctaText);
        this.LLJILJIL = strLIZ;
        IIconSlot.SlotViewModel slotViewModel6 = this.LLIZ;
        if (slotViewModel6 != null && (mutableLiveData3 = slotViewModel6.LLJILJILJ) != null) {
            mutableLiveData3.setValue(strLIZ);
        }
        this.LLJIJIL = bALeadGenMessage.schema;
        IIconSlot.SlotViewModel slotViewModel7 = this.LLIZ;
        if ((slotViewModel7 != null && (mutableLiveData2 = slotViewModel7.LLILZ) != null && Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE)) || (slotViewModel = this.LLIZ) == null || (mutableLiveData = slotViewModel.LLILZ) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @C14EU
    public final void openPolicyWebView(OpenBAPolicyWebViewEvent openBAPolicyWebViewEvent) {
        Context context;
        InterfaceC21213717zz interfaceC21213717zz = this.LLILZLL;
        if (interfaceC21213717zz != null && (context = interfaceC21213717zz.getContext()) != null) {
            C756190TlR.LIZ.getClass();
            C756190TlR.LIZ(context, openBAPolicyWebViewEvent);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        boolean z;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        String str;
        BaLeadsGenInfo baLeadsGenInfo;
        BaLeadsGenInfo baLeadsGenInfo2;
        String str2;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZLL = interfaceC21213717zz;
        this.LLIZ = slotViewModel;
        Room room = this.LLILZIL;
        if (room != null && (baLeadsGenInfo2 = room.baLeadsGenInfo) != null && (str2 = baLeadsGenInfo2.leadsGenModel) != null && str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        slotViewModel.LLILZ.setValue(Boolean.valueOf(z));
        slotViewModel.LLJ.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c6n)));
        slotViewModel.LLJI.setValue(LJJI(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.c6o)));
        Long lValueOf = null;
        if (z) {
            Gson gson = new Gson();
            Room room2 = this.LLILZIL;
            if (room2 != null && (baLeadsGenInfo = room2.baLeadsGenInfo) != null) {
                str = baLeadsGenInfo.leadsGenModel;
            } else {
                str = null;
            }
            BALeadsGenModel bALeadsGenModel = (BALeadsGenModel) GsonProtectorUtils.fromJson(gson, str, new TypeToken<BALeadsGenModel>() { // from class: X.0Tm8
            }.getType());
            if (bALeadsGenModel != null) {
                String strLIZ = C756590Tm5.LIZ(bALeadsGenModel.leadsGenText);
                this.LLJILJIL = strLIZ;
                slotViewModel.LLJILJILJ.setValue(strLIZ);
                this.LLJIJIL = bALeadsGenModel.leadsGenSchema;
                if (bALeadsGenModel.isPinned) {
                    InterfaceC756510Tlx interfaceC756510Tlx = (InterfaceC756510Tlx) this.LLJILJILJ.getValue();
                    EnumC756450Tlr enumC756450Tlr = EnumC756450Tlr.LEADS_GEN_AUDIENCE;
                    int i = bALeadsGenModel.pinPeriod;
                    String str3 = bALeadsGenModel.cardTitle;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = bALeadsGenModel.cardIntro;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = bALeadsGenModel.cardButtonText;
                    if (str5 == null) {
                        str5 = "";
                    }
                    interfaceC756510Tlx.LIZ(C756490Tlv.LIZ(new C756500Tlw(enumC756450Tlr, i, str3, str4, str5, new C1107970ewF(-1L))), new C756580Tm4(this));
                }
            }
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
            LifecycleOwner lifecycleOwner = interfaceC21213717zz.getLifecycleOwner();
            Room room3 = this.LLILZIL;
            if (room3 != null) {
                lValueOf = Long.valueOf(room3.getId());
            }
            interfaceC1012330cRzF4.LIZIZ(lifecycleOwner, slotViewModel, lValueOf);
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        String str;
        BaLeadsGenInfo baLeadsGenInfo;
        Object obj = map.get("param_room");
        Boolean boolValueOf = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILZIL = room;
        Object obj2 = map.get("param_enter_from_effect_ad_bool");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Boolean bool = Boolean.TRUE;
        this.LLJI = Integer.valueOf(Intrinsics.LJFF(obj2, bool) ? 1 : 0);
        Object obj3 = map.get("param_ad_ttclid");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        this.LLJILLL = str;
        Room room2 = this.LLILZIL;
        if (room2 != null && (baLeadsGenInfo = room2.baLeadsGenInfo) != null) {
            boolValueOf = Boolean.valueOf(baLeadsGenInfo.leadsGenPermission);
        }
        interfaceC756140TlM.LIZ(Intrinsics.LJFF(boolValueOf, bool));
    }
}
