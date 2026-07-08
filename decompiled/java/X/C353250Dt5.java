package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.FreeLayerPanelUISlotComponent$refreshItemEffectIcon$1$effectIconTask$1", f = "FreeLayerPanelUISlotComponent.kt", l = {464}, m = "invokeSuspend")
public final class C353250Dt5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C0E1I LLILLJJLI;
    public final /* synthetic */ List<C352950Dsb> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353250Dt5(C0E1I c0e1i, List<C352950Dsb> list, InterfaceC1364105Vn<? super C353250Dt5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e1i;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353250Dt5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC352930DsZ interfaceC352930DsZLJ;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie;
        C1C7U.LIZ("FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1$effectIconTask$1");
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
            C0E0W c0e0wU6 = this.LLILLJJLI.u6();
            List<C352950Dsb> list = this.LLILLL;
            C0E48 c0e48F4 = this.LLILLJJLI.F4();
            if (c0e48F4 != null && (interfaceC353240Dt4Ie = c0e48F4.Ie()) != null) {
                interfaceC352930DsZLJ = interfaceC353240Dt4Ie.LJ();
            } else {
                interfaceC352930DsZLJ = null;
            }
            this.LL = 1;
            obj = c0e0wU6.LIZ(list, interfaceC352930DsZLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1$effectIconTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1$effectIconTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
