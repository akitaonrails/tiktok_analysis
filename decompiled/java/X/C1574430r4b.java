package X;

import com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574430r4b implements InterfaceC1574420r4a {
    public static final C1574430r4b LIZ = new C1574430r4b();

    @Override // X.InterfaceC1574420r4a
    public final Object LIZ(List<Long> list, AbstractC1574450r4d abstractC1574450r4d, String str, String str2, InterfaceC1364105Vn<? super List<CollectionVideo>> interfaceC1364105Vn) {
        int i;
        C1574380r4W c1574380r4W = C1574380r4W.LIZ;
        if (!Intrinsics.LJFF(abstractC1574450r4d, c1574380r4W) && !Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
            if (abstractC1574450r4d instanceof C1574370r4V) {
                return MiniDramaVideoApi.LIZ.LIZJ(list, str, str2, interfaceC1364105Vn);
            }
            throw new C1954807lC();
        }
        C1617470sC1 c1617470sC1 = MiniDramaVideoApi.LIZ;
        abstractC1574450r4d.getClass();
        if (!Intrinsics.LJFF(abstractC1574450r4d, c1574380r4W)) {
            if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
                i = 2;
            } else {
                if (!(abstractC1574450r4d instanceof C1574370r4V)) {
                    throw new C1954807lC();
                }
                i = 1;
            }
        } else {
            i = 1;
        }
        return c1617470sC1.LIZIZ(str, list, C2286608xc.LJ(i), str2, interfaceC1364105Vn);
    }
}
