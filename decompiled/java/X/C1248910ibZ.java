package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS21S1201000_19;
import kotlin.jvm.internal.AwS87S1200000_2;

/* JADX INFO: renamed from: X.0ibZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248910ibZ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ HeaderBaseContainerComponent LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1248930ibb LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ ProfileComponents LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248910ibZ(HeaderBaseContainerComponent headerBaseContainerComponent, String str, String str2, C1248930ibb c1248930ibb, int i, ProfileComponents profileComponents, C013C c013c) {
        super(1);
        this.LL = headerBaseContainerComponent;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1248930ibb;
        this.LLILZIL = i;
        this.LLILZLL = profileComponents;
        this.LLIZ = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C13IQ<? extends UIContentAssem> c13iq;
        C1248930ibb c1248930ibb;
        Assembler assembler2 = assembler;
        if (!this.LL.Vo(this.LLILLJJLI)) {
            this.LL.tp(this.LLILLL, this.LLILZ.LIZIZ);
        } else {
            this.LL.LLJILJILJ.put(this.LLILLL, Integer.valueOf(this.LLILZIL));
            if (this.LL.LLJILJIL.containsKey(this.LLILLL)) {
                String str = this.LLILLL;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("hasAssembleComponents contains ");
                            sbLIZ.append(str);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("BaseContainerComponent", strLIZIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LL.Zo(this.LLILZIL, this.LLILZLL, this.LLILLL);
            } else {
                String str2 = this.LLILLL;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("hasAssembleComponents not contains ");
                            sbLIZ2.append(str2);
                            sbLIZ2.append('!');
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log("BaseContainerComponent", strLIZIZ2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                HeaderBaseContainerComponent headerBaseContainerComponent = this.LL;
                assembler2.EQ2(headerBaseContainerComponent, new AwS21S1201000_19(this.LLILZIL, this.LLILZLL, headerBaseContainerComponent, this.LLILLL, 0));
                this.LL.LLJILJIL.put(this.LLILLL, this.LLILLJJLI);
                this.LL.sp(this.LLILLL);
                if (HeaderBaseContainerComponent.lp(this.LL, this.LLILZLL, null, 5)) {
                    c13iq = (C13IQ) ((Map) C1248890ibX.LIZ.getValue()).get(this.LLILLJJLI);
                    if (c13iq == null) {
                        c13iq = this.LLILZ.LIZIZ;
                    }
                } else if (!C1248890ibX.LIZIZ(this.LLILLL, this.LLILLJJLI) || (c1248930ibb = (C1248930ibb) ((Map) C1248890ibX.LJ.getValue()).get(this.LLILLL)) == null || (c13iq = c1248930ibb.LIZIZ) == null) {
                    c13iq = this.LLILZ.LIZIZ;
                }
                HeaderBaseContainerComponent headerBaseContainerComponent2 = this.LL;
                assembler2.QQ2(headerBaseContainerComponent2, new AwS87S1200000_2((C13IQ) c13iq, (C13IQ<? extends UIContentAssem>) this.LLILLL, (String) headerBaseContainerComponent2, (HeaderBaseContainerComponent) 4));
                this.LLIZ.element = true;
            }
        }
        return Unit.LIZ;
    }
}
