package X;

import com.ss.android.ugc.aweme.im.common.model.GroupChatRecommendInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommend.RecommendCreateGroupDataMgr$doRequest$2", f = "RecommendCreateGroupDataMgr.kt", l = {84}, m = "invokeSuspend")
public final class C05LC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupChatRecommendInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LC(GroupChatRecommendInfo groupChatRecommendInfo, InterfaceC1364105Vn<? super C05LC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatRecommendInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendCreateGroupDataMgr@4dcb.doRequest$2");
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
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List<Long> list = this.LLILLJJLI.recUserIds;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().longValue()));
            }
            this.LL = 1;
            if (interfaceC1725106pFLIZ.LJII("im_group_chat_permission", arrayList, this, false, false, false) == objLJFF) {
                C1C7U.LIZIZ("RecommendCreateGroupDataMgr@4dcb.doRequest$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendCreateGroupDataMgr@4dcb.doRequest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
