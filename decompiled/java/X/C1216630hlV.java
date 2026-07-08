package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0hlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216630hlV extends C09AY implements InterfaceC1631630sYr<UIAssem, Boolean, Boolean, Boolean, Unit> {
    public C1216630hlV() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, Boolean bool, Boolean bool2, Boolean bool3) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        View viewFindViewById = uIAssem.LJJIJL().findViewById(EnumC1216690hlb.JOIN.getId());
        int i = 0;
        if (!zBooleanValue && !zBooleanValue2 && !zBooleanValue3) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }
}
