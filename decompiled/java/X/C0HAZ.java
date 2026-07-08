package X;

import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C15DF LLILLJJLI;
    public final /* synthetic */ LinearLayout LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HAZ(boolean z, C15DF c15df, LinearLayout linearLayout, long j, Function0<Unit> function0) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c15df;
        this.LLILLL = linearLayout;
        this.LLILZ = j;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            TuxTextView tuxTextView = this.LLILLJJLI.LLJZIJLIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxTextView tuxTextView2 = this.LLILLJJLI.LLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            TuxTextView tuxTextView3 = this.LLILLJJLI.LLJIJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            C786410Ut5.LJZL(8, this.LLILLL);
            C15DF c15df = this.LLILLJJLI;
            TuxTextView tuxTextView4 = c15df.LLJIJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(c15df.LJIIJ(this.LLILZ, false));
            }
        } else {
            TuxTextView tvRightMatchScoreTextFromXml = this.LLILLJJLI.getTvRightMatchScoreTextFromXml();
            if (tvRightMatchScoreTextFromXml != null) {
                C786410Ut5.LLLLZLL(tvRightMatchScoreTextFromXml, 0);
            }
            C786410Ut5.LJZL(8, this.LLILLL);
            TuxTextView tvRightMatchScoreTextFromXml2 = this.LLILLJJLI.getTvRightMatchScoreTextFromXml();
            if (tvRightMatchScoreTextFromXml2 != null) {
                tvRightMatchScoreTextFromXml2.setText(this.LLILLJJLI.LJIIJ(this.LLILZ, false));
            }
        }
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
