package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ogc.sport.anchor.ISportAnchorBusinessService;
import com.ss.android.ugc.aweme.ogc.sport.anchor.SportAnchorServiceImpl;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067160dsQ extends AbstractC1066890drz {
    public String LLJ = "";

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 798);
        return new C1400390mXt(awS560S0100000_16, awS560S0100000_16, awS560S0100000_16, new AwS560S0100000_16(this, 799), null, 16);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067160dsQ();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_SPORT.getTYPE();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[PHI: r5
      0x004e: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:18:0x004c, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r5 r9 r11 r13
      0x0062: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:18:0x004c, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r9v3 java.util.ArrayList) = (r9v1 java.util.ArrayList), (r9v4 java.util.ArrayList) binds: [B:18:0x004c, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r11v4 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:18:0x004c, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r13v4 int) = (r13v0 int), (r13v5 int) binds: [B:18:0x004c, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.C2344009Gk r23) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067160dsQ.LJJIJIIJI(X.09Gk):void");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String requestId;
        ISportAnchorBusinessService iSportAnchorBusinessServiceLIZJ = SportAnchorServiceImpl.LIZJ();
        if (iSportAnchorBusinessServiceLIZJ != null) {
            Activity activityLJIILJJIL = LJIILJJIL();
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            String strLJIJJLI = LJIJJLI();
            Aweme awemeLJIIZILJ = LJIIZILJ();
            if (awemeLJIIZILJ == null || (requestId = awemeLJIIZILJ.getRequestId()) == null) {
                requestId = "";
            }
            LJJIJIIJI(c2344009Gk);
            iSportAnchorBusinessServiceLIZJ.LJIIIZ(activityLJIILJJIL, anchorCommonStruct, strLJIJJLI, requestId, c2344009Gk, this.LLJ);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        String extra;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
            this.LLJ = anchorCommonStruct.getExtra();
        }
        ISportAnchorBusinessService iSportAnchorBusinessServiceLIZJ = SportAnchorServiceImpl.LIZJ();
        if (iSportAnchorBusinessServiceLIZJ != null) {
            iSportAnchorBusinessServiceLIZJ.LJII(anchorCommonStruct);
        }
    }
}
