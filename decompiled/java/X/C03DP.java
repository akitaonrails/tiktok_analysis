package X;

import android.view.MotionEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03DP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DP {
    public static final C03DP ControlPointDown;
    public static final C03DP ControlPointDrag;
    public static final C03DP CornerDown;
    public static final C03DP CornerDrag;
    public static final C03DP DoubleClick;
    public static final C03DP FingersDown;
    public static final C03DP FingersMove;
    public static final C03DP FingersRotate;
    public static final C03DP FingersScale;
    public static final /* synthetic */ C03DP[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C03DP LongPress;
    public static final C03DP SingleTap;
    public static final C03DP Up;
    public MotionEvent LL;
    public Long LLILLJJLI;

    public C03DP() {
        throw null;
    }

    public static InterfaceC2044707zh<C03DP> getEntries() {
        return LLILZ;
    }

    static {
        C03DP c03dp = new C03DP("LongPress", 0);
        LongPress = c03dp;
        C03DP c03dp2 = new C03DP("FingersDown", 1);
        FingersDown = c03dp2;
        C03DP c03dp3 = new C03DP("FingersScale", 2);
        FingersScale = c03dp3;
        C03DP c03dp4 = new C03DP("FingersRotate", 3);
        FingersRotate = c03dp4;
        C03DP c03dp5 = new C03DP("FingersMove", 4);
        FingersMove = c03dp5;
        C03DP c03dp6 = new C03DP("CornerDown", 5);
        CornerDown = c03dp6;
        C03DP c03dp7 = new C03DP("CornerDrag", 6);
        CornerDrag = c03dp7;
        C03DP c03dp8 = new C03DP("ControlPointDown", 7);
        ControlPointDown = c03dp8;
        C03DP c03dp9 = new C03DP("ControlPointDrag", 8);
        ControlPointDrag = c03dp9;
        C03DP c03dp10 = new C03DP("Up", 9);
        Up = c03dp10;
        C03DP c03dp11 = new C03DP("SingleTap", 10);
        SingleTap = c03dp11;
        C03DP c03dp12 = new C03DP("DoubleClick", 11);
        DoubleClick = c03dp12;
        C03DP[] c03dpArr = {c03dp, c03dp2, c03dp3, c03dp4, c03dp5, c03dp6, c03dp7, c03dp8, c03dp9, c03dp10, c03dp11, c03dp12};
        LLILLL = c03dpArr;
        LLILZ = new C2254308sP(c03dpArr);
    }

    public static C03DP[] values() {
        return (C03DP[]) LLILLL.clone();
    }

    public final MotionEvent getEvent() {
        return this.LL;
    }

    public final Long getFeatureId() {
        return this.LLILLJJLI;
    }

    public static C03DP valueOf(String str) {
        return (C03DP) C08FF.LIZ(C03DP.class, str);
    }

    public final void setEvent(MotionEvent motionEvent) {
        this.LL = motionEvent;
    }

    public final void setFeatureId(Long l) {
        this.LLILLJJLI = l;
    }

    public C03DP(String str, int i) {
        this.LL = null;
        this.LLILLJJLI = null;
    }
}
