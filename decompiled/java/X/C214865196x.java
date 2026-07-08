package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.196x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214865196x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ExpandedTitleModule LLILLJJLI;
    public final /* synthetic */ C259800zU<Function0<Unit>> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214865196x(boolean z, ExpandedTitleModule expandedTitleModule, C259800zU<Function0<Unit>> c259800zU, int i, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = expandedTitleModule;
        this.LLILLL = c259800zU;
        this.LLILZ = i;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (this.LL) {
            ExpandedTitleModule expandedTitleModule = this.LLILLJJLI;
            expandedTitleModule.LLLLLZIL = false;
            expandedTitleModule.LLJJJJLIIL.setForbidScroll(true);
            this.LLILLJJLI.LJJJJ(false);
        } else {
            this.LLILLJJLI.LJJJJ(true);
            View view = this.LLILLJJLI.LLJJL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
        if (this.LLILLJJLI.LLJJJIL.getVisibility() != 8 && !this.LL) {
            this.LLILLJJLI.LLJJJIL.getLayoutParams().height = -2;
        }
        ExpandedTitleModule expandedTitleModule2 = this.LLILLJJLI;
        expandedTitleModule2.LLLLLZL.LLILLL.setValue(Boolean.valueOf(expandedTitleModule2.LLLZIIL == 1));
        this.LLILLL.element.invoke();
        if (this.LLILZ != 1) {
            this.LLILLJJLI.LLLZIL.LIZ();
        }
        if (this.LLILZIL) {
            this.LLILLJJLI.LLLLIILLL.LJII();
        }
        return Unit.LIZ;
    }
}
