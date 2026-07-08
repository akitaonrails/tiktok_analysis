package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0dQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049550dQ1 {
    public static final HashMap<String, C1049550dQ1> LIZLLL = new HashMap<>();
    public final Map<String, Comment> LIZ = new LinkedHashMap();
    public final Map<String, Comment> LIZIZ = new LinkedHashMap();
    public final Set<String> LIZJ = new LinkedHashSet();

    public final NextLiveData<AbstractC1049500dPw> LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commerce_comment_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.add(strLIZIZ);
        return C707370Rot.LIZ.LIZ(strLIZIZ);
    }

    public final void LIZIZ(final Comment comment, Comment comment2, boolean z) {
        comment.setTranslated(z);
        comment.setText(comment2.getText());
        LIZ(comment.getCid()).setValue(new AbstractC1049500dPw(comment) { // from class: X.0dQ6
        });
    }
}
