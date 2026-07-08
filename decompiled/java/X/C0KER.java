package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KER, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KER extends AbstractC339560DSw<C514480KFq> {
    public final TuxTextView LL;

    public C0KER(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.be_);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC514430KFl) interfaceC339570DSx).LIZ;
        ISubPackagePageAbility iSubPackagePageAbility = null;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            iSubPackagePageAbility.Ku();
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C0K0R.LIZ(tuxTextView);
        }
        if (iSubPackagePageAbility != null) {
            iSubPackagePageAbility.Io(new AwS586S0100000_7(this, 483));
        }
    }
}
