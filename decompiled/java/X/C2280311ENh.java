package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ENh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280311ENh extends C09AY implements Function0<C1363790lar> {
    public C2280311ENh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lar] */
    @Override // kotlin.jvm.functions.Function0
    public final C1363790lar invoke() {
        return new InterfaceC1367800lhK() { // from class: X.0lar
            @Override // X.InterfaceC1367800lhK
            public final void LIZ() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_ACTION.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LIZIZ() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd == null || c2096308Jd.contains((Object) Integer.valueOf(EnumC1362640lZ0.CLICK_SEARCH.getValue()))) {
                    return;
                }
                C2096308Jd c2096308Jd2 = C1362630lYz.LIZIZ;
                if (c2096308Jd2 != null) {
                    c2096308Jd2.report();
                }
                C1362630lYz.LIZIZ = null;
            }

            @Override // X.InterfaceC1367800lhK
            public final void LIZJ() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_REPOST.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LIZLLL() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_CHANNEL.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJFF() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SLIDE_ACTION.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJI() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SLIDE_CHANNEL.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJII() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_OUTSIDE.getValue()));
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIJ() {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = new C2096308Jd();
                C1362630lYz.LIZIZ = c2096308Jd;
                c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_SHARE_ICON.getValue()));
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIIJ() {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJFF++;
                C1364620lcC.LJI++;
            }

            @Override // X.InterfaceC1367800lhK
            public final C1361580lXI LJJIJ() {
                return new C1361580lXI();
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIILJJIL(InterfaceC1493105sv interfaceC1493105sv) {
                interfaceC1493105sv.sendEvent("social_avatar_invite_dm_banner", C2097908Jt.LIZJ(new Pair("action_type", "close")));
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIILL(long j) {
                C1363780laq.LIZ.getClass();
                C1363780laq.LIZIZ = new C1363800las(j, -1L, -1L, -1L, -1L, -1L);
                C1363780laq.LIZJ = 0;
                C1363780laq.LIZLLL = false;
                C1363780laq.LJ = false;
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIJI(InterfaceC1493105sv interfaceC1493105sv) {
                interfaceC1493105sv.sendEvent("social_avatar_invite_dm_banner", C2097908Jt.LIZJ(new Pair("action_type", "show")));
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIJJ(long j) {
                C1363780laq.LIZ.getClass();
                C1363800las c1363800las = C1363780laq.LIZIZ;
                if (c1363800las != null) {
                    C1363780laq.LIZIZ = C1363800las.LIZ(c1363800las, j, 0L, 0L, 0L, 61);
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIJJLI(SharePackage sharePackage) {
                C1367430lgj c1367430lgj = C1367430lgj.LIZ;
                c1367430lgj.getClass();
                C1367430lgj.LJFF(c1367430lgj, "click", sharePackage, null);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIIJZLJL(SharePackage sharePackage) {
                C1367430lgj.LIZ.LJIIIIZZ(sharePackage, null);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIL(SharePackage sharePackage, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIJ(sharePackage, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIILIIL(String str, String str2) throws JSONException {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJII = true;
                C1364620lcC.LIZJ = System.currentTimeMillis();
                C1364620lcC.LIZLLL = 0;
                C1364620lcC.LJ = 0;
                C1364620lcC.LJFF = 0;
                C1364620lcC.LJI = 0;
                C0I0B.LJFF.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", str);
                jSONObject.put("enter_from", str2);
                jSONObject.put(Scene.SCENE_SERVICE, "share_panel");
                jSONObject.put("local_ready", true);
                C20684815ws.LJIJ("social_search_session_start", jSONObject);
            }

            @Override // X.InterfaceC1367800lhK
            public final String LJIL(IMContact iMContact, String str) {
                C1364620lcC.LIZ.getClass();
                return C1364620lcC.LIZJ(iMContact, str);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIFFI(SharePackage sharePackage, IMContact iMContact) {
                C1367430lgj.LJIIIZ(C1367430lgj.LIZ, sharePackage, iMContact, true);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIJJI(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIIL("vertical", str, str2, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIJIIJI(SharePackage sharePackage, IMContact iMContact, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIILLIIL(sharePackage, iMContact, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIZILJ(long j, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIILL(j, interfaceC1493105sv, str, str2);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIII(int i, String str, String str2, String str3) throws JSONException {
                C1364620lcC.LIZ.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - C1364620lcC.LIZJ;
                C0I0B.LJFF.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", str);
                jSONObject.put("session_impr_id", i);
                jSONObject.put("enter_from", str2);
                jSONObject.put(Scene.SCENE_SERVICE, "share_panel");
                jSONObject.put("search_keyword", str3);
                jSONObject.put("duration", jCurrentTimeMillis);
                jSONObject.put("selection_count", C1364620lcC.LIZLLL);
                jSONObject.put("deselection_count", C1364620lcC.LJ);
                jSONObject.put("query_count", C1364620lcC.LJFF);
                jSONObject.put("impr_count", C1364620lcC.LJI);
                C20684815ws.LJIJ("social_search_session_summary", jSONObject);
                C1364620lcC.LJII = false;
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIIZI(SharePackage sharePackage, BaseContent baseContent, int i, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJJ(sharePackage, baseContent, i, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJ(SharePackage sharePackage, IMContact iMContact, long j, InterfaceC1493505sz interfaceC1493505sz, int i) {
                C1364620lcC.LIZ.getClass();
                C1364590lc9.LIZ.getClass();
                C1364590lc9.LJFF(sharePackage, iMContact, false, "chat", j, interfaceC1493505sz, i);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIIZ(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("message_category", str);
                c830490Whz.put("to_user_id", str3);
                c830490Whz.put("conversation_id", str2);
                c830490Whz.put("from_user_id", str4);
                interfaceC1493105sv.sendEvent("message_forward", c830490Whz);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIIZ(SharePackage sharePackage, int i, String str, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIIJ(sharePackage, i, str, map, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIIIZZ(IMContact iMContact, int i, int i2, String str, String str2, String str3) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIJJ(iMContact, i, i2, str, str2, "social_search_result_show", str3);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIILLIIL(SharePackage sharePackage, String str, List<? extends IMContact> list, long j, InterfaceC1493105sv interfaceC1493105sv, int i) {
                C1364590lc9.LIZ.getClass();
                C1364590lc9.LIZLLL(sharePackage, str, list, j, interfaceC1493105sv, i);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJI(SharePackage sharePackage, int i, String str, boolean z, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
                C1364620lcC.LIZ.getClass();
                C1364620lcC.LJIIIIZZ(sharePackage, i, str, z, map, interfaceC1493105sv);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJII(SharePackage sharePackage, IMContact iMContact, String str, long j, InterfaceC1493105sv interfaceC1493105sv, InterfaceC882700Yk0 interfaceC882700Yk0) {
                C1367430lgj.LIZ.getClass();
                C1367430lgj.LIZLLL(sharePackage, iMContact, false, str, j, interfaceC1493105sv, interfaceC882700Yk0);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJIIJ(IMContact iMContact, int i, SharePackage sharePackage, boolean z, String str, InterfaceC1493105sv interfaceC1493105sv, Map map) {
                C1364620lcC.LJIILIIL(iMContact, i, "column", sharePackage, z, str, interfaceC1493105sv, map);
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJ(IMContact iMContact, int i, int i2, String str, String str2, boolean z, String str3) {
                C1364620lcC.LIZ.getClass();
                if (z) {
                    C1364620lcC.LIZLLL++;
                    C1364620lcC.LJIJJ(iMContact, i, i2, str, str2, "social_search_result_select", str3);
                } else {
                    C1364620lcC.LJ++;
                }
            }

            @Override // X.InterfaceC1367800lhK
            public final void LJJIJIIJIL(String str, String str2, String str3, Integer num, Boolean bool, Double d, Double d2, int i, String str4) throws JSONException {
                C1364620lcC.LIZ.getClass();
                C0I0B.LJFF.LIZIZ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", str);
                jSONObject.put("session_impr_id", i);
                jSONObject.put("enter_from", str2);
                if (str4.length() <= 0) {
                    str4 = "click";
                }
                jSONObject.put("enter_method", str4);
                jSONObject.put(Scene.SCENE_SERVICE, "share_panel");
                jSONObject.put("search_keyword", str3);
                Object obj = num;
                if (num == null) {
                    obj = "";
                }
                jSONObject.put("candidates_count", obj);
                Object obj2 = bool;
                if (bool == null) {
                    obj2 = "";
                }
                jSONObject.put("finished", obj2);
                Object obj3 = d;
                if (d == null) {
                    obj3 = "";
                }
                jSONObject.put("matching_duration", obj3);
                Object obj4 = d2;
                if (d2 == null) {
                    obj4 = "";
                }
                jSONObject.put("ranking_duration", obj4);
                C20684815ws.LJIJ("social_search_client_performance", jSONObject);
            }
        };
    }
}
