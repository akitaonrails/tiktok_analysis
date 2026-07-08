package X;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339280DRu implements InterfaceC1360805Ug {
    public final /* synthetic */ TakoSharePageFragment LL;

    @Override // X.InterfaceC1360805Ug
    public final void i5() throws JSONException {
        ComposeView composeView = this.LL.LLJIJIL;
        if (composeView != null) {
            C786410Ut5.LLILZ(composeView, 8);
        }
        this.LL.SR().resetState();
    }

    public C339280DRu(TakoSharePageFragment takoSharePageFragment) {
        this.LL = takoSharePageFragment;
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit Xc(C1845270y7R c1845270y7R) {
        String strValueOf;
        String str = c1845270y7R.videoUrl;
        if (str == null) {
            return Unit.LIZ;
        }
        String str2 = c1845270y7R.fileHash;
        if (str2 != null && str2.length() > 0) {
            strValueOf = c1845270y7R.fileHash;
        } else {
            strValueOf = String.valueOf(str.hashCode());
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DQ5(this.LL, strValueOf, str, c1845270y7R, null), 2);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1360805Ug
    public final void nG(String str) {
        C1679860toe state = this.LL.SR().getState();
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, state.LLILZLL, str, state.LLIZ, null, state.LLILLL, null, 104);
    }

    @Override // X.InterfaceC1360805Ug
    public final Unit zq(C1845270y7R c1845270y7R) {
        String strValueOf;
        View view = this.LL.getView();
        if (view == null) {
            return Unit.LIZ;
        }
        if (!C12FQ.LIZJ(view.getContext(), view, C2286608xc.LJ(R.raw.icon_exclamation_mark_circle_fill), 2131822519)) {
            return Unit.LIZ;
        }
        String str = c1845270y7R.videoUrl;
        if (str == null) {
            return Unit.LIZ;
        }
        String str2 = c1845270y7R.fileHash;
        if (str2 != null && str2.length() > 0) {
            strValueOf = c1845270y7R.fileHash;
        } else {
            strValueOf = String.valueOf(str.hashCode());
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DQA(view, c1845270y7R, strValueOf, str, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:58:0x0150, B:59:0x0153, B:62:0x0180, B:66:0x018a, B:41:0x00db, B:42:0x00de, B:44:0x00fe, B:54:0x0132, B:36:0x00b0, B:38:0x00d5), top: B:71:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132 A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:58:0x0150, B:59:0x0153, B:62:0x0180, B:66:0x018a, B:41:0x00db, B:42:0x00de, B:44:0x00fe, B:54:0x0132, B:36:0x00b0, B:38:0x00d5), top: B:71:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
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
        throw new UnsupportedOperationException("Method not decompiled: X.C339280DRu.qf(com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1360805Ug
    public final Object sD(List<String> list, String str, Map<String, String> map, boolean z, List<String> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1679860toe state = this.LL.SR().getState();
        View view = this.LL.getView();
        if (view == null) {
            return Unit.LIZ;
        }
        Object objLIZIZ = C12FK.LIZIZ(view, list, state.LLILLL, state.LLILZLL, state.LLILZ, state.LLILZIL, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
