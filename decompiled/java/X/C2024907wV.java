package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2024907wV extends C09AY implements Function1<C2025007wW, C2025007wW> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2024907wV(Context context, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2025007wW invoke(C2025007wW c2025007wW) {
        int iIntValue;
        C2025007wW c2025007wW2 = c2025007wW;
        String string = this.LL;
        Context context = this.LLILZIL;
        if (a0.LJJJIL(string)) {
            Integer num = c2025007wW2.LLILZLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            string = context.getString(iIntValue);
        }
        return new C2025007wW(this.LLILLJJLI, this.LLILLL, this.LLILZ, c2025007wW2.LLILZ, c2025007wW2.LLILZIL, c2025007wW2.LLILZLL, c2025007wW2.LLIZ, string, c2025007wW2.LLJ, c2025007wW2.LLJI);
    }
}
