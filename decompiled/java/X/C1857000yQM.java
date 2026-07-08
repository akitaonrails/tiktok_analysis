package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857000yQM extends C1858660yT2 implements InterfaceC1891350zJl {
    public final C326880Cre LLJJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857000yQM) && Intrinsics.LJFF(this.LLJJIJI, ((C1857000yQM) obj).LLJJIJI);
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
        sbLIZ.append("TakoNovelImageItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1857000yQM(C326880Cre c326880Cre) {
        super(c326880Cre);
        this.LLJJIJI = c326880Cre;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<BaseImage> list;
        if (interfaceC1891350zJl instanceof C1857000yQM) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                TakoMixFeed takoMixFeed = this.LLILZLL;
                List<BaseImage> list2 = null;
                if (takoMixFeed != null) {
                    list = takoMixFeed.images;
                } else {
                    list = null;
                }
                TakoMixFeed takoMixFeed2 = ((C1858660yT2) interfaceC1891350zJl).LLILZLL;
                if (takoMixFeed2 != null) {
                    list2 = takoMixFeed2.images;
                }
                if (Intrinsics.LJFF(list, list2)) {
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
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
