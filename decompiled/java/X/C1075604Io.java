package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1075604Io extends AbstractC1075804Iq {
    public C422790Ghx LL;
    public C0DJG LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    public C1075604Io() {
        throw null;
    }

    @Override // X.AbstractC1075804Iq
    public int getLayoutResId() {
        return R.layout.auw;
    }

    @Override // X.AbstractC1075804Iq
    public TuxTextView getTvUserName() {
        return null;
    }

    public final TuxTextView getAspectFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b9k);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C422790Ghx getAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bh2);
            this.LL = (C422790Ghx) callbackFindViewById;
        }
        return (C422790Ghx) callbackFindViewById;
    }

    public final TuxTextView getSkuFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vg4);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C0DJG getStarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vx4);
            this.LLILLJJLI = (C0DJG) callbackFindViewById;
        }
        return (C0DJG) callbackFindViewById;
    }

    @Override // X.AbstractC1075804Iq
    public C422790Ghx getIvAvatar() {
        return getAvatarFromXml();
    }

    @Override // X.AbstractC1075804Iq
    public TuxIconView getIvTokoTag() {
        return (TuxIconView) findViewById(R.id.xth);
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
    public View getVClickHotZone() {
        return findViewById(R.id.user_info_click_hot_zone);
    }

    public final void setAspectFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setAvatarFromXml(C422790Ghx c422790Ghx) {
        this.LL = c422790Ghx;
    }

    public final void setSkuFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setStarFromXml(C0DJG c0djg) {
        this.LLILLJJLI = c0djg;
    }

    public C1075604Io(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
