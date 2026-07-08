package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.component.MentionListComponent$checkValidationAndRefreshList$realList$1", f = "MentionListComponent.kt", l = {192}, m = "invokeSuspend")
public final class C554070LoD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MentionDataItem>>, Object> {
    public int LL;
    public final /* synthetic */ C554100LoG LLILLJJLI;
    public final /* synthetic */ List<MentionDataItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554070LoD(C554100LoG c554100LoG, List<MentionDataItem> list, InterfaceC1364105Vn<? super C554070LoD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c554100LoG;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554070LoD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListComponent@a6a.checkValidationAndRefreshList$realList$1");
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
                this.LL = 1;
                obj = recommendDataSource$tools_ai_uikit_df_release.LIZIZ(list, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MentionListComponent@a6a.checkValidationAndRefreshList$realList$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("MentionListComponent@a6a.checkValidationAndRefreshList$realList$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MentionDataItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
