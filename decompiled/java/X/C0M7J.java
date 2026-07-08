package X;

import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftCommonResult;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M7J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7J extends C0M6M {
    public static final /* synthetic */ int LLJ = 0;
    public final C19EG LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    public final void L5() {
        MigrateDraftCommonResult next;
        long totalFailedMigrateSpaceSize;
        AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) this.LLIZLLLIL.getValue();
        MigrateTaskStatus migrateTaskStatusCurrentMigrateFlowStatus = aVDraftMigrateService != null ? aVDraftMigrateService.currentMigrateFlowStatus() : null;
        if (!(migrateTaskStatusCurrentMigrateFlowStatus instanceof MigrateTaskStatus.Completed)) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LLILZ.getLifecycle()), C0PEM.LIZJ, null, new C0CRX(this, null), 2);
            return;
        }
        MigrateTaskStatus.Completed completed = (MigrateTaskStatus.Completed) migrateTaskStatusCurrentMigrateFlowStatus;
        Iterator<MigrateDraftCommonResult> it2 = completed.getResult().errorList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getErrorCode() != 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MigrateDraftCommonResult migrateDraftCommonResult = next;
        switch (migrateDraftCommonResult != null ? migrateDraftCommonResult.getErrorCode() : completed.getResult().errorCode) {
            case 300001:
            case 400003:
                AVDraftMigrateService aVDraftMigrateServiceI5 = I5();
                if (aVDraftMigrateServiceI5 != null) {
                    List<MigrateDraftCommonResult> list = completed.getResult().errorList;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<MigrateDraftCommonResult> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().getCreationId());
                    }
                    totalFailedMigrateSpaceSize = aVDraftMigrateServiceI5.getTotalFailedMigrateSpaceSize(arrayList);
                } else {
                    totalFailedMigrateSpaceSize = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("M2MigrationNoDraftViewHolder, showMigrateFailedWithSpace, failed size: ");
                sbLIZ.append(totalFailedMigrateSpaceSize);
                C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                if (totalFailedMigrateSpaceSize > 0) {
                    C19EG c19eg = this.LLILZ;
                    PopupManager.LJIIZILJ(new C565760MGw(c19eg, c19eg.getString(2131836964), this.LLILZ.getString(2131836963, Double.valueOf(totalFailedMigrateSpaceSize / 1048576.0d)), "storage_popup"), new C1668306g5("creative_draft_m2_migration_failure"));
                }
                break;
            case 300005:
            case 300007:
                C19EG c19eg2 = this.LLILZ;
                PopupManager.LJIIZILJ(new C565760MGw(c19eg2, c19eg2.getString(2131836966), this.LLILZ.getString(2131836965), null), new C1668306g5("creative_draft_m2_migration_failure"));
                break;
            default:
                C19EG c19eg3 = this.LLILZ;
                PopupManager.LJIIZILJ(new C565760MGw(c19eg3, c19eg3.getString(2131836962), this.LLILZ.getString(2131836961), "draft_box_cover"), new C1668306g5("creative_draft_m2_migration_failure"));
                break;
        }
    }

    public C0M7J(View view, C19EG c19eg) {
        super(view, c19eg);
        this.LLILZ = c19eg;
        this.LLIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(464));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(463));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.M2DraftMigrationViewHolder
    public final void bind(C553680Lna c553680Lna, int i) {
        int iDraftMigrateUnMigrateCount;
        String m2AppName;
        AVDraftMigrateService aVDraftMigrateServiceI5 = I5();
        if (aVDraftMigrateServiceI5 != null) {
            iDraftMigrateUnMigrateCount = aVDraftMigrateServiceI5.draftMigrateUnMigrateCount();
        } else {
            iDraftMigrateUnMigrateCount = 0;
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            Resources resources = tuxTextView.getContext().getResources();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(iDraftMigrateUnMigrateCount);
            AVDraftMigrateService aVDraftMigrateService = (AVDraftMigrateService) this.LLIZLLLIL.getValue();
            if (aVDraftMigrateService != null) {
                m2AppName = aVDraftMigrateService.getM2AppName();
            } else {
                m2AppName = null;
            }
            objArr[1] = m2AppName;
            tuxTextView.setText(resources.getQuantityString(2131755409, iDraftMigrateUnMigrateCount, objArr));
        }
    }
}
