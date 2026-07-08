package X;

import Y.ACListenerS109S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Evs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380460Evs extends AbstractC21673619ry<C380470Evt> {
    public final Function1<C379430EuD, Unit> LL;
    public final List<C379430EuD> LLILLJJLI = new ArrayList();
    public EnumC379360Eu6 LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C380460Evs(AwS584S0100000_5 awS584S0100000_5) {
        this.LL = awS584S0100000_5;
    }

    public final void LLLFZ(final List<C379430EuD> list, final EnumC379360Eu6 enumC379360Eu6) {
        final ArrayList arrayList = new ArrayList(this.LLILLJJLI);
        final EnumC379360Eu6 enumC379360Eu62 = this.LLILLL;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(arrayList, list, enumC379360Eu62, enumC379360Eu6) { // from class: X.0EvT
            public final List<C379430EuD> LIZ;
            public final List<C379430EuD> LIZIZ;
            public final EnumC379360Eu6 LIZJ;
            public final EnumC379360Eu6 LIZLLL;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                boolean z;
                boolean z2;
                C379430EuD c379430EuD = (C379430EuD) ListProtector.get(this.LIZ, i);
                C379430EuD c379430EuD2 = (C379430EuD) ListProtector.get(this.LIZIZ, i2);
                if (c379430EuD.LIZ != c379430EuD2.LIZ || !Intrinsics.LJFF(c379430EuD.LIZIZ, c379430EuD2.LIZIZ) || !Intrinsics.LJFF(c379430EuD.LIZJ, c379430EuD2.LIZJ)) {
                    return false;
                }
                EnumC379360Eu6 enumC379360Eu63 = c379430EuD.LIZ;
                if (enumC379360Eu63 == this.LIZJ) {
                    z = true;
                } else {
                    z = false;
                }
                if (enumC379360Eu63 == this.LIZLLL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (((C379430EuD) ListProtector.get(this.LIZ, i)).LIZ == ((C379430EuD) ListProtector.get(this.LIZIZ, i2)).LIZ) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = arrayList;
                this.LIZIZ = list;
                this.LIZJ = enumC379360Eu62;
                this.LIZLLL = enumC379360Eu6;
            }
        }, true);
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        this.LLILLL = enumC379360Eu6;
        c21341918fZLIZ.LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        C380470Evt c380470Evt = (C380470Evt) viewHolder;
        C379430EuD c379430EuD = (C379430EuD) ListProtector.get(this.LLILLJJLI, i);
        int i3 = 0;
        if (c379430EuD.LIZ == this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        c380470Evt.LL.setText(c379430EuD.LIZIZ);
        TuxTextView tuxTextView = c380470Evt.LLILLJJLI;
        String str = c379430EuD.LIZJ;
        if (str == null) {
            str = "";
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = c380470Evt.LLILLJJLI;
        String str2 = c379430EuD.LIZJ;
        if (str2 != null && !a0.LJJJIL(str2)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i2);
        TuxIconView tuxIconView = c380470Evt.LLILLL;
        if (!z) {
            i3 = 4;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i3);
        C786410Ut5.I7(new ACListenerS109S0200000_5(c380470Evt, this, 7), c380470Evt.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C380470Evt c380470Evt = new C380470Evt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c4h, viewGroup, false));
        try {
            View view = c380470Evt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c380470Evt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c380470Evt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C380470Evt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c380470Evt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c380470Evt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C380470Evt.class.getName();
        return c380470Evt;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        boolean z;
        C380470Evt c380470Evt = (C380470Evt) viewHolder;
        if (list.contains("payload_selection")) {
            int i2 = 0;
            if (((C379430EuD) ListProtector.get(this.LLILLJJLI, i)).LIZ == this.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            TuxIconView tuxIconView = c380470Evt.LLILLL;
            if (!z) {
                i2 = 4;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
            return;
        }
        super.onBindViewHolder(c380470Evt, i, list);
    }
}
