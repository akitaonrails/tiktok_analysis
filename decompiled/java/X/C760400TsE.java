package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.playbook.PlaybookViewModel$onPlaybookStartSuccess$1$1", f = "PlaybookViewModel.kt", l = {}, m = "invokeSuspend")
public final class C760400TsE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0UPF LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760400TsE(C0UPF c0upf, LiveEffect liveEffect, InterfaceC1364105Vn<? super C760400TsE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0upf;
        this.LLILLJJLI = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760400TsE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("PlaybookViewModel@e436.onPlaybookStartSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C768910UEf c768910UEf = this.LL.LIZJ;
        if (c768910UEf != null) {
            c768910UEf.LJFF(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PlaybookViewModel@e436.onPlaybookStartSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
