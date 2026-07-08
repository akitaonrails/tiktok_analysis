package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.ageconfirm.AgeConfirmCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AgeConfirmModule;
import kotlin.jvm.internal.AwS0S0020000_1;
import kotlin.jvm.internal.AwS28S1110000_1;

/* JADX INFO: renamed from: X.04JL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JL implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C04JL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[PHI: r2
      0x00db: PHI (r2v1 android.view.View) = (r2v0 android.view.View), (r2v3 android.view.View) binds: [B:12:0x00c4, B:17:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onCheckedChanged$0(X.C04JL r43, android.widget.CompoundButton r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04JL.onCheckedChanged$0(X.04JL, android.widget.CompoundButton, boolean):void");
    }

    public static final void onCheckedChanged$1(C04JL c04jl, CompoundButton compoundButton, boolean z) {
        String str;
        ((AgeConfirmCell) c04jl.l0).L5().setState(new AwS0S0020000_1(z, false, 0));
        AgeConfirmCell ageConfirmCell = (AgeConfirmCell) c04jl.l0;
        AgeConfirmModule ageConfirmModule = ageConfirmCell.LLJI;
        if (ageConfirmModule != null) {
            str = ageConfirmModule.daInfo;
        } else {
            str = null;
        }
        C1748720vbi.LIZLLL(ageConfirmCell.itemView, new C10516049i(), new AwS28S1110000_1(ageConfirmCell, z, str, 3));
    }
}
