package Y;

import X.AbstractC1387200mCc;
import X.C089N;
import X.C09JN;
import X.C1335390kr3;
import X.C13WZ;
import X.C1C7U;
import X.C202094145s;
import X.C2188811AlT;
import X.C823050WQl;
import X.EnumC1335420kr6;
import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS80S1000000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AfS164S0200000_30 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS164S0200000_30 afS164S0200000_30, Object obj) {
        String str;
        C13WZ c13wz = (C13WZ) afS164S0200000_30.l0;
        Intent intent = (Intent) afS164S0200000_30.l1;
        AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
        c13wz.getClass();
        C1C7U.LIZ("ColdBootFullLogger@bb73.setupApplication$1L");
        if (!c13wz.LIZLLL("resume")) {
            C1C7U.LIZIZ("ColdBootFullLogger@bb73.setupApplication$1L");
            return;
        }
        c13wz.LJIIJJI(3);
        String simpleName = null;
        if (abstractC1387200mCc.LIZIZ() instanceof Activity) {
            String shortClassName = abstractC1387200mCc.LIZIZ().getComponentName().getShortClassName();
            if (abstractC1387200mCc.LIZLLL() != null) {
                simpleName = abstractC1387200mCc.LIZLLL().getClass().getSimpleName();
            }
            str = simpleName;
            simpleName = shortClassName;
        } else {
            str = null;
        }
        C13WZ c13wz2 = C089N.LIZ;
        if (c13wz2.LJIIL == null && c13wz2.LJIILIIL == null) {
            c13wz2.LJIIL = simpleName;
            c13wz2.LJIILIIL = str;
            if (c13wz2.LJIIIZ() && c13wz2.LJFF && c13wz2.LIZJ.compareAndSet(false, true)) {
                C823050WQl.LJ().schedule(new ARunnableS15S0100100_9(SystemClock.uptimeMillis() - C202094145s.LJII, c13wz2, 1), 5L, TimeUnit.SECONDS);
            }
        }
        if (intent != null && intent.getAction() != null && intent.getComponent() != null && simpleName != null) {
            HashMap map = new HashMap();
            map.put("instantiate_type", c13wz.LJIILLIIL);
            map.put("instantiate_receiver", c13wz.LJIJI);
            map.put("instantiate_service", c13wz.LJIJ);
            map.put("instantiate_activity", c13wz.LJIIZILJ);
            map.put("landing_component", simpleName);
            map.put("landing_fragment", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(intent.getAction());
            sbLIZ.append("_");
            sbLIZ.append(intent.getComponent().getShortClassName());
            sbLIZ.append("_");
            sbLIZ.append(simpleName);
            sbLIZ.append("_");
            sbLIZ.append(str);
            map.put("launch_intent_action_component_landing_combo", C2188811AlT.LIZIZ(sbLIZ));
            c13wz.LJIILIIL(map);
        }
        C1C7U.LIZIZ("ColdBootFullLogger@bb73.setupApplication$1L");
    }

    public static final void accept$1(AfS164S0200000_30 afS164S0200000_30, Object obj) {
        C1C7U.LIZ("DiskManagerSettingsVM@985e.showModuleSize$2");
        String str = (String) obj;
        int i = C1335390kr3.LIZ[((EnumC1335420kr6) afS164S0200000_30.l0).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((DiskManagerSettingsVM) afS164S0200000_30.l1).setState(new AwS80S1000000_30(str, 12));
                }
            } else {
                ((DiskManagerSettingsVM) afS164S0200000_30.l1).setState(new AwS80S1000000_30(str, 11));
            }
        } else {
            ((DiskManagerSettingsVM) afS164S0200000_30.l1).setState(new AwS80S1000000_30(str, 10));
        }
        C1C7U.LIZIZ("DiskManagerSettingsVM@985e.showModuleSize$2");
    }

    public AfS164S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
