package Y;

import X.AbstractC1452680nuE;
import X.C01TT;
import X.C0E2B;
import X.C0E2C;
import X.C0E3A;
import X.C0E48;
import X.C0E5S;
import X.C0EGB;
import X.C0EGD;
import X.C0EGE;
import X.C0EGL;
import X.C0EHI;
import X.C0ELJ;
import X.C0EQI;
import X.C0EQN;
import X.C0EQO;
import X.C0EQV;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1443410nfH;
import X.C1453210nv5;
import X.C1697810uHb;
import X.C1867607Te;
import X.C2188811AlT;
import X.C285990BIv;
import X.C293820BfQ;
import X.C348850Dlz;
import X.C350440DoY;
import X.C350870DpF;
import X.C352130DrH;
import X.C363500EMy;
import X.C365010ESt;
import X.C368000Ebm;
import X.C423170GiZ;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1446740nke;
import X.InterfaceC1453220nv6;
import X.InterfaceC1455860nzM;
import X.InterfaceC1639870sm9;
import X.InterfaceC358220E2q;
import X.InterfaceC358840E5a;
import X.InterfaceC377540ErA;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class AObserverS122S0300000_5 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS122S0300000_5 aObserverS122S0300000_5, Object obj) {
        Pair<FilterBean, Float> pairLIZIZ;
        InterfaceC1446740nke interfaceC1446740nke;
        InterfaceC377540ErA interfaceC377540ErAC3;
        InterfaceC1453220nv6 value;
        InterfaceC1446740nke interfaceC1446740nke2;
        FilterBean filterBeanLJ = C1428470nHB.LJ(((C1443410nfH) aObserverS122S0300000_5.l0).LJJJLIIL(), (InterfaceC1639870sm9) aObserverS122S0300000_5.l1);
        NLEModel nLEModelLIZ = null;
        if (!C1428470nHB.LLIIIZ(((C1443410nfH) aObserverS122S0300000_5.l0).LJJJLIIL()) && !C1428470nHB.LLIIJI(((C1443410nfH) aObserverS122S0300000_5.l0).LJJJLIIL())) {
            pairLIZIZ = new Pair<>(null, Float.valueOf(0.0f));
        } else {
            AbstractC1452680nuE abstractC1452680nuEGc = ((C1443410nfH) aObserverS122S0300000_5.l0).G2().gc();
            if (abstractC1452680nuEGc != null) {
                nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc.LJJ());
            }
            pairLIZIZ = C0E3A.LIZIZ(nLEModelLIZ);
        }
        FilterBean first = pairLIZIZ.getFirst();
        float fFloatValue = pairLIZIZ.getSecond().floatValue();
        if (first != null && !Intrinsics.LJFF(filterBeanLJ.getId(), first.getId())) {
            InterfaceC358220E2q value2 = ((C1443410nfH) aObserverS122S0300000_5.l0).G2().xq1().getValue();
            if (value2 != null && (value = ((C1443410nfH) aObserverS122S0300000_5.l0).G2().zj2().getValue()) != null) {
                value2.LIZIZ(first, C1453210nv5.LIZJ(first, fFloatValue, value));
                InterfaceC1455860nzM interfaceC1455860nzMG2 = ((C1443410nfH) aObserverS122S0300000_5.l0).G2();
                if ((interfaceC1455860nzMG2 instanceof InterfaceC1446740nke) && (interfaceC1446740nke2 = (InterfaceC1446740nke) interfaceC1455860nzMG2) != null) {
                    interfaceC1446740nke2.nn1(first);
                }
            } else {
                return;
            }
        } else {
            InterfaceC1455860nzM interfaceC1455860nzMG22 = ((C1443410nfH) aObserverS122S0300000_5.l0).G2();
            if ((interfaceC1455860nzMG22 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMG22) != null) {
                interfaceC1446740nke.nn1(filterBeanLJ);
            }
        }
        if (C1428520nHG.LJJJJJ(((C1443410nfH) aObserverS122S0300000_5.l0).LJJJLIIL()) && (interfaceC377540ErAC3 = ((C1443410nfH) aObserverS122S0300000_5.l0).c3()) != null) {
            interfaceC377540ErAC3.XS0();
        }
        ((LiveData) aObserverS122S0300000_5.l2).removeObservers((C1443410nfH) aObserverS122S0300000_5.l0);
    }

    public static final void onChanged$1(AObserverS122S0300000_5 aObserverS122S0300000_5, Object obj) {
        StringBuilder sbLIZ;
        Integer num = (Integer) obj;
        TuxTextView tuxTextView = (TuxTextView) aObserverS122S0300000_5.l0;
        if (tuxTextView != null) {
            if (C423170GiZ.LIZ(((C0EQV) aObserverS122S0300000_5.l1).mActivity)) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('%');
                sbLIZ.append(num);
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(num);
                sbLIZ.append('%');
            }
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1295960jpS c1295960jpS = (C1295960jpS) aObserverS122S0300000_5.l2;
        if (c1295960jpS != null) {
            c1295960jpS.setProgress(num.intValue() / 100.0f);
        }
    }

    public static final void onChanged$2(AObserverS122S0300000_5 aObserverS122S0300000_5, Object obj) {
        InterfaceC358840E5a interfaceC358840E5aBo;
        InterfaceC358840E5a interfaceC358840E5aBo2;
        C0E2C c0e2c = (C0E2C) obj;
        if (Intrinsics.LJFF(c0e2c.LIZJ, "customize_cutout_panel")) {
            C350440DoY.LIZIZ((C0EQO) aObserverS122S0300000_5.l0);
            C0E48 c0e48W1 = ((C0EQI) aObserverS122S0300000_5.l1).W1();
            if (c0e48W1 != null && (interfaceC358840E5aBo2 = c0e48W1.Bo()) != null) {
                interfaceC358840E5aBo2.LIZJ((C0EQN) aObserverS122S0300000_5.l2);
            }
            if (!c0e2c.LIZ) {
                C350440DoY.LIZ((C0EQO) aObserverS122S0300000_5.l0);
                C0E48 c0e48W12 = ((C0EQI) aObserverS122S0300000_5.l1).W1();
                if (c0e48W12 != null && (interfaceC358840E5aBo = c0e48W12.Bo()) != null) {
                    interfaceC358840E5aBo.LIZLLL((C0EQN) aObserverS122S0300000_5.l2);
                }
            }
        }
    }

    public static final void onChanged$3(AObserverS122S0300000_5 aObserverS122S0300000_5, Object obj) {
        boolean z;
        int i;
        C0ELJ c0elj;
        C0E5S c0e5sR5;
        C0E5S c0e5sR52;
        C368000Ebm c368000Ebm;
        C0E5S c0e5sR53;
        Window windowD6;
        int i2;
        int i3;
        int i4;
        C0E2C c0e2c = (C0E2C) obj;
        if (c0e2c != null) {
            C0EGB c0egb = (C0EGB) aObserverS122S0300000_5.l0;
            C0EGE c0ege = (C0EGE) aObserverS122S0300000_5.l1;
            C0E48 c0e48 = (C0E48) aObserverS122S0300000_5.l2;
            boolean z2 = true;
            if (!c0e2c.LIZ && !C1867607Te.LIZ(c0e2c.LIZJ)) {
                z = false;
            } else {
                z = true;
            }
            C363500EMy.LIZ.getClass();
            if (!C363500EMy.LJIIJ && C363500EMy.LJIIJJI) {
                z = false;
            }
            c0egb.LLJLIL = z;
            c0egb.u8(C0EGD.LIZ(c0egb.LLLII, z, false, false, false, false, 30));
            c0egb.I7();
            View view = c0ege.LIZ;
            int i5 = 4;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
            View view2 = c0ege.LIZIZ;
            if (view2 != null) {
                if (z) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                C786410Ut5.LJLLLLLL(i4, view2);
            }
            View view3 = c0ege.LIZJ;
            if (view3 != null) {
                if (z) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                C786410Ut5.LJLLLLLL(i3, view3);
            }
            C0EHI value = c0egb.o4().zu2().getValue();
            View viewXg = null;
            if (value != null) {
                c0elj = value.LJ;
            } else {
                c0elj = null;
            }
            View view4 = c0ege.LIZLLL;
            if (view4 != null) {
                if (!z && C365010ESt.LIZIZ(c0elj)) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                C786410Ut5.LJLLLLLL(i2, view4);
            }
            View view5 = c0ege.LJ;
            if (!z && c0egb.LLLIIII && !c0egb.T6()) {
                i5 = 0;
            }
            C786410Ut5.LJLLLLLL(i5, view5);
            List listLJIIJJI = C1697810uHb.LJIIJJI("adjust_range_panel", "sound_adjust_panel", "customize_cutout_panel", "smart_trim_panel");
            if (C0E2B.LIZ()) {
                if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                    Iterator it2 = listLJIIJJI.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), c0e2c.LIZJ)) {
                            z2 = false;
                            break;
                        }
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z) {
                if (Intrinsics.LJFF(c0e2c.LIZJ, "video_transition")) {
                    C0E5S c0e5sR54 = c0egb.R5();
                    if (c0e5sR54 != null) {
                        c0e5sR54.yV(AFwS234S0000000_5.get$arr$(461));
                    }
                    C0E5S c0e5sR55 = c0egb.R5();
                    if (c0e5sR55 != null) {
                        c0e5sR55.da0(TrackShowType.NORMAL_WITHOUT_OVERLAY);
                    }
                    C01TT.LIZJ(new AwS549S0100000_5(c0egb, 1253));
                } else if ((Intrinsics.LJFF(c0e2c.LIZJ, "magic_panel") || Intrinsics.LJFF(c0e2c.LIZJ, "video_anim_panel")) && (c0e5sR53 = c0egb.R5()) != null) {
                    c0e5sR53.yV(AFwS234S0000000_5.get$arr$(462));
                }
                if (((!Intrinsics.LJFF(c0e2c.LIZJ, "sound_adjust_panel") && !Intrinsics.LJFF(c0e2c.LIZJ, "customize_cutout_panel")) || !((Boolean) C285990BIv.LIZ.getValue()).booleanValue()) && (windowD6 = c0egb.d6()) != null) {
                    windowD6.setNavigationBarColor(C960203pA.LIZ(R.attr.bn, c0egb.L7()));
                }
                if (z2) {
                    C293820BfQ.LIZ();
                    return;
                }
                return;
            }
            Window windowD62 = c0egb.d6();
            if (windowD62 != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), c0egb.L7());
                if (numLIZJ != null) {
                    windowD62.setNavigationBarColor(numLIZJ.intValue());
                }
            }
            if (Intrinsics.LJFF(c0e2c.LIZJ, "video_transition")) {
                C0E5S c0e5sR56 = c0egb.R5();
                if (c0e5sR56 != null) {
                    viewXg = c0e5sR56.xg();
                }
                if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null) {
                    c368000Ebm.unSelectTransition();
                }
                C0E5S c0e5sR57 = c0egb.R5();
                if (c0e5sR57 != null) {
                    c0e5sR57.yV(AFwS234S0000000_5.get$arr$(463));
                }
                C0E5S c0e5sR58 = c0egb.R5();
                if (c0e5sR58 != null) {
                    c0e5sR58.da0(TrackShowType.NORMAL);
                }
            } else if ((Intrinsics.LJFF(c0e2c.LIZJ, "magic_panel") || Intrinsics.LJFF(c0e2c.LIZJ, "video_anim_panel")) && (c0e5sR5 = c0egb.R5()) != null) {
                c0e5sR5.yV(AFwS234S0000000_5.get$arr$(464));
            }
            if (Intrinsics.LJFF(c0e2c.LIZJ, "video_effect_panel")) {
                c0egb.u6();
            }
            if (Intrinsics.LJFF(c0e2c.LIZJ, "aigc_generate_panel") && (c0e5sR52 = c0egb.R5()) != null) {
                c0e5sR52.yV(AFwS234S0000000_5.get$arr$(465));
            }
            if (!z2) {
                return;
            }
            C350870DpF.LJIIIZ(c0e48, "update_status_null_effect_track", Unit.LIZ);
            c0e48.S7().LIZIZ(Boolean.valueOf(C348850Dlz.LJIIIIZZ(c0e48, false)), "status_show_null_audio_track", false);
        }
    }

    public AObserverS122S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
