package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.1ERq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281441ERq {
    public static void LIZ(InterfaceC2281461ERs interfaceC2281461ERs) {
        EnumC1118970fDz enumC1118970fDzKa = interfaceC2281461ERs.ka();
        EnumC1118970fDz enumC1118970fDz = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
        if (enumC1118970fDzKa != enumC1118970fDz && interfaceC2281461ERs.Uy() != enumC1118970fDz && interfaceC2281461ERs.lf() == enumC1118970fDz) {
            interfaceC2281461ERs.ZQ();
        }
    }

    public static void LIZIZ(final InterfaceC2281461ERs interfaceC2281461ERs, C2281451ERr c2281451ERr) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        ViewGroup viewGroup = c2281451ERr.LIZ;
        EnumC1118970fDz enumC1118970fDzKa = interfaceC2281461ERs.ka();
        EnumC1118970fDz enumC1118970fDz = EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE;
        int i5 = 8;
        boolean z5 = false;
        if (enumC1118970fDzKa != enumC1118970fDz) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLZ(i, viewGroup);
        C20743716Ff c20743716Ff = c2281451ERr.LIZIZ;
        EnumC1118970fDz enumC1118970fDzKa2 = interfaceC2281461ERs.ka();
        EnumC1118970fDz enumC1118970fDz2 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
        if (enumC1118970fDzKa2 == enumC1118970fDz2) {
            z = true;
        } else {
            z = false;
        }
        c20743716Ff.setChecked(z);
        C786410Ut5.K7(c2281451ERr.LIZ, new AbstractViewOnClickListenerC1105820esm() { // from class: X.1ERw
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC2281461ERs.Ck();
            }

            {
                super(1200L);
            }
        });
        EnumC1811400xEo.GIFT_RANK.getType();
        interfaceC2281461ERs.ka().getValue();
        Map<String, Object> map = C1338270kvh.LIZ;
        ViewGroup viewGroup2 = c2281451ERr.LIZJ;
        if (interfaceC2281461ERs.tm() != enumC1118970fDz && LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLZ(i2, viewGroup2);
        C20743716Ff c20743716Ff2 = c2281451ERr.LIZLLL;
        if (interfaceC2281461ERs.tm() == enumC1118970fDz2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c20743716Ff2.setChecked(z2);
        C786410Ut5.K7(c2281451ERr.LIZJ, new AbstractViewOnClickListenerC1105820esm() { // from class: X.1ERu
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC2281461ERs.Qk();
            }

            {
                super(1200L);
            }
        });
        EnumC1811400xEo.FRIEND_RANKING.getType();
        interfaceC2281461ERs.tm().getValue();
        ViewGroup viewGroup3 = c2281451ERr.LJ;
        if (interfaceC2281461ERs.Uy() != enumC1118970fDz) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLZ(i3, viewGroup3);
        C20743716Ff c20743716Ff3 = c2281451ERr.LJFF;
        if (interfaceC2281461ERs.Uy() == enumC1118970fDz2) {
            z3 = true;
        } else {
            z3 = false;
        }
        c20743716Ff3.setChecked(z3);
        C786410Ut5.K7(c2281451ERr.LJ, new AbstractViewOnClickListenerC1105820esm() { // from class: X.1ERv
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC2281461ERs.Nq();
            }

            {
                super(1200L);
            }
        });
        EnumC1811400xEo.GAME_RANK.getType();
        interfaceC2281461ERs.Uy().getValue();
        ViewGroup viewGroup4 = c2281451ERr.LJI;
        if (interfaceC2281461ERs.nB() != enumC1118970fDz) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLZ(i4, viewGroup4);
        C20743716Ff c20743716Ff4 = c2281451ERr.LJII;
        if (interfaceC2281461ERs.nB() == enumC1118970fDz2) {
            z4 = true;
        } else {
            z4 = false;
        }
        c20743716Ff4.setChecked(z4);
        C786410Ut5.K7(c2281451ERr.LJI, new AbstractViewOnClickListenerC1105820esm() { // from class: X.1ERt
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC2281461ERs.mw();
            }

            {
                super(1200L);
            }
        });
        EnumC1811400xEo.E_COMMERCE.getType();
        interfaceC2281461ERs.nB().getValue();
        ViewGroup viewGroup5 = c2281451ERr.LJIIIIZZ;
        if (interfaceC2281461ERs.lf() != enumC1118970fDz) {
            i5 = 0;
        }
        C786410Ut5.LJLZ(i5, viewGroup5);
        C20743716Ff c20743716Ff5 = c2281451ERr.LJIIIZ;
        if (interfaceC2281461ERs.lf() == enumC1118970fDz2) {
            z5 = true;
        }
        c20743716Ff5.setChecked(z5);
        C786410Ut5.K7(c2281451ERr.LJIIIIZZ, new AbstractViewOnClickListenerC1105820esm() { // from class: X.1ERx
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                interfaceC2281461ERs.ZQ();
            }

            {
                super(1200L);
            }
        });
    }
}
