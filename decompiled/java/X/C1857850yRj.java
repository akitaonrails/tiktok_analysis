package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857850yRj extends C1857170yQd implements InterfaceC1891350zJl {
    public final C326880Cre LLIZLLLIL;
    public final List<TakoVideoItem> LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857850yRj) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857850yRj) obj).LLIZLLLIL);
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
        sbLIZ.append("TakoSendVideoItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Pair<String, Long>> LJ() {
        List<TakoVideoItem> list = this.LLJ;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (TakoVideoItem takoVideoItem : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new Pair(takoVideoItem.awemeId, Long.valueOf(i)));
            i = i2;
        }
        return arrayList;
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJIJIL;
    }

    public C1857850yRj(C326880Cre c326880Cre) {
        List<TakoVideoItem> list;
        String str;
        String str2;
        List<TakoVideoItem> list2;
        TakoVideoItem takoVideoItem;
        TakoUserItem takoUserItem;
        List<TakoVideoItem> list3;
        TakoVideoItem takoVideoItem2;
        TakoUserItem takoUserItem2;
        BaseImage baseImage;
        List<String> list4;
        TakoVideoItem takoVideoItem3;
        BaseImage baseImage2;
        List<String> list5;
        String str3;
        super(c326880Cre);
        this.LLIZLLLIL = c326880Cre;
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        String str4 = null;
        if (takoMixFeedLJIIIZ != null) {
            list = takoMixFeedLJIIIZ.videoList;
        } else {
            list = null;
        }
        this.LLJ = list;
        this.LLJI = (list == null || (takoVideoItem3 = (TakoVideoItem) C13LP.LJJJLL(list)) == null || (baseImage2 = takoVideoItem3.cover) == null || (list5 = baseImage2.urlList) == null || (str3 = (String) C13LP.LJJJLL(list5)) == null) ? "" : str3;
        TakoMixFeed takoMixFeedLJIIIZ2 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null) {
            str = takoMixFeedLJIIIZ2.text;
        } else {
            str = null;
        }
        this.LLJIJIL = str;
        TakoMixFeed takoMixFeedLJIIIZ3 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null && (list3 = takoMixFeedLJIIIZ3.videoList) != null && (takoVideoItem2 = (TakoVideoItem) C13LP.LJJJLL(list3)) != null && (takoUserItem2 = takoVideoItem2.user) != null && (baseImage = takoUserItem2.avatar) != null && (list4 = baseImage.urlList) != null) {
            str2 = (String) C13LP.LJJJLL(list4);
        } else {
            str2 = null;
        }
        this.LLJILJIL = str2;
        TakoMixFeed takoMixFeedLJIIIZ4 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ4 != null && (list2 = takoMixFeedLJIIIZ4.videoList) != null && (takoVideoItem = (TakoVideoItem) C13LP.LJJJLL(list2)) != null && (takoUserItem = takoVideoItem.user) != null) {
            str4 = takoUserItem.nickname;
        }
        this.LLJILJILJ = str4;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857850yRj) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857850yRj c1857850yRj = (C1857850yRj) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJI, c1857850yRj.LLJI) && this.LLILZIL == c1857850yRj.LLILZIL) {
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
        if (interfaceC1891350zJl instanceof C1857850yRj) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857170yQd) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
