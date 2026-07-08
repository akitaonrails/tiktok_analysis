package X;

import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10Ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19231110Ll extends AbstractC728630Si5<SuperAccountList> {
    public List<String> LLILZ;
    public final C1DTJ LLILZIL = C1DTJ.LIZIZ;

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.ss.android.ugc.aweme.friends.model.SuperAccountList] */
    @Override // X.AbstractC728630Si5
    public final void LIZIZ(SuperAccountList superAccountList) {
        SuperAccountList superAccountList2 = superAccountList;
        this.LLILLJJLI = superAccountList2;
        List<String> list = this.LLILZ;
        if (list == null) {
            this.LLILZ = new ArrayList();
        } else {
            ((ArrayList) list).clear();
        }
        if (superAccountList2 != 0 && superAccountList2.getUserList() != null) {
            for (UserWithAweme userWithAweme : superAccountList2.getUserList()) {
                ((ArrayList) this.LLILZ).add(userWithAweme.getUid());
            }
        }
    }
}
