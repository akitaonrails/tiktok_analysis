package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193970hAx implements InterfaceC1191270h6b {
    public int LL;
    public Function0<Unit> LLILLJJLI;

    @Override // X.InterfaceC1191270h6b
    public final int LJIIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1191270h6b
    public final void LJIIJJI(C1447970nmd c1447970nmd) {
        this.LLILLJJLI = c1447970nmd;
        C1205320hTG.LIZIZ.LIZJ("PoiCreate", "doAfterPoiPublishToastFinish");
    }

    @Override // X.InterfaceC1191270h6b
    public final void LJIIJ(C19EG c19eg, AbstractC1387200mCc abstractC1387200mCc, PoiData poiData, String str, String str2) {
        C1389890mGx c1389890mGx;
        View viewLJI;
        String string;
        if (poiData == null) {
            this.LL = 2;
            return;
        }
        this.LL = 1;
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJ()) {
            Fragment fragmentLIZLLL = abstractC1387200mCc.LIZLLL();
            if ((fragmentLIZLLL == null || (viewLJI = fragmentLIZLLL.getView()) == null) && (viewLJI = abstractC1387200mCc.LJI()) == null) {
                return;
            }
            Resources resources = viewLJI.getContext().getResources();
            if (resources != null) {
                string = resources.getString(2131844768);
            } else {
                string = null;
            }
            c1389890mGx = new C1389890mGx(viewLJI);
            c1389890mGx.LJIIJ(string);
        } else {
            String string2 = c19eg.getString(2131844768);
            c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(string2);
        }
        c1389890mGx.LIZJ(new AwS562S0100000_18(this, 2566));
        this.LL = 3;
        c1389890mGx.LJ(Integer.valueOf(R.style.y0));
        c1389890mGx.LJIIJJI();
    }
}
