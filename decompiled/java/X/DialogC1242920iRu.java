package X;

import Y.ARunnableS101S0100000_1;
import Y.AfS171S0100000_2;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dsp.api.MusicVipInfoApi;
import com.ss.android.ugc.aweme.dsp.subscribe.model.DspVipInfoResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1242920iRu extends DialogC19728412Gs {
    public C11JF LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final Map<String, String> LLILZLL;
    public long LLIZ;
    public C1390130mHL LLIZLLLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C1390130mHL c1390130mHL = this.LLIZLLLIL;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 0);
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO67c9HdyTAB4qNeiATTi59PpL+Xp7pYmURRhxvnB1o7PIkY", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        this.LLIZ = System.currentTimeMillis();
        super.onCreate(bundle);
        setContentView(R.layout.drb);
        C1390130mHL c1390130mHL = (C1390130mHL) findViewById(R.id.g2n);
        this.LLIZLLLIL = c1390130mHL;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 0);
        }
        setCanceledOnTouchOutside(false);
        final boolean zHasMusicDsp = C1889790zHF.LIZ.LIZ().hasMusicDsp();
        if (this.LLILLL == 1) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LJ("iap_region_check_settings", 1) != 1) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this);
                    c1389890mGx.LJIIIZ(2131857163);
                    c1389890mGx.LJIIJJI();
                    C2487409ou.LIZJ(new ARunnableS101S0100000_1(this, 77));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LL = (C11JF) C11NZ.LJJJJI(new Callable() { // from class: X.05XS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MusicDspLoadingDialog@ea10.onCreate$2");
                JSONObject jSONObject = new JSONObject();
                List<String> listLJLLJ = C13LP.LJLLJ(((LinkedHashMap) this.LL.LLILZLL).keySet());
                DialogC1242920iRu dialogC1242920iRu = this.LL;
                for (String str : listLJLLJ) {
                    try {
                        jSONObject.put(str, ((LinkedHashMap) dialogC1242920iRu.LLILZLL).get(str));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                this.LL.getClass();
                String strJ3 = C786410Ut5.J3(jSONObject);
                C1C7U.LIZIZ("MusicDspLoadingDialog@ea10.onCreate$2");
                return strJ3;
            }
        }).LJJJ(new InterfaceC1487280oo2() { // from class: X.0iRv
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str = (String) obj;
                DialogC1242920iRu dialogC1242920iRu = this.LL;
                int i = dialogC1242920iRu.LLILLJJLI;
                String str2 = dialogC1242920iRu.LLILZ;
                Boolean boolValueOf = Boolean.valueOf(dialogC1242920iRu.LLILZIL);
                boolean z = !zHasMusicDsp;
                MusicVipInfoApi.MusicVipInfoOperatorApi musicVipInfoOperatorApi = MusicVipInfoApi.LIZ;
                if (musicVipInfoOperatorApi == null) {
                    musicVipInfoOperatorApi = (MusicVipInfoApi.MusicVipInfoOperatorApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C359001aO.LIZ).create(MusicVipInfoApi.MusicVipInfoOperatorApi.class);
                    MusicVipInfoApi.LIZ = musicVipInfoOperatorApi;
                }
                return musicVipInfoOperatorApi.getVipInfo(i, str2, boolValueOf, Boolean.valueOf(z), str, null);
            }
        }, false).LJL(C11S5.LIZ()).LJLJI(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.03ty
            @Override // X.C09JN
            public final void accept(Object obj) {
                JSONObject jSONObject;
                String strOptString;
                C1C7U.LIZ("MusicDspLoadingDialog@ea10.onCreate$4");
                DspVipInfoResponse dspVipInfoResponse = (DspVipInfoResponse) obj;
                DialogC1242920iRu dialogC1242920iRu = this.LL;
                Context context = dialogC1242920iRu.getContext();
                String nextSchema = dspVipInfoResponse.getNextSchema();
                if (nextSchema != null && nextSchema.length() != 0) {
                    Uri uri = UriProtector.parse(nextSchema);
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    for (Map.Entry entry : ((LinkedHashMap) dialogC1242920iRu.LLILZLL).entrySet()) {
                        if (!queryParameterNames.contains(entry.getKey())) {
                            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    builderBuildUpon.appendQueryParameter("open_timestamp", String.valueOf(System.currentTimeMillis()));
                    nextSchema = builderBuildUpon.build().toString();
                }
                String logExtra = dspVipInfoResponse.getLogExtra();
                if (logExtra != null && logExtra.length() != 0) {
                    jSONObject = new JSONObject(logExtra);
                } else {
                    jSONObject = null;
                }
                SmartRouter.buildRoute(context, nextSchema).open();
                if (jSONObject == null || (strOptString = jSONObject.optString("call_to_action", "")) == null) {
                    strOptString = "";
                }
                dialogC1242920iRu.LJJLIIIJLLLLLLLZ(strOptString, dspVipInfoResponse.extra.logid, 1, dspVipInfoResponse.getNextSchema(), Boolean.valueOf(dspVipInfoResponse.isVip()));
                dialogC1242920iRu.dismiss();
                C785410UrT.LIZ(dialogC1242920iRu);
                C1C7U.LIZIZ("MusicDspLoadingDialog@ea10.onCreate$4");
            }
        }, new AfS171S0100000_2(this, 72));
    }

    public DialogC1242920iRu(Context context, Uri uri, Bundle bundle) {
        int iIntValue;
        Serializable serializable;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        super(context, R.style.kh);
        this.LLILZLL = new LinkedHashMap();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, Scene.SCENE_SERVICE);
        int iIntValue2 = 0;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILLJJLI = iIntValue;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "track_id");
        this.LLILZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null ? "" : strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        this.LLILZIL = uri.getBooleanQueryParameter("allow_play_full_song_in_tt", false);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "check_region");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        }
        this.LLILLL = iIntValue2;
        if (bundle != null) {
            serializable = bundle.getSerializable("store");
        } else {
            serializable = null;
        }
        boolean z = serializable instanceof TTMStoreLink;
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            this.LLILZLL.put(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
        }
    }

    public final void LJJLIIIJLLLLLLLZ(String str, String str2, int i, String str3, Boolean bool) {
        String str4;
        HashSet hashSet = new HashSet(C1697810uHb.LJIIJJI("enter_from", "enter_method", "item_id", "meta_song_id", "music_id", "upsell_reason"));
        HashMap map = new HashMap();
        if (str3 != null) {
            Uri uri = UriProtector.parse(str3);
            for (String str5 : UriProtector.getQueryParameterNames(uri)) {
                if (hashSet.contains(str5)) {
                    map.put(str5, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str5));
                    if (Intrinsics.LJFF("item_id", str5)) {
                        map.put("group_id", map.get(str5));
                    }
                }
            }
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("subscription_status", str4);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        new Object() { // from class: X.0iRx
        }.getClass();
        map.put("call_to_action", str);
        map.put("request_id", str2);
        map.put("loading_duration", String.valueOf(jCurrentTimeMillis));
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        C20684815ws.LJIILLIIL("group_click_loading_result", map);
    }
}
