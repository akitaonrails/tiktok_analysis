package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.user.NimbleUserAssem;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.IImageLandingPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.video.singlevideo.TakoSingleVideoAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoItemCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R46, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R46 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            default:
                return false;
        }
    }

    public C0R46(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(C0R46 c0r46, View view) {
        INimbleUserDependAbility iNimbleUserDependAbilityTp = ((NimbleUserAssem) c0r46.l0).tp();
        if (iNimbleUserDependAbilityTp != null) {
            iNimbleUserDependAbilityTp.Gt();
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$1(C0R46 c0r46, View view) {
        ((Function0) c0r46.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$2(C0R46 c0r46, View view) {
        IImageLandingPageAbility iImageLandingPageAbility = (IImageLandingPageAbility) ((ImageLandingItemBaseAssem) c0r46.l0).LLJJLIIIJLLLLLLLZ.getValue();
        if (iImageLandingPageAbility != null) {
            iImageLandingPageAbility.ux2(((C0Q09) C631370Opb.LIZ((ImageLandingItemBaseAssem) c0r46.l0)).getImageData());
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$3(C0R46 c0r46, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((TakoSingleVideoAssem) c0r46.l0).LLJLILLLLZIIL.getValue();
        if (takoCardAbility != null && (viewGroupY4 = takoCardAbility.Y4()) != null && viewGroupY4.performLongClick()) {
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$4(C0R46 c0r46, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbilityUp = ((TakoUserAssem) c0r46.l0).up();
        if (takoCardAbilityUp != null && (viewGroupY4 = takoCardAbilityUp.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$5(C0R46 c0r46, View view) throws Throwable {
        C669110QMj c669110QMj = (C669110QMj) c0r46.l0;
        C0QN6 c0qn6 = c669110QMj.LLILLL;
        if (c0qn6 != null) {
            SearchSugEntity searchSugEntity = c669110QMj.LLIZ;
            C669210QMt c669210QMt = (C669210QMt) c0qn6;
            c669210QMt.LIZ.LLLI(c669110QMj.LLIZLLLIL, searchSugEntity, "enrich_sug", "Tako", null);
            c669210QMt.LIZ.notifyDataSetChanged();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$6(C0R46 c0r46, View view) {
        ViewGroup viewGroupY4;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZIZ()) {
            view.setHapticFeedbackEnabled(false);
        }
        TakoCardAbility takoCardAbilityP5 = ((TakoVideoItemCell) c0r46.l0).P5();
        if (takoCardAbilityP5 != null && (viewGroupY4 = takoCardAbilityP5.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }
}
