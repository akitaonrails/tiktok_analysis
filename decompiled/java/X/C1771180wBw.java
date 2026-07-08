package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771180wBw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1771170wBv LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1771500wCS LLILZIL;
    public final /* synthetic */ C259800zU<C1772630wEH> LLILZLL;
    public final /* synthetic */ C1771590wCb LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771180wBw(AbstractC1771170wBv abstractC1771170wBv, boolean z, boolean z2, boolean z3, C1771500wCS c1771500wCS, C259800zU<C1772630wEH> c259800zU, C1771590wCb c1771590wCb) {
        super(0);
        this.LL = abstractC1771170wBv;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = c1771500wCS;
        this.LLILZLL = c259800zU;
        this.LLIZ = c1771590wCb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.google.gson.k] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object objLJIIJ;
        Integer num;
        ECMixMallPageDTO eCMixMallPageDTO;
        AbstractC1771170wBv abstractC1771170wBv = this.LL;
        if (abstractC1771170wBv instanceof C1771640wCg) {
            ECMixMallPageDTO eCMixMallPageDTO2 = ((C1771640wCg) abstractC1771170wBv).LIZJ;
            if (eCMixMallPageDTO2 != null) {
                eCMixMallPageDTO2.LIZ();
            }
            C259800zU c259800zU = new C259800zU();
            if (!this.LLILLJJLI || !this.LLILLL || !this.LLILZ) {
                ECMixMallPageDTO eCMixMallPageDTO3 = ((C1771640wCg) this.LL).LIZJ;
                ?? LJI = eCMixMallPageDTO3 != null ? C1741890vQh.LJI(eCMixMallPageDTO3) : 0;
                c259800zU.element = LJI;
                HashMap<String, Object> mapLJIIIZ = C1741890vQh.LJIIIZ(LJI);
                Map mapLIZJ = mapLJIIIZ != null ? C2097908Jt.LIZJ(new Pair("data", mapLJIIIZ)) : null;
                if (!this.LLILLL) {
                    C1771500wCS c1771500wCS = this.LLILZIL;
                    Boolean bool = Boolean.TRUE;
                    c1771500wCS.getClass();
                    if (mapLIZJ != null) {
                        EcomResourceBystander.LIZ.getClass();
                        EcomResourceBystander.LJIILLIIL(mapLIZJ, "/api/v1/mall/homepage/bff/get", bool, null, null);
                    }
                }
                if (!this.LLILZ) {
                    C1771500wCS c1771500wCS2 = this.LLILZIL;
                    n nVar = new n();
                    nVar.LJJIII(1, "request_occasion");
                    c1771500wCS2.getClass();
                    if (mapLIZJ != null) {
                        C2130208We.LIZLLL(C20466080a.LIZ(), "/api/v1/mall/homepage/bff/get", mapLIZJ, nVar, null, 8);
                    }
                }
            }
            if (C1771500wCS.LJII.getAndSet(false)) {
                if (this.LLILLJJLI) {
                    C1771500wCS c1771500wCS3 = this.LLILZIL;
                    C948503nH.LJI(c1771500wCS3.LIZ, C0PEM.LIZJ, new C1771160wBu(c259800zU, this.LL, c1771500wCS3, null));
                } else {
                    C1769810w9j.LIZ.getClass();
                    EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = C1769810w9j.LIZ();
                    if (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.enableCropOnlineDataBeforeSaveCache) == null || num.intValue() != 1) {
                        objLJIIJ = c259800zU.element;
                    } else {
                        k kVar = (k) c259800zU.element;
                        try {
                            Gson gsonLJFF = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVar, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<ECMixMallPageDTO>() { // from class: X.0wBy
                            }.getType() : C2371409Qy.LIZJ(C13LE.LJII(ECMixMallPageDTO.class)));
                            if (!(objFromJson instanceof ECMixMallPageDTO)) {
                                objFromJson = null;
                            }
                            eCMixMallPageDTO = (ECMixMallPageDTO) objFromJson;
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                            eCMixMallPageDTO = null;
                        }
                        try {
                            this.LLILZIL.getClass();
                            objLJIIJ = C1771500wCS.LJIIJ(eCMixMallPageDTO);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            EnumC1771210wBz enumC1771210wBz = EnumC1771210wBz.CROP_ONLINE_DATA;
                            String message = e2.getMessage();
                            if (message == null) {
                                message = "crop online data error before save";
                            }
                            C1768370w7P.LIZ(e2, enumC1771210wBz, message, null);
                            objLJIIJ = c259800zU.element;
                        }
                    }
                    Integer num2 = C1771440wCM.LIZLLL().cacheWriteInterval;
                    long jIntValue = num2 != null ? num2.intValue() : 0;
                    MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
                    MMKStorageUtil.LJFF(jIntValue, objLJIIJ);
                }
                MMKStorageUtil mMKStorageUtil2 = MMKStorageUtil.LIZ;
                MMKStorageUtil.LIZJ = ((C1771640wCg) this.LL).LIZ;
            }
            if (((Boolean) C0BAX.LIZ.getValue()).booleanValue()) {
                C1771500wCS c1771500wCS4 = this.LLILZIL;
                C1772630wEH c1772630wEH = ((C1771640wCg) this.LL).LIZ;
                C1772630wEH c1772630wEH2 = this.LLILZLL.element;
                String str = this.LLIZ.LIZ;
                if (c1772630wEH2 == null) {
                    c1771500wCS4.LJIILJJIL(c1772630wEH, false, str);
                } else {
                    C948503nH.LJI(c1771500wCS4.LIZ, C2126308Ur.LIZ, new C1774800wHm(c1771500wCS4, c1772630wEH2, c1772630wEH, str, null));
                    EcomLynxVideoPlayerSettings.LIZ.getClass();
                    if (EcomLynxVideoPlayerSettings.LIZ()) {
                        C948503nH.LJI(c1771500wCS4.LIZ, C0PEM.LIZJ, new C619470ORl(c1771500wCS4, c1772630wEH2, c1772630wEH, str, null));
                    }
                }
            } else {
                this.LLILZIL.LJIILJJIL(((C1771640wCg) this.LL).LIZ, false, this.LLIZ.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
