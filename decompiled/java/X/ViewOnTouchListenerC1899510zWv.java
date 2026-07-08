package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS217S0000000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewOnTouchListenerC1899510zWv extends FrameLayout implements View.OnTouchListener {
    public final C01GW LL;
    public float LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    private final float getMaxDragX() {
        return 2.1474836E9f;
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL(MotionEvent motionEvent) {
    }

    public void LJ() {
    }

    public boolean LJFF() {
        return false;
    }

    public Float LJIIIIZZ() {
        return null;
    }

    public boolean LJIIIZ() {
        return false;
    }

    private final Keva getKeva() {
        return (Keva) this.LL.getValue();
    }

    public final boolean LJII() {
        return this.LLJJ == 1;
    }

    public final boolean getCanDrag() {
        return this.LLJJIJI;
    }

    public final void LIZ(View view) {
        Object parent;
        C1896890zSh c1896890zSh;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        View view2 = (View) parent;
        float x = view.getX();
        float y = view.getY();
        if (!C1899620zX6.LIZIZ(getContext())) {
            this.LLJILJIL = view2.getLeft();
            this.LLJILJIL = Math.min(view2.getWidth() - view.getWidth(), this.LLJILJIL) + 0.0f;
            this.LLILZIL = 0.0f;
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            C1896890zSh c1896890zSh2 = (C1896890zSh) c1619720sFe.LIZ(1);
            if ((c1896890zSh2 != null && c1896890zSh2.LIZIZ()) || ((c1896890zSh = (C1896890zSh) c1619720sFe.LIZ(1)) != null && c1896890zSh.LIZJ())) {
                if (LJFF()) {
                    if (!LJII()) {
                        this.LLJILJIL = view2.getRight();
                        this.LLJILJIL = Math.min(view2.getWidth() - view.getWidth(), this.LLJILJIL) - 0.0f;
                        this.LLILZIL = C418440Gaw.LIZIZ(476);
                        this.LLJJ = 2;
                    } else {
                        this.LLJJ = 1;
                    }
                } else if (x > view2.getWidth() / 2) {
                    this.LLJILJIL = view2.getRight();
                    this.LLJILJIL = Math.min(view2.getWidth() - view.getWidth(), this.LLJILJIL) - 0.0f;
                    this.LLILZIL = C418440Gaw.LIZIZ(476);
                    this.LLJJ = 2;
                } else {
                    this.LLJJ = 1;
                }
            }
        } else {
            this.LLJILJIL = view2.getRight();
            this.LLJILJIL = Math.min(view2.getWidth() - view.getWidth(), this.LLJILJIL) - 0.0f;
        }
        this.LLJILJILJ = y;
        if (view.getY() + view2.getTop() < 0.0f) {
            this.LLJILJILJ = view2.getTop() + 0.0f;
        }
        float f = this.LLJILJILJ;
        float f2 = this.LLILLJJLI;
        if (f < f2) {
            this.LLJILJILJ = f2;
        }
        if ((view2.getBottom() - view.getY()) - view.getHeight() < this.LLILZIL) {
            this.LLJILJILJ = (view2.getBottom() - view.getHeight()) - this.LLILZIL;
        }
        if (this.LLJILJILJ > view2.getBottom() - this.LLILLL) {
            this.LLJILJILJ = view2.getBottom() - this.LLILLL;
        }
        Float fLJIIIIZZ = LJIIIIZZ();
        if (fLJIIIIZZ != null) {
            this.LLJILJIL = fLJIIIIZZ.floatValue();
        }
    }

    public final boolean LJI(MotionEvent motionEvent) {
        if (Math.abs(motionEvent.getRawX() - this.LLJI) <= this.LLILZ && Math.abs(motionEvent.getRawY() - this.LLJIJIL) <= this.LLILZ) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(View view) {
        view.animate().x(this.LLJILJIL).y(this.LLJILJILJ).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
    }

    public final void setCanDrag(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setDragForbidden(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setShrink(boolean z) {
        this.LLJJI = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) throws JSONException {
        String strLJJII;
        if (motionEvent == null || view == null || !this.LLJJIJI || this.LLJJIJIIJIL) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    LIZIZ();
                    this.LLJJIII = false;
                    LIZ(view);
                    LJIIJ(view);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                View view2 = (View) view.getParent();
                int width = view2.getWidth();
                int height = view2.getHeight();
                float fMin = Math.min(Math.max(0.0f, Math.max(motionEvent.getRawX() + this.LLIZLLLIL, 0.0f)), (width - view.getWidth()) - 0.0f);
                if (fMin <= getMaxDragX()) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setX(fMin);
                }
                float rawY = motionEvent.getRawY() + this.LLJ;
                float f = this.LLILZLL;
                if (f <= 0.0f) {
                    f = 0.0f;
                }
                float f2 = this.LLIZ;
                if (f2 <= 0.0f) {
                    f2 = this.LLILZIL;
                }
                float fMin2 = Math.min(Math.max(0.0f, Math.max(rawY, f)), (height - view.getHeight()) - f2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setY(fMin2);
                if (LJI(motionEvent)) {
                    LIZLLL(motionEvent);
                }
                return true;
            }
            LJ();
            this.LLJJIII = false;
            getParent().requestDisallowInterceptTouchEvent(false);
            motionEvent.getRawX();
            motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
            float rawX = motionEvent.getRawX() - this.LLJI;
            float rawY2 = motionEvent.getRawY() - this.LLJIJIL;
            if (Math.abs(rawX) < this.LLILZ && Math.abs(rawY2) < this.LLILZ && System.currentTimeMillis() - this.LLJILLL < 250 && performClick()) {
                return true;
            }
            LIZ(view);
            LJIIJ(view);
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            C1896890zSh c1896890zSh = (C1896890zSh) c1619720sFe.LIZ(1);
            if (c1896890zSh != null && c1896890zSh.LIZIZ()) {
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP == null || (strLJJII = abstractC1896090zRP.LJJII()) == null) {
                    strLJJII = "";
                }
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                }
                if (LJIIIZ()) {
                    this.LLJILJIL += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) * 2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finalX", Float.valueOf(this.LLJILJIL));
                jSONObject.put("finalY", Float.valueOf(this.LLJILJILJ));
                String strJ3 = C786410Ut5.J3(jSONObject);
                Keva keva = getKeva();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJII);
                sbLIZ.append("_pendant");
                keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strJ3);
            }
            this.LLILZIL = 0.0f;
            return false;
        }
        LIZJ();
        this.LLJJIII = true;
        this.LLJILLL = System.currentTimeMillis();
        this.LLJI = motionEvent.getRawX();
        this.LLJIJIL = motionEvent.getRawY();
        this.LLIZLLLIL = getX() - motionEvent.getRawX();
        this.LLJ = getY() - motionEvent.getRawY();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public ViewOnTouchListenerC1899510zWv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(68));
        this.LLJJ = 1;
        this.LLJJIJI = true;
        this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILLJJLI = C12ES.LJIIIIZZ(context) * 0.11f;
        this.LLILLL = C12ES.LJIIIIZZ(context) * 0.4f;
        setOnTouchListener(this);
    }
}
