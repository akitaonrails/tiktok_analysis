package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0HkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449890HkZ extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final int LLILLJJLI;
    public final InterfaceC449820HkS LLILZ;
    public InterfaceC449910Hkb LLILZIL;
    public boolean LLILZLL;
    public final int LLIZ;
    public final Aweme LLIZLLLIL;
    public final ArrayList<C451030HmP> LLILLL = new ArrayList<>();
    public final int LL = -1;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int i = this.LLILZIL == null ? 0 : 1;
        ArrayList<C451030HmP> arrayList = this.LLILLL;
        return (arrayList != null ? arrayList.size() : 0) + i;
    }

    public final C451030HmP LLLFZ(int i) {
        if (!C2279851ELn.LIZIZ()) {
            return (C451030HmP) ListProtector.get(this.LLILLL, i);
        }
        if (this.LLILZIL != null) {
            i--;
        }
        try {
            return this.LLILLL.get(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC449910Hkb interfaceC449910Hkb;
        if (C2279851ELn.LIZIZ() && (interfaceC449910Hkb = this.LLILZIL) != null) {
            if (interfaceC449910Hkb.getPosition() == i) {
                return this.LLILZIL.getType();
            }
            return 0;
        }
        if (this.LLILZLL) {
            return R.layout.c3o;
        }
        return R.layout.c3n;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof ViewOnClickListenerC449870HkX) {
            C451030HmP c451030HmPLLLFZ = LLLFZ(i);
            ViewOnClickListenerC449870HkX viewOnClickListenerC449870HkX = (ViewOnClickListenerC449870HkX) viewHolder;
            if (c451030HmPLLLFZ == null) {
                viewOnClickListenerC449870HkX.getClass();
                return;
            }
            viewOnClickListenerC449870HkX.LLILZ = c451030HmPLLLFZ;
            if (!TextUtils.isEmpty(c451030HmPLLLFZ.LIZIZ)) {
                viewOnClickListenerC449870HkX.LLILLJJLI.setText(c451030HmPLLLFZ.LIZIZ);
            }
            viewHolder.itemView.setContentDescription(c451030HmPLLLFZ.LIZIZ);
            return;
        }
        if (viewHolder instanceof ViewOnClickListenerC449880HkY) {
            C451030HmP c451030HmPLLLFZ2 = LLLFZ(i);
            ViewOnClickListenerC449880HkY viewOnClickListenerC449880HkY = (ViewOnClickListenerC449880HkY) viewHolder;
            if (c451030HmPLLLFZ2 == null) {
                viewOnClickListenerC449880HkY.getClass();
                return;
            }
            viewOnClickListenerC449880HkY.LLILZ = c451030HmPLLLFZ2;
            if (TextUtils.isEmpty(c451030HmPLLLFZ2.LIZIZ)) {
                return;
            }
            Iterator<TextView> it2 = viewOnClickListenerC449880HkY.LL.iterator();
            while (it2.hasNext()) {
                it2.next().setText(c451030HmPLLLFZ2.LIZIZ);
            }
            return;
        }
        if (viewHolder instanceof C449900Hka) {
            ((C449930Hkd) viewHolder).I5(this.LLILZIL);
        } else {
            if (!(viewHolder instanceof C449930Hkd)) {
                return;
            }
            ((C449930Hkd) viewHolder).I5(this.LLILZIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewOnClickListenerC449870HkX;
        boolean zLJI = MethodIDManager.LJI(202343);
        if (C2279851ELn.LIZIZ() && i == 1) {
            viewOnClickListenerC449870HkX = new C449930Hkd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZIL.getLayoutId(), viewGroup, false), new C449920Hkc(this));
        } else if (C2279851ELn.LIZIZ() && i == 2) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLILZIL.getLayoutId(), viewGroup, false);
            final C449920Hkc c449920Hkc = new C449920Hkc(this);
            viewOnClickListenerC449870HkX = new C449930Hkd(viewTd, c449920Hkc) { // from class: X.0Hka
            };
        } else if (this.LLILZLL && this.LLIZ == 2 && i == R.layout.c3o) {
            viewOnClickListenerC449870HkX = new ViewOnClickListenerC449880HkY(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.c3o, viewGroup, false), this.LLILZ, this.LLIZ, this.LLIZLLLIL);
        } else {
            viewOnClickListenerC449870HkX = new ViewOnClickListenerC449870HkX(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.c3n, viewGroup, false), this.LLILZ, this.LL, this.LLILLJJLI, this.LLIZ, this.LLIZLLLIL);
        }
        try {
            View view = viewOnClickListenerC449870HkX.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewOnClickListenerC449870HkX.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewOnClickListenerC449870HkX.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewOnClickListenerC449870HkX.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC449870HkX.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewOnClickListenerC449870HkX.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewOnClickListenerC449870HkX.getClass().getName();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewOnClickListenerC449870HkX;
    }

    public C449890HkZ(InterfaceC449820HkS interfaceC449820HkS, InterfaceC449960Hkg interfaceC449960Hkg, int i, int i2, Aweme aweme, Boolean bool) {
        this.LLILZ = interfaceC449820HkS;
        this.LLIZ = i2;
        this.LLILLJJLI = i;
        this.LLIZLLLIL = aweme;
        this.LLILZIL = interfaceC449960Hkg;
        this.LLILZLL = bool.booleanValue();
    }
}
