package X;

import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import java.util.List;
import kotlin.Pair;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0b26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957840b26 extends AbstractC957950b2H {
    public static final C957840b26 LIZJ = new C957840b26();

    public C957840b26() {
        super(3);
    }

    @Override // X.AbstractC957950b2H
    public final C955270axx LIZ(List<Long> list) {
        Pair pair;
        List listLJFF;
        int size = C915980Zwa.LJII().LJJIJ().size();
        if (C915980Zwa.LJFF().co0() && C970370bMJ.LJIIIIZZ() && size >= 3) {
            int iLIZJ = C970370bMJ.LIZJ();
            if (iLIZJ != 3 && iLIZJ != 4) {
                if (iLIZJ != 30 && iLIZJ != 40) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cohost_normal_expand_");
                    sbLIZ.append(size);
                    pair = new Pair(C2188811AlT.LIZIZ(sbLIZ), "200201");
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cohost_nv1_");
                    sbLIZ2.append(size);
                    pair = new Pair(C2188811AlT.LIZIZ(sbLIZ2), "2031");
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cohost_1vn_");
                sbLIZ3.append(size);
                pair = new Pair(C2188811AlT.LIZIZ(sbLIZ3), "2030");
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cohost_normal_expand_");
            sbLIZ4.append(size);
            pair = new Pair(C2188811AlT.LIZIZ(sbLIZ4), "200201");
        }
        if (C500260Jjc.LJJIJIIJI(list)) {
            listLJFF = C957830b25.LJII(list);
        } else {
            listLJFF = C957830b25.LJFF();
        }
        String str = (String) pair.getSecond();
        String str2 = (String) pair.getFirst();
        CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
        cohostLayoutExtra.offsetY = 16;
        cohostLayoutExtra.isZoomLayout = 0;
        cohostLayoutExtra.scene = 3;
        return new C955270axx(new C955320ay2(str, str2, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJFF, C957830b25.LJIIJ(listLJFF));
    }
}
