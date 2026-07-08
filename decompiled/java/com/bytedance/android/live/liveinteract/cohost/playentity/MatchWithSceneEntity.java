package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.AbstractC20356314kz;
import X.C156900it;
import X.C1697810uHb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C497740JfY;
import X.C766270U4b;
import X.C915980Zwa;
import X.C975140bU0;
import X.EnumC1779270wOz;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchWithSceneEntity extends AbstractC20356314kz {
    public final MatchEntity LLJJJJJIL;
    public final C20357914lF LLJJJJLIIL;

    @Override // X.AbstractC20356314kz
    public final void LJJJJIZL() {
        MatchEntity matchEntity = this.LLJJJJJIL;
        matchEntity.LLJJLIIIJLLLLLLLZ = this;
        DataChannel dataChannel = this.LLJ;
        WeakReference<Context> weakReference = this.LLJI;
        matchEntity.LLJ = dataChannel;
        matchEntity.LLJI = weakReference;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        this.LLJJJJJIL.destroy();
        super.destroy();
    }

    public MatchWithSceneEntity() {
        MatchEntity matchEntity = new MatchEntity();
        matchEntity.LLJL = AFwS229S0000000_2.get$arr$(44);
        matchEntity.LLJLIL = AFwS187S0000000_2.get$arr$(118);
        this.LLJJJJJIL = matchEntity;
        this.LLJJJJLIIL = new C20357914lF("match_with_scene", 0L, 39000003L, 0, C1697810uHb.LJIIJJI("catch_beans_finished", "catch_beans_ongoing", "match_finished", "match_ongoing", "take_the_stage_finished", "take_the_stage_ongoing", "never"), null, 20464);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZI(C20424814w2 c20424814w2) {
        this.LLJJJJJIL.LJJIIZI(c20424814w2);
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJL(String str) {
        this.LLJJJJJIL.getClass();
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        if (!C156900it.LIZ()) {
            return false;
        }
        return this.LLJJJJJIL.LJJJJLI(str);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZ(Context context) {
        this.LLJJJJJIL.LJJJJZ(context);
        if (C915980Zwa.LIZLLL().w9() && !C975140bU0.LJI() && !C975140bU0.LJII() && !C975140bU0.LJFF()) {
            if ((!C915980Zwa.LIZLLL().o1() || C915980Zwa.LIZLLL().AR0()) && !C156900it.LIZ()) {
                C766270U4b.LIZLLL(C156900it.LJ(true));
            }
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        this.LLJJJJJIL.LJJLI(c20361214lm);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131842923), "Match In Scene", R.drawable.cir, R.drawable.cir, null, null, i, EnumC1779270wOz.DRAWABLE, false, null, 3856);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        return this.LLJJJJJIL.LJIJJ(c20361214lm, interfaceC20354714kj, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        this.LLJJJJJIL.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        this.LLJJJJJIL.LJJJLL(c20361214lm, interfaceC20354714kj, lifecycleOwner, str, l, str2, str3);
    }
}
