package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0K0B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0B extends C0K07<C515580KJw> {
    public final C21546719Ub LL;
    public boolean LLILLJJLI;

    public C0K0B(View view) {
        super(view);
        this.LL = (C21546719Ub) view.findViewById(R.id.qls);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        final ISubPackagePageAbility iSubPackagePageAbility = null;
        if (interfaceC665370Q7z != null) {
            iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null);
        }
        final ArrayList arrayList = new ArrayList();
        if (iSubPackagePageAbility != null) {
            iSubPackagePageAbility.xa(new C0K09(this, arrayList));
        }
        this.LL.LIZ(new InterfaceC20485215Du() { // from class: X.0K0C
            @Override // X.InterfaceC20485215Du
            public final void LIZ() {
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZIZ(C763970Txz c763970Txz) {
                View viewFindViewById;
                ISubPackagePageAbility iSubPackagePageAbility2 = iSubPackagePageAbility;
                if (iSubPackagePageAbility2 != null) {
                    iSubPackagePageAbility2.Hc(((SubPackageSummary) ListProtector.get(arrayList, c763970Txz.LJFF)).id);
                }
                this.getClass();
                View view = c763970Txz.LJI;
                if (view != null && (viewFindViewById = view.findViewById(R.id.umm)) != null) {
                    C500260Jjc.LLFFF(viewFindViewById);
                }
            }

            @Override // X.InterfaceC20485215Du
            public final void LIZLLL(C763970Txz c763970Txz) {
                View viewFindViewById;
                this.getClass();
                View view = c763970Txz.LJI;
                if (view != null && (viewFindViewById = view.findViewById(R.id.umm)) != null) {
                    C500260Jjc.LJIILIIL(viewFindViewById);
                }
            }
        });
    }
}
