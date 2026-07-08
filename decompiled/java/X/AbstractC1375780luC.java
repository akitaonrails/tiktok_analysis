package X;

import Y.ACListenerS155S0100000_21;
import Y.AObjectS395S0100000_21;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0luC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1375780luC extends C214906198m implements InterfaceC1238780iLE, InterfaceC1380420m1g, InterfaceC1586360rNq, InterfaceC487330J9f {
    public static boolean LLJJJJ;
    public final View LL;
    public RemoteImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public LinearLayout LLILZIL;
    public final Activity LLILZLL;
    public final RunnableC19209410Dc LLIZ;
    public final int LLIZLLLIL;
    public C1378330lyJ LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public LinearLayout LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final C1371590lnR LLJJIII;
    public Aweme LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public final String[] LLJJIJIL;
    public View LLJJJ;
    public long LLJJJIL;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        this.LLJI = false;
        onDismiss();
        C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LLILZLL)).HQ2(this);
    }

    public abstract void onDismiss();

    @Override // X.InterfaceC1238780iLE
    public final void show() {
        Activity activity = this.LLILZLL;
        PopupManager.LJIJ(new C1383390m6T(activity instanceof C19EG ? (C19EG) activity : null, 1, new AObjectS395S0100000_21(this, 0)), "share_after_post_popup", new C1668306g5("share_after_post_trigger"));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        C487280J9a.LIZJ(this);
        PopupManager.LIZJ(C1383390m6T.class);
    }

    public final void LJJIIJ(CreateAwemeResponse createAwemeResponse) {
        RemoteImageView remoteImageView;
        if (createAwemeResponse.aweme != null && (remoteImageView = this.LLILLJJLI) != null && remoteImageView.getVisibility() == 0 && createAwemeResponse.aweme.getVideo() != null) {
            C1324840ka2.LJI(this.LLILLJJLI, C1375340ltU.LIZIZ(createAwemeResponse), (int) C12ES.LIZJ(this.LLJJ, this.LLILZLL), (int) C12ES.LIZJ(this.LLJJI, this.LLILZLL), null);
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC1238780iLE
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        setWidth((int) C12ES.LIZJ(configuration.screenWidthDp, activity));
    }

    public AbstractC1375780luC(C19EG c19eg, C1371590lnR c1371590lnR, String[] strArr, Aweme aweme) {
        super(c19eg);
        this.LLIZLLLIL = 4000;
        this.LLJJ = 49;
        this.LLJJI = 59;
        this.LLILZLL = c19eg;
        this.LLJJIII = c1371590lnR;
        this.LLJJIJIL = strArr;
        this.LLJJIJI = aweme;
        View viewSd = C786410Ut5.Sd(R.layout.f8b, C786410Ut5.ne(c19eg), null);
        this.LL = viewSd;
        this.LLIZ = new RunnableC19209410Dc(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(viewSd);
        setWidth(-1);
        setHeight(-2);
        update();
        setAnimationStyle(R.style.afu);
        this.LLILZ = viewSd.findViewById(R.id.toy);
        this.LLILLJJLI = (RemoteImageView) viewSd.findViewById(R.id.lle);
        this.LLILLL = (TuxTextView) viewSd.findViewById(R.id.zhr);
        viewSd.findViewById(R.id.tv_sub_des);
        this.LLILZIL = (LinearLayout) viewSd.findViewById(R.id.tp_);
        this.LLJ = (C1378330lyJ) viewSd.findViewById(R.id.si1);
        viewSd.findViewById(R.id.lcq);
        viewSd.findViewById(R.id.zer);
        this.LLJILJIL = viewSd.findViewById(R.id.nby);
        this.LLJILJILJ = viewSd.findViewById(R.id.mpg);
        viewSd.findViewById(R.id.zzv);
        this.LLJILLL = (LinearLayout) viewSd.findViewById(R.id.nay);
        C1378330lyJ c1378330lyJ = this.LLJ;
        c1378330lyJ.LLILLL = this.LLILZIL;
        c1378330lyJ.setPullUpListener(this);
        C786410Ut5.d6(this.LLILZIL, new FrameLayout.LayoutParams(-1, -2));
        viewSd.findViewById(R.id.z8a);
        this.LLJJJ = viewSd.findViewById(R.id.mpr);
        viewSd.findViewById(R.id.ni3);
        viewSd.findViewById(R.id.k2l);
        C786410Ut5.E9(this.LLILLJJLI, new ACListenerS155S0100000_21(this, 3));
        this.LLJJIJIIJIL = (RecyclerView) viewSd.findViewById(R.id.v10);
        this.LLJ.setInternalTouchEventListener(new InterfaceC1380410m1f() { // from class: X.0luH
            @Override // X.InterfaceC1380410m1f
            public final void onTouchEvent(MotionEvent motionEvent) {
                AbstractC1375780luC abstractC1375780luC = this.LIZ;
                abstractC1375780luC.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            abstractC1375780luC.LLJI = true;
                            return;
                        }
                        return;
                    }
                    abstractC1375780luC.LLJI = false;
                    abstractC1375780luC.LLJIJIL = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = abstractC1375780luC.LLIZLLLIL;
                    abstractC1375780luC.LLJJJIL = jCurrentTimeMillis + j;
                    abstractC1375780luC.LLIZ.LL = false;
                    if (abstractC1375780luC.LLILZIL == null) {
                        return;
                    }
                    HandlerHook.viewPostDelay(abstractC1375780luC.LLILZIL, abstractC1375780luC.LLIZ, j);
                    return;
                }
                abstractC1375780luC.LLJI = true;
                RunnableC19209410Dc runnableC19209410Dc = abstractC1375780luC.LLIZ;
                if (runnableC19209410Dc == null) {
                    return;
                }
                runnableC19209410Dc.LL = true;
            }
        });
        C343710Ddh.LIZ(C1388190mED.LIZIZ(c19eg)).wQ2(this);
        C487280J9a.LIZ(c19eg.hashCode(), this);
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        String[] strArr = this.LLJJIJIL;
        if (strArr != null && strArr.length > 0) {
            boolean z3 = false;
            for (String str4 : strArr) {
                if (str4.equals(str)) {
                    z3 = true;
                }
            }
            if (z3) {
                C786410Ut5.LJLLLLLL(0, this.LL);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LL);
            }
        }
    }
}
