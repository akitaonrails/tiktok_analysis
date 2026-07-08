package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.SeaContentCommunication$triggerAction$job$1", f = "SeaContentCommunication.kt", l = {294}, m = "invokeSuspend")
public final class C598930NeN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C599010NeV LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C598950NeP LLILZIL;
    public final /* synthetic */ InterfaceC598990NeT LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598930NeN(C599010NeV c599010NeV, String str, C598950NeP c598950NeP, InterfaceC598990NeT interfaceC598990NeT, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C598930NeN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c599010NeV;
        this.LLILZ = str;
        this.LLILZIL = c598950NeP;
        this.LLILZLL = interfaceC598990NeT;
        this.LLIZ = map;
        this.LLIZLLLIL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598930NeN(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        long jCurrentTimeMillis;
        Object objLIZJ = obj;
        C1C7U.LIZ("SeaContentCommunication@2638.triggerAction$job$1");
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
                C599380Nf6 c599380Nf6 = this.LLILLL.LIZ;
                String str = this.LLILZ;
                EnumC599530NfL enumC599530NfL = EnumC599530NfL.ACTION;
                EnumC598910NeL enumC598910NeL = EnumC598910NeL.START;
                EnumC599040NeY enumC599040NeY = EnumC599040NeY.TRIGGER;
                Object obj2 = this.LLILZIL.LIZ;
                c599380Nf6.getClass();
                C599380Nf6.LIZIZ(str, enumC599530NfL, enumC598910NeL, enumC599040NeY, obj2, null, null, 0L);
                C599380Nf6 c599380Nf62 = this.LLILLL.LIZ;
                String str2 = this.LLILZ;
                EnumC598910NeL enumC598910NeL2 = EnumC598910NeL.TRANSMIT;
                Object obj3 = this.LLILZIL.LIZ;
                c599380Nf62.getClass();
                C599380Nf6.LIZIZ(str2, enumC599530NfL, enumC598910NeL2, enumC599040NeY, obj3, null, null, 0L);
                C598950NeP c598950NeP = this.LLILZIL;
                long j = c598950NeP.LIZLLL;
                C598940NeO c598940NeO = new C598940NeO(c598950NeP, this.LLIZ, this.LLIZLLLIL, null);
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLIZJ = C099A.LIZJ(j, c598940NeO, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("SeaContentCommunication@2638.triggerAction$job$1");
                    return objLJFF;
                }
            }
            AbstractC598980NeS abstractC598980NeS = (AbstractC598980NeS) objLIZJ;
            if (abstractC598980NeS == null) {
                InterfaceC598990NeT interfaceC598990NeT = this.LLILZLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Action execution timed out after ");
                sbLIZ.append(this.LLILZIL.LIZLLL);
                sbLIZ.append("ms");
                interfaceC598990NeT.LIZ(new C599080Nec(-4, C2188811AlT.LIZIZ(sbLIZ), null));
            } else if (abstractC598980NeS instanceof C599060Nea) {
                this.LLILZLL.LIZIZ((C599060Nea) abstractC598980NeS);
            } else if (abstractC598980NeS instanceof C599080Nec) {
                this.LLILZLL.LIZ((C599080Nec) abstractC598980NeS);
            } else if (abstractC598980NeS instanceof C598960NeQ) {
                this.LLILLL.LJ.put(((C598960NeQ) abstractC598980NeS).LIZ, this.LLILZLL);
                ((C598960NeQ) abstractC598980NeS).LIZIZ.sendEvent(((C598960NeQ) abstractC598980NeS).LIZJ, ((C598960NeQ) abstractC598980NeS).LIZLLL);
            } else {
                throw new C1954807lC();
            }
            C599380Nf6 c599380Nf63 = this.LLILLL.LIZ;
            String str3 = this.LLILZ;
            EnumC599530NfL enumC599530NfL2 = EnumC599530NfL.ACTION;
            EnumC598910NeL enumC598910NeL3 = EnumC598910NeL.COMPLETE;
            EnumC599040NeY enumC599040NeY2 = EnumC599040NeY.TRIGGER;
            Object obj4 = this.LLILZIL.LIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c599380Nf63.getClass();
            C599380Nf6.LIZIZ(str3, enumC599530NfL2, enumC598910NeL3, enumC599040NeY2, obj4, null, null, jCurrentTimeMillis2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C598950NeP c598950NeP2 = this.LLILZIL;
            if (c598950NeP2.LJ) {
                C599380Nf6.LIZ(this.LLILLL.LIZ, e, this.LLILZ, EnumC599530NfL.ACTION, EnumC598910NeL.ERROR, EnumC599040NeY.TRIGGER, c598950NeP2.LIZ, EnumC598920NeM.UNKNOWN_ERROR, 0L, 128);
                InterfaceC598990NeT interfaceC598990NeT2 = this.LLILZLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Action execution failed: ");
                sbLIZ2.append(e.getMessage());
                interfaceC598990NeT2.LIZ(new C599080Nec(-2, C2188811AlT.LIZIZ(sbLIZ2), null));
            } else {
                throw e;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentCommunication@2638.triggerAction$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
