package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.SharePropagationCacheManager$read$1", f = "SharePropagationCacheManager.kt", l = {293}, m = "invokeSuspend")
public final class C1784410wXH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1154330g91>, Object> {
    public C1DEV LL;
    public InterfaceC1784430wXJ LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1784430wXJ LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784410wXH(InterfaceC1784430wXJ interfaceC1784430wXJ, long j, String str, int i, InterfaceC1364105Vn<? super C1784410wXH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1784430wXJ;
        this.LLIZLLLIL = j;
        this.LLJ = str;
        this.LLJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784410wXH(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        InterfaceC1784430wXJ interfaceC1784430wXJ;
        long j;
        Object obj2;
        int i;
        Object next;
        boolean z;
        C1C7U.LIZ("SharePropagationCacheManager@7b32.read$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZLL;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZIL;
                j = this.LLILZ;
                obj2 = this.LLILLL;
                interfaceC1784430wXJ = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C1784440wXK.LIZJ;
            interfaceC1784430wXJ = this.LLIZ;
            j = this.LLIZLLLIL;
            obj2 = this.LLJ;
            i = this.LLJI;
            this.LL = c1dev;
            this.LLILLJJLI = interfaceC1784430wXJ;
            this.LLILLL = obj2;
            this.LLILZ = j;
            this.LLILZIL = i;
            this.LLILZLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SharePropagationCacheManager@7b32.read$1");
                return objLJFF;
            }
        }
        try {
            C1784440wXK.LIZ.getClass();
            boolean zLIZIZ = C1784440wXK.LIZIZ(interfaceC1784430wXJ);
            List listLJ = C1784440wXK.LJ(j, C1784440wXK.LJFF());
            if (listLJ.size() != C1784440wXK.LIZLLL.size()) {
                C1784440wXK.LIZLLL = C1784440wXK.LIZLLL(listLJ);
            }
            Iterator it2 = listLJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C1784480wXO c1784480wXO = (C1784480wXO) next;
                    if (!Intrinsics.LJFF(c1784480wXO.LIZ, obj2) || c1784480wXO.LIZIZ != i) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1784480wXO c1784480wXO2 = (C1784480wXO) next;
            if (!zLIZIZ) {
                z2 = false;
            }
            C1154330g91 c1154330g91 = new C1154330g91(c1784480wXO2, z2);
            c1dev.LIZIZ(null);
            C1C7U.LIZIZ("SharePropagationCacheManager@7b32.read$1");
            return c1154330g91;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1154330g91> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
