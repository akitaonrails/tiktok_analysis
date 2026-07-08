package X;

import com.ss.android.ugc.aweme.service.FriendsRedDotGidsService;
import com.ss.android.ugc.aweme.service.FriendsUnreadGidsService;
import com.ss.android.ugc.aweme.service.RepostDislikeGidsService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Xg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854770Xg3 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Unit> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C854770Xg3 c854770Xg3, C09AJ c09aj) {
        C1C7U.LIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$1");
        ((InterfaceC797800VRi) ((FriendsRedDotGidsService) c854770Xg3.l0).LIZ.getValue()).LIZ(C1697810uHb.LJ((C0VNJ) c854770Xg3.l1));
        c09aj.onNext(Unit.LIZ);
        c09aj.onComplete();
        C1C7U.LIZIZ("FriendsRedDotGidsService@4d7d.insertSingleEntity$dis$1");
    }

    public static final void subscribe$1(C854770Xg3 c854770Xg3, C09AJ c09aj) {
        C1C7U.LIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$1");
        ((InterfaceC797850VRn) ((FriendsUnreadGidsService) c854770Xg3.l0).LIZ.getValue()).LIZ((List) c854770Xg3.l1);
        c09aj.onNext(Unit.LIZ);
        c09aj.onComplete();
        C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$1");
    }

    public static final void subscribe$2(C854770Xg3 c854770Xg3, C09AJ c09aj) {
        C1C7U.LIZ("RepostDislikeGidsService@3220.insertEntities$dis$1");
        ((C0VRS) ((RepostDislikeGidsService) c854770Xg3.l0).LIZ.getValue()).LIZ((List) c854770Xg3.l1);
        c09aj.onNext(Unit.LIZ);
        c09aj.onComplete();
        C1C7U.LIZIZ("RepostDislikeGidsService@3220.insertEntities$dis$1");
    }

    public C854770Xg3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
