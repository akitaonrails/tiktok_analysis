package X;

import Y.ARunnableS71S0200000_2;
import Y.ARunnableS77S0200000_8;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;

/* JADX INFO: renamed from: X.0M6J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M6J extends C0M6M {
    public static final /* synthetic */ int LLJI = 0;
    public SafeHandler LLILZ;
    public SmartImageView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService r0 = r4.I5()
            r3 = 0
            if (r0 == 0) goto L27
            boolean r1 = r0.isM2MigrateProfileHoverClicked()
            r0 = 1
            if (r1 != r0) goto L27
        Le:
            r2 = 2131375838(0x7f0a36de, float:1.8371835E38)
            r1 = 4
            if (r0 == 0) goto L29
            android.view.View r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L1b
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L1b:
            android.view.View r0 = r4.itemView
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L26
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L26:
            return
        L27:
            r0 = 0
            goto Le
        L29:
            android.view.View r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L33
            if (r5 == 0) goto L42
            r0 = 0
        L30:
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L33:
            android.view.View r0 = r4.itemView
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L41
            if (r5 != 0) goto L3e
            r3 = 4
        L3e:
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L41:
            return
        L42:
            r0 = 4
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M6J.N5(boolean):void");
    }

    public C0M6J(View view, C19EG c19eg) {
        super(view, c19eg);
    }

    public final void L5(Bitmap bitmap, SmartImageView smartImageView) {
        SafeHandler safeHandler;
        ARunnableS71S0200000_2 aRunnableS71S0200000_2 = new ARunnableS71S0200000_2(smartImageView, bitmap, 19);
        IAVDraftService iAVDraftService = IAVDraftService.Companion.get();
        if (iAVDraftService != null && iAVDraftService.enableDraftEntranceShowOpt() && (safeHandler = this.LLILZ) != null) {
            safeHandler.post(aRunnableS71S0200000_2);
        } else {
            aRunnableS71S0200000_2.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.M2DraftMigrationViewHolder
    public final void bind(C553680Lna c553680Lna, int i) {
        if (c553680Lna == null) {
            return;
        }
        C810560Vqw.LIZJ(new ARunnableS77S0200000_8(this, c553680Lna, i, 32));
    }
}
