package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C255600yo implements InterfaceC1355320lNC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final EnumC255700yp LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C255600yo)) {
            return false;
        }
        C255600yo c255600yo = (C255600yo) obj;
        return Intrinsics.LJFF(this.LIZ, c255600yo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c255600yo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c255600yo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c255600yo.LIZLLL) && this.LJ == c255600yo.LJ && this.LJFF == c255600yo.LJFF && Intrinsics.LJFF(this.LJI, c255600yo.LJI) && this.LJII == c255600yo.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuSwitchClickEvent(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAuthor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isOpen=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isLandscapeScreen=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1355320lNC
    public final Map<String, String> LIZ() {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enter_from", C0SXF.LJJIFFI(null, Boolean.FALSE, this.LIZ));
        pairArr[1] = new Pair("group_id", this.LIZIZ);
        pairArr[2] = new Pair("author_id", this.LIZJ);
        pairArr[3] = new Pair("user_id", this.LIZLLL);
        pairArr[4] = new Pair("is_author", this.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[5] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LJFF ? "on" : "off");
        pairArr[6] = new Pair("enter_method", this.LJI);
        pairArr[7] = new Pair("is_landscape_screen", String.valueOf(this.LJII.getValue()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1355320lNC
    public final String getEventName() {
        return this.LJIIIIZZ;
    }

    public /* synthetic */ C255600yo(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this(str, str2, str3, str4, z, z2, str5, EnumC255700yp.IS_NOT_LANDSCAPE);
    }

    public C255600yo(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, EnumC255700yp enumC255700yp) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = str5;
        this.LJII = enumC255700yp;
        this.LJIIIIZZ = "danmaku_switch_click";
    }
}
