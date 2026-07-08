package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.11g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19561511g5 extends C19YA {
    public static final /* synthetic */ int LLILZ = 0;
    public InterfaceC19561911g9 LL;
    public int LLILLJJLI;
    public int LLILLL;

    @Override // X.C19YA
    public final void addOnTabSelectedListener(InterfaceC19561911g9 interfaceC19561911g9) {
        this.LL = interfaceC19561911g9;
    }

    public final void setMaxTabModeForCount(int i) {
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
            if (i <= 4 && i > 1) {
                setTabMode(1);
                return;
            }
        }
        setTabMode(0);
    }

    public C19561511g5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19561511g5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView).getBoolean(R$styleable.AVDmtView_oldPanel, false);
        }
        int i2 = C19733712It.LIZIZ;
        this.LLILLJJLI = i2;
        this.LLILLL = C19733712It.LIZJ(i2);
        setOverScrollMode(2);
        setTabTextColors(this.LLILLL, this.LLILLJJLI);
        setSelectedTabIndicatorColor(this.LLILLJJLI);
        setTabMargin(16);
        super.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.11g7
            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZ(c12h3);
                }
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZIZ(c12h3);
                }
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZJ(c12h3, z);
                }
            }
        });
    }
}
