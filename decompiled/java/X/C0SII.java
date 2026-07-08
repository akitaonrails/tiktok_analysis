package X;

import android.content.Context;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SII, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SII extends C09AY implements Function1<C0SIR, C0SIR> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SII(float f, Context context, String str, boolean z) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = f;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SIR invoke(C0SIR c0sir) {
        C0SIR c0sir2 = c0sir;
        List<Object> list = c0sir2.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C428830Grh) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            c0sir2.LIZIZ.removeAll(arrayList);
            c0sir2.LIZIZ.add(C0SIM.LIZJ(this.LL, this.LLILLJJLI, (TextExtraStruct) c0sir2.LIZLLL, this.LLILLL, null));
        }
        return c0sir2;
    }
}
