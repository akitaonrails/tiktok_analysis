package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904780ZeW implements InterfaceC904660ZeK {
    public final List<InterfaceC904870Zef<?, ? extends InterfaceC1891350zJl>> LIZ;
    public final List<InterfaceC904590ZeD<?, ? extends InterfaceC1891350zJl>> LIZIZ;
    public final List<IMessageEventProtocol> LIZJ;
    public final List<IMessagePowerAdapterProtocol> LIZLLL;
    public final AwS593S0100000_14 LJ = new AwS593S0100000_14(this, 203);

    @Override // X.InterfaceC904660ZeK
    public final List<IMessageEventProtocol> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC904660ZeK
    public final List<IMessagePowerAdapterProtocol> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC904660ZeK
    public final Function1<Function0<? extends List<? extends C869590Y9l>>, List<InterfaceC904610ZeF<?>>> LIZJ() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C904780ZeW(List<? extends InterfaceC904870Zef<?, ? extends InterfaceC1891350zJl>> list, List<? extends InterfaceC904590ZeD<?, ? extends InterfaceC1891350zJl>> list2, List<? extends IMessageEventProtocol> list3, List<? extends IMessagePowerAdapterProtocol> list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
    }
}
