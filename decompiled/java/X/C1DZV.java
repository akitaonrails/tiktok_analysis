package X;

import Y.ACListenerS169S0100000_35;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DZV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZV extends C1DZX {
    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public C1DZV(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    public final void LJI(MigrateTaskStatus migrateTaskStatus) {
        boolean zIsAllDraftMigrated;
        int iMigratedDraftCount = 0;
        if (!((Boolean) this.LJFF.getValue()).booleanValue()) {
            LJFF(false);
            return;
        }
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ != null) {
            zIsAllDraftMigrated = aVDraftMigrateServiceLIZIZ.isAllDraftMigrated();
        } else {
            zIsAllDraftMigrated = false;
        }
        if (zIsAllDraftMigrated) {
            AVDraftMigrateService aVDraftMigrateServiceLIZIZ2 = LIZIZ();
            if (aVDraftMigrateServiceLIZIZ2 != null) {
                iMigratedDraftCount = aVDraftMigrateServiceLIZIZ2.migratedDraftCount();
            }
            LJII(iMigratedDraftCount);
            LJFF(true);
            return;
        }
        if (!(migrateTaskStatus instanceof MigrateTaskStatus.Completed)) {
            LJFF(false);
            return;
        }
        if (!((MigrateTaskStatus.Completed) migrateTaskStatus).getResult().isSuccess()) {
            LJFF(false);
            return;
        }
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ3 = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ3 != null) {
            iMigratedDraftCount = aVDraftMigrateServiceLIZIZ3.migratedDraftCount();
        }
        LJII(iMigratedDraftCount);
        LJFF(true);
    }

    public final void LJII(int i) {
        TextView textView;
        TextView textView2;
        View view = this.LJI;
        if (view != null && (textView2 = (TextView) view.findViewById(R.id.title)) != null) {
            textView2.setText(textView2.getContext().getResources().getQuantityString(2131755403, i, LIZJ()));
        }
        View view2 = this.LJI;
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.desc)) != null) {
            textView.setText(textView.getContext().getResources().getQuantityString(2131755402, i, LIZJ(), LIZJ()));
        }
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        boolean zIsAllDraftMigrated;
        this.LJI = view;
        if (view == null) {
            return;
        }
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ != null) {
            zIsAllDraftMigrated = aVDraftMigrateServiceLIZIZ.isAllDraftMigrated();
        } else {
            zIsAllDraftMigrated = false;
        }
        if (zIsAllDraftMigrated) {
            LJFF(true);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.och);
        if (c197039127h != null) {
            c197039127h.setText(c197039127h.getContext().getResources().getString(2131836955, LIZJ()));
            C786410Ut5.U8(c197039127h, new ACListenerS169S0100000_35(this, 0));
        }
    }
}
