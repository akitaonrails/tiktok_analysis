package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818150xPh extends C09AY implements Function2<UIAssem, C1817880xPG, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818150xPh(CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem) {
        super(2);
        this.LL = customizedBoardTitleDoneAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C1817880xPG c1817880xPG) {
        C1817880xPG c1817880xPG2 = c1817880xPG;
        if (c1817880xPG2 != null) {
            CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem = this.LL;
            InterfaceC1818210xPn interfaceC1818210xPnGo = customizedBoardTitleDoneAssem.LLJILLL;
            if (interfaceC1818210xPnGo == null) {
                synchronized (customizedBoardTitleDoneAssem) {
                    interfaceC1818210xPnGo = customizedBoardTitleDoneAssem.LLJILLL;
                    if (interfaceC1818210xPnGo == null) {
                        interfaceC1818210xPnGo = customizedBoardTitleDoneAssem.Go();
                        customizedBoardTitleDoneAssem.LLJILLL = interfaceC1818210xPnGo;
                    }
                }
            }
            interfaceC1818210xPnGo.jq(c1817880xPG2);
        }
        return Unit.LIZ;
    }
}
