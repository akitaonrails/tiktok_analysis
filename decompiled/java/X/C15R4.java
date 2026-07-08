package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.15R4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R4 implements View.OnTouchListener {
    public ImageView LL;
    public C0GWO LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public String LLILZIL;
    public C15R7 LLILZLL;
    public RelativeLayout LLIZ;
    public View LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public C15RQ LLJJ;
    public C15RR LLJJI;

    public final int LIZ() {
        return this.LLJ >= this.LLJIJIL ? (int) (((this.LLILLJJLI.getWidth() * 1.0f) * 15000.0f) / this.LLJIJIL) : (int) (((((double) this.LLILLJJLI.getWidth()) * 1.0d) * ((double) this.LLJ)) / ((double) this.LLJIJIL));
    }

    public final int LIZIZ() {
        return (this.LLJ >= this.LLJIJIL || this.LLJILLL) ? this.LLILLJJLI.getWidth() : (int) (((((double) this.LLILLJJLI.getWidth()) * 1.0d) * ((double) this.LLJ)) / ((double) this.LLJIJIL));
    }

    public final void LIZJ(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = this.LL;
        int i5 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
        C0GWO c0gwo = this.LLILLJJLI;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int visibility = c0gwo.getVisibility();
        c0gwo.setVisibility(i2);
        C1602160rnK.LIZIZ(visibility, i2, c0gwo);
        TextView textView = this.LLILLL;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLIL(textView, i3);
        TextView textView2 = this.LLILZ;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LLIL(textView2, i4);
        C15R7 c15r7 = this.LLILZLL;
        if (z) {
            i5 = 8;
        }
        int visibility2 = c15r7.getVisibility();
        c15r7.setVisibility(i5);
        C1602160rnK.LIZIZ(visibility2, i5, c15r7);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "MusicDragView");
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C2341909Fp.LIZ("tool_performance_show_music_wave", c0lab.LIZ);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action != 1) {
                if (action == 2 && !this.LLJILLL) {
                    float rawX = this.LLJILJILJ + (motionEvent.getRawX() - this.LLJILJIL);
                    if (rawX < this.LLILLJJLI.getX() - (this.LL.getWidth() / 2)) {
                        rawX = this.LLILLJJLI.getX() - (this.LL.getWidth() / 2);
                    }
                    if ((rawX - this.LLILLJJLI.getX()) + (this.LL.getWidth() / 2) >= this.LLILLJJLI.getWidth() - LIZ()) {
                        rawX = ((this.LLILLJJLI.getX() - (this.LL.getWidth() / 2)) + this.LLILLJJLI.getWidth()) - LIZ();
                    }
                    if (rawX < 0.0f) {
                        rawX = 0.0f;
                    }
                    this.LL.animate().x(rawX).setDuration(0L).start();
                    int x = (int) ((this.LL.getX() + (this.LL.getWidth() / 2)) - this.LLILLJJLI.getX());
                    if (x < 0 || this.LLJILLL) {
                        x = 0;
                    }
                    this.LLILLJJLI.setStart(x);
                    this.LLILLJJLI.setLength(LIZIZ());
                    TextView textView = this.LLILLL;
                    double x2 = (((((double) this.LL.getX()) * 1.0d) - ((double) this.LLILLJJLI.getX())) + ((double) (this.LL.getWidth() / 2))) / ((double) this.LLILLJJLI.getWidth());
                    int i2 = this.LLJIJIL;
                    int i3 = (int) (x2 * ((double) i2));
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i3 <= i2) {
                        i = i3;
                    }
                    textView.setText(C0F3O.LIZ(i));
                }
            } else {
                int x3 = (int) ((this.LL.getX() - this.LLILLJJLI.getX()) + (this.LL.getWidth() / 2));
                if (x3 >= 0) {
                    i = x3;
                }
                int width = (int) (((((double) i) * 1.0d) / ((double) this.LLILLJJLI.getWidth())) * ((double) this.LLJIJIL));
                this.LLJI = width;
                C15RR c15rr = this.LLJJI;
                if (c15rr != null) {
                    ((C15RC) c15rr).LIZLLL.LJLJLJ(width);
                    return true;
                }
            }
            return true;
        }
        this.LLJILJIL = motionEvent.getRawX();
        this.LLJILJILJ = this.LL.getX();
        return true;
    }
}
