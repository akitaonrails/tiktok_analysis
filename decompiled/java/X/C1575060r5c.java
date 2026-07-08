package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575060r5c implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final boolean LLILLJJLI;
    public final Function2<Aweme, Boolean, Unit> LLILLL;

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (((aweme == null ? 0 : aweme.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Function2<Aweme, Boolean, Unit> function2 = this.LLILLL;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureVideoItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!areItemTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C1575060r5c) || this.LLILLJJLI != ((C1575060r5c) interfaceC1891350zJl).LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1575060r5c)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1575060r5c) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1575060r5c)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1575060r5c) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1575060r5c) || areContentsTheSame(interfaceC1891350zJl)) {
            return null;
        }
        return new C1575070r5d(((C1575060r5c) interfaceC1891350zJl).LLILLJJLI);
    }

    public static C1575060r5c LIZ(C1575060r5c c1575060r5c, boolean z) {
        Aweme aweme = c1575060r5c.LL;
        Function2<Aweme, Boolean, Unit> function2 = c1575060r5c.LLILLL;
        c1575060r5c.getClass();
        return new C1575060r5c(aweme, z, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1575060r5c(Aweme aweme, boolean z, Function2<? super Aweme, ? super Boolean, Unit> function2) {
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = function2;
    }
}
