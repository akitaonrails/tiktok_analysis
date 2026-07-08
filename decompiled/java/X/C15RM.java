package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.15RM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RM extends C15R7 {
    public C15RS LL;
    public C15RE LLILLJJLI;
    public String LLILLL;

    @Override // X.C15R7
    public final void LIZ() {
        LIZIZ(0.0f);
        setTimeBubble(0);
        C15RS c15rs = this.LL;
        if (c15rs == null) {
            c15rs = null;
        }
        c15rs.setScrollDx(0.0f);
    }

    @Override // X.C15R7
    public final void LIZIZ(final float f) {
        final C15RS c15rs = this.LL;
        if (c15rs == null) {
            c15rs = null;
        }
        c15rs.getClass();
        HandlerHook.viewPost(c15rs, new Runnable() { // from class: X.15RN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DmtCutMusicScrollView@c9d.startScrollPosition$1");
                try {
                    C15RT c15rt = c15rs.LL;
                    if (c15rt == null) {
                        c15rt = null;
                    }
                    c15rs.scrollBy((int) (c15rt.getViewWidth() * f), 0);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DmtCutMusicScrollView@c9d.startScrollPosition$1");
            }
        });
    }

    @Override // X.C15R7
    public final void LIZJ(float f) {
        C15RS c15rs = this.LL;
        C15RT c15rt = null;
        if (c15rs == null) {
            c15rs = null;
        }
        C15RT c15rt2 = c15rs.LL;
        if (c15rt2 != null) {
            c15rt = c15rt2;
        }
        int i = (int) c15rs.LLILLL;
        c15rt.LLILZLL = i;
        c15rt.LLILLL = f;
        C15RU c15ru = c15rt.LLILLJJLI;
        int i2 = c15rt.LLJ + i;
        c15ru.LJFF = i;
        c15ru.LJI = i2;
        c15rt.invalidate();
    }

    @Override // X.C15R7
    public void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        C15RS c15rs = this.LL;
        if (c15rs == null) {
            c15rs = null;
        }
        c15rs.setAudioWaveViewData(aVMusicWaveBean);
    }

    @Override // X.C15R7
    public void setBubbleText(String str) {
        C15RE c15re = this.LLILLJJLI;
        if (c15re == null) {
            c15re = null;
        }
        c15re.setText(str);
    }

    @Override // X.C15R7
    public void setBubbleTextViewAttribute(C15RD c15rd) {
        C15RE c15re = this.LLILLJJLI;
        if (c15re == null) {
            c15re = null;
        }
        c15re.setAttribute(c15rd);
    }

    @Override // X.C15R7
    public void setScrollListener(C15RV c15rv) {
        C15RS c15rs = this.LL;
        if (c15rs == null) {
            c15rs = null;
        }
        c15rs.setScrollListener(c15rv);
    }

    @Override // X.C15R7
    public void setTimeBubble(int i) {
        String str = this.LLILLL;
        if (str == null) {
            str = null;
        }
        setBubbleText(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C0F3O.LIZ(i)}, 1)));
    }

    public C15RM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DmtCutMusicLayout, 0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.DmtCutMusicLayout_android_color, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        C15RE c15re = new C15RE(context);
        this.LLILLJJLI = c15re;
        c15re.setId(R.id.zbb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) C12ES.LIZJ(8.0f, context);
        layoutParams.leftMargin = (int) C12ES.LIZJ(8.0f, context);
        layoutParams.setMarginStart((int) C12ES.LIZJ(8.0f, context));
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        C15RE c15re2 = this.LLILLJJLI;
        c15re2 = c15re2 == null ? null : c15re2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15re2);
        c15re2.setLayoutParams(layoutParams);
        C15RE c15re3 = this.LLILLJJLI;
        addView(c15re3 == null ? null : c15re3);
        C15RS c15rs = new C15RS(context, null, 0);
        this.LL = c15rs;
        c15rs.setId(R.id.zye);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.zbb);
        C15RS c15rs2 = this.LL;
        c15rs2 = c15rs2 == null ? null : c15rs2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15rs2);
        c15rs2.setLayoutParams(layoutParams2);
        C15RS c15rs3 = this.LL;
        addView(c15rs3 == null ? null : c15rs3);
        C15RS c15rs4 = this.LL;
        (c15rs4 != null ? c15rs4 : null).setWaveColor(color);
        this.LLILLL = getResources().getString(2131830419);
    }
}
