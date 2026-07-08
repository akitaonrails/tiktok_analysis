package X;

import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS143S0201000_19;

/* JADX INFO: renamed from: X.0iwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261710iwD extends AbstractC2211791BhR {
    public final float LJ;
    public Function0<String> LJI;
    public final C1261700iwC LJII;
    public final int LJFF = 500;
    public final C1261720iwE LJIIIIZZ = new InterfaceC2211921Bhe() { // from class: X.0iwE
        @Override // X.InterfaceC2211921Bhe
        public final void LIZ(long j) {
        }
    };

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        return this.LJI;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211921Bhe LJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        return this.LJII;
    }

    @Override // X.AbstractC2211791BhR
    public final float LJIIL() {
        return this.LJ;
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        this.LJI = function0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0iwC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0iwE] */
    public C1261710iwD(final BasePowerCell<InterfaceC1891350zJl> basePowerCell, C1261270ivV c1261270ivV, int i) {
        this.LJ = basePowerCell.L5().LIZ;
        this.LJI = new AwS143S0201000_19((BasePowerCell) basePowerCell, (BasePowerCell<InterfaceC1891350zJl>) c1261270ivV, (C1261270ivV) i, 8);
        this.LJII = new InterfaceC2211931Bhf() { // from class: X.0iwC
            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                InterfaceC1262230ix3 interfaceC1262230ix3LIZIZ;
                C1261860iwS c1261860iwS;
                String nickname;
                AbstractC1261840iwQ abstractC1261840iwQ;
                InterfaceC1891350zJl item = basePowerCell.getItem();
                if (item != null) {
                    BasePowerCell<InterfaceC1891350zJl> basePowerCell2 = basePowerCell;
                    C1261710iwD c1261710iwD = this;
                    InterfaceC1891350zJl item2 = basePowerCell2.getItem();
                    String strItemUniqueId = null;
                    if ((item2 instanceof AbstractC1261840iwQ) && (abstractC1261840iwQ = (AbstractC1261840iwQ) item2) != null) {
                        interfaceC1262230ix3LIZIZ = abstractC1261840iwQ.LIZIZ();
                    } else {
                        interfaceC1262230ix3LIZIZ = null;
                    }
                    if (interfaceC1262230ix3LIZIZ instanceof C1261860iwS) {
                        c1261860iwS = (C1261860iwS) interfaceC1262230ix3LIZIZ;
                    } else {
                        c1261860iwS = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onExpose, ");
                    if (c1261860iwS != null) {
                        nickname = c1261860iwS.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    sbLIZ.append(", itemUniqueId = ");
                    if (c1261860iwS != null) {
                        strItemUniqueId = c1261860iwS.itemUniqueId();
                    }
                    sbLIZ.append(strItemUniqueId);
                    sbLIZ.append(", itemViewId = ");
                    sbLIZ.append(c1261710iwD.LJI.invoke());
                    C2188811AlT.LIZIZ(sbLIZ);
                    basePowerCell2.R5(basePowerCell2.N5(), item, true);
                }
            }
        };
    }
}
