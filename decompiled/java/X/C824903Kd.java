package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipModule;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.MemberShipCell$bindMemberShipContent$1", f = "MemberShipCell.kt", l = {}, m = "invokeSuspend")
public final class C824903Kd extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MemberShipModule LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824903Kd(MemberShipModule memberShipModule, TuxTextView tuxTextView, View view, InterfaceC1364105Vn<? super C824903Kd> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = memberShipModule;
        this.LLILLL = tuxTextView;
        this.LLILZ = view;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C824903Kd c824903Kd = new C824903Kd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c824903Kd.LL = view;
        return c824903Kd.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONObject jSONObject;
        C1C7U.LIZ("MemberShipCell@911.bindMemberShipContent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1748720vbi.LIZLLL((View) this.LL, new C10516049i(), new AwS580S0100000_1(this.LLILLL, 1132));
        String str = this.LLILLJJLI.schema;
        if (str != null) {
            View view = this.LLILZ;
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "track_params");
            try {
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            jSONObject.put("previous_page", "order_submit");
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                builderBuildUpon.clearQuery();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    if (!Intrinsics.LJFF(str2, "track_params")) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                        while (it2.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str2, it2.next());
                        }
                    }
                }
            }
            SmartRouter.buildRoute(view.getContext(), builderBuildUpon.appendQueryParameter("track_params", C786410Ut5.J3(jSONObject)).build().toString()).open();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemberShipCell@911.bindMemberShipContent$1");
        return unit;
    }
}
