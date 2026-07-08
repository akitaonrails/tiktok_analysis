package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.NetworkPlatformMisc$asyncRequest$1", f = "NetworkPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C1304850k3n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1524410plv LL;
    public final /* synthetic */ InterfaceC1304860k3o LLILLJJLI;
    public final /* synthetic */ C1524360plq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304850k3n(C1524410plv c1524410plv, InterfaceC1304860k3o interfaceC1304860k3o, C1524360plq c1524360plq, InterfaceC1364105Vn<? super C1304850k3n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1524410plv;
        this.LLILLJJLI = interfaceC1304860k3o;
        this.LLILLL = c1524360plq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1304850k3n(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1524410plv c1524410plv;
        boolean z;
        boolean z2;
        C1C7U.LIZ("NetworkPlatformMisc@36a3.asyncRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c1524410plv = this.LL;
            z = false;
            if (c1524410plv.LJIIIIZZ != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (z2) {
            InterfaceC1304860k3o interfaceC1304860k3o = this.LLILLJJLI;
            if (interfaceC1304860k3o != null) {
                interfaceC1304860k3o.LIZIZ();
            }
            Unit unit = Unit.LIZ;
            this.LLILLL.LIZ.remove(C2286608xc.LJ(this.LL.LIZ));
            C1C7U.LIZIZ("NetworkPlatformMisc@36a3.asyncRequest$1");
            return unit;
        }
        this.LLILLL.getClass();
        C1524380pls c1524380plsLJJZ = C1524360plq.LJJZ(c1524410plv);
        C1524410plv c1524410plv2 = this.LL;
        int i = c1524410plv2.LJIIIIZZ;
        if (i == 1) {
            z = true;
        }
        if (z) {
            InterfaceC1304860k3o interfaceC1304860k3o2 = this.LLILLJJLI;
            if (interfaceC1304860k3o2 != null) {
                interfaceC1304860k3o2.LIZIZ();
            }
        } else {
            if (i == 0) {
                c1524410plv2.LJIIIIZZ = 2;
            }
            InterfaceC1304860k3o interfaceC1304860k3o3 = this.LLILLJJLI;
            if (interfaceC1304860k3o3 != null) {
                interfaceC1304860k3o3.LIZ(c1524380plsLJJZ);
            }
        }
        this.LLILLL.LIZ.remove(C2286608xc.LJ(this.LL.LIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NetworkPlatformMisc@36a3.asyncRequest$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
