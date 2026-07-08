package X;

import Y.ACListenerS150S0100000_15;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986630bmX extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Resources LL;
    public final /* synthetic */ SpannableStringBuilder LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ = "{avatar}";
    public final /* synthetic */ C986620bmW LLILZIL;
    public final /* synthetic */ User LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986630bmX(Resources resources, SpannableStringBuilder spannableStringBuilder, int i, C986620bmW c986620bmW, User user) {
        super(1);
        this.LL = resources;
        this.LLILLJJLI = spannableStringBuilder;
        this.LLILLL = i;
        this.LLILZIL = c986620bmW;
        this.LLILZLL = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        int iLIZIZ = (int) C497740JfY.LIZIZ(24.0f);
        C443530HaJ c443530HaJ = new C443530HaJ(this.LL, bitmap);
        c443530HaJ.LIZIZ();
        c443530HaJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        C416760GVu c416760GVu = new C416760GVu(c443530HaJ);
        SpannableStringBuilder spannableStringBuilder = this.LLILLJJLI;
        int i = this.LLILLL;
        C786410Ut5.q2(spannableStringBuilder, c416760GVu, i, this.LLILZ.length() + i, 33);
        C16F5 c16f5 = this.LLILZIL.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setText(this.LLILLJJLI);
        }
        C986620bmW c986620bmW = this.LLILZIL;
        User user = this.LLILZLL;
        View view = c986620bmW.LLJI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(user, 268), view);
        }
        return Unit.LIZ;
    }
}
