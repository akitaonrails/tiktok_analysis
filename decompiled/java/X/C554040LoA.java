package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.component.MentionListComponent$refreshMentionData$1", f = "MentionListComponent.kt", l = {466}, m = "invokeSuspend")
public final class C554040LoA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C554100LoG LLILLJJLI;
    public final /* synthetic */ List<MentionDataItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554040LoA(C554100LoG c554100LoG, List<MentionDataItem> list, InterfaceC1364105Vn<? super C554040LoA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c554100LoG;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554040LoA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        C1C7U.LIZ("MentionListComponent@a6a.refreshMentionData$1");
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
            InterfaceC554050LoB recommendDataSource$tools_ai_uikit_df_release = this.LLILLJJLI.LLJILLL.getRecommendDataSource$tools_ai_uikit_df_release();
            if (recommendDataSource$tools_ai_uikit_df_release != null) {
                List<MentionDataItem> list = this.LLILLL;
                ArrayList arrayList = new ArrayList();
                Iterator<MentionDataItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().uid;
                    if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                        arrayList.add(lLJIILIIL);
                    }
                }
                this.LL = 1;
                obj = recommendDataSource$tools_ai_uikit_df_release.LIZ(arrayList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MentionListComponent@a6a.refreshMentionData$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MentionListComponent@a6a.refreshMentionData$1");
            return unit;
        }
        List list2 = (List) obj;
        if (list2 != null) {
            this.LLILLJJLI.K6(new AwS374S0200000_8(list2, this.LLILLL, (List<MentionDataItem>) 27));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MentionListComponent@a6a.refreshMentionData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
