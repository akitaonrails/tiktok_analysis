package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM$unCollectAddYoursTopic$1", f = "AddYoursCollectionListVM.kt", l = {58}, m = "invokeSuspend")
public final class C615040OAk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddYoursCollectionListVM LLILLJJLI;
    public final /* synthetic */ C615070OAn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615040OAk(C615070OAn c615070OAn, AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addYoursCollectionListVM;
        this.LLILLL = c615070OAn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615040OAk(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AddYoursCollectionListVM@bf39.unCollectAddYoursTopic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC614980OAe interfaceC614980OAe = (InterfaceC614980OAe) this.LLILLJJLI.LL.getValue().getOperator();
                long j = this.LLILLL.LL;
                this.LL = 1;
                if (interfaceC614980OAe.LLJJLIIIJLLLLLLLZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.unCollectAddYoursTopic$1");
                    return objLJFF;
                }
            }
            AddYoursTopic addYoursTopic = this.LLILLL.LLILLJJLI;
            c098200Yq = addYoursTopic.copy(addYoursTopic.topicId, addYoursTopic.text, addYoursTopic.inviterAvatars, addYoursTopic.inviterCount, addYoursTopic.suggestInviteeAvatars, addYoursTopic.videoCount, addYoursTopic.video, addYoursTopic.fromQuestion, 0, addYoursTopic.viewerInvited, addYoursTopic.eoyCampaign, addYoursTopic.eoyCampaignSchema, addYoursTopic.topicType);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLILLJJLI.setState(new AwS588S0100000_9(c098200Yq, 492));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.unCollectAddYoursTopic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
