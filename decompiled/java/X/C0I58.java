package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I58, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I58 extends C09AY implements Function1<Context, CharSequence> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I58(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Context context) {
        return context.getString(2131835452, C454780HsS.LIZ(this.LL), C454780HsS.LIZ(this.LLILLJJLI));
    }
}
