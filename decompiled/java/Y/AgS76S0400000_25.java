package Y;

import X.C013C;
import X.C05P0;
import X.C0M8W;
import X.C13LP;
import X.C1686970u07;
import X.C1690050u55;
import X.C1691920u86;
import X.C1691930u87;
import X.C1691940u88;
import X.C1692080u8M;
import X.C1692140u8S;
import X.C1695020uD6;
import X.EnumC1679580toC;
import X.EnumC860460XpE;
import X.InterfaceC1364105Vn;
import X.InterfaceC1665500tRU;
import X.InterfaceC1679450tnz;
import X.InterfaceC1685080tx4;
import X.InterfaceC1686540tzQ;
import X.InterfaceC1692600u9C;
import X.InterfaceC346701Wf;
import ayh.i5;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.utils.oh;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AgS76S0400000_25 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS76S0400000_25 agS76S0400000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue && ((Boolean) ((C05P0) agS76S0400000_25.l2).getValue()).booleanValue()) {
            ((C05P0) agS76S0400000_25.l2).setValue(Boolean.FALSE);
        }
        if (((SocialMediaPickerViewModel) agS76S0400000_25.l0).LLJJL != null) {
            if (zBooleanValue) {
                oh.LIZJ("social_creation_album", i5.LIZIZ(), i5.LIZ(), null, EnumC860460XpE.SCROLL);
            } else {
                oh.LJ("social_creation_album");
            }
        }
        List<InterfaceC1685080tx4> listLJII = ((C1690050u55) agS76S0400000_25.l1).LJIIIZ().LJII();
        InterfaceC1665500tRU interfaceC1665500tRU = (InterfaceC1665500tRU) agS76S0400000_25.l3;
        SocialMediaPickerViewModel socialMediaPickerViewModel = (SocialMediaPickerViewModel) agS76S0400000_25.l0;
        Iterator<InterfaceC1685080tx4> it2 = listLJII.iterator();
        while (it2.hasNext()) {
            SocMediaResource socMediaResource = (SocMediaResource) C13LP.LJJJLZIJ(it2.next().getIndex(), interfaceC1665500tRU);
            if (socMediaResource != null) {
                socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(new C0M8W(socMediaResource));
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS76S0400000_25 agS76S0400000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C013C c013c = (C013C) agS76S0400000_25.l0;
        if (!c013c.element && iIntValue <= 0) {
            c013c.element = true;
            InterfaceC1679450tnz interfaceC1679450tnz = (InterfaceC1679450tnz) agS76S0400000_25.l1;
            if (interfaceC1679450tnz != null) {
                interfaceC1679450tnz.hide();
            }
            ((InterfaceC1686540tzQ) agS76S0400000_25.l2).LJIJJ(false);
        }
        if (((C013C) agS76S0400000_25.l0).element && iIntValue2 <= 0) {
            ((Function1) agS76S0400000_25.l3).invoke(EnumC1679580toC.TEXT);
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS76S0400000_25 agS76S0400000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue() && ((C1691930u87) agS76S0400000_25.l0).LIZIZ()) {
            C1692080u8M c1692080u8M = (C1692080u8M) agS76S0400000_25.l1;
            C1691930u87 c1691930u87 = (C1691930u87) agS76S0400000_25.l0;
            C1686970u07 c1686970u07LJIIL = ((C1692140u8S) agS76S0400000_25.l2).LJIIL();
            C1695020uD6 c1695020uD6 = (C1695020uD6) agS76S0400000_25.l3;
            InterfaceC1692600u9C interfaceC1692600u9C = ((C1692140u8S) agS76S0400000_25.l2).LIZIZ;
            c1691930u87.LJ = C1691940u88.LIZLLL(c1692080u8M, c1686970u07LJIIL, c1691930u87.LIZLLL, c1695020uD6, c1691930u87.LJIJJLI, c1691930u87.LJIL);
            C1691920u86.LJFF(c1691930u87, c1686970u07LJIIL, interfaceC1692600u9C);
        } else {
            C1691920u86.LJ((C1691930u87) agS76S0400000_25.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS76S0400000_25(Object obj, SocialMediaPickerViewModel socialMediaPickerViewModel, C1690050u55 c1690050u55, C05P0<Boolean> c05p0, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU) {
        this.$t = interfaceC1665500tRU;
        this.l0 = obj;
        this.l1 = socialMediaPickerViewModel;
        this.l2 = c1690050u55;
        this.l3 = c05p0;
    }
}
