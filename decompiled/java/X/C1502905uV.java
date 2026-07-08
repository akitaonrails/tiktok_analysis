package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chore.SmartReplyBotInfoHelper$doActionWithBotInfo$1", f = "SmartReplyBotInfoHelper.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1502905uV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<List<IMAIBotInfo>> LLILLJJLI;
    public final /* synthetic */ Function1<IMAIBotInfo, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502905uV(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1502905uV(interfaceC1364105Vn, this.LLILLL, this.LLILLJJLI);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMAIBotInfo iMAIBotInfo;
        C1C7U.LIZ("SmartReplyBotInfoHelper@c7eb.doActionWithBotInfo$1");
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
            List<IMAIBotInfo> list = this.LLILLJJLI.element;
            if (list == null || list.isEmpty()) {
                C259800zU<List<IMAIBotInfo>> c259800zU = this.LLILLJJLI;
                C15408061m c15408061m = C15408061m.LIZ;
                C15390060u.LL.getClass();
                int i2 = C15390060u.LLILLJJLI;
                EnumC1510605vk enumC1510605vk = EnumC1510605vk.LOCAL;
                c15408061m.getClass();
                c259800zU.element = C15408061m.LJII(i2, enumC1510605vk);
            }
            List<IMAIBotInfo> list2 = this.LLILLJJLI.element;
            if (list2 == null || list2.isEmpty()) {
                C259800zU<List<IMAIBotInfo>> c259800zU2 = this.LLILLJJLI;
                C15408061m c15408061m2 = C15408061m.LIZ;
                C15390060u.LL.getClass();
                int i3 = C15390060u.LLILLJJLI;
                EnumC1510605vk enumC1510605vk2 = EnumC1510605vk.NETWORK;
                c15408061m2.getClass();
                c259800zU2.element = C15408061m.LJII(i3, enumC1510605vk2);
            }
            List<IMAIBotInfo> list3 = this.LLILLJJLI.element;
            if (list3 != null) {
                iMAIBotInfo = (IMAIBotInfo) C13LP.LJJJLZIJ(0, list3);
            } else {
                iMAIBotInfo = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1482805rG c1482805rG = new C1482805rG(this.LLILLL, iMAIBotInfo, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1482805rG) == objLJFF) {
                C1C7U.LIZIZ("SmartReplyBotInfoHelper@c7eb.doActionWithBotInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyBotInfoHelper@c7eb.doActionWithBotInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
