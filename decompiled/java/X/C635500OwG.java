package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635500OwG extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<Boolean, Unit> LL;
    public final List<C617920OLm> LLILLJJLI = new ArrayList();
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public final List<String> LLLFZ() {
        List<C617920OLm> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (C617920OLm c617920OLm : list) {
            if (c617920OLm.LIZIZ) {
                arrayList.add(c617920OLm);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C617920OLm) it2.next()).LIZ);
        }
        return arrayList2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C635500OwG(AwS588S0100000_9 awS588S0100000_9) {
        int i;
        this.LL = awS588S0100000_9;
        C619480ORm.LIZ.getClass();
        int i2 = 0;
        try {
            i = CastIntegerProtector.parseInt(C596440NaM.LIZ.LIZIZ("tns_filter_keyword_count", CardStruct.IStatusCode.DEFAULT));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        this.LLILZ = i;
        C619480ORm.LIZ.getClass();
        try {
            i2 = CastIntegerProtector.parseInt(C596440NaM.LIZ.LIZIZ("tns_filter_keyword_limit", CardStruct.IStatusCode.DEFAULT));
            if (i2 <= 0) {
                i2 = 100;
            }
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLILZIL = i2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        EnumC635540OwK enumC635540OwK;
        final C635510OwH c635510OwH = (C635510OwH) viewHolder;
        C617920OLm c617920OLm = (C617920OLm) ListProtector.get(this.LLILLJJLI, i);
        c635510OwH.LL.setText(c617920OLm.LIZ);
        C786410Ut5.h9(c635510OwH.LL, new View.OnClickListener() { // from class: X.0OwI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnumC635540OwK enumC635540OwK2;
                C635510OwH c635510OwH2 = c635510OwH;
                int i2 = C635550OwL.LIZ[c635510OwH2.LLILZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            enumC635540OwK2 = EnumC635540OwK.SELECTED;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        enumC635540OwK2 = EnumC635540OwK.UNSELECTED;
                    }
                    c635510OwH2.LLILZ = enumC635540OwK2;
                    c635510OwH.LLILLL.invoke(Integer.valueOf(i));
                    c635510OwH.I5();
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c635510OwH.LL);
                c1389890mGx.LJIIIZ(2131836307);
                c1389890mGx.LJIIJJI();
            }
        });
        if (c617920OLm.LIZIZ) {
            enumC635540OwK = EnumC635540OwK.SELECTED;
        } else if (!c635510OwH.LLILLJJLI.invoke().booleanValue()) {
            enumC635540OwK = EnumC635540OwK.CANT_SELECT;
        } else {
            enumC635540OwK = EnumC635540OwK.UNSELECTED;
        }
        c635510OwH.LLILZ = enumC635540OwK;
        c635510OwH.I5();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C635510OwH c635510OwH = new C635510OwH((TuxTextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bd3, viewGroup, false), new AwS553S0100000_9(this, 1743), new AwS588S0100000_9(this, 548));
        try {
            View view = c635510OwH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c635510OwH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c635510OwH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C635510OwH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c635510OwH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c635510OwH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C635510OwH.class.getName();
        return c635510OwH;
    }
}
