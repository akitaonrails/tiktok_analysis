package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634550sdZ implements IEffectDownloadProgressListener {
    public final String LIZ;
    public final IFetchEffectListener LIZIZ;
    public final boolean LIZJ;
    public final Map<String, String> LIZLLL;
    public final C138P LJ = C138P.LIZ();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(97));

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String unzipPath;
        long jLJIIJ;
        Effect effect2 = effect;
        long jLIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        String strLIZ = C1634570sdb.LIZ(this.LIZ);
        String effectId = null;
        if (effect2 != null) {
            unzipPath = effect2.getUnzipPath();
        } else {
            unzipPath = null;
        }
        if (((Boolean) this.LJFF.getValue()).booleanValue()) {
            if (unzipPath == null) {
                unzipPath = "";
            }
            jLJIIJ = C08QQ.LIZ(unzipPath);
        } else {
            jLJIIJ = C20012413Ry.LJIIJ(unzipPath);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(this.LIZLLL);
        c0lab.LJ("resource_type", strLIZ);
        c0lab.LIZIZ(jLIZIZ, "duration");
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (effect2 != null) {
            effectId = effect2.getEffectId();
        }
        c0lab.LJ("resource_id", effectId);
        c0lab.LJFF("is_auto_download", this.LIZJ);
        c0lab.LIZIZ(jLJIIJ, "source_file_size");
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
        if (Intrinsics.LJFF(strLIZ, "effect")) {
            C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String effectId;
        long jLIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
        String strLIZ = C1634570sdb.LIZ(this.LIZ);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(this.LIZLLL);
        c0lab.LJ("resource_type", strLIZ);
        c0lab.LIZIZ(jLIZIZ, "duration");
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        c0lab.LJ("resource_id", effectId);
        c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
        c0lab.LIZ(exceptionResult.getErrorCode(), "error_code");
        String msg = exceptionResult.getMsg();
        if (msg == null) {
            msg = "empty_error_msg";
        }
        c0lab.LJ("error_msg", msg);
        c0lab.LJFF("is_auto_download", this.LIZJ);
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
        if (Intrinsics.LJFF(strLIZ, "effect")) {
            C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i, j);
        }
    }

    public C1634550sdZ(String str, IFetchEffectListener iFetchEffectListener, boolean z, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = iFetchEffectListener;
        this.LIZJ = z;
        this.LIZLLL = map;
    }
}
