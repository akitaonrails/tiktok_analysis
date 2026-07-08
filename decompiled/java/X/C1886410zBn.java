package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredential;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyRemoveApiResponse;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyRemoveCredentialsApi;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyRemoveData;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel$onDeleteClick$2", f = "PasskeyManagementViewModel.kt", l = {301}, m = "invokeSuspend")
public final class C1886410zBn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PasskeyManagementViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886410zBn(String str, PasskeyManagementViewModel passkeyManagementViewModel, InterfaceC1364105Vn<? super C1886410zBn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = passkeyManagementViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1886410zBn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.0zBr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0zBr] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        List<C1887220zD6> listWQ2;
        List<PasskeyCredential> list;
        C1C7U.LIZ("PasskeyManagementViewModel@e9dc.onDeleteClick$2");
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
            PasskeyRemoveCredentialsApi passkeyRemoveCredentialsApi = PasskeyRemoveCredentialsApi.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = passkeyRemoveCredentialsApi.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PasskeyManagementViewModel@e9dc.onDeleteClick$2");
                return objLJFF;
            }
        }
        PasskeyRemoveApiResponse passkeyRemoveApiResponse = (PasskeyRemoveApiResponse) obj;
        String str2 = "";
        if (Intrinsics.LJFF(passkeyRemoveApiResponse.message, "success")) {
            C1886490zBv.LIZ.getClass();
            C1886490zBv.LIZJ("remove_passkey", "", true);
            PasskeyRemoveData passkeyRemoveData = passkeyRemoveApiResponse.data;
            if (passkeyRemoveData != null && (list = passkeyRemoveData.credentials) != null) {
                listWQ2 = this.LLILLL.wQ2(list);
            } else {
                listWQ2 = C13BV.INSTANCE;
            }
            if (listWQ2.isEmpty()) {
                Activity activity = this.LLILLL.vQ2().LL.get();
                if (activity != null) {
                    PasskeyManagementViewModel passkeyManagementViewModel = this.LLILLL;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("SHOW_CREATE_PASSKEY", true);
                    bundle.putBoolean("HAS_PASSWORD", passkeyManagementViewModel.vQ2().LLILLJJLI);
                    String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_account_login_passkey_management_PasskeyManagementViewModel$onDeleteClick$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_account_login_passkey_management_PasskeyManagementViewModel$onDeleteClick$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(activity.getIntent(), "enter_from");
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_account_login_passkey_management_PasskeyManagementViewModel$onDeleteClick$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
                        str2 = strINVOKEVIRTUAL_com_ss_android_ugc_aweme_account_login_passkey_management_PasskeyManagementViewModel$onDeleteClick$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
                    }
                    C786410Ut5.LJJJI("enter_from", str2, bundle);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/passkey/management");
                    smartRouteBuildRoute.withParam(bundle);
                    smartRouteBuildRoute.addFlags(67108864);
                    smartRouteBuildRoute.addFlags(268435456);
                    smartRouteBuildRoute.open();
                }
            } else {
                this.LLILLL.setState(new AwS607S0100000_28(listWQ2, (List<C1887220zD6>) 257));
            }
        } else {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = EnumC1886450zBr.SHOW_FAIL_AUTO_IDV_DIALOG;
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = "";
            C013C c013c = new C013C();
            c013c.element = true;
            PasskeyRemoveData passkeyRemoveData2 = passkeyRemoveApiResponse.data;
            if (passkeyRemoveData2 != null) {
                PasskeyManagementViewModel passkeyManagementViewModel2 = this.LLILLL;
                ?? r1 = passkeyRemoveData2.errorCode;
                if (r1 != 0) {
                    c259800zU2.element = r1;
                    if (Intrinsics.LJFF(r1, "18000")) {
                        c259800zU.element = EnumC1886450zBr.SHOW_ADD_LOGIN_DIALOG;
                        C1886490zBv c1886490zBv = C1886490zBv.LIZ;
                        String str3 = passkeyManagementViewModel2.getState().LLILZIL;
                        c1886490zBv.getClass();
                        C1886490zBv.LIZIZ(str3, "add_login_method");
                    } else {
                        C1887240zD8 c1887240zD8 = C1887240zD8.LIZ;
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) c259800zU2.element);
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c1887240zD8.getClass();
                        if (C1887240zD8.LIZ(iIntValue)) {
                            c013c.element = false;
                        }
                    }
                }
            }
            C1886490zBv c1886490zBv2 = C1886490zBv.LIZ;
            boolean z = c013c.element;
            String str4 = (String) c259800zU2.element;
            c1886490zBv2.getClass();
            C1886490zBv.LIZJ("remove_passkey", str4, z);
            this.LLILLL.setState(new AwS607S0100000_28(c259800zU, (C259800zU<EnumC1886530zBz>) 258));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PasskeyManagementViewModel@e9dc.onDeleteClick$2");
        return unit;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_account_login_passkey_management_PasskeyManagementViewModel$onDeleteClick$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
