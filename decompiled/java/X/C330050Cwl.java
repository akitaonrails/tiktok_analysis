package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330050Cwl implements InterfaceC111300bX {
    public final List<UserInvitee> LL;
    public final Function2<List<UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public final InterfaceC330080Cwo LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C330050Cwl)) {
            return false;
        }
        C330050Cwl c330050Cwl = (C330050Cwl) obj;
        return Intrinsics.LJFF(this.LL, c330050Cwl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c330050Cwl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c330050Cwl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c330050Cwl.LLILZ) && this.LLILZIL == c330050Cwl.LLILZIL;
    }

    public final int hashCode() {
        List<UserInvitee> list = this.LL;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Map<String, Object> map = this.LLILLL;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        InterfaceC330080Cwo interfaceC330080Cwo = this.LLILZ;
        return ((iHashCode2 + (interfaceC330080Cwo != null ? interfaceC330080Cwo.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteHierarchyData(preSelected=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", done=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", navExtra=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listBehavior=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPad=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C330050Cwl(List list, C343900De0 c343900De0, Map map, InterfaceC330080Cwo interfaceC330080Cwo, boolean z) {
        this.LL = list;
        this.LLILLJJLI = c343900De0;
        this.LLILLL = map;
        this.LLILZ = interfaceC330080Cwo;
        this.LLILZIL = z;
    }
}
