package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.geckox.interceptors.zstd.ZstdDecompressManager$getOrRunPipelineAsync$2", f = "ZstdDecompressManager.kt", l = {92}, m = "invokeSuspend")
public final class C2365209Oo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ UpdatePackage LLILLL;
    public final /* synthetic */ C259800zU<AnonymousClass0957<String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2365209Oo(String str, UpdatePackage updatePackage, C259800zU<AnonymousClass0957<String>> c259800zU, InterfaceC1364105Vn<? super C2365209Oo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = updatePackage;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2365209Oo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ZstdDecompressManager@eb87.getOrRunPipelineAsync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Pipeline execution started for: ");
                sbLIZ.append(this.LLILLJJLI);
                C1553130qWF.LIZ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ));
                C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                UpdatePackage updatePackage = this.LLILLL;
                this.LL = 1;
                c1551980qUO.getClass();
                obj = C1551980qUO.LIZJ(updatePackage, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ZstdDecompressManager@eb87.getOrRunPipelineAsync$2");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            ConcurrentHashMap<String, AnonymousClass0957<String>> concurrentHashMap = C1551980qUO.LIZJ;
            String str2 = this.LLILLJJLI;
            AnonymousClass0957<String> anonymousClass0957 = this.LLILZ.element;
            if (anonymousClass0957 != null) {
                obj2 = anonymousClass0957;
            }
            concurrentHashMap.remove(str2, obj2);
            obj2 = str;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Pipeline execution failed with exception for: ");
                sbLIZ2.append(this.LLILLJJLI);
                C1553130qWF.LIZJ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ2), th);
                ConcurrentHashMap<String, AnonymousClass0957<String>> concurrentHashMap2 = C1551980qUO.LIZJ;
                String str3 = this.LLILLJJLI;
                AnonymousClass0957<String> anonymousClass09572 = this.LLILZ.element;
                if (anonymousClass09572 == null) {
                    anonymousClass09572 = null;
                }
                concurrentHashMap2.remove(str3, anonymousClass09572);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                ConcurrentHashMap<String, AnonymousClass0957<String>> concurrentHashMap3 = C1551980qUO.LIZJ;
                String str4 = this.LLILLJJLI;
                AnonymousClass0957<String> anonymousClass09573 = this.LLILZ.element;
                if (anonymousClass09573 != null) {
                    obj2 = anonymousClass09573;
                }
                concurrentHashMap3.remove(str4, obj2);
                throw th2;
            }
        }
        C1C7U.LIZIZ("ZstdDecompressManager@eb87.getOrRunPipelineAsync$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
