package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS118S1100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel$fetchViewerListData$1", f = "StoryViewerEntranceViewModel.kt", l = {}, m = "invokeSuspend")
public final class C331260Cyi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryViewerEntranceViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ List<StoryInsertUser> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331260Cyi(StoryViewerEntranceViewModel storyViewerEntranceViewModel, String str, Aweme aweme, List<StoryInsertUser> list, boolean z, InterfaceC1364105Vn<? super C331260Cyi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyViewerEntranceViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
        this.LLILZ = list;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331260Cyi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryViewerEntranceViewModel@1bc.fetchViewerListData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            InterfaceC330550CxZ interfaceC330550CxZO = ((InterfaceC330680Cxm) this.LL.LLILLJJLI.getValue().getOperator()).O(this.LLILLJJLI, this.LLILLL, 0L, 0L, this.LLILZ, null, this.LLILZIL);
            C330530CxX c330530CxX = C330530CxX.LIZJ;
            C330500CxU.LIZIZ(this.LLILLJJLI);
            this.LL.xQ2(this.LLILLL, interfaceC330550CxZO);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C727890Sgt.LIZ.getClass();
            if (C2344809Gs.LIZ) {
                C2344809Gs.LJI(e);
            }
            C330530CxX c330530CxX2 = C330530CxX.LIZJ;
            C330500CxU.LIZIZ(this.LLILLJJLI);
            this.LL.setState(new AwS118S1100000_4(this.LLILLJJLI, this.LLILLL, 10));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerEntranceViewModel@1bc.fetchViewerListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
