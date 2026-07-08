package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.109V, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109V extends ValuedAccountPrivacySettingItemModel {
    public final C191848103q LLJILJILJ;
    public final C191989109b LLJILLL;
    public final C191983108v LLJJ;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        boolean z2;
        CharSequence charSequenceLJI;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIILLIIL());
        boolean z3 = c191986108yLIZLLL.LIZ;
        boolean z4 = c191986108yLIZLLL.LIZIZ;
        C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIILLIIL(), Integer.valueOf(this.LLJILLL.LJIIJJI)));
        boolean z5 = c191986108yLJ.LIZ;
        boolean z6 = c191986108yLJ.LIZIZ;
        Function1<? super Boolean, Boolean> function1 = this.LLJILLL.LJII;
        boolean z7 = true;
        if (z4 && z6) {
            z = true;
        } else {
            z = false;
        }
        if (function1.invoke(Boolean.valueOf(z)).booleanValue()) {
            this.LLJILLL.getClass();
            Integer value = this.LLJILJIL.LLILLL.getValue();
            int i = this.LLJILLL.LJIIJJI;
            if (value != null && value.intValue() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            C191989109b c191989109b = this.LLJILLL;
            Integer num = c191989109b.LIZLLL;
            CharSequence charSequenceLJI2 = LJI(c191989109b.LJ, context);
            C103N c103n = this.LLJILLL.LJFF;
            if (c103n != null) {
                charSequenceLJI = LJI(c103n, context);
            } else {
                charSequenceLJI = null;
            }
            boolean zLJFF = Intrinsics.LJFF(this.LLJILJIL.LLILZ.getValue(), Boolean.TRUE);
            Function1<? super Boolean, Boolean> function12 = this.LLJILLL.LJI;
            if (!z3 || !z5) {
                z7 = false;
            }
            boolean zBooleanValue = function12.invoke(Boolean.valueOf(z7)).booleanValue();
            C191989109b c191989109b2 = this.LLJILLL;
            C192009109v c192009109v = c191989109b2.LJIILIIL;
            AFwS268S0000000_26 aFwS268S0000000_26 = c191989109b2.LJIIJ;
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.LLJILJILJ.LJ;
            if (bundle2 != null) {
                C786410Ut5.LJJIIJZLJL(bundle, bundle2);
            }
            aFwS268S0000000_26.getClass();
            this.LLJILLL.getClass();
            C10FD c10fd = new C10FD(num, charSequenceLJI2, charSequenceLJI, new AwS642S0100000_28(this, 76), new AwS607S0100000_28(this, 236), new AwS642S0100000_28(this, 77), z2, zLJFF, zBooleanValue, false, c192009109v, false, new AwS144S0110000_28(this, z2, 4), 6144);
            this.LLJJ.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            arrayList.add(c10fd);
        }
        return arrayList;
    }

    public C109V(C191848103q c191848103q, C191989109b c191989109b) {
        super(c191848103q, c191989109b);
        this.LLJILJILJ = c191848103q;
        this.LLJILLL = c191989109b;
        this.LLJJ = new C191983108v(c191989109b.LIZ, "Switch");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
    public void LIZ(int i, Throwable th) {
        super.LIZ(i, th);
        this.LLJJ.LJFF(i, this.LLJILJILJ.LIZLLL, th);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
    public void LIZIZ(int i, BaseResponse baseResponse) {
        super.LIZIZ(i, baseResponse);
        this.LLJJ.LJI(i, this.LLJILJILJ.LIZLLL, baseResponse);
    }
}
