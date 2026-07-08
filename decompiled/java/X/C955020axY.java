package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0axY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955020axY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        C942080acg c942080acgLJII;
        C947470alN c947470alN;
        List<C957020b0m> list;
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 == null || (c942080acgLJII = c955010axXI30.LJII()) == null || (c947470alN = c942080acgLJII.LIZ) == null || (list = c947470alN.LIZLLL) == null || list.isEmpty()) {
            return false;
        }
        for (C957020b0m c957020b0m : list) {
            PosIdentity posIdentity = c957020b0m.getPosIdentity();
            if (posIdentity != null && posIdentity.type == 0) {
                PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                if (Intrinsics.LJFF(posIdentity2 != null ? posIdentity2.value : null, "empty_slot_quick_pair_searching")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (!C1152520g66.LIZIZ()) {
            return false;
        }
        C214831195p c214831195pM0 = C915980Zwa.LJIIIZ().m0();
        if (c214831195pM0 != null && c214831195pM0.LIZIZ) {
            return true;
        }
        EnumC958900b3o enumC958900b3oK0 = C915980Zwa.LJIIIZ().k0();
        if (enumC958900b3oK0 != EnumC958900b3o.WAITED && enumC958900b3oK0 != EnumC958900b3o.PREPARED) {
            return false;
        }
        C959600b4w c959600b4wC0 = C915980Zwa.LJIIIZ().c0();
        if (c959600b4wC0 == null || c959600b4wC0.LJIIJJI <= 0) {
            return LIZ();
        }
        return true;
    }

    public static boolean LIZJ() {
        if (!C1152520g66.LIZIZ() || !LIZIZ()) {
            return false;
        }
        long jLJFF = C950220apo.LJFF();
        List<LinkUser> listLJJIJ = C915980Zwa.LJII().LJJIJ();
        if (!(listLJJIJ instanceof Collection) || !listLJJIJ.isEmpty()) {
            int i = 0;
            for (LinkUser linkUser : listLJJIJ) {
                Long l = linkUser.userId;
                if (l == null || l.longValue() != 0) {
                    Long l2 = linkUser.userId;
                    if (l2 == null || l2.longValue() != jLJFF) {
                        i++;
                        if (i < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            }
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
