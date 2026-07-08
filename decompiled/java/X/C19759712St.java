package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759712St extends C12TH implements InterfaceC19755712Rf {
    public C0H6D LLJI;
    public C384220F4q LLJIJIL;
    public C384220F4q LLJILJIL;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super EnumC1090580eUC, Unit> LLJILJILJ;
    public Function2<? super Integer, ? super Boolean, Unit> LLJILLL;
    public final Stack<Point> LLJJ;
    public C12T7 LLJJI;
    public final AwS643S0100000_29 LLJJIII;

    @Override // X.C12TH
    public final void LJFF() {
    }

    @Override // X.InterfaceC19755712Rf
    public final void LIZIZ() {
        ArrayList arrayList = new ArrayList();
        for (Point point : this.LLJJ) {
            ArrayList arrayList2 = new ArrayList();
            if (C444960Hcc.LIZJ(getContext())) {
                arrayList2.add(Float.valueOf(getMaxScrollWidth() - LJIIIIZZ(point.getX())));
                arrayList2.add(Float.valueOf(getMaxScrollWidth() - LJIIIIZZ(point.getY())));
            } else {
                arrayList2.add(Float.valueOf(LJIIIIZZ(point.getX())));
                arrayList2.add(Float.valueOf(LJIIIIZZ(point.getY())));
            }
            arrayList.add(arrayList2);
        }
        C384220F4q c384220F4q = this.LLJILJIL;
        if (c384220F4q == null) {
            c384220F4q = null;
        }
        if (c384220F4q.getPainter() == null) {
            C384220F4q c384220F4q2 = this.LLJILJIL;
            if (c384220F4q2 == null) {
                c384220F4q2 = null;
            }
            final Context context = getContext();
            c384220F4q2.setPainter(new C383880F3i(context) { // from class: X.0F3j
                public final Context LJFF;
                public final Paint LJI;
                public final C01GW LJII;

                {
                    this.LJFF = context;
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    this.LJI = paint;
                    this.LJII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(48));
                }

                @Override // X.InterfaceC384230F4r
                public final void LIZIZ(Canvas canvas, View view, List<Pair<Long, Float>> list, List<List<Float>> list2) {
                    int iIntValue;
                    ArrayList<List> arrayList3 = (ArrayList) list2;
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    canvas.save();
                    for (List list3 : arrayList3) {
                        Paint paint = this.LJI;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, this.LJFF);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        paint.setColor(iIntValue);
                        this.LJI.setAlpha(127);
                        ((RectF) this.LJII.getValue()).set(((Number) C13LP.LJJJJZI(list3)).floatValue(), 0.0f, ((Number) C13LP.LJJLIIIJJI(list3)).floatValue(), view.getMeasuredHeight());
                        canvas.drawRoundRect((RectF) this.LJII.getValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), this.LJI);
                    }
                    canvas.restore();
                }
            });
        }
        C384220F4q c384220F4q3 = this.LLJILJIL;
        (c384220F4q3 != null ? c384220F4q3 : null).setWavePointList(arrayList);
        invalidate();
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LIZLLL() {
        if (this.LLJJ.empty()) {
            return null;
        }
        Point pointPop = this.LLJJ.pop();
        LIZIZ();
        return pointPop;
    }

    public final int getMaxScrollWidth() {
        C384220F4q c384220F4q = this.LLJIJIL;
        if (c384220F4q == null) {
            c384220F4q = null;
        }
        return c384220F4q.getMeasuredWidth();
    }

    public final long getDuration() {
        return getTotalDuration();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int iLIZJ = C0FUC.LIZJ() / 2;
        this.LLJIJIL = (C384220F4q) findViewById(R.id.ptc);
        this.LLJILJIL = (C384220F4q) findViewById(R.id.sy7);
        C0H6D c0h6d = (C0H6D) findViewById(R.id.dt4);
        this.LLJI = c0h6d;
        if (c0h6d == null) {
            c0h6d = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0h6d.getLayoutParams();
        marginLayoutParams.setMarginStart(iLIZJ);
        C0H6D c0h6d2 = this.LLJI;
        C0H6D c0h6d3 = c0h6d2 != null ? c0h6d2 : null;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0h6d3);
        c0h6d3.setLayoutParams(marginLayoutParams);
        setScrollChangeListener(this.LLJJIII);
    }

    public final Function2<Integer, Integer, Unit> getOnScrollChangeListener() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC19755712Rf
    public Stack<Point> getStack() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZJ(int i) {
        if (i >= getTotalDuration() - 1) {
            return i;
        }
        for (Point point : this.LLJJ) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LJ(int i) {
        return this.LLJJ.push(new Point(i, i, System.currentTimeMillis()));
    }

    public final float LJIIIIZZ(float f) {
        return (f / getTotalDuration()) * getMaxScrollWidth();
    }

    @Override // X.InterfaceC19755712Rf
    public final void LJIILL(float f) {
        float maxScrollWidth = f * getMaxScrollWidth();
        if (C444960Hcc.LIZJ(getContext())) {
            maxScrollWidth = -maxScrollWidth;
        }
        scrollTo((int) maxScrollWidth, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setOnScrollStateChanged(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super EnumC1090580eUC, Unit> interfaceC1631620sYq) {
        this.LLJILJILJ = interfaceC1631620sYq;
        if (getParent() instanceof C12TI) {
            ((C12TI) getParent()).setOnScrollStateChangeListener(new C12TE() { // from class: X.12Sx
                @Override // X.C12TE
                public final void LIZ(int i, EnumC1090580eUC enumC1090580eUC) {
                    InterfaceC1631620sYq<? super Integer, ? super Integer, ? super EnumC1090580eUC, Unit> interfaceC1631620sYq2 = this.LIZ.LLJILJILJ;
                    if (interfaceC1631620sYq2 != null) {
                        interfaceC1631620sYq2.invoke(Integer.valueOf(i), 0, enumC1090580eUC);
                    }
                }
            });
        }
    }

    public final void setRecording(boolean z) {
        C0H6D c0h6d = null;
        if (z) {
            C0H6D c0h6d2 = this.LLJI;
            if (c0h6d2 != null) {
                c0h6d = c0h6d2;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0h6d);
            c0h6d.setAlpha(0.5f);
            return;
        }
        C0H6D c0h6d3 = this.LLJI;
        if (c0h6d3 != null) {
            c0h6d = c0h6d3;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0h6d);
        c0h6d.setAlpha(1.0f);
    }

    public final void setScrollListener(Function2<? super Integer, ? super Boolean, Unit> function2) {
        this.LLJILLL = function2;
    }

    @Override // X.InterfaceC19755712Rf
    public void setStack(Stack<Point> stack) {
        this.LLJJ.clear();
        if (!C086I.LIZIZ(stack)) {
            this.LLJJ.addAll(stack);
        }
        LIZIZ();
    }

    public C19759712St(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJ = new Stack<>();
        FrameLayout.inflate(context, R.layout.env, this);
        this.LLJJIII = new AwS643S0100000_29(this, 32);
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZ(int i, Point point) {
        int x;
        if (point != null) {
            x = point.getX();
        } else {
            x = i;
        }
        for (Point point2 : this.LLJJ) {
            if (point2.getX() >= x && i >= point2.getX() && i <= point2.getY() && !Intrinsics.LJFF(point2, point)) {
                return point2.getX();
            }
        }
        return -1;
    }
}
