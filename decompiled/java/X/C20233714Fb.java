package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20233714Fb extends C09AY implements Function1<C20234214Fg, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233714Fb(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20234214Fg c20234214Fg) {
        String str;
        C20234214Fg c20234214Fg2 = c20234214Fg;
        c20234214Fg2.LIZ = this.LL;
        c20234214Fg2.LJFF(EnumC1864410ycJ.FULL_SCREEN, AFwS274S0000000_30.get$arr$(27));
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            String str3 = this.LLILLL;
            String str4 = this.LLILZ;
            if (Intrinsics.LJFF(str3, "click_bottom_right_fixed_icon")) {
                str = "bottom_right_fixed_icon";
            } else if (Intrinsics.LJFF(str3, "click_search_bar_besides_icon")) {
                str = "search_bar_besides_icon";
            } else {
                str = null;
            }
            c20234214Fg2.LIZJ(str2, str, new AwS80S1000000_30(str4, 0));
        }
        c20234214Fg2.LIZLLL(new C1864430ycL(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLJJLI, this.LLIZLLLIL));
        return Unit.LIZ;
    }
}
