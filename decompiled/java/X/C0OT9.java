package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OT9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem$fetchOgMeta$1", f = "BulletinEditPreviewAssem.kt", l = {292, 296}, m = "invokeSuspend")
public final class C0OT9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BulletinEditPreviewAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OT9(String str, BulletinEditPreviewAssem bulletinEditPreviewAssem, InterfaceC1364105Vn<? super C0OT9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = bulletinEditPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0OT9 c0ot9 = new C0OT9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0ot9.LLILLJJLI = obj;
        return c0ot9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            C844440XAs c844440XAs = C844440XAs.LIZ;
            this.LL = 1;
            c844440XAs.getClass();
            obj = C844440XAs.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1");
                return objLJFF;
            }
        }
        c098200Yq = (C0OT8) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C0OT6(C2286608xc.LJ(C1232370iAt.LIZ(thM5exceptionOrNullimpl)), thM5exceptionOrNullimpl.getMessage());
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0OTA c0ota = new C0OTA(this.LLILZ, (C0OT8) c098200Yq, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0ota) == objLJFF) {
            C1C7U.LIZIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEditPreviewAssem@ca16.fetchOgMeta$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
