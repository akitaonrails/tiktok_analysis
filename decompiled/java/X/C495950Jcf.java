package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Jcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495950Jcf {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    public final String LIZ() {
        return this.LJI ? this.LIZLLL ? "anchor_to_self" : this.LJIIIIZZ ? "anchor_to_other_anchor" : this.LJIIJ ? "anchor_to_guest" : "anchor_to_user" : this.LJIIIZ ? this.LIZLLL ? "guest_to_self" : this.LJII ? "guest_to_anchor" : this.LJIIJ ? "guest_to_other_guest" : "guest_to_user" : this.LIZLLL ? "user_to_self" : this.LJII ? "user_to_anchor" : this.LJIIIIZZ ? "user_to_other_anchor" : this.LJIIJ ? "user_to_guest" : this.LIZ ? "user_to_group_live_member" : "user_to_other_user";
    }

    public final int LIZIZ() {
        if (this.LJI) {
            return 4;
        }
        if (this.LIZLLL && this.LIZIZ) {
            return 32;
        }
        return this.LJFF ? 2 : 1;
    }

    public C495950Jcf(User user, long j, long j2, List list, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = user.getId();
        if (user.getId() == j) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LIZLLL = z3;
        if (user.getId() != j2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LJ = z4;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr != null) {
            z5 = userAttr.isAdmin;
        } else {
            z5 = false;
        }
        this.LJFF = z5;
        if (user.getId() == j2) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.LJI = z6;
        if (j == j2) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.LJII = z7;
        this.LJIIIIZZ = ((ArrayList) list).contains(Long.valueOf(j));
        if (i == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.LJIIIZ = z8;
        this.LJIIJ = i2 == 2;
    }
}
