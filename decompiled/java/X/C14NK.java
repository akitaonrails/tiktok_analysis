package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14NK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NK implements C14NM {
    public final C14NF LL;
    public final Map<String, Object> LLILLJJLI;
    public final InterfaceC665370Q7z LLILLL;
    public final LifecycleOwner LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14NK)) {
            return false;
        }
        C14NK c14nk = (C14NK) obj;
        return Intrinsics.LJFF(this.LL, c14nk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c14nk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c14nk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c14nk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c14nk.LLILZIL) && this.LLILZLL == c14nk.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        C14NF c14nf = this.LL;
        int iHashCode = (c14nf == null ? 0 : c14nf.hashCode()) * 31;
        Map<String, Object> map = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode())) * 31;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        return ((((iHashCode3 + (lifecycleOwner != null ? lifecycleOwner.hashCode() : 0)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleItem(itemData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", parentScope=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", parentOwner=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C14NK) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LL, ((C14NK) interfaceC1891350zJl).LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C14NK) {
            return Intrinsics.LJFF(this.LLILZIL, ((C14NK) interfaceC1891350zJl).LLILZIL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C14NK(C14NF c14nf, Map map, NimbleTemplateContext nimbleTemplateContext, LifecycleOwner lifecycleOwner, String str, int i) {
        this.LL = c14nf;
        this.LLILLJJLI = map;
        this.LLILLL = nimbleTemplateContext;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = str;
        this.LLILZLL = i;
    }
}
