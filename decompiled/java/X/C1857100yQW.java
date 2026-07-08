package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857100yQW extends C1857170yQd implements InterfaceC1891350zJl, InterfaceC1856630yPl {
    public final C326880Cre LLIZLLLIL;
    public final String LLJ;
    public final List<ConvertStyleItem> LLJI;
    public final String LLJIJIL;
    public final List<BaseVideo> LLJILJIL;
    public final boolean LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857100yQW) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857100yQW) obj).LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSendImageTextItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1856630yPl
    public final List<BaseImage> getImageList() {
        List<BaseImage> list;
        TakoMixFeed takoMixFeedLJIIIZ = this.LLIZLLLIL.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || (list = takoMixFeedLJIIIZ.images) == null) {
            return null;
        }
        return AnonymousClass1418.LIZ(list);
    }

    @Override // X.InterfaceC1856630yPl
    public final List<ConvertStyleItem> LIZLLL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1856630yPl
    public final String getMessageId() {
        return this.LLJIJIL;
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJ;
    }

    public C1857100yQW(C326880Cre c326880Cre) {
        String str;
        List<ConvertStyleItem> list;
        boolean z;
        super(c326880Cre);
        this.LLIZLLLIL = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJ = str;
        if (takoMixFeed != null) {
            list = takoMixFeed.style;
        } else {
            list = null;
        }
        this.LLJI = list;
        Message message = c326880Cre.LLILLL;
        this.LLJIJIL = message.uuid;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        List<BaseVideo> list2 = takoMixFeedLJIIIZ != null ? takoMixFeedLJIIIZ.videos : null;
        this.LLJILJIL = list2;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.LLJILJILJ = true ^ z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857100yQW) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857100yQW c1857100yQW = (C1857100yQW) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJ, c1857100yQW.LLJ) && Intrinsics.LJFF(getImageList(), c1857100yQW.getImageList()) && Intrinsics.LJFF(this.LLJI, c1857100yQW.LLJI) && this.LLILZIL == c1857100yQW.LLILZIL && Intrinsics.LJFF(this.LLJILJIL, c1857100yQW.LLJILJIL) && this.LLJILJILJ == c1857100yQW.LLJILJILJ) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857100yQW) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857170yQd) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
