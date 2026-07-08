package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ice, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249580ice implements InterfaceC1891350zJl {
    public EnumC1249570icd LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Object LLILZ;
    public final InterfaceC1631620sYq<Context, View, String, Unit> LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public String LLJ;
    public final List<EventParams> LLJI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchableMenuData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", group=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", sourceKey=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LLILLJJLI.hashCode() + this.LLILLL.hashCode();
        String str = this.LLILZLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1249580ice)) {
            return false;
        }
        C1249580ice c1249580ice = (C1249580ice) interfaceC1891350zJl;
        if (this.LL != c1249580ice.LL || !Intrinsics.LJFF(this.LLILLJJLI, c1249580ice.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1249580ice.LLILLL) || !Intrinsics.LJFF(this.LLILZLL, c1249580ice.LLILZLL) || this.LLIZ != c1249580ice.LLIZ || !Intrinsics.LJFF(this.LLJ, c1249580ice.LLJ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1249580ice)) {
            return false;
        }
        C1249580ice c1249580ice = (C1249580ice) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1249580ice.LLILLJJLI) || !Intrinsics.LJFF(this.LLILLL, c1249580ice.LLILLL) || !Intrinsics.LJFF(this.LLILZLL, c1249580ice.LLILZLL)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return areContentsTheSame((C1249580ice) obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1249580ice(String str, String str2, Object obj, InterfaceC1631620sYq interfaceC1631620sYq, String str3, int i, String str4, List list, int i2) {
        EnumC1249570icd enumC1249570icd;
        List list2 = list;
        String str5 = str4;
        int i3 = i;
        String str6 = str3;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        if ((i2 & 1) != 0) {
            enumC1249570icd = EnumC1249570icd.ITEM;
        } else {
            enumC1249570icd = null;
        }
        this(enumC1249570icd, str, str2, obj, (i2 & 16) != 0 ? null : interfaceC1631620sYq2, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? 0 : i3, (i2 & 128) != 0 ? null : str5, null, (i2 & 512) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1249580ice(EnumC1249570icd enumC1249570icd, String str, String str2, Object obj, InterfaceC1631620sYq<? super Context, ? super View, ? super String, Unit> interfaceC1631620sYq, String str3, int i, String str4, String str5, List<EventParams> list) {
        this.LL = enumC1249570icd;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = obj;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = list;
    }
}
