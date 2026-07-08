package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11F2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C11F2 extends C2217421BqW implements InterfaceC1631620sYq<Integer, Boolean, Integer, Unit> {
    public C11F2(PlaybookEditorDialog playbookEditorDialog) {
        super(3, playbookEditorDialog, PlaybookEditorDialog.class, "onFocusChange", "onFocusChange(IZLjava/lang/Integer;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Integer r6, java.lang.Boolean r7, java.lang.Integer r8) {
        /*
            r5 = this;
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r3 = r5.receiver
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog r3 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog) r3
            r3.getClass()
            if (r0 == 0) goto L51
            if (r8 == 0) goto L2b
            r8.intValue()
            androidx.recyclerview.widget.LinearLayoutManager r1 = r3.LLLII
            if (r1 == 0) goto L2b
            int r0 = r8.intValue()
            r1.scrollToPositionWithOffset(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L51
        L2b:
            androidx.recyclerview.widget.RecyclerView r0 = r3.LLLI
            if (r0 == 0) goto L5c
            int r2 = r0.getHeight()
        L33:
            androidx.recyclerview.widget.RecyclerView r0 = r3.LLLI
            if (r0 == 0) goto L54
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r4)
            if (r0 == 0) goto L54
            android.view.View r0 = r0.itemView
            if (r0 == 0) goto L54
            int r1 = r0.getHeight()
            if (r1 <= 0) goto L54
            if (r2 <= 0) goto L54
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.LLLII
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r0.scrollToPositionWithOffset(r4, r2)
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L54:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.LLLII
            if (r0 == 0) goto L51
            r0.scrollToPosition(r4)
            goto L51
        L5c:
            r2 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11F2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
