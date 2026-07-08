package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1235870iGX extends FrameLayout implements InterfaceC1213370hgF {
    public final List<View> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;

    public C1235870iGX() {
        throw null;
    }

    public final void LJII() {
        C786410Ut5.LLLLIILL(this, 0);
        setStatus(1);
    }

    public final void LJIIIIZZ() {
        C786410Ut5.LLLLIILL(this, 0);
        setStatus(0);
    }

    public final JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("retry_method", "tap_to_retry");
        long j = this.LLILZIL - this.LLILZLL;
        this.LLIZ += j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZLL = jCurrentTimeMillis;
        jSONObject.put("retry_duration", jCurrentTimeMillis - this.LLILZIL).put("retry_wait", j);
        return jSONObject;
    }

    public final boolean LIZLLL() {
        return this.LLILLJJLI == -1;
    }

    public final void LJI() {
        int i = this.LLILLJJLI;
        if (i == -1) {
            return;
        }
        View viewLIZJ = LIZJ(i);
        if (viewLIZJ != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZJ);
        }
        C786410Ut5.LLLLIILL(this, 4);
        this.LLILLJJLI = -1;
    }

    @Override // X.InterfaceC1213370hgF
    public final void LIZ(int i) {
        LJIIIZ(i);
    }

    public final View LIZJ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            return (View) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final void LJFF(boolean z) {
        long j;
        try {
            if (z) {
                if (this.LLIZLLLIL > 0) {
                    LJ("prf_network_error_page_retry", LIZIZ().put("retry_result", 1));
                    JSONObject jSONObjectPut = new JSONObject().put("retry_result", 1).put("retry_time_count", this.LLILZ).put("stay_duration", System.currentTimeMillis() - this.LLIZLLLIL);
                    int i = this.LLILZ;
                    if (i != 0) {
                        j = this.LLIZ / ((long) i);
                    } else {
                        j = 0;
                    }
                    LJ("prf_leave_network_error_page", jSONObjectPut.put("retry_wait_avg", j));
                    this.LLILZ = 0;
                    this.LLILZIL = 0L;
                    this.LLIZ = 0L;
                    this.LLIZLLLIL = 0L;
                    this.LLILZLL = 0L;
                    return;
                }
                return;
            }
            if (this.LLILZ == 0) {
                this.LLILZ = 0;
                this.LLILZIL = 0L;
                this.LLIZ = 0L;
                this.LLIZLLLIL = 0L;
                this.LLILZLL = 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LLIZLLLIL = jCurrentTimeMillis;
                this.LLILZLL = jCurrentTimeMillis;
                LJ("prf_enter_network_error_page", new JSONObject());
                return;
            }
            LJ("prf_network_error_page_retry", LIZIZ().put("retry_result", 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIIIZ(int i) {
        if (i >= 0 && this.LLILLL != i) {
            this.LLILLL = i;
            View view = (View) ListProtector.get(this.LL, 0);
            if (view instanceof C1235900iGa) {
                ((C1235900iGa) view).LIZ(this.LLILLL);
            }
            KeyEvent.Callback callback = (View) ListProtector.get(this.LL, 1);
            if (callback instanceof InterfaceC1213370hgF) {
                ((InterfaceC1213370hgF) callback).LIZ(this.LLILLL);
            }
            View view2 = (View) ListProtector.get(this.LL, 2);
            if (view2 instanceof C1213330hgB) {
                ((C1213330hgB) view2).LIZ(this.LLILLL);
            }
            View view3 = (View) ListProtector.get(this.LL, 3);
            if (view3 instanceof C1213330hgB) {
                ((C1213330hgB) view3).LIZ(this.LLILLL);
            }
            View view4 = (View) ListProtector.get(this.LL, 4);
            if (view4 instanceof C1213330hgB) {
                ((C1213330hgB) view4).LIZ(this.LLILLL);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        long j;
        if (!z) {
            if (this.LLIZLLLIL > 0) {
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("retry_result", 0).put("retry_time_count", this.LLILZ).put("stay_duration", System.currentTimeMillis() - this.LLIZLLLIL);
                    int i = this.LLILZ;
                    if (i != 0) {
                        j = this.LLIZ / ((long) i);
                    } else {
                        j = 0;
                    }
                    LJ("prf_leave_network_error_page", jSONObjectPut.put("retry_wait_avg", j));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLILZ = 0;
            this.LLILZIL = 0L;
            this.LLIZ = 0L;
            this.LLIZLLLIL = 0L;
            this.LLILZLL = 0L;
        }
        super.onVisibilityAggregated(z);
    }

    public void setBuilder(C1209530ha3 c1209530ha3) {
        if (c1209530ha3 == null) {
            c1209530ha3 = C1209530ha3.LIZ(getContext());
        }
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).add(c1209530ha3.LIZIZ);
        ((ArrayList) this.LL).add(c1209530ha3.LIZJ);
        ((ArrayList) this.LL).add(c1209530ha3.LIZLLL);
        ((ArrayList) this.LL).add(c1209530ha3.LJ);
        ((ArrayList) this.LL).add(null);
        if (c1209530ha3.LJFF < 0) {
            c1209530ha3.LJFF = 0;
        }
        LJIIIZ(c1209530ha3.LJFF);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LL).size(); i++) {
            View view = (View) ListProtector.get(this.LL, i);
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
                addView(view);
            }
        }
    }

    public void setStatus(int i) {
        View viewLIZJ;
        int i2 = this.LLILLJJLI;
        if (i2 == i) {
            return;
        }
        View viewLIZJ2 = LIZJ(i2);
        if (i == 2 || i == 3 || i == 4) {
            LJFF(false);
        }
        if ((i2 == 2 || i2 == 3 || i2 == 4) && i == 0 && this.LLIZLLLIL > 0) {
            this.LLILZ++;
            this.LLILZIL = System.currentTimeMillis();
            if (viewLIZJ2 instanceof C1213330hgB) {
                viewLIZJ2.getClass();
            }
        }
        int i3 = this.LLILLJJLI;
        if (i3 >= 0 && (viewLIZJ = LIZJ(i3)) != null) {
            C786410Ut5.LJLLLLLL(4, viewLIZJ);
        }
        if (i >= 0) {
            C786410Ut5.LLLLIILL(this, 0);
            View viewLIZJ3 = LIZJ(i);
            if (viewLIZJ3 != null) {
                C786410Ut5.LJLLLLLL(0, viewLIZJ3);
            }
        } else {
            C786410Ut5.LLLLIILL(this, 4);
        }
        this.LLILLJJLI = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if ((i == 4 || i == 8) && getVisibility() == 0 && this.LLILLJJLI == 0) {
            LJFF(true);
        }
        super.setVisibility(i);
    }

    public C1235870iGX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList(5);
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = 0;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
        this.LLIZ = 0L;
        this.LLIZLLLIL = 0L;
    }

    public final void LJ(String str, JSONObject jSONObject) {
        C845850XGd.LIZ(getContext(), str, C2211631BhB.LJII(), jSONObject);
    }
}
