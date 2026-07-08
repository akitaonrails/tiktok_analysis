package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewJoinButtonState;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS686S0100000_2;

/* JADX INFO: renamed from: X.06mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1706506mF extends ConstraintLayout {
    public final C01GW LL;

    private final C197039127h getJoinButton() {
        return (C197039127h) this.LL.getValue();
    }

    public final void h0() {
        getJoinButton().setText(2131831407);
        getJoinButton().setEnabled(false);
        C786410Ut5.U8(getJoinButton(), null);
    }

    public C1706506mF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(PreviewJoinButtonState previewJoinButtonState, C1230380i7g c1230380i7g) {
        getJoinButton().setText(previewJoinButtonState.text);
        getJoinButton().setEnabled(previewJoinButtonState.enabled);
        if (previewJoinButtonState.enabled) {
            C786410Ut5.I7(new AbS686S0100000_2(c1230380i7g, 16), getJoinButton());
        } else {
            C786410Ut5.U8(getJoinButton(), null);
        }
    }

    public C1706506mF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 99));
    }
}
