package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.14xR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$tryAuthCredentialManager$2$1$1$1", f = "CredentialManagerService.kt", l = {1033}, m = "invokeSuspend")
public final class C20433514xR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC20325014fw LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20433514xR(String str, String str2, InterfaceC20325014fw interfaceC20325014fw, Activity activity, InterfaceC1364105Vn<? super C20433514xR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC20325014fw;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20433514xR c20433514xR = new C20433514xR(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c20433514xR.LLILLJJLI = obj;
        return c20433514xR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, X.0XZJ] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, X.14xC] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            Object obj2 = this.LLILLJJLI;
            C0WQI.LIZ(3, "passkey", "tryAuthCredentialManager got valid credential");
            PasskeyApis passkeyApis = PasskeyApis.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLIZIZ = passkeyApis.LIZIZ(str, str2, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1$1$1");
                return objLJFF;
            }
        }
        FinishUserAuthenticationResponse finishUserAuthenticationResponse = (FinishUserAuthenticationResponse) objLIZIZ;
        n nVar = null;
        if (!Intrinsics.LJFF(finishUserAuthenticationResponse.message, "success")) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new Throwable();
            try {
                n nVar2 = finishUserAuthenticationResponse.data;
                if (nVar2 instanceof n) {
                    nVar = nVar2;
                }
                if (nVar != null) {
                    c259800zU.element = new C0XZJ(finishUserAuthenticationResponse.data.LJJIIZ("error_code").LJIIJJI(), "", EnumC852660Xce.NONE, EnumC852910Xd3.NONE, null, "");
                } else {
                    c259800zU.element = new C20432014xC(EnumC20430314wv.PASSKEY_LOGIN_MISSING_JSON.getErrorCode());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c259800zU.element = e;
            }
            C0WQI.LIZ(3, "passkey", "tryAuthCredentialManager finish auth fail: " + ((Throwable) c259800zU.element).getMessage());
            this.LLILZIL.LIZ((Throwable) c259800zU.element, true, false);
        } else {
            C0WQI.LIZ(3, "passkey", "tryAuthCredentialManager finish auth success!");
            C20432114xD.LJ(this.LLILZLL.getIntent(), "passkey_auth");
            C259800zU c259800zU2 = new C259800zU();
            try {
                n nVar3 = finishUserAuthenticationResponse.data;
                if (nVar3 instanceof n) {
                    nVar = nVar3;
                }
                if (nVar != null) {
                    c259800zU2.element = nVar3.LJJIIZ("passport_ticket").LJIL();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryAuthCredentialManager auth success, parseJson fail: ");
                sbLIZ.append(e2.getMessage());
                C0WQI.LIZ(3, "passkey", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLILZIL.onSuccess((String) c259800zU2.element);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
