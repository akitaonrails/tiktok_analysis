package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.geckox.interceptors.zstd.ZstdDecompressManager$decompressAndActivateAsync$1", f = "ZstdDecompressManager.kt", l = {47}, m = "invokeSuspend")
public final class C2365309Op extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UpdatePackage LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2365309Op(UpdatePackage updatePackage, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C2365309Op> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = updatePackage;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2365309Op(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("ZstdDecompressManager@eb87.decompressAndActivateAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                UpdatePackage updatePackage = this.LLILLJJLI;
                this.LL = 1;
                c1551980qUO.getClass();
                obj = C1551980qUO.LIZIZ(updatePackage, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ZstdDecompressManager@eb87.decompressAndActivateAsync$1");
                    return objLJFF;
                }
            }
            str = (String) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Decompression activation failed for ");
            sbLIZ.append(this.LLILLJJLI.getAccessKey());
            sbLIZ.append('/');
            sbLIZ.append(this.LLILLJJLI.getChannel());
            C1553130qWF.LIZJ("gecko-debug-tag-zstd-decompress", C2188811AlT.LIZIZ(sbLIZ), e);
            str = null;
        }
        this.LLILLL.invoke(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ZstdDecompressManager@eb87.decompressAndActivateAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
