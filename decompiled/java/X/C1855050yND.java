package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEditInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855050yND {
    public static final boolean LIZ(TakoEditAskInfo takoEditAskInfo) {
        String str;
        String str2 = null;
        if (takoEditAskInfo != null) {
            str = takoEditAskInfo.answerMsgId;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            if (takoEditAskInfo != null) {
                str2 = takoEditAskInfo.queryMsgId;
            }
            if (C123100dR.LIZ(str2) && takoEditAskInfo != null && takoEditAskInfo.editMessage != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(TakoReferenceAskInfo takoReferenceAskInfo) {
        String str;
        if (takoReferenceAskInfo != null && (str = takoReferenceAskInfo.text) != null && str.length() > 0 && C123100dR.LIZ(takoReferenceAskInfo.messageId)) {
            return true;
        }
        return false;
    }

    public static final TakoEditAskInfo LJ(TakoEditInfo takoEditInfo) {
        return new TakoEditAskInfo(takoEditInfo.queryMsgId, takoEditInfo.answerMsgId, null);
    }

    public static final TakoReferenceAskInfo LJFF(TakoReferenceInfo takoReferenceInfo) {
        if (takoReferenceInfo != null) {
            return new TakoReferenceAskInfo(takoReferenceInfo.content, takoReferenceInfo.msgId);
        }
        return null;
    }

    public static final List<BaseImage> LIZJ(List<BaseImage> list, TakoEditAskInfo takoEditAskInfo) {
        if (!LIZ(takoEditAskInfo)) {
            return list;
        }
        List<BaseImage> listLIZ = AnonymousClass1418.LIZ(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (BaseImage baseImage : listLIZ) {
            arrayList.add(baseImage.copy(baseImage.imageId, baseImage.innerUrlList, baseImage.urlList, baseImage.thumbnailUrlList, baseImage.width, baseImage.height, baseImage.uri, baseImage.uploadProgress, baseImage.localCachePath, baseImage.compressedFilePath, baseImage.compressedFileSize, baseImage.imageSource, baseImage.uploadStatus, baseImage.originalFileSize, baseImage.imageUuid, baseImage.stdSize, 0, null));
        }
        return arrayList;
    }

    public static final void LIZLLL(TakoEditAskInfo takoEditAskInfo, Map map, C830490Whz c830490Whz) {
        String str;
        Message message;
        MessageExt messageExt;
        if (!LIZ(takoEditAskInfo)) {
            return;
        }
        if (takoEditAskInfo != null && (message = takoEditAskInfo.editMessage) != null && (messageExt = message.ext) != null) {
            str = messageExt.modeSource;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "visual_search_button")) {
            return;
        }
        map.put("mode_source", "");
        c830490Whz.put("mode_source", "");
    }
}
