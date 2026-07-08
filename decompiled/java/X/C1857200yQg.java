package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857200yQg extends C1857170yQd implements InterfaceC1891350zJl, InterfaceC689490R2t {
    public final C326880Cre LLIZLLLIL;
    public final List<TakoVideoItem> LLJ;
    public final String LLJI;
    public float LLJIJIL;
    public float LLJILJIL;

    @Override // X.InterfaceC689490R2t
    public final String LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC689490R2t
    public final C689590R3d LJJIJL() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final Integer LLJI() {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final boolean LLJZIJLIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857200yQg) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857200yQg) obj).LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC689490R2t
    public final Message getMsg() {
        return null;
    }

    public final int hashCode() {
        return this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareVideoToTakoItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689490R2t
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return new AwS641S0100000_27(this, 87);
    }

    @Override // X.InterfaceC689490R2t
    public final C1861010yWp LJJLIIIJ() {
        float f;
        float f2;
        float f3 = C1857210yQh.LIZ;
        boolean zLIZIZ = C444960Hcc.LIZIZ();
        float f4 = C1857210yQh.LIZIZ;
        if (zLIZIZ) {
            f = f4;
            f2 = C1857210yQh.LIZ;
        } else {
            f = C1857210yQh.LIZ;
            f2 = f4;
        }
        return new C1861010yWp(f4, f4, f, f2);
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJI;
    }

    @Override // X.InterfaceC689490R2t
    public final List<TakoVideoItem> getVideoList() {
        return this.LLJ;
    }

    public C1857200yQg(C326880Cre c326880Cre) {
        List<TakoVideoItem> list;
        super(c326880Cre);
        this.LLIZLLLIL = c326880Cre;
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            list = takoMixFeedLJIIIZ.videoList;
        } else {
            list = null;
        }
        this.LLJ = list;
        TakoMixFeed takoMixFeed = this.LLILLL;
        this.LLJI = takoMixFeed != null ? takoMixFeed.text : null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857200yQg) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857200yQg c1857200yQg = (C1857200yQg) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJI, c1857200yQg.LLJI) && this.LLILZIL == c1857200yQg.LLILZIL) {
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
        if (interfaceC1891350zJl instanceof C1857120yQY) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857170yQd) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
