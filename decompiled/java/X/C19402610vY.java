package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.10vY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19402610vY extends AbstractC21673619ry<C19402710vZ> implements InterfaceC19402410vW {
    public final C19424410z4 LL;
    public final InterfaceC19423310yt LLILLJJLI;
    public final InterfaceC19402810va LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.LIZ().size();
    }

    @Override // X.InterfaceC19402410vW
    public final void u(InterfaceC19402510vX interfaceC19402510vX) {
        this.LLILLL.u(interfaceC19402510vX);
    }

    @Override // X.InterfaceC19402410vW
    public final void O2(InterfaceC19402510vX interfaceC19402510vX, int i) {
        this.LLILLL.O2(interfaceC19402510vX, i);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C19402710vZ c19402710vZ = (C19402710vZ) viewHolder;
        final InterfaceC19403010vc interfaceC19403010vc = (InterfaceC19403010vc) ListProtector.get(this.LLILLJJLI.LIZ(), i);
        InterfaceC19401710vP interfaceC19401710vP = new InterfaceC19401710vP() { // from class: X.10vb
            @Override // X.InterfaceC19401710vP
            public final void L5(C19402010vS c19402010vS) {
                this.LL.LLILLL.Av(interfaceC19403010vc, c19402010vS);
            }
        };
        C19424410z4 c19424410z4 = this.LL;
        c19402710vZ.LL.setText(interfaceC19403010vc.getName());
        int i3 = 0;
        if (interfaceC19403010vc.LJFF() != null) {
            C19401910vR c19401910vRLJFF = interfaceC19403010vc.LJFF();
            c19402710vZ.LLILLJJLI.setLayoutManager(new LinearLayoutManager(c19402710vZ.itemView.getContext(), 0, false));
            c19402710vZ.LLILLJJLI.setAdapter(new C19401510vN(c19401910vRLJFF, interfaceC19401710vP));
        } else {
            C786410Ut5.LLIZLLLIL(c19402710vZ.LLILLJJLI, 8);
        }
        if (!(!interfaceC19403010vc.LIZLLL().isEmpty()) && !(!interfaceC19403010vc.LIZJ().isEmpty())) {
            C786410Ut5.LLIZLLLIL(c19402710vZ.LLILLL, 8);
            return;
        }
        if (interfaceC19403010vc.getType() == EnumC587610N2x.GRID) {
            i3 = 1;
            i2 = 3;
        } else {
            i2 = 6;
        }
        int i4 = i3 ^ 1;
        if (i3 != 0) {
            c19402710vZ.LLILLL.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        } else {
            c19402710vZ.LLILLL.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        c19402710vZ.LLILLL.setLayoutManager(new GridLayoutManager(c19402710vZ.itemView.getContext(), i2));
        c19402710vZ.LLILLL.setAdapter(new C19402110vT(i2, new ArrayList(interfaceC19403010vc.LIZLLL().values()), interfaceC19403010vc.LIZJ(), i4, this, new AwS608S0100000_29(c19424410z4, 866), new AwS395S0200000_29(interfaceC19403010vc, c19424410z4, 115)));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19402710vZ c19402710vZ = new C19402710vZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.egw, viewGroup, false));
        try {
            View view = c19402710vZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19402710vZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19402710vZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19402710vZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19402710vZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19402710vZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19402710vZ.class.getName();
        return c19402710vZ;
    }

    public C19402610vY(C19424410z4 c19424410z4, InterfaceC19423310yt interfaceC19423310yt, InterfaceC19402810va interfaceC19402810va) {
        this.LL = c19424410z4;
        this.LLILLJJLI = interfaceC19423310yt;
        this.LLILLL = interfaceC19402810va;
    }
}
