package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.AddYoursRecommendManager$observeAddYoursRecommendResult$2$1$1", f = "AddYoursRecommend.kt", l = {116}, m = "invokeSuspend")
public final class C445390HdJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C11PQ<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445390HdJ(String str, C11PQ<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp> c11pq, InterfaceC1364105Vn<? super C445390HdJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c11pq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445390HdJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C1C7U.LIZ("AddYoursRecommendManager@6e64.observeAddYoursRecommendResult$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                objLJ = ((C189200o6) obj).m10unboximpl();
            } else {
                C155000ia.LIZIZ(obj);
                C1429400nIg.LIZ.getClass();
                AddYoursStickerTopicRepo addYoursStickerTopicRepo = (AddYoursStickerTopicRepo) C1429400nIg.LIZLLL.getValue();
                String str = this.LLILLJJLI;
                this.LL = 1;
                objLJ = addYoursStickerTopicRepo.LJ(str, this);
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("AddYoursRecommendManager@6e64.observeAddYoursRecommendResult$2$1$1");
                    return objLJFF;
                }
            }
            C11PQ<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp> c11pq = this.LLILLL;
            if (C189200o6.m8isSuccessimpl(objLJ)) {
                c11pq.onNext((AddYoursStickerTopicRepoApi.AddYoursTopicRecommendResp) objLJ);
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursRecommendManager@6e64.observeAddYoursRecommendResult$2$1$1");
        return unit;
    }
}
