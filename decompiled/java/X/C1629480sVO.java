package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629480sVO implements InterfaceC1625580sP6 {
    public final InterfaceC1629330sV9 LIZ;
    public final InterfaceC1629550sVV LIZIZ;

    public C1629480sVO(C1626150sQ1 c1626150sQ1, InterfaceC1629550sVV interfaceC1629550sVV) {
        this.LIZ = c1626150sQ1;
        this.LIZIZ = interfaceC1629550sVV;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sVP] */
    public final void LIZJ(Effect effect, final IFetchEffectListener iFetchEffectListener) {
        List<String> music;
        String str;
        if (effect != null && C1624200sMs.LJIILL(effect) && (music = effect.getMusic()) != null && !music.isEmpty()) {
            C1629630sVd c1629630sVd = new C1629630sVd(effect, new IEffectDownloadProgressListener() { // from class: X.0sVP
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect2, int i, long j) {
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                    iFetchEffectListener.onStart(effect2);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    iFetchEffectListener.onSuccess(effect2);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                    iFetchEffectListener.onFail(effect2, exceptionResult);
                }
            });
            List<String> music2 = effect.getMusic();
            if (music2 != null && (str = (String) C13LP.LJJJLL(music2)) != null) {
                this.LIZIZ.LIZ(str, new C1629530sVT(c1629630sVd), new C1629470sVN(c1629630sVd), new C1629450sVL(c1629630sVd), true);
            } else {
                c1629630sVd.onFailed();
            }
            this.LIZ.LIZJ(effect, c1629630sVd);
            return;
        }
        this.LIZ.LIZJ(effect, iFetchEffectListener);
    }

    @Override // X.InterfaceC1625580sP6
    public final void LIZ(String str, String str2, IFetchEffectListener iFetchEffectListener) {
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, str2);
        LIZIZ(str, map, iFetchEffectListener);
    }

    @Override // X.InterfaceC1625580sP6
    public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
        if (effectListResponseLIZ != null) {
            List<Effect> data = effectListResponseLIZ.getData();
            if (!data.isEmpty()) {
                LIZJ((Effect) ListProtector.get(data, 0), iFetchEffectListener);
                return;
            } else {
                iFetchEffectListener.onFail(null, new ExceptionResult(-1, new IllegalStateException("get effect info error")));
                return;
            }
        }
        this.LIZ.LJ(Collections.singletonList(str), false, map, new C1698200uIE(this, iFetchEffectListener, 2));
    }
}
