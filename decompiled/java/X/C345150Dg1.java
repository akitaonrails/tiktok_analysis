package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.MediaPreProcessManager$processBeforeOnChosenResult$1$defers$1$1", f = "MediaPreProcessManager.kt", l = {107}, m = "invokeSuspend")
public final class C345150Dg1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ InterfaceC345200Dg6 LLILLL;
    public final /* synthetic */ C1DRG LLILZ;
    public final /* synthetic */ Intent LLILZIL;
    public final /* synthetic */ C345210Dg7 LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345150Dg1(C013C c013c, InterfaceC345200Dg6 interfaceC345200Dg6, C1DRG c1drg, Intent intent, C345210Dg7 c345210Dg7, long j, InterfaceC1364105Vn<? super C345150Dg1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = interfaceC345200Dg6;
        this.LLILZ = c1drg;
        this.LLILZIL = intent;
        this.LLILZLL = c345210Dg7;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345150Dg1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$defers$1$1");
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
            if (this.LLILLJJLI.element) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$defers$1$1");
                return unit;
            }
            InterfaceC345200Dg6 interfaceC345200Dg6 = this.LLILLL;
            C1DRG c1drg = this.LLILZ;
            Intent intent = this.LLILZIL;
            this.LL = 1;
            if (interfaceC345200Dg6.LIZJ(c1drg, intent, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$defers$1$1");
                return objLJFF;
            }
        }
        C345210Dg7 c345210Dg7 = this.LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL.getName());
        sbLIZ.append(" process finish, cost time:");
        sbLIZ.append(System.currentTimeMillis() - this.LLIZ);
        sbLIZ.append("ms, canceled: ");
        sbLIZ.append(this.LLILLJJLI.element);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c345210Dg7.getClass();
        C345210Dg7.LIZIZ(strLIZIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1$defers$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
