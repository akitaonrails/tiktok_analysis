package X;

import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.model.GetArchivedStoryIDsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel$requestCollectionAwemeData$1$1", f = "StoryArchiveV2ArchiveViewModel.kt", l = {}, m = "invokeSuspend")
public final class C332301Qr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryArchiveV2ArchiveViewModel LL;
    public final /* synthetic */ GetArchivedStoryIDsResponse LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332301Qr(StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel, GetArchivedStoryIDsResponse getArchivedStoryIDsResponse, boolean z, InterfaceC1364105Vn<? super C332301Qr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyArchiveV2ArchiveViewModel;
        this.LLILLJJLI = getArchivedStoryIDsResponse;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332301Qr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryArchiveV2ArchiveViewModel@f333.requestCollectionAwemeData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C332401Qs(this.LLILLJJLI, this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryArchiveV2ArchiveViewModel@f333.requestCollectionAwemeData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
