package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431060nLM extends C09AY implements Function2<ImageSynthesisResult, Integer, Unit> {
    public final /* synthetic */ C1431100nLQ LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ InterfaceC1431080nLO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431060nLM(C1431100nLQ c1431100nLQ, C817403Hg c817403Hg, float f, C1D85 c1d85) {
        super(2);
        this.LL = c1431100nLQ;
        this.LLILLJJLI = c817403Hg;
        this.LLILLL = f;
        this.LLILZ = c1d85;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ImageSynthesisResult imageSynthesisResult, Integer num) {
        num.intValue();
        if (!this.LL.LLJJI) {
            C817403Hg c817403Hg = this.LLILLJJLI;
            float f = c817403Hg.element + this.LLILLL;
            c817403Hg.element = f;
            this.LLILZ.LIZ(new C1411860mqO(f / 100.0f), EnumC2251001D8o.OUTER);
        }
        return Unit.LIZ;
    }
}
