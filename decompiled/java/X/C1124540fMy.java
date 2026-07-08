package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import avg.f;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0fMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124540fMy extends FrameLayout implements C0T8B {
    public final TextView LL;
    public final ImageView LLILLJJLI;
    public long LLILLL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        int i;
        Boolean boolValueOf;
        List<S> list;
        TaskManagerV2 taskManagerV2KE0 = ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).KE0();
        List<Long> listLJII = taskManagerV2KE0.LJII();
        boolean z = true;
        if ((listLJII.isEmpty() || !listLJII.contains(6890L)) && taskManagerV2KE0.LJIIL()) {
            i = 2131853065;
        } else {
            C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(106);
            if (c1134410fctLJI == null || (list = c1134410fctLJI.LJ) == 0) {
                boolValueOf = null;
            } else if (list.isEmpty()) {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                for (S s : list) {
                    if (((TaskInfo) s.LIZ).taskType == 101 && s.LIZJ() == EnumC1134460fcy.TASK_IN_PROGRESS) {
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
            i = C500260Jjc.LJJJI(boolValueOf) ? 2131856493 : 2131850983;
        }
        this.LL.setText(C497740JfY.LJIJI(i));
        this.LLILLJJLI.setBackground(new TuxIconDrawable(getContext(), R.drawable.eil));
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 44);
        if (C1848410yCV.LIZ) {
            aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
        }
        a aVar = new a(aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[PHI: r3
      0x001d: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String) binds: [B:18:0x004e, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.model.message.common.Text r7) {
        /*
            r6 = this;
            android.widget.TextView r5 = r6.LL
            r2 = 0
            r4 = 0
            if (r7 == 0) goto L50
            java.lang.String r1 = r7.key
            if (r1 == 0) goto L4c
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r3 = X.C1124870fNV.LIZIZ(r1)
            if (r3 == 0) goto L4c
            int r0 = r3.length()
            if (r0 <= 0) goto L4c
        L1d:
            java.lang.String r1 = "s_num"
            java.lang.String r0 = "0:string"
            java.lang.String r2 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)
            int r0 = r3.length()
            if (r0 <= 0) goto L50
            android.text.Spannable r1 = X.C1133830fbx.LJIILJJIL(r3, r7, r4)
            android.text.Spannable r0 = X.C1133830fbx.LIZ
            if (r1 == r0) goto L50
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r2, r7, r4)
        L37:
            r5.setText(r0)
            android.widget.ImageView r3 = r6.LLILLJJLI
            com.bytedance.tux.drawable.TuxIconDrawable r2 = new com.bytedance.tux.drawable.TuxIconDrawable
            android.content.Context r1 = r6.getContext()
            r0 = 2130975677(0x7f041bbd, float:1.7560212E38)
            r2.<init>(r1, r0)
            r3.setBackground(r2)
            return
        L4c:
            java.lang.String r3 = r7.defaultPattern
            if (r3 != 0) goto L1d
        L50:
            java.lang.String r0 = ""
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124540fMy.LIZIZ(com.bytedance.android.livesdk.model.message.common.Text):void");
    }

    public C1124540fMy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.hzf, this);
        this.LL = (TextView) findViewById(R.id.iz3);
        this.LLILLJJLI = (ImageView) findViewById(R.id.iz2);
        findViewById(R.id.iz1);
    }

    public final void LIZ(long j, String str) {
        int i;
        this.LLILLL = j;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP != null) {
            i = c1094360eaIHP.LIZ;
        } else {
            i = 0;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        if (Intrinsics.LJFF(str, "show")) {
            C1123800fLm.LIZLLL(j, Boolean.valueOf(zLJIIJJI), Integer.valueOf(i), "first_recharge");
        } else {
            if (!Intrinsics.LJFF(str, "click")) {
                return;
            }
            C1123800fLm.LIZJ(j, Boolean.valueOf(zLJIIJJI), Integer.valueOf(i), "first_recharge");
        }
    }
}
