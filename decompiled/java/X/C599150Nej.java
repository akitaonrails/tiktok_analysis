package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$invokeAction$job$1", f = "PdpEventCenter.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C599150Nej extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C599170Nel LLILZ;
    public final /* synthetic */ InterfaceC599180Nem LLILZIL;
    public final /* synthetic */ C599190Nen LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599150Nej(String str, C599170Nel c599170Nel, InterfaceC599180Nem interfaceC599180Nem, C599190Nen c599190Nen, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C599150Nej> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c599170Nel;
        this.LLILZIL = interfaceC599180Nem;
        this.LLILZLL = c599190Nen;
        this.LLIZ = map;
        this.LLIZLLLIL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599150Nej(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        long jCurrentTimeMillis;
        Object objLIZJ = obj;
        C1C7U.LIZ("PdpEventCenter@c50e.invokeAction$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(objLIZJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                jCurrentTimeMillis = System.currentTimeMillis();
                String str = this.LLILLL;
                EnumC599500NfI enumC599500NfI = EnumC599500NfI.ACTION;
                EnumC599160Nek enumC599160Nek = EnumC599160Nek.START;
                EnumC599330Nf1 enumC599330Nf1 = EnumC599330Nf1.INVOKE;
                C599320Nf0.LIZ(str, enumC599500NfI, enumC599160Nek, enumC599330Nf1, this.LLILZ.LIZ, null, null, 0L);
                C599320Nf0.LIZ(this.LLILLL, enumC599500NfI, EnumC599160Nek.TRANSMIT, enumC599330Nf1, this.LLILZ.LIZ, null, null, 0L);
                C599170Nel c599170Nel = this.LLILZ;
                long j = c599170Nel.LIZLLL;
                C596160NZu c596160NZu = new C596160NZu(c599170Nel, this.LLIZ, this.LLIZLLLIL, null);
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLIZJ = C099A.LIZJ(j, c596160NZu, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("PdpEventCenter@c50e.invokeAction$job$1");
                    return objLJFF;
                }
            }
            AbstractC1470205pE abstractC1470205pE = (AbstractC1470205pE) objLIZJ;
            if (abstractC1470205pE == null) {
                InterfaceC599180Nem interfaceC599180Nem = this.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Method execution timed out after ");
                sbLIZ.append(this.LLILZ.LIZLLL);
                sbLIZ.append("ms");
                interfaceC599180Nem.LIZ(new C1470005pC(-4, C2188811AlT.LIZIZ(sbLIZ), null));
            } else if (abstractC1470205pE instanceof C1470305pF) {
                this.LLILZIL.LIZIZ((C1470305pF) abstractC1470205pE);
            } else if (abstractC1470205pE instanceof C1470005pC) {
                this.LLILZIL.LIZ((C1470005pC) abstractC1470205pE);
            } else if (abstractC1470205pE instanceof C599070Neb) {
                this.LLILZLL.LIZLLL.put(((C599070Neb) abstractC1470205pE).LIZ, this.LLILZIL);
                ((C599070Neb) abstractC1470205pE).LIZIZ.sendEvent(((C599070Neb) abstractC1470205pE).LIZJ, ((C599070Neb) abstractC1470205pE).LIZLLL);
            } else {
                throw new C1954807lC();
            }
            C599320Nf0.LIZ(this.LLILLL, EnumC599500NfI.ACTION, EnumC599160Nek.COMPLETE, EnumC599330Nf1.INVOKE, this.LLILZ.LIZ, null, null, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C599170Nel c599170Nel2 = this.LLILZ;
            if (c599170Nel2.LJ) {
                C599190Nen.LJ(this.LLILZLL, e, this.LLILLL, EnumC599500NfI.ACTION, EnumC599160Nek.ERROR, EnumC599330Nf1.INVOKE, c599170Nel2.LIZ, EnumC586340MzA.UNKNOWN_ERROR, 0L, 128);
                InterfaceC599180Nem interfaceC599180Nem2 = this.LLILZIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Method execution failed: ");
                sbLIZ2.append(e.getMessage());
                interfaceC599180Nem2.LIZ(new C1470005pC(-2, C2188811AlT.LIZIZ(sbLIZ2), null));
            } else {
                throw e;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpEventCenter@c50e.invokeAction$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
