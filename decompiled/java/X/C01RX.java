package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchVoiceListByOnlyCategory$2", f = "TTSRequestLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C01RX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<List<ReadTextEffectBean>> LL;
    public final /* synthetic */ C09SX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RX(List<List<ReadTextEffectBean>> list, C09SX c09sx, InterfaceC1364105Vn<? super C01RX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c09sx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchVoiceListByOnlyCategory$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<List<ReadTextEffectBean>> list = this.LL;
            C09SX c09sx = this.LLILLJJLI;
            for (List<ReadTextEffectBean> list2 : list) {
                c09sx.FY1(list2);
                arrayList.add(list2);
            }
            this.LLILLJJLI.LLILLL = arrayList;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchVoiceListByOnlyCategory$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
