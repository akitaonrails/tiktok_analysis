package X;

import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;

/* JADX INFO: renamed from: X.0MqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewOnLongClickListenerC580880MqM implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC580880MqM viewOnLongClickListenerC580880MqM, View view) {
        DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder = (DraftBoxTaskItemViewHolder) viewOnLongClickListenerC580880MqM.l0;
        draftBoxTaskItemViewHolder.z6(draftBoxTaskItemViewHolder.getItemView(), (C0M0P) viewOnLongClickListenerC580880MqM.l1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onLongClick$1(X.ViewOnLongClickListenerC580880MqM r5, android.view.View r6) {
        /*
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder r4 = (com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder) r4
            java.lang.Object r3 = r5.l1
            X.0M0P r3 = (X.C0M0P) r3
            android.view.View r5 = r4.getItemView()
            X.01GW r0 = r4.LLJZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L29
            X.01GW r0 = r4.LLJZIJLIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L46
        L29:
            X.01GW r0 = r4.LLJLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService r0 = (com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService) r0
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus r1 = r0.currentMigrateFlowStatus()
        L37:
            com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus$Started r0 = com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus.Started.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L43
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus.Progress
            if (r0 == 0) goto L46
        L43:
            return r2
        L44:
            r1 = 0
            goto L37
        L46:
            X.0nef r1 = X.C1443030nef.LJII()
            android.content.Context r0 = r5.getContext()
            r1.getClass()
            boolean r0 = X.C1443030nef.LJI(r0)
            if (r0 == 0) goto L43
            boolean r0 = r3.LIZIZ
            if (r0 != 0) goto L6d
            X.0M2k r0 = r4.T5()
            if (r0 == 0) goto L64
            r0.v1()
        L64:
            X.0M2k r0 = r4.T5()
            if (r0 == 0) goto L6d
            r0.l(r3)
        L6d:
            X.0HZQ r0 = r4.N5()
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L43
            X.0HZQ r1 = r4.N5()
            boolean r0 = r3.LJIIJJI
            r0 = r0 ^ 1
            r1.setChecked(r0)
            X.0M2k r1 = r4.T5()
            if (r1 == 0) goto L43
            r4.N5()
            X.0HZQ r0 = r4.N5()
            boolean r0 = r0.isChecked()
            r1.v3(r3, r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLongClickListenerC580880MqM.onLongClick$1(X.0MqM, android.view.View):boolean");
    }

    public ViewOnLongClickListenerC580880MqM(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
