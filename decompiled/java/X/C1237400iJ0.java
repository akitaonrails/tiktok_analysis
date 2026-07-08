package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237400iJ0 extends FrameLayout implements InterfaceC1237370iIx {
    public final FrameLayout LL;
    public final Space LLILLJJLI;
    public final FrameLayout LLILLL;
    public final Space LLILZ;
    public final FrameLayout LLILZIL;
    public C1748300vb2 LLILZLL;
    public View LLIZ;
    public C1748330vb5 LLIZLLLIL;
    public InterfaceC1237390iIz LLJ;
    public boolean LLJI;

    public C1237400iJ0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        C786410Ut5.LLIIZ(this.LLILLJJLI, (this.LLILZLL == null || (this.LLIZ == null && this.LLIZLLLIL == null)) ? 8 : 4);
        C786410Ut5.LLIIZ(this.LLILZ, (this.LLIZ == null || this.LLIZLLLIL == null) ? 8 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContent(View view) {
        InterfaceC1237390iIz contentUpdateDelegate;
        this.LLIZ = view;
        FrameLayout frameLayout = this.LLILLL;
        C786410Ut5.LJJJJIZL(frameLayout);
        if (view != 0) {
            frameLayout.addView(view);
        }
        LIZ();
        if ((view instanceof InterfaceC1237420iJ2) && !this.LLJI && (contentUpdateDelegate = ((InterfaceC1237420iJ2) view).getContentUpdateDelegate()) != null) {
            this.LLJ = contentUpdateDelegate;
        }
        if (view instanceof InterfaceC1237410iJ1) {
            InterfaceC1237410iJ1 interfaceC1237410iJ1 = (InterfaceC1237410iJ1) view;
            interfaceC1237410iJ1.setTuxFieldContentCallback(this);
            interfaceC1237410iJ1.LIZ();
        }
    }

    public final void setContentUpdateDelegate(InterfaceC1237390iIz interfaceC1237390iIz) {
        boolean z;
        InterfaceC1237410iJ1 interfaceC1237410iJ1;
        this.LLJ = interfaceC1237390iIz;
        if (interfaceC1237390iIz != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJI = z;
        KeyEvent.Callback callback = this.LLIZ;
        if ((callback instanceof InterfaceC1237410iJ1) && (interfaceC1237410iJ1 = (InterfaceC1237410iJ1) callback) != null) {
            interfaceC1237410iJ1.LIZ();
        }
    }

    public final void setFooter(C1748330vb5 c1748330vb5) {
        InterfaceC1237410iJ1 interfaceC1237410iJ1;
        this.LLIZLLLIL = c1748330vb5;
        FrameLayout frameLayout = this.LLILZIL;
        C786410Ut5.LJJJJIZL(frameLayout);
        if (c1748330vb5 != null) {
            frameLayout.addView(c1748330vb5);
        }
        LIZ();
        KeyEvent.Callback callback = this.LLIZ;
        if ((callback instanceof InterfaceC1237410iJ1) && (interfaceC1237410iJ1 = (InterfaceC1237410iJ1) callback) != null) {
            interfaceC1237410iJ1.LIZ();
        }
    }

    public final void setHeader(C1748300vb2 c1748300vb2) {
        this.LLILZLL = c1748300vb2;
        FrameLayout frameLayout = this.LL;
        C786410Ut5.LJJJJIZL(frameLayout);
        if (c1748300vb2 != null) {
            frameLayout.addView(c1748300vb2);
        }
        LIZ();
    }

    @Override // X.InterfaceC1237370iIx
    public final void LJJII(int i, CharSequence charSequence) {
        InterfaceC1237390iIz interfaceC1237390iIz;
        C1748330vb5 c1748330vb5 = this.LLIZLLLIL;
        if (c1748330vb5 != null && (interfaceC1237390iIz = this.LLJ) != null) {
            interfaceC1237390iIz.LIZ(c1748330vb5, charSequence, i);
        }
    }

    public C1237400iJ0(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, R.layout.g_, this);
        this.LL = (FrameLayout) findViewById(R.id.ii8);
        this.LLILLJJLI = (Space) findViewById(R.id.ii9);
        this.LLILLL = (FrameLayout) findViewById(R.id.ii6);
        this.LLILZ = (Space) findViewById(R.id.ii_);
        this.LLILZIL = (FrameLayout) findViewById(R.id.ii7);
    }
}
