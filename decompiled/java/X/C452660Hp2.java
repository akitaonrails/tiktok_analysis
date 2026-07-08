package X;

import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.api.IMShortLinkApi;
import com.ss.android.ugc.aweme.im.api.ShortLinkConversionResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.util.CommonParamInterceptor;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.tiktoklinkvideo.IMTiktokLinkImpl$getLongLinkFromShortLink$2", f = "IMTiktokLinkImpl.kt", l = {77}, m = "invokeSuspend")
public final class C452660Hp2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452660Hp2(String str, InterfaceC1364105Vn<? super C452660Hp2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452660Hp2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C1C7U.LIZ("IMTiktokLinkImpl@573f.getLongLinkFromShortLink$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1494160oz8 c1494160oz8 = new C1494160oz8();
                c1494160oz8.LJIIJJI = 2;
                C0I0B c0i0b = C0I0B.LJFF;
                InterfaceC2661011f interfaceC2661011fLIZ = ((C1566106Bf) c0i0b.LIZLLL()).LIZ("tiktok/v1/", true);
                c0i0b.LIZLLL();
                Retrofit retrofitLIZ = C1499670p81.LIZIZ.LIZ(interfaceC2661011fLIZ);
                if (retrofitLIZ != null) {
                    retrofitLIZ.LJIIIIZZ.clear();
                    retrofitLIZ.LJIIIIZZ.add(CommonParamInterceptor.LL);
                }
                IMSaasHostOfflineDebugService.LIZ.getClass();
                IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
                String str3 = "";
                if (iMSaasHostOfflineDebugServiceLIZIZ != null) {
                    iMSaasHostOfflineDebugServiceLIZIZ.LJIJJ();
                    str = "";
                } else {
                    str = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    linkedHashMap.put("x-tt-env", str);
                    linkedHashMap.put("x-use-ppe", "1");
                }
                IMChatRoomApi.LIZ.getClass();
                IMChatRoomApi iMChatRoomApiLIZ = C454410Hrr.LIZ();
                if (iMChatRoomApiLIZ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1477405qO.LIZ());
                    sbLIZ.append("im/trans_url/");
                    String strLIZLLL = iMChatRoomApiLIZ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    if (strLIZLLL != null) {
                        str3 = strLIZLLL;
                    }
                }
                linkedHashMap.put("Cookie", str3);
                IMShortLinkApi iMShortLinkApi = (IMShortLinkApi) ((TTRetrofit) interfaceC2661011fLIZ).retrofit.LIZ(IMShortLinkApi.class);
                String str4 = this.LLILLJJLI;
                this.LL = 1;
                obj = iMShortLinkApi.convertShortUrlToLongUrl(linkedHashMap, str4, c1494160oz8, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMTiktokLinkImpl@573f.getLongLinkFromShortLink$2");
                    return objLJFF;
                }
            }
            String str5 = ((ShortLinkConversionResponse) obj).sourceUrl;
            if (C866950Xzh.LIZ(str5)) {
                str2 = str5;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("IMTiktokLinkImpl@573f.getLongLinkFromShortLink$2");
        return str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
