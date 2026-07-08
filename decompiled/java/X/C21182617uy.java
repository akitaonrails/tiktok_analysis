package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21182617uy {
    public final /* synthetic */ AbstractC21194217wq LIZ;

    public C21182617uy(AbstractC21194217wq abstractC21194217wq) {
        this.LIZ = abstractC21194217wq;
    }

    public final void LIZ(PopupCardVO popupCardVO, boolean z, String str, String str2) {
        String idStr;
        if (!C292450BdD.LIZ()) {
            if (popupCardVO.flashSaleAtmosphereInfo != null) {
                C598800NeA c598800NeA = this.LIZ.LLLIL;
                c598800NeA.getClass();
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("stop refresh");
                c598800NeA.LIZLLL = false;
                return;
            }
            this.LIZ.LLLIL.LJ();
        }
        String strValueOf = String.valueOf(popupCardVO.productId);
        Room room = this.LIZ.LLJILLL;
        String str3 = null;
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        AbstractC21194217wq abstractC21194217wq = this.LIZ;
        boolean z2 = abstractC21194217wq.LLLII;
        String str4 = popupCardVO.formatAvailablePrice;
        PopupCardVO popupCardVO2 = abstractC21194217wq.LJJIJIIJI().LL;
        if (popupCardVO2 != null) {
            str3 = popupCardVO2.formatAvailablePrice;
        }
        C21198417xW.LJFF(strValueOf, idStr, str, str2, z2, !Intrinsics.LJFF(str4, str3));
        if (z) {
            this.LIZ.LJJIJIIJI().LJJLIIIJLJLI(popupCardVO, str);
        }
    }
}
