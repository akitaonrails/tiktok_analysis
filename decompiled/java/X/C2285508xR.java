package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieLogicExt$compressMetaList$2$tasks$1$1", f = "SmartMovieLogicExt.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 201}, m = "invokeSuspend")
public final class C2285508xR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public InterfaceC1337805Lk LL;
    public MetaExt LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ InterfaceC1337805Lk LLIZ;
    public final /* synthetic */ MetaExt LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2285508xR(InterfaceC1337805Lk interfaceC1337805Lk, MetaExt metaExt, String str, boolean z, InterfaceC1364105Vn<? super C2285508xR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1337805Lk;
        this.LLIZLLLIL = metaExt;
        this.LLJ = str;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2285508xR c2285508xR = new C2285508xR(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c2285508xR.LLILZLL = obj;
        return c2285508xR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        InterfaceC1337805Lk interfaceC1337805Lk;
        MetaExt metaExt;
        String str;
        boolean z;
        C1C7U.LIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        boolean z2 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        interfaceC1337805Lk = (InterfaceC1337805Lk) this.LLILZLL;
                        C155000ia.LIZIZ(obj);
                        String str2 = (String) obj;
                        interfaceC1337805Lk.release();
                        C1C7U.LIZIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
                        return str2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.LLILZ;
                str = (String) this.LLILLL;
                metaExt = this.LLILLJJLI;
                interfaceC1337805Lk = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                interfaceC1337805Lk = this.LLIZ;
                metaExt = this.LLIZLLLIL;
                str = this.LLJ;
                z = this.LLJI;
                this.LLILZLL = interfaceC497601wk;
                this.LL = interfaceC1337805Lk;
                this.LLILLJJLI = metaExt;
                this.LLILLL = str;
                this.LLILZ = z;
                this.LLILZIL = 1;
                if (interfaceC1337805Lk.LIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
                    return objLJFF;
                }
            }
            if (!C2296808zG.LJI(interfaceC497601wk)) {
                interfaceC1337805Lk.release();
                C1C7U.LIZIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
                return "cancelled";
            }
            C096N c096n = C096N.LIZ;
            if (!z) {
                z2 = false;
            }
            this.LLILZLL = interfaceC1337805Lk;
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZIL = 2;
            obj = c096n.LIZ(metaExt, str, this, z2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
                return objLJFF;
            }
            String str22 = (String) obj;
            interfaceC1337805Lk.release();
            C1C7U.LIZIZ("SmartMovieLogicExt@d35.compressMetaList$2$tasks$1$1");
            return str22;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            interfaceC1337805Lk.release();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
