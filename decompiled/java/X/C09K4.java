package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09K4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverHelper$setVideoThumbImage$6", f = "ChooseCoverHelper.kt", l = {}, m = "invokeSuspend")
public final class C09K4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C1322110kVd LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ C09K7 LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09K4(VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, C19EG c19eg, C09K7 c09k7, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C09K4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c1322110kVd;
        this.LLILLL = c19eg;
        this.LLILZ = c09k7;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09K4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseCoverHelper@ec4.setVideoThumbImage$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        C1322110kVd c1322110kVd = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        C09K7 c09k7 = this.LLILZ;
        LifecycleOwner lifecycleOwner = this.LLILZIL;
        c1443990ngD.getClass();
        C1443990ngD.LIZJ(videoPublishEditModel, c1322110kVd, c19eg, c09k7, lifecycleOwner);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.setVideoThumbImage$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
