package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollInfoAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JR8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JR8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EmotePollInfoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JR8(EmotePollInfoAssem emotePollInfoAssem) {
        super(0);
        this.LL = emotePollInfoAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        FragmentManager fragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            EmotePollInfoAssem emotePollInfoAssem = this.LL;
            if (fragmentLJI instanceof LiveSheetFragment) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(fragmentLJI);
                if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
                    Bundle bundle = new Bundle();
                    C0JRE c0jreHp = emotePollInfoAssem.hp();
                    C786410Ut5.LJJJI("enter_from", c0jreHp != null ? c0jreHp.LLJILJIL : null, bundle);
                    C0JRE c0jreHp2 = emotePollInfoAssem.hp();
                    C786410Ut5.LJJJI("poll_id", String.valueOf(c0jreHp2 != null ? c0jreHp2.LLILLL : null), bundle);
                    C0JRE c0jreHp3 = emotePollInfoAssem.hp();
                    C786410Ut5.LJJJI("sec_anchor_id", c0jreHp3 != null ? c0jreHp3.LLILZ : null, bundle);
                    C0JRE c0jreHp4 = emotePollInfoAssem.hp();
                    bundle.putBoolean("is_anchor", c0jreHp4 != null ? c0jreHp4.LLIZ : false);
                    C19322110iZ.LIZLLL(fragmentManager, EmotePollDetailDialog.class, "sub_emote_poll_detail", null, bundle);
                }
                ((LiveSheetFragment) fragmentLJI).close();
            }
        }
        return Unit.LIZ;
    }
}
