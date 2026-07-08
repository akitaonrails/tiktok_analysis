package X;

import com.ss.android.ugc.aweme.profile.model.Lemon8Struct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0idU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250100idU implements C10HO {
    public final /* synthetic */ Map<Integer, C1242830iRl> LIZ;
    public final /* synthetic */ User LIZIZ;

    @Override // X.C10HO
    public final Lemon8Struct LIZ() {
        User user = this.LIZIZ;
        String lemon8OpenId = user != null ? user.getLemon8OpenId() : null;
        User user2 = this.LIZIZ;
        String lemon8UserName = user2 != null ? user2.getLemon8UserName() : null;
        User user3 = this.LIZIZ;
        String lemon8StoreRegion = user3 != null ? user3.getLemon8StoreRegion() : null;
        User user4 = this.LIZIZ;
        return new Lemon8Struct(lemon8OpenId, lemon8UserName, lemon8StoreRegion, Intrinsics.LJFF(user4 != null ? user4.getSecUid() : null, C0XQ7.LJFF().getCurSecUserId()));
    }

    @Override // X.C10HO
    public final String LIZIZ() {
        C1242830iRl c1242830iRl = this.LIZ.get(1);
        if (c1242830iRl != null) {
            return c1242830iRl.LIZ;
        }
        return null;
    }

    @Override // X.C10HO
    public final String LIZJ() {
        C1242830iRl c1242830iRl = this.LIZ.get(2);
        if (c1242830iRl != null) {
            return c1242830iRl.LIZ;
        }
        return null;
    }

    @Override // X.C10HO
    public final String LIZLLL() {
        C1242830iRl c1242830iRl = this.LIZ.get(3);
        if (c1242830iRl != null) {
            return c1242830iRl.LIZ;
        }
        return null;
    }

    public C1250100idU(User user, Map map) {
        this.LIZ = map;
        this.LIZIZ = user;
    }
}
