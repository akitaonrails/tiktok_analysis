package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858030yS1 extends C1858660yT2 implements InterfaceC1891350zJl {
    public final TakoBotInfo LLJJIJI;
    public final String LLJJIJIIJIL;
    public final C326880Cre LLJJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858030yS1)) {
            return false;
        }
        C1858030yS1 c1858030yS1 = (C1858030yS1) obj;
        return Intrinsics.LJFF(this.LLJJIJI, c1858030yS1.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1858030yS1.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1858030yS1.LLJJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        TakoBotInfo takoBotInfo = this.LLJJIJI;
        int iHashCode = (takoBotInfo == null ? 0 : takoBotInfo.hashCode()) * 31;
        String str = this.LLJJIJIIJIL;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LLJJIJIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBotSeeConversationItem(botInfo=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(", botSessionId=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858030yS1) {
            if (areItemTheSame(interfaceC1891350zJl) && this.LLILZIL == ((C1858660yT2) interfaceC1891350zJl).LLILZIL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858030yS1) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1858030yS1(TakoBotInfo takoBotInfo, String str, C326880Cre c326880Cre) {
        super(c326880Cre);
        this.LLJJIJI = takoBotInfo;
        this.LLJJIJIIJIL = str;
        this.LLJJIJIL = c326880Cre;
    }
}
