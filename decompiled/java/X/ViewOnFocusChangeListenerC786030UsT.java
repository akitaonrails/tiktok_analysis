package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnFocusChangeListenerC786030UsT implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC786030UsT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC786030UsT viewOnFocusChangeListenerC786030UsT, View view, boolean z) {
        if (z) {
            ((C748430TXl) viewOnFocusChangeListenerC786030UsT.l0).getBlockWordEditTextFromXml().setOnFocusChangeListener(null);
            HandlerHook.viewPostDelay(((C748430TXl) viewOnFocusChangeListenerC786030UsT.l0).getBlockWordEditTextFromXml(), new ARunnableS112S0100000_12((C748430TXl) viewOnFocusChangeListenerC786030UsT.l0, 24), 100L);
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC786030UsT viewOnFocusChangeListenerC786030UsT, View view, boolean z) {
        if (z) {
            KeyBoardUtil.LIZLLL(C497740JfY.LJII(), ((C767880UAg) viewOnFocusChangeListenerC786030UsT.l0).LLILZLL);
        } else {
            KeyBoardUtil.LIZJ(C497740JfY.LJII(), ((C767880UAg) viewOnFocusChangeListenerC786030UsT.l0).LLILZLL);
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC786030UsT viewOnFocusChangeListenerC786030UsT, View view, boolean z) {
        if (z) {
            ((C0TZ0) viewOnFocusChangeListenerC786030UsT.l0).getBlockWordEditEtFromXml().setOnFocusChangeListener(null);
            HandlerHook.viewPostDelay(((C0TZ0) viewOnFocusChangeListenerC786030UsT.l0).getBlockWordEditEtFromXml(), new ARunnableS112S0100000_12((C0TZ0) viewOnFocusChangeListenerC786030UsT.l0, 382), 100L);
        }
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC786030UsT viewOnFocusChangeListenerC786030UsT, View view, boolean z) {
        Integer numFQ2;
        long j;
        KaraokePageFragment karaokePageFragment = (KaraokePageFragment) viewOnFocusChangeListenerC786030UsT.l0;
        karaokePageFragment.getClass();
        Integer numValueOf = null;
        if (z) {
            Context contextLJII = C497740JfY.LJII();
            LiveEditText liveEditText = karaokePageFragment.LL;
            if (liveEditText == null) {
                liveEditText = null;
            }
            KeyBoardUtil.LIZLLL(contextLJII, liveEditText);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(karaokePageFragment), null, null, new C763740Txc(karaokePageFragment, null), 3);
            C0U17 c0u17 = C0U17.LIZ;
            KaraokePageFragment karaokePageFragment2 = (KaraokePageFragment) viewOnFocusChangeListenerC786030UsT.l0;
            DataChannel dataChannel = karaokePageFragment2.LLJILJILJ;
            KaraokeViewModel karaokeViewModel = karaokePageFragment2.LLJIJIL;
            if (karaokeViewModel != null) {
                numFQ2 = karaokeViewModel.FQ2(karaokePageFragment2.LLJI);
            } else {
                numFQ2 = null;
            }
            KaraokeViewModel karaokeViewModel2 = ((KaraokePageFragment) viewOnFocusChangeListenerC786030UsT.l0).LLJIJIL;
            if (karaokeViewModel2 != null) {
                numValueOf = Integer.valueOf(karaokeViewModel2.HQ2());
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_search_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0U17.LIZ(c0u17, c474500IjALIZ);
            if (numFQ2 != null && numFQ2.intValue() == 1) {
                j = -997;
            } else {
                j = -996;
            }
            c474500IjALIZ.LJJII(C0U17.LIZIZ(j, numFQ2), "panel_second_list");
            c474500IjALIZ.LJJII(C0U17.LIZJ(numValueOf), "user_type");
            c474500IjALIZ.LIZ();
            return;
        }
        Context contextLJII2 = C497740JfY.LJII();
        LiveEditText liveEditText2 = karaokePageFragment.LL;
        if (liveEditText2 == null) {
            liveEditText2 = null;
        }
        KeyBoardUtil.LIZJ(contextLJII2, liveEditText2);
    }
}
