package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H00, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H00 implements InterfaceC1891350zJl, InterfaceC1859540yUS {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
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
        if (!(obj instanceof C0H00)) {
            return false;
        }
        C0H00 c0h00 = (C0H00) obj;
        return Intrinsics.LJFF(this.LL, c0h00.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h00.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0h00.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPhotoUploadGuideItem(guidePicFilePath=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", guideTextString=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userAvatarFilePath=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        return c2137908Zd.LJFF(this.LL) && c2137908Zd.LJFF(this.LLILLL) && C123100dR.LIZ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0H00) {
            if (Intrinsics.LJFF(interfaceC1891350zJl, this)) {
                C0H00 c0h00 = (C0H00) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLILLJJLI, c0h00.LLILLJJLI) && Intrinsics.LJFF(this.LL, c0h00.LL)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0H00(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str2;
    }
}
