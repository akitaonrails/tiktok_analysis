package X;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveInnerWatchHistoryExtraCountSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0Ic9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470150Ic9 extends AbstractC470040Iby implements InterfaceC1141530foN {
    public FrameLayout LLJJJJJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJLIIL;
    public long LLJJL;

    @Override // X.AbstractC470040Iby
    public final int LJIIZILJ() {
        return -1;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final View LJIIIIZZ() {
        if (this.LL == null) {
            C20441214yg.LJ("PromoteLynxVariantCard", "Context is null, cannot create view");
            return new View(this.LL);
        }
        try {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL).cloneInContext(new ContextThemeWrapper(this.LL, C011Z.LIZ.LJ())), R.layout.hju, null, false);
            C20441214yg.LIZIZ("PromoteLynxVariantCard", "Lynx view created successfully");
            return viewTd;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("PromoteLynxVariantCard", "Failed to inflate lynx view", e);
            return new View(this.LL);
        }
    }

    @Override // X.AbstractC470040Iby
    public final String LJIILLIIL() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return null;
        }
        return LJIJI() ? encourageGoLiveCard.lynxBgMusic : encourageGoLiveCard.bgMusicUrl;
    }

    @Override // X.AbstractC470040Iby
    public final boolean LJJI() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return false;
        }
        if (LJIJI()) {
            return ((((int) encourageGoLiveCard.lynxModuleUse) & 4) == 4) && (encourageGoLiveCard.lynxBgMusic.length() > 0);
        }
        int i = encourageGoLiveCard.style;
        return i == 0 || i == 2 || i == 4;
    }

    @Override // X.AbstractC470040Iby
    public final boolean LJJIFFI() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return false;
        }
        if (LJIJI()) {
            return ((((int) encourageGoLiveCard.lynxModuleUse) & 2) == 2) && (encourageGoLiveCard.lynxBgImg.length() > 0);
        }
        return encourageGoLiveCard.style == 4;
    }

    @Override // X.AbstractC470040Iby
    public final boolean LJJII() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return false;
        }
        if (LJIJI()) {
            return ((((int) encourageGoLiveCard.lynxModuleUse) & 8) == 8) && (encourageGoLiveCard.lynxBgVideo.length() > 0);
        }
        return encourageGoLiveCard.style == 1;
    }

    public final JSONObject LJJIIJ() {
        int value = LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue();
        JSONObject jSONObject = new JSONObject();
        String str = this.LLILZIL;
        if (str == null) {
            str = "";
        }
        jSONObject.put("enter_from", str);
        String str2 = this.LLILZLL;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("request_id", str2);
        jSONObject.put("extra", C018Q.LIZ(value));
        jSONObject.put("card_category", "golive_promo_card");
        String str3 = this.LLILZIL;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("enter_from_merge", str3);
        String str4 = this.LLIZ;
        jSONObject.put("enter_method", str4 != null ? str4 : "");
        jSONObject.put("room_position", String.valueOf(this.LLIZLLLIL));
        return jSONObject;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZIZ() {
        super.LIZIZ();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJLIIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C1548820qPI.LJIIIIZZ("live_insert_lynx_card", this);
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LIZIZ(encourageGoLiveCard.templateSchema, encourageGoLiveCard.templateBizId, null);
        }
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZJ() throws JSONException {
        super.LIZJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "client_show");
        jSONObject.put("log_params", LJJIIJ());
        C389001fE.LIZ("live_insert_lynx_card", jSONObject, System.currentTimeMillis(), false);
    }

    @Override // X.AbstractC470040Iby
    public final void LJJ(View view) {
        Object c098200Yq;
        Object c098200Yq2;
        int iLIZLLL;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return;
        }
        int i = encourageGoLiveCard.style;
        Object obj = null;
        if (i != 0 && i != 2) {
            if (i != 4) {
                try {
                    if (LJIJI() && encourageGoLiveCard.lynxBgColor.length() > 0) {
                        iLIZLLL = Color.parseColor(encourageGoLiveCard.lynxBgColor);
                    } else if (encourageGoLiveCard.videoBgColor.length() > 0) {
                        iLIZLLL = Color.parseColor(encourageGoLiveCard.videoBgColor);
                    } else {
                        iLIZLLL = C497740JfY.LIZLLL(R.attr.exg, this.LL);
                    }
                    c098200Yq2 = Integer.valueOf(iLIZLLL);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    view.setBackgroundColor(num.intValue());
                    return;
                }
                return;
            }
            return;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(encourageGoLiveCard.pictures.get(0).bgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            view.setBackgroundColor(num2.intValue());
        }
    }

    public final void LJJIII(SparkContext sparkContext) {
        String str = this.LLILZIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sparkContext.LJJJZ("enter_from", str);
        String str3 = this.LLILZLL;
        if (str3 != null) {
            str2 = str3;
        }
        sparkContext.LJJJZ("request_id", str2);
        sparkContext.LJJJZ("extra", C018Q.LIZ(LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue()));
        sparkContext.LJJJZ("roma_enable_with_param", "1");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        String string;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_insert_lynx_card") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (string = interfaceC1107590evd.getString("position")) == null) {
            return;
        }
        switch (string.hashCode()) {
            case -701740491:
                if (string.equals("not_interested")) {
                    LJIIL();
                }
                break;
            case 192490979:
                string.equals("go_live");
                break;
            case 1071305029:
                if (string.equals("notify_later_v2")) {
                    LJIILJJIL();
                }
                break;
            case 1805476374:
                if (string.equals("notify_later")) {
                    LJIILIIL();
                }
                break;
        }
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LJII(View view, Bundle bundle) throws JSONException {
        InterfaceC470090Ic3 interfaceC470090Ic3LIZ;
        Object objValueOf;
        boolean z;
        boolean z2;
        C1324720kZq c1324720kZq;
        String str;
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext;
        Object obj;
        JSONObject jSONObject;
        String strOptString;
        SparkSchemaParam sparkSchemaParamLJJJI;
        C20441214yg.LIZIZ("PromoteLynxVariantCard", "onViewCreated");
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            C20441214yg.LJ("PromoteLynxVariantCard", "Card data is null in onViewCreated");
            return;
        }
        this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.h46);
        EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
        boolean z3 = true;
        if (encourageGoLiveCard2 != null) {
            String str2 = encourageGoLiveCard2.templateSchema;
            Context context = this.LL;
            if (context != null) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1051630dTN c1051630dTNLJI = C1537060q6K.LJI(encourageGoLiveCard2.templateBizId);
                InterfaceC1105930esx interfaceC1105930esxLIZJ = C1537060q6K.LIZJ(context, str2, encourageGoLiveCard2.templateBizId);
                if (interfaceC1105930esxLIZJ != null && (c1051630dTNLJI == null || c1051630dTNLJI.LIZ() != 1 || !((C1097680efe) c1051630dTNLJI).LJJ || ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZJ).LLJLILLLLZIIL != EnumC1538460q8a.FAIL)) {
                    if (interfaceC1105930esxLIZJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZJ;
                    } else {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
                    }
                    this.LLJJJJLIIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                    } else {
                        sparkContext = null;
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJJJLIIL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                        if (sparkContext != null) {
                            C1529880puk c1529880puk = SparkContext.Companion;
                            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
                        } else {
                            sparkSchemaParamLJJJI = null;
                        }
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJIIJIL(sparkContext, sparkSchemaParamLJJJI);
                    }
                    if (sparkContext != null) {
                        LJJIII(sparkContext);
                        sparkContext.LJJJJZI(new C470180IcC(this, true));
                        try {
                            String str3 = sparkContext.initData;
                            if (str3 != null && (strOptString = new JSONObject(str3).optString("log_params")) != null) {
                                jSONObject = new JSONObject(strOptString);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            JSONObject jSONObjectLJJIIJ = LJJIIJ();
                            Iterator<String> itKeys = jSONObjectLJJIIJ.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject.put(next, jSONObjectLJJIIJ.get(next));
                            }
                            C189200o6.m2constructorimpl(jSONObject);
                            obj = jSONObject;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj = c098200Yq;
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                        Object obj2 = obj;
                        if (thM5exceptionOrNullimpl != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("extra", encourageGoLiveCard2.extra);
                            jSONObject2.put("log_params", C786410Ut5.J3(LJJIIJ()));
                            obj2 = jSONObject2;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        C20441214yg.LIZIZ("PromoteLynxVariantCard", "loadSparkView: withInitData (cache) log_params=" + jSONObject3);
                        sparkContext.initData = C786410Ut5.J3(jSONObject3);
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLJJJJLIIL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LJJIJL(sparkContext);
                        }
                    }
                }
                if (this.LLJJJJLIIL == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("schema: ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ));
                    IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                    AwS443S0200000_7 awS443S0200000_7 = new AwS443S0200000_7(this, encourageGoLiveCard2, 21);
                    i = -1;
                    this.LLJJJJLIIL = iHybridContainerService.Vn2(context, str2, null, "INNTER_GO_LIVE_PROMOTE", true, awS443S0200000_7);
                } else {
                    i = -1;
                }
            } else {
                i = -1;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLJJJJLIIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null && C0J39.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadSparkView: refreshAfterReused log_params=");
                sbLIZ2.append(LJJIIJ());
                C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LLJJJJLIIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null) {
                    C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5);
                }
            }
            try {
                FrameLayout frameLayout = this.LLJJJJJIL;
                if (frameLayout != null) {
                    frameLayout.addView(this.LLJJJJLIIL, i, i);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("PromoteLynxVariantCard", "Failed to add sparkView to container", e);
            }
        }
        LJJ(view);
        if (LJJIFFI() && (c1324720kZq = (C1324720kZq) view.findViewById(R.id.lcz)) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            if (LJIJI()) {
                str = encourageGoLiveCard.lynxBgImg;
            } else {
                str = encourageGoLiveCard.bgImgUrl;
            }
            interfaceC470090Ic3LIZ = null;
            LJIJJ(str, c1324720kZq, null);
        } else {
            interfaceC470090Ic3LIZ = null;
        }
        if (LJJII()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onViewCreated: withVideoBg=true, videoUrl=");
            String str4 = encourageGoLiveCard.videoUrl;
            if (str4 != null) {
                if (str4.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objValueOf = Boolean.valueOf(z2);
            } else {
                objValueOf = interfaceC470090Ic3LIZ;
            }
            sbLIZ3.append(objValueOf);
            sbLIZ3.append(", bgVideoView=");
            if (this.LLJJJJ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ3.append(z);
            C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
            TextureView textureView = (TextureView) view.findViewById(R.id.video_bg);
            if (textureView != null) {
                C470070Ic1 c470070Ic1 = this.LLJ;
                if (c470070Ic1 != null) {
                    interfaceC470090Ic3LIZ = c470070Ic1.LIZ(textureView, encourageGoLiveCard.videoLength, encourageGoLiveCard.videoUrl);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onViewCreated: bgVideoPlayer created=$");
                if (interfaceC470090Ic3LIZ == null) {
                    z3 = false;
                }
                sbLIZ4.append(z3);
                C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                C20441214yg.LJ("PromoteLynxVariantCard", "onViewCreated: bgVideoView is null, cannot create bgVideoPlayer");
            }
        }
        if (LJJI()) {
            this.LLJJJIL = (FrameLayout) view.findViewById(R.id.ci6);
        }
        C1548820qPI.LIZLLL("live_insert_lynx_card", this);
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZ(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Room room) {
        String str;
        super.LIZ(context, lifecycleOwner, dataChannel, room);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lynx card initialized, cardId=");
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        Integer numValueOf = null;
        if (encourageGoLiveCard != null) {
            str = encourageGoLiveCard.cardId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", style=");
        EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
        if (encourageGoLiveCard2 != null) {
            numValueOf = Integer.valueOf(encourageGoLiveCard2.style);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ));
    }
}
