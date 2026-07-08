package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857020yQO extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1856590yPh, InterfaceC1859540yUS {
    public final C326880Cre LLJJIJI;
    public final List<BaseVideo> LLJJIJIIJIL;
    public final List<String> LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857020yQO) && Intrinsics.LJFF(this.LLJJIJI, ((C1857020yQO) obj).LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLJJIJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerVideoGenerationItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1856590yPh
    public final boolean LIZLLL() {
        List<TakoInteractionConfig> list;
        TakoInteractionConfig next;
        Integer num;
        TakoMixFeed takoMixFeedLJIIIZ = this.LLJJIJI.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || (list = takoMixFeedLJIIIZ.interactionStatus) == null) {
            return false;
        }
        Iterator<TakoInteractionConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer num2 = next.type;
            if (num2 != null && num2.intValue() == 3) {
                break;
            }
        }
        TakoInteractionConfig takoInteractionConfig = next;
        return (takoInteractionConfig == null || (num = takoInteractionConfig.status) == null || num.intValue() != 1) ? false : true;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1856590yPh
    public final List<String> Xe() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1856590yPh
    public final List<BaseVideo> getVideoList() {
        return this.LLJJIJIIJIL;
    }

    public C1857020yQO(C326880Cre c326880Cre) {
        List<BaseVideo> list;
        String str;
        String str2;
        String str3;
        BaseVideo baseVideo;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        Long l = null;
        if (takoMixFeed != null) {
            list = takoMixFeed.videos;
        } else {
            list = null;
        }
        this.LLJJIJIIJIL = list;
        this.LLJJIJIL = C1855920yOc.LIZ(c326880Cre.LLILLL);
        TakoMixFeed takoMixFeed2 = this.LLILZLL;
        if (takoMixFeed2 != null) {
            str = takoMixFeed2.text;
        } else {
            str = null;
        }
        this.LLJJJ = str;
        if (takoMixFeed2 != null) {
            str2 = takoMixFeed2.hint;
        } else {
            str2 = null;
        }
        this.LLJJJIL = str2;
        if (takoMixFeed2 != null) {
            str3 = takoMixFeed2.hintInText;
        } else {
            str3 = null;
        }
        this.LLJJJJ = str3;
        if (list != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(list)) != null) {
            l = baseVideo.expireTime;
        }
        C1004300cF2.LIZIZ(l);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857020yQO) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJIJIIJIL, ((C1857020yQO) interfaceC1891350zJl).LLJJIJIIJIL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
