package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687840u1W extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1686920u02 LL;
    public final /* synthetic */ Function0<SignupViewModel> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687840u1W(InterfaceC1686920u02 interfaceC1686920u02, Function0<SignupViewModel> function0, boolean z, C1690080u58 c1690080u58, boolean z2, int i, int i2, int i3) {
        super(2);
        this.LL = interfaceC1686920u02;
        this.LLILLJJLI = function0;
        this.LLILLL = z;
        this.LLILZ = c1690080u58;
        this.LLILZIL = z2;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1687820u1U.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
