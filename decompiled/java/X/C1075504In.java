package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1075504In extends AbstractC1075804Iq {
    public TuxTextView LL;
    public C422790Ghx LLILLJJLI;
    public C0DJG LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public View LLIZ;

    public C1075504In() {
        throw null;
    }

    public C1075504In(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.AbstractC1075804Iq
    public int getLayoutResId() {
        return R.layout.auy;
    }

    public final TuxTextView getAspectFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b9k);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C422790Ghx getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LLILLJJLI = (C422790Ghx) callbackFindViewById;
        }
        return (C422790Ghx) callbackFindViewById;
    }

    public final View getReviewCellUserInfoClickHotZoneFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tg6);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getReviewCellUserInfoTokoSourceIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tg7);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getSkuFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vg4);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C0DJG getStarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vx4);
            this.LLILLL = (C0DJG) callbackFindViewById;
        }
        return (C0DJG) callbackFindViewById;
    }

    public final TuxTextView getUsernameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.username);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractC1075804Iq
    public C422790Ghx getIvAvatar() {
        return getAvatarFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public TuxIconView getIvTokoTag() {
        return getReviewCellUserInfoTokoSourceIconFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public C0DJG getRsStar() {
        return getStarFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public TuxTextView getTvAspect() {
        return getAspectFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public TuxTextView getTvSku() {
        return getSkuFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public TuxTextView getTvUserName() {
        return getUsernameFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public View getVClickHotZone() {
        return getReviewCellUserInfoClickHotZoneFromXml();
    }

    public final void setAspectFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setAvatarFromXml(C422790Ghx c422790Ghx) {
        this.LLILLJJLI = c422790Ghx;
    }

    public final void setReviewCellUserInfoClickHotZoneFromXml(View view) {
        this.LLIZ = view;
    }

    public final void setReviewCellUserInfoTokoSourceIconFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setSkuFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setStarFromXml(C0DJG c0djg) {
        this.LLILLL = c0djg;
    }

    public final void setUsernameFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C1075504In(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
