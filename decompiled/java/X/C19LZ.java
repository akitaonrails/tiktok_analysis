package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.myna.render.debug.panel.IMynaDebugPanel;

/* JADX INFO: renamed from: X.19LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LZ implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public C19LZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(C19LZ c19lz, View view) {
        if (((C21348618ge) c19lz.l0).LLLLILI().LIZ.LJII) {
            return true;
        }
        ((C21348618ge) c19lz.l0).getClass();
        ((C21348618ge) c19lz.l0).LLLLIL().LIZ.invoke(new C551440Ljy(EnumC240900wR.LONG_PRESS));
        return true;
    }

    public static final boolean onLongClick$1(C19LZ c19lz, View view) {
        C21325918cz c21325918cz;
        IMynaDebugPanel iMynaDebugPanel;
        AbstractC21333318eB<?> abstractC21333318eB = ((C21327718dH) c19lz.l0).LLJILLL;
        if (abstractC21333318eB != null && (c21325918cz = abstractC21333318eB.LL) != null && c21325918cz.LIZLLL() != null && (iMynaDebugPanel = (IMynaDebugPanel) PluggableExtentionKt.pluggableSpi$default(IMynaDebugPanel.class, false, false, false, 14, null)) != null) {
            iMynaDebugPanel.LIZ();
            return true;
        }
        return true;
    }
}
