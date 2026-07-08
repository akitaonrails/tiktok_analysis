package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08X5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$decompressPkg$1$1", f = "MinisNativeGameDownloadManager.kt", l = {803}, m = "invokeSuspend")
public final class C08X5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08X5(String str, InterfaceC1364105Vn<? super C08X5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08X5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MinisNativeGameDownloadManager@99.decompressPkg$1$1");
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
            C2390509Yh c2390509Yh = C2390509Yh.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c2390509Yh.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C08ZI(str, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.decompressPkg$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.decompressPkg$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
