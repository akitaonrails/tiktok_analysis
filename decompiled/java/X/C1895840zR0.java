package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895840zR0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI = "gameplay_detail";
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895840zR0(String str, String str2, String str3, String str4) {
        super(0);
        this.LL = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1896460zS0 value = C1896460zS0.LLJJ.getValue();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLILLJJLI;
        value.LJJIFFI(0L, str, str2 != null ? str2 : "");
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        String str3 = this.LL;
        String str4 = this.LLILLL;
        String str5 = this.LLILZ;
        String str6 = this.LLILLJJLI;
        String str7 = this.LLILZIL;
        c1895820zQy.getClass();
        C1895820zQy.LJIIJ(str3, str4, str5, str6, str7);
        return Unit.LIZ;
    }
}
