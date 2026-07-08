package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Myo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586120Myo implements InterfaceC1282004zy {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final Boolean LLILLL;
    public final int LLILZ;
    public final Context LLILZIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C586120Myo)) {
            return false;
        }
        C586120Myo c586120Myo = (C586120Myo) obj;
        return Intrinsics.LJFF(this.LL, c586120Myo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c586120Myo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c586120Myo.LLILLL) && this.LLILZ == c586120Myo.LLILZ && Intrinsics.LJFF(this.LLILZIL, c586120Myo.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLILZ) * 31;
        Context context = this.LLILZIL;
        return iHashCode2 + (context != null ? context.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeParamsGroup(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLandscapePage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isEnterAweme=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C0SXF.LJII(c2344009Gk, this.LLILLJJLI, this.LL, null, this.LLILLL, this.LLILZ, 4);
        C0SXF.LJIIIZ(c2344009Gk, this.LL, null, null, this.LLILLL);
        return c2344009Gk.LIZ;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public C586120Myo(Aweme aweme, String str, Boolean bool, int i, Context context, int i2) {
        bool = (i2 & 4) != 0 ? Boolean.FALSE : bool;
        i = (i2 & 8) != 0 ? 0 : i;
        context = (i2 & 16) != 0 ? null : context;
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = bool;
        this.LLILZ = i;
        this.LLILZIL = context;
    }
}
