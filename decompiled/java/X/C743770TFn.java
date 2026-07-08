package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743770TFn {
    public static final C743770TFn LIZ = new C743770TFn();

    public static Pair LIZJ(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        int iLJJJ = a0.LJJJ(a0.LJLIIIL(charSequence).toString(), charSequence2.toString(), 0, true, 2);
        int length = charSequence2.length();
        int length2 = ((String) charSequence).length();
        if (iLJJJ != -1 && (i = iLJJJ + length) <= length2) {
            return new Pair(Integer.valueOf(iLJJJ), Integer.valueOf(i));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highlight range error, content length ");
        sbLIZ.append(length2);
        sbLIZ.append(", keyword length ");
        sbLIZ.append(length);
        sbLIZ.append(", content ");
        sbLIZ.append((Object) charSequence);
        sbLIZ.append(", keyword ");
        sbLIZ.append((Object) charSequence2);
        C2188811AlT.LIZIZ(sbLIZ);
        return new Pair(-1, -1);
    }

    public static CharSequence LIZ(TuxTextView tuxTextView, CharSequence charSequence, int i, int i2, List list, Integer num) {
        INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
        if (iNoticeService != null) {
            return iNoticeService.LJLIL(tuxTextView, charSequence, i, 1, i2, 0, list, num);
        }
        return null;
    }
}
