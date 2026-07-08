package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.FoldableSectionHeaderAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.FoldableSectionHeaderAssem$rotateChevron$1", f = "FoldableSectionHeader.kt", l = {110}, m = "invokeSuspend")
public final class C01VC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ FoldableSectionHeaderAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VC(boolean z, FoldableSectionHeaderAssem foldableSectionHeaderAssem, InterfaceC1364105Vn<? super C01VC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = foldableSectionHeaderAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01VC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        C1C7U.LIZ("FoldableSectionHeaderAssem@b8ee.rotateChevron$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                j = 200;
            } else {
                j = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FoldableSectionHeaderAssem@b8ee.rotateChevron$1");
                return objLJFF;
            }
        }
        View view = this.LLILLL.LLJZIJLIL;
        if (view != null) {
            if (this.LLILLJJLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FoldableSectionHeaderAssem@b8ee.rotateChevron$1");
        return unit;
    }
}
