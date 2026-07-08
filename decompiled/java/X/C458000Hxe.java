package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.groupshot.AIGroupShotRecallVMImpl;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Hxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.groupshot.AIGroupShotRecallVMImpl$deleteTask$2", f = "AIGroupShotRecallVMImpl.kt", l = {48}, m = "invokeSuspend")
public final class C458000Hxe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AIGroupShotCardTemplate LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ AIGroupShotRecallVMImpl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458000Hxe(AIGroupShotCardTemplate aIGroupShotCardTemplate, C869590Y9l c869590Y9l, AIGroupShotRecallVMImpl aIGroupShotRecallVMImpl, InterfaceC1364105Vn<? super C458000Hxe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = aIGroupShotCardTemplate;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = aIGroupShotRecallVMImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458000Hxe(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C013C c013c;
        C013C c013c2;
        AIGroupShotRecallVMImpl aIGroupShotRecallVMImpl;
        AwS585S0100000_6 awS585S0100000_6;
        C1C7U.LIZ("AIGroupShotRecallVMImpl@a07b.deleteTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        C013C c013c3 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    c013c = this.LLILLJJLI;
                    c013c2 = this.LL;
                    try {
                        C155000ia.LIZIZ(obj);
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C0YS1.LIZ("AIGroupShotRecallVM", String.valueOf(e.getMessage()));
                        aIGroupShotRecallVMImpl = this.LLILZLL;
                        awS585S0100000_6 = new AwS585S0100000_6(c013c2, 61);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c013c = new C013C();
                try {
                    InterfaceC911930Zq3 interfaceC911930Zq3LJIIZILJ = C912070ZqH.LIZIZ.LJIIZILJ();
                    String str = this.LLILZ.taskId;
                    this.LL = c013c;
                    this.LLILLJJLI = c013c;
                    this.LLILLL = 1;
                    obj = interfaceC911930Zq3LJIIZILJ.LIZIZ(str, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("AIGroupShotRecallVMImpl@a07b.deleteTask$2");
                        return objLJFF;
                    }
                    c013c2 = c013c;
                } catch (Exception e2) {
                    e = e2;
                    c013c2 = c013c;
                    TryCatchGuardChecker.doCheck(e);
                    C0YS1.LIZ("AIGroupShotRecallVM", String.valueOf(e.getMessage()));
                    aIGroupShotRecallVMImpl = this.LLILZLL;
                    awS585S0100000_6 = new AwS585S0100000_6(c013c2, 61);
                } catch (Throwable th) {
                    th = th;
                    c013c3 = c013c;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILZLL.setState(new AwS585S0100000_6(c013c3, 61));
                    throw th;
                }
            }
            c013c.element = ((Boolean) obj).booleanValue();
            if (c013c2.element) {
                C0Y3I c0y3i = new C0Y3I("remove user photos");
                C869590Y9l c869590Y9l = this.LLILZIL;
                c869590Y9l.setContentPB(AIGroupShotCardTemplate.LIZ(this.LLILZ, null, EnumC2241471CoD.RECALL, true, null, null, null, 32575).encode());
                C458020Hxg.LIZ(c0y3i, c869590Y9l);
            }
            aIGroupShotRecallVMImpl = this.LLILZLL;
            awS585S0100000_6 = new AwS585S0100000_6(c013c2, 61);
            aIGroupShotRecallVMImpl.setState(awS585S0100000_6);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGroupShotRecallVMImpl@a07b.deleteTask$2");
            return unit;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
