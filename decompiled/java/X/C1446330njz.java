package X;

import Y.AfS191S0100000_22;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0njz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1446330njz extends C2217421BqW implements Function0<Unit> {
    public final /* synthetic */ C259800zU<InterfaceC420801kM> LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C1446280nju LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446330njz(VideoPublishEditModel videoPublishEditModel, C1446280nju c1446280nju, C259800zU c259800zU) {
        super(0, C1449605lu.class, "realStart", "tryInitData$realStart(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Lcom/ss/android/ugc/aweme/shortvideo/publish/CompileProbeV2;)V", 0);
        this.LL = c259800zU;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c1446280nju;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.01kM] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C259800zU<InterfaceC420801kM> c259800zU = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        C1446280nju c1446280nju = this.LLILLL;
        C564000MAc.LIZIZ("HWCompileProbe ; Start");
        c259800zU.element = AbstractC19484711Kz.LJII(new C1466830oH3(new C238400w2(), videoPublishEditModel, c1446280nju, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS191S0100000_22(c1446280nju, 44), new AfS191S0100000_22(c1446280nju, 45));
        return Unit.LIZ;
    }
}
