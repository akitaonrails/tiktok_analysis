package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814390xJd extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ DecorationDoneButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814390xJd(DecorationDoneButtonAssem decorationDoneButtonAssem) {
        super(2);
        this.LL = decorationDoneButtonAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        if (Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
            DecorationDoneButtonAssem decorationDoneButtonAssem = this.LL;
            InterfaceC1814440xJi interfaceC1814440xJiGo = decorationDoneButtonAssem.LLJILLL;
            if (interfaceC1814440xJiGo == null) {
                synchronized (decorationDoneButtonAssem) {
                    interfaceC1814440xJiGo = decorationDoneButtonAssem.LLJILLL;
                    if (interfaceC1814440xJiGo == null) {
                        interfaceC1814440xJiGo = decorationDoneButtonAssem.Go();
                        decorationDoneButtonAssem.LLJILLL = interfaceC1814440xJiGo;
                    }
                }
            }
            interfaceC1814440xJiGo.S1();
        }
        return Unit.LIZ;
    }
}
