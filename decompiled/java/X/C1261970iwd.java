package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.EntryAreaCell;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0iwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261970iwd extends AbstractC2211791BhR {
    public Function0<String> LJFF;
    public final C1261950iwb LJIIIIZZ;
    public final int LJ = AbstractC19994813Le.Default.nextInt();
    public final float LJI = 0.5f;
    public final boolean LJII = true;

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return 0;
    }

    @Override // X.AbstractC2211791BhR
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        return this.LJFF;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2211791BhR
    public final boolean LJIIIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC2211791BhR
    public final float LJIIL() {
        return this.LJI;
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        this.LJFF = function0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0iwb] */
    public C1261970iwd(final EnumC1261960iwc enumC1261960iwc, final EntryAreaCell entryAreaCell) {
        this.LJFF = new AwS420S0200000_19(entryAreaCell, this, 191);
        this.LJIIIIZZ = new InterfaceC2211931Bhf() { // from class: X.0iwb
            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                int iIntValue;
                C1261940iwa c1261940iwa = C1261940iwa.LIZ;
                EnumC1261960iwc enumC1261960iwc2 = enumC1261960iwc;
                c1261940iwa.getClass();
                if (!C1261940iwa.LIZJ(enumC1261960iwc2)) {
                    EnumC1261960iwc enumC1261960iwc3 = enumC1261960iwc;
                    Keva kevaLIZIZ = C1261940iwa.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("exposeTime");
                    sbLIZ.append(enumC1261960iwc3);
                    int i = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                    Integer num = (Integer) C1263590izF.LJ.getValue();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    if (i >= iIntValue - 1) {
                        C1261940iwa.LJFF(enumC1261960iwc3);
                    } else if (!C1261940iwa.LIZ(enumC1261960iwc3)) {
                        Keva kevaLIZIZ2 = C1261940iwa.LIZIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("exposeTime");
                        sbLIZ2.append(enumC1261960iwc3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        Keva kevaLIZIZ3 = C1261940iwa.LIZIZ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("exposeTime");
                        sbLIZ3.append(enumC1261960iwc3);
                        kevaLIZIZ2.storeInt(strLIZIZ, kevaLIZIZ3.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0) + 1);
                        Set<String> set = C1261940iwa.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(enumC1261960iwc3);
                        sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        ((HashSet) set).add(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                entryAreaCell.U5("ffp_aggregate_entrance_show");
            }
        };
    }
}
