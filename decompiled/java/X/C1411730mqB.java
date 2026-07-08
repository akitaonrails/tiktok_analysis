package X;

import android.text.Spanned;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411730mqB extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1411700mq8 LLILLJJLI;
    public final /* synthetic */ CharSequence LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ boolean LLIZ = true;
    public final /* synthetic */ Function1<RecommendDescResponse, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<EnumC1411090mp9, Unit> LLJ;
    public final /* synthetic */ Function1<RecommendDescResponse, Unit> LLJI;
    public final /* synthetic */ Function1<EnumC1411090mp9, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411730mqB(long j, C1411700mq8 c1411700mq8, CharSequence charSequence, String str, int i, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c1411700mq8;
        this.LLILLL = charSequence;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = list;
        this.LLIZLLLIL = function1;
        this.LLJ = function12;
        this.LLJI = function13;
        this.LLJIJIL = function14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        C1411700mq8 c1411700mq8 = this.LLILLJJLI;
        CharSequence charSequence = this.LLILLL;
        c1411700mq8.getClass();
        C07ZX c07zxLIZ = C0ZIX.LIZ(charSequence);
        if (charSequence != null && charSequence.length() != 0 && (charSequence instanceof Spanned)) {
            Map<String, C0ZIY> map = C0ZIX.LIZ;
            ((LinkedHashMap) map).clear();
            map.putAll(c07zxLIZ.LIZIZ);
        }
        String str3 = c07zxLIZ.LIZ;
        C1411700mq8 c1411700mq82 = this.LLILLJJLI;
        String str4 = this.LLILZ;
        c1411700mq82.getClass();
        if (str4 == null) {
            str4 = "";
        }
        String strLIZIZ = this.LLILLJJLI.LIZIZ();
        C1411700mq8 c1411700mq83 = this.LLILLJJLI;
        int i = this.LLILZIL;
        c1411700mq83.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"prompt_type\":");
        sbLIZ.append(i);
        sbLIZ.append('}');
        RecommendDescRequestBody recommendDescRequestBody = new RecommendDescRequestBody(str2, str3, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), str4, true);
        RecommendDescRequestBody recommendDescRequestBodyLIZ = RecommendDescRequestBody.LIZ(recommendDescRequestBody);
        C1411700mq8 c1411700mq84 = this.LLILLJJLI;
        c1411700mq84.LIZJ = this.LLILZLL;
        c1411700mq84.LIZLLL = this.LLILLL;
        c1411700mq84.LIZIZ = recommendDescRequestBodyLIZ;
        c1411700mq84.LJFF();
        List<InterfaceC420801kM> listLIZ = C1411740mqC.LIZ(this.LLILLJJLI.LIZ, recommendDescRequestBody, recommendDescRequestBodyLIZ, 30000 - jCurrentTimeMillis, jCurrentTimeMillis, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
        C11NJ c11nj = this.LLILLJJLI.LJ;
        InterfaceC420801kM[] interfaceC420801kMArr = (InterfaceC420801kM[]) ((ArrayList) listLIZ).toArray(new InterfaceC420801kM[0]);
        c11nj.LIZLLL((InterfaceC420801kM[]) Arrays.copyOf(interfaceC420801kMArr, interfaceC420801kMArr.length));
        return Unit.LIZ;
    }
}
