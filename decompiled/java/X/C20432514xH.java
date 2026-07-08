package X;

import Y.AfS61S0110000_31;
import android.app.Activity;
import android.os.DeadObjectException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowPasskeySavedToastEvent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$createPasskey$1$1", f = "CredentialManagerService.kt", l = {494}, m = "invokeSuspend")
public final class C20432514xH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C13XD LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC20325014fw LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20432514xH(Activity activity, C13XD c13xd, boolean z, boolean z2, InterfaceC20325014fw interfaceC20325014fw, String str, String str2, String str3, InterfaceC1364105Vn<? super C20432514xH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = c13xd;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = interfaceC20325014fw;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20432514xH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.createPasskey$1$1");
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
                C20432114xD.LIZLLL(this.LLILLJJLI, "passkey_create");
                C20433114xN c20433114xN = InterfaceC20433014xM.LIZ;
                Activity activity = this.LLILLJJLI;
                c20433114xN.getClass();
                C20443814z6 c20443814z6 = new C20443814z6(activity);
                Activity activity2 = this.LLILLJJLI;
                C13XD c13xd = this.LLILLL;
                this.LL = 1;
                obj = c20443814z6.LIZ(activity2, c13xd, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CredentialManagerService@16d5.createPasskey$1$1");
                    return objLJFF;
                }
            }
            Activity activity3 = this.LLILLJJLI;
            String str = CredentialManagerService.LIZ;
            C20432114xD.LJIILJJIL(activity3, C0WJT.LIZ(activity3), Boolean.valueOf(this.LLILZIL), 0);
            C20432114xD.LJIIL(this.LLILLJJLI, this.LLILZ, Boolean.valueOf(this.LLILZIL));
            C20432114xD.LJ(this.LLILLJJLI.getIntent(), "passkey_create");
            C849850XVn.LIZIZ.LIZJ().LJFF("86");
            this.LLILZLL.LJ();
            C20432114xD.LJIIJ(this.LLILLJJLI, this.LLILZ, this.LLILZIL, 1);
            C11KZ c11kzLIZLLL = PasskeyApis.LIZLLL(this.LLIZ, ((C20434614xc) obj).LIZIZ, this.LLIZLLLIL, this.LLJ);
            final boolean z = this.LLILZ;
            final Activity activity4 = this.LLILLJJLI;
            final boolean z2 = this.LLILZIL;
            final InterfaceC20325014fw interfaceC20325014fw = this.LLILZLL;
            c11kzLIZLLL.LJIIZILJ(new C09JN() { // from class: X.14gI
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String stringExtra;
                    String str2;
                    C1C7U.LIZ("CredentialManagerService@16d5.createPasskey$1$1$1");
                    ((IPasskeyPopUpHelper) ServiceManager.get().getService(IPasskeyPopUpHelper.class)).LIZIZ();
                    ShowPasskeySavedToastEvent showPasskeySavedToastEvent = new ShowPasskeySavedToastEvent();
                    if (z) {
                        stringExtra = "personal_homepage";
                    } else {
                        try {
                            stringExtra = activity4.getIntent().getStringExtra("enter_from");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (stringExtra == null) {
                            stringExtra = "info_page";
                        }
                    }
                    showPasskeySavedToastEvent.LJI(stringExtra, "enter_from");
                    if (z2) {
                        str2 = "first_passkey";
                    } else {
                        str2 = "replace_passkey";
                    }
                    showPasskeySavedToastEvent.LJI(str2, "enter_method");
                    showPasskeySavedToastEvent.LJI(Integer.valueOf(C20642615q4.LIZ() ? 1 : 0), "has_screen_lock");
                    showPasskeySavedToastEvent.LJIIIIZZ();
                    interfaceC20325014fw.onSuccess(null);
                    C1C7U.LIZIZ("CredentialManagerService@16d5.createPasskey$1$1$1");
                }
            }, new AfS61S0110000_31(interfaceC20325014fw, z2, 0));
        } catch (AbstractC20027413Xs e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.LIZ(e, true, this.LLILZIL);
            C20432114xD.LJIIJ(this.LLILLJJLI, this.LLILZ, this.LLILZIL, 0);
        } catch (DeadObjectException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILZLL.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_DEAD_OBJECT_EXCEPTION.getErrorCode()), true, false);
        } catch (IllegalArgumentException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLILZLL.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_ILLEGAL_ARGUMENT.getErrorCode()), true, false);
        } catch (NullPointerException e4) {
            TryCatchGuardChecker.doCheck(e4);
            this.LLILZLL.LIZ(new C20432014xC(EnumC20430014ws.PASSKEY_REGISTRATION_NULL_POINTER.getErrorCode()), true, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.createPasskey$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
