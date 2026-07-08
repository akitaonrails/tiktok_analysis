package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0oGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466580oGe extends C19IN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1466580oGe c1466580oGe, View view) {
        C1425870nCz c1425870nCz = (C1425870nCz) c1466580oGe.l0;
        Context context = ((C1425890nD1) c1466580oGe.l1).itemView.getContext();
        c1425870nCz.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131847151);
        c1397580mTM.LIZ(2131847138);
        C985403tE.LIZ(c1397580mTM, new AwS601S0100000_22(c1425870nCz, 648));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void LIZ$1(C1466580oGe c1466580oGe, View view) {
        Function1<? super C1419590n2r, Unit> function1 = ((C1425080nBi) c1466580oGe.l0).LLJJJIL;
        if (function1 != null) {
            function1.invoke((C1419590n2r) c1466580oGe.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466580oGe(C1425870nCz c1425870nCz, C1425890nD1 c1425890nD1, int i) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        this.l0 = c1425870nCz;
        this.l1 = c1425890nD1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466580oGe(C1425080nBi c1425080nBi, C1419590n2r c1419590n2r, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = c1425080nBi;
        this.l1 = c1419590n2r;
    }
}
