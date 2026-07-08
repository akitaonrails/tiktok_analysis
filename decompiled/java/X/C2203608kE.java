package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$getTranslateJsonObject$4", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C2203608kE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1705310uTh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203608kE(C1705310uTh c1705310uTh, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1705310uTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2203608kE(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DefaultResourceProvider@b5b8.getTranslateJsonObject$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File fileLJ = C2114508Qd.LJ(new File(this.LL), new File(""));
        Object obj2 = null;
        if (fileLJ != null && fileLJ.exists()) {
            C1705310uTh c1705310uTh = this.LLILLJJLI;
            String str = this.LL;
            try {
                String string = a0.LJLIIIL(C09BH.LJI(fileLJ, Charset.defaultCharset())).toString();
                new p();
                c098200Yq = p.LIZJ(string).LJIILIIL().LJJIJ("trans_text");
                c1705310uTh.LJ.put(str, (n) c098200Yq);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
        }
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.getTranslateJsonObject$4");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
