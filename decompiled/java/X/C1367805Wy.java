package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$openInvisibleActivity$1$1", f = "CredentialManagerService.kt", l = {615}, m = "invokeSuspend")
public final class C1367805Wy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Lifecycle LLILLL;
    public final /* synthetic */ CredentialManagerService LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC852200Xbu LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367805Wy(Lifecycle lifecycle, CredentialManagerService credentialManagerService, Activity activity, String str, InterfaceC852200Xbu interfaceC852200Xbu, InterfaceC1364105Vn<? super C1367805Wy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lifecycle;
        this.LLILZ = credentialManagerService;
        this.LLILZIL = activity;
        this.LLILZLL = str;
        this.LLIZ = interfaceC852200Xbu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1367805Wy c1367805Wy = new C1367805Wy(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1367805Wy.LLILLJJLI = obj;
        return c1367805Wy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.openInvisibleActivity$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Lifecycle lifecycle = this.LLILLL;
            if (lifecycle != null) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                C1367905Wz c1367905Wz = new C1367905Wz(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC497601wk, null);
                this.LL = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c1367905Wz, this) == objLJFF) {
                    C1C7U.LIZIZ("CredentialManagerService@16d5.openInvisibleActivity$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.openInvisibleActivity$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
