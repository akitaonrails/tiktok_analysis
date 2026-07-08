package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0NSK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NSK {
    public static final List<AddYoursAvatar> LIZ(List<AddYoursAvatar> list) {
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        String uid = currentUser.getUid();
        if (uid == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AddYoursAvatar> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getUid());
        }
        if (arrayList.contains(C2095008Iq.LJIILIIL(uid))) {
            return list;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new AddYoursAvatar(C2095008Iq.LJIILIIL(uid), currentUser.getAvatarThumb(), null));
        listLJIILJJIL.addAll(list);
        return C13LP.LL(listLJIILJJIL, 3);
    }
}
