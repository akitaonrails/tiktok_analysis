package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458080o2w {
    public static AudioRatioInfo LJIIJ;
    public static C0F3X LJIIL;
    public static AutoApplyMusicResponse LJIILIIL;
    public static boolean LJIILJJIL;
    public boolean LIZ;
    public VideoPublishEditModel LIZIZ;
    public Context LIZJ;
    public long LIZLLL;
    public C09AY LJ;
    public AwS371S0200000_5 LJFF;
    public InterfaceC420801kM LJII;
    public WeakReference<Activity> LJIIIZ;
    public static long LJIIJJI = -1;
    public static final List<Function1<C0F3X, Unit>> LJIILL = new ArrayList();
    public static final String LJIILLIIL = "aed check by server time out";
    public static final String LJIIZILJ = "choose-music";
    public static long LJIJ = System.currentTimeMillis();
    public static final C01GW<IEditMusicServiceApi> LJIJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(212));
    public static final C01GW<IMusicEditService> LJIJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(211));
    public final MutableLiveData<C1457940o2i<C1458010o2p>> LJI = new MutableLiveData<>();
    public long LJIIIIZZ = -1;

    public final void LIZ() {
        C1458390o3R.LIZ.getClass();
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", "cancelLoad");
        C0MS9.LIZ(this.LJI, new C1457940o2i(EnumC1457770o2R.CANCEL, null, 6));
        InterfaceC420801kM interfaceC420801kM = this.LJII;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LJII = null;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        if (videoPublishEditModel != null) {
            C1458390o3R.LJJIIJ(this.LJIIIIZZ);
            C1458390o3R.LJIJJ(this.LJIIIIZZ, videoPublishEditModel, false);
        }
    }

    public final boolean LJIIJ() {
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI()) {
            VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
            if (Intrinsics.LJFF(videoPublishEditModel != null ? videoPublishEditModel.mShootWay : null, "direct_shoot")) {
                return true;
            }
        }
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ()) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        return !Intrinsics.LJFF(videoPublishEditModel2 != null ? videoPublishEditModel2.mShootWay : null, "direct_shoot");
    }

    public static C11NZ LJFF(VideoPublishEditModel videoPublishEditModel, C2256608sm c2256608sm) {
        C11NZ c11nzLIZIZ;
        long jLIZJ;
        if (videoPublishEditModel == null || (c11nzLIZIZ = C1457440o1u.LIZIZ(videoPublishEditModel, 0L, 0, c2256608sm, 6)) == null) {
            return null;
        }
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel)) {
            jLIZJ = ((Number) C18017073v.LIZ.getValue()).longValue();
        } else if (videoPublishEditModel.getVideoCount() > 0) {
            SettingsManager.LIZLLL().getClass();
            jLIZJ = SettingsManager.LJFF("studio_recommend_music_delay_video", 0L);
        } else {
            jLIZJ = C2538909xD.LIZJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeOut: ");
        sbLIZ.append(jLIZJ);
        C201955140j.LJIILIIL("choose-music", C2188811AlT.LIZIZ(sbLIZ));
        if (jLIZJ > 0) {
            return c11nzLIZIZ.LJLJI(jLIZJ, TimeUnit.MILLISECONDS);
        }
        return c11nzLIZIZ;
    }

    public static void LJIIIIZZ(String str, String str2) {
        C1458390o3R.LIZ.getClass();
        C1458600o3m c1458600o3m = C1458390o3R.LIZJ.get(str);
        if (c1458600o3m == null) {
            c1458600o3m = new C1458600o3m(0);
            c1458600o3m.LIZ = str;
        }
        if (str2 != null) {
            c1458600o3m.LIZIZ = str2;
        }
        c1458600o3m.LJI = 1;
        c1458600o3m.LIZJ = true;
        C1458390o3R.LIZIZ(c1458600o3m);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ LIZJ(final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r33, X.C2256608sm r34) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458080o2w.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.08sm):X.11NZ");
    }

    public final C11NZ<String> LIZLLL(final VideoPublishEditModel videoPublishEditModel, boolean z, final C2256608sm c2256608sm) {
        if (videoPublishEditModel == null) {
            return null;
        }
        C1458370o3P.LIZ.getClass();
        String strLJIILLIIL = C1458370o3P.LJIILLIIL();
        if (C1458370o3P.LJIJJ() && z && strLJIILLIIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use cache in pic preZipUrl: ");
            sbLIZ.append(strLJIILLIIL);
            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            return C11NZ.LJJJJZ(strLJIILLIIL);
        }
        long jLIZJ = C2538909xD.LIZJ();
        if (z) {
            C11NZ c11nz = (C11NZ) C1458370o3P.LJIIIIZZ().getSecond();
            if (c11nz != null) {
                C201955140j.LJIILIIL("PreEmbTaskManager", "StaticImageVideoAutoMusicLoader:has runningTaskSubject");
                return c11nz.LJLJI(jLIZJ, TimeUnit.MILLISECONDS).LJJL(new InterfaceC1487280oo2() { // from class: X.0o31
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        if (th instanceof TimeoutException) {
                            C201955140j.LJIILIIL("PreEmbTaskManager", "jaydenyao---------- timeout occurred, fallback to launchFallBackObservable in staticImageVideoAutoMusicLoader");
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("jaydenyao---------- error occurred: ");
                            sbLIZ2.append(th.getMessage());
                            sbLIZ2.append(", fallback to launchFallBackObservable in staticImageVideoAutoMusicLoader");
                            C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        C1458080o2w c1458080o2w = this.LL;
                        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        C2256608sm c2256608sm2 = c2256608sm;
                        c1458080o2w.getClass();
                        C1458080o2w.LJFF(videoPublishEditModel2, c2256608sm2);
                        return null;
                    }
                }).LJLIIL(1L);
            }
            return LJFF(videoPublishEditModel, c2256608sm);
        }
        return LJFF(videoPublishEditModel, c2256608sm);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, AVMusic aVMusic, InterfaceC1455230nyL interfaceC1455230nyL) {
        aVMusic.setMusicSelectedFrom("video_capsule_recommend");
        if (aVMusic.getFullSongDetail() != null && LJIIJ()) {
            aVMusic.setMusicStart((int) (aVMusic.getPreviewStartTime() * LSPassThroughRecordSizeConfig.DEFAULT));
            aVMusic.setMusicStartFromCut(aVMusic.getMusicStart());
            aVMusic.setMusicBeginTime(aVMusic.getMusicStart());
        }
        interfaceC1455230nyL.LIZ(aVMusic);
        if (C545630Lab.LIZ()) {
            ((MusicMonitorTaskQueueService) ServiceManager.get().getService(MusicMonitorTaskQueueService.class)).LIZJ(new C571270Mar(videoPublishEditModel, "edit_auto_add_music", null, null, 12));
        }
        ?? r0 = this.LJ;
        if (r0 != 0) {
            r0.invoke(aVMusic);
        }
    }

    public static void LJII(long j, boolean z, boolean z2, boolean z3) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "edit_auto_music");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LIZJ(z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "hit_cache");
        if (z3) {
            str = "music_stream";
        } else {
            str = "default";
        }
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
    }

    public final void LJ(Context context, VideoPublishEditModel videoPublishEditModel, long j, Activity activity) {
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = context;
        this.LIZLLL = j;
        this.LJIIIZ = new WeakReference<>(activity);
    }

    public static final void LIZIZ(final AVMusic aVMusic, final C1458080o2w c1458080o2w, final Function1<? super String, Unit> function1, final long j, final Function2<? super Integer, ? super String, Unit> function2, Context context) {
        C0CHQ.LIZ().LJJJJL().LJ("static_image_auto_music", context, aVMusic, 6, false, new InterfaceC1416880myU() { // from class: X.0o2x
            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
                C1458080o2w c1458080o2w2 = c1458080o2w;
                long j2 = j;
                c1458080o2w2.getClass();
                C1458080o2w.LJII(j2, true, z, false);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                String str2;
                Function2<Integer, String, Unit> function22 = function2;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                function22.invoke(num, str2);
                C1458080o2w c1458080o2w2 = c1458080o2w;
                long j2 = j;
                c1458080o2w2.getClass();
                C1458080o2w.LJII(j2, false, false, false);
                C358150E2j.LIZ(c1458080o2w.LIZIZ, num, str, "normal", aVMusic);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                function1.invoke(str);
                C358150E2j.LIZIZ(c1458080o2w.LIZIZ, System.currentTimeMillis() - j, "normal", aVMusic, str, Long.valueOf(c1458080o2w.LIZLLL), null);
            }
        }, c1458080o2w.LJIIJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11JN LJI(final X.C1458080o2w r47, final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r48, final X.InterfaceC1455230nyL r49, boolean r50, boolean r51, boolean r52, com.bytedance.ies.nle.editor_jni.NLEModel r53, int r54) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458080o2w.LJI(X.0o2w, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0nyL, boolean, boolean, boolean, com.bytedance.ies.nle.editor_jni.NLEModel, int):X.11JN");
    }
}
