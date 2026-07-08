package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.LyricFetcher$fetch$2", f = "LyricFetcher.kt", l = {83}, m = "invokeSuspend")
public final class C328700Cua extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C328730Cud LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328700Cua(C328730Cud c328730Cud, String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C328700Cua> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c328730Cud;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328700Cua(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LyricFetcher@a662.fetch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C328710Cub c328710Cub = new C328710Cub(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c328710Cub);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LyricFetcher@a662.fetch$2");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            this.LLILLJJLI.LIZJ.LIZLLL(this.LLILLL, str);
            this.LLILZ.invoke(str);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILZIL.invoke(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricFetcher@a662.fetch$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
