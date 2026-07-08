package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21182517ux implements C0NSH {
    public final /* synthetic */ AbstractC21194117wp LIZ;

    public C21182517ux(AbstractC21194117wp abstractC21194117wp) {
        this.LIZ = abstractC21194117wp;
    }

    @Override // X.C0NSH
    public final void LIZ(UsPopupCardVO usPopupCardVO, boolean z, String str, String str2, Map<String, ? extends Object> map) {
        String idStr;
        if (!C292450BdD.LIZ()) {
            if (usPopupCardVO.flashSaleAtmosphereInfo != null) {
                C598730Ne3 c598730Ne3 = this.LIZ.LLLIIL;
                c598730Ne3.getClass();
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("stop refresh");
                c598730Ne3.LIZLLL = false;
                return;
            }
            this.LIZ.LLLIIL.LJFF();
        }
        String strValueOf = String.valueOf(usPopupCardVO.productId);
        Room room = this.LIZ.LLJILLL;
        String str3 = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        AbstractC21194117wp abstractC21194117wp = this.LIZ;
        boolean z2 = abstractC21194117wp.LLLFZ;
        String str4 = usPopupCardVO.formatAvailablePrice;
        UsPopupCardVO usPopupCardVO2 = abstractC21194117wp.LJJIJIIJI().LL;
        if (usPopupCardVO2 != null) {
            str3 = usPopupCardVO2.formatAvailablePrice;
        }
        C21198317xV.LJFF(strValueOf, idStr, str, str2, z2, !Intrinsics.LJFF(str4, str3));
        if (z) {
            this.LIZ.LJJIJIIJI().u(usPopupCardVO, str, map);
        }
    }
}
