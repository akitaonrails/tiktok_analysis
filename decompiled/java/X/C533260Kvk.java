package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$fetchEffectListByResourceIdsFlow$1", f = "LokiResourceHandler.kt", l = {649}, m = "invokeSuspend")
public final class C533260Kvk extends C09AX implements Function2<C094D<? super Effect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C533220Kvg LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533260Kvk(EffectManager effectManager, List<String> list, Map<String, String> map, C533220Kvg c533220Kvg, InterfaceC1364105Vn<? super C533260Kvk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectManager;
        this.LLILZ = list;
        this.LLILZIL = map;
        this.LLILZLL = c533220Kvg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533260Kvk c533260Kvk = new C533260Kvk(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c533260Kvk.LLILLJJLI = obj;
        return c533260Kvk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LokiResourceHandler@5b6a.fetchEffectListByResourceIdsFlow$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            EffectManager effectManager = this.LLILLL;
            final List<String> list = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            final C533220Kvg c533220Kvg = this.LLILZLL;
            effectManager.fetchEffectList(list, map, new IFetchEffectListByIdsListener() { // from class: X.0Kvj
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    String msg;
                    C533220Kvg c533220Kvg2 = c533220Kvg;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchEffectListByResourceIdsFlow onFail: resourceIdsSize=");
                    sbLIZ.append(list.size());
                    sbLIZ.append(", errorCode=");
                    String msg2 = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(", msg=");
                    if (exceptionResult != null) {
                        msg2 = exceptionResult.getMsg();
                    }
                    sbLIZ.append(msg2);
                    c533220Kvg2.LJI(C2188811AlT.LIZIZ(sbLIZ));
                    C094D<Effect> c094d2 = c094d;
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "fetchEffectList failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(msg));
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r8) {
                    /*
                        r7 = this;
                        com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r8 = (com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse) r8
                        r3 = 0
                        if (r8 == 0) goto L39
                        java.util.List r6 = r8.getEffect_list()
                        if (r6 == 0) goto L3a
                        r0 = r6
                    Lc:
                        java.util.HashSet r5 = new java.util.HashSet
                        r5.<init>()
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r4 = r0.iterator()
                    L1a:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L3d
                        java.lang.Object r1 = r4.next()
                        r0 = r1
                        com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                        java.lang.String r0 = r0.getResourceId()
                        if (r0 != 0) goto L2f
                        java.lang.String r0 = ""
                    L2f:
                        boolean r0 = r5.add(r0)
                        if (r0 == 0) goto L1a
                        r2.add(r1)
                        goto L1a
                    L39:
                        r6 = r3
                    L3a:
                        X.13BV r0 = X.C13BV.INSTANCE
                        goto Lc
                    L3d:
                        X.0Kvg r1 = r1
                        java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "fetchEffectListByResourceIdsFlow onSuccess: resourceIdsSize="
                        r4.append(r0)
                        java.util.List<java.lang.String> r0 = r2
                        int r0 = r0.size()
                        r4.append(r0)
                        java.lang.String r0 = ", effectListSize="
                        r4.append(r0)
                        if (r6 == 0) goto Lad
                        int r0 = r6.size()
                    L5c:
                        r4.append(r0)
                        java.lang.String r0 = ", dedupedEffectListSize="
                        r4.append(r0)
                        int r0 = r2.size()
                        r4.append(r0)
                        java.lang.String r0 = ", firstEffectId="
                        r4.append(r0)
                        java.lang.Object r0 = X.C13LP.LJJJLL(r2)
                        com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                        if (r0 == 0) goto Lab
                        java.lang.String r0 = r0.getEffectId()
                    L7c:
                        r4.append(r0)
                        java.lang.String r0 = ", firstResourceId="
                        r4.append(r0)
                        java.lang.Object r0 = X.C13LP.LJJJLL(r2)
                        com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
                        if (r0 == 0) goto L90
                        java.lang.String r3 = r0.getResourceId()
                    L90:
                        r4.append(r3)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)
                        r1.LJFF(r0)
                        java.lang.Object r1 = X.C13LP.LJJJLL(r2)
                        if (r1 == 0) goto Laf
                        X.094D<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r3
                        r0.LJIIIIZZ(r1)
                        X.094D<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r3
                        X.C395701gJ.LIZ(r0)
                        return
                    Lab:
                        r0 = r3
                        goto L7c
                    Lad:
                        r0 = 0
                        goto L5c
                    Laf:
                        X.094D<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = r3
                        java.lang.RuntimeException r1 = new java.lang.RuntimeException
                        java.lang.String r0 = "effectList is empty"
                        r1.<init>(r0)
                        r2.LJIIJJI(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C533250Kvj.onSuccess(java.lang.Object):void");
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(425);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("LokiResourceHandler@5b6a.fetchEffectListByResourceIdsFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LokiResourceHandler@5b6a.fetchEffectListByResourceIdsFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Effect> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
