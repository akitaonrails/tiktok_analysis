package X;

import Y.ALAdapterS20S0200000_26;
import Y.AObjectS69S0000000_16;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import Y.AUListenerS274S0100000_26;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import wh6.AbS705S0100000_26;

/* JADX INFO: renamed from: X.0w38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1765720w38 extends FrameLayout implements InterfaceC588410N5z {
    public static final /* synthetic */ int LLJZ = 0;
    public final View LL;
    public final C1547940qNs LLILLJJLI;
    public boolean LLILLL;
    public final C1765730w39 LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final ImageView LLIZ;
    public final C19736512Jv LLIZLLLIL;
    public final C289601Ag LLJ;
    public final TuxTextView LLJI;
    public final C19736512Jv LLJIJIL;
    public final TextureView LLJILJIL;
    public final ImageView LLJILJILJ;
    public final C19736512Jv LLJILLL;
    public final C0GXB LLJJ;
    public final ImageView LLJJI;
    public final TuxSpinner LLJJIII;
    public final TuxTextView LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public C1752030vh3 LLJJIJIL;
    public boolean LLJJJ;
    public ARunnableS126S0100000_26 LLJJJIL;
    public boolean LLJJJJ;
    public InterfaceC1763420vzQ LLJJJJJIL;
    public InterfaceC1765740w3A LLJJJJLIIL;
    public ViewGroup LLJJL;
    public Window LLJJLIIIJLLLLLLLZ;
    public C0JSE LLJL;
    public int LLJLIL;
    public Bitmap LLJLILLLLZIIL;
    public C1752050vh5 LLJLL;
    public final C01GW LLJLLIL;
    public final C0JSE LLJLLL;

    public void onPausePlay(String str) {
    }

    @Override // X.InterfaceC588410N5z
    public final void onPreparePlay(String str) {
    }

    public void onResumePlay(String str) {
    }

    private final Handler getMainHandler() {
        return (Handler) this.LLJLLIL.getValue();
    }

    public final void LIZJ() {
        InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            interfaceC1765740w3A.pause();
            LJI();
        }
    }

    public final void LIZLLL() {
        InterfaceC1765740w3A interfaceC1765740w3A;
        if (this.LLJJJJ || C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_PAUSE || (interfaceC1765740w3A = this.LLJJJJLIIL) == null) {
            return;
        }
        this.LLJJJJ = false;
        interfaceC1765740w3A.resume();
        LJIIIIZZ();
    }

    public final void LJFF() {
        InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            interfaceC1765740w3A.stop();
        }
    }

    public final void LJI() {
        if (C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_IDLE) {
            C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_PAUSE;
            C1765730w39 c1765730w39 = this.LLILZ;
            C786410Ut5.LJLLLLLL(0, c1765730w39.LLJI);
            c1765730w39.LIZIZ();
        } else {
            C1765730w39 c1765730w392 = this.LLILZ;
            C786410Ut5.LJLLLLLL(8, c1765730w392.LLJI);
            c1765730w392.LIZIZ();
        }
        this.LLJILLL.LIZ();
        this.LLIZLLLIL.LIZ();
        this.LLILZ.LIZLLL();
        LJIIJJI(false);
    }

    @Override // X.InterfaceC588410N5z
    public final void LJII() {
        C786410Ut5.LJZI(8, this.LLJILJILJ);
    }

    public final void LJIIIIZZ() {
        C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_START;
        this.LLJILLL.LIZJ();
        this.LLIZLLLIL.LIZJ();
        C1765730w39 c1765730w39 = this.LLILZ;
        C786410Ut5.LJLLLLLL(0, c1765730w39.LLJI);
        c1765730w39.LIZIZ();
        this.LLILZ.LIZ(3000L);
        this.LLILZ.LJI();
    }

    public final void LJIIIZ() {
        InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            this.LLJJJJ = true;
            interfaceC1765740w3A.pause();
            LJI();
        }
    }

    public final void LJIIL() {
        int i = C1508440pMA.LIZ[C1507750pL3.LIZIZ.ordinal()];
        if (i == 1) {
            C786410Ut5.LJZI(8, this.LLIZ);
            C786410Ut5.LJZI(0, this.LLJJI);
            C786410Ut5.LLLLLLLLL(this.LLJILLL, 0);
            this.LLIZLLLIL.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b2z);
            this.LLIZLLLIL.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b2z);
            this.LLJJIII.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b32);
            this.LLJJIII.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b32);
            ((ViewGroup.MarginLayoutParams) this.LLJJIII.getLayoutParams()).topMargin = (int) getResources().getDimension(R.dimen.b31);
            ((ViewGroup.MarginLayoutParams) this.LLJI.getLayoutParams()).leftMargin = (int) getResources().getDimension(R.dimen.b2y);
            ((ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams()).rightMargin = (int) getResources().getDimension(R.dimen.b2y);
            this.LLJJ.setPadding((int) getResources().getDimension(R.dimen.b34), 0, (int) getResources().getDimension(R.dimen.b34), 0);
            this.LLJJIJI.setTextSize(0, getResources().getDimension(R.dimen.b33));
            this.LLILZLL.setTextSize(0, getResources().getDimension(R.dimen.b33));
            this.LLJJIJIIJIL.setTextSize(0, getResources().getDimension(R.dimen.b30));
            return;
        }
        if (i == 2) {
            C786410Ut5.LJZI(0, this.LLIZ);
            C786410Ut5.LJZI(8, this.LLJJI);
            C786410Ut5.LLLLLLLLL(this.LLJILLL, 8);
            this.LLIZLLLIL.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b2m);
            this.LLIZLLLIL.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b2m);
            ((ViewGroup.MarginLayoutParams) this.LLJI.getLayoutParams()).leftMargin = (int) getResources().getDimension(R.dimen.b2w);
            ((ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams()).rightMargin = (int) getResources().getDimension(R.dimen.b2w);
            this.LLJJIII.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b2l);
            this.LLJJIII.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b2l);
            ((ViewGroup.MarginLayoutParams) this.LLJJIII.getLayoutParams()).topMargin = (int) getResources().getDimension(R.dimen.b2k);
            this.LLJJ.setPadding((int) getResources().getDimension(R.dimen.b2x), 0, (int) getResources().getDimension(R.dimen.b2x), 0);
            this.LLJJIJI.setTextSize(0, getResources().getDimension(R.dimen.b2o));
            this.LLILZLL.setTextSize(0, getResources().getDimension(R.dimen.b2o));
            this.LLJJIJIIJIL.setTextSize(0, getResources().getDimension(R.dimen.b2n));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLIZ.getLayoutParams();
            marginLayoutParams.leftMargin = (int) getResources().getDimension(R.dimen.b2u);
            marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.b2v);
            return;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        C786410Ut5.LJZI(0, this.LLIZ);
        C786410Ut5.LJZI(8, this.LLJJI);
        C786410Ut5.LLLLLLLLL(this.LLJILLL, 8);
        this.LLIZLLLIL.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b2m);
        this.LLIZLLLIL.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b2m);
        ((ViewGroup.MarginLayoutParams) this.LLJI.getLayoutParams()).leftMargin = (int) getResources().getDimension(R.dimen.b2r);
        ((ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams()).rightMargin = (int) getResources().getDimension(R.dimen.b2r);
        this.LLJJIII.getLayoutParams().width = (int) getResources().getDimension(R.dimen.b2l);
        this.LLJJIII.getLayoutParams().height = (int) getResources().getDimension(R.dimen.b2l);
        ((ViewGroup.MarginLayoutParams) this.LLJJIII.getLayoutParams()).topMargin = (int) getResources().getDimension(R.dimen.b2k);
        this.LLJJ.setPadding((int) getResources().getDimension(R.dimen.b2s), 0, (int) getResources().getDimension(R.dimen.b2s), 0);
        this.LLJJIJI.setTextSize(0, getResources().getDimension(R.dimen.b2o));
        this.LLILZLL.setTextSize(0, getResources().getDimension(R.dimen.b2o));
        this.LLJJIJIIJIL.setTextSize(0, getResources().getDimension(R.dimen.b2n));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LLIZ.getLayoutParams();
        marginLayoutParams2.leftMargin = (int) getResources().getDimension(R.dimen.b2p);
        marginLayoutParams2.topMargin = (int) getResources().getDimension(R.dimen.b2q);
    }

    public final boolean getAutoReleaseImmersionBar() {
        return this.LLILLL;
    }

    public final Bitmap getCoverImage$player_release() {
        return this.LLJLILLLLZIIL;
    }

    public final ImageView getCoverView() {
        return this.LLJILJILJ;
    }

    public final ViewGroup getFullScreenContainerView$player_release() {
        return this.LLJJL;
    }

    public final C1752050vh5 getMiddleAction$player_release() {
        return this.LLJLL;
    }

    public final C1752030vh3 getParams() {
        return this.LLJJIJIL;
    }

    public final InterfaceC1765740w3A getPlayer$player_release() {
        return this.LLJJJJLIIL;
    }

    public final InterfaceC1763420vzQ getPlayerLogListener$player_release() {
        return this.LLJJJJJIL;
    }

    public final View getStatusBarView() {
        return this.LL;
    }

    public final int getVideoLength$player_release() {
        return this.LLJLIL;
    }

    public final C0JSE getVideoSize$player_release() {
        return this.LLJL;
    }

    public final C1547940qNs getVideoView() {
        return this.LLILLJJLI;
    }

    public final Window getWindow$player_release() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    /* JADX INFO: renamed from: getVideoView, reason: collision with other method in class */
    public final TextureView m68getVideoView() {
        return this.LLJILJIL;
    }

    public static void LIZIZ(C1765720w38 c1765720w38) {
        int networkSpeed;
        C1C7U.LIZ("TuxPlayerView@6ebd.startNetSpeedLoop$1L");
        C1765730w39 c1765730w39 = c1765720w38.LLILZ;
        c1765730w39.LLJILJILJ = true;
        if (!c1765730w39.LLJILJIL) {
            c1765730w39.LJ(2);
        }
        C786410Ut5.LLLLLLLLL(c1765730w39.LLIZLLLIL, 8);
        InterfaceC1765740w3A interfaceC1765740w3A = c1765720w38.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            networkSpeed = interfaceC1765740w3A.getNetworkSpeed();
        } else {
            networkSpeed = 0;
        }
        c1765720w38.LLILZ.setNetSpeed(networkSpeed);
        ARunnableS126S0100000_26 aRunnableS126S0100000_26 = c1765720w38.LLJJJIL;
        if (aRunnableS126S0100000_26 != null) {
            C786410Ut5.LJLIIL(1000L, c1765720w38.getMainHandler(), aRunnableS126S0100000_26);
        }
        C1C7U.LIZIZ("TuxPlayerView@6ebd.startNetSpeedLoop$1L");
    }

    public final void LIZ(boolean z) {
        getMainHandler().removeCallbacksAndMessages(null);
        this.LLJJJIL = null;
        C1765730w39 c1765730w39 = this.LLILZ;
        c1765730w39.getClass();
        ((Handler) C998660c5w.LIZ.getValue()).removeCallbacksAndMessages(null);
        C998660c5w.LIZIZ = null;
        c1765730w39.LLJILJIL = false;
        c1765730w39.LLJILJILJ = false;
        c1765730w39.LLJILLL = false;
        if (z) {
            c1765730w39.LLJIJIL = null;
            InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
            if (interfaceC1765740w3A != null) {
                interfaceC1765740w3A.release();
            }
        }
        this.LLJJJ = false;
        this.LLJJJJ = true;
        C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_IDLE;
        C1507750pL3.LIZIZ = EnumC1508450pMB.PREVIEW;
    }

    public final void LJ(EnumC1508450pMB enumC1508450pMB) {
        C1507750pL3.LIZIZ = enumC1508450pMB;
        if (enumC1508450pMB != EnumC1508450pMB.PREVIEW) {
            if (this.LLJJJJLIIL != null && C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START) {
                C1765730w39 c1765730w39 = this.LLILZ;
                c1765730w39.LLJILLL = false;
                C786410Ut5.c5(c1765730w39.LLILZIL, 0.0f);
                c1765730w39.LIZIZ();
            }
        } else if (this.LLJJJJLIIL != null) {
            if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START) {
                this.LLILZ.LJFF();
            } else {
                this.LLILZ.LIZLLL();
            }
        }
        this.LLILZ.LJI();
        LJIIL();
    }

    public final void LJIIJ(float f) {
        InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            this.LLJJJJ = false;
            int i = (int) (this.LLJLIL * f);
            if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_IDLE) {
                interfaceC1765740w3A.start(i);
            } else if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_PAUSE) {
                if (f > 0.0f) {
                    interfaceC1765740w3A.LJIILL(f * 100);
                }
                interfaceC1765740w3A.resume();
            } else {
                interfaceC1765740w3A.LJIILL(f * 100);
            }
            LJIIIIZZ();
        }
    }

    public final void LJIIJJI(boolean z) {
        C1765730w39 c1765730w39 = this.LLILZ;
        c1765730w39.LLJILJILJ = false;
        C786410Ut5.LLILZIL(c1765730w39.LL, 8);
        if (C1507750pL3.LIZIZ != EnumC1508450pMB.PREVIEW || C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_IDLE) {
            if (z && c1765730w39.LLJJI) {
                c1765730w39.LLIZLLLIL.LIZJ();
                C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_START;
            }
            c1765730w39.LJ(0);
        }
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC588410N5z
    public final void LJLLI(String str) {
        C786410Ut5.LLILZIL(this.LLILZ.LLILLJJLI, 0);
    }

    @Override // X.InterfaceC588410N5z
    public final void LL(String str) {
        C786410Ut5.LLILZIL(this.LLILZ.LLILLL, 0);
    }

    @Override // X.InterfaceC588410N5z
    public final void onBuffering(boolean z) {
        if (z) {
            C1752030vh3 c1752030vh3 = this.LLJJIJIL;
            if (c1752030vh3 != null && !c1752030vh3.LJIIIIZZ) {
                this.LLILZ.LJFF();
            }
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS126S0100000_26 aRunnableS126S0100000_26 = new ARunnableS126S0100000_26(this, 132);
            this.LLJJJIL = aRunnableS126S0100000_26;
            C786410Ut5.LJLIIL(1000L, getMainHandler(), aRunnableS126S0100000_26);
            return;
        }
        LJIIJJI(true);
    }

    public void onPlayCompleted(String str) {
        C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_IDLE;
        InterfaceC1765740w3A interfaceC1765740w3A = this.LLJJJJLIIL;
        if (interfaceC1765740w3A != null) {
            interfaceC1765740w3A.LJIILL(0.0f);
        }
        LJIIIZ();
        this.LLJI.setText(C1765670w33.LIZ(0));
        this.LLJJ.setProgress(0);
        C786410Ut5.LJZI(0, this.LLJILJILJ);
        this.LLILZ.LJI();
    }

    @Override // X.InterfaceC588410N5z
    public final void onPlayProgressChange(float f) {
        if (this.LLILZ.LLJILJIL) {
            return;
        }
        float f2 = f / 100;
        this.LLJI.setText(C1765670w33.LIZIZ(f2, this.LLJLIL));
        if (!this.LLJJJ) {
            this.LLJJ.setProgress((int) (f2 * 10000));
        }
    }

    public final void setAutoReleaseImmersionBar(boolean z) {
        this.LLILLL = z;
    }

    public final void setCoverImage$player_release(Bitmap bitmap) {
        this.LLJLILLLLZIIL = bitmap;
        this.LLILLJJLI.setCoverImage(bitmap);
    }

    public final void setFullScreenContainerView$player_release(ViewGroup viewGroup) {
        this.LLJJL = viewGroup;
    }

    public final void setMiddleAction$player_release(C1752050vh5 c1752050vh5) {
        this.LLJLL = c1752050vh5;
        this.LLILZ.setMiddleAction(c1752050vh5);
    }

    public final void setParams(C1752030vh3 c1752030vh3) {
        int iIntValue;
        InterfaceC1765740w3A interfaceC1765740w3A;
        ViewGroup viewGroup;
        Window window;
        C0JSE c0jse;
        Bitmap bitmap;
        InterfaceC1763420vzQ interfaceC1763420vzQ;
        Integer num;
        this.LLJJIJIL = c1752030vh3;
        boolean z = false;
        if (c1752030vh3 != null && (num = c1752030vh3.LJ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        setVideoLength$player_release(iIntValue);
        C1752030vh3 c1752030vh32 = this.LLJJIJIL;
        C1752050vh5 c1752050vh5 = null;
        if (c1752030vh32 != null) {
            interfaceC1765740w3A = c1752030vh32.LIZ;
        } else {
            interfaceC1765740w3A = null;
        }
        this.LLJJJJLIIL = interfaceC1765740w3A;
        if (c1752030vh32 != null) {
            viewGroup = c1752030vh32.LIZIZ;
        } else {
            viewGroup = null;
        }
        this.LLJJL = viewGroup;
        if (c1752030vh32 != null) {
            window = c1752030vh32.LIZJ;
        } else {
            window = null;
        }
        this.LLJJLIIIJLLLLLLLZ = window;
        if (c1752030vh32 != null) {
            c0jse = c1752030vh32.LIZLLL;
        } else {
            c0jse = null;
        }
        this.LLJL = c0jse;
        if (c1752030vh32 != null) {
            bitmap = c1752030vh32.LJFF;
        } else {
            bitmap = null;
        }
        setCoverImage$player_release(bitmap);
        C1752030vh3 c1752030vh33 = this.LLJJIJIL;
        if (c1752030vh33 != null) {
            interfaceC1763420vzQ = c1752030vh33.LJI;
        } else {
            interfaceC1763420vzQ = null;
        }
        this.LLJJJJJIL = interfaceC1763420vzQ;
        if (c1752030vh33 != null) {
            c1752050vh5 = c1752030vh33.LJII;
        }
        setMiddleAction$player_release(c1752050vh5);
        C1765730w39 c1765730w39 = this.LLILZ;
        C1752030vh3 c1752030vh34 = this.LLJJIJIL;
        if (c1752030vh34 != null && c1752030vh34.LJIIIIZZ) {
            z = true;
        }
        c1765730w39.setInFeedScene(z);
    }

    public final void setPlayer$player_release(InterfaceC1765740w3A interfaceC1765740w3A) {
        this.LLJJJJLIIL = interfaceC1765740w3A;
    }

    public final void setPlayerLogListener$player_release(InterfaceC1763420vzQ interfaceC1763420vzQ) {
        this.LLJJJJJIL = interfaceC1763420vzQ;
    }

    public final void setVideoLength$player_release(int i) {
        this.LLJLIL = i;
        String strLIZ = C1765670w33.LIZ(i);
        this.LLILZIL.setText(strLIZ);
        this.LLILZLL.setText(strLIZ);
    }

    public final void setVideoSize$player_release(C0JSE c0jse) {
        this.LLJL = c0jse;
    }

    public final void setWindow$player_release(Window window) {
        this.LLJJLIIIJLLLLLLLZ = window;
    }

    public C1765720w38(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yg);
        this.LLJJJJ = true;
        this.LLJLLIL = C452501pT.LIZIZ(new AObjectS69S0000000_16(6));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_q, this, true);
        this.LL = findViewById(R.id.w0u);
        this.LLILLJJLI = (C1547940qNs) findViewById(R.id.video_view);
        C1765730w39 c1765730w39 = (C1765730w39) findViewById(R.id.qtg);
        this.LLILZ = c1765730w39;
        this.LLILZIL = (TuxTextView) findViewById(R.id.video_duration);
        this.LLILZLL = (TuxTextView) findViewById(R.id.yfn);
        ImageView imageView = (ImageView) findViewById(R.id.hff);
        this.LLIZ = imageView;
        C19736512Jv c19736512Jv = (C19736512Jv) findViewById(R.id.qmi);
        this.LLIZLLLIL = c19736512Jv;
        this.LLJ = (C289601Ag) findViewById(R.id.xwn);
        this.LLJI = (TuxTextView) findViewById(R.id.qnk);
        this.LLJIJIL = (C19736512Jv) findViewById(R.id.vki);
        this.LLJILJIL = (TextureView) findViewById(R.id.video_surface);
        this.LLJILJILJ = (ImageView) findViewById(R.id.cover);
        this.LLJILLL = (C19736512Jv) findViewById(R.id.qnd);
        this.LLJJ = (C0GXB) findViewById(R.id.vkd);
        this.LLJJI = (ImageView) findViewById(R.id.inu);
        this.LLJJIII = (TuxSpinner) findViewById(R.id.qng);
        this.LLJJIJI = (TuxTextView) findViewById(R.id.fb0);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.flf);
        LJIIL();
        C786410Ut5.I7(new AbS705S0100000_26(this, 19, 42), imageView);
        C786410Ut5.I7(new AbS705S0100000_26(this, 20, 42), c19736512Jv);
        c1765730w39.setOnPlayerActionBarListener(new InterfaceC1765790w3F() { // from class: X.0w3B
            @Override // X.InterfaceC1765790w3F
            public final void LIZ() {
                this.LIZ.LLILZ.LJ(1);
                this.LIZ.LLJJJ = true;
            }

            @Override // X.InterfaceC1765790w3F
            public final void LIZIZ() {
                if (C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_START) {
                    this.LIZ.LJIIIZ();
                    return;
                }
                InterfaceC1763420vzQ playerLogListener$player_release = this.LIZ.getPlayerLogListener$player_release();
                if (playerLogListener$player_release != null) {
                    playerLogListener$player_release.LIZIZ();
                }
                this.LIZ.LJIIJ(0.0f);
            }

            @Override // X.InterfaceC1765790w3F
            public final void LIZLLL() {
                InterfaceC1765740w3A player$player_release = this.LIZ.getPlayer$player_release();
                if (player$player_release != null) {
                    C1765720w38 c1765720w38 = this.LIZ;
                    if (player$player_release.isMute()) {
                        player$player_release.LJIIIIZZ();
                        c1765720w38.LLJIJIL.LIZ();
                    } else {
                        player$player_release.mute();
                        c1765720w38.LLJIJIL.LIZJ();
                    }
                }
            }

            @Override // X.InterfaceC1765790w3F
            public final void LJFF() {
                C786410Ut5.LLILZIL(this.LIZ.LLILZ.LLILLL, 8);
                C1765720w38 c1765720w38 = this.LIZ;
                InterfaceC1765740w3A interfaceC1765740w3A = c1765720w38.LLJJJJLIIL;
                if (interfaceC1765740w3A != null) {
                    c1765720w38.LLJJJJ = false;
                    interfaceC1765740w3A.retry();
                    c1765720w38.LJIIIIZZ();
                }
            }

            /* JADX WARN: Type inference failed for: r0v53, types: [X.0w3E] */
            /* JADX WARN: Type inference failed for: r1v22, types: [T, android.view.Window$Callback] */
            @Override // X.InterfaceC1765790w3F
            public final void LJII() {
                LifecycleOwner lifecycleOwner;
                Activity activity;
                C1547940qNs videoView;
                Bitmap videoFrame;
                C19EG c19eg;
                LifecycleOwner lifecycleOwner2;
                C0JSE videoSize$player_release = this.LIZ.getVideoSize$player_release();
                if (videoSize$player_release != null) {
                    C1765720w38 c1765720w38 = this.LIZ;
                    boolean z = videoSize$player_release.LIZ < videoSize$player_release.LIZIZ;
                    ViewGroup fullScreenContainerView$player_release = c1765720w38.getFullScreenContainerView$player_release();
                    boolean autoReleaseImmersionBar = c1765720w38.getAutoReleaseImmersionBar();
                    if (fullScreenContainerView$player_release != null) {
                        KeyEventCallbackC1765760w3C.LLJIJIL = fullScreenContainerView$player_release;
                        KeyEventCallbackC1765760w3C.LLIZ = c1765720w38;
                        ViewParent parent = c1765720w38.getParent();
                        KeyEventCallbackC1765760w3C.LLJ = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        ViewGroup.LayoutParams layoutParams = c1765720w38.getLayoutParams();
                        Class<?> cls = layoutParams.getClass();
                        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) Class.forName(cls.getName()).getConstructor(ViewGroup.LayoutParams.class).newInstance(layoutParams);
                        C089E c089e = new C089E(cls.getDeclaredFields());
                        while (c089e.hasNext()) {
                            Field field = (Field) c089e.next();
                            if (!TextUtils.equals(field.getName(), "widget")) {
                                field.setAccessible(true);
                                try {
                                    field.set(layoutParams2, field.get(layoutParams));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                        KeyEventCallbackC1765760w3C.LLJI = layoutParams2;
                        KeyEventCallbackC1765760w3C.LLIZLLLIL = c1765720w38;
                        Context context2 = c1765720w38.getContext();
                        Window window$player_release = c1765720w38.getWindow$player_release();
                        if (window$player_release != null) {
                            final C259800zU c259800zU = new C259800zU();
                            ?? callback = window$player_release.getCallback();
                            c259800zU.element = callback;
                            if (KeyEventCallbackC1765760w3C.LLILZIL == null) {
                                KeyEventCallbackC1765760w3C.LLILZLL = callback;
                                KeyEventCallbackC1765760w3C.LLILZIL = new WindowCallbackC1202580hOq(c259800zU) { // from class: X.0w3E
                                    {
                                        super(c259800zU.element);
                                    }

                                    @Override // X.WindowCallbackC1202580hOq, android.view.Window.Callback
                                    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                                        KeyEventCallbackC1765760w3C keyEventCallbackC1765760w3C = KeyEventCallbackC1765760w3C.LL;
                                        if ((KeyEventCallbackC1765760w3C.LLJJIII == EnumC1508450pMB.PORTRAIT || KeyEventCallbackC1765760w3C.LLJJIII == EnumC1508450pMB.HORIZONTAL) && keyEvent.getKeyCode() == 4 && keyEvent.dispatch(keyEventCallbackC1765760w3C, new KeyEvent.DispatcherState(), keyEventCallbackC1765760w3C)) {
                                            return true;
                                        }
                                        return super.dispatchKeyEvent(keyEvent);
                                    }
                                };
                            }
                            C1765780w3E c1765780w3E = KeyEventCallbackC1765760w3C.LLILZIL;
                            if (c1765780w3E != null) {
                                window$player_release.setCallback(c1765780w3E);
                            }
                        }
                        if (z) {
                            Window window$player_release2 = c1765720w38.getWindow$player_release();
                            if (window$player_release2 != null) {
                                c1765720w38.getStatusBarView().getLayoutParams().height = C497820Jfg.LIZJ(context2);
                                C786410Ut5.LJLLLLLL(0, c1765720w38.getStatusBarView());
                                if (context2 instanceof C19EG) {
                                    c19eg = (C19EG) context2;
                                } else if (C1388190mED.LIZ(context2) instanceof C19EG) {
                                    c19eg = (C19EG) C1388190mED.LIZ(context2);
                                }
                                if (c19eg != null) {
                                    TuxImmersionBar tuxImmersionBarLJI = C1766560w4U.LJI(c19eg, window$player_release2);
                                    tuxImmersionBarLJI.LIZIZ.LJIIJ(false);
                                    tuxImmersionBarLJI.LJIIIZ(0);
                                    tuxImmersionBarLJI.LIZJ(false, false);
                                    if (autoReleaseImmersionBar && (lifecycleOwner2 = ViewTreeLifecycleOwner.get(c1765720w38)) != null) {
                                        TuxImmersionBar.LIZIZ(lifecycleOwner2, c19eg, window$player_release2);
                                    }
                                    tuxImmersionBarLJI.LIZLLL();
                                }
                            }
                            Rect rectLIZ = C998660c5w.LIZ(c1765720w38.getVideoView());
                            Rect rectLIZ2 = C998660c5w.LIZ(fullScreenContainerView$player_release);
                            int[] iArr = KeyEventCallbackC1765760w3C.LLILLJJLI;
                            iArr[0] = rectLIZ.left - rectLIZ2.left;
                            iArr[1] = rectLIZ.top - rectLIZ2.top;
                            KeyEventCallbackC1765760w3C.LLILZ = c1765720w38.getVideoView().getWidth();
                            KeyEventCallbackC1765760w3C.LLILLL = c1765720w38.getVideoView().getHeight();
                            ImageView imageView2 = new ImageView(context2);
                            KeyEventCallbackC1765760w3C.LLJILJIL = imageView2;
                            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                            ImageView imageView3 = KeyEventCallbackC1765760w3C.LLJILJIL;
                            C1765720w38 c1765720w382 = KeyEventCallbackC1765760w3C.LLIZ;
                            if (c1765720w382 != null && (videoView = c1765720w382.getVideoView()) != null && (videoFrame = videoView.getVideoFrame()) != null && imageView3 != null) {
                                imageView3.setImageBitmap(videoFrame);
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(KeyEventCallbackC1765760w3C.LLILZ, KeyEventCallbackC1765760w3C.LLILLL);
                            marginLayoutParams.topMargin = iArr[1];
                            marginLayoutParams.leftMargin = iArr[0];
                            ImageView imageView4 = KeyEventCallbackC1765760w3C.LLJILJIL;
                            if (imageView4 != null) {
                                C786410Ut5.c6(imageView4, marginLayoutParams);
                            }
                            KeyEventCallbackC1765760w3C.LIZ(KeyEventCallbackC1765760w3C.LLJILJIL, fullScreenContainerView$player_release, null);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(rectLIZ2, 17));
                            valueAnimatorOfFloat.addListener(new ALAdapterS20S0200000_26(c1765720w38, fullScreenContainerView$player_release, 1));
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                            valueAnimatorOfFloat.start();
                        } else {
                            if ((context2 instanceof Activity) && (activity = (Activity) context2) != null) {
                                try {
                                    activity.setRequestedOrientation(0);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            KeyEventCallbackC1765760w3C.LLJJIII = EnumC1508450pMB.HORIZONTAL;
                            KeyEventCallbackC1765760w3C.LIZJ(c1765720w38);
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1765720w38.getLayoutParams();
                            marginLayoutParams2.width = -1;
                            marginLayoutParams2.height = -1;
                            marginLayoutParams2.topMargin = 0;
                            KeyEventCallbackC1765760w3C.LIZ(c1765720w38, fullScreenContainerView$player_release, null);
                            Window window$player_release3 = c1765720w38.getWindow$player_release();
                            if (window$player_release3 != null) {
                                C19EG c19eg2 = (C19EG) context2;
                                TuxImmersionBar tuxImmersionBarLJI2 = C1766560w4U.LJI(c19eg2, window$player_release3);
                                tuxImmersionBarLJI2.LIZJ(true, true);
                                if (autoReleaseImmersionBar && (lifecycleOwner = ViewTreeLifecycleOwner.get(c1765720w38)) != null) {
                                    TuxImmersionBar.LIZIZ(lifecycleOwner, c19eg2, window$player_release3);
                                }
                                tuxImmersionBarLJI2.LIZLLL();
                            }
                            C1765720w38 c1765720w383 = KeyEventCallbackC1765760w3C.LLIZLLLIL;
                            if (c1765720w383 != null) {
                                c1765720w383.LJ(KeyEventCallbackC1765760w3C.LLJJIII);
                            }
                        }
                    }
                    InterfaceC1765740w3A player$player_release = c1765720w38.getPlayer$player_release();
                    if (player$player_release != null) {
                        player$player_release.LIZIZ();
                    }
                }
            }

            @Override // X.InterfaceC1765790w3F
            public final void LIZJ(float f) {
                String strLIZIZ = C1765670w33.LIZIZ(f, this.LIZ.getVideoLength$player_release());
                this.LIZ.LLJ.getCurrentDurationTV().setText(strLIZIZ);
                this.LIZ.LLJI.setText(strLIZIZ);
            }

            @Override // X.InterfaceC1765790w3F
            public final void LJ(float f) {
                C1765730w39 c1765730w392 = this.LIZ.LLILZ;
                C786410Ut5.LLLLLLLLLL(c1765730w392.LLIZ, 8);
                if (c1765730w392.LLJILJILJ) {
                    c1765730w392.LJ(2);
                } else if (C1507750pL3.LIZIZ != EnumC1508450pMB.PREVIEW) {
                    c1765730w392.LJ(0);
                }
                this.LIZ.LJIIJ(f);
                this.LIZ.LLJJJ = false;
            }

            @Override // X.InterfaceC1765790w3F
            public final void LJI(float f, int i) {
                InterfaceC1765740w3A player$player_release = this.LIZ.getPlayer$player_release();
                if (player$player_release != null) {
                    player$player_release.LIZ();
                }
            }
        });
        this.LLJLLL = new C0JSE(0, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJLLL.LIZ = View.MeasureSpec.getSize(i);
        this.LLJLLL.LIZIZ = View.MeasureSpec.getSize(i2);
        C0JSE c0jse = this.LLJL;
        if (c0jse != null) {
            HandlerHook.viewPost(this, new ARunnableS95S0200000_26(this, c0jse, 59));
        }
    }

    @Override // X.InterfaceC588410N5z
    public final void onBufferedPercent(String str, long j, int i) {
        this.LLJJ.setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }
}
