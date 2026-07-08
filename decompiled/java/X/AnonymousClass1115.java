package X;

import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.1115, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1115 implements View.OnTouchListener {
    public final float LL;
    public final long LLILLJJLI;
    public final RunnableC194311110j LLILZIL;
    public AnonymousClass1117 LLIZ;
    public final AnonymousClass1116 LLILLL = new AnonymousClass1116();
    public final AnonymousClass1116 LLILZ = new AnonymousClass1116();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZLLLIL = true;

    public final void LIZ() {
        RunnableC194311110j runnableC194311110j = this.LLILZIL;
        if (runnableC194311110j.LLILLJJLI) {
            this.LLILZLL.removeCallbacks(runnableC194311110j);
            this.LLILZIL.LLILLJJLI = false;
        }
        RunnableC194311110j runnableC194311110j2 = this.LLILZIL;
        runnableC194311110j2.LLILZ = false;
        runnableC194311110j2.LL = false;
    }

    public AnonymousClass1115(View view) {
        view.setOnTouchListener(this);
        this.LLILZIL = new RunnableC194311110j(view.getContext());
        this.LL = ViewConfiguration.get(view.getContext()).getScaledEdgeSlop();
        this.LLILLJJLI = ViewConfiguration.getLongPressTimeout();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass1117 anonymousClass1117;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    LIZ();
                } else {
                    this.LLIZLLLIL = false;
                    this.LLILZ.LIZ = motionEvent.getRawX();
                    this.LLILZ.LIZIZ = motionEvent.getRawY();
                    if (this.LLILZIL.LL) {
                        AnonymousClass1117 anonymousClass11172 = this.LLIZ;
                        if (anonymousClass11172 != null) {
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            int i = (int) (rawX - anonymousClass11172.LIZ);
                            int i2 = (int) (rawY - anonymousClass11172.LIZIZ);
                            anonymousClass11172.LIZ = rawX;
                            anonymousClass11172.LIZIZ = rawY;
                            float x = anonymousClass11172.LIZJ.getX();
                            float y = anonymousClass11172.LIZJ.getY();
                            int width = anonymousClass11172.LIZJ.getWidth();
                            int height = anonymousClass11172.LIZJ.getHeight();
                            float f = i;
                            if (width + x + f <= anonymousClass11172.LIZLLL.getWidth() && x + f >= 0.0f) {
                                View view2 = anonymousClass11172.LIZJ;
                                C786410Ut5.Jc(view2, view2.getTranslationX() + f);
                            }
                            float f2 = i2;
                            if (height + y + f2 <= anonymousClass11172.LIZLLL.getHeight() && y + f2 >= 0.0f) {
                                View view3 = anonymousClass11172.LIZJ;
                                C786410Ut5.ed(view3, view3.getTranslationY() + f2);
                            }
                            return true;
                        }
                    } else {
                        AnonymousClass1116 anonymousClass1116 = this.LLILLL;
                        AnonymousClass1116 anonymousClass11162 = this.LLILZ;
                        if (Math.sqrt(Math.pow(anonymousClass1116.LIZ - anonymousClass11162.LIZ, 2.0d) + Math.pow(anonymousClass1116.LIZIZ - anonymousClass11162.LIZIZ, 2.0d)) > this.LL) {
                            LIZ();
                            return false;
                        }
                        this.LLIZLLLIL = true;
                        return false;
                    }
                }
            } else {
                if (this.LLIZLLLIL && !this.LLILZIL.LL && (anonymousClass1117 = this.LLIZ) != null) {
                    anonymousClass1117.LIZJ.performClick();
                }
                LIZ();
                this.LLIZLLLIL = true;
                return false;
            }
        } else {
            this.LLILLL.LIZ = motionEvent.getRawX();
            this.LLILLL.LIZIZ = motionEvent.getRawY();
            RunnableC194311110j runnableC194311110j = this.LLILZIL;
            if (!runnableC194311110j.LLILLJJLI) {
                runnableC194311110j.LL = false;
                runnableC194311110j.LLILZ = true;
                C786410Ut5.LJLIIL(this.LLILLJJLI, this.LLILZLL, runnableC194311110j);
                this.LLILZIL.LLILLJJLI = true;
            }
            AnonymousClass1117 anonymousClass11173 = this.LLIZ;
            if (anonymousClass11173 != null) {
                anonymousClass11173.LIZ = motionEvent.getRawX();
                anonymousClass11173.LIZIZ = motionEvent.getRawY();
                return true;
            }
        }
        return false;
    }
}
