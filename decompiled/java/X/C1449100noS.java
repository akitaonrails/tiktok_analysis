package X;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: renamed from: X.0noS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449100noS implements InterfaceC1625220sOW {
    @Override // X.InterfaceC1625220sOW
    public final void LIZ(Effect effect, boolean z, String str, String str2, int i, Bundle bundle, PropFromGroupModel propFromGroupModel) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZIZ(String str, boolean z) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZLLL(Effect effect, String str, Bundle bundle, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJ(int i, long j) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJFF(Effect effect, int i, String str, String str2, Bundle bundle) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJI(Effect effect, boolean z, String str, Map<String, String> map) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIL(long j, String str) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILIIL(Effect effect, int i, String str, String str2, long j, Bundle bundle) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, LinearLayoutManager linearLayoutManager) {
    }

    @Override // X.InterfaceC1625220sOW
    public final InterfaceC1623120sL8 LJIIIZ() {
        return C1449070noP.LIZ;
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJII(int i, Bundle bundle, PropFromGroupModel propFromGroupModel, Effect effect, String str, String str2, String str3, String str4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobPropShow,is delegate null:");
        sbLIZ.append(true);
        sbLIZ.append(",effect_id:");
        sbLIZ.append(effect.getEffectId());
        sbLIZ.append(",tabName:");
        sbLIZ.append(str);
        sbLIZ.append(",position:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJ(Effect effect, boolean z, String str, String str2, String str3, int i, boolean z2, Bundle bundle, PropFromGroupModel propFromGroupModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobPropClick,is delegate null:");
        sbLIZ.append(true);
        sbLIZ.append(",effect_id:");
        sbLIZ.append(effect.getEffectId());
        sbLIZ.append(",tabName:");
        sbLIZ.append(str);
        sbLIZ.append(",position:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
