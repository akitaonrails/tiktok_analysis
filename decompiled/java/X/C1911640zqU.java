package X;

import Y.ACallableS431S0100000_28;
import Y.ACallableS73S1100000_28;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911640zqU {
    public static String LIZIZ;
    public static Map<String, PromoteReplaceMusicRequest> LIZJ;
    public static boolean LJI;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static final C1911640zqU LIZ = new C1911640zqU();
    public static final Map<String, C15O7<SuggestMusicList>> LIZLLL = new HashMap();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1646));
    public static final Keva LJFF = Keva.getRepo("promote_replace_music_keva");
    public static PromoteReplaceMusicRequest LJII = new PromoteReplaceMusicRequest();
    public static String LJIIIIZZ = "";
    public static final C1911690zqZ LJIIIZ = new InterfaceC486470J5x() { // from class: X.0zqZ
        @Override // X.InterfaceC486470J5x
        public final void LIZIZ(WsChannelMsg wsChannelMsg) {
            Object c098200Yq;
            try {
                JSONObject jSONObject = new JSONObject(new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
                boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "success");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "item_id");
                C1911640zqU.LIZ.getClass();
                if (string != null && z) {
                    C1440005kM.LIZ(new C1911700zqa(string));
                }
                ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).showWindow(jSONObject, z);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C2344809Gs.LJI(thM5exceptionOrNullimpl);
            }
        }
    };
    public static int LJIIL = -1;

    public static Map LIZIZ() {
        try {
            String string = LJFF.getString("promote_replace_music_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (Map) InterfaceC1201180hMa.LJLLLL.LJIIIIZZ(string, new TypeToken<Map<String, PromoteReplaceMusicRequest>>() { // from class: X.0zqW
                }.getType());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PromoteReplaceMusic getLocalData Exception: ");
            sbLIZ.append(e);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            C2344809Gs.LJI(e);
        }
        return null;
    }

    public static final void LJFF() {
        LJII = new PromoteReplaceMusicRequest();
        LJI = false;
        LJIIJ = false;
    }

    public static final boolean LJI() {
        C15MA c15ma = C15MA.LL;
        return C15MA.LIZLLL() && LJIIJJI;
    }

    public static final int LJII() {
        C15MA c15ma = C15MA.LL;
        if (C15MA.LIZLLL()) {
            return LJIIL;
        }
        return -1;
    }

    public static final void LJIILIIL() {
        C2203431BLp.LIZIZ.LJIIIZ(LJIIIZ);
    }

    public static final C15O7<SuggestMusicList> LIZJ(String str) {
        String str2;
        C15O7<SuggestMusicList> c15o7 = (C15O7) ((HashMap) LIZLLL).get(str);
        if (c15o7 != null && c15o7.LJIIL() != null) {
            str2 = "Succeed";
        } else {
            str2 = "Failed";
        }
        if (!LJIIJ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
            C20684815ws.LJIILLIIL("Promote_prefetch_response_status", c2344009Gk.LIZ);
            LJIIJ = true;
        }
        if (c15o7 == null || c15o7.LJIILIIL() || c15o7.LJIILL() || c15o7.LJIIL() == null) {
            return null;
        }
        return c15o7;
    }

    public static final PromoteReplaceMusicRequest LIZLLL(String str) {
        Map<String, PromoteReplaceMusicRequest> mapLIZIZ = LIZJ;
        if (mapLIZIZ == null && (mapLIZIZ = LIZIZ()) == null) {
            return null;
        }
        return mapLIZIZ.get(str);
    }

    public static final boolean LJ(String str) {
        if (str == null) {
            return false;
        }
        Map<String, PromoteReplaceMusicRequest> mapLIZIZ = LIZJ;
        if ((mapLIZIZ == null && (mapLIZIZ = LIZIZ()) == null) || !mapLIZIZ.containsKey(str)) {
            return false;
        }
        return true;
    }

    public static final void LJIIIIZZ(boolean z) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, z ? 1 : 0);
        iEventCenter.LIZ("promote_video_visibility_result", C786410Ut5.J3(jSONObject));
    }

    public static final void LJIIJJI(Uri uri) {
        int iIntValue;
        Integer numLJIIJJI;
        Integer num;
        Integer num2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "item_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return;
        }
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_account_type");
        if ((objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter instanceof Integer) && (num2 = (Integer) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) != null) {
            num2.intValue();
        }
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "new_user");
        if ((objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 instanceof Integer) && (num = (Integer) objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) != null) {
            num.intValue();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "music_replace_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = -1;
        }
        LJIIL = iIntValue;
        LJIIJJI = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "new_version"), "1");
        LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public final void LIZ(String str) {
        Map mapLIZIZ;
        if (!LJ(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_promote_replace_music_request_sava_time");
        long j = 60;
        if ((((jCurrentTimeMillis - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / j) / j >= ((Number) LJ.getValue()).intValue() && (mapLIZIZ = LIZIZ()) != null) {
            C19719512Dh.LIZJ(mapLIZIZ).remove(str);
            C15O7.LIZJ(new ACallableS73S1100000_28(mapLIZIZ, null, 4));
        }
    }

    public static final C15O7<Integer> LJIIIZ(PromoteReplaceMusicRequest promoteReplaceMusicRequest, Context context) {
        if (a0.LJJJIL(promoteReplaceMusicRequest.getItemID())) {
            return C15O7.LJIIJ(-2);
        }
        if (LIZJ == null) {
            LIZJ = Collections.synchronizedMap(new HashMap());
        }
        Map<String, PromoteReplaceMusicRequest> map = LIZJ;
        if (map != null) {
            map.put(promoteReplaceMusicRequest.getItemID(), promoteReplaceMusicRequest);
        }
        Map<String, PromoteReplaceMusicRequest> map2 = LIZJ;
        String itemID = promoteReplaceMusicRequest.getItemID();
        if (map2 != null) {
            C15O7.LIZJ(new ACallableS73S1100000_28(map2, itemID, 4));
        }
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        C1911690zqZ c1911690zqZ = LJIIIZ;
        c2203431BLp.LJI(20216, 1, c1911690zqZ);
        c2203431BLp.LJI(20173, 1, c1911690zqZ);
        return C15O7.LIZJ(new ACallableS431S0100000_28(promoteReplaceMusicRequest, 34)).LJ(new C19335210kg(context, promoteReplaceMusicRequest, 2), C15O7.LJIIIIZZ, null);
    }

    public static final C15O7<SuggestMusicList> LJIIJ(String str, String str2) {
        int i;
        C15O7 c15o7;
        if (str == null || str2 == null) {
            return null;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = (HashMap) LIZLLL;
        if (map.get(str) != null && (c15o7 = (C15O7) map.get(str)) != null && c15o7.LJIIL() != null) {
            i = 1;
        } else {
            map.put(str, ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJL(str, str2));
            C15O7 c15o72 = (C15O7) map.get(str);
            if (c15o72 != null) {
                c15o72.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0zqV
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o73) {
                        C1C7U.LIZ("PromoteReplaceMusicManager@8b4f.preloadRecMusicList$1");
                        if (!c15o73.LJIILL() && c15o73.LJIILJJIL()) {
                            if (c15o73.LJIIL() != null) {
                                C1911640zqU c1911640zqU = C1911640zqU.LIZ;
                                long j = jCurrentTimeMillis;
                                c1911640zqU.getClass();
                                C1911640zqU.LJIIL(j, true);
                            } else {
                                C1911640zqU c1911640zqU2 = C1911640zqU.LIZ;
                                long j2 = jCurrentTimeMillis;
                                c1911640zqU2.getClass();
                                C1911640zqU.LJIIL(j2, false);
                            }
                        } else {
                            C1911640zqU c1911640zqU3 = C1911640zqU.LIZ;
                            long j3 = jCurrentTimeMillis;
                            c1911640zqU3.getClass();
                            C1911640zqU.LJIIL(j3, false);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PromoteReplaceMusicManager@8b4f.preloadRecMusicList$1");
                        return unit;
                    }
                });
            }
            i = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "have_cache");
        C20684815ws.LJIILLIIL("Promote_music_prefetch", c2344009Gk.LIZ);
        return (C15O7) map.get(str);
    }

    public static void LJIIL(long j, boolean z) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis - j, "duration");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("Promote_music_prefetch_result", c2344009Gk.LIZ);
    }
}
