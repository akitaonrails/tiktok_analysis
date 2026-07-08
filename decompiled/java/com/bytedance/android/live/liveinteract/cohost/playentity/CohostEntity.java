package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.AbstractC20356314kz;
import X.C13BV;
import X.C1697810uHb;
import X.C20357814lE;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C784440Upu;
import X.C915980Zwa;
import X.C974210bSV;
import X.C974320bSg;
import X.C975140bU0;
import X.C986420bmC;
import X.EnumC1779270wOz;
import X.InterfaceC20354714kj;
import X.InterfaceC978780bZs;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.cohost.playentity.CohostEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CohostEntity extends AbstractC20356314kz {
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("cohost", 0, 39000003, 0, C1697810uHb.LJIIJJI("cohost_ongoing", "cohost_finished", "cohost_count", "never"), null, 20464);
    public final C20357814lE LLJJLIIIJLLLLLLLZ = new InterfaceC978780bZs() { // from class: X.14lE
        @Override // X.InterfaceC978780bZs
        public final void onSuccess() {
        }

        @Override // X.InterfaceC978780bZs
        public final void LIZ() {
            CohostEntity cohostEntity = this.LIZ;
            C20361214lm c20361214lm = cohostEntity.LLJJJJLIIL;
            InterfaceC20354714kj interfaceC20354714kj = cohostEntity.LLJJL;
            if (c20361214lm == null || interfaceC20354714kj == null) {
                return;
            }
            PlayEntityUtilKt.LJII(cohostEntity, 2, c20361214lm, interfaceC20354714kj, true);
        }

        @Override // X.InterfaceC978780bZs
        public final void LIZIZ(boolean z) {
            this.LIZ.LJJLIIIIJ(0);
            if (z) {
                CohostEntity cohostEntity = this.LIZ;
                C20361214lm c20361214lm = cohostEntity.LLJJJJLIIL;
                InterfaceC20354714kj interfaceC20354714kj = cohostEntity.LLJJL;
                if (c20361214lm != null && interfaceC20354714kj != null) {
                    PlayEntityUtilKt.LJ(cohostEntity, 2, c20361214lm, interfaceC20354714kj);
                }
            }
        }
    };

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJL(String str) {
        return true;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 131));
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZI(C20424814w2 c20424814w2) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS432S0200000_31(this, c20424814w2, 32));
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if (!C915980Zwa.LJFF().co0()) {
            if ((!C915980Zwa.LIZLLL().o1() || C915980Zwa.LIZLLL().AR0()) && !C975140bU0.LJII() && !C975140bU0.LJFF() && !C915980Zwa.LIZLLL().bX0(this.LLJ) && !C915980Zwa.LIZLLL().IX0(this.LLJ) && !C915980Zwa.LIZLLL().o1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZ(Context context) {
        if (C975140bU0.LJI()) {
            C766270U4b.LIZLLL(2131853341);
        }
        if (C975140bU0.LJII()) {
            C766270U4b.LIZLLL(2131851817);
        }
        if (C975140bU0.LJFF()) {
            C766270U4b.LIZLLL(2131851647);
        }
        if (C915980Zwa.LIZLLL().o1() && !C915980Zwa.LIZLLL().AR0()) {
            C766270U4b.LIZLLL(2131855287);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        C974320bSg c974320bSg;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (c974320bSg = (C974320bSg) dataChannel.gg0(InteractUnifiedStateChangeChannel.class)) != null) {
            if (C986420bmC.LIZ(c974320bSg)) {
                LJJIJ();
                if (Unit.LIZ != null) {
                    return;
                }
            } else {
                DataChannel dataChannel2 = this.LLJ;
                if (dataChannel2 != null) {
                    dataChannel2.BQ2(LJJJJ(), InteractUnifiedStateChangeChannel.class, new AwS610S0100000_31(this, 28));
                    return;
                }
            }
        }
        new AwS575S0100000_31(this, 133);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131841132), C497740JfY.LJIJI(2131841132), R.drawable.chq, R.drawable.chq, C13BV.INSTANCE, null, i, EnumC1779270wOz.DRAWABLE, false, null, 3840);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel;
        Boolean bool;
        if (z || (dataChannel = this.LLJ) == null || (bool = (Boolean) dataChannel.gg0(CoHostOnboardPermitChannel.class)) == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 132));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        System.currentTimeMillis();
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C974210bSV c974210bSV = new C974210bSV("start_co_host", new WeakReference(this.LLJJLIIIJLLLLLLLZ));
        c974210bSV.LJFF = "playbook_cohost";
        c784440UpuLIZ.LIZIZ(c974210bSV);
    }
}
