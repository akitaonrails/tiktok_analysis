package X;

import android.text.TextUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;

/* JADX INFO: renamed from: X.0it8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1259800it8 implements InterfaceC315010CWl {
    public final /* synthetic */ C1259780it6 LIZ;
    public final /* synthetic */ String LIZIZ;

    public /* synthetic */ C1259800it8(C1259780it6 c1259780it6, String str) {
        this.LIZ = c1259780it6;
        this.LIZIZ = str;
    }

    public final void LIZ(CollabInfo collabInfo) {
        boolean z;
        C1259780it6 c1259780it6 = this.LIZ;
        String str = this.LIZIZ;
        Aweme aweme = c1259780it6.LL;
        if (aweme != null && TextUtils.equals(aweme.getAid(), str)) {
            int i = 0;
            if (collabInfo != null && (collabInfo.shouldDisplayTag || C1259780it6.u6(c1259780it6.LL, collabInfo))) {
                z = true;
            } else {
                z = false;
            }
            TuxIconView tuxIconView = c1259780it6.LLJJ;
            if (!z) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
    }
}
