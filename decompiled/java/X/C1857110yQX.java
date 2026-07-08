package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857110yQX extends C1857170yQd implements InterfaceC1891350zJl, InterfaceC1856630yPl {
    public final C326880Cre LLIZLLLIL;
    public final String LLJ;
    public final List<BaseImage> LLJI;
    public final List<ConvertStyleItem> LLJIJIL;
    public final String LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857110yQX) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1857110yQX) obj).LLIZLLLIL);
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
        sbLIZ.append("TakoCarriedSendItem(message=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1856630yPl
    public final List<ConvertStyleItem> LIZLLL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1856630yPl
    public final List<BaseImage> getImageList() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1856630yPl
    public final String getMessageId() {
        return this.LLJILJIL;
    }

    @Override // X.C1857170yQd, X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJ;
    }

    public C1857110yQX(C326880Cre c326880Cre) {
        String str;
        List<BaseImage> list;
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
            list = takoMixFeed.images;
        } else {
            list = null;
        }
        this.LLJI = list;
        this.LLJIJIL = takoMixFeed != null ? takoMixFeed.style : null;
        this.LLJILJIL = c326880Cre.LLILLL.uuid;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857110yQX) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1857110yQX c1857110yQX = (C1857110yQX) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLJ, c1857110yQX.LLJ) && Intrinsics.LJFF(this.LLJI, c1857110yQX.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1857110yQX.LLJIJIL)) {
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
        if (interfaceC1891350zJl instanceof C1857110yQX) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1857170yQd) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
