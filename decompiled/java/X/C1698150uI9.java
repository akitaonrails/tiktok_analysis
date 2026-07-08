package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0uI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698150uI9 implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            case 2:
                return (T) create$2(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1698150uI9(Object obj, JediViewModel<? extends UiState> jediViewModel) {
        this.$t = jediViewModel;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C1698150uI9 c1698150uI9, Class cls) {
        OptionCategoryPanelFragment optionCategoryPanelFragment = (OptionCategoryPanelFragment) c1698150uI9.l0;
        Effect effect = optionCategoryPanelFragment.LLJ;
        C1643270srd c1643270srd = null;
        if (effect == null) {
            effect = null;
        }
        Effect effect2 = optionCategoryPanelFragment.LLJI;
        String str = optionCategoryPanelFragment.LLJIJIL;
        C19EG c19egRequireActivity = optionCategoryPanelFragment.requireActivity();
        C1643270srd c1643270srd2 = ((OptionCategoryPanelFragment) c1698150uI9.l0).LLILZLL;
        if (c1643270srd2 != null) {
            c1643270srd = c1643270srd2;
        }
        return new OptionCategoryPanelViewModel(effect, effect2, str, c19egRequireActivity, c1643270srd);
    }

    public static final ViewModel create$1(C1698150uI9 c1698150uI9, Class cls) {
        C19EG c19egRequireActivity = ((OptionCategoryFragment) c1698150uI9.l0).requireActivity();
        OptionCategoryFragment optionCategoryFragment = (OptionCategoryFragment) c1698150uI9.l0;
        return new OptionCategoryViewModel(c19egRequireActivity, optionCategoryFragment.LLILLJJLI, optionCategoryFragment.LLILLL, optionCategoryFragment.LLILZ, optionCategoryFragment.LLILZIL);
    }

    public static final ViewModel create$2(C1698150uI9 c1698150uI9, Class cls) {
        JediViewModel jediViewModel = (JediViewModel) c1698150uI9.l0;
        jediViewModel.JQ2(AFwS266S0000000_25.get$arr$(558));
        return jediViewModel;
    }
}
