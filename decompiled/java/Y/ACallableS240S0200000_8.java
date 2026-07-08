package Y;

import X.C0MZ5;
import X.C1441190nbh;
import X.C19EH;
import X.C1C7U;
import X.C2356009La;
import X.C297650Blb;
import X.C301490Brn;
import X.C526910KlV;
import X.C580810MqF;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS240S0200000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS240S0200000_8 aCallableS240S0200000_8) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        VEUtils.VEVideoFileInfo videoFileInfo2;
        C1C7U.LIZ("VideoChosenResultLogger@55cc.mobUploadEvent$1");
        if (C301490Brn.LIZ()) {
            for (MediaModel mediaModel : (List) aCallableS240S0200000_8.l0) {
                if (mediaModel.type == 4) {
                    if (C297650Blb.LIZ()) {
                        C2356009La c2356009La = C2356009La.LIZ;
                        String strLJFF = mediaModel.LJFF();
                        c2356009La.getClass();
                        videoFileInfo2 = C2356009La.LIZ(strLJFF);
                    } else {
                        videoFileInfo2 = VEUtils.getVideoFileInfo(mediaModel.LJFF());
                    }
                    if (videoFileInfo2 != null) {
                        int i = videoFileInfo2.rotation;
                        if (i != 90 && i != 270) {
                            mediaModel.width = videoFileInfo2.width;
                            mediaModel.height = videoFileInfo2.height;
                        } else {
                            mediaModel.width = videoFileInfo2.height;
                            mediaModel.height = videoFileInfo2.width;
                        }
                    }
                }
            }
        }
        Iterator it2 = ((List) aCallableS240S0200000_8.l1).iterator();
        while (true) {
            if (it2.hasNext()) {
                MediaModel mediaModel2 = (MediaModel) it2.next();
                if (mediaModel2.type == 4) {
                    if (C297650Blb.LIZ()) {
                        C2356009La c2356009La2 = C2356009La.LIZ;
                        String strLJFF2 = mediaModel2.LJFF();
                        c2356009La2.getClass();
                        videoFileInfo = C2356009La.LIZ(strLJFF2);
                    } else {
                        videoFileInfo = VEUtils.getVideoFileInfo(mediaModel2.LJFF());
                    }
                }
            } else {
                videoFileInfo = null;
                break;
            }
        }
        C1C7U.LIZIZ("VideoChosenResultLogger@55cc.mobUploadEvent$1");
        return videoFileInfo;
    }

    public static final Object call$1(ACallableS240S0200000_8 aCallableS240S0200000_8) {
        Unit unit;
        C1C7U.LIZ("PreviewRootScene@2e13.checkCurrentItemState$1$1");
        PreviewVideoScene previewVideoSceneLLLLLILLIL = ((C526910KlV) aCallableS240S0200000_8.l0).LLLLLILLIL();
        if (previewVideoSceneLLLLLILLIL != null) {
            previewVideoSceneLLLLLILLIL.LLLLLLLLL((Pair) aCallableS240S0200000_8.l1);
        }
        PreviewVideoScene previewVideoSceneLLLLLILLIL2 = ((C526910KlV) aCallableS240S0200000_8.l0).LLLLLILLIL();
        if (previewVideoSceneLLLLLILLIL2 != null) {
            previewVideoSceneLLLLLILLIL2.LLLLLLIL();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PreviewRootScene@2e13.checkCurrentItemState$1$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS240S0200000_8 r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS240S0200000_8.call$2(Y.ACallableS240S0200000_8):java.lang.Object");
    }

    public static final Object call$3(ACallableS240S0200000_8 aCallableS240S0200000_8) {
        C580810MqF c580810MqF = (C580810MqF) aCallableS240S0200000_8.l0;
        AsyncAVService asyncAVService = (AsyncAVService) aCallableS240S0200000_8.l1;
        c580810MqF.getClass();
        C1C7U.LIZ("VideoShare2GifEditActivity@c1c3.addContentFragment$1$onLoad$1L");
        C19EH c19ehLJIIJ = ((VideoShare2GifEditActivity) c580810MqF.l0).getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.i4n, asyncAVService.uiService().abilityUiService().video2GifFragment(((VideoShare2GifEditActivity) c580810MqF.l0).LLILLJJLI));
        c19ehLJIIJ.LJIIL();
        C1C7U.LIZIZ("VideoShare2GifEditActivity@c1c3.addContentFragment$1$onLoad$1L");
        return null;
    }

    public static final Object call$4(ACallableS240S0200000_8 aCallableS240S0200000_8) {
        BackgroundVideo backgroundVideo;
        C1C7U.LIZ("BackgroundVideoSpace@ef47.removeAllExceptCur$1");
        C1441190nbh c1441190nbh = (C1441190nbh) aCallableS240S0200000_8.l0;
        BackgroundVideo backgroundVideo2 = (BackgroundVideo) aCallableS240S0200000_8.l1;
        for (TimeSpeedModelExtension timeSpeedModelExtension : c1441190nbh) {
            if (timeSpeedModelExtension != null && (backgroundVideo = timeSpeedModelExtension.getBackgroundVideo()) != null && !Intrinsics.LJFF(backgroundVideo, backgroundVideo2)) {
                C0MZ5.LIZ(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundVideoSpace@ef47.removeAllExceptCur$1");
        return unit;
    }

    public ACallableS240S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
