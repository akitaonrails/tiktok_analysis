package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20369914nB extends C2217421BqW implements Function0<Boolean> {
    public C20369914nB(PlaybookEditorDialog playbookEditorDialog) {
        super(0, playbookEditorDialog, PlaybookEditorDialog.class, "isAIGenerate", "isAIGenerate()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((PlaybookEditorDialog) this.receiver).ES());
    }
}
