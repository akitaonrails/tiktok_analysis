package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$sendMessage$1", f = "DefaultIMUseCaseCenter.kt", l = {498, 506}, m = "invokeSuspend")
public final class C863660XuO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ InterfaceC863600XuI<C869590Y9l> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863660XuO(C863650XuN c863650XuN, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI, boolean z, InterfaceC1364105Vn<? super C863660XuO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c869590Y9l;
        this.LLILZ = interfaceC863600XuI;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863660XuO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.sendMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    objLIZIZ = ((C189200o6) obj).m10unboximpl();
                    C189200o6.m1boximpl(objLIZIZ);
                }
            } else {
                C155000ia.LIZIZ(obj);
                C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LL.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendMessage with msg ");
                sbLIZ.append(this.LLILLL.getUuid());
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMUseCaseCenter", C2188811AlT.LIZIZ(sbLIZ), 4);
                this.LLILLL.putLocalCache(2003, C2286608xc.LJFF(System.currentTimeMillis()));
                InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI = this.LLILZ;
                if (interfaceC863600XuI == null) {
                    C863920Xuo c863920Xuo = C0YC5.LJ;
                    C863650XuN c863650XuN = this.LLILLJJLI;
                    InterfaceC864330XvT interfaceC864330XvT = c863650XuN.LLILLJJLI;
                    C0YEM c0yem = c863650XuN.LL;
                    C869590Y9l c869590Y9l = this.LLILLL;
                    C0D2S<SendMessageResponseBody> c0d2sLJIIL = c863650XuN.LLILZIL.LJIIL();
                    boolean z = this.LLILZIL;
                    this.LL = 1;
                    objLIZIZ = c863920Xuo.LIZIZ(interfaceC864330XvT, c0yem, c869590Y9l, c0d2sLJIIL, z, this);
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.sendMessage$1");
                        return objLJFF;
                    }
                    C189200o6.m1boximpl(objLIZIZ);
                } else {
                    C863920Xuo c863920Xuo2 = C0YC5.LJ;
                    C863650XuN c863650XuN2 = this.LLILLJJLI;
                    InterfaceC864330XvT interfaceC864330XvT2 = c863650XuN2.LLILLJJLI;
                    C0YEM c0yem2 = c863650XuN2.LL;
                    C869590Y9l c869590Y9l2 = this.LLILLL;
                    C0D2S<SendMessageResponseBody> c0d2sLJIIL2 = c863650XuN2.LLILZIL.LJIIL();
                    boolean z2 = this.LLILZIL;
                    this.LL = 2;
                    if (c863920Xuo2.LIZJ(interfaceC864330XvT2, c0yem2, c869590Y9l2, interfaceC863600XuI, c0d2sLJIIL2, z2, this) == objLJFF) {
                        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.sendMessage$1");
                        return objLJFF;
                    }
                }
            }
            this.LLILLJJLI.LL.LJIIZILJ().LJFF().LIZLLL().LIZ(EnumC863790Xub.SEND_MSG);
            this.LLILLJJLI.LL.LJIIZILJ().getDomain().LIZIZ.LJIIJ(this.LLILLL.getUuid());
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.sendMessage$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LL.LJIIZILJ().LJFF().LIZLLL().LIZ(EnumC863790Xub.SEND_MSG);
            this.LLILLJJLI.LL.LJIIZILJ().getDomain().LIZIZ.LJIIJ(this.LLILLL.getUuid());
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
