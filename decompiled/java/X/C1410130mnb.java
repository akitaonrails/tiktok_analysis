package X;

import android.util.Log;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel$preloadDraftsInfo$1$countDeferred$1", f = "EditorTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1410130mnb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ EditorTabViewModel LL;
    public final /* synthetic */ C0M4M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410130mnb(EditorTabViewModel editorTabViewModel, C0M4M c0m4m, InterfaceC1364105Vn<? super C1410130mnb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = editorTabViewModel;
        this.LLILLJJLI = c0m4m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410130mnb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iQueryDraftCount;
        C1C7U.LIZ("EditorTabViewModel@d14.preloadDraftsInfo$1$countDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditorTabViewModel editorTabViewModel = this.LL;
        IAVDraftService iAVDraftService = (IAVDraftService) editorTabViewModel.LLJ.getValue();
        if (iAVDraftService != null) {
            iQueryDraftCount = iAVDraftService.queryDraftCount(this.LLILLJJLI);
        } else {
            iQueryDraftCount = 0;
        }
        editorTabViewModel.LLIZ = iQueryDraftCount;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadDraftsInfo:: draftsCount = ");
        sbLIZ.append(this.LL.LLIZ);
        Integer numLJ = C2286608xc.LJ(Log.d("ETDraft", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("EditorTabViewModel@d14.preloadDraftsInfo$1$countDeferred$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
