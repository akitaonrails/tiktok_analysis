package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0oHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466980oHI extends C1320700kTM {
    public final int $t;
    public Object l0;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            case 2:
                LJ$2(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    public C1466980oHI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C1466980oHI c1466980oHI, String str, Object obj, Animatable animatable) {
        ((ViewOnClickListenerC1419140n28) c1466980oHI.l0).LL.invoke();
    }

    public static final void LJ$1(C1466980oHI c1466980oHI, String str, Object obj, Animatable animatable) {
        Bitmap underlyingBitmap;
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        CreativeModel creativeModel2;
        CreativeModel creativeModel3;
        CreativeModel creativeModel4;
        PostPageModel postPageModel;
        String str2;
        String str3;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        CreativeModel creativeModel5;
        PostPageModel postPageModel2;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C1445410niV c1445410niV = (C1445410niV) c1466980oHI.l0;
        c1445410niV.LLLFZ = true;
        if (C1443400nfG.LJIIJJI(c1445410niV.LLJLLL) && (underlyingBitmap = ((AbstractC1325130kaV) interfaceC1330440kj4).getUnderlyingBitmap()) != null) {
            VideoPublishEditModel videoPublishEditModel = ((C1445410niV) c1466980oHI.l0).LLJLLL;
            if (videoPublishEditModel == null || (creativeModel5 = videoPublishEditModel.creativeModel) == null || (postPageModel2 = creativeModel5.postPageModel) == null || postPageModel2.customCoverPath == null) {
                C1443400nfG.LJIIIZ(videoPublishEditModel, false);
            }
            C1445410niV c1445410niV2 = (C1445410niV) c1466980oHI.l0;
            VideoPublishEditModel videoPublishEditModel2 = c1445410niV2.LLJLLL;
            if (videoPublishEditModel2 != null && (creativeModel4 = videoPublishEditModel2.creativeModel) != null && (postPageModel = creativeModel4.postPageModel) != null && (str2 = postPageModel.customCoverPath) != null) {
                if (C493401w4.LIZ()) {
                    C0MH8 c0mh8 = C0MH8.LIZ;
                    VideoPublishEditModel videoPublishEditModel3 = c1445410niV2.LLJLLL;
                    if (videoPublishEditModel3 != null) {
                        C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel3, underlyingBitmap, 0, 0, str2, 0, null, AFwS231S0000000_3.get$arr$(221), 108);
                    }
                } else {
                    VideoPublishEditModel videoPublishEditModel4 = c1445410niV2.LLJLLL;
                    if (videoPublishEditModel4 != null && (multiEditVideoRecordData = videoPublishEditModel4.getMultiEditVideoRecordData()) != null) {
                        str3 = multiEditVideoRecordData.coverImagePath;
                    } else {
                        str3 = null;
                    }
                    C1443400nfG.LJIJI(underlyingBitmap, str2, str3, null);
                }
            }
            VideoPublishEditModel videoPublishEditModel5 = ((C1445410niV) c1466980oHI.l0).LLJLLL;
            if (videoPublishEditModel5 != null && (((creativeModel2 = videoPublishEditModel5.creativeModel) == null || (creativeModel2.coverPublishModel == null && videoPublishEditModel5 != null)) && (creativeModel3 = videoPublishEditModel5.creativeModel) != null)) {
                creativeModel3.coverPublishModel = videoPublishEditModel5.getCoverPublishModel();
            }
            VideoPublishEditModel videoPublishEditModel6 = ((C1445410niV) c1466980oHI.l0).LLJLLL;
            if (videoPublishEditModel6 != null && (creativeModel = videoPublishEditModel6.creativeModel) != null && (coverPublishModel = creativeModel.coverPublishModel) != null) {
                coverPublishModel.setCoverFromUrl(true);
            }
        }
    }

    public static final void LJ$2(C1466980oHI c1466980oHI, String str, Object obj, Animatable animatable) {
        Bitmap underlyingBitmap = ((AbstractC1325130kaV) ((InterfaceC1330440kj4) obj)).getUnderlyingBitmap();
        if (underlyingBitmap != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1466980oHI.l0;
            PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
            String str2 = postPageModel.customCoverPath;
            if (str2 == null) {
                if (TextUtils.isEmpty(str2)) {
                    postPageModel.customCoverPath = C383300F1c.LIZLLL(videoPublishEditModel.getCreativeInfo());
                }
                String str3 = postPageModel.customCoverPath;
                if (str3 != null) {
                    postPageModel.customCoverOriginalPath = u.LJJIFFI(str3, "_cover_img_custom.png", "_cover_img_custom_original.png", false);
                }
            }
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) c1466980oHI.l0;
            String str4 = videoPublishEditModel2.creativeModel.postPageModel.customCoverPath;
            if (str4 != null) {
                C1443310nf7.LIZIZ.LJIIIZ(videoPublishEditModel2, underlyingBitmap, str4, null);
            }
            VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) c1466980oHI.l0;
            CreativeModel creativeModel = videoPublishEditModel3.creativeModel;
            if (creativeModel.coverPublishModel == null) {
                creativeModel.coverPublishModel = videoPublishEditModel3.getCoverPublishModel();
            }
            CoverPublishModel coverPublishModel = ((VideoPublishEditModel) c1466980oHI.l0).creativeModel.coverPublishModel;
            if (coverPublishModel != null) {
                coverPublishModel.setCoverFromUrl(true);
            }
        }
    }
}
