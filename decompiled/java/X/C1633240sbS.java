package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.HorizontalPanelRequestManagerImpl$retry$1", f = "HorizontalPanelRequestManager.kt", l = {311}, m = "invokeSuspend")
public final class C1633240sbS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1633280sbW LLILLJJLI;
    public C1633750scH LLILLL;
    public InterfaceC1633390sbh LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1633280sbW LLILZLL;
    public final /* synthetic */ C1633750scH LLIZ;
    public final /* synthetic */ InterfaceC1633390sbh LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633240sbS(C1633280sbW c1633280sbW, C1633750scH c1633750scH, InterfaceC1633390sbh interfaceC1633390sbh, InterfaceC1364105Vn<? super C1633240sbS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1633280sbW;
        this.LLIZ = c1633750scH;
        this.LLIZLLLIL = interfaceC1633390sbh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633240sbS(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1633280sbW c1633280sbW;
        C1DEV c1dev;
        C1633750scH c1633750scH;
        InterfaceC1633390sbh interfaceC1633390sbh;
        C1C7U.LIZ("HorizontalPanelRequestManagerImpl@e132.retry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC1633390sbh = this.LLILZ;
                c1633750scH = this.LLILLL;
                c1633280sbW = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1633280sbW = this.LLILZLL;
            c1dev = c1633280sbW.LIZLLL;
            c1633750scH = this.LLIZ;
            interfaceC1633390sbh = this.LLIZLLLIL;
            this.LL = c1dev;
            this.LLILLJJLI = c1633280sbW;
            this.LLILLL = c1633750scH;
            this.LLILZ = interfaceC1633390sbh;
            this.LLILZIL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalPanelRequestManagerImpl@e132.retry$1");
                return objLJFF;
            }
        }
        try {
            c1633280sbW.LJFF = c1633750scH;
            c1633280sbW.LJI = interfaceC1633390sbh;
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("HorizontalPanelRequestManagerImpl@e132.retry$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
