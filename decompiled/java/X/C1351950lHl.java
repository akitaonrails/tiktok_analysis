package X;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351950lHl {
    public static final ArrayList<UrlModel> LIZ(List<CommentImageStruct> list) {
        List<String> list2;
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<UrlModel> arrayList = new ArrayList<>(list.size());
        for (CommentImageStruct commentImageStruct : list) {
            UrlModel originUrl = commentImageStruct.getOriginUrl();
            if (originUrl == null) {
                arrayList.add(null);
            } else {
                C1351960lHm c1351960lHm = new C1351960lHm();
                c1351960lHm.setUri(originUrl.getUri());
                c1351960lHm.setUrlList(originUrl.getUrlList());
                c1351960lHm.setWidth(originUrl.getWidth());
                c1351960lHm.setHeight(originUrl.getHeight());
                c1351960lHm.setUrlKey(originUrl.getUrlKey());
                c1351960lHm.setSize(originUrl.getSize());
                c1351960lHm.setFileHash(originUrl.getFileHash());
                c1351960lHm.setaK(originUrl.getaK());
                c1351960lHm.setPreviewModel(originUrl.getPreviewModel());
                commentImageStruct.getLivePhotoInfoModel();
                CommentLivePhotoInfoModel livePhotoInfoModel = commentImageStruct.getLivePhotoInfoModel();
                if (livePhotoInfoModel != null) {
                    list2 = livePhotoInfoModel.urlList;
                } else {
                    list2 = null;
                }
                c1351960lHm.LL = list2;
                arrayList.add(c1351960lHm);
            }
        }
        return arrayList;
    }

    public static final String LIZIZ(User user) {
        MatchedFriendStruct matchedFriendStruct;
        String str;
        if (user == null || (matchedFriendStruct = user.getMatchedFriendStruct()) == null || (str = matchedFriendStruct.recType) == null) {
            return "";
        }
        return str;
    }

    public static final int LIZJ(String str) {
        Integer numValueOf;
        ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
        if (exifInterfaceLJIILL != null && (numValueOf = Integer.valueOf(C2204961BRm.LJLILLLLZI(exifInterfaceLJIILL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaN6fNZn8Xw96ul2CuhQ==", null)))) != null) {
            if (numValueOf.intValue() == 6) {
                return 90;
            }
            if (numValueOf.intValue() == 3) {
                return 180;
            }
            if (numValueOf.intValue() == 8) {
                return 270;
            }
            return 0;
        }
        return 0;
    }

    public static final int LIZLLL(User user) {
        if (user == null) {
            return 0;
        }
        int i = 2;
        if (user.getFollowStatus() != 2) {
            i = 1;
            if (user.getFollowStatus() != 1) {
                if (user.getFollowerStatus() == 1) {
                    return 3;
                }
                if (user.getFollowStatus() != 4) {
                    return 0;
                }
                return 4;
            }
        }
        return i;
    }

    public static final boolean LJI(Comment comment) {
        String vid;
        if (comment == null || comment.getAudioStruct() == null) {
            return false;
        }
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        String localPath = null;
        if (audioStruct != null) {
            vid = audioStruct.getVid();
        } else {
            vid = null;
        }
        if (!C123100dR.LIZ(vid)) {
            CmtAudioStruct audioStruct2 = comment.getAudioStruct();
            if (audioStruct2 != null) {
                localPath = audioStruct2.getLocalPath();
            }
            if (!C123100dR.LIZ(localPath)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJII(Comment comment) {
        List<CommentImageStruct> imageList;
        if (comment == null || (imageList = comment.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(List<CommentImageModel> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJIIIZ(Comment comment) {
        if (comment == null || comment.getStickerStruct() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(Comment comment) {
        String asrText;
        String text = comment.getText();
        if ((text != null && text.length() != 0) || !LJI(comment)) {
            return false;
        }
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct != null && (asrText = audioStruct.getAsrText()) != null && asrText.length() != 0) {
            return false;
        }
        return true;
    }

    public static final int LJIIL(List<CommentImageStruct> list) {
        if (list != null && !list.isEmpty()) {
            int source = ((CommentImageStruct) ListProtector.get(list, 0)).getSource();
            if (source == 0) {
                return 1;
            }
            if (source == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public static final int LJIILIIL(List<CommentImageModel> list) {
        if (list != null && !list.isEmpty()) {
            int source = ((CommentImageModel) ListProtector.get(list, 0)).getSource();
            if (source == 0) {
                return 1;
            }
            if (source != 1) {
                if (source == 2) {
                    return 3;
                }
                return 0;
            }
            return 2;
        }
        return 0;
    }

    public static final boolean LJIILJJIL(C1353500lKG c1353500lKG) {
        if (c1353500lKG.length() >= C1353700lKa.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static final int LJIILL(Comment comment) {
        if (comment != null && comment.getCommentType() == 1) {
            return 1;
        }
        return 2;
    }

    public static final boolean LJIIZILJ(Comment comment) {
        List<CommentImageStruct> imageList;
        String text = comment.getText();
        if ((text != null && text.length() != 0) || (((imageList = comment.getImageList()) == null || imageList.isEmpty()) && comment.getStickerStruct() == null)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(Comment comment) {
        List<CommentImageStruct> imageList;
        String text = null;
        if (comment != null) {
            text = comment.getText();
        }
        if (text != null && text.length() != 0) {
            return false;
        }
        if ((comment == null || (((imageList = comment.getImageList()) == null || imageList.isEmpty()) && (comment == null || comment.getStickerStruct() == null))) && !LJI(comment)) {
            return false;
        }
        return true;
    }

    public static final void LJIJJ(View view) {
        if (view == null) {
            return;
        }
        C12ES.LJIILL(8, view);
    }

    public static final void LJIJJLI(View view) {
        if (view == null) {
            return;
        }
        C12ES.LJIILL(0, view);
    }

    public static final CommentImageModel LJJ(MediaModel mediaModel) {
        LivePhotoInfo livePhotoInfo;
        String str;
        LivePhotoInfo livePhotoInfo2;
        String livePhotoPreviewModeStr;
        CommentImageModel commentImageModel = new CommentImageModel();
        String[] strArr = new String[1];
        String strLJFF = mediaModel.LJFF();
        if (strLJFF != null && u.LJJIIJZLJL(strLJFF, "/", false)) {
            strLJFF = Uri.fromFile(new C0VSJ(strLJFF)).toString();
        }
        strArr[0] = strLJFF;
        commentImageModel.setUrlList(C1697810uHb.LJ(strArr));
        commentImageModel.setFormat(C2471909mP.LJIJJLI(mediaModel.LJFF(), false));
        commentImageModel.setSize(mediaModel.fileSize);
        String videoPath = null;
        if (C294440BgQ.LIZ() == 1) {
            livePhotoInfo = mediaModel.livePhotoInfo;
        } else {
            livePhotoInfo = null;
        }
        commentImageModel.setLivePhotoInfo(livePhotoInfo);
        if (C294440BgQ.LIZ() == 1 && mediaModel.LJIIJJI()) {
            str = "live_once";
        } else {
            str = "static";
        }
        commentImageModel.setOriginLiveMode(str);
        if (C294440BgQ.LIZ() == 1 && mediaModel.LJIIJJI() && (livePhotoInfo2 = mediaModel.livePhotoInfo) != null && livePhotoInfo2.getVideoPath() != null) {
            LivePhotoInfo livePhotoInfo3 = mediaModel.livePhotoInfo;
            if (livePhotoInfo3 != null) {
                livePhotoPreviewModeStr = livePhotoInfo3.getLivePhotoPreviewModeStr();
            } else {
                livePhotoPreviewModeStr = null;
            }
            if (!Intrinsics.LJFF(livePhotoPreviewModeStr, "STATIC")) {
                videoPath = mediaModel.livePhotoInfo.getVideoPath();
            }
        }
        commentImageModel.setVideoPath(videoPath);
        if (LIZJ(mediaModel.LJFF()) % 180 == 90) {
            commentImageModel.setWidth(mediaModel.height);
            commentImageModel.setHeight(mediaModel.width);
        } else {
            commentImageModel.setWidth(mediaModel.width);
            commentImageModel.setHeight(mediaModel.height);
        }
        commentImageModel.setSource(Intrinsics.LJFF(mediaModel.extra, "from_record") ? 1 : 0);
        return commentImageModel;
    }

    public static final boolean LJIIJJI(EditText editText, String str) {
        if (editText.length() + str.length() > C1353700lKa.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static final <V extends View> void LJIILLIIL(V v, Function1<? super V, Unit> function1) {
        if (v.getViewTreeObserver().isAlive() && v.isAttachedToWindow()) {
            C786410Ut5.w3(v.getViewTreeObserver(), new C0T6C(v, new AwS591S0100000_12(function1, (Function1<? super LiveEffect, Unit>) 1238)));
        } else {
            v.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1402010maV(v, function1, 3));
        }
    }

    public static final void LJIJI(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void LJIL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final int LJ(int i, int i2, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return C446980Hfs.LIZ(context, i2);
    }

    public static final CharSequence LJFF(int i, int i2, Context context) {
        Object[] objArr = new Object[1];
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            i2 = numLIZJ.intValue();
        }
        objArr[0] = Long.valueOf(((long) i2) & 4294967295L);
        return C786410Ut5.j4("#%08X", Arrays.copyOf(objArr, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJI(com.ss.android.ugc.aweme.profile.model.User r28, android.content.Context r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, X.EnumC1260920iuw r33, java.lang.String r34, java.lang.String r35, int r36) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1351950lHl.LJJI(com.ss.android.ugc.aweme.profile.model.User, android.content.Context, java.lang.String, java.lang.String, java.lang.String, X.0iuw, java.lang.String, java.lang.String, int):void");
    }
}
