package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.h5.cache.MinisH5CacheCleaner$notifyDelete$1", f = "MinisH5CacheCleaner.kt", l = {}, m = "invokeSuspend")
public final class C2129508Vx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2129508Vx(String str, String str2, InterfaceC1364105Vn<? super C2129508Vx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2129508Vx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        C1C7U.LIZ("MinisH5CacheCleaner@7c74.notifyDelete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String absolutePath = C08QA.LJIL(C08QA.LJIL((File) C1528780psy.LIZ.getValue(), this.LL), this.LLILLJJLI).getAbsolutePath();
        try {
            C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
            if (c2137908Zd.LJFF(absolutePath)) {
                c2137908Zd.LIZLLL(absolutePath);
                File parentFile = new C0VSJ(absolutePath).getParentFile();
                if (parentFile != null && (fileArrListFiles = parentFile.listFiles()) != null && fileArrListFiles.length == 0) {
                    c2137908Zd.LIZLLL(parentFile.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisH5CacheCleaner@7c74.notifyDelete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
