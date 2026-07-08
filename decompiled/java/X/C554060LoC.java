package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.component.MentionListComponent$onDestroy$1", f = "MentionListComponent.kt", l = {492}, m = "invokeSuspend")
public final class C554060LoC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C554100LoG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554060LoC(C554100LoG c554100LoG, InterfaceC1364105Vn<? super C554060LoC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c554100LoG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554060LoC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListComponent@a6a.onDestroy$1");
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
                this.LL = 1;
                if (recommendDataSource$tools_ai_uikit_df_release.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("MentionListComponent@a6a.onDestroy$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionListComponent@a6a.onDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
