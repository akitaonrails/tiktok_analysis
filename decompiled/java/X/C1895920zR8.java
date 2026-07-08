package X;

import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.touchpoint.data.datasource.RequestDataSource$tryRequestWhenMainOnResume$1", f = "RequestDataSource.kt", l = {105}, m = "invokeSuspend")
public final class C1895920zR8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1897590zTp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895920zR8(C1897590zTp c1897590zTp, InterfaceC1364105Vn<? super C1895920zR8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1897590zTp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1895920zR8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long jLongValue;
        boolean zLJJIFFI;
        C1C7U.LIZ("RequestDataSource@89e6.tryRequestWhenMainOnResume$1");
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
            long jLIZ = C1899200zWQ.LIZ(C1899200zWQ.LIZ);
            int iNextInt = AbstractC19994813Le.Default.nextInt(0, (C0BT0.LIZ() * 60) + 1);
            if (C0BT0.LIZIZ) {
                iNextInt = 0;
            }
            Long lLJFF = C2286608xc.LJFF((jLIZ + ((long) iNextInt)) - ((long) C1899200zWQ.LIZIZ()));
            if (lLJFF.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                lLJFF = null;
            }
            if (lLJFF != null) {
                jLongValue = lLJFF.longValue();
            } else {
                jLongValue = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue * 1000, this) == objLJFF) {
                C1C7U.LIZIZ("RequestDataSource@89e6.tryRequestWhenMainOnResume$1");
                return objLJFF;
            }
        }
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService != null) {
            zLJJIFFI = iTouchPointModuleService.LJJIFFI();
        } else {
            zLJJIFFI = true;
        }
        if (zLJJIFFI) {
            C1897590zTp c1897590zTp = this.LLILLJJLI;
            if (c1897590zTp.LIZ.getLong(c1897590zTp.LIZIZ, 0L) != 0) {
                C1899200zWQ c1899200zWQ = C1899200zWQ.LIZ;
                C1897590zTp c1897590zTp2 = this.LLILLJJLI;
                if (!c1899200zWQ.LIZJ(c1897590zTp2.LIZ.getLong(c1897590zTp2.LIZIZ, 0L))) {
                    C1897590zTp c1897590zTp3 = this.LLILLJJLI;
                    Integer numLJ = C2286608xc.LJ(2);
                    c1897590zTp3.getClass();
                    try {
                        c1897590zTp3.LIZJ(numLJ, null, null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            C0BT0.LIZIZ = false;
        } else {
            C0BT0.LIZIZ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestDataSource@89e6.tryRequestWhenMainOnResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
