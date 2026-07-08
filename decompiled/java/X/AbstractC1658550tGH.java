package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.tools.music.music.collect.count.api.CollectCountResponse;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1658550tGH extends AbstractC2255721DQs<InterfaceC1459120o4c> implements InterfaceC1459120o4c, InterfaceC379610EuV, C0F1U {
    public static final C1658560tGI LLILZIL = new Object() { // from class: X.0tGI
    };
    public static final int LLILZLL = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(238));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(259));
    public final InterfaceC1459120o4c LLILZ = this;

    private final long X1() {
        return w2().getLong(C786410Ut5.j4("first_show_time_in_session_%s", Arrays.copyOf(new Object[]{o2()}, 1)), 0L);
    }

    public abstract CreativeModel Z1();

    private final String o2() {
        return (String) this.LLILLL.getValue();
    }

    private final Keva w2() {
        return (Keva) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1459120o4c
    public void F5() {
        CreativeInitialModel creativeInitialModel;
        CollectMusicModel collectMusicModel;
        CreativeModel creativeModelZ1 = Z1();
        if (creativeModelZ1 == null || (creativeInitialModel = creativeModelZ1.initialModel) == null || (collectMusicModel = creativeInitialModel.collectMusicModel) == null || collectMusicModel.getHasMarkedPanelFirstShowtime()) {
            return;
        }
        collectMusicModel.setHasMarkedPanelFirstShowtime(true);
        w2().storeLong(C786410Ut5.j4("first_show_time_in_session_%s", Arrays.copyOf(new Object[]{o2()}, 1)), C0XK4.LIZ());
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        CreativeModel creativeModelZ1;
        super.onCreate();
        if (C1647240sy2.LIZ().lazyLoadComponentV2 || (creativeModelZ1 = Z1()) == null) {
            return;
        }
        G2(creativeModelZ1);
    }

    @Override // X.InterfaceC1459120o4c
    public C11PQ<Integer> yt() {
        if (C1647240sy2.LIZ().lazyLoadComponentV2) {
            CreativeModel creativeModelZ1 = Z1();
            if (creativeModelZ1 == null) {
                return null;
            }
            G2(creativeModelZ1);
        }
        return C744530TIl.LIZ;
    }

    public InterfaceC1459120o4c W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1658550tGH(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void G2(CreativeModel creativeModel) {
        C11NZ<CollectCountResponse> c11nzLIZ;
        if (!creativeModel.initialModel.collectMusicModel.getHasLoadCollectCount()) {
            creativeModel.initialModel.collectMusicModel.setHasLoadCollectCount(true);
            long jX1 = X1();
            C11JF c11jf = C744530TIl.LIZIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C11PQ<Integer> c11pq = C744530TIl.LIZ;
            if (c11pq != null) {
                c11pq.onComplete();
            }
            C744530TIl.LIZ = new C11PQ<>();
            InterfaceC1658570tGJ value = C1658580tGK.LIZ.getValue();
            InterfaceC420801kM interfaceC420801kMLJJLL = null;
            if (value != null && (c11nzLIZ = value.LIZ(jX1)) != null) {
                interfaceC420801kMLJJLL = c11nzLIZ.LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0TIk
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        int iIntValue;
                        C1C7U.LIZ("CollectCountRepository@2a14.preloadCollectCount$1");
                        CollectCountResponse collectCountResponse = (CollectCountResponse) obj;
                        C11PQ<Integer> c11pq2 = C744530TIl.LIZ;
                        if (c11pq2 != null) {
                            Integer count = collectCountResponse.getCount();
                            if (count != null) {
                                iIntValue = count.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            c11pq2.onNext(Integer.valueOf(iIntValue));
                        }
                        C1C7U.LIZIZ("CollectCountRepository@2a14.preloadCollectCount$1");
                    }
                }, new C09JN() { // from class: X.0TIm
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("CollectCountRepository@2a14.preloadCollectCount$2");
                        Throwable th = (Throwable) obj;
                        C11PQ<Integer> c11pq2 = C744530TIl.LIZ;
                        if (c11pq2 != null) {
                            c11pq2.onError(th);
                        }
                        C1C7U.LIZIZ("CollectCountRepository@2a14.preloadCollectCount$2");
                    }
                });
            }
            C744530TIl.LIZIZ = (C11JF) interfaceC420801kMLJJLL;
        }
    }
}
