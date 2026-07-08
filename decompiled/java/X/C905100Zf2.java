package X;

import Y.AObjectS389S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListSubmitListAbility;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;

/* JADX INFO: renamed from: X.0Zf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905100Zf2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIZ;
    public final C905120Zf4 LIZ;
    public final MessageListOperatorVM LIZIZ;
    public final C11NZ<InterfaceC904740ZeS> LIZJ;
    public final InterfaceC904660ZeK LIZLLL;
    public final InterfaceC899940ZSe LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public volatile MessageListSubmitListAbilityImpl LJIIIIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905100Zf2.class, "messageListSubmitListAbility", "getMessageListSubmitListAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListSubmitListAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MessageListSubmitListAbility LIZ() {
        MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl = this.LJIIIIZZ;
        if (messageListSubmitListAbilityImpl == null) {
            synchronized (this) {
                messageListSubmitListAbilityImpl = this.LJIIIIZZ;
                if (messageListSubmitListAbilityImpl == null) {
                    C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 34));
                    C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 35));
                    C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 22));
                    C11NZ<InterfaceC904740ZeS> c11nz = this.LIZJ;
                    C904630ZeH c904630ZeH = this.LIZ.LIZJ;
                    InterfaceC904660ZeK interfaceC904660ZeK = this.LIZLLL;
                    C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 23));
                    C01GW c01gwLIZIZ5 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 24));
                    LifecycleOwner lifecycleOwner = this.LIZ.LIZ;
                    C01GW c01gwLIZIZ6 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 25));
                    C905120Zf4 c905120Zf4 = this.LIZ;
                    MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl2 = new MessageListSubmitListAbilityImpl(c01gwLIZIZ, c01gwLIZIZ2, c01gwLIZIZ3, c11nz, c904630ZeH, interfaceC904660ZeK, c01gwLIZIZ4, c01gwLIZIZ5, lifecycleOwner, c01gwLIZIZ6, c905120Zf4.LJI, c905120Zf4.LJII);
                    this.LJIIIIZZ = messageListSubmitListAbilityImpl2;
                    return messageListSubmitListAbilityImpl2;
                }
            }
        }
        return messageListSubmitListAbilityImpl;
    }

    public C905100Zf2(C905120Zf4 c905120Zf4, MessageListOperatorVM messageListOperatorVM, C11NZ<InterfaceC904740ZeS> c11nz, InterfaceC904660ZeK interfaceC904660ZeK, InterfaceC899940ZSe interfaceC899940ZSe, C01GW<? extends ChatLinearLayoutManager> c01gw, C01GW<? extends InterfaceC904700ZeO> c01gw2, C01GW<? extends InterfaceC904730ZeR> c01gw3) {
        this.LIZ = c905120Zf4;
        this.LIZIZ = messageListOperatorVM;
        this.LIZJ = c11nz;
        this.LIZLLL = interfaceC904660ZeK;
        this.LJ = interfaceC899940ZSe;
        this.LJFF = c01gw;
        this.LJI = c01gw2;
        this.LJII = c01gw3;
    }
}
