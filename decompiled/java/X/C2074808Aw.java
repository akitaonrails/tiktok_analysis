package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.08Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2074808Aw {
    public static final Map<Long, GiftGalleryBadgeInfo> LIZ() {
        return C2074908Ax.LIZ.get().LJII;
    }

    public static final List<C954460awe> LIZIZ() {
        return C2074908Ax.LIZ.get().LJ;
    }

    public static final List<C954460awe> LIZJ() {
        return C2074908Ax.LIZ.get().LJI;
    }

    public static final List<C954460awe> LIZLLL() {
        return C2074908Ax.LIZ.get().LJFF;
    }

    public static final boolean LJ() {
        return C2074908Ax.LIZ.get().LIZIZ == EnumC1990707qz.DIRECT_BATTLE;
    }

    public static final boolean LJFF() {
        return C2074908Ax.LIZ.get().LIZ;
    }

    public static final void LJII() {
        while (true) {
            AtomicReference<C1999007sK> atomicReference = C2074908Ax.LIZ;
            C1999007sK c1999007sK = atomicReference.get();
            C1999007sK c1999007sKLIZ = C1999007sK.LIZ(c1999007sK, EnumC1990707qz.DIRECT_BATTLE, false, EnumC1998907sJ.NONE, null, null, null, null, 240);
            while (!atomicReference.compareAndSet(c1999007sK, c1999007sKLIZ)) {
                if (atomicReference.get() != c1999007sK) {
                    break;
                }
            }
            return;
        }
    }

    public static final void LJI(EnumC1998907sJ enumC1998907sJ) {
        while (true) {
            AtomicReference<C1999007sK> atomicReference = C2074908Ax.LIZ;
            C1999007sK c1999007sK = atomicReference.get();
            C1999007sK c1999007sKLIZ = C1999007sK.LIZ(c1999007sK, EnumC1990707qz.DIRECT_BATTLE, true, enumC1998907sJ, null, null, null, null, 240);
            while (!atomicReference.compareAndSet(c1999007sK, c1999007sKLIZ)) {
                if (atomicReference.get() != c1999007sK) {
                    break;
                }
            }
            return;
        }
    }
}
