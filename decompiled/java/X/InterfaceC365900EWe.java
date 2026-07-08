package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0EWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC365900EWe {
    int LIZIZ();

    Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft);

    Object LJFF(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn);

    DraftFileRestoreResult LJI(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException);

    C554970Lpf getParams();

    int getPriority();
}
