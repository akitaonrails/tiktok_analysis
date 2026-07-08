package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0Jci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C495980Jci {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final C495950Jcf LIZJ;
    public final InterfaceC496990JeL LIZLLL;
    public final boolean LJ;
    public final Room LJFF;
    public final User LJI;
    public final long LJII;
    public final UserProfileEvent LJIIIIZZ;
    public final C495940Jce LJIIIZ;
    public int LJIIJ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Long, java.lang.Integer> LIZIZ() {
        /*
            r8 = this;
            X.0Jcf r0 = r8.LIZJ
            int r4 = r0.LIZIZ()
            X.0Jcf r1 = r8.LIZJ
            boolean r0 = r1.LJII
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L3d
            r1 = 4
        Lf:
            X.0Jcf r0 = r8.LIZJ
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L19
            int r4 = r8.LIZ(r4)
        L19:
            int r5 = r8.LIZ(r1)
            r8.LJIIJ = r5
            X.0Jcf r0 = r8.LIZJ
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L61
            com.bytedance.android.live.base.model.user.User r0 = r8.LJI
            long r0 = r0.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            return r0
        L3d:
            boolean r0 = r1.LIZLLL
            if (r0 != 0) goto L48
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L48
            r1 = 32
            goto Lf
        L48:
            boolean r0 = r1.LJIIIIZZ
            if (r0 != 0) goto L5e
            com.bytedance.android.livesdk.event.UserProfileEvent r1 = r8.LJIIIIZZ
            boolean r0 = r1.coHostEnable
            if (r0 != 0) goto L5e
            int r1 = r1.mScene
            X.0Jcj r0 = X.EnumC495990Jcj.OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING
            int r0 = r0.ordinal()
            if (r1 == r0) goto L5e
            r1 = 1
            goto Lf
        L5e:
            r1 = 8
            goto Lf
        L61:
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            com.bytedance.android.live.base.model.user.User r0 = r8.LJI
            long r0 = r0.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r3[r7] = r0
            long r0 = r8.LJII
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r3[r6] = r0
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C495980Jci.LIZIZ():java.util.Map");
    }

    public final int LIZ(int i) {
        Integer numValueOf;
        UserProfileEvent userProfileEvent = this.LJIIIIZZ;
        if (userProfileEvent != null) {
            numValueOf = Integer.valueOf(userProfileEvent.mScene);
        } else {
            numValueOf = null;
        }
        int iOrdinal = EnumC495990Jcj.OPEN_PROFILE_FROM_SCENE_CREATOR_RANKING.ordinal();
        if (numValueOf == null || numValueOf.intValue() != iOrdinal) {
            int iOrdinal2 = EnumC495990Jcj.OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING.ordinal();
            if (numValueOf == null || numValueOf.intValue() != iOrdinal2) {
                return i;
            }
        }
        return i | 16;
    }

    public C495980Jci(Context context, LiveProfileSheet liveProfileSheet, C495950Jcf c495950Jcf, LiveProfileSheet liveProfileSheet2, boolean z, Room room, User user, long j, UserProfileEvent userProfileEvent, C495940Jce c495940Jce) {
        this.LIZ = context;
        this.LIZIZ = liveProfileSheet;
        this.LIZJ = c495950Jcf;
        this.LIZLLL = liveProfileSheet2;
        this.LJ = z;
        this.LJFF = room;
        this.LJI = user;
        this.LJII = j;
        this.LJIIIIZZ = userProfileEvent;
        this.LJIIIZ = c495940Jce;
    }
}
