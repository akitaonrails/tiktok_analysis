package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KEV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEV extends AbstractC339560DSw<C514440KFm> {
    public final TextView LL;

    public C0KEV(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.f803t27);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        ISubPackagePageAbility iSubPackagePageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC514430KFl) interfaceC339570DSx).LIZ;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            iSubPackagePageAbility.Ku();
            iSubPackagePageAbility.Io(new AwS586S0100000_7(this, 479));
        }
    }
}
