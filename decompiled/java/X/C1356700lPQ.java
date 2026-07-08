package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1356700lPQ extends C2217421BqW implements Function0<Unit> {
    public C1356700lPQ(RepostReplyKeyboard repostReplyKeyboard) {
        super(0, repostReplyKeyboard, RepostReplyKeyboard.class, "showMaxLengthToast", "showMaxLengthToast()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Fragment fragment = (Fragment) this.receiver;
        fragment.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJII(R.attr.ee);
        c1389890mGx.LJIIIZ(2131850101);
        c1389890mGx.LIZLLL(2000L);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }
}
