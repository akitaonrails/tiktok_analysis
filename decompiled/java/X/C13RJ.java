package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatformCaching;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.13RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RJ {
    public boolean LIZ;
    public EffectManager LIZIZ;
    public Map<String, Object> LIZJ;
    public final Map<String, String> LIZLLL = new HashMap();

    public static ExceptionResult LJIIIZ() {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        return exceptionResult;
    }

    public static C1662010tLr LJIIJ() {
        C1662010tLr c1662010tLr = new C1662010tLr(new RuntimeException());
        c1662010tLr.LIZ = -1;
        c1662010tLr.LIZIZ = "effect sdk manager init failed";
        return c1662010tLr;
    }

    public final Map<String, String> LJIIJJI(Map<String, String> map) {
        if (map == null && ((HashMap) this.LIZLLL).isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (!((HashMap) this.LIZLLL).isEmpty()) {
            map2.putAll(this.LIZLLL);
        }
        return map2;
    }

    public final void LIZ(String str, ICheckChannelListener iCheckChannelListener) {
        if (!this.LIZ) {
            iCheckChannelListener.checkChannelFailed(LJIIIZ());
        } else if (EffectPlatformCaching.LJIIZILJ().LJIJJ(str)) {
            iCheckChannelListener.checkChannelSuccess(false);
        } else {
            this.LIZIZ.checkPanelIsUpdate(str, null, new C13RZ(iCheckChannelListener));
        }
    }

    public final void LIZIZ(String str, ICheckChannelListener iCheckChannelListener) {
        boolean zLJI = MethodIDManager.LJI(137382);
        boolean zLJI2 = MethodIDManager.LJI(137816);
        if (!this.LIZ) {
            iCheckChannelListener.checkChannelFailed(LJIIIZ());
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (EffectPlatformCaching.LJIIZILJ().LJIJJ(str)) {
            iCheckChannelListener.checkChannelSuccess(false);
        } else {
            this.LIZIZ.checkedEffectListUpdate(str, null, new C13RZ(iCheckChannelListener));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZJ(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        if (!this.LIZ) {
            iFetchEffectListListener.onFail(LJIIIZ());
        } else {
            this.LIZIZ.downloadEffectList(list, iFetchEffectListListener, null);
        }
    }

    public final void LJFF(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13RL c13rl = new C13RL(this, iFetchEffectChannelListener, str, z);
        if (!this.LIZ) {
            c13rl.onFail(LJIIIZ());
        } else {
            this.LIZIZ.fetchEffectListFromCache(str, c13rl);
        }
    }

    public final void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C1635070seP c1635070seP = new C1635070seP(str, new C1635030seL(str, iFetchEffectChannelListener));
        c1635070seP.LIZLLL = this.LIZJ;
        if (!this.LIZ) {
            c1635070seP.onFail(LJIIIZ());
        } else {
            this.LIZIZ.fetchEffectList(str, z, c1635070seP);
        }
    }

    public final void LJIIIIZZ(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListenerLIZ = iFetchPanelInfoListener;
        if (!this.LIZ) {
            iFetchPanelInfoListenerLIZ.onFail(LJIIIZ());
            return;
        }
        if (!(iFetchPanelInfoListenerLIZ instanceof C1635060seO)) {
            iFetchPanelInfoListenerLIZ = C1635060seO.LIZ(str, iFetchPanelInfoListenerLIZ);
        }
        ((C1635060seO) iFetchPanelInfoListenerLIZ).LIZLLL = this.LIZJ;
        this.LIZIZ.fetchPanelInfoFromCache(str, z, str2, i, i2, 0, iFetchPanelInfoListenerLIZ);
    }

    public final void LJII(String str, boolean z, String str2, int i, int i2, int i3, Map map, C13RR c13rr) {
        IFetchPanelInfoListener iFetchPanelInfoListenerLIZ = c13rr;
        if (!this.LIZ) {
            iFetchPanelInfoListenerLIZ.onFail(LJIIIZ());
            return;
        }
        if (!(iFetchPanelInfoListenerLIZ instanceof C1635060seO)) {
            iFetchPanelInfoListenerLIZ = C1635060seO.LIZ(str, iFetchPanelInfoListenerLIZ);
        }
        ((C1635060seO) iFetchPanelInfoListenerLIZ).LIZLLL = this.LIZJ;
        this.LIZIZ.fetchPanelInfo(str, z, str2, i, i2, i3, LJIIJJI(map), iFetchPanelInfoListenerLIZ);
    }

    public final void LJ(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener, Map<String, String> map) {
        LIZLLL(i, i2, i3, 0, iFetchCategoryEffectListener, str, str2, str3, map, z);
    }

    public final void LIZLLL(final int i, final int i2, final int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, final String str, final String str2, final String str3, Map map, boolean z) {
        final IFetchCategoryEffectListener iFetchCategoryEffectListenerLIZ = iFetchCategoryEffectListener;
        if (!this.LIZ) {
            iFetchCategoryEffectListenerLIZ.onFail(LJIIIZ());
            return;
        }
        if (!(iFetchCategoryEffectListenerLIZ instanceof C1635040seM)) {
            iFetchCategoryEffectListenerLIZ = C1635040seM.LIZ(str, i, i2, iFetchCategoryEffectListenerLIZ);
        }
        ((C1635040seM) iFetchCategoryEffectListenerLIZ).LJFF = this.LIZJ;
        final Map<String, String> mapLJIIJJI = LJIIJJI(map);
        if (!z && !EffectPlatformCaching.LJIIZILJ().LJIJJLI(i4, str, str2)) {
            this.LIZIZ.fetchCategoryEffect(str, str2, i, i2, i3, str3, i4, mapLJIIJJI, new C13RS(iFetchCategoryEffectListenerLIZ, str, str2));
            return;
        }
        EffectManager effectManager = this.LIZIZ;
        if (effectManager != null && this.LIZ) {
            effectManager.fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, i4, new IFetchCategoryEffectListener() { // from class: X.13RN
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C13RJ c13rj = this.LJIIIIZZ;
                    if (c13rj.LIZIZ != null && c13rj.LIZ) {
                        this.LJIIIIZZ.LIZIZ.fetchCategoryEffect(str, str2, i, i2, i3, str3, mapLJIIJJI, new C13RS(iFetchCategoryEffectListenerLIZ, str, str2));
                    } else {
                        iFetchCategoryEffectListenerLIZ.onFail(C13RJ.LJIIIZ());
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    iFetchCategoryEffectListenerLIZ.onSuccess(categoryPageModel);
                }
            });
        } else {
            if (iFetchCategoryEffectListenerLIZ == null) {
                return;
            }
            iFetchCategoryEffectListenerLIZ.onFail(LJIIIZ());
        }
    }
}
