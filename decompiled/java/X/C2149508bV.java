package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$start$1", f = "BulletinVoicePublishPipeline.kt", l = {126, 135}, m = "invokeSuspend")
public final class C2149508bV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2149708bX LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ InterfaceC2149308bT LLIZ;
    public final /* synthetic */ C2152408by LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149508bV(C2149708bX c2149708bX, String str, String str2, long j, InterfaceC2149308bT interfaceC2149308bT, C2152408by c2152408by, InterfaceC1364105Vn<? super C2149508bV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2149708bX;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = j;
        this.LLIZ = interfaceC2149308bT;
        this.LLIZLLLIL = c2152408by;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2149508bV c2149508bV = new C2149508bV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c2149508bV.LLILLJJLI = obj;
        return c2149508bV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.start$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VoicePublishPipeline: top-level guard caught ");
                sbLIZ.append(th.getClass().getSimpleName());
                sbLIZ.append(": ");
                sbLIZ.append(th.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                this.LLIZLLLIL.LIZJ(-1L, null);
                C2149708bX c2149708bX = this.LLILLL;
                InterfaceC2149308bT interfaceC2149308bT = this.LLIZ;
                this.LLILLJJLI = null;
                this.LL = 2;
                if (c2149708bX.LIZ(interfaceC2149308bT, -1L, this) == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.start$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.start$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C2149708bX c2149708bX2 = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            long j = this.LLILZLL;
            InterfaceC2149308bT interfaceC2149308bT2 = this.LLIZ;
            C2152408by c2152408by = this.LLIZLLLIL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (c2149708bX2.LIZLLL(str, str2, j, interfaceC2149308bT2, c2152408by, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.start$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.start$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
