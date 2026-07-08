package X;

import Y.AComparatorS31S0000000_12;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749610Tap extends AbstractC21673619ry<AbstractC749630Tar> {
    public final DataChannel LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL = false;
    public final List<Object> LLILZLL = new ArrayList();
    public final List<C750740Tce> LLIZ = new ArrayList();
    public final List<Pair<Integer, String>> LLIZLLLIL = C1697810uHb.LJIIJJI(new Pair(1, C497740JfY.LJIJI(2131852473)), new Pair(2, C497740JfY.LJIJI(2131852471)), new Pair(3, C497740JfY.LJIJI(2131852472)));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILZLL, i);
        if (obj instanceof String) {
            if (Intrinsics.LJFF(obj, "empty")) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC749630Tar) viewHolder).V2(ListProtector.get(this.LLILZLL, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c750390Tc5;
        int i2;
        if (i != 1) {
            if (i != 2) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpb, viewGroup, false);
                c750390Tc5 = new AbstractC749630Tar(viewTd) { // from class: X.0Tas
                    public final C16F5 LL;

                    {
                        super(0, viewTd);
                        this.LL = (C16F5) viewTd.findViewById(R.id.aib);
                    }

                    @Override // X.AbstractC749630Tar
                    public final <T> void V2(T t) {
                        String string;
                        C16F5 c16f5 = this.LL;
                        if (c16f5 != null) {
                            if (t == null || (string = t.toString()) == null) {
                                string = "";
                            }
                            c16f5.setText(string);
                        }
                    }
                };
            } else {
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                if (Intrinsics.LJFF(this.LLILLJJLI, "moderator_panel")) {
                    i2 = R.layout.gp9;
                } else {
                    i2 = R.layout.gqs;
                }
                final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false);
                final String str = this.LLILLJJLI;
                c750390Tc5 = new AbstractC749630Tar(viewTd2, str) { // from class: X.0Taq
                    public final String LL;

                    @Override // X.AbstractC749630Tar
                    public final <T> void V2(T t) {
                        EnumC748580TYa enumC748580TYa;
                        View viewFindViewById;
                        if (Intrinsics.LJFF("moderator_panel", this.LL)) {
                            enumC748580TYa = EnumC748580TYa.MODERATOR_LIST;
                        } else {
                            enumC748580TYa = EnumC748580TYa.MANAGE_MODERATOR;
                        }
                        if (enumC748580TYa != EnumC748580TYa.MODERATOR_LIST && (viewFindViewById = this.itemView.findViewById(R.id.h2k)) != null) {
                            C500260Jjc.LJLJLJ(viewFindViewById, false);
                        }
                    }

                    {
                        this.LL = str;
                    }
                };
            }
        } else {
            View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpa, viewGroup, false);
            DataChannel dataChannel = this.LL;
            c750390Tc5 = new C750390Tc5(dataChannel, viewTd3, this.LLILLJJLI, this.LLILLL, C500260Jjc.LJJLIIIJ(dataChannel), this.LLILZ, this.LLIZ, this.LLILZIL);
        }
        try {
            View view = c750390Tc5.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c750390Tc5.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c750390Tc5.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c750390Tc5.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c750390Tc5.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c750390Tc5.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c750390Tc5.getClass().getName();
        return c750390Tc5;
    }

    public final void LLLFZ(List<C750740Tce> list, List<C750740Tce> list2, boolean z) {
        C750740Tce c750740Tce;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C750740Tce c750740Tce2 : list) {
            C750740Tce c750740Tce3 = c750740Tce2;
            if (c750740Tce3.LIZ != this.LLILLL && C500260Jjc.LJJIFFI(Boolean.valueOf(c750740Tce3.LJIIIIZZ))) {
                arrayList.add(c750740Tce2);
            }
        }
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZ).addAll(arrayList);
        ((ArrayList) this.LLILZLL).clear();
        if (arrayList.isEmpty()) {
            ((ArrayList) this.LLILZLL).add("empty");
        } else {
            ((ArrayList) this.LLILZLL).addAll(C13LP.LJLLLL(new AComparatorS31S0000000_12(18), this.LLIZ));
            if (z) {
                for (Pair<Integer, String> pair : this.LLIZLLLIL) {
                    Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if ((next instanceof C750740Tce) && (c750740Tce = (C750740Tce) next) != null && c750740Tce.LJI == pair.getFirst().intValue()) {
                                if (i >= 0) {
                                    ListProtector.add(this.LLILZLL, i, pair.getSecond());
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            ((ArrayList) this.LLILZLL).add(C497740JfY.LJIJI(2131852470));
            ((ArrayList) this.LLILZLL).addAll(list2);
        }
        notifyDataSetChanged();
    }

    public C749610Tap(long j, DataChannel dataChannel, String str, boolean z) {
        this.LL = dataChannel;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
    }
}
