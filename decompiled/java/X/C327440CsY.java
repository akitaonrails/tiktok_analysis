package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$tryRecordRelation$1", f = "ReflowSideProcessor.kt", l = {371}, m = "invokeSuspend")
public final class C327440CsY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1234160iDm LLILLJJLI;
    public C1233510iCj LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1234160iDm LLILZLL;
    public final /* synthetic */ C1233510iCj LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327440CsY(C1234160iDm c1234160iDm, C1233510iCj c1233510iCj, String str, InterfaceC1364105Vn<? super C327440CsY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1234160iDm;
        this.LLIZ = c1233510iCj;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327440CsY(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1234160iDm c1234160iDm;
        C1DEV c1dev;
        C1233510iCj c1233510iCj;
        String str;
        C1C7U.LIZ("ReflowSideProcessor@9181.tryRecordRelation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILZ;
                c1233510iCj = this.LLILLL;
                c1234160iDm = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1234160iDm = this.LLILZLL;
            c1dev = c1234160iDm.LIZLLL;
            c1233510iCj = this.LLIZ;
            str = this.LLIZLLLIL;
            this.LL = c1dev;
            this.LLILLJJLI = c1234160iDm;
            this.LLILLL = c1233510iCj;
            this.LLILZ = str;
            this.LLILZIL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("ReflowSideProcessor@9181.tryRecordRelation$1");
                return objLJFF;
            }
        }
        try {
            C099G c099gLIZIZ = C23250099c.LIZIZ(c1234160iDm.LIZ, null, null, new C1233450iCd(true, c1233510iCj, str, null), 3);
            AnonymousClass0956 anonymousClass0956 = c1234160iDm.LJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1234160iDm.LJ = C23250099c.LIZLLL(c1234160iDm.LIZ, null, null, new C1233540iCm(c099gLIZIZ, c1233510iCj, c1234160iDm, null), 3);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReflowSideProcessor@9181.tryRecordRelation$1");
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
