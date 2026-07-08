package X;

import Y.ARunnableS23S0101000_12;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766640U5m extends C766660U5o {
    public final String LLJ;
    public final DataChannel LLJI;
    public int LLJIJIL;
    public final C0U78 LLJILJIL = C0UA1.LIZ();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 940));

    public final boolean LLLLZ() {
        String str = this.LLJ;
        return C500260Jjc.LJJJI(str != null ? Boolean.valueOf(u.LJJIIJZLJL(str, "beauty", false)) : null);
    }

    public final void LLLLLZIL(boolean z) {
        if (z) {
            int iLJII = C0U7C.LJII(Integer.valueOf(((ArrayList) this.LL).size()));
            this.LLILZ = iLJII;
            if (iLJII >= 0 && iLJII < ((ArrayList) this.LL).size()) {
                if (C0U7C.LJIILL((LiveEffect) ListProtector.get(this.LL, this.LLILZ), this.LLJILJIL)) {
                    C766270U4b.LIZLLL(2131841021);
                }
                int i = this.LLILZ;
                LLLLLZ(i, (LiveEffect) ListProtector.get(this.LL, i));
            }
        }
        notifyDataSetChanged();
    }

    public C766640U5m(DataChannel dataChannel, String str) {
        this.LLJ = str;
        this.LLJI = dataChannel;
    }

    @Override // X.C766660U5o
    public final void LLLLLLZ(int i, LiveEffect liveEffect) {
        if (C761910Tuf.LIZ) {
            return;
        }
        if (LLLLZ() && LiveBeautySwitchSetting.INSTANCE.inExperiment() && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ())) {
            InterfaceC766680U5q interfaceC766680U5q = this.LLILZIL;
            if (interfaceC766680U5q != null) {
                interfaceC766680U5q.LIZJ();
                return;
            }
            return;
        }
        if (C0U7C.LJIILL(liveEffect, this.LLJILJIL)) {
            C766270U4b.LIZLLL(2131841021);
            return;
        }
        if (!C766720U5u.LJIILLIIL(liveEffect) && !C0U7C.LJIILJJIL(liveEffect)) {
            if (!liveEffect.LIZLLL()) {
                liveEffect.LJLILLLLZI(true);
                C766720U5u.LJ(liveEffect, (C0U45) this.LLJILJILJ.getValue());
                return;
            }
            return;
        }
        LLLLZIL(i, liveEffect);
    }

    public final void LLLLLZ(int i, LiveEffect liveEffect) {
        String str;
        InterfaceC766680U5q interfaceC766680U5q = this.LLILZIL;
        if (interfaceC766680U5q != null) {
            interfaceC766680U5q.LIZ(i, liveEffect);
        }
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
        if (stickerSDKExtraLJLJLLL != null && (str = stickerSDKExtraLJLJLLL.redDotKey) != null && str.length() > 0) {
            C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC766480U4w.LJJJJZ;
            Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(str, Boolean.TRUE);
            c20337914i1.LJFF(mapLIZIZ);
        }
        int iIndexOf = ((ArrayList) this.LL).indexOf(liveEffect);
        if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LL).size()) {
            notifyItemChanged(iIndexOf, "item_hide_red_dot");
        }
    }

    public final void LLLLZI(C766670U5p c766670U5p, LiveEffect liveEffect) {
        float fLJIIIZ;
        String str = C0UD4.LJFF;
        C0U78 c0u78 = this.LLJILJIL;
        if (liveEffect != null) {
            if (C0U7C.LJIILJJIL(liveEffect)) {
                LiveEffect liveEffectLJIIL = C0U7C.LJIIL(liveEffect, str, c0u78);
                if (liveEffectLJIIL != null) {
                    fLJIIIZ = C0U7C.LJIIIZ(liveEffectLJIIL);
                }
            } else {
                fLJIIIZ = C0U7C.LJIIIZ(liveEffect);
            }
            if (!Float.valueOf(fLJIIIZ).equals(Float.valueOf(0.0f))) {
                if (!C500260Jjc.LJJJJIZL(c766670U5p.LLILLJJLI)) {
                    this.LLJIJIL++;
                    C786410Ut5.LJZI(0, c766670U5p.LLILLJJLI);
                    return;
                }
                return;
            }
        }
        if (!C500260Jjc.LJJJJIZL(c766670U5p.LLILLJJLI)) {
            return;
        }
        this.LLJIJIL--;
        C786410Ut5.LJZI(4, c766670U5p.LLILLJJLI);
    }

    public final void LLLLZIL(int i, LiveEffect liveEffect) {
        if (LLLLLLLLL()) {
            C786410Ut5.LJJZZIII(LLLLLLIL(), new ARunnableS23S0101000_12(i, this, 32));
        } else {
            LLLJ(this.LLILZ);
            LLLILZ(i);
        }
        this.LLILZ = i;
        InterfaceC766480U4w.LJJI.LJFF(Integer.valueOf(i));
        LLLLLZ(i, liveEffect);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJLJLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLZI((C766670U5p) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C766660U5o
    public final void LLLLLLL(int i, C766670U5p c766670U5p, LiveEffect liveEffect) {
        InterfaceC766680U5q interfaceC766680U5q;
        if (!C766720U5u.LJIILLIIL(liveEffect) && !C0U7C.LJIILJJIL(liveEffect) && !liveEffect.LJ()) {
            if (!liveEffect.LJIJJLI()) {
                C786410Ut5.LJZI(0, c766670U5p.LLILZLL);
                C766720U5u.LJ(liveEffect, this.LLIZ);
            }
        } else {
            C786410Ut5.LJZI(8, c766670U5p.LLILZLL);
            if (i == 0 && (interfaceC766680U5q = this.LLILZIL) != null) {
                interfaceC766680U5q.LIZIZ();
            }
        }
        if (C0U7C.LJIILL(liveEffect, this.LLJILJIL) || (LLLLZ() && LiveBeautySwitchSetting.INSTANCE.inExperiment() && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ()))) {
            C786410Ut5.T4(c766670U5p.itemView, 0.4f);
        } else {
            C786410Ut5.T4(c766670U5p.itemView, 1.0f);
        }
        if (C766620U5k.LIZIZ(liveEffect, this.LLJI)) {
            C500260Jjc.LJLJLJ(c766670U5p.LL, true);
        } else {
            C500260Jjc.LJLJLJ(c766670U5p.LL, false);
        }
        if (LLLLZ() && LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
            if (this.LLILZ == i && InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue()) {
                C766660U5o.LLLLLLLLLL(c766670U5p);
            } else {
                C766660U5o.LLLLLLLZIL(c766670U5p);
            }
            LLLLZI(c766670U5p, liveEffect);
            return;
        }
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            LLLLZI(c766670U5p, liveEffect);
        }
        if (this.LLILZ == i) {
            C766660U5o.LLLLLLLLLL(c766670U5p);
        } else {
            C766660U5o.LLLLLLLZIL(c766670U5p);
        }
    }
}
