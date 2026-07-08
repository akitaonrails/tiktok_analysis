package X;

import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Igk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.frequency.LiveNotifyMessageFrequencyManager$onRecordAdded$1", f = "LiveNotifyMessageFrequencyManager.kt", l = {478}, m = "invokeSuspend")
public final class C473000Igk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C473000Igk(long j, InterfaceC1364105Vn<? super C473000Igk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473000Igk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotifyMessageFrequencyManager@3a91.onRecordAdded$1");
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
            long j = (((long) C1102420enI.LJIIJJI) - this.LLILLJJLI) + C1102420enI.LJIIZILJ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveNotifyMessageFrequencyManager@3a91.onRecordAdded$1");
                return objLJFF;
            }
        }
        HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
        C1102420enI.LJIIJJI();
        C11JF c11jf = C1102420enI.LJIILIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1102420enI.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotifyMessageFrequencyManager@3a91.onRecordAdded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
