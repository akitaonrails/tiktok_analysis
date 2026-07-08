package X;

import Y.AObjectS389S0100000_14;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolderImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel.MessageListOperatorVM;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905090Zf1 implements InterfaceC903650Zch {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIZILJ;
    public final C905120Zf4 LIZ;
    public final InterfaceC904830Zeb LIZIZ;
    public final InterfaceC905160Zf8 LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1333));
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final MessageListAbilityHolder LJIIIZ;
    public final C11NZ<InterfaceC904740ZeS> LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public volatile C905110Zf3 LJIILIIL;
    public volatile C905100Zf2 LJIILJJIL;
    public volatile MessageListAbilityHolderImpl LJIILL;
    public volatile C907060ZiC LJIILLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905090Zf1.class, "socialIMSDKMessageListOperatorVMFactory", "getSocialIMSDKMessageListOperatorVMFactory()Lcom/ss/android/ugc/aweme/im/messagelist/ui/viewmodel/SocialIMSDKMessageListOperatorVMFactory;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C905090Zf1.class, "messageListViewComponent", "getMessageListViewComponent()Lcom/ss/android/ugc/aweme/im/messagelist/provider/MessageListViewComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C905090Zf1.class, "messageListAbilityHolder", "getMessageListAbilityHolder()Lcom/ss/android/ugc/aweme/im/messagelist/provider/MessageListAbilityHolder;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C905090Zf1.class, "messageListScrollAbilityFactory", "getMessageListScrollAbilityFactory()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListScrollAbilityFactory;", 0);
        c09r3.getClass();
        LJIIZILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC903650Zch
    public final MessageListAbilityHolder LIZ() {
        MessageListAbilityHolderImpl messageListAbilityHolderImpl = this.LJIILL;
        if (messageListAbilityHolderImpl == null) {
            synchronized (this) {
                messageListAbilityHolderImpl = this.LJIILL;
                if (messageListAbilityHolderImpl == null) {
                    MessageListAbilityHolderImpl messageListAbilityHolderImpl2 = new MessageListAbilityHolderImpl(C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 27)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 28)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 29)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 30)));
                    this.LJIILL = messageListAbilityHolderImpl2;
                    return messageListAbilityHolderImpl2;
                }
            }
        }
        return messageListAbilityHolderImpl;
    }

    public final C905100Zf2 LIZIZ() {
        C905100Zf2 c905100Zf2 = this.LJIILJJIL;
        if (c905100Zf2 == null) {
            synchronized (this) {
                c905100Zf2 = this.LJIILJJIL;
                if (c905100Zf2 == null) {
                    C905100Zf2 c905100Zf22 = new C905100Zf2(this.LIZ, (MessageListOperatorVM) this.LJI.getValue(), this.LJIIJ, (InterfaceC904660ZeK) this.LIZLLL.getValue(), (InterfaceC899940ZSe) this.LJIIIIZZ.getValue(), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 31)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 32)), C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 33)));
                    this.LJIILJJIL = c905100Zf22;
                    return c905100Zf22;
                }
            }
        }
        return c905100Zf2;
    }

    @Override // X.InterfaceC903650Zch
    public final void init() {
        ((MessageListSubmitListAbilityImpl) LIZIZ().LIZ()).LJIIJJI();
        ((MessageListOperatorVM) this.LJI.getValue()).xQ2(this.LIZ.LIZ);
        ((MessageListSubmitListAbilityImpl) LIZIZ().LIZ()).LJI();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZ), null, null, new C347101Wj(this, null), 3);
    }

    public C905090Zf1(C905120Zf4 c905120Zf4, C904670ZeL c904670ZeL, InterfaceC904830Zeb interfaceC904830Zeb, InterfaceC905160Zf8 interfaceC905160Zf8, C01GW c01gw) {
        this.LIZ = c905120Zf4;
        this.LIZIZ = interfaceC904830Zeb;
        this.LIZJ = interfaceC905160Zf8;
        this.LIZLLL = C452501pT.LIZIZ(new AwS415S0200000_14(c904670ZeL, this, 81));
        this.LJFF = c01gw;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1332));
        this.LJI = c01gwLIZIZ;
        this.LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1331));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1336));
        this.LJIIIZ = LIZ();
        this.LJIIJ = ((MessageListOperatorVM) c01gwLIZIZ.getValue()).s9();
        this.LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1335));
        this.LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1334));
    }
}
