package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912970zsd implements InterfaceC555500LqW {
    public static final void LIZ(String str) {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        List<BusinessGoodsPublishModel> goodsPublishModels;
        if (!TextUtils.isEmpty(str)) {
            synchronized (C1912980zse.class) {
                if (C1912980zse.LIZ == null) {
                    for (BusinessGoodsPublishSetting businessGoodsPublishSetting2 : C1912980zse.LIZ()) {
                        try {
                            if (((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID().equals(businessGoodsPublishSetting2.getUserId())) {
                                C1912980zse.LIZ = businessGoodsPublishSetting2;
                                break;
                            }
                            continue;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    businessGoodsPublishSetting = C1912980zse.LIZ;
                } else {
                    businessGoodsPublishSetting = C1912980zse.LIZ;
                }
            }
            if (businessGoodsPublishSetting != null && (goodsPublishModels = businessGoodsPublishSetting.getGoodsPublishModels()) != null && goodsPublishModels.size() != 0) {
                Iterator<BusinessGoodsPublishModel> it2 = goodsPublishModels.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    BusinessGoodsPublishModel next = it2.next();
                    if (next != null && TextUtils.equals(str, next.videoPath)) {
                        goodsPublishModels.remove(next);
                        break;
                    }
                }
                businessGoodsPublishSetting.setGoodsPublishModels(goodsPublishModels);
                List<BusinessGoodsPublishSetting> listLIZ = C1912980zse.LIZ();
                listLIZ.remove(businessGoodsPublishSetting);
                listLIZ.add(businessGoodsPublishSetting);
                String json = GsonProtectorUtils.toJson(new Gson(), listLIZ);
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                if (c19259110Wf.LJIIL == null) {
                    c19259110Wf.LJIIL = new C2230608oa<>("draft_business_goods", "");
                }
                c19259110Wf.LJIIL.LJ(json);
            }
        }
    }
}
