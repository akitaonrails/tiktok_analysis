package X;

import Y.AObjectS245S0100000_22;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0nmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448000nmg extends AbstractC2255721DQs<InterfaceC1448100nmq> implements InterfaceC1448100nmq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final EnumC569740MWe LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1448100nmq LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C1453870nw9.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public C1448010nmh LLIZ;
    public volatile boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1448000nmg.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1448000nmg.class, "screenStateDispatch", "getScreenStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1448000nmg.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJI = 8;
    }

    private final C1453870nw9<EnumC1641390sob> Z1() {
        return (C1453870nw9) this.LLILZIL.getValue(this, LLJ[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJ[0]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLILZLL.getValue(this, LLJ[2]);
    }

    @Override // X.InterfaceC1448100nmq
    public void qZ1() {
        long jLIZ;
        int i;
        InterfaceC1621080sHq interfaceC1621080sHqUp2;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        Long lValueOf = Long.valueOf(Z1().LIZLLL);
        long jLongValue = lValueOf.longValue() >= 0 ? lValueOf.longValue() : System.currentTimeMillis();
        RecordMobModel recordMobModel = getShortVideoContext().creativeModel.recordMobModel;
        long j = recordMobModel.startRecordTime;
        if (C1442110ndB.LIZ()) {
            jLIZ = C1448840no2.LIZIZ(j, jLongValue);
            j += jLIZ;
        } else if (C1448080nmo.LIZ()) {
            C1448010nmh c1448010nmh = this.LLIZ;
            jLIZ = c1448010nmh != null ? c1448010nmh.LIZ() : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShootUIFirstFrameComponent: lastBackgroundDuration = ");
            sbLIZ.append(jLIZ);
            C201955140j.LIZIZ("BackgroundDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
            if (jLIZ > 0) {
                jLongValue -= jLIZ;
            }
        } else {
            jLIZ = 0;
        }
        long j2 = jLongValue - j;
        long j3 = recordMobModel.onActivityResumeMillis - j;
        long j4 = recordMobModel.firstMeasureStartTimeMS;
        long j5 = recordMobModel.firstDrawnTimeMS;
        if (j2 <= 0) {
            return;
        }
        String strO2 = o2();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "start_time");
        c0lab.LIZIZ(j2, "enter_anim_complete_duration");
        if (recordMobModel.onActivityResumeMillis > 0) {
            c0lab.LIZIZ(j3, "first_ui_frame_duration");
        }
        if (recordMobModel.firstDrawnTimeMS > 0 && recordMobModel.firstMeasureStartTimeMS > 0) {
            c0lab.LIZIZ(j5 - j4, "ui_done_to_measure_duration");
        }
        if (recordMobModel.firstDrawnTimeMS > 0) {
            c0lab.LIZIZ(j5 - j, "ui_done_to_start_duration");
            c0lab.LIZIZ(jLongValue - j5, "anim_end_to_ui_done_duration");
        }
        c0lab.LIZ(recordMobModel.sdkLoadVESoStatus, "sdk_load_ve_so_status");
        c0lab.LIZ(recordMobModel.preloadVESoStatus, "preload_ve_so_task_status");
        c0lab.LIZIZ(recordMobModel.preloadVESoCostTime, "preload_ve_so_cost_time");
        c0lab.LIZIZ(recordMobModel.decompressVESoCostTime, "extra_decompress_time");
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LJ("enter_from", getShortVideoContext().enterFrom);
        c0lab.LJ("shoot_enter_from", strO2);
        c0lab.LJ("shoot_enter_method", getShortVideoContext().creativeModel.commonMobModel.shootEnterMethod);
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJFF("cold_start", recordMobModel.isColdStart);
        c0lab.LIZIZ(recordMobModel.waitVESoLoadDuration, "wait_ve_so_duration_in_main");
        c0lab.LIZIZ(recordMobModel.effectDownloadTime, "effect_download_duration");
        c0lab.LIZIZ(recordMobModel.musicDownloadTime, "music_download_duration");
        c0lab.LIZIZ(recordMobModel.videoDownloadTime, "video_download_duration");
        q stickerApiComponent = getStickerApiComponent();
        c0lab.LJ("prop_id", (stickerApiComponent == null || (interfaceC1621080sHqUp2 = stickerApiComponent.Up2()) == null) ? null : interfaceC1621080sHqUp2.LJFF());
        Effect effect = getShortVideoContext().creativeModel.recordEffectModel.autoApplyEffect;
        c0lab.LIZIZ(effect != null ? effect.getProvider() : 0L, "provider");
        Effect effect2 = getShortVideoContext().creativeModel.recordEffectModel.autoApplyEffect;
        c0lab.LIZIZ(effect2 != null ? effect2.getPackage_size() : 0L, "package_size");
        c0lab.LJ("enter_dm_way", getShortVideoContext().creativeModel.initialModel.dmCameraModel.enterDMWay);
        c0lab.LIZ(this.LL.getTab(), "from_tab");
        int i2 = C2122608Tg.LIZ[TENativeLibsLoader.getLibraryLoadStatus().ordinal()];
        if (i2 == 1) {
            i = -1;
        } else if (i2 == 2) {
            i = 0;
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            i = 1;
        }
        c0lab.LIZ(i, "ve_so_load_status_at_ffd");
        if (C1442110ndB.LIZ() || C1448080nmo.LIZ()) {
            c0lab.LIZIZ(jLIZ, "background_duration_before_ffd");
        }
        long j6 = recordMobModel.duetStitchClickTime;
        if (j6 > 0) {
            c0lab.LIZIZ(jLongValue - j6, "duet_stitch_first_frame_duration");
        }
        C1403900mdY c1403900mdY = C1403900mdY.LIZ;
        CreativeModel creativeModel = getShortVideoContext().creativeModel;
        c1403900mdY.getClass();
        C1403900mdY.LJFF(creativeModel, c0lab);
        boolean zLIZ = C0C1K.LIZ();
        C21142717oX.LIZIZ(c0lab, !zLIZ);
        if (zLIZ) {
            C860560XpO.LIZ(c0lab);
        }
        C303380Buq.LIZ("tool_performance_record_first_frame", c0lab.LIZ);
    }

    private final String o2() {
        String shootEnterFrom;
        String str = "sub_only_video_page";
        if (!Intrinsics.LJFF(getShortVideoContext().shootWay, "sub_only_video_page")) {
            str = "";
            if (!Intrinsics.LJFF(getShortVideoContext().shootWay, "story") || !getShortVideoContext().creativeModel.commonMobModel.isUploadDirectEnter) {
                CreativeFlowData creativeFlowData = getShortVideoContext().creativeFlowData;
                if (creativeFlowData == null || creativeFlowData.getShootExtraData() == null) {
                    shootEnterFrom = getShortVideoContext().enterFrom;
                    if (shootEnterFrom == null) {
                        return "";
                    }
                } else {
                    ShootExtraData shootExtraData = getShortVideoContext().creativeFlowData.getShootExtraData();
                    if (shootExtraData != null) {
                        shootEnterFrom = shootExtraData.getShootEnterFrom();
                        if (shootEnterFrom == null) {
                            return "";
                        }
                    }
                }
                return shootEnterFrom;
            }
            shootEnterFrom = getShortVideoContext().creativeModel.commonMobModel.shootEnterFrom;
            if (shootEnterFrom != null) {
                return shootEnterFrom;
            }
        }
        return str;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C1448080nmo.LIZ()) {
            this.LLIZ = new C1448010nmh();
        }
        Z1().LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS245S0100000_22(this, 79));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C1448010nmh c1448010nmh;
        super.onDestroy();
        if (!C1448080nmo.LIZ() || (c1448010nmh = this.LLIZ) == null) {
            return;
        }
        C201955140j.LIZIZ("BackgroundDurationTracker", "reset: State reset.");
        c1448010nmh.LIZ = EnumC1448040nmk.LL;
        c1448010nmh.LIZIZ = 0L;
        c1448010nmh.LIZJ = 0L;
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        C1448010nmh c1448010nmh;
        super.onStart();
        if (!C1448080nmo.LIZ() || (c1448010nmh = this.LLIZ) == null) {
            return;
        }
        c1448010nmh.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        C1448010nmh c1448010nmh;
        super.onStop();
        if (!C1448080nmo.LIZ() || (c1448010nmh = this.LLIZ) == null) {
            return;
        }
        c1448010nmh.LIZJ();
    }

    public InterfaceC1448100nmq W1() {
        return this.LLILLL;
    }

    public final EnumC569740MWe X1() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1448000nmg(EnumC569740MWe enumC569740MWe, C1DRG c1drg) {
        this.LL = enumC569740MWe;
        this.LLILLJJLI = c1drg;
    }
}
