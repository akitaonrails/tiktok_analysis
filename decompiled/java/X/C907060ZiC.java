package X;

import Y.AObjectS389S0100000_14;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbilityImpl;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0ZiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907060ZiC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final MessagePowerListAbility LIZ;
    public final InterfaceC904700ZeO LIZIZ;
    public final C01GW LIZJ;
    public volatile MessageListScrollAbilityImpl LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C907060ZiC.class, "provider", "getProvider()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListScrollAbility;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MessageListScrollAbilityImpl LIZ() {
        MessageListScrollAbilityImpl messageListScrollAbilityImpl = this.LIZLLL;
        if (messageListScrollAbilityImpl == null) {
            synchronized (this) {
                messageListScrollAbilityImpl = this.LIZLLL;
                if (messageListScrollAbilityImpl == null) {
                    MessageListScrollAbilityImpl messageListScrollAbilityImpl2 = new MessageListScrollAbilityImpl(C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 40)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 41)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 42)));
                    this.LIZLLL = messageListScrollAbilityImpl2;
                    return messageListScrollAbilityImpl2;
                }
            }
        }
        return messageListScrollAbilityImpl;
    }

    public C907060ZiC(C01GW c01gw, MessageListAbilityHolder messageListAbilityHolder, InterfaceC904700ZeO interfaceC904700ZeO) {
        this.LIZ = messageListAbilityHolder;
        this.LIZIZ = interfaceC904700ZeO;
        this.LIZJ = C452501pT.LIZIZ(new AwS548S0100000_4(c01gw, 522));
    }
}
