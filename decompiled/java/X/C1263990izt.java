package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0izt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263990izt extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263990izt(String str, TuxTextView tuxTextView, String str2, String str3, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = this.LL;
        }
        this.LLILLJJLI.setText(str2);
        C1263960izq c1263960izq = C1263960izq.LIZ;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        int i = this.LLILZIL;
        int maxLines = this.LLILLJJLI.getMaxLines();
        c1263960izq.getClass();
        C1263960izq.LIZIZ.put(C1263960izq.LIZ(i, maxLines, str3, str4), str2);
        return Unit.LIZ;
    }
}
