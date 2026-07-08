package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ty9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764070Ty9 extends ConstraintLayout {
    public LiveIconView LL;
    public LiveIconView LLILLJJLI;
    public LiveIconView LLILLL;
    public LiveIconView LLILZ;
    public Function1<? super C0U0N, Unit> LLILZIL;
    public C0U22 LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;

    public final Function1<C0U0N, Unit> getCarrier() {
        return this.LLILZIL;
    }

    public final C0U22 getCurSongInfo() {
        return this.LLILZLL;
    }

    public final LiveIconView getKaraokeListBtn() {
        return this.LLILZ;
    }

    public final LiveIconView getNextBtn() {
        return this.LLILLL;
    }

    public final LiveIconView getPlayBtn() {
        return this.LLILLJJLI;
    }

    public final int getRole() {
        return this.LLJ;
    }

    public final LiveIconView getSettingBtn() {
        return this.LL;
    }

    public final void e0(int i) {
        this.LLIZ = i;
        if (i > 0) {
            View viewFindViewById = findViewById(R.id.qup);
            if (viewFindViewById != null) {
                C0GZA.LIZ(viewFindViewById, i, 0.0f, 0.0f);
                return;
            }
            return;
        }
        View viewFindViewById2 = findViewById(R.id.qup);
        if (viewFindViewById2 == null) {
            return;
        }
        C0GZA.LIZIZ(viewFindViewById2);
    }

    public final void setCarrier(Function1<? super C0U0N, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setCurSongInfo(C0U22 c0u22) {
        this.LLILZLL = c0u22;
    }

    public final void setHost(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setKaraokeListBtn(LiveIconView liveIconView) {
        this.LLILZ = liveIconView;
    }

    public final void setNextBtn(LiveIconView liveIconView) {
        this.LLILLL = liveIconView;
    }

    public final void setPlayBtn(LiveIconView liveIconView) {
        this.LLILLJJLI = liveIconView;
    }

    public final void setRole(int i) {
        this.LLJ = i;
    }

    public final void setSettingBtn(LiveIconView liveIconView) {
        this.LL = liveIconView;
    }

    public C764070Ty9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = true;
        C786410Ut5.Sd(R.layout.gw_, C786410Ut5.ne(context), this);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.uuw);
        LiveIconView liveIconView2 = null;
        if (liveIconView != null) {
            liveIconView.setEnabled(this.LLIZLLLIL);
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 70));
            C1834150xpV.LJIIJ(liveIconView, true);
        } else {
            liveIconView = null;
        }
        this.LL = liveIconView;
        LiveIconView liveIconView3 = (LiveIconView) findViewById(R.id.qmb);
        if (liveIconView3 != null) {
            liveIconView3.setEnabled(false);
            liveIconView3.setSelected(false);
            C500260Jjc.LJLIIIL(500L, liveIconView3, new AwS591S0100000_12(this, 71));
        } else {
            liveIconView3 = null;
        }
        this.LLILLJJLI = liveIconView3;
        LiveIconView liveIconView4 = (LiveIconView) findViewById(R.id.p8l);
        if (liveIconView4 != null) {
            liveIconView4.setEnabled(false);
            C500260Jjc.LJLIIIL(500L, liveIconView4, new AwS591S0100000_12(this, 72));
        } else {
            liveIconView4 = null;
        }
        this.LLILLL = liveIconView4;
        LiveIconView liveIconView5 = (LiveIconView) findViewById(R.id.qu5);
        if (liveIconView5 != null) {
            C500260Jjc.LJLIIIL(500L, liveIconView5, new AwS591S0100000_12(this, 73));
            liveIconView2 = liveIconView5;
        }
        this.LLILZ = liveIconView2;
        this.LLJ = 1;
    }

    public final void i0(boolean z, boolean z2) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            if (z2) {
                liveIconView.setIconAttr(R.attr.e6l);
            } else {
                liveIconView.setIconAttr(R.attr.e9g);
            }
            liveIconView.setEnabled(z);
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                liveIconView2.setSelected(z2);
            }
        }
        LiveIconView liveIconView3 = this.LLILLL;
        if (liveIconView3 != null) {
            liveIconView3.setEnabled(z);
        }
    }

    public final void h0(C0U22 c0u22, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (!Intrinsics.LJFF(this.LLILZLL, c0u22)) {
            this.LLILZLL = c0u22;
            boolean z5 = true;
            if (this.LLIZLLLIL) {
                if (c0u22 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i0(z4, z);
                LiveIconView liveIconView = this.LL;
                if (liveIconView != null) {
                    if (!z2 && c0u22 != null) {
                        z5 = false;
                    }
                    liveIconView.setEnabled(z5);
                    return;
                }
                return;
            }
            if (c0u22 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            i0(z3, z);
            LiveIconView liveIconView2 = this.LL;
            if (liveIconView2 != null) {
                if (c0u22 == null || !z2) {
                    z5 = false;
                }
                liveIconView2.setEnabled(z5);
            }
            if (z2) {
                return;
            }
            LiveIconView liveIconView3 = this.LLILLJJLI;
            if (liveIconView3 != null) {
                liveIconView3.setEnabled(false);
            }
            LiveIconView liveIconView4 = this.LLILLL;
            if (liveIconView4 == null) {
                return;
            }
            liveIconView4.setEnabled(false);
        }
    }
}
