package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171170gaB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1749280vcc LL;
    public final /* synthetic */ TuxIconView LLILLJJLI;
    public final /* synthetic */ C197039127h LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ TextView LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ C197039127h LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171170gaB(C1749280vcc c1749280vcc, TuxIconView tuxIconView, C197039127h c197039127h, View view, View view2, View view3, TextView textView, View view4, C197039127h c197039127h2) {
        super(0);
        this.LL = c1749280vcc;
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = c197039127h;
        this.LLILZ = view;
        this.LLILZIL = view2;
        this.LLILZLL = view3;
        this.LLIZ = textView;
        this.LLIZLLLIL = view4;
        this.LLJ = c197039127h2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C426750GoL.LJIIIZ(this.LL, null, 0, null, null, false, 29);
        this.LL.LJ();
        C786410Ut5.LLLZLZ(this.LL, 0);
        this.LLILLJJLI.setEnabled(false);
        this.LLILLL.setEnabled(false);
        C786410Ut5.w5(this.LLILLL, 0.0f);
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLILZIL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        C786410Ut5.LLIL(this.LLIZ, 8);
        C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
        C786410Ut5.LLLLLLJ(this.LLJ, 8);
        return Unit.LIZ;
    }
}
