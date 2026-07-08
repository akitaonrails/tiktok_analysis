package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.tools.common.quota.AiChatFeatureResponse;
import com.ss.android.ugc.tools.common.quota.AiChatQuota;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.common.quota.AiChatQuotaManager$quotaRefresh$1", f = "AiChatQuotaManager.kt", l = {59}, m = "invokeSuspend")
public final class C1726906pX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1726906pX(InterfaceC1364105Vn<? super C1726906pX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726906pX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AiChatQuota aiChatQuota;
        C1C7U.LIZ("AiChatQuotaManager@cf9d.quotaRefresh$1");
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
            C1727006pY c1727006pY = C1727006pY.LIZ;
            this.LL = 1;
            c1727006pY.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1726806pW(null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatQuotaManager@cf9d.quotaRefresh$1");
                return objLJFF;
            }
        }
        AiChatFeatureResponse aiChatFeatureResponse = (AiChatFeatureResponse) obj;
        if (aiChatFeatureResponse != null && (aiChatQuota = aiChatFeatureResponse.featureValue.aiChatQuota) != null) {
            Keva keva = C1727106pZ.LIZ;
            int i2 = aiChatQuota.quotaMax;
            Keva keva2 = C1727106pZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_quota_max");
            sbLIZ.append(C1727106pZ.LIZIZ());
            keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ), i2);
            int i3 = aiChatQuota.quotaRemain;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_quota_remain");
            sbLIZ2.append(C1727106pZ.LIZIZ());
            keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("key_quota_last_date");
            sbLIZ3.append(C1727106pZ.LIZIZ());
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ3), jCurrentTimeMillis);
            for (InterfaceC1727306pb interfaceC1727306pb : C1727006pY.LIZLLL) {
                Keva keva3 = C1727106pZ.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("key_quota_max");
                sbLIZ4.append(C1727106pZ.LIZIZ());
                int i4 = keva3.getInt(C2188811AlT.LIZIZ(sbLIZ4), 5);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("key_quota_remain");
                sbLIZ5.append(C1727106pZ.LIZIZ());
                interfaceC1727306pb.LIZ(i4, keva3.getInt(C2188811AlT.LIZIZ(sbLIZ5), 5));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatQuotaManager@cf9d.quotaRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1726906pX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
