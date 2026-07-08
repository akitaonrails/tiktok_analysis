package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0S4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715450S4p extends C09AY implements Function2<TranslationStatusAssem, C291001Au<? extends C0R9E>, Unit> {
    public C715450S4p() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TranslationStatusAssem translationStatusAssem, C291001Au<? extends C0R9E> c291001Au) {
        String aid;
        Aweme aweme;
        Aweme aweme2;
        TranslationStatusAssem translationStatusAssem2 = translationStatusAssem;
        if (c291001Au != null) {
            String aid2 = null;
            translationStatusAssem2.LLLIIIIL = null;
            translationStatusAssem2.LLLFZ = false;
            TranslationStatusViewModel translationStatusViewModelGp = translationStatusAssem2.Gp();
            if (translationStatusViewModelGp != null) {
                C207118162y c207118162y = translationStatusViewModelGp.LL;
                c207118162y.LJII = false;
                c207118162y.LJFF = C162V.SWITCH_VIDEO;
                C161N c161n = C161N.LIZIZ;
                VideoItemParams videoItemParams = c207118162y.LJI;
                if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                EnumC715680S5m enumC715680S5mLJJZZI = c161n.LJJZZI(aid);
                EnumC715680S5m enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
                if (enumC715680S5mLJJZZI != enumC715680S5m) {
                    VideoItemParams videoItemParams2 = c207118162y.LJI;
                    if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
                        aid2 = aweme.getAid();
                    }
                    c161n.LJJJJZI(enumC715680S5m, aid2);
                    c207118162y.onEvent(C207158164m.LIZIZ);
                }
                c207118162y.LJIIIIZZ.LJ();
                translationStatusViewModelGp.LLILLJJLI = false;
            }
        }
        return Unit.LIZ;
    }
}
