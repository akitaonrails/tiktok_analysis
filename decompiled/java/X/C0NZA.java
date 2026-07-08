package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent$startFetchMessageList$2$1", f = "PigeonMessageListComponent.kt", l = {}, m = "invokeSuspend")
public final class C0NZA extends C09AX implements Function2<C0Y8T, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PigeonMessageListComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZA(PigeonMessageListComponent pigeonMessageListComponent, InterfaceC1364105Vn<? super C0NZA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonMessageListComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NZA c0nza = new C0NZA(this.LLILLJJLI, interfaceC1364105Vn);
        c0nza.LL = obj;
        return c0nza;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.startFetchMessageList$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PigeonMessageListComponent pigeonMessageListComponent = this.LLILLJJLI;
        pigeonMessageListComponent.LJJLIIIJL().LJII();
        pigeonMessageListComponent.LLILLL.setValue(C0NZH.LOADING);
        pigeonMessageListComponent.LLJILJILJ.setValue(C0NZF.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.startFetchMessageList$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0Y8T c0y8t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0y8t, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
