package X;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C256600yy extends C09AY implements Function1<Float, CharSequence> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C256600yy(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Float f) {
        float fFloatValue = f.floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1)));
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
