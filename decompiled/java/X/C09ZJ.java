package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.i18n.xbridge.idlruntime.BridgeGeckoUpdateListener$onCheckServerVersionSuccess$2", f = "BDXHostOpenDependImpl.kt", l = {}, m = "invokeSuspend")
public final class C09ZJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09ZI LL;
    public final /* synthetic */ Map<String, List<UpdatePackage>> LLILLJJLI;
    public final /* synthetic */ Map<String, List<Pair<String, Long>>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZJ(C09ZI c09zi, Map<String, List<UpdatePackage>> map, Map<String, List<Pair<String, Long>>> map2, InterfaceC1364105Vn<? super C09ZJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09zi;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[EDGE_INSN: B:35:0x008c->B:31:0x008c BREAK  A[LOOP:1: B:26:0x0073->B:37:?]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "BridgeGeckoUpdateListener@3dbe.onCheckServerVersionSuccess$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.09ZI r2 = r6.LL
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L26
            java.util.Map<java.lang.String, java.util.List<com.bytedance.geckox.model.UpdatePackage>> r0 = r6.LLILLJJLI
            if (r0 != 0) goto L20
            X.09ZL r0 = r2.LIZ
            r0.LJ()
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L20:
            X.09ZL r0 = r2.LIZ
            r0.LIZJ()
            goto L1a
        L26:
            java.util.Map<java.lang.String, java.util.List<com.bytedance.geckox.model.UpdatePackage>> r1 = r6.LLILLJJLI
            if (r1 == 0) goto L5d
            java.lang.String r0 = r2.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5d
            X.09ZI r4 = r6.LL
            java.util.Iterator r3 = r0.iterator()
        L3a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.geckox.model.UpdatePackage r0 = (com.bytedance.geckox.model.UpdatePackage) r0
            java.lang.String r1 = r0.getChannel()
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3a
            if (r2 == 0) goto L5d
            X.09ZI r0 = r6.LL
            X.09ZL r0 = r0.LIZ
            r0.LIZJ()
            goto L1a
        L5d:
            java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> r1 = r6.LLILLL
            if (r1 == 0) goto L8c
            X.09ZI r0 = r6.LL
            java.lang.String r0 = r0.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8c
            X.09ZI r4 = r6.LL
            java.util.Iterator r3 = r0.iterator()
        L73:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r2 = r3.next()
            r0 = r2
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L73
            if (r2 != 0) goto L1a
        L8c:
            X.09ZI r0 = r6.LL
            X.09ZL r0 = r0.LIZ
            r0.LJFF()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09ZJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
