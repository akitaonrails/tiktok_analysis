package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import irm.AkS92S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671960tbu extends C09AY implements Function1<Context, C197039127h> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Drawable LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671960tbu(String str, int i, int i2, int i3, Drawable drawable, Function0<Unit> function0) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = drawable;
        this.LLILZLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C197039127h invoke(Context context) {
        Context context2 = context;
        int iIntValue = 0;
        C197039127h c197039127h = new C197039127h(context2, null, 6, 0);
        String str = this.LL;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        int i3 = this.LLILZ;
        Drawable drawable = this.LLILZIL;
        C786410Ut5.I7(new AkS92S0100000_25(this.LLILZLL, 15), c197039127h);
        c197039127h.setText(str);
        c197039127h.setTextColorRes(i);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonStartIcon(Integer.valueOf(i2));
        Integer numLIZJ = C1308910kAL.LIZJ(i3, context2);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        c197039127h.setIconTintColor(iIntValue);
        c197039127h.setBackgroundDrawable(drawable);
        c197039127h.LJJJJLI(true);
        return c197039127h;
    }
}
