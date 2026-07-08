package X;

import Y.AgS163S0300000_3;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem$observeViewModel$10", f = "BulletinVoiceRecordAssem.kt", l = {667}, m = "invokeSuspend")
public final class C2227708o7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinVoiceRecordAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2227708o7(BulletinVoiceRecordAssem bulletinVoiceRecordAssem, InterfaceC1364105Vn<? super C2227708o7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bulletinVoiceRecordAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2227708o7 c2227708o7 = new C2227708o7(this.LLILLL, interfaceC1364105Vn);
        c2227708o7.LLILLJJLI = obj;
        return c2227708o7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceRecordAssem@4687.observeViewModel$10");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C259800zU c259800zU = new C259800zU();
            C2252321DDq c2252321DDq = this.LLILLL.tp().LLJJI.LJI;
            AgS163S0300000_3 agS163S0300000_3 = new AgS163S0300000_3(c259800zU, interfaceC497601wk, this.LLILLL, 0);
            this.LL = 1;
            if (c2252321DDq.collect(agS163S0300000_3, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinVoiceRecordAssem@4687.observeViewModel$10");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
