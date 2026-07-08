package Y;

import X.AbstractC1585810rMx;
import X.C1890290zI3;
import X.C786410Ut5;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFanPrivilegeContentAssem;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui.ProfileEditPronounsSearchAndDisplayAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public class AsS54S0100000_28 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
            case 3:
            case 4:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS54S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i) {
        if (i == 1) {
            KeyboardUtils.LIZIZ(((ProfileEditPronounsSearchAndDisplayAssem) asS54S0100000_28.l0).dp());
        }
    }

    public static final void LJJIIJ$1(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i) {
        if (i != 0) {
            KeyboardUtils.LIZIZ(((GeoFencingSelectionActivity) asS54S0100000_28.l0).LLLZIL());
        }
    }

    public static final void LJJIIJ$2(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i) {
        if (i != 0) {
            KeyboardUtils.LIZIZ(((GeoFencingSelectionFragment) asS54S0100000_28.l0).UR());
        }
    }

    public static final void LJJIIZI$0(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        if (linearLayoutManager.findFirstVisibleItemPosition() > 0) {
            C786410Ut5.T4(((CreatorToolsActivity) asS54S0100000_28.l0).LLLLZI().findViewById(R.id.p1i), 1.0f);
        } else {
            C786410Ut5.T4(((CreatorToolsActivity) asS54S0100000_28.l0).LLLLZI().findViewById(R.id.p1i), 0.0f);
        }
    }

    public static final void LJJIIZI$1(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            C1890290zI3 c1890290zI3 = (C1890290zI3) asS54S0100000_28.l0;
            int itemCount = linearLayoutManager.getItemCount();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (itemCount > 10 && iFindLastVisibleItemPosition >= itemCount - 10 && !c1890290zI3.LLILLL) {
                c1890290zI3.LLILLL = true;
                c1890290zI3.LLILLJJLI.LIZIZ();
            }
        }
    }

    public static final void LJJIIZI$2(AsS54S0100000_28 asS54S0100000_28, RecyclerView recyclerView, int i, int i2) {
        ((SuperFanPrivilegeContentAssem) asS54S0100000_28.l0).kp();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$3(Y.AsS54S0100000_28 r5, androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            java.lang.Object r0 = r5.l0
            X.10gZ r0 = (X.AbstractC19309710gZ) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.LIZIZ()
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto L5c
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.l0
            X.10gZ r0 = (X.AbstractC19309710gZ) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.LIZIZ()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.getChildViewHolder(r1)
            boolean r3 = r4 instanceof X.C19310610gi
            if (r3 == 0) goto L5c
            X.10gi r4 = (X.C19310610gi) r4
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L76
            android.view.View r0 = r4.LL
            int r2 = r0.getTop()
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            int r1 = r0.getTop()
            if (r2 < 0) goto L5d
            r1 = 0
        L3e:
            java.lang.Object r0 = r5.l0
            X.10gZ r0 = (X.AbstractC19309710gZ) r0
            X.01GW r0 = r0.LJFF
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C786410Ut5.S4(r1, r0)
            java.lang.Object r0 = r5.l0
            X.10gZ r0 = (X.AbstractC19309710gZ) r0
            X.01GW r0 = r0.LJI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C786410Ut5.T4(r0, r1)
        L5c:
            return
        L5d:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            int r0 = r0.getHeight()
            int r0 = r0 + r1
            int r0 = -r0
            if (r2 <= r0) goto L76
            int r0 = java.lang.Math.abs(r2)
            int r0 = r0 - r1
            float r1 = (float) r0
            com.bytedance.tux.input.TuxTextView r0 = r4.LLILLJJLI
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L3e
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L5c
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS54S0100000_28.LJJIIZI$3(Y.AsS54S0100000_28, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
