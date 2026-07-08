package X;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876230YYz {
    public static final boolean LIZ(C0Y8T c0y8t) {
        Map<String, String> ext;
        boolean z = false;
        if (c0y8t == null || !c0y8t.isMember() || c0y8t.getCoreInfo() == null) {
            return false;
        }
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage != null && (lastShowMessage.getMsgType() == 1004 || lastShowMessage.getMsgType() == 1005)) {
            if (lastShowMessage.getMsgStatus() == 5 || lastShowMessage.getMsgStatus() == 2) {
                z = true;
            }
            return !z;
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && (!ext.isEmpty())) {
            String str = ext.get("closed");
            if (str == null) {
                str = "false";
            }
            if (Intrinsics.LJFF("false", str)) {
                return true;
            }
            if (Intrinsics.LJFF("true", str)) {
                return false;
            }
        }
        C869590Y9l lastShowMessage2 = c0y8t.getLastShowMessage();
        if (lastShowMessage2 != null) {
            if (lastShowMessage2.getMsgType() != 1004 && lastShowMessage2.getMsgType() != 1005) {
                Date date = new Date(c0y8t.getUpdatedTime());
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(new Date());
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                gregorianCalendar2.setTime(date);
                if (gregorianCalendar.getTimeInMillis() - gregorianCalendar2.getTimeInMillis() >= 86400000) {
                    return false;
                }
                return true;
            }
            if (lastShowMessage2.getMsgStatus() != 5 && lastShowMessage2.getMsgStatus() != 2) {
                return true;
            }
        }
        return false;
    }
}
