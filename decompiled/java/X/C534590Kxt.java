package X;

import Y.ARunnableS19S0101000_8;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Kxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534590Kxt extends AbstractC2255721DQs<InterfaceC23230098i> implements InterfaceC23230098i, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public CreativeLoadingDialog LLILZ;
    public final InterfaceC23230098i LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final SafeHandler LLILZIL = new SafeHandler(this);
    public final Map<Integer, Runnable> LLILZLL = new LinkedHashMap();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C534590Kxt.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = 8;
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZLL.clear();
    }

    public InterfaceC23230098i W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C534590Kxt(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC23230098i
    public void AN(int i) {
        Runnable runnableRemove = this.LLILZLL.remove(Integer.valueOf(i));
        if (runnableRemove != null) {
            this.LLILZIL.removeCallbacks(runnableRemove);
        }
        CreativeLoadingDialog creativeLoadingDialog = this.LLILZ;
        if (creativeLoadingDialog != null && creativeLoadingDialog.isShowing()) {
            CreativeLoadingDialog creativeLoadingDialog2 = this.LLILZ;
            if (creativeLoadingDialog2 != null) {
                creativeLoadingDialog2.dismiss();
            }
            this.LLILZ = null;
            X1(false, i);
        }
    }

    @Override // X.InterfaceC23230098i
    public void Ip2(int i) {
        if (this.LLILZ == null) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            C19EG activity = getActivity();
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.loadingMessage(getActivity().getString(R.string.rdr));
            this.LLILZ = c19576911iZ.createLoadingDialog(activity, i, creativeLoadingDialogBuilder);
        }
        CreativeLoadingDialog creativeLoadingDialog = this.LLILZ;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.show();
        }
        X1(true, i);
    }

    private final void X1(boolean z, int i) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(i, c0mvy, C0LD3.DUAL_BALL_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    @Override // X.InterfaceC23230098i
    public void WV1(int i, long j) {
        ARunnableS19S0101000_8 aRunnableS19S0101000_8 = new ARunnableS19S0101000_8(i, this, 4);
        this.LLILZLL.put(Integer.valueOf(i), aRunnableS19S0101000_8);
        this.LLILZIL.postDelayed(aRunnableS19S0101000_8, j);
    }
}
