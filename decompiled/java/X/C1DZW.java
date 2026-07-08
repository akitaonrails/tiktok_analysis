package X;

import Y.ACListenerS169S0100000_35;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS100S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DZW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZW extends C1DZX {
    public TuxTextView LJII;
    public TuxTextView LJIIIIZZ;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LJII() {
        int iHasDraftMigrateFailedCount;
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ == null || (iHasDraftMigrateFailedCount = aVDraftMigrateServiceLIZIZ.hasDraftMigrateFailedCount()) == 0) {
            LJFF(false);
            return;
        }
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(2131755405, iHasDraftMigrateFailedCount, Integer.valueOf(iHasDraftMigrateFailedCount)));
        }
        TuxTextView tuxTextView2 = this.LJIIIIZZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(tuxTextView2.getContext().getResources().getQuantityString(2131755404, iHasDraftMigrateFailedCount));
        }
    }

    public C1DZW(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    public final void LJI(MigrateTaskStatus migrateTaskStatus) {
        String currentUserID;
        if (!((Boolean) this.LJ.getValue()).booleanValue()) {
            LJFF(false);
            return;
        }
        if (migrateTaskStatus instanceof MigrateTaskStatus.Progress) {
            LJFF(false);
            return;
        }
        if (migrateTaskStatus instanceof MigrateTaskStatus.Completed) {
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null) {
                currentUserID = iUserService.getCurrentUserID();
            } else {
                currentUserID = null;
            }
            MigrateTaskStatus.Completed completed = (MigrateTaskStatus.Completed) migrateTaskStatus;
            if (!Intrinsics.LJFF(currentUserID, completed.getResult().uid)) {
                LJFF(false);
                return;
            } else if (completed.getResult().isSuccess()) {
                LJFF(false);
                return;
            }
        }
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ != null && aVDraftMigrateServiceLIZIZ.hasDraftMigrateFailedCount() != 0) {
            LJFF(true);
            LJII();
        } else {
            LJFF(false);
        }
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        this.LJI = view;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.title);
        AVDraftMigrateService aVDraftMigrateServiceLIZIZ = LIZIZ();
        if (aVDraftMigrateServiceLIZIZ != null && aVDraftMigrateServiceLIZIZ.isDraftMigrateNotStarted()) {
            LJFF(true);
        }
        C786410Ut5.I7(new AkS100S0100000_35(this, 0), view.findViewById(R.id.och));
        this.LJII = (TuxTextView) view.findViewById(R.id.title);
        this.LJIIIIZZ = (TuxTextView) view.findViewById(R.id.desc);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.och);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS169S0100000_35(this, 2));
        }
        LJII();
    }
}
