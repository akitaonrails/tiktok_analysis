package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageSummary;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$startCommentSummaryPrefetch$1", f = "Text2ImageGenerator.kt", l = {366, 373}, m = "invokeSuspend")
public final class C572720MdC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageSummary>, Object> {
    public Text2ImageSummary LL;
    public Text2ImageSummary LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Text2ImageGenerator LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572720MdC(Text2ImageGenerator text2ImageGenerator, String str, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C572720MdC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = text2ImageGenerator;
        this.LLILZIL = str;
        this.LLILZLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572720MdC(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Text2ImageSummary text2ImageSummary;
        Text2ImageSummary text2ImageSummary2;
        Object summaryInfo = obj;
        C1C7U.LIZ("Text2ImageGenerator@4a7d.startCommentSummaryPrefetch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJ("startCommentSummaryPrefetch error: " + e);
            text2ImageSummary = new Text2ImageSummary(null, null, null, null, null, null, null, 127, null);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    text2ImageSummary2 = this.LLILLJJLI;
                    text2ImageSummary = this.LL;
                    C155000ia.LIZIZ(summaryInfo);
                    text2ImageSummary2.setCoverPath((String) summaryInfo);
                    C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startCommentSummaryPrefetch$1");
                    return text2ImageSummary;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(summaryInfo);
        } else {
            C155000ia.LIZIZ(summaryInfo);
            Text2ImageGenerator.Text2ImageApi text2ImageApi = this.LLILZ.LJ;
            String str = this.LLILZIL;
            boolean zBooleanValue = ((Boolean) C277270Atp.LIZ.getValue()).booleanValue();
            this.LLILLL = 1;
            summaryInfo = text2ImageApi.getSummaryInfo(str, zBooleanValue, this);
            if (summaryInfo == objLJFF) {
                C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startCommentSummaryPrefetch$1");
                return objLJFF;
            }
        }
        Text2ImageSummary text2ImageSummary3 = (Text2ImageSummary) summaryInfo;
        Text2ImageGenerator text2ImageGenerator = this.LLILZ;
        String coverUrl = text2ImageSummary3.getCoverUrl();
        if (coverUrl == null) {
            coverUrl = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment_cover_");
        sbLIZ.append(this.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        CreativeInfo creativeInfo = this.LLILZLL;
        this.LL = text2ImageSummary3;
        this.LLILLJJLI = text2ImageSummary3;
        this.LLILLL = 2;
        Object objLIZLLL = text2ImageGenerator.LIZLLL(coverUrl, strLIZIZ, false, creativeInfo, this);
        if (objLIZLLL == objLJFF) {
            C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startCommentSummaryPrefetch$1");
            return objLJFF;
        }
        text2ImageSummary2 = text2ImageSummary3;
        summaryInfo = objLIZLLL;
        text2ImageSummary = text2ImageSummary2;
        text2ImageSummary2.setCoverPath((String) summaryInfo);
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.startCommentSummaryPrefetch$1");
        return text2ImageSummary;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageSummary> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
