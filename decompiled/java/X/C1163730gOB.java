package X;

import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163730gOB implements InterfaceC1891350zJl {
    public final String LL;
    public final Set<TikTokMediaModel> LLILLJJLI;
    public final Function2<C1163730gOB, Boolean, Unit> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163730gOB)) {
            return false;
        }
        C1163730gOB c1163730gOB = (C1163730gOB) obj;
        return Intrinsics.LJFF(this.LL, c1163730gOB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1163730gOB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1163730gOB.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Function2<C1163730gOB, Boolean, Unit> function2 = this.LLILLL;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoAlbumItem(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectListener=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1163730gOB() {
        this("", new LinkedHashSet(), null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1163730gOB(String str, Set<TikTokMediaModel> set, Function2<? super C1163730gOB, ? super Boolean, Unit> function2) {
        this.LL = str;
        this.LLILLJJLI = set;
        this.LLILLL = function2;
    }
}
