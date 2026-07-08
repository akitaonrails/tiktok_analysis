package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856990yQL extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1857870yRl, InterfaceC1856550yPd {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final BaseImage LLJJIJIL;
    public final C326960Crm LLJJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1856990yQL) && Intrinsics.LJFF(this.LLJJIJI, ((C1856990yQL) obj).LLJJIJI);
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
        sbLIZ.append("TakoAnswerFeedEntranceGuideItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1857870yRl
    public final C326960Crm LJIL() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1856550yPd
    public final String LLIIIJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1856550yPd
    public final BaseImage getImage() {
        return this.LLJJIJIL;
    }

    public C1856990yQL(C326880Cre c326880Cre) {
        String str;
        BaseImage baseImage;
        C326960Crm c326960Crm;
        TakoSug takoSug;
        List<BaseImage> list;
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILZLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJJIJIIJIL = str;
        if (takoMixFeed != null && (list = takoMixFeed.images) != null) {
            baseImage = (BaseImage) C13LP.LJJJLL(list);
        } else {
            baseImage = null;
        }
        this.LLJJIJIL = baseImage;
        TakoMixFeed takoMixFeed2 = this.LLILZLL;
        if (takoMixFeed2 != null && (takoSug = takoMixFeed2.sug) != null) {
            c326960Crm = new C326960Crm(null, takoSug, c326880Cre.LLILLL, 1);
        } else {
            c326960Crm = new C326960Crm(null, new TakoSug(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null), null, 5);
        }
        this.LLJJJ = c326960Crm;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1856990yQL) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJIJIIJIL, ((C1856990yQL) interfaceC1891350zJl).LLJJIJIIJIL)) {
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
