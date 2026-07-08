package X;

import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import defpackage.n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0XTV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.logout.AccountSwitcher$switchAccount$1", f = "AccountSwitcher.kt", l = {205}, m = "invokeSuspend")
public final class C0XTV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ SignificantUserInfo LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC849490XUd LLIZLLLIL;
    public final /* synthetic */ Bundle LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XTV(String str, String str2, SignificantUserInfo significantUserInfo, Bundle bundle, boolean z, boolean z2, InterfaceC849490XUd interfaceC849490XUd, Bundle bundle2, InterfaceC1364105Vn<? super C0XTV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = significantUserInfo;
        this.LLILZIL = bundle;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = interfaceC849490XUd;
        this.LLJ = bundle2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XTV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountSwitcher@17bf.switchAccount$1");
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
            String str = this.LLILLJJLI;
            if (str != null && !Intrinsics.LJFF(this.LLILLL, str)) {
                AppLog.flush();
                long j = n0.LIZIZ;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("AccountSwitcher@17bf.switchAccount$1");
                    return objLJFF;
                }
            }
        }
        C0XUU c0xuu = C0XUU.LIZ;
        SignificantUserInfo significantUserInfo = this.LLILZ;
        Bundle bundle = this.LLILZIL;
        boolean z = this.LLILZLL;
        boolean z2 = this.LLIZ;
        InterfaceC849490XUd interfaceC849490XUd = this.LLIZLLLIL;
        Bundle bundle2 = this.LLJ;
        c0xuu.getClass();
        C0XUU.LIZJ(significantUserInfo, bundle, z, z2, interfaceC849490XUd, bundle2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountSwitcher@17bf.switchAccount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
