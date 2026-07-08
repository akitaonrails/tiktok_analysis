package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$tryAuthCredentialManager$2$1", f = "CredentialManagerService.kt", l = {1015, 1030}, m = "invokeSuspend")
public final class C20433414xQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ CredentialManagerService LLILLL;
    public final /* synthetic */ n LLILZ;
    public final /* synthetic */ InterfaceC20325014fw LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20433414xQ(CredentialManagerService credentialManagerService, n nVar, InterfaceC20325014fw interfaceC20325014fw, Activity activity, InterfaceC1364105Vn<? super C20433414xQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = credentialManagerService;
        this.LLILZ = nVar;
        this.LLILZIL = interfaceC20325014fw;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20433414xQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIL;
        C20434514xb c20434514xb;
        String str;
        Object objLIZJ = obj;
        C1C7U.LIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(objLIZJ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strLJIL = (String) this.LL;
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                CredentialManagerService credentialManagerService = this.LLILLL;
                n nVar = this.LLILZ;
                credentialManagerService.getClass();
                Iterator<k> it2 = nVar.LJJIIZI("allowCredentials").iterator();
                while (it2.hasNext()) {
                    n nVarLJIILIIL = it2.next().LJIILIIL();
                    if (nVarLJIILIIL.LJJIJIIJIL("transports")) {
                        k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("transports");
                        kVarLJJIIZ.getClass();
                        if (kVarLJJIIZ instanceof m) {
                            nVarLJIILIIL.LJJIFFI("transports", new h());
                        }
                    }
                }
                if (nVar.LJJIJIIJIL("extensions")) {
                    k kVarLJJIIZ2 = nVar.LJJIIZ("extensions");
                    kVarLJJIIZ2.getClass();
                    if (kVarLJJIIZ2 instanceof m) {
                        nVar.LJJIFFI("extensions", new n());
                    }
                }
                strLJIL = this.LLILZ.LJJIIZ("webauthn_ticket").LJIL();
                try {
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C13XC(this.LLILZ.toString()));
                    C0WQI.LIZ(3, "passkey", "tryAuthCredentialManager start CredentialManager");
                    C20432114xD.LIZLLL(this.LLILZLL, "passkey_auth");
                    C20433114xN c20433114xN = InterfaceC20433014xM.LIZ;
                    Activity activity = this.LLILZLL;
                    c20433114xN.getClass();
                    C20443814z6 c20443814z6 = new C20443814z6(activity);
                    Activity activity2 = this.LLILZLL;
                    C20444114z9 c20444114z9 = new C20444114z9(listLJIILJJIL, true, 14);
                    this.LL = strLJIL;
                    this.LLILLJJLI = 1;
                    objLIZJ = c20443814z6.LIZJ(activity2, c20444114z9, this);
                    if (objLIZJ == objLJFF) {
                        C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
                        return objLJFF;
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryAuthCredentialManager fail create pubkeycredentialoption: ");
                    sbLIZ.append(e.getMessage());
                    C0WQI.LIZ(3, "passkey", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILZIL.LIZ(e, true, false);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
                    return unit2;
                }
            }
            AbstractC20432914xL abstractC20432914xL = ((C20433914xV) objLIZJ).LIZ;
            if (abstractC20432914xL instanceof C20434514xb) {
                c20434514xb = (C20434514xb) abstractC20432914xL;
            } else {
                c20434514xb = null;
            }
            if (c20434514xb != null && (str = c20434514xb.LIZLLL) != null) {
                InterfaceC20325014fw interfaceC20325014fw = this.LLILZIL;
                Activity activity3 = this.LLILZLL;
                C1DFB c1dfb = C0PEM.LIZJ;
                C20433514xR c20433514xR = new C20433514xR(str, strLJIL, interfaceC20325014fw, activity3, null);
                this.LL = null;
                this.LLILLJJLI = 2;
                if (C23250099c.LJI(this, c1dfb, c20433514xR) == objLJFF) {
                    C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
                    return objLJFF;
                }
            } else {
                this.LLILZIL.LIZ(new C20432014xC(EnumC20430314wv.PASSKEY_LOGIN_UNEXPECTED_CREDENTIAL_TYPE.getErrorCode()), true, false);
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
            return unit3;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryAuthCredentialManager CredentialManager error: ");
            sbLIZ2.append(e2.getMessage());
            C0WQI.LIZ(3, "passkey", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZIL.LIZ(e2, true, false);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("CredentialManagerService@16d5.tryAuthCredentialManager$2$1");
            return unit4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
