package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;

/* JADX INFO: renamed from: X.0sHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620860sHU implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C1620860sHU c1620860sHU) {
        String str;
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1400330mXn c1400330mXn = C1400330mXn.LIZ;
        C19EG c19eg = (C19EG) c1620860sHU.l0;
        String strBQ2 = Hox.LLJILJIL.LIZ(c19eg).BQ2();
        c1400330mXn.getClass();
        String strLJIIJ = C1400330mXn.LJIIJ(c19eg, strBQ2, null);
        C1587060rOy c1587060rOy = ((C1587020rOu) c1620860sHU.l1).LLILZIL;
        if (c1587060rOy != null) {
            str = c1587060rOy.LIZ;
        } else {
            str = null;
        }
        c1587170rP9.getClass();
        C1587170rP9.LJIIIIZZ(strLJIIJ, str);
    }

    public static final void run$1(C1620860sHU c1620860sHU) {
        ((InboxSkylightWidgetV2) c1620860sHU.l0).LLJJJ = false;
        ((SkylightListViewModel) c1620860sHU.l1).HQ2(false);
    }

    public C1620860sHU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
