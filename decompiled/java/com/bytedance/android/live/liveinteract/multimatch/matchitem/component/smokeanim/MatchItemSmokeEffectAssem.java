package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim;

import X.C1143680frq;
import X.C1144600ftK;
import X.C1145010ftz;
import X.C1145080fu6;
import X.C1145090fu7;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C1558520qew;
import X.C1559260qg8;
import X.C20441214yg;
import X.C20483515Dd;
import X.C20488615Fc;
import X.C2188811AlT;
import X.C723590SZx;
import X.C786410Ut5;
import X.C915980Zwa;
import X.EnumC20488515Fb;
import X.EnumC919030a1V;
import X.EnumC964170bCJ;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC974780bTQ;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemSmokeEffectAssem extends UISlotAssem implements ISmokeAnimationAbility, InterfaceC1554640qYg {
    public DataChannel LLJJIII;
    public boolean LLJJIJI;
    public C1295960jpS LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1144600ftK.class, null), checkSupervisorPrepared());
    public UUID LLJJJ = C1145010ftz.LIZ();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h4k;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1689262314) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        this.LLJJJ = C1145010ftz.LIZ();
        C1295960jpS c1295960jpS = this.LLJJIJIIJIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLJJIJIIJIL;
        if (c1295960jpS2 != null) {
            C786410Ut5.f5(c1295960jpS2, 0.0f);
        }
        DataChannel dataChannel = this.LLJJIII;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility
    public final void By0(boolean z) {
        if (!z) {
            sh2(false);
        }
        C1324720kZq c1324720kZq = this.LLJJIJIL;
        if (c1324720kZq == null) {
            return;
        }
        if (z) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.h5(c1324720kZq2, 0.5f);
            }
            C1143680frq.LJFF(this.LLJJIJIL, "tiktok_live_match_redesign_resource_2", "live_battle_blood_fog.png", ImageView.ScaleType.CENTER_CROP, new C1145080fu6(this, true));
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility
    public final void Pk1(boolean z) {
        if (!z) {
            WK1(false);
        }
        C1324720kZq c1324720kZq = this.LLJJIJIL;
        if (c1324720kZq == null) {
            return;
        }
        if (z) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.h5(c1324720kZq2, 1.0f);
            }
            C1143680frq.LJFF(this.LLJJIJIL, "tiktok_live_match_redesign_resource_2", "live_battle_blood_fog.png", ImageView.ScaleType.CENTER_CROP, new C1145080fu6(this, false));
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 8);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility
    public final void WK1(boolean z) {
        float alpha;
        long j;
        Float fValueOf;
        C1295960jpS c1295960jpS = this.LLJJIJIIJIL;
        if (c1295960jpS == null) {
            C20441214yg.LJ("MatchItemSmoke", "smoke view null");
            return;
        }
        float f = 1.0f;
        if (z && Intrinsics.LIZLLL(Float.valueOf(c1295960jpS.getAlpha()), 1.0f)) {
            C20441214yg.LJ("MatchItemSmoke", "already showed");
            return;
        }
        Object objGg0 = null;
        if (!z) {
            C1295960jpS c1295960jpS2 = this.LLJJIJIIJIL;
            if (c1295960jpS2 != null) {
                fValueOf = Float.valueOf(c1295960jpS2.getAlpha());
            } else {
                fValueOf = null;
            }
            if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                C20441214yg.LJ("MatchItemSmoke", "show anim false");
                return;
            }
        }
        if (C915980Zwa.LJFF().RY(false) != EnumC964170bCJ.MATCH_START) {
            C20441214yg.LJ("MatchItemSmoke", "state error");
            C1295960jpS c1295960jpS3 = this.LLJJIJIIJIL;
            if (c1295960jpS3 != null) {
                C786410Ut5.LLD(8, c1295960jpS3);
                return;
            }
            return;
        }
        if (z) {
            C1295960jpS c1295960jpS4 = this.LLJJIJIIJIL;
            if (c1295960jpS4 != null) {
                C786410Ut5.LLD(0, c1295960jpS4);
            }
            C1295960jpS c1295960jpS5 = this.LLJJIJIIJIL;
            if (c1295960jpS5 != null) {
                C786410Ut5.f5(c1295960jpS5, 0.0f);
            }
            C1143680frq.LJIILL(this.LLJJIJIIJIL, "tiktok_live_interaction_demand_11", "match_blood_smoke_anim_15z.zip", true, new C1145090fu7(this, false));
            C1295960jpS c1295960jpS6 = this.LLJJIJIIJIL;
            if (c1295960jpS6 != null) {
                c1295960jpS6.setRepeatCount(-1);
            }
            C20441214yg.LJIIIZ("MatchItemHealthbar", "init smoke lottie");
        } else {
            EnumC20488515Fb enumC20488515Fb = EnumC20488515Fb.SMOKE_CARD;
            C20488615Fc.LJ(enumC20488515Fb.getValue(), this.LLJJIJI);
            C20488615Fc.LIZJ(enumC20488515Fb.getValue(), this.LLJJIJI);
        }
        C1295960jpS c1295960jpS7 = this.LLJJIJIIJIL;
        if (c1295960jpS7 != null) {
            alpha = c1295960jpS7.getAlpha();
        } else {
            alpha = 0.0f;
        }
        if (!z) {
            f = 0.0f;
        }
        DataChannel dataChannel = this.LLJJIII;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleSmokeCardEffectChannel.class);
        }
        if (objGg0 == EnumC919030a1V.EFFECTING) {
            j = 260;
            if (!z) {
                f = 0.5f;
            }
        } else {
            j = 530;
        }
        C20441214yg.LJIIIZ("MatchItemHealthbar", "show Appear Animation---");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJIJIIJIL, (Property<C1295960jpS, Float>) View.ALPHA, alpha, f);
        objectAnimatorOfFloat.setDuration(j);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = ((C1144600ftK) this.LLJJI.getValue()).LLILLJJLI;
        this.LLJJIJI = ((C1144600ftK) this.LLJJI.getValue()).LL;
        DataChannel dataChannel = ((C1144600ftK) this.LLJJI.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.gg0(RoomChannel.class);
        }
        this.LLJJIJIIJIL = (C1295960jpS) view.findViewById(R.id.m6k);
        this.LLJJIJIL = (C1324720kZq) view.findViewById(R.id.ljo);
        DataChannel dataChannel2 = this.LLJJIII;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleStateChannel.class, this, new AwS596S0100000_17(this, 47));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility
    public final void sh2(boolean z) {
        Object objGg0;
        C1295960jpS c1295960jpS;
        float alpha;
        if (this.LLJJIJIIJIL == null) {
            C20441214yg.LIZLLL("healthBar smoke view null");
            return;
        }
        DataChannel dataChannel = this.LLJJIII;
        Float fValueOf = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleSmokeDebuffChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC919030a1V.EFFECTING) {
            C20441214yg.LIZLLL("animation state effecting");
            return;
        }
        if (C915980Zwa.LJFF().RY(false) != EnumC964170bCJ.MATCH_START) {
            C1295960jpS c1295960jpS2 = this.LLJJIJIIJIL;
            if (c1295960jpS2 != null) {
                C786410Ut5.LLD(8, c1295960jpS2);
            }
            C20441214yg.LJ("MatchItemSmoke", "state error");
            return;
        }
        float f = 0.0f;
        if (!z) {
            C1295960jpS c1295960jpS3 = this.LLJJIJIIJIL;
            if (c1295960jpS3 != null) {
                fValueOf = Float.valueOf(c1295960jpS3.getAlpha());
            }
            if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                C20441214yg.LIZLLL("show anim false");
                return;
            }
        } else if (z && (c1295960jpS = this.LLJJIJIIJIL) != null && c1295960jpS.getAlpha() >= 0.5f) {
            C20441214yg.LIZLLL("show anim true, alpha in progress");
            return;
        }
        if (z) {
            C1295960jpS c1295960jpS4 = this.LLJJIJIIJIL;
            if (c1295960jpS4 != null) {
                C786410Ut5.LLD(0, c1295960jpS4);
            }
            C1295960jpS c1295960jpS5 = this.LLJJIJIIJIL;
            if (c1295960jpS5 != null) {
                C786410Ut5.f5(c1295960jpS5, 0.0f);
            }
            C1143680frq.LJIILL(this.LLJJIJIIJIL, "tiktok_live_interaction_demand_11", "match_blood_smoke_anim_15z.zip", true, new C1145090fu7(this, true));
            C20441214yg.LIZIZ("MatchItemSmoke", "Self_Smoke_show_start");
            C1295960jpS c1295960jpS6 = this.LLJJIJIIJIL;
            if (c1295960jpS6 != null) {
                c1295960jpS6.setRepeatCount(-1);
            }
        } else {
            C20441214yg.LIZIZ("MatchItemSmoke", "Self_Smoke_show_end");
            EnumC20488515Fb enumC20488515Fb = EnumC20488515Fb.SMOKE_CARD;
            C20488615Fc.LJ(enumC20488515Fb.getValue(), this.LLJJIJI);
            C20488615Fc.LIZJ(enumC20488515Fb.getValue(), this.LLJJIJI);
        }
        C1295960jpS c1295960jpS7 = this.LLJJIJIIJIL;
        if (c1295960jpS7 != null) {
            alpha = c1295960jpS7.getAlpha();
        } else {
            alpha = 0.0f;
        }
        if (z) {
            f = 0.5f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("self smoke startAlpha = ");
        sbLIZ.append(alpha);
        sbLIZ.append(" end =");
        sbLIZ.append(f);
        C20441214yg.LJIIIZ("MatchItemSmoke", C2188811AlT.LIZIZ(sbLIZ));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJIJIIJIL, (Property<C1295960jpS, Float>) View.ALPHA, alpha, f);
        objectAnimatorOfFloat.setDuration(530L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility
    public final void a91(UUID uuid, boolean z, boolean z2) {
        this.LLJJJ = uuid;
        InterfaceC974780bTQ interfaceC974780bTQ = C20483515Dd.LIZ;
        C20483515Dd.LIZ.LIZJ(C1558520qew.LJIIL(this), z, z2);
    }
}
