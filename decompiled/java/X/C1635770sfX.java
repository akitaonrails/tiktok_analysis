package X;

import Y.ACListenerS159S0100000_25;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1635770sfX implements InterfaceC1635690sfP<C1642680sqg, Fragment> {
    @Override // X.InterfaceC1635690sfP
    public final List<Integer> LIZ() {
        return C1641140soC.LIZLLL();
    }

    @Override // X.InterfaceC1635690sfP
    public InterfaceC1631590sYn<Fragment> LIZJ(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        StickerCategoryFragment stickerCategoryFragment = new StickerCategoryFragment();
        stickerCategoryFragment.cS(i, c1630880sXe, c1631250sYF, recycledViewPool);
        return stickerCategoryFragment;
    }

    @Override // X.InterfaceC1635690sfP
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public C1642680sqg LIZIZ(C19EG c19eg, EffectCategoryModel effectCategoryModel, C19YA c19ya, C1630880sXe c1630880sXe, Function0<Unit> function0) {
        boolean zOptBoolean;
        List<String> urlList;
        C1642680sqg c1642680sqgLIZJ = C1641140soC.LIZJ(c19eg, c1630880sXe.LIZ.LJJLIIIJJIZ().LJIILJJIL);
        String extra = effectCategoryModel.getExtra();
        if (extra != null && !a0.LJJJIL(extra)) {
            zOptBoolean = new JSONObject(extra).optBoolean("is_show_icon_only");
        } else {
            zOptBoolean = false;
        }
        UrlModel icon_selected = effectCategoryModel.getIcon_selected();
        if (icon_selected != null) {
            urlList = icon_selected.getUrlList();
        } else {
            urlList = null;
        }
        if (!C2401009ay.LIZ(urlList)) {
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(urlList);
            c1642680sqgLIZJ.setImage(urlModel);
        } else {
            c1642680sqgLIZJ.setImageVisibility(false);
        }
        if (zOptBoolean) {
            c1642680sqgLIZJ.setTextVisibility(false);
        } else {
            c1642680sqgLIZJ.setText(effectCategoryModel.getName());
        }
        C786410Ut5.ab(c1642680sqgLIZJ, new ACListenerS159S0100000_25((AwS147S0201000_25) function0, 83));
        return c1642680sqgLIZJ;
    }
}
