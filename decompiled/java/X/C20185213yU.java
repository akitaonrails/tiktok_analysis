package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM$refreshStorageManagerDeviceInfo$1", f = "DiskManagerSettingsVM.kt", l = {222}, m = "invokeSuspend")
public final class C20185213yU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ DiskManagerSettingsVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20185213yU(Context context, DiskManagerSettingsVM diskManagerSettingsVM, InterfaceC1364105Vn<? super C20185213yU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = diskManagerSettingsVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20185213yU(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        C1C7U.LIZ("DiskManagerSettingsVM@985e.refreshStorageManagerDeviceInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj4 = this.LL;
                C155000ia.LIZIZ(obj);
                obj3 = obj4;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Context context = this.LLILLL;
            try {
                C20185513yX c20185513yX = new C20185513yX(null, 15);
                C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(context);
                EnumC1335310kqv enumC1335310kqvLJ = C1336210ksN.LJ(c0wykLJIILLIIL.LIZJ, EnumC2426409f4.ACTIVE_CLEAN_PAGE);
                if (C1336210ksN.LIZ() || enumC1335310kqvLJ == EnumC1335310kqv.EXTREME_LOW) {
                    C0C88.LIZ(context);
                    c20185513yX.LIZLLL = EnumC1335310kqv.EXTREME_LOW;
                }
                if (((Boolean) C07GX.LIZIZ.getValue()).booleanValue()) {
                    C0C88.LIZ(context);
                }
                long jLIZ = c0wykLJIILLIIL.LIZ();
                if (jLIZ <= 0) {
                    jLIZ = c0wykLJIILLIIL.LJ;
                }
                c20185513yX.LIZ = jLIZ;
                c20185513yX.LIZIZ = c0wykLJIILLIIL.LIZIZ;
                c20185513yX.LIZJ = c0wykLJIILLIIL.LIZ;
                C189200o6.m2constructorimpl(c20185513yX);
                obj2 = c20185513yX;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
            DiskManagerSettingsVM diskManagerSettingsVM = this.LLILZ;
            Context context2 = this.LLILLL;
            boolean zM8isSuccessimpl = C189200o6.m8isSuccessimpl(obj2);
            obj3 = obj2;
            if (zM8isSuccessimpl) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C20185313yV c20185313yV = new C20185313yV(diskManagerSettingsVM, (C20185513yX) obj2, context2, null);
                this.LL = obj2;
                this.LLILLJJLI = 1;
                obj3 = obj2;
                if (C23250099c.LJI(this, abstractC2238408pq, c20185313yV) == objLJFF) {
                    C1C7U.LIZIZ("DiskManagerSettingsVM@985e.refreshStorageManagerDeviceInfo$1");
                    return objLJFF;
                }
            }
        }
        C189200o6.m5exceptionOrNullimpl(obj3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.refreshStorageManagerDeviceInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
