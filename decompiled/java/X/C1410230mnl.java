package X;

import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$initData$1$1$1", f = "MusicDraftAssem.kt", l = {293, 304}, m = "invokeSuspend")
public final class C1410230mnl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MusicDraftAssem LLILLL;
    public final /* synthetic */ C0M4M LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410230mnl(MusicDraftAssem musicDraftAssem, C0M4M c0m4m, boolean z, InterfaceC1364105Vn<? super C1410230mnl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = musicDraftAssem;
        this.LLILZ = c0m4m;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410230mnl c1410230mnl = new C1410230mnl(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1410230mnl.LLILLJJLI = obj;
        return c1410230mnl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("MusicDraftAssem@abb.initData$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1410240mnm(this.LLILLL, this.LLILZ, null), 3);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1");
                return objLJFF;
            }
        }
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1410220mnk(this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (c099gLIZIZ2.LJLIIIL(this) == objLJFF) {
            C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.initData$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
