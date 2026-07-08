package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;

/* JADX INFO: renamed from: X.0Ia6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel", f = "BoardTextDynamicStyleViewModel.kt", l = {73, 93}, m = "requestFontApi")
public final class C468880Ia6 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BoardTextDynamicStyleViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468880Ia6(BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel, InterfaceC1364105Vn<? super C468880Ia6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = boardTextDynamicStyleViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardTextDynamicStyleViewModel@9bd6.requestFontApi$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(this);
        C1C7U.LIZIZ("BoardTextDynamicStyleViewModel@9bd6.requestFontApi$1");
        return objVQ2;
    }
}
