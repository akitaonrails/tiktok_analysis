package X;

import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Q7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startDuet$1", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C15Q7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DuetConfig LL;
    public final /* synthetic */ C15Q6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15Q7(DuetConfig duetConfig, C15Q6 c15q6, InterfaceC1364105Vn<? super C15Q7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = duetConfig;
        this.LLILLJJLI = c15q6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15Q7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startDuet$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2354709Kn.LIZIZ(this.LL.getMp4Path())) {
            C2286708xd.LJFF(this.LL.getOriginVideo(), this.LL.getMp4Path());
        }
        DuetConfig duetConfig = this.LL;
        duetConfig.setWavPath(duetConfig.getMp4Path());
        this.LLILLJJLI.onSuccess(this.LL.getWidth(), this.LL.getHeight());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startDuet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
