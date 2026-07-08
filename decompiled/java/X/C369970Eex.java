package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Eex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369970Eex extends HorizontalScrollView {
    public NLETrackSlot LL;
    public float LLILLJJLI;
    public final FrameLayout LLILLL;
    public final int LLILZ;
    public final C367790EbR LLILZIL;
    public final C369980Eey LLILZLL;
    public InterfaceC370150EfF LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final BPEAHandler LLJI;

    public final Pair<Integer, Integer> getRootPadding() {
        return new Pair<>(Integer.valueOf(this.LLILLL.getPaddingLeft()), Integer.valueOf(this.LLILLL.getPaddingRight()));
    }

    public final float getPxPerMS() {
        return this.LLILLJJLI;
    }

    public final InterfaceC370150EfF getScrollLister$tools_camera_edit_release() {
        return this.LLIZ;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLIZLLLIL = true;
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.LLIZLLLIL = false;
            this.LLJI.removeMessages(1);
            C786410Ut5.LJLJJI(1, 80L, this.LLJI);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.LLIZLLLIL = false;
            this.LLJI.removeMessages(1);
            C786410Ut5.LJLJJI(1, 80L, this.LLJI);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioNLETrackSlot(NLETrackSlot nLETrackSlot) {
        float absSpeed;
        if (!C351220Dpo.LLILLIZIL(nLETrackSlot)) {
            return;
        }
        this.LL = nLETrackSlot;
        C786410Ut5.LJJJJIZL(this.LLILLL);
        setSegment(nLETrackSlot);
        long duration = 0;
        if (nLETrackSlot.getMainSegment().getResource().getDuration() == 0) {
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                duration = nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart();
            }
        } else {
            duration = nLETrackSlot.getMainSegment().getResource().getDuration();
        }
        setTimelineScale(this.LLILLJJLI);
        setMinDrawRegionWidth(this.LLILZ - this.LLILLL.getPaddingStart());
        String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "audio_stick_points", "");
        int i = C367650EbD.LLILZLL;
        setAllStickPoints(C122600dM.LIZ(strLJLJL));
        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast2 != null) {
            absSpeed = nLESegmentAudioDynamicCast2.getAbsSpeed();
        } else {
            absSpeed = 1.0f;
        }
        int i2 = (int) (((duration / absSpeed) / LSPassThroughRecordSizeConfig.DEFAULT) * this.LLILLJJLI);
        this.LLILLL.addView(this.LLILZIL, i2, -1);
        this.LLILLL.addView(this.LLILZLL, i2, -1);
    }

    public final void setAudioTrackPaint(InterfaceC367710EbJ interfaceC367710EbJ) {
        setPainter(interfaceC367710EbJ);
    }

    public final void setPxPerMS(float f) {
        this.LLILLJJLI = f;
    }

    public final void setScrollLister$tools_camera_edit_release(InterfaceC370150EfF interfaceC370150EfF) {
        this.LLIZ = interfaceC370150EfF;
    }

    public final void setScrollState(int i) {
        if (this.LLJ != i) {
            this.LLJ = i;
            InterfaceC370150EfF interfaceC370150EfF = this.LLIZ;
            if (interfaceC370150EfF != null) {
                interfaceC370150EfF.LIZ(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Eb9, X.0EbR, X.0Ebv, android.view.View] */
    public C369970Eex(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C360610EBv.LIZJ();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LLILLL = frameLayout;
        this.LLILZ = C0FU0.LIZJ(C0EHL.LIZ());
        ?? r1 = new C367610Eb9(context) { // from class: X.0EbR
            @Override // X.C367610Eb9
            public final void LJIILIIL() {
                setBgRadius(C0FU0.LIZ(6.0f));
            }
        };
        r1.setId(R.id.bgn);
        r1.setDrawDivider(false);
        r1.setDrawLabel(false);
        r1.setItemSelected(false);
        r1.setNeedDrawStickPoint(true);
        r1.setNeedDrawGradientLayer(false);
        r1.setDrawStartDivider(false);
        r1.setDrawEndDivider(false);
        this.LLILZIL = r1;
        this.LLILZLL = new C369980Eey(context);
        addView(frameLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0EfI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.LLJI = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0Eez
            public int LL = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                int scrollY = this.LLILLJJLI.getScrollY();
                C369970Eex c369970Eex = this.LLILLJJLI;
                if (!c369970Eex.LLIZLLLIL && this.LL == scrollY) {
                    this.LL = Integer.MIN_VALUE;
                    c369970Eex.setScrollState(0);
                    return true;
                }
                this.LL = scrollY;
                c369970Eex.LLJI.removeMessages(1);
                C786410Ut5.LJLJJI(1, 80L, c369970Eex.LLJI);
                return true;
            }
        });
    }

    public final void LIZ(float f, float f2, float f3) {
        this.LLILZLL.setAnchorViewLeft(f);
        this.LLILZLL.setAnchorViewWidth(f2);
        this.LLILZLL.setMarginScrollLeft(f3);
        this.LLILZLL.invalidate();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setOutScrollX(Integer.valueOf(i));
        invalidate();
        this.LLILZLL.setOutScrollX(i);
        this.LLILZLL.invalidate();
        if (this.LLIZLLLIL) {
            setScrollState(1);
        } else {
            setScrollState(2);
            this.LLJI.removeMessages(1);
            C786410Ut5.LJLJJI(1, 80L, this.LLJI);
        }
        InterfaceC370150EfF interfaceC370150EfF = this.LLIZ;
        if (interfaceC370150EfF != null) {
            interfaceC370150EfF.LIZIZ();
        }
    }
}
