package X;

import Y.ACListenerS72S0300000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EEW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEW extends AbstractC21673619ry<C361180EEa> {
    public C0EEY LLILLJJLI;
    public C0EEV LLILLL;
    public Integer LLILZ;
    public final List<C0EEV> LL = C1697810uHb.LJIIJJI(new C0EEV(new C0EEX(-44462, new Pair(-2276904, -1994679), new Pair(-8027517, -1962480), new Pair(-12910077, -1710619)), NLEHSLColorType.RED), new C0EEV(new C0EEX(-27843, new Pair(-2603449, -459976), new Pair(-6645095, -27843), new Pair(-11393525, -1710619)), NLEHSLColorType.ORANGE), new C0EEV(new C0EEX(-864954, new Pair(-1138362, -9642160), new Pair(-6710887, -72448), new Pair(-72445, -1710619)), NLEHSLColorType.YELLOW), new C0EEV(new C0EEX(-8863138, new Pair(-864954, -16525892), new Pair(-6645095, -15997170), new Pair(-12763643, -1710619)), NLEHSLColorType.GREEN), new C0EEV(new C0EEX(-13245983, new Pair(-8863138, -13461258), new Pair(-6645095, -13245983), new Pair(-16038332, -1710619)), NLEHSLColorType.CYAN), new C0EEV(new C0EEX(-13461258, new Pair(-13245983, -10987818), new Pair(-6645095, -13461258), new Pair(-16119486, -1710619)), NLEHSLColorType.BLUE), new C0EEV(new C0EEX(-10987818, new Pair(-10987818, -3592449), new Pair(-6645095, -10987818), new Pair(-14612931, -1710619)), NLEHSLColorType.PURPLE), new C0EEV(new C0EEX(-3592449, new Pair(-3592449, -44462), new Pair(-6645095, -3592449), new Pair(-12711879, -1710619)), NLEHSLColorType.MAGENTA));
    public int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));

    public final C0EEV LLLFZ() {
        C0EEV c0eev = this.LLILLL;
        if (c0eev != null) {
            return C0EEV.LIZ(c0eev);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLI(int i) {
        C0EEV c0eev;
        if (this.LL.indexOf(this.LLILLL) == i || (c0eev = (C0EEV) C13LP.LJJJLZIJ(i, this.LL)) == null) {
            return;
        }
        c0eev.LIZJ = true;
        notifyItemChanged(i);
        C0EEV c0eev2 = this.LLILLL;
        if (c0eev2 != null) {
            c0eev2.LIZJ = false;
            notifyItemChanged(this.LL.indexOf(c0eev2));
        }
        this.LLILLL = c0eev;
    }

    public final void LLLII(Map<NLEHSLColorType, C351400Dq6> map) {
        double dDoubleValue;
        double dDoubleValue2;
        Double d;
        Double d2;
        Double d3;
        int i = 0;
        for (C0EEV c0eev : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0EEV c0eev2 = c0eev;
                double dDoubleValue3 = 0.5d;
                if (map.containsKey(c0eev2.LIZIZ)) {
                    c0eev2.LIZLLL = true;
                    C351400Dq6 c351400Dq6 = map.get(c0eev2.LIZIZ);
                    if (c351400Dq6 != null) {
                        c0eev2.LJ = c351400Dq6.LIZ;
                        C351280Dpu c351280Dpu = c351400Dq6.LIZLLL;
                        if (c351280Dpu != null && (d3 = c351280Dpu.LIZIZ) != null) {
                            dDoubleValue = d3.doubleValue();
                        } else {
                            dDoubleValue = 0.5d;
                        }
                        c0eev2.LJFF = dDoubleValue;
                        C351280Dpu c351280Dpu2 = c351400Dq6.LIZLLL;
                        if (c351280Dpu2 != null && (d2 = c351280Dpu2.LIZJ) != null) {
                            dDoubleValue2 = d2.doubleValue();
                        } else {
                            dDoubleValue2 = 0.5d;
                        }
                        c0eev2.LJI = dDoubleValue2;
                        C351280Dpu c351280Dpu3 = c351400Dq6.LIZLLL;
                        if (c351280Dpu3 != null && (d = c351280Dpu3.LIZLLL) != null) {
                            dDoubleValue3 = d.doubleValue();
                        }
                        c0eev2.LJII = dDoubleValue3;
                    }
                } else {
                    c0eev2.LIZLLL = false;
                    c0eev2.LJ = null;
                    c0eev2.LJFF = 0.5d;
                    c0eev2.LJI = 0.5d;
                    c0eev2.LJII = 0.5d;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.LayoutParams layoutParams;
        C361180EEa c361180EEa = (C361180EEa) viewHolder;
        C0EEV c0eev = (C0EEV) ListProtector.get(this.LL, i);
        C0EJV c0ejv = c361180EEa.LLILLJJLI;
        int i2 = c0eev.LIZ.LIZ;
        c0ejv.LL = Integer.valueOf(i2);
        c0ejv.LLILLL = Integer.valueOf(i2);
        c0ejv.LLILLJJLI = null;
        c0ejv.invalidate();
        boolean z = true;
        if (i != this.LL.size() - 1) {
            C426750GoL.LJIIIZ(c361180EEa.itemView, null, null, Integer.valueOf(this.LLILZIL), null, false, 27);
        }
        int i3 = 0;
        if (c0eev.LJFF == 0.5d && c0eev.LJI == 0.5d && c0eev.LJII == 0.5d) {
            z = false;
        }
        View view = c361180EEa.LL;
        if (!z) {
            i3 = 4;
        }
        C786410Ut5.LJLLLLLL(i3, view);
        c361180EEa.LLILLJJLI.setSelect(c0eev.LIZJ);
        C786410Ut5.I7(new ACListenerS72S0300000_5(this, c0eev, c361180EEa, 3), c361180EEa.itemView);
        if (this.LLILZ != null && (layoutParams = c361180EEa.LLILLJJLI.getLayoutParams()) != null) {
            layoutParams.width = this.LLILZ.intValue();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C361180EEa c361180EEa = new C361180EEa(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c4e, viewGroup, false));
        try {
            View view = c361180EEa.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c361180EEa.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c361180EEa.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C361180EEa.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c361180EEa.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c361180EEa.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C361180EEa.class.getName();
        return c361180EEa;
    }
}
