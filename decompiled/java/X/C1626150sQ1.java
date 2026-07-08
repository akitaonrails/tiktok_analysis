package X;

import android.os.Looper;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626150sQ1 implements InterfaceC1629330sV9 {
    public final InterfaceC1635390sev LIZ;

    public C1626150sQ1(InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = interfaceC1635390sev;
    }

    @Override // X.InterfaceC1629330sV9
    public final void LJII(Effect effect) {
        this.LIZ.LJII(effect);
    }

    @Override // X.InterfaceC1629330sV9
    public final void LIZIZ(String str, final C1698220uIG c1698220uIG) {
        this.LIZ.LJIIZILJ(str, null, new IEffectDownloadProgressListener() { // from class: X.0sVQ
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                IFetchEffectListener iFetchEffectListener = c1698220uIG;
                if (iFetchEffectListener != null) {
                    iFetchEffectListener.onStart(effect);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                IFetchEffectListener iFetchEffectListener = c1698220uIG;
                if (iFetchEffectListener != null) {
                    iFetchEffectListener.onSuccess(effect);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                IFetchEffectListener iFetchEffectListener = c1698220uIG;
                if (iFetchEffectListener != null) {
                    iFetchEffectListener.onFail(effect, exceptionResult);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
                IEffectDownloadProgressListener iEffectDownloadProgressListener;
                IFetchEffectListener iFetchEffectListener = c1698220uIG;
                if ((iFetchEffectListener instanceof IEffectDownloadProgressListener) && (iEffectDownloadProgressListener = (IEffectDownloadProgressListener) iFetchEffectListener) != null) {
                    iEffectDownloadProgressListener.onProgress(effect, i, j);
                }
            }
        });
    }

    @Override // X.InterfaceC1629330sV9
    public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (C2281551ESb.LIZIZ.LJII() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1626120sPy(this, effect, iFetchEffectListener, null), 3);
            return;
        }
        if (this.LIZ.LJIJJLI(effect)) {
            if (iFetchEffectListener instanceof InterfaceC1626110sPx) {
                ((InterfaceC1626110sPx) iFetchEffectListener).LIZIZ();
                return;
            } else {
                if (iFetchEffectListener != null) {
                    iFetchEffectListener.onSuccess(effect);
                    return;
                }
                return;
            }
        }
        this.LIZ.LJIIL(effect, new C1629510sVR(iFetchEffectListener));
    }

    @Override // X.InterfaceC1629330sV9
    public final void LIZLLL(String str, C1632330sZz c1632330sZz) {
        this.LIZ.LJJIJIL(str, C2097608Jq.LJ(), c1632330sZz);
    }

    @Override // X.InterfaceC1629330sV9
    public final void LJI(String str, C1632350sa1 c1632350sa1) {
        this.LIZ.LJIJI(str, c1632350sa1);
    }

    @Override // X.InterfaceC1629330sV9
    public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        this.LIZ.LIZ(list, map, iFetchEffectListByIdsListener);
    }

    @Override // X.InterfaceC1629330sV9
    public final void LJ(List<String> list, boolean z, Map<String, String> map, final IFetchEffectListListener iFetchEffectListListener) {
        this.LIZ.LJFF(list, z, map, new IFetchEffectListListener() { // from class: X.0sQ2
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                if (iFetchEffectListListener2 != null) {
                    iFetchEffectListListener2.onFail(exceptionResult);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                if (iFetchEffectListListener2 != null) {
                    iFetchEffectListListener2.onSuccess(list2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1629330sV9
    public final void LJFF(Effect effect, boolean z, boolean z2, boolean z3, C1698220uIG c1698220uIG) {
        if (this.LIZ.LJIJJLI(effect)) {
            if (c1698220uIG instanceof InterfaceC1626110sPx) {
                ((InterfaceC1626110sPx) c1698220uIG).LIZIZ();
                return;
            } else {
                c1698220uIG.onSuccess(effect);
                return;
            }
        }
        this.LIZ.LJ(effect, z, z2, z3, c1698220uIG);
    }
}
