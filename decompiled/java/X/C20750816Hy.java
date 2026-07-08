package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.16Hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750816Hy extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onDoubleTap$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        return false;
    }

    public static final boolean onDown$1(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onSingleTapUp$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onDoubleTap(motionEvent) : onDoubleTap$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onDoubleTapEvent(motionEvent) : onDoubleTapEvent$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onDown$0(this, motionEvent);
            case 1:
            default:
                return super.onDown(motionEvent);
            case 2:
                return onDown$1(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.$t) {
            case 0:
                return onFling$0(this, motionEvent, motionEvent2, f, f2);
            case 1:
                return onFling$1(this, motionEvent, motionEvent2, f, f2);
            case 2:
                return onFling$2(this, motionEvent, motionEvent2, f, f2);
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.$t != 0) {
            super.onLongPress(motionEvent);
        } else {
            onLongPress$0(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.$t != 0 ? super.onScroll(motionEvent, motionEvent2, f, f2) : onScroll$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onSingleTapConfirmed(motionEvent) : onSingleTapConfirmed$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                return onSingleTapUp$0(this, motionEvent);
            case 2:
                return onSingleTapUp$1(this, motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public C20750816Hy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTapEvent$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        C16FA c16fa = (C16FA) c20750816Hy.l0;
        c16fa.LJJJJJ(c16fa.LLJJJJ, 3);
        return true;
    }

    public static final boolean onDown$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        C16FA c16fa = (C16FA) c20750816Hy.l0;
        c16fa.LLJJJJ = motionEvent;
        return c16fa.LJJJJJ(motionEvent, 0);
    }

    public static final void onLongPress$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        View view;
        View view2;
        View view3;
        C16FA c16fa = (C16FA) c20750816Hy.l0;
        c16fa.LJJJJJ(c16fa.LLJJJJ, 3);
        Object parent = ((C16FA) c20750816Hy.l0).getParent();
        Object parent2 = null;
        if ((parent instanceof View) && (view3 = (View) parent) != null) {
            view3.performLongClick();
        }
        Object parent3 = ((C16FA) c20750816Hy.l0).getParent();
        if ((parent3 instanceof View) && (view2 = (View) parent3) != null) {
            parent2 = view2.getParent();
        }
        if ((parent2 instanceof View) && (view = (View) parent2) != null) {
            view.performLongClick();
        }
    }

    public static final boolean onSingleTapConfirmed$0(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        return ((C16FA) c20750816Hy.l0).LJJJJJ(motionEvent, 1);
    }

    public static final boolean onSingleTapUp$1(C20750816Hy c20750816Hy, MotionEvent motionEvent) {
        C20580115fz c20580115fz;
        C20584715gj c20584715gj;
        C20580115fz c20580115fz2;
        C20584715gj c20584715gj2;
        int itemCount;
        if (motionEvent == null) {
            return super.onSingleTapUp(motionEvent);
        }
        C20580115fz c20580115fz3 = ((StoryThoughtAvatarCreationFragment) c20750816Hy.l0).LLJI;
        if (c20580115fz3 == null) {
            return false;
        }
        int[] iArr = new int[2];
        c20580115fz3.LLILZ.getLocationOnScreen(iArr);
        int width = c20580115fz3.LLILZ.getWidth() + iArr[0];
        int height = c20580115fz3.LLILZ.getHeight() + iArr[1];
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        if (motionEvent.getRawY() >= r9 + iLIZIZ && motionEvent.getRawY() <= height - iLIZIZ) {
            if (motionEvent.getRawX() < r6 + iLIZIZ2 && c20580115fz3.LLILZ.getCurrentItem() > 0) {
                C20632315oP c20632315oP = c20580115fz3.LLILZ;
                c20632315oP.LJ(c20632315oP.getCurrentItem() - 1, true);
                return true;
            }
            if (motionEvent.getRawX() > width - iLIZIZ2) {
                int currentItem = c20580115fz3.LLILZ.getCurrentItem();
                AbstractC21673619ry adapter = c20580115fz3.LLILZ.getAdapter();
                if (adapter != null) {
                    itemCount = adapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (currentItem < itemCount - 1) {
                    C20632315oP c20632315oP2 = c20580115fz3.LLILZ;
                    c20632315oP2.LJ(c20632315oP2.getCurrentItem() + 1, true);
                    return true;
                }
            }
            StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment = (StoryThoughtAvatarCreationFragment) c20750816Hy.l0;
            storyThoughtAvatarCreationFragment.getClass();
            if (!((Boolean) C281330B0x.LIZ.getValue()).booleanValue() && (c20580115fz2 = storyThoughtAvatarCreationFragment.LLJI) != null && (c20584715gj2 = c20580115fz2.LLJJJIL) != null) {
                C20097413kK.LIZ(c20584715gj2);
            }
            return false;
        }
        StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment2 = (StoryThoughtAvatarCreationFragment) c20750816Hy.l0;
        storyThoughtAvatarCreationFragment2.getClass();
        if (!((Boolean) C281330B0x.LIZ.getValue()).booleanValue() && (c20580115fz = storyThoughtAvatarCreationFragment2.LLJI) != null && (c20584715gj = c20580115fz.LLJJJIL) != null) {
            C20097413kK.LIZ(c20584715gj);
        }
        return false;
    }

    public static final boolean onFling$0(C20750816Hy c20750816Hy, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C16FA c16fa = (C16FA) c20750816Hy.l0;
        return c16fa.LJJJJJ(c16fa.LLJJJJ, 3);
    }

    public static final boolean onFling$1(C20750816Hy c20750816Hy, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Function0<Unit> dismissAction;
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            if (y > 0.0f) {
                if (x == 0.0f) {
                    x = 1.0f;
                }
                if (y / Math.abs(x) > 0.65f) {
                    C20730716Af c20730716Af = (C20730716Af) c20750816Hy.l0;
                    if (c20730716Af.LLJJJ && c20730716Af.LIZ(motionEvent2, true)) {
                        View rightAreaView = ((C20730716Af) c20750816Hy.l0).getRightAreaView();
                        if (rightAreaView != null) {
                            rightAreaView.callOnClick();
                        }
                    } else {
                        C20730716Af c20730716Af2 = (C20730716Af) c20750816Hy.l0;
                        if (!c20730716Af2.LLJJJ && (dismissAction = c20730716Af2.getDismissAction()) != null) {
                            dismissAction.invoke();
                            return true;
                        }
                    }
                    return true;
                }
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onFling$2(C20750816Hy c20750816Hy, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int iIntValue;
        int size;
        int i;
        C20632315oP c20632315oP;
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            Integer num = (Integer) ((StoryThoughtAvatarCreationFragment) c20750816Hy.l0).WR().LLLL.getValue();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            List list = (List) ((StoryThoughtAvatarCreationFragment) c20750816Hy.l0).WR().LLLIZZ.getValue();
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (x > 0.0f) {
                i = iIntValue - 1;
            } else {
                i = iIntValue + 1;
            }
            C20580115fz c20580115fz = ((StoryThoughtAvatarCreationFragment) c20750816Hy.l0).LLJI;
            if (c20580115fz != null && (c20632315oP = c20580115fz.LLILZ) != null) {
                c20632315oP.LJ(C13LZ.LJ(i, 0, size - 1), true);
            }
            return true;
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public static final boolean onScroll$0(C20750816Hy c20750816Hy, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C16FA c16fa = (C16FA) c20750816Hy.l0;
        return c16fa.LJJJJJ(c16fa.LLJJJJ, 3);
    }
}
