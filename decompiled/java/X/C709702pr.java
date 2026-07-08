package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;

/* JADX INFO: renamed from: X.02pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C709702pr {
    public static final /* synthetic */ int LIZ = 0;

    public static final ButtonStyle LIZ(Integer num, ButtonStyle buttonStyle) {
        if (num != null) {
            num.intValue();
            C709802ps c709802ps = ButtonStyle.Companion;
            int iIntValue = num.intValue();
            c709802ps.getClass();
            for (ButtonStyle buttonStyle2 : ButtonStyle.values()) {
                if (buttonStyle2.getValue() == iIntValue) {
                    return buttonStyle2;
                }
            }
            return null;
        }
        return buttonStyle;
    }
}
