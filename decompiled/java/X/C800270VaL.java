package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800270VaL implements InterfaceC800110Va5 {
    public static final List<String> LIZLLL = Arrays.asList("NewLivePrefetchLoadOptTask", "LivePrefetchLoadOptTask", "ColdBootLivePreParseDNSTask", "MediaStrategyInitTask", "LiveBootFinishSettingTask", "LiveInjectContextTask", "LiveStreamStrategyInitTask", "LivePodcastApiRequestTask", "LivePipoInitOptimizeTask");
    public List<String> LIZ;
    public volatile boolean LIZIZ;
    public C800150Va9 LIZJ;

    @Override // X.InterfaceC800110Va5
    public final String scene() {
        return "5vv-live";
    }

    public final void LIZ(boolean z) {
        C800150Va9 c800150Va9;
        String strKey;
        this.LIZIZ = z;
        if (!z && (c800150Va9 = this.LIZJ) != null) {
            Iterator<C800160VaA> it2 = c800150Va9.LIZIZ(EnumC800210VaF.Normal).iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (C800160VaA c800160VaA : this.LIZJ.LIZIZ(EnumC800210VaF.Suspend)) {
                    InterfaceC800080Va2 interfaceC800080Va2 = c800160VaA.LIZ;
                    if (interfaceC800080Va2 != null) {
                        strKey = interfaceC800080Va2.key();
                    } else {
                        strKey = c800160VaA.LIZIZ;
                    }
                    jSONObject.put(strKey, 1);
                }
                jSONObject2.put("metric", jSONObject);
                C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(jSONObject2, 3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC800110Va5
    public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (this.LIZIZ) {
            EnumC799980VZs enumC799980VZsTriggerType = interfaceC800080Va2.triggerType();
            if (!Looper.getMainLooper().isCurrentThread()) {
                if (this.LIZ == null) {
                    this.LIZ = new ArrayList(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("live5vv_task_allowlist", new HashSet()));
                }
                if (this.LIZ.isEmpty()) {
                    this.LIZ = LIZLLL;
                }
                if (!this.LIZ.contains(interfaceC800080Va2.key()) && (enumC799980VZsTriggerType == EnumC799980VZs.TASK_BACKGROUND || enumC799980VZsTriggerType == EnumC799980VZs.TASK_BOOT_FINISH)) {
                    while (this.LIZIZ) {
                        try {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    return EnumC800210VaF.Normal;
                }
            }
        }
        return EnumC800210VaF.Normal;
    }
}
