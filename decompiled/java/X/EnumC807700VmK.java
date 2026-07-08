package X;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.videoshop.context.VideoContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC807700VmK implements InterfaceC19353710nf, InterfaceC789960Uyo {
    public static final EnumC807700VmK KEEPER;
    public static final /* synthetic */ EnumC807700VmK[] LLILZLL;
    public C19353610ne LLILLJJLI;
    public C789950Uyn LLILLL;
    public boolean LLILZ;
    public VideoContext currentVideoContext;
    public EnumC804620VhM networkType;
    public final Map<Context, VideoContext> LL = new HashMap();
    public final C854540Xfg LLILZIL = new C854540Xfg(this, 3);

    @Override // X.InterfaceC789960Uyo
    public void onScreenOn() {
    }

    static {
        EnumC807700VmK enumC807700VmK = new EnumC807700VmK();
        KEEPER = enumC807700VmK;
        LLILZLL = new EnumC807700VmK[]{enumC807700VmK};
    }

    public EnumC807700VmK() {
        Context context;
        if (C807730VmN.LIZ != null && (context = C807730VmN.LIZ) != null) {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new C19353610ne(context, this);
            }
            if (this.LLILLL == null) {
                this.LLILLL = new C789950Uyn(context, this);
            }
        }
        LIZJ();
    }

    public static EnumC807700VmK[] values() {
        return (EnumC807700VmK[]) LLILZLL.clone();
    }

    public final void LIZJ() {
        Context context = C807730VmN.LIZ;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (context != null) {
            try {
                C786410Ut5.LJIJJ(context, this.LLILZIL, intentFilter);
                this.LLILZ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public EnumC804620VhM getNetworkType() {
        Context context = C807730VmN.LIZ;
        if (!this.LLILZ && context != null) {
            this.networkType = C804420Vh2.LJ(context);
        }
        return this.networkType;
    }

    @Override // X.InterfaceC789960Uyo
    public void onScreenOff() {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator it2 = ((ConcurrentHashMap) videoContext.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                InterfaceC807720VmM interfaceC807720VmM = (InterfaceC807720VmM) ((Map.Entry) it2.next()).getValue();
                if (interfaceC807720VmM != null) {
                    interfaceC807720VmM.onScreenOff(this.currentVideoContext);
                }
            }
        }
    }

    public C19353610ne getVideoAudioFocusController() {
        return this.LLILLJJLI;
    }

    public static EnumC807700VmK valueOf(String str) {
        return (EnumC807700VmK) C08FF.LIZ(EnumC807700VmK.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContext getVideoContext(Context context) {
        if (C807730VmN.LIZ == null && context != null) {
            C807730VmN.LIZ = C786410Ut5.N3(context);
        }
        if (!this.LLILZ) {
            LIZJ();
        }
        Activity activityLIZ = C1474460oTM.LIZ(context);
        if (activityLIZ instanceof LifecycleOwner) {
            if (((HashMap) this.LL).containsKey(activityLIZ)) {
                return (VideoContext) ((HashMap) this.LL).get(activityLIZ);
            }
            VideoContext videoContext = new VideoContext(activityLIZ);
            if (((LifecycleOwner) activityLIZ).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                ((HashMap) this.LL).put(activityLIZ, videoContext);
            }
            return videoContext;
        }
        return null;
    }

    public void onActResume(VideoContext videoContext) {
        Context context = C807730VmN.LIZ;
        if (context != null) {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new C19353610ne(context, this);
            }
            if (this.LLILLL == null) {
                this.LLILLL = new C789950Uyn(context, this);
            }
        }
        if (videoContext != null) {
            videoContext.LLJIJIL = this.LLILLJJLI;
            videoContext.LLJILJIL = this.LLILLL;
            C2178641AOg c2178641AOg = videoContext.LLILLL;
            if (c2178641AOg != null) {
                c2178641AOg.setTryToInterceptPlay(true);
            }
            this.currentVideoContext = videoContext;
        }
    }

    @Override // X.InterfaceC19353710nf
    public void onAudioFocusGain(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator it2 = ((ConcurrentHashMap) videoContext.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
                if (c807710VmL != null) {
                    c807710VmL.onAudioFocusGain(this.currentVideoContext, z);
                }
            }
        }
    }

    @Override // X.InterfaceC19353710nf
    public void onAudioFocusLoss(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator it2 = ((ConcurrentHashMap) videoContext.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
                if (c807710VmL != null) {
                    c807710VmL.onAudioFocusLoss(this.currentVideoContext, z);
                }
            }
        }
    }

    @Override // X.InterfaceC789960Uyo
    public void onScreenUserPresent(boolean z) {
        VideoContext videoContext = this.currentVideoContext;
        if (videoContext != null) {
            Iterator it2 = ((ConcurrentHashMap) videoContext.LLJ).entrySet().iterator();
            while (it2.hasNext()) {
                InterfaceC807720VmM interfaceC807720VmM = (InterfaceC807720VmM) ((Map.Entry) it2.next()).getValue();
                if (interfaceC807720VmM != null) {
                    interfaceC807720VmM.onScreenUserPresent(this.currentVideoContext);
                }
            }
        }
    }

    public void onActDestroy(Context context, VideoContext videoContext) {
        if (videoContext != null) {
            videoContext.LLJIJIL = null;
            videoContext.LLJILJIL = null;
            if (videoContext == this.currentVideoContext) {
                this.currentVideoContext = null;
            }
        }
        ((HashMap) this.LL).remove(context);
        Iterator it2 = ((HashMap) this.LL).keySet().iterator();
        while (it2.hasNext()) {
            Object obj = (Context) it2.next();
            if ((obj instanceof LifecycleOwner) && ((LifecycleOwner) obj).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                it2.remove();
            }
        }
    }
}
