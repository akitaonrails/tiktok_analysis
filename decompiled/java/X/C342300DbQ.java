package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.repository.CreationChatLandingMsgRepository$getLandingMsgs$1$1", f = "AiChatLandingMsgRepository.kt", l = {60}, m = "invokeSuspend")
public final class C342300DbQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C342330DbT LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342300DbQ(int i, C342330DbT c342330DbT, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c342330DbT;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342300DbQ c342300DbQ = new C342300DbQ(this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c342300DbQ.LLILLJJLI = obj;
        return c342300DbQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C342330DbT c342330DbT = this.LLILLL;
                String str = this.LLILZ;
                int i2 = this.LLILZIL;
                this.LL = 1;
                objLIZ = c342330DbT.LIZ(i2, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (List) objLIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String strLJIJJ = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                int i3 = this.LLILZIL;
                C342310DbR c342310DbR = C342310DbR.LIZ;
                I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                    strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C0CHQ.LIZ);
                }
                c342310DbR.getClass();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C541100LKa.LIZIZ(it2.next()));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C01GW c01gw = C342310DbR.LIZIZ;
                Keva keva = (Keva) c01gw.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("msg_list#");
                sbLIZ.append(i3);
                sbLIZ.append('#');
                sbLIZ.append(strLJIJJ);
                keva.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), strArr);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Keva keva2 = (Keva) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("refresh_time#");
                sbLIZ2.append(i3);
                sbLIZ2.append('#');
                sbLIZ2.append(strLJIJJ);
                keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getLandingMsgs$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
