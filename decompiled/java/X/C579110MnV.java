package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lnn.q;

/* JADX INFO: renamed from: X.0MnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579110MnV extends C09AY implements Function1<Effect, Unit> {
    public final /* synthetic */ q LL;
    public final /* synthetic */ InterfaceC1648020szI LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C579110MnV(q qVar, InterfaceC1648020szI interfaceC1648020szI, String str, boolean z, boolean z2, String str2) {
        super(1);
        this.LL = qVar;
        this.LLILLJJLI = interfaceC1648020szI;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Effect effect) {
        String str;
        String strDefaultBottomTab;
        C1653330t7r currentBottomTabItemBeforeOnTabChanged;
        Effect effect2 = effect;
        this.LL.C0().LJJJJI(new C1629220sUy(Collections.singletonList(effect2), C1625940sPg.LIZLLL(this.LL.C0()), 0, 56));
        this.LL.C0().LJJIIJZLJL(true);
        InterfaceC1625410sOp interfaceC1625410sOpW4 = this.LL.w4();
        EnumC1448980noG enumC1448980noG = EnumC1448980noG.AUTO_SELECT;
        Bundle bundle = new Bundle();
        String str2 = this.LLILLL;
        InterfaceC1648020szI interfaceC1648020szI = this.LLILLJJLI;
        boolean z = this.LLILZ;
        boolean z2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        bundle.putBoolean("start_scan_face_immediately", true);
        C786410Ut5.LJJIZ(bundle, "start_scan_face_entry", C0MJE.START_SCAN_FACE_ENTRY_AIME_TAB);
        C786410Ut5.LJJJI("scan_face_entry_source_style_id", str2, bundle);
        if (interfaceC1648020szI != null && (currentBottomTabItemBeforeOnTabChanged = interfaceC1648020szI.getCurrentBottomTabItemBeforeOnTabChanged()) != null) {
            str = currentBottomTabItemBeforeOnTabChanged.LIZIZ;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("scan_face_previous_tab_switch_tag", str, bundle);
        bundle.putBoolean("is_from_editor_tab", z);
        bundle.putBoolean("arg_is_editor_pro_outlinker", z2);
        C786410Ut5.LJJJI("arg_editor_pro_outlinker", str3, bundle);
        interfaceC1625410sOpW4.LIZJ(C1622820sKe.LIZIZ(effect2, 1, enumC1448980noG, null, bundle, null, null, 0, false, null, null, 996));
        InterfaceC1648020szI interfaceC1648020szI2 = this.LLILLJJLI;
        if (interfaceC1648020szI2 != null && (strDefaultBottomTab = interfaceC1648020szI2.defaultBottomTab()) != null) {
            interfaceC1648020szI2.setCurrentTab(strDefaultBottomTab, false, 0, false);
        }
        return Unit.LIZ;
    }
}
