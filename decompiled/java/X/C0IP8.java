package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IP8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel$requestFontList$1", f = "BoardTextDynamicStyleViewModel.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0IP8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BoardTextDynamicStyleViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IP8(BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel, InterfaceC1364105Vn<? super C0IP8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = boardTextDynamicStyleViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IP8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardTextDynamicStyleViewModel@9bd6.requestFontList$1");
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
            BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel = this.LLILLJJLI;
            this.LL = 1;
            if (boardTextDynamicStyleViewModel.vQ2(this) == objLJFF) {
                C1C7U.LIZIZ("BoardTextDynamicStyleViewModel@9bd6.requestFontList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BoardTextDynamicStyleViewModel@9bd6.requestFontList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
