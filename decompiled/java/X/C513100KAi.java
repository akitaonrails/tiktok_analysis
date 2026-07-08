package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS216S0300000_7;

/* JADX INFO: renamed from: X.0KAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513100KAi extends AbstractC339560DSw<C514550KFx> {
    public final C19U1 LL;
    public boolean LLILLJJLI;
    public final ViewGroup LLILLL;

    public C513100KAi(View view) {
        super(view);
        this.LL = (C19U1) view.findViewById(R.id.qls);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.qlr);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC514430KFl) interfaceC339570DSx).LIZ;
        final ISubPackagePageAbility iSubPackagePageAbility = null;
        if (interfaceC665370Q7z != null) {
            iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null);
        }
        final ArrayList arrayList = new ArrayList();
        if (iSubPackagePageAbility != null) {
            iSubPackagePageAbility.xa(new AwS216S0300000_7(iSubPackagePageAbility, (ISubPackagePageAbility) this, (C513100KAi) arrayList, (List<SubPackageSummary>) 13));
        }
        this.LL.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0KAh
            @Override // X.InterfaceC1586460rO0
            public final void ih(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void Oq(C19U0 c19u0) {
                View viewFindViewById;
                ISubPackagePageAbility iSubPackagePageAbility2 = iSubPackagePageAbility;
                if (iSubPackagePageAbility2 != null) {
                    iSubPackagePageAbility2.Hc(((SubPackageSummary) ListProtector.get(arrayList, c19u0.LJ)).id);
                }
                this.getClass();
                View view = c19u0.LJFF;
                if (view != null && (viewFindViewById = view.findViewById(R.id.umm)) != null) {
                    C0K0R.LIZJ(viewFindViewById);
                }
            }

            @Override // X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
                View viewFindViewById;
                this.getClass();
                View view = c19u0.LJFF;
                if (view != null && (viewFindViewById = view.findViewById(R.id.umm)) != null) {
                    C0K0R.LIZ(viewFindViewById);
                }
            }
        });
    }
}
