package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DJE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.actionsv2.WatchLiveAction$onClick$1", f = "WatchLiveAction.kt", l = {48}, m = "invokeSuspend")
public final class C0DJE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C315190CXd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DJE(C315190CXd c315190CXd, InterfaceC1364105Vn<? super C0DJE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c315190CXd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DJE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String conversationId;
        String string2;
        C0Y8Y coreInfo;
        C1C7U.LIZ("WatchLiveAction@6efc.onClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1598206No.LJ();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LLILLJJLI.LIZJ), "room_id");
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILLJJLI.LIZIZ);
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("sslocal").authority("webcast_room").appendQueryParameter("room_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).appendQueryParameter("room_id_list", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).appendQueryParameter("enter_method", "action_bar").appendQueryParameter("join_direct", "1").appendQueryParameter("enter_from_merge", "chat");
            if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
                string = C2286608xc.LJFF(coreInfo.getOwner()).toString();
            } else {
                string = null;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("chat_group_owner_uid", string);
            if (c0y8tLIZ != null) {
                conversationId = c0y8tLIZ.getConversationId();
            } else {
                conversationId = null;
            }
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("chat_group_id", conversationId);
            if (c0y8tLIZ != null) {
                string2 = C2286608xc.LJ(c0y8tLIZ.getMemberCount()).toString();
            } else {
                string2 = null;
            }
            String string3 = builderAppendQueryParameter3.appendQueryParameter("chat_group_user_num", string2).build().toString();
            if (string3.length() > 0) {
                C2238608ps c2238608ps = C2108208Ns.LIZ;
                C315180CXc c315180CXc = new C315180CXc(this.LLILLJJLI, string3, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c2238608ps, c315180CXc) == objLJFF) {
                    C1C7U.LIZIZ("WatchLiveAction@6efc.onClick$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WatchLiveAction@6efc.onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
