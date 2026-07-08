package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.adddrafts.AddDraftsComponent$loadLatestData$1$itemsDeferred$1", f = "AddDraftsComponent.kt", l = {}, m = "invokeSuspend")
public final class C1410110mnZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1410170mnf LL;
    public final /* synthetic */ C0M4M LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410110mnZ(C1410170mnf c1410170mnf, C0M4M c0m4m, int i, InterfaceC1364105Vn<? super C1410110mnZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1410170mnf;
        this.LLILLJJLI = c0m4m;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410110mnZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AwemeDraft> listQueryDraftsInfoWithLimited;
        C1C7U.LIZ("AddDraftsComponent@623d.loadLatestData$1$itemsDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IAVDraftService iAVDraftServiceK4 = this.LL.K4();
        Integer numLJ = null;
        if (iAVDraftServiceK4 != null) {
            listQueryDraftsInfoWithLimited = iAVDraftServiceK4.queryDraftsInfoWithLimited(this.LLILLJJLI, this.LLILLL);
        } else {
            listQueryDraftsInfoWithLimited = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadData:: list = ");
        if (listQueryDraftsInfoWithLimited != null) {
            numLJ = C2286608xc.LJ(listQueryDraftsInfoWithLimited.size());
        }
        sbLIZ.append(numLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.i3(new AwS601S0100000_22(listQueryDraftsInfoWithLimited, (List<CreateAnchorInfo>) 871));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1$itemsDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
