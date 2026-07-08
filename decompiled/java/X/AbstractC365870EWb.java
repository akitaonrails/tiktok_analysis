package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0EWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC365870EWb implements InterfaceC365900EWe {
    public abstract boolean LIZ();

    public abstract Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn);

    @Override // X.InterfaceC365900EWe
    public Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC365900EWe
    public final Object LJFF(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        boolean zLIZIZ;
        if (LIZ()) {
            getParams().LIZ.get();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                final String str = "";
                return C1697810uHb.LJ(C365890EWd.LIZ(this, C2286608xc.LJ(2131832448), true, new DraftFileRestoreException(-3004, new RuntimeException(str) { // from class: X.0EWc
                    public static final int $stable = 8;
                }, "BaseFile")));
            }
        }
        return LJII(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC365900EWe
    public DraftFileRestoreResult LJI(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C365890EWd.LIZ(this, num, z, draftFileRestoreException);
    }
}
