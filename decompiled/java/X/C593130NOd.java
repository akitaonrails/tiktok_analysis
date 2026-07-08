package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeEffectRepositoryImpl$getEntityByUuid$2", f = "AwemeEffectRepositoryImpl.kt", l = {82}, m = "invokeSuspend")
public final class C593130NOd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0NPA>, Object> {
    public int LL;
    public final /* synthetic */ AwemeEffectRepositoryImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593130NOd(AwemeEffectRepositoryImpl awemeEffectRepositoryImpl, String str, InterfaceC1364105Vn<? super C593130NOd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeEffectRepositoryImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593130NOd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0NPA c0npaLIZ;
        C1C7U.LIZ("AwemeEffectRepositoryImpl@f694.getEntityByUuid$2");
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
            InterfaceC593180NOi interfaceC593180NOiLJIIJJI = this.LLILLJJLI.LJIIJJI();
            if (interfaceC593180NOiLJIIJJI != null) {
                String str = this.LLILLL;
                this.LL = 1;
                obj = interfaceC593180NOiLJIIJJI.LIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntityByUuid$2");
                    return objLJFF;
                }
            }
            c0npaLIZ = null;
            C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntityByUuid$2");
            return c0npaLIZ;
        }
        C0NPC c0npc = (C0NPC) obj;
        if (c0npc != null) {
            c0npaLIZ = C0NPB.LIZ(c0npc);
        } else {
            c0npaLIZ = null;
        }
        C1C7U.LIZIZ("AwemeEffectRepositoryImpl@f694.getEntityByUuid$2");
        return c0npaLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0NPA> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
