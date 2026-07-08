package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451530nsN extends AbstractC1664490tPr<C1451460nsG, C1451510nsL> {
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public C426320Gne LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public C197039127h LLJLIL;
    public final String LLJLILLLLZIIL;
    public final AwS601S0100000_22 LLJLL;

    public C1451530nsN() {
        this.LLJLILLLLZIIL = a0.LJJIZ(NumberFormat.getPercentInstance().format(0L), ' ', 0, false, 6) == -1 ? "" : " ";
        this.LLJLL = new AwS601S0100000_22(this, 117);
    }

    public final void LLLLLJIL(float f) {
        C426320Gne c426320Gne = this.LLJJJJLIIL;
        if (c426320Gne != null) {
            c426320Gne.LIZ(f, false);
        }
        TuxTextView tuxTextView = this.LLJJL;
        if (tuxTextView != null) {
            tuxTextView.setText((CharSequence) this.LLJLL.invoke(Float.valueOf(f)));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nsO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1451460nsG) obj).LIZJ;
            }
        }, new AwS601S0100000_22(this, 118));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nsJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1451460nsG) obj).LIZLLL;
            }
        }, new AwS601S0100000_22(this, 119));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String title;
        String strLIZIZ;
        Asset asset;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eri, viewGroup, false);
        this.LLJJJIL = viewTd.findViewById(R.id.tqy);
        this.LLJJJJ = viewTd.findViewById(R.id.nlo);
        this.LLJJJJJIL = viewTd.findViewById(R.id.tei);
        this.LLJJJJLIIL = (C426320Gne) viewTd.findViewById(R.id.s_5);
        this.LLJJL = (TuxTextView) viewTd.findViewById(R.id.s9x);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewTd.findViewById(R.id.gwu);
        this.LLJL = (C197039127h) viewTd.findViewById(R.id.db0);
        this.LLJLIL = (C197039127h) viewTd.findViewById(R.id.teg);
        int screenHeight = (int) ((((double) ScreenUtils.getScreenHeight(this.mActivity)) * 0.4d) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
        if (screenHeight < 0) {
            screenHeight = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
        }
        View view = this.LLJJJJ;
        if (view != null) {
            C426750GoL.LJIIIZ(view, null, Integer.valueOf(screenHeight), null, null, false, 29);
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C426750GoL.LJIIIZ(view2, null, Integer.valueOf(screenHeight), null, null, false, 29);
        }
        PhotoTemplateAsset photoTemplateAsset = LLLLILI().LIZ.LIZ.creativeModel.imageEffectTemplateData.templateAsset;
        if (photoTemplateAsset == null || (asset = photoTemplateAsset.getAsset()) == null || (title = asset.getTitle()) == null) {
            title = "";
        }
        if (C444960Hcc.LIZJ(C545820Lau.LIZIZ(this))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getString(2131850047));
            sbLIZ.append(" · ");
            sbLIZ.append(title);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(title);
            sbLIZ2.append(" · ");
            sbLIZ2.append(getString(2131850047));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            C786410Ut5.I7(new C1466570oGd(this, 17, 42), c197039127h);
        }
        C197039127h c197039127h2 = this.LLJLIL;
        if (c197039127h2 != null) {
            C786410Ut5.I7(new C1466570oGd(this, 18, 42), c197039127h2);
        }
        return (ViewGroup) viewTd;
    }
}
