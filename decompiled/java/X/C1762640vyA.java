package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762640vyA extends ConstraintLayout implements InterfaceC10331042f {
    public AppCompatImageView LL;
    public C10332042g LLILLJJLI;
    public TuxTextView LLILLL;
    public C940203lw LLILZ;
    public boolean LLILZIL;
    public InterfaceC1763100vyu LLILZLL;
    public C1763250vz9 LLIZ;

    public final AppCompatImageView getFlashSaleBgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ibu);
            this.LL = (AppCompatImageView) callbackFindViewById;
        }
        return (AppCompatImageView) callbackFindViewById;
    }

    public final C940203lw getPromotionHeaderDescCountDownViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sar);
            this.LLILZ = (C940203lw) callbackFindViewById;
        }
        return (C940203lw) callbackFindViewById;
    }

    public final TuxTextView getPromotionHeaderDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sap);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C10332042g getPromotionHeaderTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sas);
            this.LLILLJJLI = (C10332042g) callbackFindViewById;
        }
        return (C10332042g) callbackFindViewById;
    }

    @Override // X.InterfaceC10331042f
    public final void V2(long j) {
        getPromotionHeaderDescCountDownViewFromXml().LIZ(j);
    }

    public final void setFlashSaleBgFromXml(AppCompatImageView appCompatImageView) {
        this.LL = appCompatImageView;
    }

    public final void setPromotionHeaderDescCountDownViewFromXml(C940203lw c940203lw) {
        this.LLILZ = c940203lw;
    }

    public final void setPromotionHeaderDescFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setPromotionHeaderTitleFromXml(C10332042g c10332042g) {
        this.LLILLJJLI = c10332042g;
    }

    public C1762640vyA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.as2, this);
    }
}
