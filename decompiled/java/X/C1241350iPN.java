package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241350iPN implements InterfaceC1891350zJl {
    public final IMUser LL;
    public final boolean LLILLJJLI;
    public final EnumC1241340iPM LLILLL;
    public final Function2<View, IMUser, Unit> LLILZ;
    public final Function1<IMUser, Unit> LLILZIL;
    public final Map<String, String> LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        Function2<View, IMUser, Unit> function2 = this.LLILZ;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<IMUser, Unit> function1 = this.LLILZIL;
        return ((iHashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchUserItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needDelete=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", avatarClickListener=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", itemClickListener=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        C1241350iPN c1241350iPN;
        if (obj instanceof C1241350iPN) {
            c1241350iPN = (C1241350iPN) obj;
        } else {
            c1241350iPN = null;
        }
        if (c1241350iPN == null || !Intrinsics.LJFF(c1241350iPN.LL.getUid(), this.LL.getUid()) || c1241350iPN.LLILLJJLI != this.LLILLJJLI || c1241350iPN.LLILLL != this.LLILLL) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C1241350iPN(IMUser iMUser, boolean z, EnumC1241340iPM enumC1241340iPM, int i) {
        LinkedHashMap linkedHashMap;
        boolean z2 = (i & 2) != 0 ? false : z;
        if ((i & 32) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        this(iMUser, z2, enumC1241340iPM, null, null, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1241350iPN(IMUser iMUser, boolean z, EnumC1241340iPM enumC1241340iPM, Function2<? super View, ? super IMUser, Unit> function2, Function1<? super IMUser, Unit> function1, Map<String, String> map) {
        this.LL = iMUser;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1241340iPM;
        this.LLILZ = function2;
        this.LLILZIL = function1;
        this.LLILZLL = map;
    }
}
