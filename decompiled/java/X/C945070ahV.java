package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ahV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945070ahV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C955440ayE LL;
    public final /* synthetic */ CapsuleMessage LLILLJJLI;
    public final /* synthetic */ C944860ahA LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ CapsuleBizParamsCohost LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945070ahV(C955440ayE c955440ayE, CapsuleMessage capsuleMessage, C944860ahA c944860ahA, long j, CapsuleBizParamsCohost capsuleBizParamsCohost) {
        super(0);
        this.LL = c955440ayE;
        this.LLILLJJLI = capsuleMessage;
        this.LLILLL = c944860ahA;
        this.LLILZ = j;
        this.LLILZIL = capsuleBizParamsCohost;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C955440ayE c955440ayE = this.LL;
        c955440ayE.LJJ(this.LLILLJJLI);
        c955440ayE.LJIJJLI("capsule_message_insert");
        this.LLILLL.LLL.LIZ(String.valueOf(this.LLILLJJLI.getMessageId()));
        DataChannel dataChannel = this.LLILLL.LLJZ;
        if (dataChannel != null) {
            dataChannel.SX0(C956930b0d.class, Long.valueOf(this.LLILLJJLI.getMessageId()));
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(this.LLILZ, this.LLILLJJLI, true, null);
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        User user = this.LLILZIL.inviteeUserInfo;
        interfaceC955420ayCLIZ.LJLJJLL(user != null ? user.getId() : 0L);
        User user2 = this.LLILZIL.inviteeUserInfo;
        C945060ahU c945060ahU = new C945060ahU(this.LLILZIL.isFriend, user2 != null ? user2.getId() : 0L, false);
        DataChannel dataChannel2 = this.LLILLL.LLJZ;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C956740b0K.class, c945060ahU);
        }
        this.LLILLL.LJIIIZ(c945060ahU);
        C11JF c11jf = this.LLILLL.LLJLILLLLZIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLL.LLJLILLLLZIIL = (C11JF) C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS184S0100000_15(this.LLILLL, 147));
        return Unit.LIZ;
    }
}
