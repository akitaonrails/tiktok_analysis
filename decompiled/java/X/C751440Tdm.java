package X;

import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.usermanage.MuteManager$getMuteDuration$1$1", f = "MuteManager.kt", l = {118}, m = "invokeSuspend")
public final class C751440Tdm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ InterfaceC2329309At<C745220TLc> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751440Tdm(DataChannel dataChannel, InterfaceC2329309At<C745220TLc> interfaceC2329309At, InterfaceC1364105Vn<? super C751440Tdm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751440Tdm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("MuteManager@8a97.getMuteDuration$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C751360Tde c751360Tde = C751360Tde.LIZ;
            DataChannel dataChannel = this.LLILLJJLI;
            this.LL = 1;
            obj = c751360Tde.LIZ(dataChannel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MuteManager@8a97.getMuteDuration$1$1");
                return objLJFF;
            }
        }
        CommentSwitchSettings commentSwitchSettings = (CommentSwitchSettings) obj;
        InterfaceC2329309At<C745220TLc> interfaceC2329309At = this.LLILLL;
        if (commentSwitchSettings != null) {
            numLJ = C2286608xc.LJ(commentSwitchSettings.muteDuration);
        } else {
            numLJ = null;
        }
        interfaceC2329309At.onSuccess(C0TYC.LIZJ(numLJ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MuteManager@8a97.getMuteDuration$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
