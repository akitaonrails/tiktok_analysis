package X;

import Y.ARunnableS86S0000000_7;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0s13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1610670s13 extends C21311118ab {
    public static final /* synthetic */ int LLJ = 0;
    public C430210Gtv LL;
    public TuxTextView LLILLJJLI;
    public C1324720kZq LLILLL;
    public C430210Gtv LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public C1143920fsE LLIZ;
    public float LLIZLLLIL;

    public C1610670s13() {
        throw null;
    }

    private int getLiveHeightFromExperiment() {
        return 12;
    }

    private int getLiveWidthFromExperiment() {
        return 30;
    }

    private C21311318ad getAnimLayoutParams() {
        C21311318ad c21311318ad = new C21311318ad(LIZJ(10), LIZJ(10));
        ((RelativeLayout.LayoutParams) c21311318ad).topMargin = LIZJ(1);
        c21311318ad.addRule(10);
        c21311318ad.addRule(14);
        return c21311318ad;
    }

    private C21311318ad getAvatarLayoutParams() {
        return new C21311318ad(-1, -1);
    }

    private C21311318ad getLiveLayoutParams() {
        C21311318ad c21311318ad = new C21311318ad(LIZJ(getLiveWidthFromExperiment()), LIZJ(getLiveHeightFromExperiment()));
        c21311318ad.addRule(10);
        c21311318ad.addRule(14);
        return c21311318ad;
    }

    public final void LIZIZ() {
        String strLIZ;
        TuxTextView tuxTextView = this.LLILLJJLI;
        try {
            strLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJZLJL().LIZ(this.LLILLJJLI.getContext());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = null;
        }
        tuxTextView.setText(strLIZ);
        this.LLILLJJLI.setTextColor(-1);
        this.LLILLJJLI.setMaxLines(1);
        this.LLILLJJLI.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLJJLI.setGravity(17);
        if (!C295310Bhp.LIZ()) {
            this.LLILLJJLI.setPadding(LIZJ(4), 0, LIZJ(4), 0);
            this.LLILLJJLI.setTuxFont(52);
            this.LLILLJJLI.setMinTextSize(6.0f);
            this.LLILLJJLI.LJJJJI(9.0f);
            return;
        }
        this.LLILLJJLI.setPadding(LIZJ(4), C418440Gaw.LIZ(Double.valueOf(1.5d)), LIZJ(4), 0);
        this.LLILLJJLI.setTuxFont(53);
        this.LLILLJJLI.setMinTextSize(6.0f);
        float f = this.LLIZLLLIL;
        if (f == 0.0f) {
            this.LLILLJJLI.LJJJJI(9.0f);
        } else {
            this.LLILLJJLI.LJJJJI(f);
        }
    }

    public C430210Gtv getAvatarImageView() {
        return this.LL;
    }

    public TuxTextView getLiveTagView() {
        return this.LLILLJJLI;
    }

    public C427870Gq9 getSocialAvatarBackgroundView() {
        return this.LLILZ;
    }

    public final int LIZJ(int i) {
        return (int) C12ES.LIZJ(i, getContext());
    }

    public final void LIZLLL(boolean z) {
        this.LLILZLL = z;
        if (z) {
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
            C786410Ut5.LLJJIII(this.LLILLL, 8);
        }
    }

    public final void LJFF(boolean z) {
        if (!z) {
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
            C786410Ut5.LLJJIII(this.LLILLL, 8);
            this.LL.setBorderWidth(1);
            C1143920fsE c1143920fsE = this.LLIZ;
            if (c1143920fsE != null) {
                c1143920fsE.LIZ();
                return;
            }
            return;
        }
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
        this.LL.setBorderWidth(0);
        try {
            if (this.LLILZIL) {
                this.LLILLJJLI.setText((CharSequence) null);
                C786410Ut5.LLJJIII(this.LLILLL, 0);
                if (this.LLIZ == null) {
                    C1143920fsE c1143920fsE2 = new C1143920fsE();
                    c1143920fsE2.LJFF = true;
                    c1143920fsE2.LIZIZ = "tiktok_live_watch_resource_normal_2";
                    c1143920fsE2.LIZJ = "live_avatar_view_icon_anim.webp";
                    c1143920fsE2.LIZ = this.LLILLL;
                    c1143920fsE2.LJI = Integer.MAX_VALUE;
                    this.LLIZ = c1143920fsE2;
                }
                C1143680frq.LJIIIIZZ(this.LLIZ);
            } else {
                LIZIZ();
            }
            this.LLILLJJLI.setBackgroundResource(R.drawable.chm);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C486790J7d.LIZJ(new ARunnableS86S0000000_7(9));
        if (!this.LLILZLL) {
            return;
        }
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
        C786410Ut5.LLJJIII(this.LLILLL, 8);
    }

    public void setAvatarRoundingPadding(float f) {
        C430210Gtv c430210Gtv = this.LL;
        if (c430210Gtv == null) {
            return;
        }
        c430210Gtv.setRoundingParamsPadding(f);
    }

    public void setBorderColor(int i) {
        C430210Gtv c430210Gtv = this.LL;
        if (c430210Gtv != null) {
            c430210Gtv.setBorderColor(i);
        }
    }

    public void setImageUrl(String str) {
        if (this.LL != null && !TextUtils.isEmpty(str)) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public void setTagBackgroundResource(int i) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setBackgroundResource(i);
        }
    }

    public void setTagTextSize(float f) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(f);
        }
        this.LLIZLLLIL = f;
    }

    public void setUseLiveAnimStyle(boolean z) {
        this.LLILZIL = z;
    }

    public C1610670s13(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJ(int i, int i2) {
        if (this.LLILLJJLI != null) {
            C21311318ad c21311318ad = new C21311318ad(LIZJ(i), LIZJ(i2));
            c21311318ad.addRule(10);
            c21311318ad.addRule(14);
            C786410Ut5.R6(this.LLILLJJLI, c21311318ad);
        }
    }

    public C1610670s13(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C430210Gtv c430210Gtv = new C430210Gtv(getContext());
        this.LLILZ = c430210Gtv;
        C786410Ut5.n(c430210Gtv, 8);
        this.LLILZ.setBorderWidth(0);
        this.LLILZ.setBorderAttrRes(R.attr.uk);
        addView(this.LLILZ, getAvatarLayoutParams());
        C430210Gtv c430210Gtv2 = new C430210Gtv(getContext());
        this.LL = c430210Gtv2;
        c430210Gtv2.getHierarchy().LJJI(R.color.al, InterfaceC1320380kSq.LJI);
        addView(this.LL, getAvatarLayoutParams());
        TuxTextView tuxTextView = new TuxTextView(getContext());
        this.LLILLJJLI = tuxTextView;
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        addView(this.LLILLJJLI, getLiveLayoutParams());
        C1324720kZq c1324720kZq = new C1324720kZq(getContext());
        this.LLILLL = c1324720kZq;
        C786410Ut5.LLJJIII(c1324720kZq, 8);
        addView(this.LLILLL, getAnimLayoutParams());
    }
}
