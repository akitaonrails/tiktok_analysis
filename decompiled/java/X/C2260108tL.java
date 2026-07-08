package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.files.MediaLocalCacheHelper$clearMessageLocalMediaFile$1", f = "MediaLocalFile.kt", l = {}, m = "invokeSuspend")
public final class C2260108tL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260108tL(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C2260108tL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2260108tL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String cacheResourceDirPath;
        C1C7U.LIZ("MediaLocalCacheHelper@c68a.clearMessageLocalMediaFile$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            cacheResourceDirPath = new DMPath(this.LL.getUuid()).getCacheResourceDirPath(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (new C0VSJ(cacheResourceDirPath).exists()) {
            C2260008tK.LJ(cacheResourceDirPath);
        } else {
            String creationUuid = this.LL.getCreationUuid();
            if (creationUuid == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MediaLocalCacheHelper@c68a.clearMessageLocalMediaFile$1");
                return unit;
            }
            C2256931DVj.LIZ(creationUuid);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaLocalCacheHelper@c68a.clearMessageLocalMediaFile$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
