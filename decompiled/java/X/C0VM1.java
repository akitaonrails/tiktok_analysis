package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS65S1100000_13;
import android.os.CancellationSignal;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DataBase;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VM1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VM1 implements C0VM7 {
    public final AbstractC796540VMm LIZ;
    public final C854560Xfi LIZIZ;
    public final C0VM2 LIZJ = new C0VM2();
    public final C854550Xfh LIZLLL;

    public C0VM1(FriendsV3DataBase friendsV3DataBase) {
        this.LIZ = friendsV3DataBase;
        this.LIZIZ = new C854560Xfi(this, friendsV3DataBase, 1);
        this.LIZLLL = new C854550Xfh(friendsV3DataBase, 44);
    }

    @Override // X.C0VM7
    public final Object LIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS65S1100000_13(this, str, 3), interfaceC1364105Vn);
    }

    @Override // X.C0VM7
    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super List<FriendsV3FeedDBEntity>> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM friends_v3_feeds_table WHERE uid = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 29), interfaceC1364105Vn);
    }

    @Override // X.C0VM7
    public final Object LIZJ(FriendsV3FeedDBEntity friendsV3FeedDBEntity, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, friendsV3FeedDBEntity, 28), interfaceC1364105Vn);
    }
}
