package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedStatusResponse;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0P36, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel$fetchFeedStatus$1", f = "VibeFeedConsumeViewModel.kt", l = {489}, m = "invokeSuspend")
public final class C0P36 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VibeFeedConsumeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P36(VibeFeedConsumeViewModel vibeFeedConsumeViewModel, InterfaceC1364105Vn<? super C0P36> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedConsumeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0P36(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        ?? arrayList;
        List<VibeFeedUser> list;
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.fetchFeedStatus$1");
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
            C0P3H c0p3h = (C0P3H) this.LLILLJJLI.LL.getValue().getOperator();
            String strLIZ = C1575440r6E.LIZ();
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel = this.LLILLJJLI;
            String str = vibeFeedConsumeViewModel.LLJI;
            C0P31 c0p31 = vibeFeedConsumeViewModel.LLILZ;
            if (c0p31 == null || (conversationId = c0p31.getConversationId()) == null) {
                conversationId = "";
            }
            EnumC912680ZrG enumC912680ZrG = this.LLILLJJLI.LLILZLL;
            this.LL = 1;
            obj = c0p3h.R(strLIZ, str, conversationId, enumC912680ZrG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.fetchFeedStatus$1");
                return objLJFF;
            }
        }
        VibeFeedStatusResponse vibeFeedStatusResponse = (VibeFeedStatusResponse) obj;
        if (C1575980r76.LIZJ(vibeFeedStatusResponse)) {
            if (vibeFeedStatusResponse != null && (list = vibeFeedStatusResponse.visitFinishedUsers) != null) {
                arrayList = new ArrayList();
                for (VibeFeedUser vibeFeedUser : list) {
                    VibeFeedUser vibeFeedUser2 = vibeFeedUser;
                    List<String> list2 = vibeFeedStatusResponse.visitFinishedUids;
                    if (list2 != null && C13LP.LJJJJ(vibeFeedUser2.userId, list2)) {
                        arrayList.add(vibeFeedUser);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            this.LLILLJJLI.setState(new AwS375S0200000_9((List) arrayList, (List<VibeFeedUser>) vibeFeedStatusResponse, (VibeFeedStatusResponse) 131));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.fetchFeedStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
