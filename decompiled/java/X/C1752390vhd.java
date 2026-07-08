package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752390vhd extends AbstractC1751430vg5 {
    public final ECBaseFragment LL;
    public final SeaPdpViewModel LLILLJJLI;
    public final String LLILLL;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:49)(1:8)|9|(1:48)(1:13)|14|(3:40|(1:46)|47)(3:18|(1:20)|21)|22|(1:38)(14:26|(0)(1:30)|31|(1:33)(1:37)|34|(1:36)(1:50)|75|51|(1:59)(1:55)|56|(2:58|60)|61|64|(1:78)(4:68|(1:70)|71|(2:73|74)(1:79)))|39|31|(0)(0)|34|(0)(0)|75|51|(5:53|59|56|(0)|61)(0)|64|(2:66|78)(1:77)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7 A[Catch: s -> 0x01d8, TryCatch #0 {s -> 0x01d8, blocks: (B:51:0x0188, B:53:0x0197, B:55:0x019b, B:56:0x01be, B:61:0x01d3, B:59:0x01c7), top: B:75:0x0188 }] */
    @Override // X.AbstractC1751430vg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r20, int r21) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1752390vhd.I5(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1752390vhd(ViewGroup viewGroup, SeaPdpViewModel seaPdpViewModel, String str, ECBaseFragment eCBaseFragment) {
        final Context context = viewGroup.getContext();
        super(new FrameLayout(context) { // from class: X.0c03
            public static final /* synthetic */ int LL = 0;

            {
                super(context, null, 0);
                C1755600vmo.LIZ.getClass();
                C1755600vmo.LIZ(R.layout.axm, context, this, true, true);
            }
        });
        this.LL = eCBaseFragment;
        this.LLILLJJLI = seaPdpViewModel;
        this.LLILLL = str;
    }
}
