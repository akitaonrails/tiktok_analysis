package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyDownloadOptSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyPanelAlphaOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0U6S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6S {
    public final ViewGroup LIZ;
    public final DataChannel LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public final C0U78 LJI;
    public final C0U6X LJII;
    public Function0<Unit> LJIIIIZZ;
    public Function1<? super LiveEffect, Unit> LJIIIZ;
    public final View LJIIJ;
    public final View LJIIJJI;
    public final RunnableC781530UlD LJIIL;
    public final C16F5 LJIILIIL;
    public final LiveSmallItemBeautyViewModel LJIILJJIL;
    public boolean LJIILL;
    public AnonymousClass0956 LJIILLIIL;
    public final C781710UlV LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0U6W, X.0U6X, X.19ry] */
    public C0U6S(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel, String str, String str2, String str3, String str4, C0U78 c0u78) {
        this.LIZ = viewGroup2;
        this.LIZIZ = dataChannel;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = c0u78;
        ?? r7 = new C0U6W() { // from class: X.0U6X
            public final C0U78 LLJ = C0UA1.LIZ();
            public final C01GW LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 935));

            @Override // X.C0U6W
            public final void LLLLLLLLLL(int i, LiveEffect liveEffect) {
                if (C761910Tuf.LIZ) {
                    return;
                }
                if (C0U7C.LJIILL(liveEffect, this.LLJ)) {
                    C766270U4b.LIZLLL(2131841021);
                    return;
                }
                if (!C766720U5u.LJIILLIIL(liveEffect)) {
                    if (!liveEffect.LIZLLL()) {
                        liveEffect.LJLILLLLZI(true);
                        C766720U5u.LJ(liveEffect, (C0U45) this.LLJI.getValue());
                        return;
                    }
                    return;
                }
                LLLJ(this.LLILZIL);
                LLLILZ(i);
                this.LLILZIL = i;
                InterfaceC766800U6c interfaceC766800U6c = this.LLILZLL;
                if (interfaceC766800U6c != null) {
                    interfaceC766800U6c.LIZ(liveEffect);
                }
            }

            @Override // X.C0U6W
            public final void LLLLLLIL(int i, C0U6Z c0u6z, LiveEffect liveEffect) {
                if (C766720U5u.LJIILLIIL(liveEffect) || LiveBeautyDownloadOptSetting.INSTANCE.inV1()) {
                    C786410Ut5.LJZI(8, c0u6z.LLILZ);
                } else {
                    C786410Ut5.LJZI(0, c0u6z.LLILZ);
                    C766720U5u.LJ(liveEffect, this.LLIZLLLIL);
                }
                if (C0U7C.LJIILL(liveEffect, this.LLJ)) {
                    C786410Ut5.T4(c0u6z.itemView, 0.4f);
                } else {
                    C786410Ut5.T4(c0u6z.itemView, 1.0f);
                }
                if (this.LLILZIL == i) {
                    C0U6W.LLLLLLL(c0u6z);
                } else {
                    C0U6W.LLLLLLLLL(c0u6z);
                }
            }
        };
        this.LJII = r7;
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewGroup.findViewById(R.id.wds));
        this.LJIIJ = viewLJLLLL;
        View viewFindViewById = viewLJLLLL.findViewById(R.id.h5l);
        this.LJIIJJI = viewFindViewById;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext(), 0, false);
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewLJLLLL.findViewById(R.id.vm2);
        this.LJIIL = runnableC781530UlD;
        C16F5 c16f5 = (C16F5) viewLJLLLL.findViewById(R.id.q2z);
        this.LJIILIIL = c16f5;
        LiveIconView liveIconView = (LiveIconView) viewLJLLLL.findViewById(R.id.bn2);
        this.LJIILJJIL = (LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class);
        this.LJIILL = true;
        r7.LLILZLL = new InterfaceC766800U6c() { // from class: X.0U6T
            @Override // X.InterfaceC766800U6c
            public final void LIZ(LiveEffect liveEffect) {
                C770170UJb.LIZIZ(String.valueOf(liveEffect));
                this.LIZ.getClass();
                DataChannel dataChannel2 = this.LIZ.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        runnableC781530UlD.setAdapter(r7);
        runnableC781530UlD.setLayoutManager(linearLayoutManager);
        runnableC781530UlD.addItemDecoration(new C454600HsA());
        runnableC781530UlD.setItemAnimator(null);
        runnableC781530UlD.setHasFixedSize(true);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0U6U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, viewLJLLLL);
        c16f5.setText(this.LJ);
        C786410Ut5.g8(liveIconView, new ACListenerS147S0100000_12(this, 415));
        if (C500260Jjc.LJJIZ(dataChannel)) {
            viewLJLLLL.setBackgroundResource(R.drawable.dsn);
        } else if (LiveBeautyPanelAlphaOptSetting.INSTANCE.inV2()) {
            viewLJLLLL.setBackground(null);
            C500260Jjc.LLFFF(viewFindViewById);
            runnableC781530UlD.setBackgroundResource(R.drawable.egq);
        } else {
            viewLJLLLL.setBackgroundResource(R.drawable.dm1);
            viewLJLLLL.getBackground().setAlpha(255);
        }
        this.LJIIZILJ = new C781710UlV(0, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 67));
    }
}
