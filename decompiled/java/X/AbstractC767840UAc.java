package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0UAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC767840UAc {
    public final ViewGroup LIZ;
    public final DataChannel LIZIZ;
    public final C0U9B LIZJ;
    public final RecyclerView.LayoutManager LIZLLL;
    public Integer LJ;
    public boolean LJFF;
    public C0UBH LJI;
    public boolean LJII;
    public final View LJIIIIZZ;
    public final RunnableC781530UlD LJIIIZ;
    public final TextView LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public C781710UlV LJIILL;

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZ() {
        if (LiveEffectStructureOptSetting.INSTANCE.shouldClearCache()) {
            ((ArrayList) this.LIZJ.LL).clear();
            this.LIZJ.notifyDataSetChanged();
        }
    }

    public final void LJII() {
        View viewFindViewById = this.LJIIJJI.findViewById(R.id.w4z);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        viewFindViewById.startAnimation(rotateAnimation);
    }

    public final void LJIIIIZZ() {
        this.LJIIJJI.findViewById(R.id.w4z).clearAnimation();
    }

    public void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0UBH c0ubh = this.LJI;
        sbLIZ.append(c0ubh != null ? c0ubh.LIZIZ : null);
        sbLIZ.append(", ");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("EffectMonitor#onPanelSelect", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0UBH c0ubh = this.LJI;
        sbLIZ.append(c0ubh != null ? c0ubh.LIZIZ : null);
        sbLIZ.append(", ");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("EffectMonitor#onDialogOpen", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ();
        this.LJFF = true;
        C0U9B c0u9b = this.LIZJ;
        c0u9b.LLJILLL = true;
        LiveEffect liveEffect = c0u9b.LLILZIL;
        if (liveEffect != null) {
            c0u9b.LLLLLLIL(liveEffect);
        }
        if (c0u9b.LLILZLL) {
            c0u9b.LLLJIL(c0u9b.LLILZ);
            c0u9b.LLILZ = null;
        }
    }

    public final void LJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_panel_icon_click");
        c474500IjALIZ.LJIJJLI(this.LIZIZ);
        if (str == null) {
            C0UBH c0ubh = this.LJI;
            if (c0ubh != null) {
                str = c0ubh.LIZIZ;
            } else {
                str = null;
            }
        }
        c474500IjALIZ.LJJII(str, "tab");
        c474500IjALIZ.LIZ();
    }

    public void LJI(C0UBH c0ubh, boolean z, String str, AwS626S0100000_12 awS626S0100000_12) {
        this.LJI = c0ubh;
        C0U9B c0u9b = this.LIZJ;
        c0u9b.LLJJIII = c0ubh;
        this.LJIILIIL = z;
        this.LJIILJJIL = str;
        c0u9b.LLIZ = awS626S0100000_12;
    }

    public AbstractC767840UAc(ViewGroup viewGroup, DataChannel dataChannel, int i, C0U9B c0u9b, RecyclerView.LayoutManager layoutManager) {
        this.LIZ = viewGroup;
        this.LIZIZ = dataChannel;
        this.LIZJ = c0u9b;
        this.LIZLLL = layoutManager;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        this.LJIIIIZZ = viewTd;
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewTd.findViewById(R.id.eux);
        this.LJIIIZ = runnableC781530UlD;
        this.LJIIJ = (TextView) viewTd.findViewById(R.id.xmb);
        View viewFindViewById = viewTd.findViewById(R.id.nnp);
        this.LJIIJJI = viewFindViewById;
        View viewFindViewById2 = viewTd.findViewById(R.id.hc6);
        this.LJIIL = viewFindViewById2;
        this.LJIILJJIL = "";
        C500260Jjc.LLFFF(viewFindViewById);
        C500260Jjc.LJIILIIL(viewFindViewById2);
        LJII();
        runnableC781530UlD.setLayoutManager(layoutManager);
        c0u9b.setHasStableIds(true);
        runnableC781530UlD.setAdapter(c0u9b);
        runnableC781530UlD.setItemAnimator(null);
        runnableC781530UlD.setHasFixedSize(true);
        runnableC781530UlD.setItemViewCacheSize(10);
        C0U4C c0u4c = C0U4C.EFFECT_STICKER;
        int i2 = RunnableC781530UlD.LLIZLLLIL;
        RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlD.LJ(c0u4c, true, null);
        if (recycledViewPoolLJ != null) {
            recycledViewPoolLJ.setMaxRecycledViews(C0U9E.NORMAL.getValue(), 30);
        }
        runnableC781530UlD.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_effect_slide"), null));
        this.LJIILL = new C781710UlV(1, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 34));
        LJII();
    }
}
