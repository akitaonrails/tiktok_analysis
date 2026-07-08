package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.ui.assem.ManualSwitchCreatorInboxAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06WO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06WO extends C09AY implements InterfaceC1631620sYq<UIAssem, C05RV, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ ManualSwitchCreatorInboxAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06WO(ManualSwitchCreatorInboxAssem manualSwitchCreatorInboxAssem) {
        super(3);
        this.LL = manualSwitchCreatorInboxAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C05RV c05rv, C291001Au<? extends Boolean> c291001Au) {
        int i;
        Boolean boolLIZ;
        C11GO c11go;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        Iterator it2 = ((LinkedHashMap) this.LL.LLJJIJIL).entrySet().iterator();
        while (true) {
            boolean z = true;
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            C127M accessory = ((C127K) entry.getValue()).getAccessory();
            if ((accessory instanceof AnonymousClass1278) && (c11go = (C11GO) accessory) != null) {
                if (key != c05rv) {
                    z = false;
                }
                c11go.LJIILJJIL(z);
            }
        }
        View view = (View) this.LL.LLJJIJIIJIL.getValue();
        if (C889930Yvf.LIZ.LIZJ() == c05rv) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        if (c291001Au2 != null && (boolLIZ = c291001Au2.LIZ()) != null) {
            ManualSwitchCreatorInboxAssem manualSwitchCreatorInboxAssem = this.LL;
            if (boolLIZ.booleanValue()) {
                C1389890mGx c1389890mGx = new C1389890mGx(manualSwitchCreatorInboxAssem.getContentView());
                c1389890mGx.LJIIIZ(2131836132);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.a1h);
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(manualSwitchCreatorInboxAssem.getContentView());
                c1389890mGx2.LJIIIZ(2131834217);
                c1389890mGx2.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }
}
