package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.util.StickerUtils$showStickerInPanel$1", f = "StickerUtils.kt", l = {212}, m = "invokeSuspend")
public final class C438580HHs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C438580HHs(int i, long j, Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C438580HHs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438580HHs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerUtils@5e46.showStickerInPanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C0HQV.LIZ.getClass();
                InterfaceC447740Hh6 interfaceC447740Hh6 = (InterfaceC447740Hh6) C0HQV.LIZIZ.getValue();
                int i2 = this.LLILLJJLI;
                Long lLJFF = C2286608xc.LJFF(this.LLILLL);
                this.LL = 1;
                if (interfaceC447740Hh6.LJJII(i2, lLJFF, true, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerUtils@5e46.showStickerInPanel$1");
                    return objLJFF;
                }
            }
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            Function1<Throwable, Unit> function1 = this.LLILZ;
            if (function1 != null) {
                function1.invoke(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerUtils@5e46.showStickerInPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
