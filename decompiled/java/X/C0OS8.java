package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OS8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS8 {
    public static final C0OS8 LIZ = new C0OS8();
    public static final BulletinScrollOptConfiguration LIZIZ = new BulletinScrollOptConfiguration(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 15, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(514));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1266));

    public static BulletinScrollOptConfiguration LJII() {
        return (BulletinScrollOptConfiguration) LIZJ.getValue();
    }

    public static final boolean LIZ() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enableAsyncAvatarLoad;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LIZIZ() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enableCommentWidgetV2;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LIZJ() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enableHybridWidgetV2;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LIZLLL() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enableLinearLayoutOpt;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LJ() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enablePhotoBindOpt;
        return num != null && num.intValue() == 1;
    }

    public static final boolean LJFF() {
        Integer num;
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        return (((Boolean) LIZLLL.getValue()).booleanValue() || (num = LJII().enableViewPreload) == null || num.intValue() != 1) ? false : true;
    }

    public static final boolean LJI() {
        if (!C296740Bk8.LIZ()) {
            return false;
        }
        LIZ.getClass();
        Integer num = LJII().enableWidgetCodeLayout;
        return num != null && num.intValue() == 1;
    }
}
