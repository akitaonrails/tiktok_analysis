package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0S4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715420S4m extends C09AY implements Function2<TranslationStatusAssem, C291001Au<? extends Integer>, Unit> {
    public C715420S4m() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(TranslationStatusAssem translationStatusAssem, C291001Au<? extends Integer> c291001Au) {
        Object obj;
        C0S5L c0s5l;
        TranslationStatusAssem translationStatusAssem2 = translationStatusAssem;
        if (c291001Au != null) {
            translationStatusAssem2.LLLFZ = true;
            translationStatusAssem2.Up();
            String str = null;
            if (C0S58.LIZ && ((Number) C294300BgC.LIZ.getValue()).intValue() <= 0) {
                C746760TRa.LIZ().LJLIL(Boolean.FALSE, null);
                C161N.LIZIZ.LJJZ();
            }
            C724270Sb3 c724270Sb3 = translationStatusAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (translationStatusAssem2.R2(((VideoItemParams) obj).getAweme())) {
                C786410Ut5.LJLLLLLL(8, translationStatusAssem2.getContentView());
            } else {
                C786410Ut5.LJLLLLLL(0, translationStatusAssem2.getContentView());
                TranslationStatusViewModel translationStatusViewModelGp = translationStatusAssem2.Gp();
                if (translationStatusViewModelGp != null) {
                    translationStatusViewModelGp.LLILLJJLI = true;
                    C207118162y c207118162y = translationStatusViewModelGp.LL;
                    VideoItemParams item = translationStatusViewModelGp.getItem();
                    if (item != null) {
                        str = item.mEventType;
                    }
                    c207118162y.LJJII(str);
                    if (!((C0S5G) translationStatusViewModelGp.getState()).LLILZLL) {
                        translationStatusViewModelGp.withState(new C710260RtY(translationStatusViewModelGp));
                    }
                }
                C0S5P c0s5p = ((C0S5G) translationStatusAssem2.Gp().getState()).LL;
                if ((c0s5p instanceof C0S5L) && (c0s5l = (C0S5L) c0s5p) != null) {
                    translationStatusAssem2.Jp(c0s5l);
                }
            }
        }
        return Unit.LIZ;
    }
}
