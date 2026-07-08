package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl$batchRead$rows$1", f = "StoryCollectionStoreServiceImpl.kt", l = {99}, m = "invokeSuspend")
public final class C611210NyB extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super List<? extends C611300NyK>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611210NyB(List<String> list, InterfaceC1364105Vn<? super C611210NyB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611210NyB c611210NyB = new C611210NyB(this.LLILLL, interfaceC1364105Vn);
        c611210NyB.LLILLJJLI = obj;
        return c611210NyB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.batchRead$rows$1");
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
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = interfaceC611220NyCLIZIZ.LIZLLL(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchRead$rows$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchRead$rows$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super List<? extends C611300NyK>> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
