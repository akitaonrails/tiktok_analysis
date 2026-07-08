package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLynx;
import defpackage.k9;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ySZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858370ySZ implements InterfaceC1891350zJl, InterfaceC21266318Kf, C14SX {
    public final C326960Crm LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Map<String, Object> LLILZ;

    @Override // X.InterfaceC21266318Kf
    public final boolean LJJZZIII() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1858370ySZ) && Intrinsics.LJFF(this.LL, ((C1858370ySZ) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoLynxSugListItem(sug=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final Map<String, Object> LJI() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getRawData() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC21266318Kf, X.C14SX
    public final String getSchema() {
        return this.LLILLJJLI;
    }

    public C1858370ySZ(C326960Crm c326960Crm) {
        String str;
        int iIntValue;
        String str2;
        String str3;
        this.LL = c326960Crm;
        TakoLynx takoLynx = c326960Crm.LLILLJJLI.lynxData;
        this.LLILLJJLI = (takoLynx == null || (str3 = takoLynx.schema) == null) ? "" : str3;
        this.LLILLL = (takoLynx == null || (str2 = takoLynx.rawData) == null) ? "" : str2;
        Pair[] pairArr = new Pair[1];
        k9 k9Var = c326960Crm.LL;
        if (k9Var != null) {
            str = k9Var.LIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair("logId", str);
        this.LLILZ = C2097608Jq.LJIIJ(pairArr);
        C1858380ySa c1858380ySa = C1858380ySa.LIZ;
        k9 k9Var2 = c326960Crm.LL;
        String str4 = k9Var2 != null ? k9Var2.LIZ : null;
        c1858380ySa.getClass();
        C1858380ySa.LJ = str4 != null ? str4 : "";
        Integer num = c326960Crm.LLILLJJLI.sugSource;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C1858380ySa.LJFF = iIntValue;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858370ySZ) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLILLL, ((C1858370ySZ) interfaceC1891350zJl).LLILLL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858370ySZ) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858370ySZ) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
