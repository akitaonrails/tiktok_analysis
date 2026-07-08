package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814260xJQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814260xJQ(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(0);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Dialog dialog = (Dialog) this.LL.LLJIJIL.getValue();
        if (dialog != null) {
            C0FNV.LIZJ(dialog);
        }
        return Unit.LIZ;
    }
}
