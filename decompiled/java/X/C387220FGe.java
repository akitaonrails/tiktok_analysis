package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387220FGe extends C09AY implements Function1<C387490FHf, C387490FHf> {
    public final /* synthetic */ C259800zU<List<C0FGS>> LL;
    public final /* synthetic */ C259800zU<List<C0FGZ>> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TextMotionModel LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387220FGe(C259800zU<List<C0FGS>> c259800zU, C259800zU<List<C0FGZ>> c259800zU2, String str, TextMotionModel textMotionModel, C118300cf c118300cf, int i) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = str;
        this.LLILZ = textMotionModel;
        this.LLILZIL = c118300cf;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C387490FHf invoke(C387490FHf c387490FHf) {
        return C387490FHf.LIZ(c387490FHf, null, this.LL.element, this.LLILLJJLI.element, Integer.valueOf(this.LLILZLL), new C387180FGa(this.LLILLL, this.LLILZ.motionResId), false, false, null, null, new C375830EoP(Integer.valueOf(this.LLILZIL.element)), null, 0, 3457);
    }
}
