package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759612Ss extends FrameLayout implements InterfaceC19755712Rf {
    public C19759812Su LL;
    public C384240F4s LLILLJJLI;
    public C384240F4s LLILLL;
    public final Stack<Point> LLILZ;
    public C12T7 LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> LLJ;
    public Function1<? super EnumC1087350eOz, Unit> LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;

    @Override // X.InterfaceC19755712Rf
    public final void LIZIZ() {
        ArrayList arrayList = new ArrayList();
        for (Point point : this.LLILZ) {
            ArrayList arrayList2 = new ArrayList();
            if (this.LLJILJIL) {
                arrayList2.add(Float.valueOf((this.LLJIJIL - this.LLIZ) - ((point.getX() / this.LLILZLL) * getMaxScrollWidth())));
                arrayList2.add(Float.valueOf((this.LLJIJIL - this.LLIZ) - ((point.getY() / this.LLILZLL) * getMaxScrollWidth())));
            } else {
                arrayList2.add(Float.valueOf((point.getX() / this.LLILZLL) * getMaxScrollWidth()));
                arrayList2.add(Float.valueOf((point.getY() / this.LLILZLL) * getMaxScrollWidth()));
            }
            arrayList.add(arrayList2);
        }
        C384240F4s c384240F4s = this.LLILLL;
        if (c384240F4s == null) {
            c384240F4s = null;
        }
        if (c384240F4s.getPainter() == null) {
            C384240F4s c384240F4s2 = this.LLILLL;
            if (c384240F4s2 == null) {
                c384240F4s2 = null;
            }
            final Context context = getContext();
            c384240F4s2.setPainter(new C383840F3e(context) { // from class: X.0F3f
                public final Context LJFF;
                public final Paint LJI;
                public final C01GW LJII;

                {
                    this.LJFF = context;
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    this.LJI = paint;
                    this.LJII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(49));
                }

                @Override // X.InterfaceC383900F3k
                public final void LIZIZ(Canvas canvas, View view, int i, int i2, List<Pair<Long, Float>> list, List<List<Float>> list2) {
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
        C384240F4s c384240F4s3 = this.LLILLL;
        (c384240F4s3 != null ? c384240F4s3 : null).setWavePointList(arrayList);
        invalidate();
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LIZLLL() {
        if (this.LLILZ.empty()) {
            return null;
        }
        Point pointPop = this.LLILZ.pop();
        LIZIZ();
        return pointPop;
    }

    public final void LJFF() {
        int i = this.LLJIJIL;
        C384240F4s c384240F4s = this.LLILLJJLI;
        if (c384240F4s == null) {
            c384240F4s = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c384240F4s.getLayoutParams();
        marginLayoutParams.setMarginStart(i);
        C384240F4s c384240F4s2 = this.LLILLJJLI;
        if (c384240F4s2 == null) {
            c384240F4s2 = null;
        }
        C786410Ut5.m7(c384240F4s2, marginLayoutParams);
        C384240F4s c384240F4s3 = this.LLILLL;
        if (c384240F4s3 == null) {
            c384240F4s3 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c384240F4s3.getLayoutParams();
        marginLayoutParams2.setMarginStart(i);
        C384240F4s c384240F4s4 = this.LLILLL;
        C786410Ut5.m7(c384240F4s4 != null ? c384240F4s4 : null, marginLayoutParams2);
    }

    public final int getMaxScrollWidth() {
        C19560811fy c19560811fy;
        C12T7 c12t7 = this.LLILZIL;
        if (c12t7 == null || (c19560811fy = c12t7.LIZIZ) == null) {
            return 0;
        }
        return c19560811fy.LJ * c19560811fy.LIZLLL;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILLJJLI = (C384240F4s) findViewById(R.id.ptc);
        this.LLILLL = (C384240F4s) findViewById(R.id.sy7);
        this.LL = (C19759812Su) findViewById(R.id.dt4);
        LJFF();
        C19759812Su c19759812Su = this.LL;
        if (c19759812Su == null) {
            c19759812Su = null;
        }
        c19759812Su.setOnScrollListener(new C12T8() { // from class: X.12Sw
            @Override // X.C12T8
            public final void LIZ(int i) {
                EnumC1087350eOz enumC1087350eOz;
                C19759612Ss c19759612Ss = this.LIZ;
                Function1<? super EnumC1087350eOz, Unit> function1 = c19759612Ss.LLJI;
                if (function1 != null) {
                    c19759612Ss.getClass();
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                enumC1087350eOz = EnumC1087350eOz.IDLE;
                            } else {
                                enumC1087350eOz = EnumC1087350eOz.SETTLING;
                            }
                        } else {
                            enumC1087350eOz = EnumC1087350eOz.DRAGGING;
                        }
                    } else {
                        enumC1087350eOz = EnumC1087350eOz.IDLE;
                    }
                    function1.invoke(enumC1087350eOz);
                }
            }

            @Override // X.C12T8
            public final void LIZIZ(int i, int i2, boolean z) {
                C19759612Ss c19759612Ss = this.LIZ;
                c19759612Ss.LLIZ += i;
                c19759612Ss.LLIZLLLIL += i2;
                C384240F4s c384240F4s = null;
                if (!c19759612Ss.LLJILJIL) {
                    C384240F4s c384240F4s2 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s2 == null) {
                        c384240F4s2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c384240F4s2.getLayoutParams();
                    marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() - i);
                    C384240F4s c384240F4s3 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s3 == null) {
                        c384240F4s3 = null;
                    }
                    C786410Ut5.m7(c384240F4s3, marginLayoutParams);
                    C384240F4s c384240F4s4 = c19759612Ss.LLILLL;
                    if (c384240F4s4 == null) {
                        c384240F4s4 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c384240F4s4.getLayoutParams();
                    marginLayoutParams2.setMarginStart(marginLayoutParams2.getMarginStart() - i);
                    C384240F4s c384240F4s5 = c19759612Ss.LLILLL;
                    if (c384240F4s5 == null) {
                        c384240F4s5 = null;
                    }
                    C786410Ut5.m7(c384240F4s5, marginLayoutParams2);
                    C384240F4s c384240F4s6 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s6 == null) {
                        c384240F4s6 = null;
                    }
                    int i3 = c19759612Ss.LLIZ;
                    int maxScrollWidth = c19759612Ss.getMaxScrollWidth();
                    c384240F4s6.LLILZ = i3;
                    c384240F4s6.LLILZIL = maxScrollWidth;
                    c384240F4s6.invalidate();
                    C384240F4s c384240F4s7 = c19759612Ss.LLILLL;
                    if (c384240F4s7 != null) {
                        c384240F4s = c384240F4s7;
                    }
                    int i4 = c19759612Ss.LLIZ;
                    int maxScrollWidth2 = c19759612Ss.getMaxScrollWidth();
                    c384240F4s.LLILZ = i4;
                    c384240F4s.LLILZIL = maxScrollWidth2;
                    c384240F4s.invalidate();
                } else {
                    C384240F4s c384240F4s8 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s8 == null) {
                        c384240F4s8 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c384240F4s8.getLayoutParams();
                    marginLayoutParams3.setMarginStart(marginLayoutParams3.getMarginStart() + i);
                    C384240F4s c384240F4s9 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s9 == null) {
                        c384240F4s9 = null;
                    }
                    C786410Ut5.m7(c384240F4s9, marginLayoutParams3);
                    C384240F4s c384240F4s10 = c19759612Ss.LLILLL;
                    if (c384240F4s10 == null) {
                        c384240F4s10 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) c384240F4s10.getLayoutParams();
                    marginLayoutParams4.setMarginStart(marginLayoutParams4.getMarginStart() + i);
                    C384240F4s c384240F4s11 = c19759612Ss.LLILLL;
                    if (c384240F4s11 == null) {
                        c384240F4s11 = null;
                    }
                    C786410Ut5.m7(c384240F4s11, marginLayoutParams4);
                    C384240F4s c384240F4s12 = c19759612Ss.LLILLJJLI;
                    if (c384240F4s12 == null) {
                        c384240F4s12 = null;
                    }
                    int i5 = -c19759612Ss.LLIZ;
                    int maxScrollWidth3 = c19759612Ss.getMaxScrollWidth();
                    c384240F4s12.LLILZ = i5;
                    c384240F4s12.LLILZIL = maxScrollWidth3;
                    c384240F4s12.invalidate();
                    C384240F4s c384240F4s13 = c19759612Ss.LLILLL;
                    if (c384240F4s13 != null) {
                        c384240F4s = c384240F4s13;
                    }
                    int i6 = -c19759612Ss.LLIZ;
                    int maxScrollWidth4 = c19759612Ss.getMaxScrollWidth();
                    c384240F4s.LLILZ = i6;
                    c384240F4s.LLILZIL = maxScrollWidth4;
                    c384240F4s.invalidate();
                }
                c19759612Ss.LIZIZ();
                C19759612Ss c19759612Ss2 = this.LIZ;
                if (c19759612Ss2.LLJILJIL) {
                    InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq = c19759612Ss2.LLJ;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(Integer.valueOf(-c19759612Ss2.LLIZ), Integer.valueOf(this.LIZ.LLIZLLLIL), Boolean.valueOf(z));
                        return;
                    }
                    return;
                }
                InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq2 = c19759612Ss2.LLJ;
                if (interfaceC1631620sYq2 == null) {
                    return;
                }
                interfaceC1631620sYq2.invoke(Integer.valueOf(c19759612Ss2.LLIZ), Integer.valueOf(this.LIZ.LLIZLLLIL), Boolean.valueOf(z));
            }
        });
    }

    public final long getDuration() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19755712Rf
    public Stack<Point> getStack() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZJ(int i) {
        if (i >= this.LLILZLL - 1) {
            return i;
        }
        for (Point point : this.LLILZ) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LJ(int i) {
        return this.LLILZ.push(new Point(i, i, System.currentTimeMillis()));
    }

    @Override // X.InterfaceC19755712Rf
    public final void LJIILL(float f) {
        float maxScrollWidth = f * getMaxScrollWidth();
        if (this.LLJILJIL) {
            maxScrollWidth = -maxScrollWidth;
        }
        int i = (int) maxScrollWidth;
        int i2 = i - this.LLIZ;
        C19759812Su c19759812Su = this.LL;
        RecyclerView recyclerView = null;
        if (c19759812Su == null) {
            c19759812Su = null;
        }
        RecyclerView recyclerView2 = c19759812Su.LLILLJJLI;
        if (recyclerView2 != null) {
            recyclerView = recyclerView2;
        }
        recyclerView.scrollBy(i2, 0);
        this.LLIZ = i;
        LIZIZ();
    }

    public final void setRecording(boolean z) {
        C19759812Su c19759812Su = null;
        if (z) {
            C19759812Su c19759812Su2 = this.LL;
            if (c19759812Su2 != null) {
                c19759812Su = c19759812Su2;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19759812Su);
            c19759812Su.setAlpha(0.5f);
            return;
        }
        C19759812Su c19759812Su3 = this.LL;
        if (c19759812Su3 != null) {
            c19759812Su = c19759812Su3;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19759812Su);
        c19759812Su.setAlpha(1.0f);
    }

    @Override // X.InterfaceC19755712Rf
    public void setStack(Stack<Point> stack) {
        this.LLILZ.clear();
        if (!C086I.LIZIZ(stack)) {
            this.LLILZ.addAll(stack);
        }
        LIZIZ();
    }

    public C19759612Ss(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new Stack<>();
        this.LLJIJIL = C0FUC.LIZJ() / 2;
        this.LLJILJIL = C444960Hcc.LIZIZ();
        FrameLayout.inflate(context, R.layout.epf, this);
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZ(int i, Point point) {
        int x;
        if (point != null) {
            x = point.getX();
        } else {
            x = i;
        }
        for (Point point2 : this.LLILZ) {
            if (point2.getX() >= x && i >= point2.getX() && i <= point2.getY() && !Intrinsics.LJFF(point2, point)) {
                return point2.getX();
            }
        }
        return -1;
    }
}
