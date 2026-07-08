package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videostack.SearchNimbleVideoStackAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Qtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685000Qtu extends C09AY implements Function1<ViewGroup.LayoutParams, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ SearchNimbleVideoStackAssem LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685000Qtu(float f, SearchNimbleVideoStackAssem searchNimbleVideoStackAssem, float f2) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = searchNimbleVideoStackAssem;
        this.LLILLL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.width = (int) this.LL;
        layoutParams2.height = (int) this.LLILLJJLI.Fp();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginEnd((int) this.LLILLL);
        }
        return Unit.LIZ;
    }
}
