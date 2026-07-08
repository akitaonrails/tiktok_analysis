package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS143S0110000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833430xoL implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final View LIZIZ;
    public final FragmentManager LIZJ;
    public final C19319110i5 LIZLLL;
    public final C1833560xoY LJ;
    public boolean LJFF = true;
    public Boolean LJI;
    public C19292910dr LJII;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        C19319810iC c19319810iCLIZIZ;
        C19292910dr c19292910dr = this.LJII;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(435));
        }
        C19292910dr c19292910dr2 = this.LJII;
        if (c19292910dr2 == null || (c19319810iCLIZIZ = c19292910dr2.LIZIZ()) == null || !(!c19319810iCLIZIZ.LLJJIJIL)) {
            return;
        }
        LIZJ(false);
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr = this.LJII;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(436));
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        boolean z2 = !z;
        Context context = this.LIZ;
        if (context != null) {
            InterfaceC1833480xoQ recordCommentsAndGiftsGuideSheet = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getRecordCommentsAndGiftsGuideSheet();
            boolean z3 = this.LJFF;
            if (z2) {
                i = 1;
            } else {
                i = 2;
            }
            recordCommentsAndGiftsGuideSheet.LIZ(context, "setting_page", z3, i, new AwS571S0100000_27(this, 1288), new AwS143S0110000_27(this, z2, 1), new AwS143S0110000_27(this, z, 2));
        }
    }

    public C1833430xoL(Context context, View view, FragmentManager fragmentManager, C19319110i5 c19319110i5, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = fragmentManager;
        this.LIZLLL = c19319110i5;
        this.LJ = c1833560xoY;
    }
}
