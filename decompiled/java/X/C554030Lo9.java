package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.component.MentionListComponent$refreshMyself$3", f = "MentionListComponent.kt", l = {531}, m = "invokeSuspend")
public final class C554030Lo9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C554100LoG LL;
    public InterfaceC549270LgT LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C554100LoG LLILZ;
    public final /* synthetic */ InterfaceC549270LgT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554030Lo9(C554100LoG c554100LoG, InterfaceC549270LgT interfaceC549270LgT, InterfaceC1364105Vn<? super C554030Lo9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c554100LoG;
        this.LLILZIL = interfaceC549270LgT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554030Lo9(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C554100LoG c554100LoG;
        InterfaceC549270LgT interfaceC549270LgT;
        MentionDataItem mentionDataItem;
        C1C7U.LIZ("MentionListComponent@a6a.refreshMyself$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                interfaceC549270LgT = this.LLILLJJLI;
                c554100LoG = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Long lLJIILIIL = C2095008Iq.LJIILIIL(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            if (lLJIILIIL != null) {
                c554100LoG = this.LLILZ;
                interfaceC549270LgT = this.LLILZIL;
                long jLongValue = lLJIILIIL.longValue();
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshmyself uid: ");
                sbLIZ.append(jLongValue);
                c547140Ld2.LIZJ("MentionDataTest", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC554050LoB recommendDataSource$tools_ai_uikit_df_release = c554100LoG.LLJILLL.getRecommendDataSource$tools_ai_uikit_df_release();
                if (recommendDataSource$tools_ai_uikit_df_release != null) {
                    List listSingletonList = Collections.singletonList(C2286608xc.LJFF(jLongValue));
                    this.LL = c554100LoG;
                    this.LLILLJJLI = interfaceC549270LgT;
                    this.LLILLL = 1;
                    obj = recommendDataSource$tools_ai_uikit_df_release.LIZ(listSingletonList, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MentionListComponent@a6a.refreshMyself$3");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MentionListComponent@a6a.refreshMyself$3");
            return unit;
        }
        List list = (List) obj;
        if (list != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
            c554100LoG.LLJLLIL = C554100LoG.d6(interfaceC549270LgT, c554100LoG, mentionDataItem);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MentionListComponent@a6a.refreshMyself$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
