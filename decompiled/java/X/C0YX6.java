package X;

import com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0YX6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent", f = "PigeonIDCChangeComponent.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "calculateServerTime")
public final class C0YX6 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PigeonIDCChangeComponent LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YX6(PigeonIDCChangeComponent pigeonIDCChangeComponent, InterfaceC1364105Vn<? super C0YX6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = pigeonIDCChangeComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonIDCChangeComponent@bd58.calculateServerTime$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJILLIZJL = this.LLILLL.LJJLIIIJILLIZJL(this, null);
        C1C7U.LIZIZ("PigeonIDCChangeComponent@bd58.calculateServerTime$1");
        return objLJJLIIIJILLIZJL;
    }
}
