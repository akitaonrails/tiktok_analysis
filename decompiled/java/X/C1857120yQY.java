package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857120yQY extends C1857170yQd implements InterfaceC1891350zJl {
    public final C326880Cre LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857120yQY) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857120yQY) obj).LLIZLLLIL);
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
        sbLIZ.append("TakoSendTextItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJ;
    }

    public C1857120yQY(C326880Cre c326880Cre) {
        String str;
        super(c326880Cre);
        this.LLIZLLLIL = c326880Cre;
        TakoMixFeed takoMixFeed = this.LLILLL;
        if (takoMixFeed != null) {
            str = takoMixFeed.text;
        } else {
            str = null;
        }
        this.LLJ = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857120yQY) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857120yQY c1857120yQY = (C1857120yQY) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJ, c1857120yQY.LLJ) && this.LLILZIL == c1857120yQY.LLILZIL) {
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
