package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.SelectContactFragment;

/* JADX INFO: renamed from: X.0v0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725680v0Y extends AbstractC1725690v0Z {
    public final void LIZJ(C1156880gD8 c1156880gD8, int i, String str) {
        C1725270uzt.LIZ.LJIILJJIL(null, null, c1156880gD8.LIZ, c1156880gD8.LIZIZ, c1156880gD8.LIZJ, "fragment_show", "fail", getName(), String.valueOf(i), str);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String strLJIJI;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Context context;
        Context contextN3;
        FragmentManager fragmentManagerLJ;
        int i;
        SettingsManager.LIZLLL().getClass();
        XBaseResultModel xBaseResultModel = null;
        String containerID2 = null;
        xBaseResultModel = null;
        if (!SettingsManager.LIZ("pipo_select_contact_jsb_enable", true)) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            }
            InterfaceC1725700v0a interfaceC1725700v0a = (InterfaceC1725700v0a) C1909107dp.LIZJ(InterfaceC1725700v0a.class, containerID2);
            interfaceC1725700v0a.setContactName("");
            interfaceC1725700v0a.setPhoneNumber("");
            completionBlock.onSuccess(interfaceC1725700v0a, "");
            return;
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if ((c1537480q70LIZIZ instanceof SparkContext) && c1537480q70LIZIZ != null) {
            strLJIJI = c1537480q70LIZIZ.LJIJI();
        } else {
            strLJIJI = null;
        }
        Uri uriLIZLLL = C759510Tqn.LIZLLL(strLJIJI, "select contact jsb");
        if (uriLIZLLL != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "biz");
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "bdhm_bid");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        }
        C1156880gD8 c1156880gD8 = new C1156880gD8(strLJIJI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        C1725270uzt.LIZ.LJIILJJIL(null, null, strLJIJI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "jsb_call", "start", getName(), null, null);
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null && (context = interfaceC634840OvC3.getContext()) != null && (contextN3 = C786410Ut5.N3(context)) != null) {
            SelectContactFragment selectContactFragment = new SelectContactFragment(contextN3, strLJIJI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, new C1776170wJz(this, (C1725680v0Y) completionBlock, (CompletionBlock<InterfaceC1725700v0a>) 1));
            AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
            if (abstractC1387200mCcLIZJ != null && (fragmentManagerLJ = abstractC1387200mCcLIZJ.LJ()) != null) {
                if (fragmentManagerLJ.LJLJJI()) {
                    LIZJ(c1156880gD8, -15, "fragment manager state saved");
                    C2382909Vj.LIZ(completionBlock, -15, "fragment manager state saved", null, 4);
                    return;
                }
                if (fragmentManagerLJ.LJJJJZI("select_contact_fragment") != null) {
                    LIZJ(c1156880gD8, -16, "select contact is already in progress");
                    C2382909Vj.LIZ(completionBlock, -16, "select contact is already in progress", null, 4);
                    return;
                }
                try {
                    C19EH c19ehLJIIJ = fragmentManagerLJ.LJIIJ();
                    c19ehLJIIJ.LIZLLL(selectContactFragment, "select_contact_fragment");
                    c19ehLJIIJ.LJIIL();
                    if (selectContactFragment.LLILZLL) {
                        return;
                    }
                    i = 4;
                    try {
                        xBaseResultModel = null;
                        C1725270uzt.LIZ.LJIILJJIL(null, null, strLJIJI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "fragment_show", "success", getName(), null, null);
                        return;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 4;
                }
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "add fragment failed";
                }
                LIZJ(c1156880gD8, -14, message);
                C2382909Vj.LIZ(completionBlock, -14, message, xBaseResultModel, i);
                return;
            }
            LIZJ(c1156880gD8, -13, "can not find top fragment activity");
            C2382909Vj.LIZ(completionBlock, -13, "can not find top activity", null, 4);
            return;
        }
        C1725270uzt.LIZ.LJIILJJIL(null, null, strLJIJI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "jsb_call", "fail", getName(), "-3", "can not find context");
        C2382909Vj.LIZ(completionBlock, -3, "can not find context", null, 4);
    }
}
