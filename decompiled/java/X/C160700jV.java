package X;

import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C160700jV {
    public static final C160700jV LIZ = new C160700jV();

    public static CharSequence LIZ(BadgeText badgeText) {
        if (badgeText == null) {
            return null;
        }
        Text text = new Text();
        text.key = badgeText.key;
        text.defaultPattern = badgeText.defaultPattern;
        List<String> list = badgeText.pieces;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                TextPiece textPiece = new TextPiece();
                textPiece.type = EnumC1133850fbz.STRING.getPieceType();
                textPiece.stringValue = str;
                arrayList.add(textPiece);
            }
            text.pieces = arrayList;
        }
        return C1133830fbx.LJIILIIL(text, null);
    }
}
