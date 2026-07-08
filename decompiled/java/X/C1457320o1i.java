package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.Unit;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0o1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457320o1i extends AbstractC2255721DQs<InterfaceC1454700nxU> implements InterfaceC1454700nxU, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457320o1i.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457320o1i.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    public InterfaceC1454700nxU W1() {
        return this;
    }

    private final InterfaceC559500Lwy X1() {
        return (InterfaceC559500Lwy) this.LLILLL.getValue(this, LLILZ[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    private final void Z1() {
        if (C1454440nx4.LIZ() && C1428470nHB.LJJJLIIL(LJJJLIIL()) && LJJJLIIL().isFromRestoreRecover()) {
            boolean zLJJIJLIJ = C140D.LIZ.LJJIJLIJ(LJJJLIIL().getCreativeInfo());
            LJJJLIIL().creativeModel.commonMobModel.c2paReadRecoverType = zLJJIJLIJ ? 2 : C1436990nUv.LIZLLL(LJJJLIIL()) == 2 ? 1 : 0;
        }
    }

    private final void init() {
        if (C1454440nx4.LIZ()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1457320o1i(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void handleReadC2PAFinishEvent(C2037007yS c2037007yS) {
        String bucketTaskId;
        C0ETY c0ety;
        Class<InterfaceC559500Lwy> cls;
        AwS231S0300000_22 awS231S0300000_22;
        C140D c140d = C140D.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c140d.getClass();
        C1436380nTw c1436380nTwLJJIIZ = C140D.LJJIIZ(videoPublishEditModelLJJJLIIL);
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC559500Lwy.class;
            awS231S0300000_22 = new AwS231S0300000_22(c1436380nTwLJJIIZ, this, c2037007yS, 19);
        } else if (C365940EWi.LIZLLL(videoPublishEditModelLJJJLIIL2)) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC559500Lwy.class;
            awS231S0300000_22 = new AwS231S0300000_22(c1436380nTwLJJIIZ, this, c2037007yS, 20);
        } else {
            InterfaceC559500Lwy interfaceC559500Lwy = (InterfaceC559500Lwy) ((C05YF) diContainer.LJIIL(null, InterfaceC559500Lwy.class));
            if (interfaceC559500Lwy != null) {
                interfaceC559500Lwy.Qk(false);
            }
            for (AIGCInfo aIGCInfo : c1436380nTwLJJIIZ.LIZ) {
                AIGCInfo aIGCInfo2 = aIGCInfo;
                if (aIGCInfo2 != null) {
                    bucketTaskId = aIGCInfo2.getBucketTaskId();
                } else {
                    bucketTaskId = null;
                }
                if (Intrinsics.LJFF(bucketTaskId, c2037007yS.LIZ)) {
                    if (aIGCInfo == null) {
                        return;
                    }
                    C140D c140d2 = C140D.LIZ;
                    String creationId = LJJJLIIL().getCreativeInfo().getCreationId();
                    String str = c2037007yS.LIZ;
                    c140d2.getClass();
                    C140D.LJIIIIZZ(creationId, str);
                    return;
                }
            }
            return;
        }
        c0ety.Sd(cls, awS231S0300000_22);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void handleReadC2PAWithoutCreationInfoEvent(C2037207yU c2037207yU) {
        C140D c140d = C140D.LIZ;
        String creationId = LJJJLIIL().getCreativeInfo().getCreationId();
        String str = c2037207yU.LIZ;
        String str2 = c2037207yU.LIZIZ;
        c140d.getClass();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(creationId);
            sbLIZ.append('+');
            sbLIZ.append(str);
            C140D.LJIJJLI().storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
