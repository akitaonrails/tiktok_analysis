package X;

/* JADX INFO: renamed from: X.06II, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06II {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC15624069u LIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06II.LIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, java.lang.String, java.lang.String, boolean):X.069u");
    }

    public static final C15625069v LIZIZ(String str, Integer num, String str2, String str3, String str4, String str5) {
        boolean z;
        String strLIZIZ;
        if (str5 != null && str5.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" business_fc_detail=");
            sbLIZ.append(str5);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[whee_bubble_diversion_banner] schedule_blocked=");
        sbLIZ2.append(str4);
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" sessionUUID=");
        sbLIZ2.append(str);
        sbLIZ2.append(" login_uid=");
        sbLIZ2.append(str2);
        sbLIZ2.append(" peer_uid=");
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ2.append(str3);
        sbLIZ2.append(" follow_status=");
        sbLIZ2.append(num);
        C2188811AlT.LIZIZ(sbLIZ2);
        return new C15625069v(str4);
    }
}
