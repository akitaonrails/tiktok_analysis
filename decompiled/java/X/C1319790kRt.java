package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.xelement.pickview.timer.MessageHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0kRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319790kRt extends View {
    public static final String[] LLLILZLLLI = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    public EnumC1319840kRy LL;
    public Context LLILLJJLI;
    public MessageHandler LLILLL;
    public GestureDetector LLILZ;
    public InterfaceC1319720kRm LLILZIL;
    public boolean LLILZLL;
    public final boolean LLIZ;
    public final ScheduledExecutorService LLIZLLLIL;
    public ScheduledFuture<?> LLJ;
    public Paint LLJI;
    public Paint LLJIJIL;
    public Paint LLJILJIL;
    public Paint LLJILJILJ;
    public InterfaceC1319850kRz LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public Typeface LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public float LLLI;
    public long LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public final float LLLIILIL;
    public boolean LLLIL;
    public InterfaceC1305140k4G LLLILZ;
    public final BPEAHandler LLLILZJ;

    public final void LIZ() {
        ScheduledFuture<?> scheduledFuture = this.LLJ;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.LLJ.cancel(true);
        this.LLJ = null;
    }

    public final void LIZLLL() {
        String str;
        if (this.LLJILLL == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i = 0; i < this.LLJILLL.Q0(); i++) {
            String strLIZIZ = LIZIZ(this.LLJILLL.getItem(i));
            this.LLJIJIL.getTextBounds(strLIZIZ, 0, strLIZIZ.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.LLJJIII) {
                this.LLJJIII = iWidth;
            }
        }
        InterfaceC1305140k4G interfaceC1305140k4G = this.LLLILZ;
        if (interfaceC1305140k4G == null || (str = interfaceC1305140k4G.LIZ().get("wheel_text_bound_text")) == null || str.isEmpty()) {
            str = "Week";
        }
        this.LLJIJIL.getTextBounds(str, 0, 2, rect);
        int iHeight = rect.height() + 2;
        this.LLJJIJI = iHeight;
        this.LLJJIJIL = this.LLJJLIIIJLLLLLLLZ * iHeight;
        float f = this.LLJJJ;
        if (f > 0.0f) {
            this.LLJJIJIL = f;
        }
        int i2 = (int) (this.LLJJIJIL * (this.LLL - 1));
        this.LLLF = (int) (((double) (i2 * 2)) / 3.141592653589793d);
        this.LLLFFI = (int) (((double) i2) / 3.141592653589793d);
        this.LLLFF = View.MeasureSpec.getSize(this.LLLIIII);
        float f2 = this.LLLF;
        float f3 = this.LLJJIJIL;
        this.LLJLIL = (f2 - f3) / 2.0f;
        float f4 = (f2 + f3) / 2.0f;
        this.LLJLILLLLZIIL = f4;
        this.LLJLL = (f4 - ((f3 - this.LLJJIJI) / 2.0f)) - this.LLLIILIL;
        if (this.LLJLLL == -1) {
            if (this.LLJL) {
                this.LLJLLL = (this.LLJILLL.Q0() + 1) / 2;
            } else {
                this.LLJLLL = 0;
            }
        }
        this.LLJZIJLIL = this.LLJLLL;
    }

    public final int getCurrentItem() {
        int i;
        InterfaceC1319850kRz interfaceC1319850kRz = this.LLJILLL;
        if (interfaceC1319850kRz == null) {
            return 0;
        }
        return (!this.LLJL || ((i = this.LLJZ) >= 0 && i < interfaceC1319850kRz.Q0())) ? Math.max(0, Math.min(this.LLJZ, this.LLJILLL.Q0() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.LLJZ) - this.LLJILLL.Q0()), this.LLJILLL.Q0() - 1));
    }

    public int getItemDefaultOrUserHeight() {
        float f = this.LLJJJ;
        return f > 0.0f ? (int) f : (int) this.LLJJIJIL;
    }

    public int getItemsCount() {
        InterfaceC1319850kRz interfaceC1319850kRz = this.LLJILLL;
        if (interfaceC1319850kRz != null) {
            return interfaceC1319850kRz.Q0();
        }
        return 0;
    }

    public final InterfaceC1319850kRz getAdapter() {
        return this.LLJILLL;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.LLILLL;
    }

    public int getInitPosition() {
        return this.LLJLLL;
    }

    public float getItemHeight() {
        return this.LLJJIJIL;
    }

    public float getTotalScrollY() {
        return this.LLJLLIL;
    }

    public C1319790kRt(Context context) {
        super(context, null);
        this.LLIZ = true;
        this.LLIZLLLIL = C807400Vlq.LJ();
        this.LLJJJIL = Typeface.MONOSPACE;
        this.LLJJLIIIJLLLLLLLZ = 1.6f;
        this.LLL = 0;
        this.LLLFZ = 0;
        this.LLLI = 0.0f;
        this.LLLII = 0L;
        this.LLLIIIIL = 17;
        this.LLLIIIL = 0;
        this.LLLIIL = 0;
        this.LLLIL = false;
        this.LLLILZJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJI = getResources().getDimensionPixelSize(R.dimen.a6b);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.LLLIILIL = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.LLLIILIL = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.LLLIILIL = 6.0f;
        } else if (f >= 3.0f) {
            this.LLLIILIL = f * 2.5f;
        }
        this.LLLIIIIL = 17;
        this.LLJJJJ = -16777216;
        this.LLJJJJJIL = -16777216;
        this.LLJJJJLIIL = -16777216;
        this.LLJJL = 2;
        this.LLJJJ = context.getResources().getDimension(R.dimen.a6a);
        float f2 = this.LLJJLIIIJLLLLLLLZ;
        if (f2 < 1.0f) {
            this.LLJJLIIIJLLLLLLLZ = 1.0f;
        } else if (f2 > 4.0f) {
            this.LLJJLIIIJLLLLLLLZ = 4.0f;
        }
        this.LLILLJJLI = context;
        this.LLILLL = new MessageHandler(this);
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(this) { // from class: X.0kRw
            public final C1319790kRt LL;

            {
                this.LL = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                C1319790kRt c1319790kRt = this.LL;
                c1319790kRt.LIZ();
                c1319790kRt.LLJ = c1319790kRt.LLIZLLLIL.scheduleWithFixedDelay(new C0W9W(c1319790kRt, f4) { // from class: X.0kRv
                    public float LL = 2.1474836E9f;
                    public final float LLILLJJLI;
                    public final C1319790kRt LLILLL;

                    public final void LIZ() {
                        if (this.LL == 2.1474836E9f) {
                            if (Math.abs(this.LLILLJJLI) > 2000.0f) {
                                this.LL = this.LLILLJJLI <= 0.0f ? -2000.0f : 2000.0f;
                            } else {
                                this.LL = this.LLILLJJLI;
                            }
                        }
                        if (Math.abs(this.LL) >= 0.0f && Math.abs(this.LL) <= 20.0f) {
                            this.LLILLL.LIZ();
                            C786410Ut5.LJLILLLLZI(this.LLILLL.getHandler(), 2000);
                            return;
                        }
                        int i = (int) (this.LL / 100.0f);
                        C1319790kRt c1319790kRt2 = this.LLILLL;
                        float f5 = i;
                        c1319790kRt2.setTotalScrollY(c1319790kRt2.getTotalScrollY() - f5);
                        C1319790kRt c1319790kRt3 = this.LLILLL;
                        if (!c1319790kRt3.LLJL) {
                            float itemHeight = c1319790kRt3.getItemHeight();
                            float totalScrollY = (-this.LLILLL.getInitPosition()) * itemHeight;
                            float itemsCount = ((this.LLILLL.getItemsCount() - 1) - this.LLILLL.getInitPosition()) * itemHeight;
                            double d = ((double) itemHeight) * 0.25d;
                            if (((double) this.LLILLL.getTotalScrollY()) - d < totalScrollY) {
                                totalScrollY = this.LLILLL.getTotalScrollY() + f5;
                            } else if (((double) this.LLILLL.getTotalScrollY()) + d > itemsCount) {
                                itemsCount = this.LLILLL.getTotalScrollY() + f5;
                            }
                            if (this.LLILLL.getTotalScrollY() <= totalScrollY) {
                                this.LL = 40.0f;
                                this.LLILLL.setTotalScrollY((int) totalScrollY);
                            } else if (this.LLILLL.getTotalScrollY() >= itemsCount) {
                                this.LLILLL.setTotalScrollY((int) itemsCount);
                                this.LL = -40.0f;
                            }
                        }
                        float f6 = this.LL;
                        if (f6 < 0.0f) {
                            this.LL = f6 + 20.0f;
                        } else {
                            this.LL = f6 - 20.0f;
                        }
                        C786410Ut5.LJLILLLLZI(this.LLILLL.getHandler(), LSPassThroughRecordSizeConfig.DEFAULT);
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("InertiaTimerTask@95aa.run");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("InertiaTimerTask@95aa.run");
                    }

                    {
                        this.LLILLL = c1319790kRt;
                        this.LLILLJJLI = f4;
                    }
                }, 0L, 5L, TimeUnit.MILLISECONDS);
                return true;
            }
        }, new BPEAHandler(Looper.getMainLooper()));
        this.LLILZ = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.LLJL = true;
        this.LLJLLIL = 0.0f;
        this.LLJLLL = -1;
        Paint paint = new Paint();
        this.LLJI = paint;
        paint.setColor(this.LLJJJJ);
        this.LLJI.setAntiAlias(true);
        this.LLJI.setTypeface(this.LLJJJIL);
        this.LLJI.setTextSize(this.LLJJI);
        Paint paint2 = new Paint();
        this.LLJIJIL = paint2;
        paint2.setColor(this.LLJJJJJIL);
        this.LLJIJIL.setAntiAlias(true);
        this.LLJIJIL.setTextScaleX(1.1f);
        this.LLJIJIL.setTypeface(this.LLJJJIL);
        this.LLJIJIL.setTextSize(this.LLJJI);
        Paint paint3 = new Paint();
        this.LLJILJIL = paint3;
        paint3.setColor(this.LLJJJJLIIL);
        this.LLJILJIL.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.LLJILJILJ = paint4;
        paint4.setColor(Integer.MAX_VALUE);
        setLayerType(1, null);
    }

    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC1319860kS0) {
            return ((InterfaceC1319860kS0) obj).LIZ();
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= 0 && iIntValue < 10) {
                return LLLILZLLLI[iIntValue];
            }
            return String.valueOf(iIntValue);
        }
        return obj.toString();
    }

    public final int LIZJ(int i) {
        if (i < 0) {
            return LIZJ(i + this.LLJILLL.Q0());
        }
        if (i <= this.LLJILLL.Q0() - 1) {
            return i;
        }
        return LIZJ(i - this.LLJILLL.Q0());
    }

    public final void LJFF(EnumC1319830kRx enumC1319830kRx) {
        LIZ();
        if (enumC1319830kRx == EnumC1319830kRx.FLING || enumC1319830kRx == EnumC1319830kRx.DAGGLE) {
            float f = this.LLJLLIL;
            float f2 = this.LLJJIJIL;
            int i = (int) (((f % f2) + f2) % f2);
            this.LLLFZ = i;
            if (i > f2 / 2.0f) {
                this.LLLFZ = (int) (f2 - i);
            } else {
                this.LLLFZ = -i;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.LLIZLLLIL;
        final int i2 = this.LLLFZ;
        this.LLJ = scheduledExecutorService.scheduleWithFixedDelay(new C0W9W(this, i2) { // from class: X.0kRu
            public int LL = Integer.MAX_VALUE;
            public int LLILLJJLI;
            public final int LLILLL;
            public final C1319790kRt LLILZ;

            public final void LIZ() {
                if (this.LL == Integer.MAX_VALUE) {
                    this.LL = this.LLILLL;
                }
                int i3 = this.LL;
                int i4 = (int) (i3 * 0.1f);
                this.LLILLJJLI = i4;
                if (i4 == 0) {
                    if (i3 < 0) {
                        this.LLILLJJLI = -1;
                    } else {
                        this.LLILLJJLI = 1;
                    }
                }
                if (Math.abs(i3) <= 1) {
                    this.LLILZ.LIZ();
                    C786410Ut5.LJLILLLLZI(this.LLILZ.getHandler(), LivePreCreateNextRoomPlayer.ENABLE);
                    return;
                }
                C1319790kRt c1319790kRt = this.LLILZ;
                c1319790kRt.setTotalScrollY(c1319790kRt.getTotalScrollY() + this.LLILLJJLI);
                C1319790kRt c1319790kRt2 = this.LLILZ;
                if (!c1319790kRt2.LLJL) {
                    float itemHeight = c1319790kRt2.getItemHeight();
                    float itemsCount = ((this.LLILZ.getItemsCount() - 1) - this.LLILZ.getInitPosition()) * itemHeight;
                    if (this.LLILZ.getTotalScrollY() <= (-this.LLILZ.getInitPosition()) * itemHeight || this.LLILZ.getTotalScrollY() >= itemsCount) {
                        C1319790kRt c1319790kRt3 = this.LLILZ;
                        c1319790kRt3.setTotalScrollY(c1319790kRt3.getTotalScrollY() - this.LLILLJJLI);
                        this.LLILZ.LIZ();
                        C786410Ut5.LJLILLLLZI(this.LLILZ.getHandler(), LivePreCreateNextRoomPlayer.ENABLE);
                        return;
                    }
                }
                C786410Ut5.LJLILLLLZI(this.LLILZ.getHandler(), LSPassThroughRecordSizeConfig.DEFAULT);
                this.LL -= this.LLILLJJLI;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SmoothScrollTimerTask@846b.run");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SmoothScrollTimerTask@846b.run");
            }

            {
                this.LLILZ = this;
                this.LLILLL = i2;
            }
        }, 0L, 10L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1319790kRt.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJILLL == null) {
            return false;
        }
        boolean zOnTouchEvent = this.LLILZ.onTouchEvent(motionEvent);
        float f = (-this.LLJLLL) * this.LLJJIJIL;
        float fQ0 = ((this.LLJILLL.Q0() - 1) - this.LLJLLL) * this.LLJJIJIL;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                if (!zOnTouchEvent) {
                    float y = motionEvent.getY();
                    int i = this.LLLFFI;
                    double dAcos = Math.acos((i - y) / i) * ((double) this.LLLFFI);
                    float f2 = this.LLJJIJIL;
                    this.LLLFZ = (int) (((((int) ((dAcos + ((double) (f2 / 2.0f))) / ((double) f2))) - (this.LLL / 2)) * f2) - (((this.LLJLLIL % f2) + f2) % f2));
                    if (System.currentTimeMillis() - this.LLLII > 120) {
                        LJFF(EnumC1319830kRx.DAGGLE);
                    } else {
                        LJFF(EnumC1319830kRx.CLICK);
                    }
                }
            } else {
                float rawY = this.LLLI - motionEvent.getRawY();
                this.LLLI = motionEvent.getRawY();
                float f3 = this.LLJLLIL + rawY;
                this.LLJLLIL = f3;
                if (!this.LLJL) {
                    float f4 = this.LLJJIJIL;
                    if ((f3 - (f4 * 0.25f) < f && rawY < 0.0f) || ((f4 * 0.25f) + f3 > fQ0 && rawY > 0.0f)) {
                        this.LLJLLIL = f3 - rawY;
                        return true;
                    }
                }
            }
        } else {
            this.LLLII = System.currentTimeMillis();
            LIZ();
            this.LLLI = motionEvent.getRawY();
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC1319850kRz interfaceC1319850kRz) {
        this.LLJILLL = interfaceC1319850kRz;
        int iQ0 = interfaceC1319850kRz.Q0();
        if (iQ0 == 0) {
            setCurrentIndex(0);
        } else {
            int i = this.LLJZ;
            int i2 = iQ0 - 1;
            if (i > i2) {
                setCurrentIndex(i2);
            } else if (i < 0) {
                setCurrentIndex(0);
            }
        }
        LIZLLL();
        invalidate();
    }

    public void setAlphaGradient(boolean z) {
        this.LLLIL = z;
    }

    public final void setCenterWeight(String str) {
        if (str.contains("bold")) {
            this.LLJIJIL.setFakeBoldText(true);
        }
    }

    public final void setCurrentIndex(int i) {
        this.LLJZ = i;
        this.LLJLLL = i;
        this.LLJLLIL = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.LLJL = z;
    }

    public void setDividerColor(int i) {
        this.LLJJJJLIIL = i;
        this.LLJILJIL.setColor(i);
    }

    public void setDividerType(EnumC1319840kRy enumC1319840kRy) {
        this.LL = enumC1319840kRy;
    }

    public void setDividerWidth(int i) {
        this.LLJJL = i;
        this.LLJILJIL.setStrokeWidth(i);
    }

    public void setGravity(int i) {
        this.LLLIIIIL = i;
    }

    public void setIsOptions(boolean z) {
        this.LLILZLL = z;
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        int i2 = i + 2;
        if (this.LLL != i2) {
            this.LLL = i2;
            LIZLLL();
            invalidate();
        }
    }

    public void setLabel(String str) {
        this.LLJJ = str;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.LLJJLIIIJLLLLLLLZ = f;
            if (f < 1.0f) {
                this.LLJJLIIIJLLLLLLLZ = 1.0f;
            } else {
                if (f <= 4.0f) {
                    return;
                }
                this.LLJJLIIIJLLLLLLLZ = 4.0f;
            }
        }
    }

    public void setLocalizeAdapter(InterfaceC1305140k4G interfaceC1305140k4G) {
        this.LLLILZ = interfaceC1305140k4G;
    }

    public void setMaskColor(int i) {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new Paint();
        }
        this.LLJILJILJ.setColor(i);
    }

    public final void setOnItemSelectedListener(InterfaceC1319720kRm interfaceC1319720kRm) {
        this.LLILZIL = interfaceC1319720kRm;
    }

    public void setTextColorCenter(int i) {
        this.LLJJJJJIL = i;
        this.LLJIJIL.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.LLJJJJ = i;
        this.LLJI.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.LLILLJJLI.getResources().getDisplayMetrics().density * f);
            this.LLJJI = i;
            this.LLJI.setTextSize(i);
            this.LLJIJIL.setTextSize(this.LLJJI);
        }
    }

    public final void setTextSizePx(int i) {
        if (i > 0.0f) {
            this.LLJJI = i;
            this.LLJI.setTextSize(i);
            this.LLJIJIL.setTextSize(this.LLJJI);
        }
    }

    public void setTextXOffset(int i) {
        this.LLJJIJIIJIL = i;
        if (i != 0) {
            this.LLJIJIL.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.LLJLLIL = f;
    }

    public final void setTypeface(Typeface typeface) {
        this.LLJJJIL = typeface;
        this.LLJI.setTypeface(typeface);
        this.LLJIJIL.setTypeface(this.LLJJJIL);
    }

    public void setUserItemHeight(int i) {
        this.LLJJJ = i;
    }

    public final void LJ(float f, float f2) {
        int i;
        int iAbs;
        int i2 = this.LLJJIJIIJIL;
        int i3 = -1;
        if (i2 > 0) {
            i = 1;
        } else if (i2 < 0) {
            i = -1;
        } else {
            i = 0;
        }
        Paint paint = this.LLJI;
        if (f2 <= 0.0f) {
            i3 = 1;
        }
        paint.setTextSkewX(i * i3 * 0.5f * f);
        if (this.LLLIL) {
            iAbs = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            iAbs = 255;
        }
        this.LLJI.setAlpha(iAbs);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLLIIII = i;
        LIZLLL();
        setMeasuredDimension(this.LLLFF, this.LLLF);
    }
}
