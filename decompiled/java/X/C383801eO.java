package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel$initFontListData$1$effectFontTask$1", f = "AnchorTextHeaderViewModel.kt", l = {172}, m = "invokeSuspend")
public final class C383801eO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TextHeaderBoardTextFontStyleData>>, Object> {
    public int LL;
    public final /* synthetic */ AnchorTextHeaderViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C383801eO(AnchorTextHeaderViewModel anchorTextHeaderViewModel, Context context, InterfaceC1364105Vn<? super C383801eO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anchorTextHeaderViewModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C383801eO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC397701gd interfaceC397701gdYn2;
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1$effectFontTask$1");
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
            obj = (List) this.LLILLJJLI.LLJILLL.getValue();
            if (obj == 0 || obj.isEmpty()) {
                AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LLILLJJLI;
                Context context = this.LLILLL;
                this.LL = 1;
                anchorTextHeaderViewModel.getClass();
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                anchorTextHeaderViewModel.NQ2("getBoardLokiFontList");
                C020W c020w = new C020W(c2252611DEt, anchorTextHeaderViewModel, 3);
                if (context != null && (interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2()) != null) {
                    interfaceC397701gdYn2.LJIILJJIL("text_header", false, new C513201zG(c020w, 0));
                }
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1$effectFontTask$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1$effectFontTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TextHeaderBoardTextFontStyleData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
