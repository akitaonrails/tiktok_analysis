package X;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888580zFI {
    public final C19YU LIZ;
    public final List<BadgeIconTab> LIZIZ = new ArrayList();
    public int LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    public final void LIZ(C1888650zFP c1888650zFP) {
        if (c1888650zFP != null) {
            View view = c1888650zFP.LJ;
            if (view != null) {
                view.setBackgroundResource(R.drawable.e8y);
            }
            int i = c1888650zFP.LIZLLL;
            if (i >= 0 && i < ((ArrayList) this.LIZIZ).size()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_keyboard_show");
                Map<String, ? extends Object> map = this.LIZLLL;
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
                    }
                }
                c474500IjALIZ.LJJII(Long.valueOf(((BadgeIconTab) ListProtector.get(this.LIZIZ, i)).tabId), "tab");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public C1888580zFI(C19YU c19yu, InterfaceC1888610zFL interfaceC1888610zFL) {
        this.LIZ = c19yu;
        c19yu.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0zFJ
            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
                this.LIZ.getClass();
                View view = c1888650zFP.LJ;
                if (view != null) {
                    view.setBackground(null);
                }
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                int i;
                this.LIZ.LIZ(c1888650zFP);
                C1888580zFI c1888580zFI = this.LIZ;
                if (c1888650zFP != null) {
                    i = c1888650zFP.LIZLLL;
                } else {
                    i = -1;
                }
                c1888580zFI.LIZJ = i;
            }
        });
    }
}
