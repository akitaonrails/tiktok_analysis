package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OB2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OB2 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final AddYoursAvatar[] LLILZ;
    public final Aweme LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OB2)) {
            return false;
        }
        C0OB2 c0ob2 = (C0OB2) obj;
        return Intrinsics.LJFF(this.LL, c0ob2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ob2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0ob2.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0ob2.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0ob2.LLILZIL) && this.LLILZLL == c0ob2.LLILZLL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AddYoursAvatar[] addYoursAvatarArr = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (addYoursAvatarArr == null ? 0 : Arrays.hashCode(addYoursAvatarArr))) * 31;
        Aweme aweme = this.LLILZIL;
        return ((iHashCode4 + (aweme != null ? aweme.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursDetailPageHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFromBeforeDetailPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userAvatars=");
        sbLIZ.append(Arrays.toString(this.LLILZ));
        sbLIZ.append(", fromAweme=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", fromQaSticker=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OB2(String str, String str2, Integer num, AddYoursAvatar[] addYoursAvatarArr, Aweme aweme, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = num;
        this.LLILZ = addYoursAvatarArr;
        this.LLILZIL = aweme;
        this.LLILZLL = z;
    }
}
