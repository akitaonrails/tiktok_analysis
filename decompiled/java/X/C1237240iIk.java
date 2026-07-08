package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237240iIk extends TuxTextView implements InterfaceC1237230iIj {
    public InterfaceC1237230iIj LLJJJJ;
    public C1237220iIi LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public String LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC1237230iIj
    public final void LIZLLL() {
        InterfaceC1237230iIj interfaceC1237230iIj = this.LLJJJJ;
        if (interfaceC1237230iIj != null) {
            interfaceC1237230iIj.LIZLLL();
        }
    }

    public final C1237220iIi LJJJJJ() {
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new C1237220iIi(this.LLJJJJLIIL, this.LLJJL, this);
        }
        this.LLJJJJJIL.LIZJ();
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1237230iIj
    public final void onStart() {
        InterfaceC1237230iIj interfaceC1237230iIj = this.LLJJJJ;
        if (interfaceC1237230iIj != null) {
            interfaceC1237230iIj.onStart();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1237220iIi c1237220iIi = this.LLJJJJJIL;
        if (c1237220iIi != null) {
            c1237220iIi.LLIZLLLIL = null;
        }
        this.LLJJJJ = null;
    }

    @Override // X.InterfaceC1237230iIj
    public final void LJJI(long j) {
        setText(String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + this.LLJJLIIIJLLLLLLLZ);
        InterfaceC1237230iIj interfaceC1237230iIj = this.LLJJJJ;
        if (interfaceC1237230iIj != null) {
            interfaceC1237230iIj.LJJI(j);
        }
    }

    public final void LJJJJL(C1237220iIi c1237220iIi) {
        this.LLJJJJJIL = c1237220iIi;
        if (c1237220iIi.LIZIZ()) {
            onStart();
            c1237220iIi.LLIZLLLIL = this;
            if (c1237220iIi.LLILZIL) {
                LIZLLL();
                return;
            }
            return;
        }
        c1237220iIi.LIZJ();
    }

    public final void setCallback(InterfaceC1237230iIj interfaceC1237230iIj) {
        this.LLJJJJ = interfaceC1237230iIj;
    }

    public C1237240iIk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TimerTextView);
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.TimerTextView_durationMillis, C538540LAe.LLJJJIL);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TimerTextView_suffix);
        this.LLJJLIIIJLLLLLLLZ = strXd == null ? "" : strXd;
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJL = 1000L;
    }
}
