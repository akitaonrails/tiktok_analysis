package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.unknown.UnionBufferBtm;
import com.bytedance.android.btm.impl.page.unknown.UnionData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.18DO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DO {
    public static UnionBufferBtm LIZ;

    public static boolean LIZ(UnionData unionData) {
        C18DN c18dn;
        if (C18CS.LIZ.LIZJ().LJIILLIIL() != 1) {
            return false;
        }
        C18CK.LJIIJJI("UnionBufferQueue_consume", new C18DQ(unionData));
        if (unionData.getUnionStep() > 0) {
            return false;
        }
        UnionBufferBtm unionBufferBtm = LIZ;
        if (unionBufferBtm != null) {
            if (Intrinsics.LJFF(unionBufferBtm.getPageId(), unionData.getPageId())) {
                return false;
            }
            unionData.setUnionStep(unionBufferBtm.getUnionStep() + 1);
            unionData.setUnionPre(unionBufferBtm.getBtm());
            if ((unionData instanceof C18DN) && (c18dn = (C18DN) unionData) != null) {
                c18dn.setBufferBtm(unionBufferBtm.getBufferBtm());
            }
            return true;
        }
        unionData.setUnionStep(1);
        unionData.setUnionPre(null);
        return false;
    }

    public static void LIZIZ(UnionData unionData, BufferBtm bufferBtm) {
        String pageBtm;
        if (C18CS.LIZ.LIZJ().LJIILLIIL() != 1) {
            return;
        }
        C18CK.LJIIJJI("UnionBufferQueue_set", new C18DR(unionData, bufferBtm));
        if (unionData.getUnionStep() >= 1 && (pageBtm = unionData.getPageBtm()) != null && pageBtm.length() != 0) {
            Regex regex = C18C3.LIZ;
            String strLIZ = C18C3.LIZ(unionData.getPageBtm());
            if (unionData instanceof C18DN) {
                ((C18DN) unionData).getMountBtmIds().add(strLIZ);
            }
            String unionPre = unionData.getUnionPre();
            if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && strLIZ != null && unionPre != null) {
                C1287110jbB.LIZIZ.put(strLIZ, unionPre);
            }
            LIZ = new UnionBufferBtm(strLIZ, unionData.getUnionStep(), unionData.getPageId(), bufferBtm);
        }
    }
}
