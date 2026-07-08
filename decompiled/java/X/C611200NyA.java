package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl$updateUserStory$written$1", f = "StoryCollectionStoreServiceImpl.kt", l = {267}, m = "invokeSuspend")
public final class C611200NyA extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ UserStory LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611200NyA(String str, UserStory userStory, InterfaceC1364105Vn<? super C611200NyA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = userStory;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611200NyA c611200NyA = new C611200NyA(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c611200NyA.LLILLJJLI = obj;
        return c611200NyA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.updateUserStory$written$1");
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
            InterfaceC611220NyC interfaceC611220NyCLIZIZ = ((SkylightUnifiedDB) this.LLILLJJLI).LIZIZ();
            String str = this.LLILLL;
            UserStory userStory = this.LLILZ;
            this.LL = 1;
            if (interfaceC611220NyCLIZIZ.LIZIZ(str, userStory, this) == objLJFF) {
                C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.updateUserStory$written$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.updateUserStory$written$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
