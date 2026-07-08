package X;

import Y.ACListenerS127S0200000_25;
import Y.ACListenerS159S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.popup.RecordStickerPanelPopupScreenScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0siq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637820siq implements InterfaceC194555119t, InterfaceC362610EJn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final Effect LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function1<FrameLayout, Unit> LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public boolean LLIZLLLIL;
    public FrameLayout LLJ;
    public View LLJI;
    public C20656615sK LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1637820siq.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1637820siq.class, "activityRegistry", "getActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final q LIZIZ() {
        return (q) this.LLILZLL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        Activity activityLIZ;
        LifecycleOwner lifecycleOwner;
        Context context;
        this.LLILZ.invoke();
        if (frameLayout != null && (context = frameLayout.getContext()) != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activityLIZ;
        } else {
            lifecycleOwner = null;
        }
        if (this.LL != null && frameLayout != null && activityLIZ != null && lifecycleOwner != null) {
            if (C849850XVn.LIZIZ.LIZJ().LJJ("disturbing_sticker_warning_popup")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - C1637830sir.LLILLJJLI) < 500) {
                    return;
                }
                C1637830sir.LLILLJJLI = jCurrentTimeMillis;
                PopupManager.LJIJ(new C1637830sir(RecordStickerPanelPopupScreenScene.Companion.LIZ(activityLIZ, lifecycleOwner), new AwS391S0200000_25(this, frameLayout, 167)), "disturbing_sticker_warning_popup", new C1668306g5("disturbing_sticker_warning_creative_trigger"));
                return;
            }
            LIZJ(frameLayout, null);
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        if (C849850XVn.LIZIZ.LIZJ().LJJ("disturbing_sticker_warning_popup")) {
            C20656615sK c20656615sK = this.LLJIJIL;
            if (c20656615sK != null) {
                c20656615sK.LIZ();
            }
            if (!z) {
                C1637830sir.LLILLJJLI = 0L;
            }
        }
        if (this.LL == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(this.LLJI, frameLayout);
        }
        ((InterfaceC524950KiL) this.LLIZ.getValue(this, LLJILJIL[1])).b8(this);
        LIZIZ().rS(true);
        this.LLIZLLLIL = false;
    }

    public final void LIZJ(FrameLayout frameLayout, C20656615sK c20656615sK) {
        if (this.LL != null && frameLayout != null) {
            this.LLJIJIL = c20656615sK;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d3d, frameLayout, false);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0sis
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, viewTd);
            C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.fym);
            C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.fyl);
            C426750GoL.LJIIIZ(c197039127h, null, Integer.valueOf((int) ((((double) frameLayout.getHeight()) * 0.7d) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))))), null, null, false, 28);
            C786410Ut5.U8(c197039127h, new ACListenerS127S0200000_25(this, frameLayout, 1));
            C786410Ut5.U8(c197039127h2, new ACListenerS159S0100000_25(this, 46));
            int height = frameLayout.getHeight();
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.qdl);
            ImageView imageView = (ImageView) viewTd.findViewById(R.id.fyn);
            View viewFindViewById = viewTd.findViewById(R.id.f705fyo);
            TextView textView = (TextView) viewTd.findViewById(R.id.fyq);
            TextView textView2 = (TextView) viewTd.findViewById(R.id.fyp);
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf((int) ((((double) height) * 0.4d) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(114))))), null, null, false, 28);
            int i = this.LLILLL;
            if (i != 0) {
                if (i == 1) {
                    viewFindViewById.setBackgroundResource(R.drawable.a7h);
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C786410Ut5.LJZI(8, imageView);
                    textView.setText(2131839876);
                    textView2.setText(2131839878);
                }
            } else {
                viewFindViewById.setBackground(null);
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.LJZI(0, imageView);
                textView.setText(2131830746);
                textView2.setText(2131830745);
            }
            this.LLJI = viewTd;
            frameLayout.addView(viewTd);
            this.LLJ = frameLayout;
            ((InterfaceC524950KiL) this.LLIZ.getValue(this, LLJILJIL[1])).AH(this);
            LIZIZ().rS(false);
            C849850XVn.LIZIZ.LIZJ().LJFF("302");
            this.LLIZLLLIL = true;
        }
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.LLIZLLLIL) {
            return false;
        }
        LJJJJLL(false);
        LIZIZ().w4().LIZJ(C1622820sKe.LIZ(null, null, 5));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1637820siq(Effect effect, C1DRG c1drg, int i, Function0<Unit> function0, Function1<? super FrameLayout, Unit> function1) {
        this.LL = effect;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC524950KiL.class, null);
    }
}
