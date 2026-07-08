package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS99S1200000_15;

/* JADX INFO: renamed from: X.0bR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973280bR0 extends AbstractC977390bXd {
    public MatchBaseWidget LLILZ;

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        ViewGroup viewGroup;
        for (C954460awe c954460awe : C915980Zwa.LJII().LJJLI()) {
            MatchBaseWidget matchBaseWidget = this.LLILZ;
            if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null && (viewGroup = (ViewGroup) viewOnClickListenerC986770bmlX1.findViewById(R.id.mhl)) != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void onUnload() {
        super.onUnload();
        dismiss();
        this.LLILZ = null;
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        super.LIZLLL(matchBaseWidget);
        this.LLILZ = matchBaseWidget;
        matchBaseWidget.provideDataChannel();
    }

    @Override // X.AbstractC977390bXd
    public final void LJI(C975960bVK c975960bVK) {
        Map<Long, BattleComboInfo> map;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        Map<Long, BattleComboInfo> map2;
        BattleComboInfo battleComboInfo;
        C976480bWA c976480bWA;
        boolean z;
        C976480bWA next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show win streak ,currentMatchModel = ");
        sbLIZ.append(c975960bVK);
        sbLIZ.append(",currentCombo = ");
        if (c975960bVK != null) {
            map = c975960bVK.LJJIJIIJI;
        } else {
            map = null;
        }
        sbLIZ.append(map);
        C20441214yg.LIZIZ("MatchWinStreakComponent", C2188811AlT.LIZIZ(sbLIZ));
        for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
            MatchBaseWidget matchBaseWidget = this.LLILZ;
            if (matchBaseWidget != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget.x1(c954460awe.LJ)) != null && c975960bVK != null && (map2 = c975960bVK.LJJIJIIJI) != null && (battleComboInfo = map2.get(Long.valueOf(c954460awe.LJ))) != null) {
                String str = battleComboInfo.comboRuleGuideSchema;
                if (str != null) {
                    viewOnClickListenerC986770bmlX1.setWinOrLoseStreakIconOnClick(new AwS99S1200000_15(this, str, battleComboInfo, 4));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("show Combo, uid = ");
                sbLIZ2.append(c954460awe.LJ);
                sbLIZ2.append(", combo = ");
                sbLIZ2.append(battleComboInfo.comboCount);
                C20441214yg.LIZIZ("MatchWinStreakComponent", C2188811AlT.LIZIZ(sbLIZ2));
                long j = c954460awe.LJ;
                List<C976480bWA> value = c975960bVK.LJJJLIIL.getValue();
                if (value != null) {
                    Iterator<C976480bWA> it2 = value.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            List<C976800bWg> list = next.LJFF;
                            if (list != null) {
                                ArrayList arrayList = (ArrayList) list;
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (((C976800bWg) it3.next()).LIZ == j) {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    c976480bWA = next;
                } else {
                    c976480bWA = null;
                }
                boolean zLLILZ = C915980Zwa.LJII().LLILZ(c954460awe.LJ);
                if (C915980Zwa.LJFF().Nt() && !C973270bQz.LIZ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("show Combo, matchService.isBattling() ");
                    sbLIZ3.append(C915980Zwa.LJFF().Nt());
                    sbLIZ3.append(", isLeft= ");
                    sbLIZ3.append(zLLILZ);
                    sbLIZ3.append(", combo = ");
                    sbLIZ3.append(battleComboInfo.comboCount);
                    C20441214yg.LIZIZ("MatchWinStreakComponent", C2188811AlT.LIZIZ(sbLIZ3));
                    viewOnClickListenerC986770bmlX1.b2(battleComboInfo, false);
                } else if (C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.PUNISH_START) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("show Combo, getCurrentMatchStatus ");
                    sbLIZ4.append(C915980Zwa.LJFF().RY(false));
                    C20441214yg.LIZIZ("MatchWinStreakComponent", C2188811AlT.LIZIZ(sbLIZ4));
                    if (c976480bWA != null && c976480bWA.LJII != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("isWin = ");
                    sbLIZ5.append(z);
                    sbLIZ5.append(", isLeft= ");
                    sbLIZ5.append(zLLILZ);
                    sbLIZ5.append(" combo = ");
                    sbLIZ5.append(battleComboInfo.comboCount);
                    C20441214yg.LIZIZ("MatchWinStreakComponent", C2188811AlT.LIZIZ(sbLIZ5));
                    if (z) {
                        viewOnClickListenerC986770bmlX1.b2(battleComboInfo, true);
                    } else {
                        viewOnClickListenerC986770bmlX1.a2(battleComboInfo);
                    }
                }
            }
        }
    }
}
