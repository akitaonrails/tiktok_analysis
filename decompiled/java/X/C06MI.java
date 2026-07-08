package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06MI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MI extends FrameLayout implements InterfaceC1632106aF {
    public final /* synthetic */ C1631706aB LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public String LLILZIL;
    public C06ML LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final TuxTextView getBodyLabel() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getDeleteButton() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxTextView getTitleLabel() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public C06MI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1631706aB();
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1037));
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1035));
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1036));
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final void LIZ(String str, String str2, C1600506Ol c1600506Ol) {
        int i;
        int i2;
        this.LLILZIL = str;
        this.LLILZLL = c1600506Ol;
        if (!this.LLIZ) {
            TuxTextView titleLabel = getTitleLabel();
            if (titleLabel != null) {
                Context context = getContext();
                if (Intrinsics.LJFF(str2, "chat_unavailable_account")) {
                    i2 = 2131831083;
                } else {
                    i2 = 2131831085;
                }
                titleLabel.setText(context.getString(i2));
            }
            TuxTextView bodyLabel = getBodyLabel();
            if (bodyLabel != null) {
                Context context2 = getContext();
                if (Intrinsics.LJFF(str2, "chat_unavailable_account")) {
                    i = 2131831081;
                } else {
                    i = 2131831084;
                }
                bodyLabel.setText(context2.getString(i));
            }
            TuxTextView deleteButton = getDeleteButton();
            if (deleteButton != null) {
                C786410Ut5.h9(deleteButton, new ACListenerS137S0100000_2(this, 64));
            }
            this.LLIZ = true;
        }
    }
}
