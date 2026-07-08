package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904680ZeM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJ;
    public final C905120Zf4 LIZ;
    public final InterfaceC904660ZeK LIZIZ;
    public final InterfaceC904830Zeb LIZJ;
    public final InterfaceC905160Zf8 LIZLLL;
    public final C01GW<InterfaceC904730ZeR> LJ;
    public final CopyOnWriteArraySet<IMessageEventProtocol> LJFF = new CopyOnWriteArraySet<>();
    public final C904670ZeL LJI = new InterfaceC904660ZeK() { // from class: X.0ZeL
        public final /* synthetic */ InterfaceC904660ZeK LIZ;

        @Override // X.InterfaceC904660ZeK
        public final List<IMessagePowerAdapterProtocol> LIZIZ() {
            return this.LIZ.LIZIZ();
        }

        @Override // X.InterfaceC904660ZeK
        public final Function1<Function0<? extends List<? extends C869590Y9l>>, List<InterfaceC904610ZeF<?>>> LIZJ() {
            return this.LIZ.LIZJ();
        }

        @Override // X.InterfaceC904660ZeK
        public final List<IMessageEventProtocol> LIZ() {
            return C13LP.LJLIL(this.LIZIZ.LJFF, this.LIZIZ.LIZIZ.LIZ());
        }

        {
            this.LIZ = this.LIZIZ.LIZIZ;
        }
    };
    public final C01GW LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1329));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1330));
    public volatile C904750ZeT LJIIIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C904680ZeM.class, "messageListComponentFactory", "getMessageListComponentFactory()Lcom/ss/android/ugc/aweme/im/messagelist/provider/MessageListComponentFactory;", 0);
        C13LE.LIZ.getClass();
        LJIIJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MessageListAbilityHolder LIZ() {
        return (MessageListAbilityHolder) this.LJIIIIZZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ZeL] */
    public C904680ZeM(C905120Zf4 c905120Zf4, InterfaceC904660ZeK interfaceC904660ZeK, InterfaceC904830Zeb interfaceC904830Zeb, InterfaceC905160Zf8 interfaceC905160Zf8, C01GW<? extends InterfaceC904730ZeR> c01gw) {
        this.LIZ = c905120Zf4;
        this.LIZIZ = interfaceC904660ZeK;
        this.LIZJ = interfaceC904830Zeb;
        this.LIZLLL = interfaceC905160Zf8;
        this.LJ = c01gw;
    }
}
