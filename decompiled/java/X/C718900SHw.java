package X;

import android.content.Context;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0SHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718900SHw extends C09AY implements Function1<C0SIR, C0SIR> {
    public final /* synthetic */ Function1<TextExtraStruct, Boolean> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718900SHw(AwS590S0100000_11 awS590S0100000_11, int i, Context context, float f, String str) {
        super(1);
        this.LL = awS590S0100000_11;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = f;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SIR invoke(C0SIR c0sir) {
        C0SIR c0sir2 = c0sir;
        Object obj = c0sir2.LIZLLL;
        if (obj instanceof TextExtraStruct) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
            if (textExtraStruct.getType() == 0 && textExtraStruct.isThirdPartyHighlight() && this.LL.invoke((TextExtraStruct) obj).booleanValue() && u.LJJIIJZLJL(c0sir2.LIZ, e3.g, false)) {
                List<Object> list = c0sir2.LIZIZ;
                int i = this.LLILLJJLI;
                Context context = this.LLILLL;
                float f = this.LLILZ;
                String str = this.LLILZIL;
                list.clear();
                list.add(new C0HD1(0.75f, i, obj));
                C428810Grf c428810Grf = new C428810Grf(context, f, i, textExtraStruct, 112);
                c428810Grf.LLIZ = str;
                list.add(c428810Grf);
            }
        }
        return c0sir2;
    }
}
