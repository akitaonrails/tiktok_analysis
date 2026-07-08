package X;

import android.widget.TextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DES, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DES extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, Boolean> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ CharSequence LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DES(int i, int i2, int i3, TextView textView, CharSequence charSequence, String str, String str2, String str3, Map map) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = textView;
        this.LLILZ = charSequence;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, Boolean> map = this.LL;
        String str = this.LLILLJJLI;
        map.put(str, Boolean.valueOf(!(map.get(str) != null ? r0.booleanValue() : false)));
        C0DIU.LIZ(this.LLILZIL, this.LLILZLL, this.LLJ, this.LLILLL, this.LLILZ, this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI, this.LL);
        return Unit.LIZ;
    }
}
