package X;

import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0xyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839520xyA {
    public static final C1817980xPQ LIZ(BoardTextFontStyleData boardTextFontStyleData) {
        String str = boardTextFontStyleData.LIZ;
        if (str == null) {
            str = "";
        }
        String str2 = boardTextFontStyleData.fileName;
        Effect effect = boardTextFontStyleData.LIZJ;
        if (effect != null) {
            effect.getResource_id();
        }
        return new C1817980xPQ(str, str2);
    }
}
