package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0fFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120050fFj extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Resources LL;
    public final /* synthetic */ SpannableStringBuilder LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ = "{avatar}";
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120050fFj(Resources resources, SpannableStringBuilder spannableStringBuilder, int i, AwS418S0200000_17 awS418S0200000_17) {
        super(1);
        this.LL = resources;
        this.LLILLJJLI = spannableStringBuilder;
        this.LLILLL = i;
        this.LLILZIL = awS418S0200000_17;
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
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}
