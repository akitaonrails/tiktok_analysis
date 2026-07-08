package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165690gRL implements InterfaceC1891350zJl {
    public UrlModel LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Aweme LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public C1165690gRL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165690gRL)) {
            return false;
        }
        C1165690gRL c1165690gRL = (C1165690gRL) obj;
        return Intrinsics.LJFF(this.LL, c1165690gRL.LL) && this.LLILLJJLI == c1165690gRL.LLILLJJLI && this.LLILLL == c1165690gRL.LLILLL && this.LLILZ == c1165690gRL.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1165690gRL.LLILZIL) && this.LLILZLL == c1165690gRL.LLILZLL && this.LLIZ == c1165690gRL.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LL;
        int iHashCode = (((((((urlModel == null ? 0 : urlModel.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Aweme aweme = this.LLILZIL;
        return ((((iHashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixPickCandidatePowerItem(cover=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", gray=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", inOtherList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", video=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selectedGray=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isBlocked=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1165690gRL(int i) {
        this(null, false, false, false, null, false, false);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1165690gRL) {
            return Intrinsics.LJFF(this.LLILZIL, ((C1165690gRL) interfaceC1891350zJl).LLILZIL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static C1165690gRL LIZ(C1165690gRL c1165690gRL, boolean z) {
        UrlModel urlModel = c1165690gRL.LL;
        boolean z2 = c1165690gRL.LLILLJJLI;
        boolean z3 = c1165690gRL.LLILZ;
        Aweme aweme = c1165690gRL.LLILZIL;
        boolean z4 = c1165690gRL.LLILZLL;
        boolean z5 = c1165690gRL.LLIZ;
        c1165690gRL.getClass();
        return new C1165690gRL(urlModel, z2, z, z3, aweme, z4, z5);
    }

    public C1165690gRL(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        this.LL = urlModel;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = aweme;
        this.LLILZLL = z4;
        this.LLIZ = z5;
    }
}
