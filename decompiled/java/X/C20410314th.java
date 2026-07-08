package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookFeedbackDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20410314th extends C09AY implements Function0<C20410214tg> {
    public final /* synthetic */ PlaybookFeedbackDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20410314th(PlaybookFeedbackDialog playbookFeedbackDialog) {
        super(0);
        this.LL = playbookFeedbackDialog;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14tg] */
    @Override // kotlin.jvm.functions.Function0
    public final C20410214tg invoke() {
        final PlaybookFeedbackDialog playbookFeedbackDialog = this.LL;
        return new TextWatcher() { // from class: X.14tg
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                playbookFeedbackDialog.FS(editable);
            }
        };
    }
}
