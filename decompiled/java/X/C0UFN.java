package X;

import Y.AcS110S1100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0UFN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFN extends FrameLayout {
    public FrameLayout LL;
    public C20743416Fc LLILLJJLI;
    public final C0U78 LLILLL;
    public final C16FV LLILZ;
    public final C20743416Fc LLILZIL;
    public long LLILZLL;
    public C0UFR LLIZ;
    public LiveEffect LLIZLLLIL;
    public DataChannel LLJ;
    public LiveGoalInfo LLJI;
    public C0UFV LLJIJIL;

    public final C20743416Fc getItemTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l45);
            this.LLILLJJLI = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final FrameLayout getItemViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l4y);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Integer numLIZIZ = InterfaceC772190UQv.Y3.LIZIZ();
        if (numLIZIZ == null || numLIZIZ.intValue() != 0) {
            return;
        }
        C1143680frq.LJJII(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_first_use_guide.webp");
        C0UFV c0ufv = this.LLJIJIL;
        if (c0ufv != null) {
            c0ufv.LIZJ();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLJ;
    }

    public final C0UFV getListener() {
        return this.LLJIJIL;
    }

    public final LiveEffect getLiveEffect() {
        return this.LLIZLLLIL;
    }

    public final LiveGoalInfo getLiveGoalInfo() {
        return this.LLJI;
    }

    public final C0UFR getType() {
        return this.LLIZ;
    }

    public final void LIZ(String str) {
        Integer numValueOf;
        C0UFI c0ufi = C0UFI.LIZ;
        C0UFI.LIZ(this.LLIZLLLIL);
        C0UA1.LIZ().setRenderCacheString("LiveGoal", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRenderCacheString: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveGoalEffect", C2188811AlT.LIZIZ(sbLIZ));
        C0UFJ c0ufj = C0UFJ.LIZ;
        C0UFR c0ufr = this.LLIZ;
        if (c0ufr != null) {
            numValueOf = Integer.valueOf(c0ufr.getValue());
        } else {
            numValueOf = null;
        }
        C474500IjA c474500IjALIZ = C0UFJ.LIZ(this.LLJ, "livesdk_stream_goal_background_select");
        c474500IjALIZ.LJJII(C0UFJ.LIZIZ.giftId, "gift_id");
        c474500IjALIZ.LJJII(C0UFJ.LIZIZ.goalType, "goal_type");
        c474500IjALIZ.LJJII(numValueOf, "background_pos");
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
        if (liveEffect != null) {
            c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "concurrent_sticker_id");
            c474500IjALIZ.LJJII(liveEffect.getResourceId(), "concurrent_resource_id");
            c474500IjALIZ.LJJII(liveEffect.getName(), "concurrent_sticker_name");
        }
        c474500IjALIZ.LIZ();
        C0UFJ.LIZIZ.isAdjust = 0;
    }

    public final void setClickListener(C0UFW c0ufw) {
        C500260Jjc.LJLIIIL(500L, getItemViewFromXml(), new AwS378S0200000_12(this, c0ufw, 6));
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJ = dataChannel;
    }

    public final void setItemTextFromXml(C20743416Fc c20743416Fc) {
        this.LLILLJJLI = c20743416Fc;
    }

    public final void setItemViewFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setListener(C0UFV c0ufv) {
        this.LLJIJIL = c0ufv;
    }

    public final void setLiveEffect(LiveEffect liveEffect) {
        this.LLIZLLLIL = liveEffect;
    }

    public final void setLiveGoalInfo(LiveGoalInfo liveGoalInfo) {
        this.LLJI = liveGoalInfo;
    }

    public final void setPosition(int i) {
        C0UFR c0ufr = C0UFR.NONE;
        if (i == c0ufr.getValue()) {
            this.LLIZ = c0ufr;
            return;
        }
        C0UFR c0ufr2 = C0UFR.FULL_SCREEN;
        if (i == c0ufr2.getValue()) {
            this.LLIZ = c0ufr2;
            return;
        }
        C0UFR c0ufr3 = C0UFR.HORIZONTAL;
        if (i == c0ufr3.getValue()) {
            this.LLIZ = c0ufr3;
            return;
        }
        C0UFR c0ufr4 = C0UFR.VERTICAL;
        if (i != c0ufr4.getValue()) {
            return;
        }
        this.LLIZ = c0ufr4;
    }

    public final void setText(int i) {
        this.LLILZIL.setText(i);
    }

    public final void setType(C0UFR c0ufr) {
        this.LLIZ = c0ufr;
    }

    public C0UFN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C0UA1.LIZ();
        this.LLILZLL = C158B.LIZ();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h6o, this, true);
        this.LLILZ = (C16FV) findViewById(R.id.l2a);
        this.LLILZIL = (C20743416Fc) findViewById(R.id.l45);
    }

    public final void LIZIZ(String str, String str2) {
        C1143680frq.LIZLLL(this.LLILZ, str, str2);
    }

    public final void LIZJ(final String str, int i, final String str2, final AwS413S0200000_12 awS413S0200000_12) {
        C0UFJ c0ufj = C0UFJ.LIZ;
        C0UFJ.LIZJ(this.LLJ, "popup", str);
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIZILJ(2131842914);
        c782110Um9.LJII(i);
        c782110Um9.LJIILIIL(2131842907, new InterfaceC743640TFa() { // from class: X.0UFS
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C0UFI.LIZ.LJIILIIL();
                this.LIZ.LIZ(str2);
                awS413S0200000_12.invoke();
                C0UFJ c0ufj2 = C0UFJ.LIZ;
                C0UFJ.LIZIZ(this.LIZ.getDataChannel(), 1, str);
            }
        });
        c782110Um9.LJIIJ(2131842906, new AcS110S1100000_12(this, str, 2));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
