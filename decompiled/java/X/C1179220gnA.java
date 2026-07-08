package X;

import com.ss.android.ugc.aweme.slash.cell.arc.ComposeConfig;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponent;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentCell;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import java.util.List;
import kotlin.jvm.internal.AwS60S0001000_18;

/* JADX INFO: renamed from: X.0gnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179220gnA implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
    public static final C1176010ghz LIZ = new C1176010ghz();

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1181600gr0
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(SlashComposeComponent.class);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<?> LIZIZ() {
        return new C1208890hZ1(17);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1180920gpu c1180920gpu) {
        int iLIZ = C1176010ghz.LIZ(LIZ, c1180920gpu.LIZ);
        C1180170goh.LIZLLL().LIZ(new AwS60S0001000_18(iLIZ, 4));
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(iLIZ, SlashComposeComponentCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        ComposeConfig composeConfig;
        List<SlashCellModel> list;
        if (!(baseComponentData instanceof SlashComposeComponentModel) || (composeConfig = ((SlashComposeComponentModel) baseComponentData).composeConfig) == null || (list = composeConfig.cells) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }
}
