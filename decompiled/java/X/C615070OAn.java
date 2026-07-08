package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615070OAn implements InterfaceC1891350zJl {
    public final long LL;
    public final AddYoursTopic LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final long LLILZIL;
    public final Aweme LLILZLL;
    public final List<AddYoursAvatar> LLIZ;
    public final boolean LLIZLLLIL;
    public final C615190OAz LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C615070OAn)) {
            return false;
        }
        C615070OAn c615070OAn = (C615070OAn) obj;
        return this.LL == c615070OAn.LL && Intrinsics.LJFF(this.LLILLJJLI, c615070OAn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c615070OAn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c615070OAn.LLILZ) && this.LLILZIL == c615070OAn.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c615070OAn.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c615070OAn.LLIZ) && this.LLIZLLLIL == c615070OAn.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c615070OAn.LLJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        UrlModel urlModel = this.LLILZ;
        int iHashCode = (((iY2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31;
        Aweme aweme = this.LLILZLL;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        List<AddYoursAvatar> list = this.LLIZ;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        C615190OAz c615190OAz = this.LLJ;
        return iHashCode3 + (c615190OAz != null ? c615190OAz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursCollectionItem(topicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", topic=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", userAvatars=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", translationInfo=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C615070OAn(AddYoursTopic addYoursTopic) {
        long jLongValue;
        UrlModel cover;
        List<InteractStickerStruct> interactStickerStructs;
        InteractStickerStruct next;
        AddYoursStickerStruct addYoursStickerStruct;
        Video video;
        Long topicId = addYoursTopic.getTopicId();
        if (topicId != null) {
            jLongValue = topicId.longValue();
        } else {
            jLongValue = 0;
        }
        String text = addYoursTopic.getText();
        text = text == null ? "" : text;
        Aweme video2 = addYoursTopic.getVideo();
        List<AddYoursAvatar> userAvatars = null;
        if (video2 != null && (video = video2.getVideo()) != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        Long videoCount = addYoursTopic.getVideoCount();
        long jLongValue2 = videoCount != null ? videoCount.longValue() : 0L;
        Aweme video3 = addYoursTopic.getVideo();
        Aweme video4 = addYoursTopic.getVideo();
        if (video4 != null && (interactStickerStructs = video4.getInteractStickerStructs()) != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getAddYoursStickerStruct() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next;
            if (interactStickerStruct != null && (addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct()) != null) {
                userAvatars = addYoursStickerStruct.getUserAvatars();
            }
        }
        this(jLongValue, addYoursTopic, text, cover, jLongValue2, video3, userAvatars, false, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C615070OAn(long j, AddYoursTopic addYoursTopic, String str, UrlModel urlModel, long j2, Aweme aweme, List<AddYoursAvatar> list, boolean z, C615190OAz c615190OAz) {
        this.LL = j;
        this.LLILLJJLI = addYoursTopic;
        this.LLILLL = str;
        this.LLILZ = urlModel;
        this.LLILZIL = j2;
        this.LLILZLL = aweme;
        this.LLIZ = list;
        this.LLIZLLLIL = z;
        this.LLJ = c615190OAz;
    }
}
