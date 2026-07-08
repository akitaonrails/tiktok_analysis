package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C160600jU {
    public static final CharSequence LIZ(TextBadge textBadge) {
        if (textBadge == null || textBadge.key == null) {
            return null;
        }
        String str = textBadge.defaultPattern;
        String str2 = textBadge.key;
        if (str2 != null && str2.length() != 0) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str3 = textBadge.key;
            c1124870fNVLIZJ.getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str3);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                str = strLIZIZ;
            }
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        Text text = new Text();
        text.key = textBadge.key;
        text.defaultPattern = textBadge.defaultPattern;
        text.pieces = new ArrayList();
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            int size = textBadge.pieces.size();
            for (int i = 0; i < size; i++) {
                if (!TextUtils.isEmpty((CharSequence) ListProtector.get(textBadge.pieces, i))) {
                    List<TextPiece> list2 = text.pieces;
                    TextPiece textPiece = new TextPiece();
                    textPiece.type = EnumC1133850fbz.STRING.getPieceType();
                    textPiece.stringValue = (String) ListProtector.get(textBadge.pieces, i);
                    ListProtector.add(list2, i, textPiece);
                }
            }
        }
        return C1133830fbx.LJIILJJIL(str, text, null);
    }
}
