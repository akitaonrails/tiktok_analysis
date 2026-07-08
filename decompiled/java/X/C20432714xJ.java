package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getPasskeyForAuthorize$1$1", f = "CredentialManagerService.kt", l = {851}, m = "invokeSuspend")
public final class C20432714xJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ List<AbstractC836950WsP> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC20433214xO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20432714xJ(Activity activity, List<AbstractC836950WsP> list, boolean z, InterfaceC20433214xO interfaceC20433214xO, InterfaceC1364105Vn<? super C20432714xJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = interfaceC20433214xO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20432714xJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20434514xb c20434514xb;
        String str;
        C1C7U.LIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C20433114xN c20433114xN = InterfaceC20433014xM.LIZ;
                Activity activity = this.LLILLJJLI;
                c20433114xN.getClass();
                C20443814z6 c20443814z6 = new C20443814z6(activity);
                Activity activity2 = this.LLILLJJLI;
                C20444114z9 c20444114z9 = new C20444114z9(this.LLILLL, this.LLILZ, 14);
                this.LL = 1;
                obj = c20443814z6.LIZJ(activity2, c20444114z9, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1$1");
                    return objLJFF;
                }
            }
            AbstractC20432914xL abstractC20432914xL = ((C20433914xV) obj).LIZ;
            if (abstractC20432914xL instanceof C20434514xb) {
                c20434514xb = (C20434514xb) abstractC20432914xL;
            } else {
                c20434514xb = null;
            }
            if (c20434514xb != null && (str = c20434514xb.LIZLLL) != null) {
                this.LLILZIL.onSuccess(str);
            } else {
                this.LLILZIL.onError(EnumC20430314wv.PASSKEY_LOGIN_UNEXPECTED_CREDENTIAL_TYPE.getErrorCode(), "Unexpected type of credential");
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20431614x8.LIZ.getClass();
            Pair pairLJIIJ = C20431614x8.LJIIJ(e);
            this.LLILZIL.onError(((Number) pairLJIIJ.getFirst()).intValue(), (String) pairLJIIJ.getSecond());
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
