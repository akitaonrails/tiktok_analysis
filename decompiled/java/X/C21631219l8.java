package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.xelement.picker.timer.MessageHandler;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.19l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21631219l8 extends View {
    public static final String[] LLLIL = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    public EnumC21631519lB LL;
    public Context LLILLJJLI;
    public MessageHandler LLILLL;
    public GestureDetector LLILZ;
    public InterfaceC21631819lE LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final ScheduledExecutorService LLIZLLLIL;
    public ScheduledFuture<?> LLJ;
    public Paint LLJI;
    public Paint LLJIJIL;
    public Paint LLJILJIL;
    public InterfaceC21631619lC LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public Typeface LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public float LLLFFI;
    public long LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public final float LLLIIIL;
    public boolean LLLIIL;
    public InterfaceC1305140k4G LLLIILIL;

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
        if (this.LLJILJILJ == null) {
            return;
        }
        Rect rect = new Rect();
        for (int i = 0; i < this.LLJILJILJ.Q0(); i++) {
            String strLIZIZ = LIZIZ(this.LLJILJILJ.getItem(i));
            this.LLJIJIL.getTextBounds(strLIZIZ, 0, strLIZIZ.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.LLJJI) {
                this.LLJJI = iWidth;
            }
        }
        InterfaceC1305140k4G interfaceC1305140k4G = this.LLLIILIL;
        if (interfaceC1305140k4G == null || (str = interfaceC1305140k4G.LIZ().get("wheel_text_bound_text")) == null || str.isEmpty()) {
            str = "Week";
        }
        this.LLJIJIL.getTextBounds(str, 0, 2, rect);
        int iHeight = rect.height() + 2;
        this.LLJJIII = iHeight;
        float f = this.LLJJJJLIIL * iHeight;
        this.LLJJIJIIJIL = f;
        int i2 = (int) (f * (this.LLJZ - 1));
        this.LLJZIJLIL = (int) (((double) (i2 * 2)) / 3.141592653589793d);
        this.LLLF = (int) (((double) i2) / 3.141592653589793d);
        this.LLL = View.MeasureSpec.getSize(this.LLLI);
        float f2 = this.LLJZIJLIL;
        float f3 = this.LLJJIJIIJIL;
        this.LLJJLIIIJLLLLLLLZ = (f2 - f3) / 2.0f;
        float f4 = (f2 + f3) / 2.0f;
        this.LLJL = f4;
        this.LLJLIL = (f4 - ((f3 - this.LLJJIII) / 2.0f)) - this.LLLIIIL;
        if (this.LLJLL == -1) {
            if (this.LLJJL) {
                this.LLJLL = (this.LLJILJILJ.Q0() + 1) / 2;
            } else {
                this.LLJLL = 0;
            }
        }
        this.LLJLLL = this.LLJLL;
    }

    public final int getCurrentItem() {
        int i;
        InterfaceC21631619lC interfaceC21631619lC = this.LLJILJILJ;
        if (interfaceC21631619lC == null) {
            return 0;
        }
        return (!this.LLJJL || ((i = this.LLJLLIL) >= 0 && i < interfaceC21631619lC.Q0())) ? Math.max(0, Math.min(this.LLJLLIL, this.LLJILJILJ.Q0() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.LLJLLIL) - this.LLJILJILJ.Q0()), this.LLJILJILJ.Q0() - 1));
    }

    public int getItemsCount() {
        InterfaceC21631619lC interfaceC21631619lC = this.LLJILJILJ;
        if (interfaceC21631619lC != null) {
            return interfaceC21631619lC.Q0();
        }
        return 0;
    }

    public final InterfaceC21631619lC getAdapter() {
        return this.LLJILJILJ;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.LLILLL;
    }

    public int getInitPosition() {
        return this.LLJLL;
    }

    public float getItemHeight() {
        return this.LLJJIJIIJIL;
    }

    public float getTotalScrollY() {
        return this.LLJLILLLLZIIL;
    }

    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof InterfaceC21631719lD) {
            return ((InterfaceC21631719lD) obj).LIZ();
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue >= 0 && iIntValue < 10) {
                return LLLIL[iIntValue];
            }
            return String.valueOf(iIntValue);
        }
        return obj.toString();
    }

    public final int LIZJ(int i) {
        if (i < 0) {
            return LIZJ(i + this.LLJILJILJ.Q0());
        }
        if (i <= this.LLJILJILJ.Q0() - 1) {
            return i;
        }
        return LIZJ(i - this.LLJILJILJ.Q0());
    }

    public final void LJFF(EnumC21631419lA enumC21631419lA) {
        LIZ();
        if (enumC21631419lA == EnumC21631419lA.FLING || enumC21631419lA == EnumC21631419lA.DAGGLE) {
            float f = this.LLJLILLLLZIIL;
            float f2 = this.LLJJIJIIJIL;
            int i = (int) (((f % f2) + f2) % f2);
            this.LLLFF = i;
            if (i > f2 / 2.0f) {
                this.LLLFF = (int) (f2 - i);
            } else {
                this.LLLFF = -i;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.LLIZLLLIL;
        final int i2 = this.LLLFF;
        this.LLJ = scheduledExecutorService.scheduleWithFixedDelay(new C0W9W(this, i2) { // from class: X.19lG
            public int LL = Integer.MAX_VALUE;
            public int LLILLJJLI;
            public final int LLILLL;
            public final C21631219l8 LLILZ;

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
                C21631219l8 c21631219l8 = this.LLILZ;
                c21631219l8.setTotalScrollY(c21631219l8.getTotalScrollY() + this.LLILLJJLI);
                C21631219l8 c21631219l82 = this.LLILZ;
                if (!c21631219l82.LLJJL) {
                    float itemHeight = c21631219l82.getItemHeight();
                    float itemsCount = ((this.LLILZ.getItemsCount() - 1) - this.LLILZ.getInitPosition()) * itemHeight;
                    if (this.LLILZ.getTotalScrollY() <= (-this.LLILZ.getInitPosition()) * itemHeight || this.LLILZ.getTotalScrollY() >= itemsCount) {
                        C21631219l8 c21631219l83 = this.LLILZ;
                        c21631219l83.setTotalScrollY(c21631219l83.getTotalScrollY() - this.LLILLJJLI);
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
                C1C7U.LIZ("SmoothScrollTimerTask@db00.run");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    LIZ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SmoothScrollTimerTask@db00.run");
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
            Method dump skipped, instruction units count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21631219l8.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.LLILZ.onTouchEvent(motionEvent);
        float f = (-this.LLJLL) * this.LLJJIJIIJIL;
        float fQ0 = ((this.LLJILJILJ.Q0() - 1) - this.LLJLL) * this.LLJJIJIIJIL;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                if (!zOnTouchEvent) {
                    float y = motionEvent.getY();
                    int i = this.LLLF;
                    double dAcos = Math.acos((i - y) / i) * ((double) this.LLLF);
                    float f2 = this.LLJJIJIIJIL;
                    this.LLLFF = (int) (((((int) ((dAcos + ((double) (f2 / 2.0f))) / ((double) f2))) - (this.LLJZ / 2)) * f2) - (((this.LLJLILLLLZIIL % f2) + f2) % f2));
                    if (System.currentTimeMillis() - this.LLLFZ > 120) {
                        LJFF(EnumC21631419lA.DAGGLE);
                    } else {
                        LJFF(EnumC21631419lA.CLICK);
                    }
                }
            } else {
                float rawY = this.LLLFFI - motionEvent.getRawY();
                this.LLLFFI = motionEvent.getRawY();
                float f3 = this.LLJLILLLLZIIL + rawY;
                this.LLJLILLLLZIIL = f3;
                if (!this.LLJJL) {
                    float f4 = this.LLJJIJIIJIL;
                    if ((f3 - (f4 * 0.25f) < f && rawY < 0.0f) || ((f4 * 0.25f) + f3 > fQ0 && rawY > 0.0f)) {
                        this.LLJLILLLLZIIL = f3 - rawY;
                        return true;
                    }
                }
            }
        } else {
            this.LLLFZ = System.currentTimeMillis();
            LIZ();
            this.LLLFFI = motionEvent.getRawY();
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(InterfaceC21631619lC interfaceC21631619lC) {
        this.LLJILJILJ = interfaceC21631619lC;
        LIZLLL();
        invalidate();
    }

    public void setAlphaGradient(boolean z) {
        this.LLLIIL = z;
    }

    public final void setCurrentIndex(int i) {
        this.LLJLLIL = i;
        this.LLJLL = i;
        this.LLJLILLLLZIIL = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z) {
        this.LLJJL = z;
    }

    public void setDividerColor(int i) {
        this.LLJJJJ = i;
        this.LLJILJIL.setColor(i);
    }

    public void setDividerType(EnumC21631519lB enumC21631519lB) {
        this.LL = enumC21631519lB;
    }

    public void setDividerWidth(int i) {
        this.LLJJJJJIL = i;
        this.LLJILJIL.setStrokeWidth(i);
    }

    public void setGravity(int i) {
        this.LLLII = i;
    }

    public void setIsOptions(boolean z) {
        this.LLILZLL = z;
    }

    public void setItemsVisibleCount(int i) {
        if (i % 2 == 0) {
            i++;
        }
        this.LLJZ = i + 2;
    }

    public void setLabel(String str) {
        this.LLJILLL = str;
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.LLJJJJLIIL = f;
            if (f < 1.0f) {
                this.LLJJJJLIIL = 1.0f;
            } else {
                if (f <= 4.0f) {
                    return;
                }
                this.LLJJJJLIIL = 4.0f;
            }
        }
    }

    public void setLocalizeAdapter(InterfaceC1305140k4G interfaceC1305140k4G) {
        this.LLLIILIL = interfaceC1305140k4G;
    }

    public final void setOnItemSelectedListener(InterfaceC21631819lE interfaceC21631819lE) {
        this.LLILZIL = interfaceC21631819lE;
    }

    public void setTextColorCenter(int i) {
        this.LLJJJIL = i;
        this.LLJIJIL.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.LLJJJ = i;
        this.LLJI.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.LLILLJJLI.getResources().getDisplayMetrics().density * f);
            this.LLJJ = i;
            this.LLJI.setTextSize(i);
            this.LLJIJIL.setTextSize(this.LLJJ);
        }
    }

    public void setTextXOffset(int i) {
        this.LLJJIJI = i;
        if (i != 0) {
            this.LLJIJIL.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.LLJLILLLLZIIL = f;
    }

    public final void setTypeface(Typeface typeface) {
        this.LLJJIJIL = typeface;
        this.LLJI.setTypeface(typeface);
        this.LLJIJIL.setTypeface(this.LLJJIJIL);
    }

    public C21631219l8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = true;
        this.LLIZLLLIL = C807400Vlq.LJ();
        this.LLJJIJIL = Typeface.MONOSPACE;
        this.LLJJJJLIIL = 1.6f;
        this.LLJZ = 11;
        this.LLLFF = 0;
        this.LLLFFI = 0.0f;
        this.LLLFZ = 0L;
        this.LLLII = 17;
        this.LLLIIII = 0;
        this.LLLIIIIL = 0;
        this.LLLIIL = false;
        this.LLJJ = getResources().getDimensionPixelSize(R.dimen.a66);
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.LLLIIIL = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.LLLIIIL = 4.0f;
        } else if (2.0f <= f && f < 3.0f) {
            this.LLLIIIL = 6.0f;
        } else if (f >= 3.0f) {
            this.LLLIIIL = f * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lynx_picker, 0, 0);
            this.LLLII = typedArrayObtainStyledAttributes.getInt(R$styleable.lynx_picker_picker_gravity, 17);
            this.LLJJJ = typedArrayObtainStyledAttributes.getColor(R$styleable.lynx_picker_picker_textColorOut, -5723992);
            this.LLJJJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.lynx_picker_picker_textColorCenter, -14013910);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getColor(R$styleable.lynx_picker_picker_dividerColor, -2763307);
            this.LLJJJJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lynx_picker_picker_dividerWidth, 2);
            this.LLJJ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.lynx_picker_picker_textSize, this.LLJJ);
            this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.lynx_picker_picker_lineSpacingMultiplier, this.LLJJJJLIIL);
            typedArrayObtainStyledAttributes.recycle();
        }
        float f2 = this.LLJJJJLIIL;
        if (f2 < 1.0f) {
            this.LLJJJJLIIL = 1.0f;
        } else if (f2 > 4.0f) {
            this.LLJJJJLIIL = 4.0f;
        }
        this.LLILLJJLI = context;
        this.LLILLL = new MessageHandler(this);
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(this) { // from class: X.19l9
            public final C21631219l8 LL;

            {
                this.LL = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, final float f4) {
                final C21631219l8 c21631219l8 = this.LL;
                c21631219l8.LIZ();
                c21631219l8.LLJ = c21631219l8.LLIZLLLIL.scheduleWithFixedDelay(new C0W9W(c21631219l8, f4) { // from class: X.19lF
                    public float LL = 2.1474836E9f;
                    public final float LLILLJJLI;
                    public final C21631219l8 LLILLL;

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
                        C21631219l8 c21631219l82 = this.LLILLL;
                        float f5 = i;
                        c21631219l82.setTotalScrollY(c21631219l82.getTotalScrollY() - f5);
                        C21631219l8 c21631219l83 = this.LLILLL;
                        if (!c21631219l83.LLJJL) {
                            float itemHeight = c21631219l83.getItemHeight();
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
                        C1C7U.LIZ("InertiaTimerTask@77b0.run");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("InertiaTimerTask@77b0.run");
                    }

                    {
                        this.LLILLL = c21631219l8;
                        this.LLILLJJLI = f4;
                    }
                }, 0L, 5L, TimeUnit.MILLISECONDS);
                return true;
            }
        });
        this.LLILZ = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.LLJJL = true;
        this.LLJLILLLLZIIL = 0.0f;
        this.LLJLL = -1;
        Paint paint = new Paint();
        this.LLJI = paint;
        paint.setColor(this.LLJJJ);
        this.LLJI.setAntiAlias(true);
        this.LLJI.setTypeface(this.LLJJIJIL);
        this.LLJI.setTextSize(this.LLJJ);
        Paint paint2 = new Paint();
        this.LLJIJIL = paint2;
        paint2.setColor(this.LLJJJIL);
        this.LLJIJIL.setAntiAlias(true);
        this.LLJIJIL.setTextScaleX(1.1f);
        this.LLJIJIL.setTypeface(this.LLJJIJIL);
        this.LLJIJIL.setTextSize(this.LLJJ);
        Paint paint3 = new Paint();
        this.LLJILJIL = paint3;
        paint3.setColor(this.LLJJJJ);
        this.LLJILJIL.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void LJ(float f, float f2) {
        int i;
        int iAbs;
        int i2 = this.LLJJIJI;
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
        if (this.LLLIIL) {
            iAbs = (int) (((90.0f - Math.abs(f2)) / 90.0f) * 255.0f);
        } else {
            iAbs = 255;
        }
        this.LLJI.setAlpha(iAbs);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLLI = i;
        LIZLLL();
        setMeasuredDimension(this.LLL, this.LLJZIJLIL);
    }
}
