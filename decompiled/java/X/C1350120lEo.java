package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentStaticModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350120lEo extends FrameLayout implements InterfaceC1353130lJf {
    public final Scroller LL;
    public InterfaceC1350130lEp LLILLJJLI;
    public int LLILLL;
    public ViewGroup LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public CommentContextSource LLJI;
    public C1353060lJY LLJIJIL;

    public Pair<Float, Float> getHotpotY() {
        CommentStaticModel staticModel;
        getLocationInWindow(new int[2]);
        CommentContextSource commentContextSource = this.LLJI;
        return new Pair<>(Float.valueOf(r2[1]), Float.valueOf(r2[1] + C11VU.LIZJ((((commentContextSource == null || (staticModel = commentContextSource.getStaticModel()) == null) ? false : staticModel.getHasHeaderAnchor()) && C288650BTb.LIZ()) ? 105.0d : 60.0d, getContext())));
    }

    @Override // android.view.View
    public final void computeScroll() {
        InterfaceC1350130lEp interfaceC1350130lEp;
        if (!this.LL.computeScrollOffset()) {
            if (this.LLJ || (interfaceC1350130lEp = this.LLILLJJLI) == null) {
                return;
            }
            interfaceC1350130lEp.LIZIZ();
            return;
        }
        int currY = this.LL.getCurrY();
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            C1351950lHl.LJIJI(currY, viewGroup);
        }
        InterfaceC1350130lEp interfaceC1350130lEp2 = this.LLILLJJLI;
        if (interfaceC1350130lEp2 != null) {
            interfaceC1350130lEp2.LIZJ();
        }
        invalidate();
    }

    @Override // X.InterfaceC1353130lJf
    public final void LIZ(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        int i;
        int height;
        int height2;
        int height3;
        int height4;
        int height5;
        int height6;
        float translationY;
        float translationY2;
        float translationY3;
        int height7;
        int height8;
        if (this.LLILZ == null || motionEvent == null) {
            return false;
        }
        if (C288650BTb.LIZ()) {
            i = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            i = 500;
        }
        float rawY = (motionEvent.getRawY() - this.LLILZLL) / ((System.currentTimeMillis() - this.LLIZ) / 1000.0f);
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            height = viewGroup.getHeight();
        } else {
            height = 0;
        }
        if (rawY > i) {
            if (C288650BTb.LIZ()) {
                C1353060lJY c1353060lJY = this.LLJIJIL;
                if (c1353060lJY != null) {
                    c1353060lJY.LIZJ("slide_down", false, false);
                }
            } else {
                Scroller scroller = this.LL;
                int i2 = this.LLILLL;
                ViewGroup viewGroup2 = this.LLILZ;
                if (viewGroup2 != null) {
                    height8 = viewGroup2.getHeight();
                } else {
                    height8 = 0;
                }
                scroller.startScroll(0, height, 0, i2 - height8);
                invalidate();
                if (this.LLIZLLLIL == 9) {
                    InterfaceC1350130lEp interfaceC1350130lEp = this.LLILLJJLI;
                    if (interfaceC1350130lEp != null) {
                        interfaceC1350130lEp.LIZ();
                    }
                    this.LLIZLLLIL = 5;
                    return true;
                }
            }
            return true;
        }
        if (rawY < (-i)) {
            int iIntValue = ((Number) C473380IhM.LIZ(C1388190mED.LIZ(getContext())).getSecond()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            Scroller scroller2 = this.LL;
            ViewGroup viewGroup3 = this.LLILZ;
            if (viewGroup3 != null) {
                height7 = viewGroup3.getHeight();
            } else {
                height7 = 0;
            }
            scroller2.startScroll(0, height, 0, iIntValue - height7);
            invalidate();
            if (this.LLIZLLLIL == 5) {
                InterfaceC1350130lEp interfaceC1350130lEp2 = this.LLILLJJLI;
                if (interfaceC1350130lEp2 != null) {
                    interfaceC1350130lEp2.LIZLLL();
                }
                this.LLIZLLLIL = 9;
            }
            return true;
        }
        if (C288650BTb.LIZ()) {
            C1353060lJY c1353060lJY2 = this.LLJIJIL;
            if (c1353060lJY2 != null) {
                translationY = c1353060lJY2.getTranslationY();
            } else {
                translationY = 0.0f;
            }
            if (Math.abs(translationY) > this.LLILLL / 2) {
                C1353060lJY c1353060lJY3 = this.LLJIJIL;
                if (c1353060lJY3 != null) {
                    c1353060lJY3.LIZJ("slide_down", false, false);
                }
                return true;
            }
            C1353060lJY c1353060lJY4 = this.LLJIJIL;
            if (c1353060lJY4 != null) {
                translationY2 = c1353060lJY4.getTranslationY();
            } else {
                translationY2 = 0.0f;
            }
            if (Math.abs(translationY2) < this.LLILLL / 2) {
                C1353060lJY c1353060lJY5 = this.LLJIJIL;
                if (c1353060lJY5 != null) {
                    translationY3 = c1353060lJY5.getTranslationY();
                } else {
                    translationY3 = 0.0f;
                }
                if (Math.abs(translationY3) > 0.0f) {
                    C1353060lJY c1353060lJY6 = this.LLJIJIL;
                    if (c1353060lJY6 != null) {
                        c1353060lJY6.LIZJ("slide_down", true, false);
                    }
                    return true;
                }
            }
        }
        int iIntValue2 = (((Number) C473380IhM.LIZ(C1388190mED.LIZ(getContext())).getSecond()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - this.LLILLL;
        ViewGroup viewGroup4 = this.LLILZ;
        if (viewGroup4 != null) {
            height2 = viewGroup4.getHeight();
        } else {
            height2 = 0;
        }
        if (height2 - this.LLILLL > iIntValue2 / 2) {
            int iIntValue3 = ((Number) C473380IhM.LIZ(C1388190mED.LIZ(getContext())).getSecond()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            Scroller scroller3 = this.LL;
            ViewGroup viewGroup5 = this.LLILZ;
            if (viewGroup5 != null) {
                height5 = viewGroup5.getHeight();
            } else {
                height5 = 0;
            }
            ViewGroup viewGroup6 = this.LLILZ;
            if (viewGroup6 != null) {
                height6 = viewGroup6.getHeight();
            } else {
                height6 = 0;
            }
            scroller3.startScroll(0, height5, 0, iIntValue3 - height6);
            invalidate();
            if (this.LLIZLLLIL == 5) {
                InterfaceC1350130lEp interfaceC1350130lEp3 = this.LLILLJJLI;
                if (interfaceC1350130lEp3 != null) {
                    interfaceC1350130lEp3.LIZLLL();
                }
                this.LLIZLLLIL = 9;
            }
        } else {
            Scroller scroller4 = this.LL;
            ViewGroup viewGroup7 = this.LLILZ;
            if (viewGroup7 != null) {
                height3 = viewGroup7.getHeight();
            } else {
                height3 = 0;
            }
            int i3 = this.LLILLL;
            ViewGroup viewGroup8 = this.LLILZ;
            if (viewGroup8 != null) {
                height4 = viewGroup8.getHeight();
            } else {
                height4 = 0;
            }
            scroller4.startScroll(0, height3, 0, i3 - height4);
            invalidate();
            if (this.LLIZLLLIL == 9) {
                InterfaceC1350130lEp interfaceC1350130lEp4 = this.LLILLJJLI;
                if (interfaceC1350130lEp4 != null) {
                    interfaceC1350130lEp4.LIZ();
                }
                this.LLIZLLLIL = 5;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350120lEo.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCatchView(ViewGroup viewGroup) {
        this.LLILZ = viewGroup;
    }

    public final void setContextSource(CommentContextSource commentContextSource) {
        if (commentContextSource != null) {
            this.LLJI = commentContextSource;
        }
    }

    public final void setNestedLayout(C1353060lJY c1353060lJY) {
        if (c1353060lJY == null) {
            return;
        }
        this.LLJIJIL = c1353060lJY;
    }

    public final void setOnGrabHeightChangeListener(InterfaceC1350130lEp interfaceC1350130lEp) {
        this.LLILLJJLI = interfaceC1350130lEp;
    }

    public C1350120lEo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Scroller(context);
        this.LLIZ = System.currentTimeMillis();
        this.LLIZLLLIL = 5;
    }

    @Override // X.InterfaceC1353130lJf
    public final boolean LIZIZ(MotionEvent motionEvent, Boolean bool) {
        if (((Number) C288640BTa.LIZ.getValue()).intValue() != 2) {
            return false;
        }
        if (C288650BTb.LIZ()) {
            if (motionEvent.getRawY() <= getHotpotY().getFirst().floatValue() || motionEvent.getRawY() >= getHotpotY().getSecond().floatValue()) {
                return false;
            }
        } else if (motionEvent.getRawY() <= getHotpotY().getFirst().floatValue() || motionEvent.getRawY() >= getHotpotY().getSecond().floatValue()) {
            if (this.LLIZLLLIL == 9 && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
