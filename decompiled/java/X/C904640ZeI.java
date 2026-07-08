package X;

import Y.ARunnableS46S0300000_13;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904640ZeI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C689120R1i LL;
    public final /* synthetic */ MessageListSubmitListAbilityImpl LLILLJJLI;
    public final /* synthetic */ C259800zU<List<C869590Y9l>> LLILLL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C238400w2 LLILZLL;
    public final /* synthetic */ List<InterfaceC904740ZeS> LLIZ;
    public final /* synthetic */ C1506005v0 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C904640ZeI(C689120R1i c689120R1i, MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl, C259800zU<List<C869590Y9l>> c259800zU, List<? extends InterfaceC1891350zJl> list, boolean z, C238400w2 c238400w2, List<? extends InterfaceC904740ZeS> list2, C1506005v0 c1506005v0) {
        super(0);
        this.LL = c689120R1i;
        this.LLILLJJLI = messageListSubmitListAbilityImpl;
        this.LLILLL = c259800zU;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = c238400w2;
        this.LLIZ = list2;
        this.LLIZLLLIL = c1506005v0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        try {
            this.LL.LIZ("set_and_diff");
            MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl = this.LLILLJJLI;
            C13E8<Long> c13e8 = messageListSubmitListAbilityImpl.LLJJJIL;
            C238400w2 c238400w2 = this.LLILZLL;
            synchronized (c13e8) {
                z = false;
                while (messageListSubmitListAbilityImpl.LLJJJIL.LJFF() != null && messageListSubmitListAbilityImpl.LLJJJIL.first().longValue() <= c238400w2.element) {
                    try {
                        messageListSubmitListAbilityImpl.LLJJJIL.removeFirst();
                        z = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (z) {
                this.LLILLJJLI.LJFF().stopScroll();
                this.LLILLJJLI.LIZIZ().scrollToPositionWithOffset(0, 0);
            }
            MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl2 = this.LLILLJJLI;
            messageListSubmitListAbilityImpl2.LLJLILLLLZIIL.LIZJ(this.LLILLL.element);
            MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl3 = this.LLILLJJLI;
            messageListSubmitListAbilityImpl3.LLJLLIL.setValue(this.LLILZ);
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SubmistList committed size=");
                sbLIZ.append(this.LLILLL.element.size());
                sbLIZ.append(", powerItemSize=");
                sbLIZ.append(this.LLILZ.size());
                sbLIZ.append(", shouldScroll=");
                sbLIZ.append(z);
                sbLIZ.append(", isFirst=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", ts=");
                sbLIZ.append(this.LLILZLL.element);
                iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
            }
            MessageListSubmitListAbilityImpl messageListSubmitListAbilityImpl4 = this.LLILLJJLI;
            List<C869590Y9l> list = this.LLILLL.element;
            if (!messageListSubmitListAbilityImpl4.LLJJL) {
                messageListSubmitListAbilityImpl4.LLJJL = true;
                InterfaceC788910Ux7 interfaceC788910Ux7 = messageListSubmitListAbilityImpl4.LLILLJJLI.LIZIZ;
                if (!Intrinsics.LJFF(interfaceC788910Ux7, C788920Ux8.LIZ)) {
                    if (!(interfaceC788910Ux7 instanceof C788900Ux6)) {
                        throw new C1954807lC();
                    }
                    HandlerHook.viewPost(messageListSubmitListAbilityImpl4.LJFF(), new ARunnableS46S0300000_13(interfaceC788910Ux7, list, messageListSubmitListAbilityImpl4, 15));
                }
            }
            C689120R1i c689120R1i = this.LL;
            c689120R1i.getClass();
            c689120R1i.LIZ = System.currentTimeMillis();
            ((InterfaceC904700ZeO) this.LLILLJJLI.LLJI.getValue()).LIZLLL(this.LLIZ, new AwS558S0100000_14(this.LLILLJJLI, 574));
            List<IMessagePowerAdapterProtocol> listLIZIZ = this.LLILLJJLI.LLILLL.LIZIZ();
            C259800zU<List<C869590Y9l>> c259800zU = this.LLILLL;
            List<InterfaceC904740ZeS> list2 = this.LLIZ;
            List<InterfaceC1891350zJl> list3 = this.LLILZ;
            Iterator<IMessagePowerAdapterProtocol> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().YP2(c259800zU.element, list2, list3);
            }
            this.LL.LIZ("onSubmitListComplete");
            this.LL.LIZIZ(this.LLILLJJLI.LLILZIL.getTag(), this.LLILZ.size(), this.LLILZIL, this.LLILLJJLI.LLILZLL.LIZ(), C0I0B.LJFF.LIZIZ());
            if (this.LLILZIL) {
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
                if (iMALogApiLIZ2 != null) {
                    iMALogApiLIZ2.LIZ(4, "IM-Chatroom", "First submit list completed");
                }
            }
            C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
            C1506005v0 c1506005v0 = this.LLIZLLLIL;
            final boolean z2 = this.LLILZIL;
            final String tag = this.LLILLJJLI.LLILZIL.getTag();
            c1366690lfX.LIZJ(c1506005v0, new AbstractC1493005su(z2, tag) { // from class: X.00j4
                public final boolean LIZLLL;
                public final String LJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C158000j4)) {
                        return false;
                    }
                    C158000j4 c158000j4 = (C158000j4) obj;
                    return this.LIZLLL == c158000j4.LIZLLL && Intrinsics.LJFF(this.LJ, c158000j4.LJ);
                }

                public final int hashCode() {
                    return (C786410Ut5.Z2(this.LIZLLL) * 31) + this.LJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SubmitListComputationBody(isOnQueryEvent=");
                    sbLIZ2.append(this.LIZLLL);
                    sbLIZ2.append(", bizTypeTag=");
                    sbLIZ2.append(this.LJ);
                    sbLIZ2.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                {
                    C13DA c13da = new C13DA();
                    c13da.put("is_onquery_event", Boolean.valueOf(z2));
                    c13da.put("biz_type", tag);
                    super(null, null, c13da.build(), 3);
                    this.LIZLLL = z2;
                    this.LJ = tag;
                }
            });
        } catch (C738120SxO e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MessageListSubmitListAbilityImpl submitNewMessageList AccessViewModelAfterDestroyedException");
        }
        return Unit.LIZ;
    }
}
