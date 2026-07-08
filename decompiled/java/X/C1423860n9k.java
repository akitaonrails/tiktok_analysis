package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423860n9k {
    public static final boolean LIZ(List<C1419590n2r> list, List<C1419590n2r> list2) {
        int size = list2.size();
        if (list.size() < size || !LIZIZ(list.subList(0, size), list2)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(List<C1419590n2r> list, List<C1419590n2r> list2) {
        Asset asset;
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (C1419590n2r c1419590n2r : list) {
            int i2 = i + 1;
            String asset_id = null;
            if (i >= 0) {
                String asset_id2 = c1419590n2r.LIZ.getAsset_id();
                C1419590n2r c1419590n2r2 = (C1419590n2r) C13LP.LJJJLZIJ(i, list2);
                if (c1419590n2r2 != null && (asset = c1419590n2r2.LIZ) != null) {
                    asset_id = asset.getAsset_id();
                }
                if (!Intrinsics.LJFF(asset_id2, asset_id)) {
                    return false;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return true;
    }
}
