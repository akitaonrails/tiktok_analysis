package X;

import Y.ACListenerS128S0200000_26;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;
import avg.f;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.business.billboard.datachannel.ECWatcherWaterMarkStateChannel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECWatcherWaterMark;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.notify.ILiveNotifyWidgetObserverService;
import com.ss.android.ugc.aweme.live.notify.LiveNotifyWidget;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0vDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733610vDL extends AbstractC21206917yt {
    public Room LLILLL;
    public DataChannel LLILZ;
    public final C1733640vDO LLILZIL;
    public C054G LLILZLL = C2296808zG.LIZ(C2126308Ur.LJFF);
    public ECWatcherWaterMark LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1733670vDR LLJI;
    public Map<String, ? extends Object> LLJIJIL;
    public C1733620vDM LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public Boolean LLJJI;
    public String LLJJIII;
    public String LLJJIJI;

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "ecommerce_live";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final boolean LLIZLLLIL() {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLJIJIL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        LJJI();
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        InterfaceC1733670vDR interfaceC1733670vDR = this.LLJI;
        if (interfaceC1733670vDR != null) {
            interfaceC1733670vDR.dispose();
        }
        this.LLJI = null;
        this.LLJ = false;
        C2296808zG.LIZJ(this.LLILZLL, null);
    }

    public final Map<String, String> LJJ() {
        C13DA c13da = new C13DA();
        String str = this.LLJILJILJ;
        if (str == null) {
            str = "";
        }
        c13da.put("enter_from_merge", str);
        String str2 = this.LLJILLL;
        if (str2 == null) {
            str2 = "";
        }
        c13da.put("enter_method", str2);
        String str3 = this.LLJJ;
        if (str3 == null) {
            str3 = "";
        }
        c13da.put("action_type", str3);
        c13da.put("is_ad", Intrinsics.LJFF(this.LLJJI, Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str4 = this.LLJJIII;
        c13da.put("request_id", str4 != null ? str4 : "");
        return c13da.build();
    }

    public final void LJJI() {
        String str;
        String str2;
        String str3;
        Image image;
        List<String> urls;
        String str4;
        Room room;
        CommerceStruct commerceStruct;
        String str5 = this.LLJJIJI;
        boolean z = (this.LLJ || (room = this.LLILLL) == null || (commerceStruct = room.getCommerceStruct()) == null || commerceStruct.commercePermission != 1 || str5 == null || str5.length() == 0 || !Intrinsics.LJFF(str5, this.LLIZLLLIL)) ? false : true;
        C1733640vDO c1733640vDO = this.LLILZIL;
        ECWatcherWaterMark eCWatcherWaterMark = z ? this.LLIZ : null;
        C1733620vDM c1733620vDM = c1733640vDO.LL;
        SmartImageView smartImageView = c1733620vDM.LLILLL;
        TextView textView = c1733620vDM.LLILZ;
        if (!c1733620vDM.LLILZIL || smartImageView == null || textView == null) {
            int visibility = c1733620vDM.getVisibility();
            c1733620vDM.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1733620vDM);
            return;
        }
        if (eCWatcherWaterMark == null || (str = eCWatcherWaterMark.title) == null || str.length() == 0 || eCWatcherWaterMark == null || (str2 = eCWatcherWaterMark.cSchema) == null || str2.length() == 0) {
            int visibility2 = c1733620vDM.getVisibility();
            c1733620vDM.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1733620vDM);
            return;
        }
        if (eCWatcherWaterMark == null || (str3 = eCWatcherWaterMark.title) == null) {
            str3 = "";
        }
        textView.setText(str3);
        if (eCWatcherWaterMark == null || (image = eCWatcherWaterMark.icon) == null || (urls = image.getUrls()) == null || (str4 = (String) C13LP.LJJJLL(urls)) == null || str4.length() == 0) {
            C786410Ut5.LLFF(8, smartImageView);
        } else {
            C19411510wz.LIZIZ(C19411510wz.LIZ, str4, EnumC1769850w9n.LIVE_USER_RIGHTS_WATER_MARK_ICON);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str4);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            C786410Ut5.LLFF(0, smartImageView);
        }
        View.OnClickListener aCListenerS128S0200000_26 = new ACListenerS128S0200000_26(eCWatcherWaterMark, c1733620vDM, 27);
        if (C1848410yCV.LIZ) {
            aCListenerS128S0200000_26 = new f(aCListenerS128S0200000_26);
        }
        a aVar = new a(aCListenerS128S0200000_26);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1733620vDM);
        }
        c1733620vDM.setOnClickListener(aVar);
        boolean z2 = c1733620vDM.getAlpha() >= 0.999f;
        c1733620vDM.setEnabled(z2);
        c1733620vDM.setClickable(z2);
        int visibility3 = c1733620vDM.getVisibility();
        c1733620vDM.setVisibility(0);
        C1602160rnK.LIZIZ(visibility3, 0, c1733620vDM);
        Function0<Unit> function0 = c1733620vDM.LL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_EC_WATCHER_WATERMARK;
    }

    public C1733610vDL(Context context) {
        this.LLILZIL = new C1733640vDO(context);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = viewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLILZLL = C2296808zG.LIZ(C2126308Ur.LJFF);
        C1733620vDM c1733620vDM = this.LLILZIL.LL;
        if (!(c1733620vDM instanceof C1733620vDM)) {
            c1733620vDM = null;
        }
        this.LLJILJIL = c1733620vDM;
        if (c1733620vDM != null) {
            c1733620vDM.setOnWaterMarkShown(new AwS570S0100000_26(this, 1501));
            c1733620vDM.setOnWaterMarkClicked(new AwS570S0100000_26(this, 1502));
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.DQ2(ECWatcherWaterMarkStateChannel.class, this, new AwS605S0100000_26(this, 735));
        }
        List<? extends LiveNotifyWidget> listLJIIJJI = C1697810uHb.LJIIJJI(LiveNotifyWidget.BANNER, LiveNotifyWidget.MID_TOUCH);
        DataChannel dataChannel2 = this.LLILZ;
        if (dataChannel2 != null) {
            InterfaceC1733670vDR interfaceC1733670vDR = this.LLJI;
            if (interfaceC1733670vDR != null) {
                interfaceC1733670vDR.dispose();
            }
            this.LLJI = null;
            ILiveNotifyWidgetObserverService iLiveNotifyWidgetObserverService = (ILiveNotifyWidgetObserverService) PluggableExtentionKt.pluggableSpi$default(ILiveNotifyWidgetObserverService.class, false, false, false, 14, null);
            if (iLiveNotifyWidgetObserverService == null) {
                this.LLJ = false;
                LJJI();
            } else {
                this.LLJI = iLiveNotifyWidgetObserverService.observeNotifyWidgets(dataChannel2, listLJIIJJI, new AwS605S0100000_26(this, 736));
            }
        }
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        Room room;
        DataChannel dataChannel;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String requestId;
        String idStr;
        boolean z;
        String str4;
        Type type;
        CommerceStruct commerceStruct;
        CommerceStruct commerceStruct2;
        Object obj = map.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LLILLL = room;
        Object obj2 = map.get("param_data_channel");
        if (obj2 instanceof DataChannel) {
            dataChannel = (DataChannel) obj2;
        } else {
            dataChannel = null;
        }
        this.LLILZ = dataChannel;
        Object obj3 = map.get("param_live_enter_from_merge");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        this.LLJILJILJ = str;
        Object obj4 = map.get("param_live_enter_method_merge");
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        } else {
            str2 = null;
        }
        this.LLJILLL = str2;
        Object obj5 = map.get("param_live_action_type");
        if (obj5 instanceof String) {
            str3 = (String) obj5;
        } else {
            str3 = null;
        }
        this.LLJJ = str3;
        Object obj6 = map.get("param_enter_from_effect_ad_bool");
        if (obj6 instanceof Boolean) {
            bool = (Boolean) obj6;
        } else {
            bool = null;
        }
        this.LLJJI = bool;
        Room room2 = this.LLILLL;
        if (room2 != null) {
            requestId = room2.getRequestId();
        } else {
            requestId = null;
        }
        this.LLJJIII = requestId;
        Room room3 = this.LLILLL;
        if (room3 != null) {
            idStr = room3.getIdStr();
        } else {
            idStr = null;
        }
        this.LLJJIJI = idStr;
        Room room4 = this.LLILLL;
        if (room4 != null && (commerceStruct2 = room4.getCommerceStruct()) != null && commerceStruct2.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        Room room5 = this.LLILLL;
        if (room5 != null && (commerceStruct = room5.getCommerceStruct()) != null) {
            str4 = commerceStruct.oecInitDataString;
        } else {
            str4 = null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
            } else {
                type = new TypeToken<OecInitData>() { // from class: X.0vDN
                }.getType();
            }
            if (!(GsonProtectorUtils.fromJson(gsonLJFF, str4, type) instanceof OecInitData)) {
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJIJIL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        LJJI();
        interfaceC756140TlM.LIZ(z);
    }
}
