package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.096s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$tryNextDownload$1", f = "KaraokeViewModel.kt", l = {1779}, m = "invokeSuspend")
public final class C23188096s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23188096s(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C23188096s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23188096s c23188096s = new C23188096s(this.LLILLL, interfaceC1364105Vn);
        c23188096s.LLILLJJLI = obj;
        return c23188096s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.099G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZIZ;
        Object obj2;
        C1C7U.LIZ("KaraokeViewModel@e9e0.tryNextDownload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                objLIZIZ = this.LLILLJJLI;
                try {
                    try {
                        C155000ia.LIZIZ(obj);
                        obj2 = objLIZIZ;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LIZIZ("KDownloader", "download canceled try next download");
                        obj2 = objLIZIZ;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            this.LLILLL.LLJJIJIIJIL.remove(objLIZIZ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("download task list = ");
                            sbLIZ.append(this.LLILLL.LLJJIJIIJIL.size());
                            C20441214yg.LIZIZ("KDownloader", C2188811AlT.LIZIZ(sbLIZ));
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            objLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, C099V.LAZY, new C0U1I(this.LLILLL, null), 1);
            this.LLILLL.LLJJIJIIJIL.add((AnonymousClass0957<Boolean>) objLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("download task list = ");
            sbLIZ2.append(this.LLILLL.LLJJIJIIJIL.size());
            C20441214yg.LIZIZ("KDownloader", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                this.LLILLJJLI = objLIZIZ;
                this.LL = 1;
                Object objLJLIIIL = objLIZIZ.LJLIIIL(this);
                obj2 = objLIZIZ;
                if (objLJLIIIL == objLJFF) {
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.tryNextDownload$1");
                    return objLJFF;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZIZ("KDownloader", "download canceled try next download");
                obj2 = objLIZIZ;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILLL.LLJJIJIIJIL.remove(objLIZIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("download task list = ");
                    sbLIZ3.append(this.LLILLL.LLJJIJIIJIL.size());
                    C20441214yg.LIZIZ("KDownloader", C2188811AlT.LIZIZ(sbLIZ3));
                    throw th;
                }
            }
        }
        this.LLILLL.LLJJIJIIJIL.remove(obj2);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("download task list = ");
        sbLIZ4.append(this.LLILLL.LLJJIJIIJIL.size());
        C20441214yg.LIZIZ("KDownloader", C2188811AlT.LIZIZ(sbLIZ4));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.tryNextDownload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
