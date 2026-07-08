package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FDY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0FDW LL;
    public final /* synthetic */ CaptionTemplateData LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0FDZ LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDY(C0FDW c0fdw, CaptionTemplateData captionTemplateData, int i, C0FDZ c0fdz, String str) {
        super(0);
        this.LL = c0fdw;
        this.LLILLJJLI = captionTemplateData;
        this.LLILLL = i;
        this.LLILZ = c0fdz;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0FDW c0fdw = this.LL;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c0fdw);
        C1DFH c1dfh = C0PEM.LIZ;
        c0fdw.LLJJL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0FDX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null), 2);
        return Unit.LIZ;
    }
}
