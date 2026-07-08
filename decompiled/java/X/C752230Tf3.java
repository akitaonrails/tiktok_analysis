package X;

import Y.AAListenerS63S0110000_12;
import Y.ATListenerS446S0100000_12;
import Y.AUListenerS220S0200000_12;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752230Tf3 extends ConstraintLayout {
    public InterfaceC752180Tey LL;
    public AnonymousClass0956 LLILLJJLI;
    public final ValueAnimator LLILLL;
    public final ValueAnimator LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    private final String getAnchorId() {
        return (String) this.LLJJI.getValue();
    }

    private final long getRoomId() {
        return ((Number) this.LLJJ.getValue()).longValue();
    }

    public final boolean getCanHide() {
        return this.LLJILLL;
    }

    public final int getEndX() {
        return this.LLJILJILJ;
    }

    public final InterfaceC752180Tey getSmallMoreView() {
        return this.LL;
    }

    public final int getStartX() {
        return this.LLJILJIL;
    }

    public final void h0(boolean z) {
        String str;
        if (z) {
            str = "livesdk_anchor_floating_gift_msg_show";
        } else {
            str = "livesdk_anchor_floating_gift_msg_cancel";
        }
        boolean z2 = this.LLILZLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(Long.valueOf(getRoomId()), "room_id");
        c474500IjALIZ.LJJII(getAnchorId(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJ), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJI), "gift_id");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_first_gift");
        c474500IjALIZ.LJJII(this.LLIZLLLIL, "combo_cnt");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLIZ), "show_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJIJIL), "cancel_cnt");
        c474500IjALIZ.LIZ();
    }

    public final void setCanHide(boolean z) {
        this.LLJILLL = z;
    }

    public final void setEndX(int i) {
        this.LLJILJILJ = i;
    }

    public final void setSmallMoreView(InterfaceC752180Tey interfaceC752180Tey) {
        this.LL = interfaceC752180Tey;
    }

    public final void setStartX(int i) {
        this.LLJILJIL = i;
    }

    public final void e0(boolean z, boolean z2) {
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (z) {
            this.LLILZIL = false;
            this.LLILLL.cancel();
            this.LLILZ.cancel();
            this.LLILLL.addListener(new AAListenerS63S0110000_12(this, z2, 2));
            this.LLILLL.start();
            this.LLILZ.start();
            return;
        }
        InterfaceC752180Tey interfaceC752180Tey = this.LL;
        if (interfaceC752180Tey != null) {
            interfaceC752180Tey.LIZ(this, z2);
        }
        this.LL = null;
    }

    public C752230Tf3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = true;
        this.LLIZ = 2000L;
        this.LLIZLLLIL = "";
        this.LLJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(498));
        this.LLJJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(497));
        ViewGroup.inflate(context, R.layout.hsn, this);
        View viewFindViewById = findViewById(R.id.j0z);
        viewFindViewById.setOnTouchListener(new ATListenerS446S0100000_12(this, 27));
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS220S0200000_12(viewFindViewById, this, 8));
        this.LLILLL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS220S0200000_12(viewFindViewById, this, 9));
        this.LLILZ = valueAnimatorOfFloat2;
    }
}
