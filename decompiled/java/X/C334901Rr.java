package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel$initFontListData$1", f = "AnchorTextHeaderViewModel.kt", l = {178}, m = "invokeSuspend")
public final class C334901Rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnchorTextHeaderViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334901Rr(AnchorTextHeaderViewModel anchorTextHeaderViewModel, Context context, InterfaceC1364105Vn<? super C334901Rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anchorTextHeaderViewModel;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C334901Rr c334901Rr = new C334901Rr(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c334901Rr.LLILLJJLI = obj;
        return c334901Rr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJLIIIL = obj;
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String strLJJLIIIJ = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C383801eO(this.LLILLL, this.LLILZ, null), 2);
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1");
                return objLJFF;
            }
        }
        Iterable iterable = (Iterable) objLJLIIIL;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect List, ");
        if (iterable != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, "\n", null, null, 0, null, AnonymousClass0207.get$arr$(19), 30);
        }
        sbLIZ.append(strLJJLIIIJ);
        anchorTextHeaderViewModel.NQ2(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.LLJILLL.setValue((List<TextHeaderBoardTextFontStyleData>) iterable);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.initFontListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
