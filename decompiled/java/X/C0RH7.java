package X;

import com.ss.android.ugc.aweme.ui.feed.collection.PhotoModeVHAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;

/* JADX INFO: renamed from: X.0RH7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RH7 {
    public static final C696330RTb LIZ(BaseCellLogicComponent baseCellLogicComponent, InterfaceC696720RUo interfaceC696720RUo) {
        if (interfaceC696720RUo.le()) {
            PhotoModeVHAbility photoModeVHAbility = (PhotoModeVHAbility) C1558520qew.LIZ(C1558520qew.LJIIL(baseCellLogicComponent), PhotoModeVHAbility.class, null);
            if (photoModeVHAbility == null) {
                return null;
            }
            return photoModeVHAbility.P02();
        }
        return (C696330RTb) new C1559260qg8(new C723580SZw(baseCellLogicComponent, C696330RTb.class, null), baseCellLogicComponent.checkSupervisorPrepared()).getValue();
    }
}
