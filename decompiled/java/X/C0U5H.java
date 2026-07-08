package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U5H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0U5H extends AbstractC766100U3k<LiveEffect> implements C0U69<LiveEffect>, C0U3X<LiveEffect> {
    public final EffectManager LIZIZ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();

    public static boolean LJIILL(LiveEffect liveEffect) {
        if (liveEffect.LJJI()) {
            String strLJJ = liveEffect.LJJ();
            if (strLJJ == null || strLJJ.length() <= 0 || !new C0VSJ(strLJJ).exists()) {
                return false;
            }
            return true;
        }
        if (liveEffect.LJIIIZ() && liveEffect.LIZJ == null) {
            liveEffect.LIZJ = C0UEO.LIZIZ(liveEffect);
        }
        C766720U5u c766720U5u = C766720U5u.LIZ;
        Effect effect = liveEffect.LIZJ;
        c766720U5u.getClass();
        return C766720U5u.LJIIZILJ(effect);
    }

    public List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        boolean z;
        Iterator<C0U74<LiveEffect>> it2 = list.iterator();
        while (it2.hasNext()) {
            for (LiveEffect liveEffect : it2.next().LIZIZ) {
                liveEffect.LJJLIL(LJIILL(liveEffect));
                liveEffect.LJIJJLI();
                if (C0U7C.LJIILJJIL(liveEffect)) {
                    if (!liveEffect.LJIJJLI() && !C0U7C.LJIILIIL(liveEffect)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    liveEffect.LJJLIL(z);
                    List<LiveEffect> listLL = liveEffect.LL();
                    if (listLL != null) {
                        for (LiveEffect liveEffect2 : listLL) {
                            liveEffect2.LJJLIL(LJIILL(liveEffect2));
                            liveEffect2.LJIJJLI();
                        }
                    }
                }
            }
        }
        return list;
    }

    @Override // X.AbstractC766100U3k
    public final /* bridge */ /* synthetic */ boolean LJIILJJIL(LiveEffect liveEffect) {
        return LJIILL(liveEffect);
    }

    @Override // X.AbstractC766100U3k
    public final void LJIIL(LiveEffect liveEffect, final IEffectDownloadProgressListener iEffectDownloadProgressListener, boolean z, boolean z2, boolean z3) {
        String uri;
        UrlModel fileUrl;
        String uri2;
        UrlModel file_url;
        final LiveEffect liveEffect2 = liveEffect;
        if (liveEffect2.LJIIIZ() && liveEffect2.LIZJ == null) {
            liveEffect2.LIZJ = C0UEO.LIZIZ(liveEffect2);
        }
        if (LiveStickerDataSourceOptSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(liveEffect2.getName());
            sbLIZ.append(", ");
            sbLIZ.append(liveEffect2.getResourceId());
            sbLIZ.append(", ");
            Effect effect = liveEffect2.LIZJ;
            if (effect != null && (file_url = effect.getFile_url()) != null) {
                uri = file_url.getUri();
            } else {
                uri = null;
            }
            sbLIZ.append(uri);
            C20441214yg.LIZIZ("EffectCrash1111", C2188811AlT.LIZIZ(sbLIZ));
            Effect effect2 = liveEffect2.LIZJ;
            if (effect2 == null || (fileUrl = effect2.getFileUrl()) == null || (uri2 = fileUrl.getUri()) == null || uri2.length() == 0) {
                if (iEffectDownloadProgressListener != null) {
                    iEffectDownloadProgressListener.onFail(null, new ExceptionResult(-1, new Exception("empty file url")));
                    return;
                }
                return;
            }
        }
        Effect effect3 = liveEffect2.LIZJ;
        if (effect3 == null) {
            return;
        }
        this.LIZIZ.fetchEffectExt(effect3, z, z2, z3, new IEffectDownloadProgressListener() { // from class: X.0U4t
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect4) {
                this.LIZ.LIZ.add((T) liveEffect2);
                IEffectDownloadProgressListener iEffectDownloadProgressListener2 = iEffectDownloadProgressListener;
                if (iEffectDownloadProgressListener2 != null) {
                    iEffectDownloadProgressListener2.onStart(effect4);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect4) {
                String effect_id;
                Effect effect5 = effect4;
                this.LIZ.LIZ.remove(liveEffect2);
                C770170UJb.LIZJ("EffectRepository");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download effect success, effect_id: ");
                if (effect5 != null) {
                    effect_id = effect5.getEffect_id();
                } else {
                    effect_id = null;
                }
                sbLIZ2.append(effect_id);
                C2188811AlT.LIZIZ(sbLIZ2);
                C770170UJb.LIZLLL = "";
                C766720U5u.LIZ.getClass();
                C766720U5u.LIZIZ(effect5);
                IEffectDownloadProgressListener iEffectDownloadProgressListener2 = iEffectDownloadProgressListener;
                if (iEffectDownloadProgressListener2 != null) {
                    iEffectDownloadProgressListener2.onSuccess(effect5);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect4, ExceptionResult exceptionResult) {
                String effect_id;
                this.LIZ.LIZ.remove(liveEffect2);
                C770170UJb.LIZJ("EffectRepository");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download effect failed, effect_id: ");
                if (effect4 != null) {
                    effect_id = effect4.getEffect_id();
                } else {
                    effect_id = null;
                }
                sbLIZ2.append(effect_id);
                C2188811AlT.LIZIZ(sbLIZ2);
                C770170UJb.LIZLLL = "";
                IEffectDownloadProgressListener iEffectDownloadProgressListener2 = iEffectDownloadProgressListener;
                if (iEffectDownloadProgressListener2 != null) {
                    iEffectDownloadProgressListener2.onFail(effect4, exceptionResult);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect4, int i, long j) {
                IEffectDownloadProgressListener iEffectDownloadProgressListener2 = iEffectDownloadProgressListener;
                if (iEffectDownloadProgressListener2 != null) {
                    iEffectDownloadProgressListener2.onProgress(effect4, i, j);
                }
            }
        });
    }
}
