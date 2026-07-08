package X;

import android.content.Context;
import android.text.SpannableString;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426740GoK extends C09AY implements Function0<SpannableString> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C426740GoK(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ SpannableString invoke() {
        SpannableString spannableString = new SpannableString(" ");
        C416900GWi c416900GWiLIZIZ = C426760GoM.LIZIZ(this.LL, null, 62);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        c416900GWiLIZIZ.LIZJ = iLIZIZ;
        c416900GWiLIZIZ.LJIIIIZZ = iLIZIZ2;
        c416900GWiLIZIZ.setBounds(0, 0, iLIZIZ2 + iLIZIZ, iLIZIZ);
        c416900GWiLIZIZ.LIZ();
        C786410Ut5.p2(spannableString, new C419890GdH(c416900GWiLIZIZ, 3), 0, spannableString.length(), 33);
        return spannableString;
    }
}
