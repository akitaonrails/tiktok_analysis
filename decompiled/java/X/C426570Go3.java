package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S2301000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Go3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426570Go3 implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final List<CreativeTemplateAsset> LLILZIL;
    public final Function0<Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C426570Go3)) {
            return false;
        }
        C426570Go3 c426570Go3 = (C426570Go3) obj;
        return Intrinsics.LJFF(this.LL, c426570Go3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c426570Go3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c426570Go3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c426570Go3.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c426570Go3.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c426570Go3.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        List<CreativeTemplateAsset> list = this.LLILZIL;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageCreateTemplateItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", picUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", templatePrompt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", nameText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", assets=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C426570Go3) && Intrinsics.LJFF(((C426570Go3) interfaceC1891350zJl).LLILLL, this.LLILLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C426570Go3) && Intrinsics.LJFF(((C426570Go3) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    public C426570Go3(String str, String str2, String str3, String str4, List list, AwS2S2301000_27 awS2S2301000_27) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = list;
        this.LLILZLL = awS2S2301000_27;
    }
}
