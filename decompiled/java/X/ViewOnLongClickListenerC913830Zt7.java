package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;

/* JADX INFO: renamed from: X.0Zt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewOnLongClickListenerC913830Zt7 implements View.OnLongClickListener {
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

    public static final boolean onLongClick$0(ViewOnLongClickListenerC913830Zt7 viewOnLongClickListenerC913830Zt7, View view) {
        C1261860iwS c1261860iwS = ((C0Z7M) viewOnLongClickListenerC913830Zt7.l0).LLJJIJIIJIL;
        if (c1261860iwS != null && c1261860iwS.isInMultiSelectMode()) {
            return true;
        }
        TuxActionSheet tuxActionSheet = (TuxActionSheet) viewOnLongClickListenerC913830Zt7.l1;
        Fragment fragment = ((C0Z7M) viewOnLongClickListenerC913830Zt7.l0).LLJJI;
        if (fragment == null) {
            fragment = null;
        }
        tuxActionSheet.show(fragment.requireFragmentManager(), "MafChatListViewHolder");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onLongClick$1(X.ViewOnLongClickListenerC913830Zt7 r18, android.view.View r19) {
        /*
            r1 = r18
            java.lang.Object r6 = r1.l0
            X.0ZAc r6 = (X.C895240ZAc) r6
            boolean r0 = r6.LLJIJIL
            r7 = 1
            if (r0 == 0) goto Lc
            return r7
        Lc:
            java.lang.Object r3 = r1.l1
            X.0ZAw r3 = (X.C895440ZAw) r3
            r3.getClass()
            X.0ZAZ r0 = X.C0ZAZ.LIZ
            r0.getClass()
            boolean r5 = X.C0ZAZ.LIZIZ()
            if (r5 == 0) goto L94
            r11 = 2130774476(0x7f0109cc, float:1.7152128E38)
        L21:
            android.app.Activity r1 = r3.L5()
            if (r1 == 0) goto L32
            if (r5 == 0) goto L90
            r0 = 2131836100(0x7f113cc4, float:1.9305357E38)
        L2c:
            java.lang.String r9 = r1.getString(r0)
            if (r9 != 0) goto L34
        L32:
            java.lang.String r9 = ""
        L34:
            android.view.View r0 = r3.itemView
            android.content.Context r4 = r0.getContext()
            boolean r0 = r4 instanceof X.C19EG
            if (r0 == 0) goto L98
            X.19EG r4 = (X.C19EG) r4
            if (r4 == 0) goto L98
            com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceViewModel r0 = r3.LLJJJJ
            if (r0 == 0) goto L4f
            java.util.concurrent.ExecutorService r1 = X.C20684815ws.LJFF()
            X.0ZAa r0 = new java.lang.Runnable() { // from class: X.0ZAa
                static {
                    /*
                        X.0ZAa r0 = new X.0ZAa
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0ZAa) X.0ZAa.LL X.0ZAa
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC895220ZAa.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC895220ZAa.<init>():void");
                }

                public static void LIZ() {
                    /*
                        java.util.HashMap r2 = new java.util.HashMap
                        r2.<init>()
                        java.lang.String r1 = "enter_from"
                        java.lang.String r0 = "notification_page"
                        r2.put(r1, r0)
                        X.0ZAZ r0 = X.C0ZAZ.LIZ
                        r0.getClass()
                        boolean r0 = X.C0ZAZ.LIZIZ()
                        if (r0 == 0) goto L41
                        java.lang.String r1 = "pin"
                    L19:
                        java.lang.String r0 = "pin_status"
                        r2.put(r0, r1)
                        java.lang.String r1 = "action_type"
                        java.lang.String r0 = "long_press"
                        r2.put(r1, r0)
                        java.lang.String r1 = "cell_type"
                        java.lang.String r0 = "archive"
                        r2.put(r1, r0)
                        X.0Yvf r0 = X.C889930Yvf.LIZ
                        X.05RV r0 = r0.LIZJ()
                        java.lang.String r1 = r0.getMobValue()
                        java.lang.String r0 = "inbox_mode"
                        r2.put(r0, r1)
                        java.lang.String r0 = "inbox_message_cell_feedback"
                        X.C20684815ws.LJIILLIIL(r0, r2)
                        return
                    L41:
                        java.lang.String r1 = "unpin"
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC895220ZAa.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.String r2 = "ArchiveEntranceViewModel@d309.sendPerformLongClickEvent$1"
                        X.C1C7U.LIZ(r2)
                        LIZ()     // Catch: java.lang.Throwable -> L9
                        goto L14
                    L9:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        boolean r0 = X.C2179971ATj.LIZ(r1)
                        if (r0 != 0) goto L14
                        throw r1
                    L14:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC895220ZAa.run():void");
                }
            }
            r1.execute(r0)
        L4f:
            X.0Ys4 r0 = com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper r2 = X.C887700Ys4.LIZ()
            if (r2 == 0) goto L7e
            X.0HZb r8 = new X.0HZb
            kotlin.jvm.internal.AwS96S0210000_14 r10 = new kotlin.jvm.internal.AwS96S0210000_14
            r0 = 1
            r10.<init>(r3, r6, r5, r0)
            r12 = 0
            r13 = 0
            r19 = 952(0x3b8, float:1.334E-42)
            r14 = r12
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r0 = java.util.Collections.singletonList(r8)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            android.view.View r0 = r3.itemView
            r2.LIZ(r4, r1, r0)
        L7e:
            boolean r0 = X.C0BV3.LIZ()
            if (r0 == 0) goto L8f
            android.view.View r0 = r3.itemView
            androidx.fragment.app.Fragment r0 = X.C946803n0.LIZ(r0)
            if (r0 == 0) goto L8f
            X.C895230ZAb.LIZ(r0)
        L8f:
            return r7
        L90:
            r0 = 2131836094(0x7f113cbe, float:1.9305345E38)
            goto L2c
        L94:
            r11 = 2130774473(0x7f0109c9, float:1.7152122E38)
            goto L21
        L98:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLongClickListenerC913830Zt7.onLongClick$1(X.0Zt7, android.view.View):boolean");
    }

    public ViewOnLongClickListenerC913830Zt7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
