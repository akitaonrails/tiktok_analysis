package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S1100000_6;

/* JADX INFO: renamed from: X.0Hmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451210Hmh extends C09AY implements Function1<C451220Hmi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ View.OnClickListener LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451210Hmh(String str, View.OnClickListener onClickListener, String str2, Context context) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = onClickListener;
        this.LLILLL = str2;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C451220Hmi c451220Hmi) {
        C451220Hmi c451220Hmi2 = c451220Hmi;
        C450820Hm4 c450820Hm4 = new C450820Hm4();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        c450820Hm4.LIZJ = str;
        c450820Hm4.LIZ = new AwS120S1100000_6(this.LLILLL, this.LLILZ, 1);
        c450820Hm4.LIZLLL = this.LLILLJJLI;
        c451220Hmi2.LIZ(c450820Hm4);
        return Unit.LIZ;
    }
}
