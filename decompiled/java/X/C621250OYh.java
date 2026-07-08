package X;

import Y.AgS101S1100000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinVoiceContentWidget$startObserving$1", f = "BulletinVoiceContentWidget.kt", l = {956}, m = "invokeSuspend")
public final class C621250OYh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C621210OYd LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621250OYh(C621210OYd c621210OYd, String str, InterfaceC1364105Vn<? super C621250OYh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c621210OYd;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621250OYh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceContentWidget@e67c.startObserving$1");
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
            C621370OYt c621370OYtLJIIJ = this.LLILLJJLI.LJIIJ();
            if (c621370OYtLJIIJ != null) {
                C1629806Zs c1629806Zs = new C1629806Zs(c621370OYtLJIIJ.LJIIIZ(this.LLILLL));
                AgS101S1100000_9 agS101S1100000_9 = new AgS101S1100000_9(this.LLILLJJLI, this.LLILLL, 3);
                this.LL = 1;
                if (c1629806Zs.collect(agS101S1100000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoiceContentWidget@e67c.startObserving$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceContentWidget@e67c.startObserving$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
