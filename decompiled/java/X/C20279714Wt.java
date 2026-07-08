package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14Wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20279714Wt extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function0<SignupViewModel> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20279714Wt(boolean z, Function0<SignupViewModel> function0, boolean z2, int i, int i2, int i3) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = function0;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        boolean z = this.LL;
        Function0<SignupViewModel> function0 = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C20279514Wr.LIZIZ(this.LLILZ, this.LLILZIL, C341440Da2.LIZ(this.LLILZLL | 1), interfaceC1680500tpg, function0, z, z2);
        return Unit.LIZ;
    }
}
