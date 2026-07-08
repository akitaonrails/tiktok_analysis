package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptsListView$collectState$2", f = "AILivePhotoPromptsListView.kt", l = {}, m = "invokeSuspend")
public final class C433170Gyh extends C09AX implements Function2<List<? extends PromptModel>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C438070HFt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433170Gyh(C438070HFt c438070HFt, InterfaceC1364105Vn<? super C433170Gyh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c438070HFt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C433170Gyh c433170Gyh = new C433170Gyh(this.LLILLJJLI, interfaceC1364105Vn);
        c433170Gyh.LL = obj;
        return c433170Gyh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C434660H2q c434660H2q;
        C1C7U.LIZ("AILivePhotoPromptsListView@41b4.collectState$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJLILLLLZI = (List) this.LL;
        AbstractC21673619ry adapter = this.LLILLJJLI.getPromptListView().getAdapter();
        if ((adapter instanceof C434660H2q) && (c434660H2q = (C434660H2q) adapter) != null) {
            if (listLJLILLLLZI.size() >= C0C64.LJIILLIIL().LJIJ(31744, 10, "studio_story_ai_live_photo_prompt_page_count", true)) {
                listLJLILLLLZI = C13LP.LJLILLLLZI(C433180Gyi.LL, listLJLILLLLZI);
            }
            c434660H2q.LLILLJJLI = C13LP.LJLILLLLZI(this.LLILLJJLI.LLILZIL, listLJLILLLLZI);
            c434660H2q.notifyDataSetChanged();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AILivePhotoPromptsListView@41b4.collectState$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoPromptsListView@41b4.collectState$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends PromptModel> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
