package X;

import android.net.Uri;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.model.AutoPopupPageConfig;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.model.RewardAutoPopupPageParam;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageHost$handlePopupPageAutoOpen$1", f = "GameDetailMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1879770z15 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881590z41 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879770z15(C1881590z41 c1881590z41, InterfaceC1364105Vn<? super C1879770z15> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881590z41;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879770z15(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        Object objLJIIIIZZ;
        Object objLJIIIIZZ2;
        C1C7U.LIZ("GameDetailMixPageHost@9f5f.handlePopupPageAutoOpen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = this.LL.LJJI().LIZIZ("sub_page");
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ.length() > 0) {
            try {
                if (strLIZIZ.length() == 0) {
                    objLJIIIIZZ2 = null;
                } else {
                    objLJIIIIZZ2 = C293501Bt.LIZ().LJIIIIZZ(strLIZIZ, new TypeToken<AutoPopupPageConfig>() { // from class: X.0z16
                    }.getType());
                }
                c098200Yq = (AutoPopupPageConfig) objLJIIIIZZ2;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AutoPopupPageConfig autoPopupPageConfig = (AutoPopupPageConfig) c098200Yq;
            if (autoPopupPageConfig != null) {
                int i = autoPopupPageConfig.subPageType;
                if (i != 1) {
                    if (i != 2) {
                        C1881590z41 c1881590z41 = this.LL;
                        c1881590z41.getClass();
                        C20441214yg.LIZIZ("GameDetailMixPageHost", "openPopupPage");
                        String str2 = autoPopupPageConfig.path;
                        if (str2 != null && str2.length() != 0) {
                            InterfaceC497601wk interfaceC497601wkLJIILL = c1881590z41.LJIIIZ().LJIILL();
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(interfaceC497601wkLJIILL, C2107308Nj.LIZ, null, new C1879690z0x(c1881590z41, str2, null), 2);
                        }
                    } else {
                        C1881590z41 c1881590z412 = this.LL;
                        c1881590z412.getClass();
                        C20441214yg.LIZIZ("GameDetailMixPageHost", "openCreatorCodePage");
                        String string = autoPopupPageConfig.path;
                        if (string != null && string.length() != 0) {
                            if (!C497740JfY.LJIL()) {
                                Uri uri = UriProtector.parse(string);
                                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landscape_height") == null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landscape_width") == null) {
                                    int iLIZLLL = C1884080z82.LIZLLL();
                                    int iLIZLLL2 = C1884080z82.LIZLLL() + C2084308En.LIZ(c1881590z412.LL);
                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                    builderBuildUpon.appendQueryParameter("landscape_height", String.valueOf(C497740JfY.LJJI(iLIZLLL2)));
                                    builderBuildUpon.appendQueryParameter("landscape_width", String.valueOf(C497740JfY.LJJI(iLIZLLL)));
                                    string = builderBuildUpon.build().toString();
                                }
                            }
                            C760370TsB c760370TsBLIZ = C0KYL.LIZ(string);
                            String strLIZIZ2 = c1881590z412.LJJI().LIZIZ("log_extra");
                            if (strLIZIZ2 == null) {
                                strLIZIZ2 = "";
                            }
                            String strLIZIZ3 = c760370TsBLIZ.LIZIZ("tea_params");
                            if (strLIZIZ3 != null) {
                                str = strLIZIZ3;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(strLIZIZ2);
                                JSONObject jSONObject2 = new JSONObject(str);
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject.put(next, jSONObject2.get(next));
                                }
                                c760370TsBLIZ.LJJIFFI("tea_params", C786410Ut5.J3(jSONObject));
                                C189200o6.m2constructorimpl(c760370TsBLIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                            InterfaceC497601wk interfaceC497601wkLJIILL2 = c1881590z412.LJIIIZ().LJIILL();
                            C1DFH c1dfh2 = C0PEM.LIZ;
                            C23250099c.LIZLLL(interfaceC497601wkLJIILL2, C2107308Nj.LIZ, null, new C1879700z0y(c1881590z412, c760370TsBLIZ, null), 2);
                        } else {
                            C20441214yg.LJ("GameDetailMixPageHost", "openCreatorCodePage schema is empty");
                        }
                    }
                } else {
                    C1881590z41 c1881590z413 = this.LL;
                    c1881590z413.getClass();
                    C20441214yg.LIZIZ("GameDetailMixPageHost", "openRewardDetailPage");
                    try {
                        String str3 = autoPopupPageConfig.param;
                        if (str3 != null && str3.length() != 0) {
                            objLJIIIIZZ = C293501Bt.LIZ().LJIIIIZZ(str3, new TypeToken<RewardAutoPopupPageParam>() { // from class: X.0z17
                            }.getType());
                        } else {
                            objLJIIIIZZ = null;
                        }
                        c098200Yq2 = (RewardAutoPopupPageParam) objLJIIIIZZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq2 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    RewardAutoPopupPageParam rewardAutoPopupPageParam = (RewardAutoPopupPageParam) c098200Yq2;
                    if (rewardAutoPopupPageParam == null) {
                        C20441214yg.LJ("GameDetailMixPageHost", "openRewardDetailPage param is null");
                    } else {
                        String str4 = autoPopupPageConfig.path;
                        if (str4 != null && str4.length() != 0) {
                            List<BriefBenefitInfo> list = c1881590z413.LLJJ;
                            if (list != null) {
                                Iterator<BriefBenefitInfo> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    BriefBenefitInfo next2 = it2.next();
                                    if (Intrinsics.LJFF(next2.campaignTaskId, rewardAutoPopupPageParam.campaignTaskId)) {
                                        if (next2 != null) {
                                            C760370TsB c760370TsBLIZ2 = C0KYL.LIZ(str4);
                                            try {
                                                String strLIZIZ4 = c1881590z413.LJJI().LIZIZ("log_extra");
                                                if (strLIZIZ4 == null) {
                                                    strLIZIZ4 = "";
                                                }
                                                String strLIZIZ5 = c760370TsBLIZ2.LIZIZ("tea_params");
                                                if (strLIZIZ5 != null) {
                                                    str = strLIZIZ5;
                                                }
                                                JSONObject jSONObject3 = new JSONObject();
                                                for (Map.Entry<String, Object> entry : C1882380z5I.LIZ(c1881590z413.LJIIIIZZ()).entrySet()) {
                                                    jSONObject3.put(entry.getKey(), entry.getValue());
                                                }
                                                JSONObject jSONObject4 = new JSONObject(strLIZIZ4);
                                                Iterator<String> itKeys2 = jSONObject4.keys();
                                                while (itKeys2.hasNext()) {
                                                    String next3 = itKeys2.next();
                                                    jSONObject3.put(next3, jSONObject4.get(next3));
                                                }
                                                JSONObject jSONObject5 = new JSONObject(str);
                                                Iterator<String> itKeys3 = jSONObject5.keys();
                                                while (itKeys3.hasNext()) {
                                                    String next4 = itKeys3.next();
                                                    jSONObject3.put(next4, jSONObject5.get(next4));
                                                }
                                                c760370TsBLIZ2.LJJIFFI("tea_params", C786410Ut5.J3(jSONObject3));
                                                C189200o6.m2constructorimpl(c760370TsBLIZ2);
                                            } catch (Throwable th4) {
                                                TryCatchGuardChecker.doCheck(th4);
                                                C189200o6.m2constructorimpl(new C098200Yq(th4));
                                            }
                                            InterfaceC497601wk interfaceC497601wkLJIILL3 = c1881590z413.LJIIIZ().LJIILL();
                                            C1DFH c1dfh3 = C0PEM.LIZ;
                                            C23250099c.LIZLLL(interfaceC497601wkLJIILL3, C2107308Nj.LIZ, null, new C1879730z11(c1881590z413, c760370TsBLIZ2, null), 2);
                                        }
                                    }
                                }
                            } else {
                                C20441214yg.LJ("GameDetailMixPageHost", "openRewardDetailPage reward not found");
                                List<BriefBenefitInfo> list2 = c1881590z413.LLJJ;
                                if (list2 == null || list2.isEmpty()) {
                                    ((ArrayList) c1881590z413.LLLF).add(new C1880700z2a(c1881590z413));
                                }
                            }
                        } else {
                            C20441214yg.LJ("GameDetailMixPageHost", "openRewardDetailPage schema is empty");
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.handlePopupPageAutoOpen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
