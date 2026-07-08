package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0YeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879200YeM {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(C879180YeK c879180YeK) {
        EnumC879190YeL enumC879190YeL;
        List<IMContact> list;
        IMUser iMUser;
        Integer num = c879180YeK.LJ;
        int i = AbstractC1711506n3.LIZ;
        if (num != null && num.intValue() == i && (((enumC879190YeL = c879180YeK.LIZ) == EnumC879190YeL.SINGLE_MESSAGE || enumC879190YeL == EnumC879190YeL.SINGLE_PROPERTY || enumC879190YeL == EnumC879190YeL.AGGREGATED_SINGLE_CONVERSATION) && (list = c879180YeK.LIZJ) != null && list.size() == 1)) {
            Object obj = ListProtector.get(list, 0);
            if ((obj instanceof IMUser) && (iMUser = (IMUser) obj) != null) {
                IMUser.Companion.getClass();
                return Collections.singletonList(C2201941BFw.LJII(iMUser));
            }
        }
        return null;
    }
}
