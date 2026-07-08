package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339270DRt implements InterfaceC1360805Ug {
    public final /* synthetic */ TakoBaseFragment LL;

    @Override // X.InterfaceC1360805Ug
    public final void i5() {
        this.LL.cS().vQ2();
    }

    public C339270DRt(TakoBaseFragment takoBaseFragment) {
        this.LL = takoBaseFragment;
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit Xc(C1845270y7R c1845270y7R) {
        String strValueOf;
        String str = c1845270y7R.videoUrl;
        if (str == null) {
            return Unit.LIZ;
        }
        String str2 = c1845270y7R.fileHash;
        if (str2 != null && C123100dR.LIZ(str2)) {
            strValueOf = c1845270y7R.fileHash;
        } else {
            strValueOf = String.valueOf(str.hashCode());
        }
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, c1845270y7R.params, "post", "video_generation", null, c1845270y7R.msgId, null, 104);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DQ6(this.LL, strValueOf, str, c1845270y7R, null), 2);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1360805Ug
    public final void nG(String str) {
        C1679860toe state = this.LL.cS().getState();
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, state.LLILZLL, str, state.LLIZ, null, state.LLILLL, null, 104);
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit zq(C1845270y7R c1845270y7R) {
        int i;
        Integer numLJ;
        String strValueOf;
        View view = this.LL.LLJJIII;
        if (view == null) {
            return Unit.LIZ;
        }
        Context context = view.getContext();
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            i = 2131822519;
        } else {
            i = 2131837962;
        }
        if (C07QI.LIZ()) {
            numLJ = C2286608xc.LJ(R.raw.icon_exclamation_mark_circle_fill);
        } else {
            numLJ = null;
        }
        if (!C12FQ.LIZJ(context, view, numLJ, i)) {
            return Unit.LIZ;
        }
        String str = c1845270y7R.videoUrl;
        if (str == null) {
            return Unit.LIZ;
        }
        String str2 = c1845270y7R.fileHash;
        if (str2 != null && C123100dR.LIZ(str2)) {
            strValueOf = c1845270y7R.fileHash;
        } else {
            strValueOf = String.valueOf(str.hashCode());
        }
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, c1845270y7R.params, "save", "video_generation", null, c1845270y7R.msgId, null, 104);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DQ9(view, c1845270y7R, strValueOf, str, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:53:0x0150, B:54:0x0153, B:57:0x0180, B:61:0x018a, B:36:0x00da, B:37:0x00dd, B:39:0x00fe, B:49:0x0132, B:31:0x00af, B:33:0x00d4), top: B:66:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132 A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:53:0x0150, B:54:0x0153, B:57:0x0180, B:61:0x018a, B:36:0x00da, B:37:0x00dd, B:39:0x00fe, B:49:0x0132, B:31:0x00af, B:33:0x00d4), top: B:66:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    @Override // X.InterfaceC1360805Ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qf(com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem.Image r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339270DRt.qf(com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1360805Ug
    public final Object sD(List<String> list, String str, Map<String, String> map, boolean z, List<String> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        View view = this.LL.getView();
        if (view == null) {
            return Unit.LIZ;
        }
        Object objLIZIZ = C12FK.LIZIZ(view, list, str, map, z, list2, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
