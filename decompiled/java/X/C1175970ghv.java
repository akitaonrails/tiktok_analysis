package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0ghv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175970ghv {
    public static final C13IQ<? extends SlashCell<?>> LIZIZ(SlashCellModel slashCellModel) {
        boolean z;
        String str = slashCellModel.cellId;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        InterfaceC1175990ghx interfaceC1175990ghx = C1180170goh.LIZJ.get(slashCellModel.cellId);
        if (interfaceC1175990ghx == null) {
            return null;
        }
        return interfaceC1175990ghx.LIZIZ();
    }

    public static final String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slash_cell_data_key_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZLLL(UISlotAssem uISlotAssem, ViewGroup viewGroup) {
        Object tag;
        C13IQ c13iq;
        String str;
        if (viewGroup != null) {
            tag = viewGroup.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof C13IQ) {
            c13iq = (C13IQ) tag;
        } else {
            c13iq = null;
        }
        if (c13iq != null) {
            Object tag2 = viewGroup.getTag(R.id.b9w);
            if (tag2 instanceof String) {
                str = (String) tag2;
            } else {
                str = null;
            }
            C1180170goh.LIZLLL().LIZ(new AwS151S1100000_2(str, c13iq, 18));
            C723850SaN.LJII(uISlotAssem, c13iq, str);
        }
        C1180170goh.LIZLLL().LIZ(new AwS546S0100000_2(viewGroup, 970));
        if (viewGroup != null) {
            viewGroup.setTag(null);
            viewGroup.setTag(R.id.b9w, null);
            viewGroup.setTag(R.id.b9t, null);
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.bytedance.assem.arch.view.UISlotAssem r22, java.util.List<com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel> r23, android.view.ViewGroup r24) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1175970ghv.LIZ(com.bytedance.assem.arch.view.UISlotAssem, java.util.List, android.view.ViewGroup):void");
    }
}
