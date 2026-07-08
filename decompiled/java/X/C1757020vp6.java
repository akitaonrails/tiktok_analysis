package X;

import android.widget.TextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757020vp6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL = "bottom_bar";
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757020vp6(C10505048x c10505048x, String str, String str2, String str3, Function1 function1) {
        super(0);
        this.LL = c10505048x;
        this.LLILLJJLI = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C1757010vp5.LIZIZ(this.LL)) {
            C1018703yb.LIZIZ("tiktokec_rd_text_ellipsize", C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", this.LLILLJJLI), new Pair("module_name", this.LLILLL), new Pair("area_name", this.LLILZ), new Pair("text", this.LLILZIL)));
            Function1<Boolean, Unit> function1 = this.LLILZLL;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } else {
            Function1<Boolean, Unit> function12 = this.LLILZLL;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }
}
