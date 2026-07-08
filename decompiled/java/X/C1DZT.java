package X;

import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DZT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZT extends C1DZX {
    public ProgressBar LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public C1DZT(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    public final void LJI(MigrateTaskStatus migrateTaskStatus) {
        if (!((Boolean) this.LJ.getValue()).booleanValue()) {
            LJFF(false);
            return;
        }
        if (!(migrateTaskStatus instanceof MigrateTaskStatus.Progress)) {
            LJFF(false);
            return;
        }
        LJFF(true);
        TuxTextView tuxTextView = this.LJIIIIZZ;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            MigrateTaskStatus.Progress progress = (MigrateTaskStatus.Progress) migrateTaskStatus;
            sbLIZ.append(progress.getCurrentIndex());
            sbLIZ.append('/');
            sbLIZ.append(progress.getTotalSize());
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProgressBar progressBar = this.LJII;
        if (progressBar != null) {
            MigrateTaskStatus.Progress progress2 = (MigrateTaskStatus.Progress) migrateTaskStatus;
            progressBar.setProgress((progress2.getCurrentIndex() * 100) / progress2.getTotalSize());
        }
        TuxTextView tuxTextView2 = this.LJIIIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(tuxTextView2.getContext().getResources().getQuantityString(2131755411, ((MigrateTaskStatus.Progress) migrateTaskStatus).getTotalSize(), LIZJ()));
        }
        TuxTextView tuxTextView3 = this.LJIIJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(tuxTextView3.getContext().getResources().getString(2131836967, LIZJ()));
        }
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        this.LJI = view;
        if (view == null) {
            return;
        }
        this.LJII = (ProgressBar) view.findViewById(R.id.s8j);
        this.LJIIIIZZ = (TuxTextView) view.findViewById(R.id.s9w);
        this.LJIIIZ = (TuxTextView) view.findViewById(R.id.title);
        this.LJIIJ = (TuxTextView) view.findViewById(R.id.desc);
    }
}
