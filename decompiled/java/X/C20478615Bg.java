package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.15Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20478615Bg {
    public DataChannel LIZ;
    public ViewStub LIZJ;
    public View LIZLLL;
    public C20478815Bi LJ;
    public C430350Gu9 LJFF;
    public C16F5 LJI;
    public ValueAnimator LJII;
    public ValueAnimator LJIIIIZZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public EnumC964170bCJ LJIIJJI = EnumC964170bCJ.NONE;

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetProgressToMiddle, isBattleStart=");
        sbLIZ.append(true);
        C20441214yg.LIZIZ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("resetProgressToMiddle");
        this.LJIIJ = -1L;
        this.LJIIIZ = -1L;
        C20478815Bi c20478815Bi = this.LJ;
        if (c20478815Bi != null) {
            c20478815Bi.setExtraSpace(0.0f);
        }
        C430350Gu9 c430350Gu9 = this.LJFF;
        if (c430350Gu9 != null) {
            c430350Gu9.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            c16f5.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C20478815Bi c20478815Bi2 = this.LJ;
        if (c20478815Bi2 != null) {
            c20478815Bi2.LLJ = 0L;
            c20478815Bi2.LLJI = 0L;
            c20478815Bi2.LLIZLLLIL = 0.5f;
            c20478815Bi2.LLJJI = true;
            c20478815Bi2.LLJJJ = 0.0f;
            c20478815Bi2.LLJJIII = false;
            c20478815Bi2.LLJJIJI = false;
            Map<String, Object> map = C1338270kvh.LIZ;
            C0GW7 c0gw7 = c20478815Bi2.LLJJJJJIL;
            if (c0gw7 == null) {
                c0gw7 = null;
            }
            c0gw7.LLJILJIL.cancel();
            c20478815Bi2.invalidate();
        }
    }

    public final void LIZ(String str) {
        if (!this.LIZIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initView, isViewStubInitial == false, return, source = ");
            sbLIZ.append(str);
            C20441214yg.LJ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ViewStub viewStub = this.LIZJ;
        if (viewStub == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initView, tempViewStub == null, return, source = ");
            sbLIZ2.append(str);
            C20441214yg.LJ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LIZIZ.set(false);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("initView, tempViewStub.inflate, source = ");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ3));
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        if (viewLJLLLL instanceof C1091250eVH) {
            C1091250eVH c1091250eVH = (C1091250eVH) viewLJLLLL;
            c1091250eVH.setEnableSizeChange(true);
            c1091250eVH.setEnableFixedSize(true);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("initView, newRoot is not FixedSizeFrameLayout, newRoot=");
            sbLIZ4.append(viewLJLLLL.getClass());
            C20441214yg.LJ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ4));
        }
        this.LIZLLL = viewLJLLLL;
        this.LJ = (C20478815Bi) viewLJLLLL.findViewById(R.id.view_progressbar);
        this.LJFF = (C430350Gu9) viewLJLLLL.findViewById(R.id.ml9);
        this.LJI = (C16F5) viewLJLLLL.findViewById(R.id.tmi);
        C20478815Bi c20478815Bi = this.LJ;
        if (c20478815Bi != null) {
            c20478815Bi.LLILLL = C497740JfY.LJFF(R.color.a8i);
            c20478815Bi.LLILZ = C497740JfY.LJFF(R.color.a8g);
            c20478815Bi.LLILZIL = C497740JfY.LJFF(R.color.a8o);
            c20478815Bi.LLILZLL = C497740JfY.LJFF(R.color.a8m);
            c20478815Bi.LLIZ = C497740JfY.LJFF(R.color.a8k);
        }
        C20478815Bi c20478815Bi2 = this.LJ;
        if (c20478815Bi2 != null) {
            C430350Gu9 c430350Gu9 = this.LJFF;
            C16F5 c16f5 = this.LJI;
            c20478815Bi2.LL = c430350Gu9;
            c20478815Bi2.LLILLJJLI = c16f5;
            c20478815Bi2.setCoverWidth(50.0f);
        }
    }

    public final void LIZJ(C978270bZ3 c978270bZ3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLeftData, scoreUpdateData = ");
        sbLIZ.append(c978270bZ3);
        C20441214yg.LJIIIZ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("setLeftData");
        C430350Gu9 c430350Gu9 = this.LJFF;
        if (c430350Gu9 != null) {
            C786410Ut5.LLJLL(c430350Gu9, 0);
        }
        long j = c978270bZ3.LIZ;
        if (this.LJIIIZ == j) {
            return;
        }
        this.LJIIIZ = j;
        LJ(j, true, c978270bZ3.LIZIZ);
        C20478815Bi c20478815Bi = this.LJ;
        if (c20478815Bi != null) {
            c20478815Bi.setLeftValue(j);
        }
    }

    public final void LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRightValue, rightValue = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("setRightValue");
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        if (this.LJIIJ == j) {
            return;
        }
        this.LJIIJ = j;
        LJ(j, false, false);
        C20478815Bi c20478815Bi = this.LJ;
        if (c20478815Bi != null) {
            c20478815Bi.setRightValue(j);
        }
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visible, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MatchFeedHealthDelegate", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("visible");
        View view = this.LIZLLL;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
    }

    public final void LJ(long j, boolean z, boolean z2) {
        float f;
        String strValueOf = String.valueOf(j);
        if (z) {
            C430350Gu9 c430350Gu9 = this.LJFF;
            if (c430350Gu9 != null) {
                c430350Gu9.setText(strValueOf);
            }
            ValueAnimator valueAnimator = this.LJII;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            C430350Gu9 c430350Gu92 = this.LJFF;
            if (c430350Gu92 != null && c430350Gu92.getVisibility() == 8) {
                return;
            }
            float[] fArr = new float[2];
            fArr[0] = 1.0f;
            if (z2) {
                f = 2.0f;
            } else {
                f = 1.3f;
            }
            fArr[1] = f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            this.LJII = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(200L);
            }
            ValueAnimator valueAnimator2 = this.LJII;
            if (valueAnimator2 != null) {
                valueAnimator2.setRepeatCount(1);
            }
            ValueAnimator valueAnimator3 = this.LJII;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatMode(2);
            }
            ValueAnimator valueAnimator4 = this.LJII;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new AUListenerS278S0100000_31(this, 54));
            }
            ValueAnimator valueAnimator5 = this.LJII;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
                return;
            }
            return;
        }
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            c16f5.setText(strValueOf);
        }
        ValueAnimator valueAnimator6 = this.LJIIIIZZ;
        if (valueAnimator6 != null && valueAnimator6.isRunning()) {
            return;
        }
        C16F5 c16f52 = this.LJI;
        if (c16f52 != null && c16f52.getVisibility() == 8) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 1.3f);
        this.LJIIIIZZ = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 != null) {
            valueAnimatorOfFloat2.setDuration(200L);
        }
        ValueAnimator valueAnimator7 = this.LJIIIIZZ;
        if (valueAnimator7 != null) {
            valueAnimator7.setRepeatCount(1);
        }
        ValueAnimator valueAnimator8 = this.LJIIIIZZ;
        if (valueAnimator8 != null) {
            valueAnimator8.setRepeatMode(2);
        }
        ValueAnimator valueAnimator9 = this.LJIIIIZZ;
        if (valueAnimator9 != null) {
            valueAnimator9.addUpdateListener(new AUListenerS278S0100000_31(this, 55));
        }
        ValueAnimator valueAnimator10 = this.LJIIIIZZ;
        if (valueAnimator10 != null) {
            valueAnimator10.start();
        }
    }
}
