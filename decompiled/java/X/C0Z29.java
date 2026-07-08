package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS68S0010000_14;

/* JADX INFO: renamed from: X.0Z29, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0Z29 extends AbstractC894380Z6u<BaseActionViewModel<?>> {
    public final InterfaceC2172841A1y LLIZ;

    @Override // X.AbstractC894380Z6u
    public final InterfaceC2172841A1y LJ() {
        return this.LLIZ;
    }

    public C0Z29(IMUser iMUser, boolean z, InterfaceC2172841A1y interfaceC2172841A1y) {
        super(interfaceC2172841A1y, new AwS558S0100000_14(iMUser, 1652), new AwS633S0100000_19(iMUser, 303), new AwS68S0010000_14(z, 1), AFwS248S0000000_14.get$arr$(396), AFwS248S0000000_14.get$arr$(397));
        this.LLIZ = interfaceC2172841A1y;
    }
}
