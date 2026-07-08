package X;

import Y.ARunnableS128S0100000_28;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.126G, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C126G extends RelativeLayout implements View.OnClickListener {
    public final C21586019dq LL;
    public final ViewConfiguration LLILLJJLI;
    public final View LLILLL;
    public boolean LLILZ;
    public final WeakHandler LLILZIL;
    public final Intent LLILZLL;
    public final long LLIZ;
    public final int LLIZLLLIL;
    public final long LLJ;
    public final boolean LLJI;
    public final ImageView LLJIJIL;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public final JSONObject LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public RunnableC19393110u1 LLJJIII;
    public final ARunnableS128S0100000_28 LLJJIJI;
    public final ARunnableS128S0100000_28 LLJJIJIIJIL;

    public void setDismissListener(InterfaceC1869960ylG interfaceC1869960ylG) {
    }

    public final void LIZ() {
        View view = this.LLILLL;
        if (view != null) {
            view.animate().translationY(-this.LLILLL.getHeight()).setDuration(300L).start();
        }
        C786410Ut5.LJLIIL(300L, this.LLILZIL, this.LLJJIJIIJIL);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LL.LJIIIIZZ()) {
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            this.LL.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZ) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS129S0100000_29(this, 179));
            this.LLILZ = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = getContext();
        Intent intent = this.LLILZLL;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxtnxNqeAClHfmlmNaGHmO9q+UPY2xyBN/X", null));
        new C815520Vyw(getContext()).LIZIZ(C814730Vxf.getShortMsgID(this.LLIZ), "app_notify_ame");
        this.LLILZIL.removeCallbacks(this.LLJJIJI);
        LIZ();
        C814850Vxr.LIZJ(getContext(), "news_notify_anim_push_click", this.LLIZ, this.LLIZLLLIL, this.LLJILLL);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LL.LJIJJ(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLILZIL.removeCallbacks(this.LLJJIJI);
        this.LL.LJIILIIL(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LLJJIII = null;
                    }
                } else if (Math.abs(x - this.LLJJ) >= this.LLILLJJLI.getScaledTouchSlop() || Math.abs(y - this.LLJJI) >= this.LLILLJJLI.getScaledTouchSlop()) {
                    this.LLJJIII = null;
                    return true;
                }
                return true;
            }
            if (Math.abs(x - this.LLJJ) < this.LLILLJJLI.getScaledTouchSlop() && Math.abs(y - this.LLJJI) < this.LLILLJJLI.getScaledTouchSlop()) {
                RunnableC19393110u1 runnableC19393110u1 = this.LLJJIII;
                if (runnableC19393110u1 != null) {
                    runnableC19393110u1.run();
                }
            } else {
                this.LLJJIII = null;
            }
            this.LLJJIII = null;
            return true;
        }
        this.LLJJ = x;
        this.LLJJI = y;
        this.LLJJIII = new RunnableC19393110u1(this);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126G(int i, int i2, long j, Context context, Intent intent, Bitmap bitmap, C814730Vxf c814730Vxf) {
        int i3;
        String strLIZIZ;
        String strLIZIZ2;
        View.OnClickListener fVar;
        int i4;
        int i5;
        super(context);
        long j2 = j;
        this.LLILZ = true;
        this.LLILZIL = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() { // from class: X.10uN
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
            }
        });
        this.LLJJIJI = new ARunnableS128S0100000_28(this, 101);
        this.LLJJIJIIJIL = new ARunnableS128S0100000_28(this, 102);
        this.LLILZLL = intent;
        this.LLIZLLLIL = i;
        this.LLJILJILJ = i2;
        this.LLIZ = c814730Vxf.id;
        this.LLJ = j2 <= 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j2;
        this.LLJI = "oppo".equalsIgnoreCase(Build.BRAND);
        this.LLJILJIL = true;
        try {
            JSONObject jSONObject = new JSONObject();
            this.LLJILLL = jSONObject;
            jSONObject.put("isWindowMode", 1);
            if (intent.getBooleanExtra("message_with_pic", false)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject.put("with_pic", i4);
            if (intent.getBooleanExtra("message_download_pic", false)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject.put("download_pic", i5);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String string = c814730Vxf.title;
        string = TextUtils.isEmpty(string) ? context.getString(R.string.drg) : string;
        if (this.LLJI && C809970Vpz.LJFF().LJIIL <= 0) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.du3, this, false);
            this.LLILLL = viewTd;
            ((TextView) viewTd.findViewById(R.id.time)).setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date()));
            ((TextView) viewTd.findViewById(R.id.title)).setText(string);
            ((TextView) viewTd.findViewById(R.id.desc)).setText(c814730Vxf.text);
        } else {
            int i6 = this.LLJILJILJ;
            if ((i6 == 11 || i6 == 21) && bitmap != null && !c814730Vxf.functionalPush) {
                Calendar calendar = Calendar.getInstance();
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
                if (this.LLJILJILJ == 11) {
                    i3 = R.layout.ek8;
                } else {
                    i3 = R.layout.ek9;
                }
                View viewTd2 = C786410Ut5.Td(layoutInflaterNe, i3, this, false);
                this.LLILLL = viewTd2;
                if (this.LLJILJILJ == 21) {
                    ((TextView) viewTd2.findViewById(R.id.title)).setText(string);
                }
                TextView textView = (TextView) viewTd2.findViewById(R.id.time);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                int i7 = calendar.get(11);
                if (i7 > 9) {
                    strLIZIZ = String.valueOf(i7);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(CardStruct.IStatusCode.DEFAULT);
                    sbLIZ2.append(i7);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(":");
                int i8 = calendar.get(12);
                if (i8 > 9) {
                    strLIZIZ2 = String.valueOf(i8);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(CardStruct.IStatusCode.DEFAULT);
                    sbLIZ3.append(i8);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                sbLIZ.append(strLIZIZ2);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                ((TextView) viewTd2.findViewById(R.id.txt_res_0x7f0a8efa)).setText(c814730Vxf.text);
                ((TextView) viewTd2.findViewById(R.id.title)).setText(string);
            } else {
                View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dt9, this, false);
                this.LLILLL = viewTd3;
                ((TextView) viewTd3.findViewById(R.id.title)).setText(string);
                ((TextView) viewTd3.findViewById(R.id.desc)).setText(c814730Vxf.text);
            }
        }
        addView(this.LLILLL);
        ImageView imageView = (ImageView) findViewById(R.id.kfu);
        this.LLJIJIL = imageView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.c6m);
        }
        this.LL = C21586019dq.LJIIIZ(this, new AbstractC21586119dr() { // from class: X.126H
            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i9, int i10) {
                return i9;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewHorizontalDragRange(View view) {
                return view.getWidth();
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i9) {
                if (view == this.LIZ.LLILLL) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int width;
                if (Math.abs(f) <= this.LIZ.LLILLJJLI.getScaledMaximumFlingVelocity() / 5 && Math.abs(view.getLeft()) < this.LIZ.getWidth() * 0.2f) {
                    this.LIZ.LL.LJIJJLI(0, 0, view);
                    C126G c126g = this.LIZ;
                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, c126g.LLILZIL, c126g.LLJJIJI);
                } else {
                    C126G c126g2 = this.LIZ;
                    C21586019dq c21586019dq = c126g2.LL;
                    if (f > 0.0f) {
                        width = c126g2.getWidth();
                    } else {
                        width = -c126g2.getWidth();
                    }
                    c21586019dq.LJIJJLI(width, 0, view);
                    C126G c126g3 = this.LIZ;
                    new C815520Vyw(c126g3.getContext()).LIZIZ(C814730Vxf.getShortMsgID(c126g3.LLIZ), "app_notify_ame");
                    C126G c126g4 = this.LIZ;
                    C786410Ut5.LJLIIL(300L, c126g4.LLILZIL, c126g4.LLJJIJIIJIL);
                }
                this.LIZ.postInvalidate();
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i9, int i10, int i11, int i12) {
                C126G c126g = this.LIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c126g);
                c126g.setAlpha(1.0f - (Math.abs(i9) / this.LIZ.getWidth()));
            }
        });
        this.LLILLJJLI = ViewConfiguration.get(context);
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
