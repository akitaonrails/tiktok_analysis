package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS126S0110000_8;
import kotlin.jvm.internal.AwS148S0101000_8;
import kotlin.jvm.internal.AwS1S0602000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS7S0100200_8;

/* JADX INFO: renamed from: X.0L2T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2T extends C536540L2m {
    public final C19EG LLILZLL;
    public long LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public C0LDE LLJ;
    public final C01GW LLJI;
    public final C536430L2b LLJIJIL;
    public final C536420L2a LLJILJIL;
    public final C536420L2a LLJILJILJ;
    public final C01GW LLJILLL;

    public final C0L2U LJII() {
        return (C0L2U) this.LLJI.getValue();
    }

    public static AIGCInfo LJFF(List list, List list2) {
        AIGCInfo aIGCInfo;
        AIGCInfo aIGCInfo2 = null;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AIGCInfo aIGCInfo3 = ((LayoutItemMedia) it2.next()).aigcInfo;
                if (aIGCInfo3 != null) {
                    if (aIGCInfo2 == null) {
                        aIGCInfo2 = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
                    }
                    C140C.LIZIZ(aIGCInfo2, aIGCInfo3);
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            MediaModel mediaModel = (MediaModel) it3.next();
            if (mediaModel != null && (aIGCInfo = mediaModel.aigcInfo) != null) {
                if (aIGCInfo2 == null) {
                    aIGCInfo2 = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
                }
                C140C.LIZIZ(aIGCInfo2, aIGCInfo);
            }
        }
        return aIGCInfo2;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.0Kx6] */
    @Override // X.C536540L2m, X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, final Intent intent) {
        CreativeDialogWrapper creativeDialogWrapper;
        ?? r14 = new MediaChooseResultListener() { // from class: X.0Kx6
            @Override // com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener
            public final void onMediaChooseSuccess() {
                C522350Ke9 c522350Ke9LIZIZ = C523870Kgb.LIZIZ(intent, C0L92.SUCCESS, "");
                if (c522350Ke9LIZIZ != null) {
                    c522350Ke9LIZIZ.LJIIIZ = true;
                } else {
                    c522350Ke9LIZIZ = null;
                }
                C522360KeA.LIZ(c522350Ke9LIZIZ);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener
            public final void onMediaChooseFail(String str) {
                C522350Ke9 c522350Ke9LIZIZ = C523870Kgb.LIZIZ(intent, C0L92.FAILED, str);
                if (c522350Ke9LIZIZ != null) {
                    c522350Ke9LIZIZ.LJIIIZ = true;
                } else {
                    c522350Ke9LIZIZ = null;
                }
                C522360KeA.LIZ(c522350Ke9LIZIZ);
            }
        };
        if (i2 != -1) {
            r14.onMediaChooseFail("resultCode != Activity.RESULT_OK");
            return;
        }
        this.LLIZ = intent.getLongExtra("extra_start_enter_edit_page", -1L);
        Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
        if (parcelableExtra != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                C0L2U c0l2uLJII = LJII();
                Activity activity = c0l2uLJII.LJFF.get();
                if (activity != null && !activity.isFinishing() && ((creativeDialogWrapper = c0l2uLJII.LIZLLL) == null || !creativeDialogWrapper.isShowing())) {
                    C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                    int i3 = c0l2uLJII.LIZ;
                    CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                    creativeLoadingDialogBuilder.showProgress(true);
                    creativeLoadingDialogBuilder.backCanCancel(false);
                    creativeLoadingDialogBuilder.cancelViewVisibleType(c0l2uLJII.LIZIZ);
                    creativeLoadingDialogBuilder.loadingMessage(activity.getString(2131845263));
                    creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(c0l2uLJII, 6));
                    CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, i3, creativeLoadingDialogBuilder);
                    c0l2uLJII.LIZLLL = creativeDialogWrapper2;
                    creativeDialogWrapper2.show();
                    C0CNO.LIZLLL(0L, new AwS148S0101000_8(c0l2uLJII, 0, 0));
                }
                C0L2U c0l2uLJII2 = LJII();
                C536420L2a c536420L2a = this.LLJILJIL;
                c0l2uLJII2.getClass();
                C0CNO.LIZLLL(0L, new AwS409S0200000_8(c0l2uLJII2, c536420L2a, 2));
                if (!((Boolean) C266930Ad9.LIZ.getValue()).booleanValue()) {
                    this.LLIZLLLIL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C534110Kx7(this, i, i2, intent, shortVideoContext, parcelableArrayListExtra, r14, null), 2);
                    return;
                } else {
                    this.LLIZLLLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZLL), null, null, new C534120Kx8(this, i, i2, intent, shortVideoContext, parcelableArrayListExtra, r14, null), 3);
                    return;
                }
            }
            r14.onMediaChooseFail("selectedMediaData isNullOrEmpty()");
            C201955140j.LJIIZILJ("selectedMediaData is invalid when onChosenResult invoked in UploadLayoutChooseResultImpl");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C0L2T(C19EG c19eg, C1DRG c1drg, long j, long j2) {
        super(j, j2, c19eg, c1drg);
        this.LLILZLL = c19eg;
        this.LLIZ = -1L;
        this.LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 769));
        this.LLJIJIL = new C536430L2b(20, 100);
        this.LLJILJIL = new C536420L2a(0, 20, LSPassThroughRecordSizeConfig.DEFAULT);
        this.LLJILJILJ = new C536420L2a(90, 99, 2000);
        this.LLJILLL = C452501pT.LIZIZ(new AwS7S0100200_8(this, j, j2, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(int i, int i2, Intent intent, C534100Kx6 c534100Kx6, ShortVideoContext shortVideoContext, ArrayList arrayList) {
        AbstractC577050MkB abstractC577050MkBLIZ;
        int size;
        Bundle bundleG3 = C786410Ut5.g3(intent, "key_pass_through_extra_info");
        if (bundleG3 == null) {
            AbstractC577050MkB abstractC577050MkBLIZIZ = C577040MkA.LIZIZ(arrayList.size());
            if (abstractC577050MkBLIZIZ != null) {
                this.LLJ = new C0LDE(shortVideoContext, null, 0, new AwS1S0602000_8(this, c534100Kx6, intent, shortVideoContext, i, i2, arrayList, abstractC577050MkBLIZIZ, 0), new AwS587S0100000_8(this, 460), new AwS374S0200000_8(c534100Kx6, this, shortVideoContext, 129));
                C0FGC.LIZ(2);
                C1419820n3E.LIZ.LIZ();
                NLE nle = NLE.INSTANCE;
                nle.setLogger(new NLELoggerListener() { // from class: X.0LG2
                    @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
                    public final void onLog(LogLevel logLevel, String str) {
                        int i3;
                        if (logLevel == null) {
                            i3 = -1;
                        } else {
                            i3 = C560100Lxw.LIZ[logLevel.ordinal()];
                            if (i3 == 1) {
                                C823920WTu c823920WTu = C823920WTu.LIZIZ;
                                boolean z = C201955140j.LIZ;
                                return;
                            }
                        }
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        C823920WTu c823920WTu2 = C823920WTu.LIZIZ;
                                        if (str == null) {
                                            str = "";
                                        }
                                        C201955140j.LJIIIIZZ(c823920WTu2, "CameraLayoutNLECompiler", str);
                                        return;
                                    }
                                    return;
                                }
                                C823920WTu c823920WTu3 = C823920WTu.LIZIZ;
                                if (str == null) {
                                    str = "";
                                }
                                C201955140j.LJIJJ(c823920WTu3, "CameraLayoutNLECompiler", str);
                                return;
                            }
                            C823920WTu c823920WTu4 = C823920WTu.LIZIZ;
                            if (str == null) {
                                str = "";
                            }
                            C201955140j.LJIILL(c823920WTu4, "CameraLayoutNLECompiler", str);
                            return;
                        }
                        C823920WTu c823920WTu5 = C823920WTu.LIZIZ;
                        if (str == null) {
                            str = "";
                        }
                        C201955140j.LIZLLL(c823920WTu5, "CameraLayoutNLECompiler", str);
                    }
                });
                nle.setLogLevel(LogLevel.LEVEL_DEBUG);
                C0LDE c0lde = this.LLJ;
                if (c0lde != null) {
                    C19EG c19eg = this.LLILZLL;
                    C365090ETb.LIZIZ();
                    if (C0L2Z.LIZ()) {
                        C01TT.LIZJ(new AwS409S0200000_8(c19eg, c0lde, 108));
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (arrayList2.size() == 1) {
                    arrayList2.add(ListProtector.get(arrayList2, 0));
                }
                C0LDE c0lde2 = this.LLJ;
                if (c0lde2 != 0) {
                    c0lde2.LIZ(arrayList2, abstractC577050MkBLIZIZ);
                    return;
                }
                return;
            }
            return;
        }
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        NLEModel model = null;
        if (cameraLayoutModel != null) {
            abstractC577050MkBLIZ = C577040MkA.LIZ(cameraLayoutModel);
        } else {
            abstractC577050MkBLIZ = null;
        }
        String string = bundleG3.getString("key_layout_nle_model_json");
        if (string != null && string.length() != 0) {
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.restore(string);
            model = nLEEditor.getModel();
        }
        ArrayList<LayoutItemMedia> parcelableArrayList = bundleG3.getParcelableArrayList("key_layout_filled_medias");
        if (parcelableArrayList != null) {
            size = parcelableArrayList.size();
        } else {
            size = 0;
        }
        if (abstractC577050MkBLIZ != null) {
            this.LLJ = new C0LDE(shortVideoContext, model, size, new AwS1S0602000_8(this, c534100Kx6, intent, shortVideoContext, i, i2, arrayList, parcelableArrayList, 1), new AwS587S0100000_8(this, 476), new AwS374S0200000_8(c534100Kx6, this, shortVideoContext, 130));
            C0FGC.LIZ(2);
            C1419820n3E.LIZ.LIZ();
            NLE nle2 = NLE.INSTANCE;
            nle2.setLogger(new NLELoggerListener() { // from class: X.0LG2
                @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
                public final void onLog(LogLevel logLevel, String str) {
                    int i3;
                    if (logLevel == null) {
                        i3 = -1;
                    } else {
                        i3 = C560100Lxw.LIZ[logLevel.ordinal()];
                        if (i3 == 1) {
                            C823920WTu c823920WTu = C823920WTu.LIZIZ;
                            boolean z = C201955140j.LIZ;
                            return;
                        }
                    }
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    C823920WTu c823920WTu2 = C823920WTu.LIZIZ;
                                    if (str == null) {
                                        str = "";
                                    }
                                    C201955140j.LJIIIIZZ(c823920WTu2, "CameraLayoutNLECompiler", str);
                                    return;
                                }
                                return;
                            }
                            C823920WTu c823920WTu3 = C823920WTu.LIZIZ;
                            if (str == null) {
                                str = "";
                            }
                            C201955140j.LJIJJ(c823920WTu3, "CameraLayoutNLECompiler", str);
                            return;
                        }
                        C823920WTu c823920WTu4 = C823920WTu.LIZIZ;
                        if (str == null) {
                            str = "";
                        }
                        C201955140j.LJIILL(c823920WTu4, "CameraLayoutNLECompiler", str);
                        return;
                    }
                    C823920WTu c823920WTu5 = C823920WTu.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    C201955140j.LIZLLL(c823920WTu5, "CameraLayoutNLECompiler", str);
                }
            });
            nle2.setLogLevel(LogLevel.LEVEL_DEBUG);
            ArrayList<MediaModel> arrayList3 = new ArrayList<>(arrayList);
            if (parcelableArrayList != null) {
                for (LayoutItemMedia layoutItemMedia : parcelableArrayList) {
                    MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
                    String str = layoutItemMedia.filePath;
                    mediaModel.relativePath = str;
                    mediaModel.LJIILL(str);
                    mediaModel.duration = layoutItemMedia.shortVideoSegment.getDuration();
                    int i3 = C536470L2f.LIZ[layoutItemMedia.mediaType.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            mediaModel.type = 4;
                        } else {
                            mediaModel.type = 1;
                        }
                    } else {
                        mediaModel.type = 1;
                        mediaModel.subType = 1;
                    }
                    arrayList3.add(mediaModel);
                }
            }
            C0LDE c0lde3 = this.LLJ;
            if (c0lde3 != null) {
                c0lde3.LIZ(arrayList3, abstractC577050MkBLIZ);
            }
        }
    }

    public final void LJIIIIZZ(int i, int i2, Intent intent, ArrayList<MediaModel> arrayList, ArrayList<MediaModel> arrayList2, ShortVideoContext shortVideoContext) throws Throwable {
        boolean z;
        boolean zIsReEnterChoosePhoto;
        boolean z2 = arrayList instanceof Collection;
        if (z2 && arrayList.isEmpty()) {
            z = true;
        } else {
            Iterator<MediaModel> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJ()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Long lValueOf = null;
        if (z && (!z2 || !arrayList.isEmpty())) {
            Iterator<MediaModel> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!it3.next().LJIIJJI()) {
                    C0L2U c0l2uLJII = LJII();
                    C536420L2a c536420L2a = this.LLJILJILJ;
                    c0l2uLJII.getClass();
                    C0CNO.LIZLLL(0L, new AwS409S0200000_8(c0l2uLJII, c536420L2a, 2));
                    C0L2U c0l2uLJII2 = LJII();
                    c0l2uLJII2.getClass();
                    C0CNO.LIZLLL(0L, new AwS126S0110000_8(c0l2uLJII2, 0));
                    IPreDownloadMusic iPreDownloadMusicLIZ = C569270MUj.LIZ(this.LL, null, false);
                    if (iPreDownloadMusicLIZ != null) {
                        zIsReEnterChoosePhoto = iPreDownloadMusicLIZ.isReEnterChoosePhoto();
                    } else {
                        zIsReEnterChoosePhoto = true;
                    }
                    Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
                    if (parcelableExtra != null) {
                        ShortVideoContext shortVideoContext2 = (ShortVideoContext) parcelableExtra;
                        shortVideoContext2.singleImageCoverBitmapData = new SingleImageCoverBitmapData(((MediaModel) ListProtector.get(arrayList, 0)).LJFF(), intent.getIntExtra("key_choose_media_item_size", 0), ((MediaModel) ListProtector.get(arrayList, 0)).date, ((MediaModel) ListProtector.get(arrayList, 0)).type, ((MediaModel) ListProtector.get(arrayList, 0)).width, ((MediaModel) ListProtector.get(arrayList, 0)).height, null, false);
                        if (intent.getIntExtra("key_choose_scene", -1) == 31) {
                            AVMusic aVMusic = (AVMusic) intent.getSerializableExtra("aweme_music");
                            MusicBuzModel musicBuzModel = shortVideoContext2.creativeModel.musicBuzModel;
                            musicBuzModel.musicOrigin = "mv_default";
                            C1452640nuA.LJII(aVMusic, false, musicBuzModel);
                        }
                        if (intent.getIntExtra("key_choose_scene", -1) == 50) {
                            DMCameraModel dMCameraModel = shortVideoContext2.creativeModel.initialModel.dmCameraModel;
                            dMCameraModel.enterFromDM = true;
                            dMCameraModel.isBulletin = true;
                        }
                        C577720MlG.LIZ(shortVideoContext2);
                        C0L14 c0l14 = C0L14.LIZ;
                        C19EG c19eg = this.LLILZLL;
                        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 729);
                        C535960L0g c535960L0g = new C535960L0g(this, arrayList, i, i2, intent);
                        C1DRG c1drg = this.LLILZ;
                        long j = this.LLIZ;
                        if (j != -1) {
                            lValueOf = Long.valueOf(j);
                        }
                        C0L13 c0l13 = new C0L13(c19eg, shortVideoContext2, arrayList, zIsReEnterChoosePhoto, awS552S0100000_8, c535960L0g, c1drg, lValueOf, intent.getBooleanExtra("key_is_reuse_pre_download_music_in_stack", false), 512);
                        c0l14.getClass();
                        C0L14.LIZ(c0l13);
                        IPreDownloadMusic iPreDownloadMusicLIZ2 = C569270MUj.LIZ(this.LL, null, false);
                        if (iPreDownloadMusicLIZ2 != null) {
                            iPreDownloadMusicLIZ2.setIsReEnterChoosePhoto(false);
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        Intent intentLIZLLL = LIZLLL(this.LL, shortVideoContext, 0, intent.getLongExtra("extra_start_enter_edit_page", -1L), null);
        try {
            if (!((Boolean) C266930Ad9.LIZ.getValue()).booleanValue()) {
                C23250099c.LJ(C23271099x.INSTANCE, new C534050Kx1(this, intentLIZLLL, intent, arrayList, arrayList2, shortVideoContext, null));
            } else {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZLL), null, null, new C534070Kx3(this, intentLIZLLL, intent, arrayList, arrayList2, shortVideoContext, null), 3);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
