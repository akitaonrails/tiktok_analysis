package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItemDisplay;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689480u4A {
    public static C1689430u45 LIZ(PushItem pushItem, boolean z, Function0 function0, int i, Integer num) {
        boolean z2;
        boolean z3;
        String str;
        List<PushSelectedSubPageItem> list;
        Integer num2;
        int i2 = pushItem.actionType;
        String str2 = pushItem.itemId;
        PushItemDisplay pushItemDisplay = pushItem.display;
        String str3 = pushItemDisplay.title;
        String str4 = pushItemDisplay.description;
        boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num != null && num.intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        PushSelectedSubPage pushSelectedSubPage = pushItem.selectSubPage;
        if (pushSelectedSubPage != null && (list = pushSelectedSubPage.options) != null) {
            for (PushSelectedSubPageItem pushSelectedSubPageItem : list) {
                if (i == pushSelectedSubPageItem.fieldValue && ((num2 = pushSelectedSubPageItem.selectFieldValue) == null || Intrinsics.LJFF(num, num2))) {
                    str = pushSelectedSubPageItem.title;
                    break;
                }
            }
            str = "";
        } else {
            str = "";
        }
        return new C1689430u45(i2, str2, str3, str4, z, zBooleanValue, str, z2, z3);
    }
}
