package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0DgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345280DgE {
    public static final String LIZ(Context context, C1365870leD c1365870leD) {
        BaseContact baseContact;
        List<IMContact> list = c1365870leD.LIZIZ;
        if (list == null || (baseContact = (BaseContact) C13LP.LJJJLL(list)) == null) {
            baseContact = c1365870leD.LIZ;
        }
        if (c1365870leD.LJIIIIZZ) {
            return context.getString(2131832049);
        }
        if (c1365870leD.LJII) {
            return context.getString(2131835378);
        }
        int i = c1365870leD.LJIIJ;
        if (i == 2) {
            return context.getString(2131825152, baseContact.getDisplayName());
        }
        if (i > 2) {
            return context.getString(2131825153, baseContact.getDisplayName(), Integer.valueOf(c1365870leD.LJIIJ - 1));
        }
        return context.getString(2131835475, baseContact.getDisplayName());
    }
}
