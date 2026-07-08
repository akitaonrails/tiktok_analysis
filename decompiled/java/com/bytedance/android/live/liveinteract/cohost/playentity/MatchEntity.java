package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.AbstractC20356314kz;
import X.C13BV;
import X.C1697810uHb;
import X.C19748512Ol;
import X.C20357714lD;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C758560TpG;
import X.C766270U4b;
import X.C784440Upu;
import X.C915980Zwa;
import X.C937280aUw;
import X.C974210bSV;
import X.C975140bU0;
import X.C975230bU9;
import X.EnumC1779270wOz;
import X.InterfaceC20354714kj;
import X.InterfaceC978780bZs;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.cohost.playentity.MatchEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPlaybookDefaultValueSetting;
import com.bytedance.android.livesdk.model.MatchSettings;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchEntity extends AbstractC20356314kz {
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public AbstractC20356314kz LLJJLIIIJLLLLLLLZ;
    public AFwS229S0000000_2 LLJL;
    public AFwS187S0000000_2 LLJLIL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("match", 0, 39000003, 0, C1697810uHb.LJIIJJI("catch_beans_finished", "catch_beans_ongoing", "match_finished", "match_ongoing", "take_the_stage_finished", "take_the_stage_ongoing", "never"), null, 20464);
    public final C20357714lD LLJLILLLLZIIL = new InterfaceC978780bZs() { // from class: X.14lD
        @Override // X.InterfaceC978780bZs
        public final void LIZ() {
            MatchEntity matchEntity = this.LIZ;
            C20361214lm c20361214lm = matchEntity.LLJJJJLIIL;
            InterfaceC20354714kj interfaceC20354714kj = matchEntity.LLJJL;
            if (c20361214lm == null || interfaceC20354714kj == null) {
                return;
            }
            AbstractC20356314kz abstractC20356314kz = matchEntity.LLJJLIIIJLLLLLLLZ;
            AbstractC20356314kz abstractC20356314kz2 = matchEntity;
            if (abstractC20356314kz != null) {
                abstractC20356314kz2 = abstractC20356314kz;
            }
            PlayEntityUtilKt.LJII(abstractC20356314kz2, 2, c20361214lm, interfaceC20354714kj, true);
        }

        @Override // X.InterfaceC978780bZs
        public final void onSuccess() {
        }

        @Override // X.InterfaceC978780bZs
        public final void LIZIZ(boolean z) {
            MatchEntity matchEntity = this.LIZ;
            AbstractC20356314kz abstractC20356314kz = matchEntity.LLJJLIIIJLLLLLLLZ;
            AbstractC20356314kz abstractC20356314kz2 = matchEntity;
            if (abstractC20356314kz != null) {
                abstractC20356314kz2 = abstractC20356314kz;
            }
            abstractC20356314kz2.LJJLIIIIJ(0);
            if (z) {
                MatchEntity matchEntity2 = this.LIZ;
                C20361214lm c20361214lm = matchEntity2.LLJJJJLIIL;
                InterfaceC20354714kj interfaceC20354714kj = matchEntity2.LLJJL;
                if (c20361214lm != null && interfaceC20354714kj != null) {
                    AbstractC20356314kz abstractC20356314kz3 = matchEntity2.LLJJLIIIJLLLLLLLZ;
                    AbstractC20356314kz abstractC20356314kz4 = matchEntity2;
                    if (abstractC20356314kz3 != null) {
                        abstractC20356314kz4 = abstractC20356314kz3;
                    }
                    PlayEntityUtilKt.LJ(abstractC20356314kz4, 2, c20361214lm, interfaceC20354714kj);
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
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 134));
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZI(C20424814w2 c20424814w2) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS432S0200000_31(this, c20424814w2, 33));
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if (C915980Zwa.LIZLLL().w9()) {
            if ((!C915980Zwa.LIZLLL().o1() || C915980Zwa.LIZLLL().AR0()) && !C975140bU0.LJII() && !C975140bU0.LJFF() && !C915980Zwa.LIZLLL().bX0(this.LLJ) && !C915980Zwa.LIZLLL().IX0(this.LLJ) && !LJJLIIIJ(null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZ(Context context) {
        if (!C915980Zwa.LIZLLL().w9()) {
            C766270U4b.LIZLLL(2131855284);
        }
        if (C975140bU0.LJI()) {
            C766270U4b.LIZLLL(2131853688);
        }
        if (C975140bU0.LJII()) {
            C766270U4b.LIZLLL(2131851724);
        }
        if (C975140bU0.LJFF()) {
            C766270U4b.LIZLLL(2131851723);
        }
        if (C915980Zwa.LIZLLL().o1() && !C915980Zwa.LIZLLL().AR0()) {
            C766270U4b.LIZLLL(2131855287);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        AbstractC20356314kz abstractC20356314kz;
        AbstractC20356314kz abstractC20356314kz2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC20356314kz2 == null) {
            abstractC20356314kz = this;
        } else {
            abstractC20356314kz = abstractC20356314kz2;
        }
        DataChannel dataChannel = this.LLJ;
        if (abstractC20356314kz2 == null) {
            abstractC20356314kz2 = this;
        }
        C975230bU9.LJII(dataChannel, abstractC20356314kz2, new AwS645S0100000_31(abstractC20356314kz, 10));
    }

    public final boolean LJJLIIIJ(Object obj) {
        return C915980Zwa.LJFF().co0();
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        Pair pair;
        if (((MatchSettings) C937280aUw.LIZJ(MatchSettings.class, c20424814w2.LJII, new MatchSettings(LiveMatchPlaybookDefaultValueSetting.INSTANCE.getConfig().matchGameplayOption))).gameplayOption == 2) {
            pair = new Pair(2131853047, Collections.singletonList(C497740JfY.LJIJI(2131853038)));
        } else {
            pair = new Pair(2131842923, C13BV.INSTANCE);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        return new C20361314ln(C497740JfY.LJIJI(iIntValue), C497740JfY.LJIJI(2131842923), R.drawable.cir, R.drawable.cir, (List) pair.getSecond(), null, i, EnumC1779270wOz.DRAWABLE, false, null, 3840);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        Boolean bool;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(CoHostOnboardPermitChannel.class)) != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        if (LiveMatchPlaybookDefaultValueSetting.INSTANCE.getConfig().enableMatchEntityEdit && C758560TpG.LIZ) {
            String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, new MatchSettings(LiveMatchPlaybookDefaultValueSetting.INSTANCE.getConfig().matchGameplayOption));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readyToEdit, newParams = ");
            sbLIZ.append(json);
            C20441214yg.LIZIZ("PlayEntity", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MatchEntity readyToEdit triggered with ");
            sbLIZ2.append(json);
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC979390bar.LJI(c20361214lm.LIZIZ, json, false);
            return;
        }
        AbstractC20356314kz abstractC20356314kz = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC20356314kz == null) {
            abstractC20356314kz = this;
        }
        abstractC20356314kz.LJJJIL();
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        int iIntValue;
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 135));
        }
        boolean z = false;
        MatchSettings matchSettings = (MatchSettings) C937280aUw.LIZJ(MatchSettings.class, c20361214lm.LJI, new MatchSettings(LiveMatchPlaybookDefaultValueSetting.INSTANCE.getConfig().matchGameplayOption));
        AbstractC20356314kz abstractC20356314kz = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC20356314kz == null) {
            abstractC20356314kz = this;
        }
        PlayEntityUtilKt.LJFF(abstractC20356314kz, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        System.currentTimeMillis();
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C974210bSV c974210bSV = new C974210bSV("start_match", new WeakReference(this.LLJLILLLLZIIL));
        c974210bSV.LJFF = "playbook_match";
        c974210bSV.LJIIJJI = true;
        AFwS229S0000000_2 aFwS229S0000000_2 = this.LLJL;
        if (aFwS229S0000000_2 != null) {
            iIntValue = ((Number) aFwS229S0000000_2.invoke(matchSettings)).intValue();
        } else {
            iIntValue = matchSettings.gameplayOption;
        }
        c974210bSV.LJIIJ = iIntValue;
        if (this.LLJLIL != null) {
            z = true;
        }
        c974210bSV.LJIIZILJ = z;
        c974210bSV.LJIIL = true;
        c784440UpuLIZ.LIZIZ(c974210bSV);
    }
}
