package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetAwemeDetailByIDResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$tryRequestRealAwemeData$2$1", f = "StoryArchiveV2ArchiveViewModel.kt", l = {}, m = "invokeSuspend")
public final class C331401Qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryArchiveV2ArchiveViewModel LL;
    public final /* synthetic */ GetAwemeDetailByIDResponse LLILLJJLI;
    public final /* synthetic */ Map<String, Aweme> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331401Qi(StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel, GetAwemeDetailByIDResponse getAwemeDetailByIDResponse, Map<String, ? extends Aweme> map, InterfaceC1364105Vn<? super C331401Qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyArchiveV2ArchiveViewModel;
        this.LLILLJJLI = getAwemeDetailByIDResponse;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331401Qi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C020W((Map) this.LLILLL, (Map<String, ? extends Aweme>) this.LLILLJJLI, (GetAwemeDetailByIDResponse) 26));
        if (((Boolean) C331501Qj.LIZ.getValue()).booleanValue()) {
            C316630Cb7.LIZ(this.LLILLJJLI.getStories());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.tryRequestRealAwemeData$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
