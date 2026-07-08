package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings.PlaybookEditorRuleGroupSetting;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.14mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20365214mQ {
    public static final void LIZ(InterfaceC20365314mR interfaceC20365314mR, Map<String, Integer> map) {
        int iIntValue;
        int iIntValue2;
        Integer num = (Integer) ((LinkedHashMap) map).get(interfaceC20365314mR.LJI());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = (Integer) C930540aK4.LJIJ(interfaceC20365314mR.LIZJ(), PlaybookEditorRuleGroupSetting.INSTANCE.getStepColors(interfaceC20365314mR.LJFF().LIZ, iIntValue));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = -1;
        }
        interfaceC20365314mR.LIZ(iIntValue2);
    }

    public static final void LIZIZ(InterfaceC20365314mR interfaceC20365314mR, Map<String, Integer> map) {
        int iIntValue;
        String groupName = PlaybookEditorRuleGroupSetting.INSTANCE.getGroupName(interfaceC20365314mR.LJFF().LIZ);
        if (groupName != null) {
            Integer num = (Integer) ((LinkedHashMap) map).get(groupName);
            if (num != null) {
                iIntValue = num.intValue();
                map.put(groupName, Integer.valueOf(iIntValue + 1));
            } else {
                map.put(groupName, 1);
                iIntValue = 0;
            }
            interfaceC20365314mR.LJIIIIZZ(groupName);
            interfaceC20365314mR.LJ(iIntValue);
        }
    }
}
