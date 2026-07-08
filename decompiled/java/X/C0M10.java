package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M10, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$onPublishStatusUpdate$2", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C0M10 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M10(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C0M10> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0M10 c0m10 = new C0M10(this.LLILLJJLI, interfaceC1364105Vn);
        c0m10.LL = obj;
        return c0m10;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC561350Lzx interfaceC561350LzxVQ2;
        C1C7U.LIZ("DraftBoxFragment@80e.onPublishStatusUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
        try {
            DraftBoxPageViewModel draftBoxPageViewModelDS = draftBoxFragment.dS();
            if (draftBoxPageViewModelDS != null && (interfaceC561350LzxVQ2 = draftBoxPageViewModelDS.vQ2()) != null) {
                interfaceC561350LzxVQ2.clearAll();
            }
            C0M0P c0m0p = draftBoxFragment.LLLLLILLIL;
            if (c0m0p != null) {
                draftBoxFragment.lI(Collections.singletonList(c0m0p));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (DraftBoxFragment.LLLLLJLJLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxFragment@80e.onPublishStatusUpdate$2");
            return unit;
        }
        if (draftBoxFragment.getContext() == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxFragment@80e.onPublishStatusUpdate$2");
            return unit2;
        }
        DraftBoxFragment.LLLLLJLJLL = true;
        C1389890mGx c1389890mGx = new C1389890mGx(draftBoxFragment);
        c1389890mGx.LJIIJ(draftBoxFragment.getString(2131821841, C0M1F.LIZ(draftBoxFragment.LLJZ)));
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.onPublishStatusUpdate$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
