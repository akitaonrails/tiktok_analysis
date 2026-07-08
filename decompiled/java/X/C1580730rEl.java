package X;

import X.InterfaceC1580740rEm;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580730rEl<T extends InterfaceC1580740rEm> implements C14NM {
    public final T LL;
    public SideBarComponentUiData LLILLJJLI;
    public final Map<String, Object> LLILLL = new LinkedHashMap();
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1580730rEl) && Intrinsics.LJFF(this.LL, ((C1580730rEl) obj).LL);
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
        sbLIZ.append("SideBarPowerItem(uiConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZ;
    }

    public C1580730rEl(T t) {
        this.LL = t;
        this.LLILZ = t.getContentType();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1580730rEl)) {
            return false;
        }
        return this.LL.LIZ(((C1580730rEl) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        if (!(interfaceC1891350zJl instanceof C1580730rEl)) {
            return false;
        }
        SideBarComponentUiData sideBarComponentUiData = this.LLILLJJLI;
        String str4 = null;
        if (sideBarComponentUiData != null) {
            str = sideBarComponentUiData.componentId;
        } else {
            str = null;
        }
        C1580730rEl c1580730rEl = (C1580730rEl) interfaceC1891350zJl;
        SideBarComponentUiData sideBarComponentUiData2 = c1580730rEl.LLILLJJLI;
        if (sideBarComponentUiData2 != null) {
            str2 = sideBarComponentUiData2.componentId;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        SideBarComponentUiData sideBarComponentUiData3 = this.LLILLJJLI;
        if (sideBarComponentUiData3 != null) {
            str3 = sideBarComponentUiData3.componentType;
        } else {
            str3 = null;
        }
        SideBarComponentUiData sideBarComponentUiData4 = c1580730rEl.LLILLJJLI;
        if (sideBarComponentUiData4 != null) {
            str4 = sideBarComponentUiData4.componentType;
        }
        if (!Intrinsics.LJFF(str3, str4)) {
            return false;
        }
        return true;
    }
}
