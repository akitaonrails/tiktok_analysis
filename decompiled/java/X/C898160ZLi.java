package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898160ZLi implements InterfaceC1357410lQZ {
    public final C823170WQx<String> LL = new C823170WQx<>();

    @Override // X.InterfaceC1357410lQZ
    public final void LIZ() {
        this.LL.clear();
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZLLL(String str) {
        C823170WQx<String> c823170WQx = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("legacy_prefix_");
        sbLIZ.append((String) null);
        if (c823170WQx.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            return;
        }
        C823170WQx<String> c823170WQx2 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("legacy_prefix_");
        sbLIZ2.append((String) null);
        c823170WQx2.add(C2188811AlT.LIZIZ(sbLIZ2));
        C898150ZLh.LL.LIZLLL(str);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        LIZIZ(str, (String) linkedHashMap.get("enter_from"), (String) linkedHashMap.get("enter_method"), (String) linkedHashMap.get("position"), (String) linkedHashMap.get("push_label"), (String) linkedHashMap.get("active_status_type"), "send_a_hi");
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJFF(String str, Map<String, String> map) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        LJ((String) linkedHashMap.get("enter_from"), (String) linkedHashMap.get("enter_method"), (String) linkedHashMap.get("position"), null, (String) linkedHashMap.get("active_status_type"), str);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LJ(String str, String str2, String str3, String str4, String str5, String str6) {
        C898150ZLh.LL.LJ(str, str2, str3, str4, str5, str6);
    }

    @Override // X.InterfaceC892560Yzu
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str7);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LL.contains(strLIZIZ)) {
            return;
        }
        this.LL.add(strLIZIZ);
        C898150ZLh.LL.LIZIZ(str, str2, str3, str4, str5, str6, str7);
    }
}
