package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell$onItemViewClick$1$1", f = "StoryOnThisDayInboxCell.kt", l = {115}, m = "invokeSuspend")
public final class C1416405gY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryOnThisDayInboxCell LLILLL;
    public final /* synthetic */ List<Aweme> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1416405gY(StoryOnThisDayInboxCell storyOnThisDayInboxCell, List<? extends Aweme> list, InterfaceC1364105Vn<? super C1416405gY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = storyOnThisDayInboxCell;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416405gY c1416405gY = new C1416405gY(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1416405gY.LLILLJJLI = obj;
        return c1416405gY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().downloadTextFont(this.LLILLL.itemView.getContext());
            C1416105gV c1416105gV = new C1416105gV(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1416205gW(this.LLILLL, this.LLILZ, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1416305gX(this.LLILLL, this.LLILZ, null), 3), null);
            this.LL = 1;
            if (C099A.LIZJ(500L, c1416105gV, this) == objLJFF) {
                C1C7U.LIZIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1");
                return objLJFF;
            }
        }
        StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LLILLL;
        storyOnThisDayInboxCell.LLIZ = false;
        storyOnThisDayInboxCell.N5();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
