package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367300lgW extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<? extends C1367350lgb> LL;
    public C1371590lnR LLILLJJLI;
    public AbstractC1363040lZe LLILLL;
    public InterfaceC1362720lZ8 LLILZ;
    public InterfaceC1366230len LLILZIL;
    public ShareSheetPanelFragment LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<? extends C1367350lgb> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1367350lgb c1367350lgb;
        List<? extends C1367350lgb> list = this.LL;
        if (list != null && (c1367350lgb = (C1367350lgb) ListProtector.get(list, i)) != null) {
            return c1367350lgb.LIZ;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseSharePackage baseSharePackage;
        RecyclerView.ViewHolder c1367330lgZ;
        Integer numLIZJ;
        if (i != 0) {
            if (i != 2) {
                int i2 = C1367320lgY.LLILLL;
                C1371590lnR c1371590lnR = this.LLILLJJLI;
                InterfaceC1362720lZ8 interfaceC1362720lZ8 = this.LLILZ;
                ShareSheetPanelFragment shareSheetPanelFragment = this.LLILZLL;
                AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1323);
                C1361400lX0 c1361400lX0LIZ = C1369530lk7.LIZ(viewGroup.getContext());
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1361400lX0LIZ), R.layout.dno, viewGroup, false);
                C1367850lhP c1367850lhP = (C1367850lhP) viewTd.findViewById(R.id.ogn);
                if (shareSheetPanelFragment != null) {
                    if (c1371590lnR == null) {
                        c1371590lnR = new C1371590lnR(new C1371600lnS());
                    }
                    if (interfaceC1362720lZ8 == null) {
                        interfaceC1362720lZ8 = new InterfaceC1362720lZ8() { // from class: X.0lga
                            @Override // X.InterfaceC1362720lZ8
                            public final void Ds(Function0<Unit> function0) {
                            }

                            @Override // X.InterfaceC1362720lZ8
                            public final void F8(AbstractC343940De4 abstractC343940De4) {
                            }

                            @Override // X.InterfaceC1362720lZ8
                            public final void s1(int i3) {
                            }
                        };
                    }
                    C1366480lfC.LIZJ(c1371590lnR, c1367850lhP, c1361400lX0LIZ, interfaceC1362720lZ8);
                }
                C1367320lgY c1367320lgY = new C1367320lgY(viewTd);
                c1367320lgY.LL = awS565S0100000_21;
                c1367330lgZ = c1367320lgY;
            } else {
                int i3 = C1367310lgX.LLILLJJLI;
                AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(this, 1322);
                View view = new View(viewGroup.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C786410Ut5.W5(view, layoutParams);
                view.setId(R.id.ogm);
                Context context = view.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                    view.setBackgroundColor(numLIZJ.intValue());
                }
                c1367330lgZ = new C1367310lgX(view, awS565S0100000_212);
            }
        } else {
            int i4 = C1367330lgZ.LL;
            C1371590lnR c1371590lnR2 = this.LLILLJJLI;
            AbstractC1363040lZe abstractC1363040lZe = this.LLILLL;
            InterfaceC1366230len interfaceC1366230len = this.LLILZIL;
            String str = this.LLIZ;
            C1366200lek c1366200lek = new C1366200lek(viewGroup.getContext());
            c1366200lek.setCallBack(abstractC1363040lZe);
            c1366200lek.setClientKey(str);
            c1366200lek.setMinisShareCallback(interfaceC1366230len);
            c1366200lek.setId(R.id.olj);
            if (c1371590lnR2 != null && (baseSharePackage = c1371590lnR2.LJIJJ) != null) {
                c1366200lek.setSharePackage((SharePackage) baseSharePackage);
            }
            c1367330lgZ = new C1367330lgZ(c1366200lek);
        }
        try {
            View view2 = c1367330lgZ.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1367330lgZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1367330lgZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1367330lgZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1367330lgZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1367330lgZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1367330lgZ.getClass().getName();
        return c1367330lgZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof Boolean) || (bool = (Boolean) objLJJJLL) == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (viewHolder instanceof C1367320lgY) {
            ((C1367320lgY) viewHolder).LLILLJJLI = !zBooleanValue;
        } else {
            if (!(viewHolder instanceof C1367310lgX)) {
                return;
            }
            ((C1367310lgX) viewHolder).LL = !zBooleanValue;
        }
    }
}
