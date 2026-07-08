package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0uUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705980uUm implements IFetchCategoryEffectListener {
    public final CopyOnWriteArrayList<C1706060uUu> LIZ;
    public final C1706060uUu LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> LIZLLL;
    public final C1706100uUy LJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        String logId;
        int errorCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefabSubListMonitor failed errorCode:");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" msg:");
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        sbLIZ.append(" logId:");
        if (exceptionResult != null) {
            logId = exceptionResult.getLogId();
        } else {
            logId = null;
        }
        sbLIZ.append(logId);
        C1706630uVp.LIZJ("PrefabPaginatedResProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZJ) {
            C1706100uUy c1706100uUy = this.LJ;
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LJ = "net";
            }
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LIZJ = -2001;
            }
            int errorCode2 = -999;
            if (c1706100uUy != null) {
                if (exceptionResult != null) {
                    errorCode = exceptionResult.getErrorCode();
                } else {
                    errorCode = -999;
                }
                c1706100uUy.LIZIZ.LIZLLL = errorCode;
            }
            C1706100uUy c1706100uUy2 = this.LJ;
            if (c1706100uUy2 != null) {
                c1706100uUy2.LJFF();
            }
            C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
            C1706050uUt c1706050uUt = c1706090uUxLJIIJ.LIZIZ;
            c1706050uUt.LJIIIIZZ = "net";
            c1706050uUt.LJIIJJI = -2001;
            if (exceptionResult != null) {
                errorCode2 = exceptionResult.getErrorCode();
            }
            c1706090uUxLJIIJ.LIZIZ.LJIIL = errorCode2;
        }
        InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> interfaceC20236714Gf = this.LIZLLL;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        C2256241DSs.LJIIIZ().LIZ(this.LIZJ);
        C1706090uUx c1706090uUxLJIIJ = C2256241DSs.LJIIJ();
        if (this.LIZJ) {
            C1706100uUy c1706100uUy = this.LJ;
            if (c1706100uUy != null) {
                c1706100uUy.LIZIZ.LJ = "cache_disk";
            }
            c1706090uUxLJIIJ.LIZIZ.LJIIIIZZ = "cache_disk";
        } else {
            C1706100uUy c1706100uUy2 = this.LJ;
            if (c1706100uUy2 != null) {
                c1706100uUy2.LIZIZ.LJ = "net";
            }
            c1706090uUxLJIIJ.LIZIZ.LJIIIIZZ = "net";
        }
        InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> interfaceC20236714Gf = this.LIZLLL;
        if (categoryPageModel2 == null) {
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
            return;
        }
        CategoryEffectModel categoryEffects = categoryPageModel2.getCategoryEffects();
        if (categoryEffects == null) {
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
            return;
        }
        List<Effect> category_effects = categoryEffects.getCategory_effects();
        ArrayList arrayList = new ArrayList();
        if (category_effects != null) {
            for (Effect effect : category_effects) {
                String effect_id = effect.getEffect_id();
                String categoryKey = categoryEffects.getCategoryKey();
                String str = (String) C13LP.LJJJLL(effect.getIcon_url().getUrlList());
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String name = effect.getName();
                String extra = effect.getExtra();
                if (extra == null) {
                    extra = "";
                }
                String extra2 = effect.getExtra();
                if (extra2 != null) {
                    str2 = extra2;
                }
                arrayList.add(new AssetsLibData.AssetsItemData(effect_id, categoryKey, str, name, extra, str2, effect.getUnzipPath(), C1706380uVQ.LIZ().LIZLLL().getEffectPlatform().LJIJI(effect), C1706490uVb.LIZJ(effect.getExtra(), "capabilities"), C1706490uVb.LIZIZ(effect.getExtra()), effect.getResourceId(), 0, 0, null, null, null, null, null, null, false, effect, 1046528));
            }
        }
        AssetsLibData.AssetsLibCategory assetsLibCategory = new AssetsLibData.AssetsLibCategory("", "", categoryEffects.getCategoryKey(), arrayList, categoryEffects.getCategoryKey(), "", categoryEffects.getVersion(), categoryEffects.getHasMore(), categoryEffects.getCursor(), categoryEffects.getSortingPosition(), null, false, 3072);
        if (!this.LIZJ) {
            this.LIZ.add(this.LIZIZ);
        }
        C189200o6.m2constructorimpl(assetsLibCategory);
        interfaceC20236714Gf.resumeWith(assetsLibCategory);
    }

    public C1705980uUm(CopyOnWriteArrayList copyOnWriteArrayList, C1706060uUu c1706060uUu, boolean z, C2252611DEt c2252611DEt, C1706100uUy c1706100uUy) {
        this.LIZ = copyOnWriteArrayList;
        this.LIZIZ = c1706060uUu;
        this.LIZJ = z;
        this.LIZLLL = c2252611DEt;
        this.LJ = c1706100uUy;
    }
}
