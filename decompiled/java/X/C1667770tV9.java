package X;

import com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667770tV9 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ HasPasskeyPageViewModel LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667770tV9(String str, DialogC1389620mGW dialogC1389620mGW, String str2, Function0<Unit> function0, Function0<Unit> function02, HasPasskeyPageViewModel hasPasskeyPageViewModel, int i, int i2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = str2;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = hasPasskeyPageViewModel;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667760tV8.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
