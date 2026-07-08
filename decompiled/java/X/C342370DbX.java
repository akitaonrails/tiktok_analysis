package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.repository.CreationChatLandingMsgRepository$getLandingMsgs$1", f = "AiChatLandingMsgRepository.kt", l = {55, 66, 68}, m = "invokeSuspend")
public final class C342370DbX extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends List<? extends C342360DbW>>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C342330DbT LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342370DbX(int i, C342330DbT c342330DbT, String str, InterfaceC1364105Vn<? super C342370DbX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = c342330DbT;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342370DbX c342370DbX = new C342370DbX(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c342370DbX.LLILLJJLI = obj;
        return c342370DbX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        String strLJIJJ;
        ArrayList arrayList;
        Object obj2;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        C1C7U.LIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
                return unit;
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C1157580gEG c1157580gEG = new C1157580gEG(-1);
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c1157580gEG, this) == objLJFF) {
                C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
                return objLJFF;
            }
        }
        C342310DbR c342310DbR = C342310DbR.LIZ;
        int i2 = this.LLILLL;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C0CHQ.LIZ);
        } else {
            strLJIJJ = null;
        }
        c342310DbR.getClass();
        Keva keva = (Keva) C342310DbR.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("msg_list#");
        sbLIZ.append(i2);
        sbLIZ.append('#');
        sbLIZ.append(strLJIJJ);
        String[] stringArray = keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), null);
        if (stringArray != null) {
            arrayList = new ArrayList();
            for (String str : stringArray) {
                Object objLIZ = C541100LKa.LIZ(str, C342360DbW.class);
                if (objLIZ != null) {
                    arrayList.add(objLIZ);
                }
            }
        } else {
            arrayList = null;
        }
        List listLJIIJJI = arrayList;
        if (arrayList == null) {
            if (i2 == 4) {
                listLJIIJJI = C1697810uHb.LJIIJJI(new C342360DbW(C1383370m6R.LJIIJ(2131837127)), new C342360DbW(C1383370m6R.LJIIJ(2131837128)), new C342360DbW(C1383370m6R.LJIIJ(2131837129)), new C342360DbW(C1383370m6R.LJIIJ(2131837130)), new C342360DbW(C1383370m6R.LJIIJ(2131837131)));
            } else {
                listLJIIJJI = C1697810uHb.LJIIJJI(new C342360DbW(C1383370m6R.LJIIJ(2131825524)), new C342360DbW(C1383370m6R.LJIIJ(2131825526)), new C342360DbW(C1383370m6R.LJIIJ(2131825527)), new C342360DbW(C1383370m6R.LJIIJ(2131825528)), new C342360DbW(C1383370m6R.LJIIJ(2131825529)), new C342360DbW(C1383370m6R.LJIIJ(2131825530)), new C342360DbW(C1383370m6R.LJIIJ(2131825531)), new C342360DbW(C1383370m6R.LJIIJ(2131825532)), new C342360DbW(C1383370m6R.LJIIJ(2131825533)), new C342360DbW(C1383370m6R.LJIIJ(2131825525)));
            }
        }
        Keva keva2 = (Keva) C342310DbR.LIZIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("refresh_time#");
        sbLIZ2.append(i2);
        sbLIZ2.append('#');
        sbLIZ2.append(strLJIJJ);
        Pair pair = new Pair(listLJIIJJI, Long.valueOf(keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L)));
        List list = (List) pair.getFirst();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        if (list != null && (!list.isEmpty())) {
            this.LLILZ.getClass();
            if (System.currentTimeMillis() - jLongValue >= ((long) C342380DbY.LIZ().onboardingIntervalInHours) * 3600000) {
                obj2 = null;
                C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.LIZ.getValue(), null, null, new C342300DbQ(this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
            } else {
                obj2 = null;
            }
            C1157450gE3 c1157450gE3 = new C1157450gE3(list, EnumC1156000gBi.CACHE);
            this.LLILLJJLI = obj2;
            this.LL = 2;
            if (interfaceC346701Wf.emit(c1157450gE3, this) == objLJFF) {
                C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
                return objLJFF;
            }
        } else {
            C1155990gBh c1155990gBh = new C1155990gBh((Throwable) null, 3);
            this.LLILLJJLI = null;
            this.LL = 3;
            if (interfaceC346701Wf.emit(c1155990gBh, this) == objLJFF) {
                C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends List<? extends C342360DbW>>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
