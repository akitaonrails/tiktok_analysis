package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.TakoStruct;
import com.ss.android.ugc.aweme.feed.model.TakoSugWordList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS265S0300000_21;

/* JADX INFO: renamed from: X.0lFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350780lFs implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "tako";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 15;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return C14TF.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        C1350340lFA.LIZ(this, aweme, commentContextSource);
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        TakoStruct tako;
        List<TakoSugWordList> list;
        if (aweme == null || commentContextSource == null) {
            return false;
        }
        C14TF c14tf = C14TF.LIZIZ;
        if (!c14tf.LJIILL().LJIILIIL() || !c14tf.LJIILL().LJFF(aweme)) {
            return false;
        }
        C2189821An6 c2189821An6 = commentContextSource.getCommonModel().feedParam;
        if (c2189821An6 != null) {
            if (C289460BWe.LIZ()) {
                if (!c14tf.LJIILL().LJIIJ(c2189821An6.getEventType())) {
                    return false;
                }
            } else if (!c14tf.LJIILL().LJIILL(c2189821An6)) {
                return false;
            }
        }
        if (commentContextSource.getCommonModel().feedParam == null) {
            if (C289460BWe.LIZ()) {
                if (!c14tf.LJIILL().LJIIJ(commentContextSource.getCommonModel().eventType)) {
                    return false;
                }
            } else if (!c14tf.LJIILL().LIZLLL(commentContextSource.getCommonModel().eventType)) {
                return false;
            }
        }
        if (c14tf.LJIILL().LJIIIZ(aweme, commentContextSource.getCommonModel().eventType) || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (tako = standardBusinessModel.getTako()) == null || (list = tako.sugWordList) == null || C13LP.LJJJLL(list) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        TakoStruct tako;
        List<TakoSugWordList> list;
        if (aweme == null || str == null) {
            return false;
        }
        C14TF c14tf = C14TF.LIZIZ;
        if (!c14tf.LJIILL().LJIILIIL() || !c14tf.LJIILL().LJFF(aweme)) {
            return false;
        }
        if (c2189821An6 != null) {
            if (C289460BWe.LIZ()) {
                if (!c14tf.LJIILL().LJIIJ(c2189821An6.getEventType())) {
                    return false;
                }
            } else if (!c14tf.LJIILL().LJIILL(c2189821An6)) {
                return false;
            }
        } else if (C289460BWe.LIZ()) {
            if (!c14tf.LJIILL().LJIIJ(str)) {
                return false;
            }
        } else if (!c14tf.LJIILL().LIZLLL(str)) {
            return false;
        }
        if (c14tf.LJIILL().LJIIIZ(aweme, str) || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (tako = standardBusinessModel.getTako()) == null || (list = tako.sugWordList) == null || C13LP.LJJJLL(list) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        String str2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        String str3 = null;
        if (context == null) {
            return null;
        }
        C14TF c14tf = C14TF.LIZIZ;
        if (commentContextSource != null && (commonModel2 = commentContextSource.getCommonModel()) != null) {
            str = commonModel2.eventType;
        } else {
            str = null;
        }
        String strLIZ = C679800QlW.LIZ(str);
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str2 = commonModel.tabName;
        } else {
            str2 = null;
            if (commentContextSource != null) {
            }
            return c14tf.LJJLL(context, aweme, strLIZ, str2, str3, new AwS265S0300000_21(this, aweme, commentContextSource, 33));
        }
        CommentEventModel eventModel = commentContextSource.getEventModel();
        if (eventModel != null) {
            str3 = eventModel.searchId;
        }
        return c14tf.LJJLL(context, aweme, strLIZ, str2, str3, new AwS265S0300000_21(this, aweme, commentContextSource, 33));
    }
}
