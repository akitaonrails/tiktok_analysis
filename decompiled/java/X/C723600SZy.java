package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723600SZy extends C09AY implements Function0<Object> {
    public final /* synthetic */ AssemViewModel<Object> LL;
    public final /* synthetic */ Class<Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723600SZy(AssemViewModel<Object> assemViewModel, Class<Object> cls, String str) {
        super(0);
        this.LL = assemViewModel;
        this.LLILLJJLI = cls;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC665370Q7z interfaceC665370Q7zInvoke;
        C723710Sa9 c723710Sa9;
        InterfaceC111300bX interfaceC111300bX;
        if (C725080ScM.LJIIJ) {
            Function0<InterfaceC665370Q7z> hierarchyDataVScopeProducer = this.LL.getHierarchyDataVScopeProducer();
            if (hierarchyDataVScopeProducer != null && (interfaceC665370Q7zInvoke = hierarchyDataVScopeProducer.invoke()) != null) {
                String strLIZ = C211200re.LIZ(this.LLILLJJLI, this.LLILLL);
                if (strLIZ == null) {
                    strLIZ = "source_default_key";
                }
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zInvoke, strLIZ, C723710Sa9.class, null);
                if (interfaceC1555100qZQLIZIZ != null && (c723710Sa9 = (C723710Sa9) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC111300bX = c723710Sa9.LL) != null) {
                    return interfaceC111300bX;
                }
            }
        } else {
            C0RTY c0rty = this.LL.hierarchyDataStore;
            if (c0rty != null) {
                return c0rty.LIZJ(this.LLILLJJLI, this.LLILLL);
            }
        }
        return null;
    }
}
