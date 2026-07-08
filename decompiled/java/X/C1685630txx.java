package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0txx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685630txx {
    public static final AlertToneItem LIZJ(AlertToneItem alertToneItem) {
        List<AlertToneValueItem> list = alertToneItem.alertToneValueItems;
        if (list == null) {
            return alertToneItem;
        }
        if (!list.isEmpty()) {
            Iterator<AlertToneValueItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().alertToneValue, alertToneItem.selectedValue)) {
                    return alertToneItem;
                }
            }
        }
        return AlertToneItem.LIZ(alertToneItem, null, EnumC891100YxY.DEFAULT.getAlertValue(), 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.EnumC12978056a r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, X.InterfaceC1680500tpg r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685630txx.LIZ(X.056a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem, kotlin.Unit> r58, X.InterfaceC1680500tpg r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685630txx.LIZIZ(com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }
}
