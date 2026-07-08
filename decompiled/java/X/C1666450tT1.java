package X;

import com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel.EditUILayerViewState;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel.EditUILayerViewModel$uiState$1", f = "EditUILayerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1666450tT1 extends C09AX implements InterfaceC1631620sYq<C1666530tT9, C1666540tTA, InterfaceC1364105Vn<? super EditUILayerViewState>, Object> {
    public /* synthetic */ C1666530tT9 LL;
    public /* synthetic */ C1666540tTA LLILLJJLI;

    public C1666450tT1(InterfaceC1364105Vn<? super C1666450tT1> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditUILayerViewModel@3fe0.uiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditUILayerViewState editUILayerViewState = new EditUILayerViewState(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("EditUILayerViewModel@3fe0.uiState$1");
        return editUILayerViewState;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1666530tT9 c1666530tT9, C1666540tTA c1666540tTA, InterfaceC1364105Vn<? super EditUILayerViewState> interfaceC1364105Vn) {
        C1666450tT1 c1666450tT1 = new C1666450tT1(interfaceC1364105Vn);
        c1666450tT1.LL = c1666530tT9;
        c1666450tT1.LLILLJJLI = c1666540tTA;
        return c1666450tT1.invokeSuspend(Unit.LIZ);
    }
}
