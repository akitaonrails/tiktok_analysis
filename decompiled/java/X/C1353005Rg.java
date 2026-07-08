package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$2$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C1353005Rg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoContentPreviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353005Rg(TakoContentPreviewAssem takoContentPreviewAssem, InterfaceC1364105Vn<? super C1353005Rg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoContentPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1353005Rg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LL.LLJI.getValue();
        if (takoChatUIAbility != null) {
            takoChatUIAbility.x4();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
