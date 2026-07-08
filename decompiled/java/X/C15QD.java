package X;

import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15QD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QD extends AbstractC21673619ry<C15QC> {
    public static final Map<Pair<String, Long>, Integer> LLIZ = new LinkedHashMap();
    public static final Map<Pair<String, Long>, Integer> LLIZLLLIL = new LinkedHashMap();
    public static final List<Integer> LLJ = C1697810uHb.LJIIJJI(Integer.valueOf(R.attr.a09), Integer.valueOf(R.attr.a16), Integer.valueOf(R.attr.a0i), Integer.valueOf(R.attr.ca), Integer.valueOf(R.attr.zs), Integer.valueOf(R.attr.zw), Integer.valueOf(R.attr.ny), Integer.valueOf(R.attr.a04), Integer.valueOf(R.attr.nv), Integer.valueOf(R.attr.do_res_0x7f06005d));
    public static final List<Integer> LLJI = C1697810uHb.LJIIJJI(-19024, -3592449, -13479364, -5090498, -14400333, -8863138, -7170146, -13421773, -2138, -2988141);
    public final Function2<Integer, Boolean, Object> LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public final List<PUgcSlotData> LLILLJJLI = new ArrayList();
    public boolean LLILZIL = true;
    public final HashMap<String, C1323050kX9<AbstractC1327750kej>> LLILZLL = new HashMap<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C15QD(AwS645S0100000_31 awS645S0100000_31) {
        this.LL = awS645S0100000_31;
    }

    public final void LLLFZ(boolean z) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((PUgcSlotData) it2.next()).isFixed = true ^ z;
        }
        this.LLILLL = true;
        try {
            notifyDataSetChanged();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLIZIZ;
        Pair pair;
        LifecycleOwner lifecycleOwner;
        final C15QC c15qc = (C15QC) viewHolder;
        final PUgcSlotData pUgcSlotData = (PUgcSlotData) ListProtector.get(this.LLILLJJLI, i);
        boolean z = this.LLILLL;
        boolean z2 = this.LLILZ;
        int size = ((ArrayList) this.LLILLJJLI).size();
        boolean z3 = this.LLILZIL;
        c15qc.LLIZLLLIL = z;
        c15qc.LLJ = pUgcSlotData;
        TuxTextView tuxTextView = c15qc.LLILLL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(pUgcSlotData.extraDuration);
            sbLIZ.append('s');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i2 = 8;
        if (!pUgcSlotData.isRecInRec && !pUgcSlotData.LIZ()) {
            TuxTextView tuxTextView2 = c15qc.LLILZIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            TuxTextView tuxTextView3 = c15qc.LLILZIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            String strLJIIJ = "";
            if (!pUgcSlotData.LIZ() || !z3) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C1383370m6R.LJIIJ(2131834103));
                sbLIZ2.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (pUgcSlotData.isRecInRec) {
                strLJIIJ = C1383370m6R.LJIIJ(2131833403);
            }
            TuxTextView tuxTextView4 = c15qc.LLILZIL;
            if (tuxTextView4 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(strLJIIJ);
                tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        int i3 = pUgcSlotData.fl2vTextFlag;
        if (i3 != 0) {
            if (i3 == 2) {
                TuxTextView tuxTextView5 = c15qc.LLILZIL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
                TuxTextView tuxTextView6 = c15qc.LLILZIL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(C1383370m6R.LJIIJ(2131834189));
                }
            }
        } else {
            TuxTextView tuxTextView7 = c15qc.LLILZIL;
            if (tuxTextView7 != null) {
                C786410Ut5.LLLLZLL(tuxTextView7, 0);
            }
            TuxTextView tuxTextView8 = c15qc.LLILZIL;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(C1383370m6R.LJIIJ(2131834190));
            }
        }
        TuxIconView tuxIconView = c15qc.LLILZLL;
        if (tuxIconView != null) {
            if (pUgcSlotData.isAISlot) {
                i2 = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
        }
        C1322110kVd c1322110kVd = c15qc.LLILLJJLI;
        if (c1322110kVd != null) {
            if (size <= 4) {
                pair = new Pair(Integer.valueOf(c15qc.LLJILJIL), Integer.valueOf(c15qc.LLJIJIL));
            } else {
                int screenWidth = ScreenUtils.getScreenWidth(c15qc.itemView.getContext());
                if (size == 5) {
                    float fLIZ = (screenWidth - C11VU.LIZ(64.0f)) / 5;
                    pair = new Pair(Integer.valueOf((int) fLIZ), Integer.valueOf((int) ((16 * fLIZ) / 9)));
                } else {
                    double dLIZ = ((double) (screenWidth - C11VU.LIZ(56.0f))) / 5.25d;
                    pair = new Pair(Integer.valueOf((int) dLIZ), Integer.valueOf((int) ((((double) 16) * dLIZ) / ((double) 9))));
                }
            }
            final int iIntValue = ((Number) pair.getFirst()).intValue();
            final int iIntValue2 = ((Number) pair.getSecond()).intValue();
            ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            C786410Ut5.c7(c1322110kVd, layoutParams);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(pUgcSlotData.videoPath);
            sbLIZ4.append('_');
            sbLIZ4.append((int) pUgcSlotData.startTime);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            if (!Intrinsics.LJFF(strLIZIZ2, c15qc.LLJI)) {
                c15qc.LLJI = strLIZIZ2;
                if (!pUgcSlotData.isVideoType) {
                    c1322110kVd.setImageURI(C2471909mP.LJIILIIL(pUgcSlotData.videoPath));
                } else {
                    Object context = c1322110kVd.getContext();
                    if (context != null) {
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof LifecycleOwner) {
                                    lifecycleOwner = (LifecycleOwner) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else if (context instanceof LifecycleOwner) {
                                lifecycleOwner = (LifecycleOwner) context;
                            }
                        }
                        if (lifecycleOwner != null) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(pUgcSlotData.videoPath);
                            sbLIZ5.append('_');
                            sbLIZ5.append((int) pUgcSlotData.startTime);
                            final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                            final LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
                            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                            c1320810kTXLIZJ.LJII = new InterfaceC1320070kSL() { // from class: X.0kXI
                                @Override // X.InterfaceC1320070kSL
                                public final Object get() {
                                    return new AbstractC1321260kUG<C1323050kX9<AbstractC1327750kej>>(lifecycleScope, c15qc, strLIZIZ3, pUgcSlotData, iIntValue, iIntValue2) { // from class: X.0kXH
                                        public final C09AE LJII;

                                        @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
                                        public final boolean close() {
                                            C09AE c09ae = this.LJII;
                                            if (c09ae != null) {
                                                c09ae.LIZIZ(null);
                                            }
                                            return super.close();
                                        }

                                        {
                                            this.LJII = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1323120kXG(this, c15qc, str, pUgcSlotData, i, i, null), 2);
                                        }
                                    };
                                }
                            };
                            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
                        }
                    }
                }
            }
        }
        if (!C0AY1.LIZIZ()) {
            c15qc.LLIZ.setCircleColor(0);
            c15qc.LLIZ.setBorderColor(0);
        } else {
            Integer num = (Integer) ((LinkedHashMap) LLIZ).get(pUgcSlotData.fd);
            if (num != null) {
                C371560EhW c371560EhW = c15qc.LLIZ;
                Integer numLIZJ = C1308910kAL.LIZJ(num.intValue(), c15qc.itemView.getContext());
                if (numLIZJ != null) {
                    c371560EhW.setCircleColor(numLIZJ.intValue());
                    c15qc.LLIZ.setBorderColor(-1);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                Integer num2 = (Integer) ((LinkedHashMap) LLIZLLLIL).get(pUgcSlotData.fd);
                if (num2 != null) {
                    c15qc.LLIZ.setCircleColor(num2.intValue());
                    c15qc.LLIZ.setBorderColor(-1);
                } else {
                    c15qc.LLIZ.setCircleColor(0);
                    c15qc.LLIZ.setBorderColor(0);
                }
            }
        }
        c15qc.LLILZ.setChecked(!pUgcSlotData.isFixed);
        if (!z2) {
            c15qc.LLILZ.setTag(Boolean.FALSE);
            C15QC.L5(c15qc.LLILZ, 0.34f);
            c15qc.itemView.setClickable(true);
            c15qc.itemView.setEnabled(false);
            return;
        }
        if (z) {
            View view = c15qc.itemView;
            if (!view.isEnabled()) {
                view.setEnabled(true);
            }
            C15QC.L5(c15qc.itemView, 1.0f);
            C15QC.L5(c15qc.LLILZ, 1.0f);
            c15qc.LLILZ.setTag(Boolean.TRUE);
            return;
        }
        if (pUgcSlotData.isFixed) {
            C15QC.L5(c15qc.itemView, 1.0f);
            C15QC.L5(c15qc.LLILZ, 1.0f);
        } else {
            C15QC.L5(c15qc.itemView, 0.6f);
            C15QC.L5(c15qc.LLILZ, 0.34f);
        }
        View view2 = c15qc.itemView;
        if (!view2.isEnabled()) {
            view2.setEnabled(true);
        }
        c15qc.LLILZ.setTag(Boolean.valueOf(pUgcSlotData.isFixed));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C15QC c15qc = new C15QC(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ek5, viewGroup, false), this.LLILZLL, this.LL);
        try {
            View view = c15qc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c15qc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c15qc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C15QC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c15qc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c15qc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C15QC.class.getName();
        return c15qc;
    }
}
