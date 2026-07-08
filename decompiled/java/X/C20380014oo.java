package X;

import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20380014oo extends C2217421BqW implements Function0<Unit> {
    public C20380014oo(Object obj) {
        super(0, obj, PlaybookEditorDialog.class, "closeSelf", "closeSelf()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((LiveSheetFragment) this.receiver).close(1);
        return Unit.LIZ;
    }
}
