package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentEnterParams;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1077030e8L {
    public final Fragment LIZ;
    public final IMessageAbility LIZIZ;
    public final List<ICommerceAgentProcessorProtocol> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 719));
    public final C1077000e8I LJ = new C1077000e8I();

    /* JADX WARN: Multi-variable type inference failed */
    public C1077030e8L(Fragment fragment, IMessageAbility iMessageAbility, CommerceAgentEnterParams commerceAgentEnterParams, List<? extends ICommerceAgentProcessorProtocol> list) {
        this.LIZ = fragment;
        this.LIZIZ = iMessageAbility;
        this.LIZJ = list;
    }
}
