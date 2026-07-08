package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import defpackage.x;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PLY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLY extends C09AY implements Function1<C642440PHu, Unit> {
    public final /* synthetic */ C0PLZ LL;
    public final /* synthetic */ SearchMixFeed LLILLJJLI;
    public final /* synthetic */ List<C0DQP> LLILLL;
    public final /* synthetic */ s LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C054000Hq LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ x.d LLIZLLLIL;
    public final /* synthetic */ C19EG LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PLY(C0PLZ c0plz, SearchMixFeed searchMixFeed, List<C0DQP> list, s sVar, Map<String, String> map, C054000Hq c054000Hq, int i, x.d dVar, C19EG c19eg) {
        super(1);
        this.LL = c0plz;
        this.LLILLJJLI = searchMixFeed;
        this.LLILLL = list;
        this.LLILZ = sVar;
        this.LLILZIL = map;
        this.LLILZLL = c054000Hq;
        this.LLIZ = i;
        this.LLIZLLLIL = dVar;
        this.LLJ = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C642440PHu c642440PHu) {
        Object objLIZ;
        String str;
        C642440PHu c642440PHu2 = c642440PHu;
        String strValueOf = String.valueOf(this.LL.LIZIZ);
        c642440PHu2.LIZLLL = strValueOf;
        Object obj = this.LLILLJJLI;
        if (obj instanceof C642240PHa) {
            c642440PHu2.LJFF = (C642240PHa) obj;
        }
        C0P7A c0p7a = c642440PHu2.LIZIZ.LJIIIZ;
        C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(SearchMixFeed.class));
        if (c640970PCd == null) {
            c640970PCd = new C640970PCd();
            c0p7a.LIZ.put(C13LE.LIZ(SearchMixFeed.class), c640970PCd);
        }
        HashMap<String, Object> map = c640970PCd.LIZ;
        if (map != null) {
            map.put(strValueOf, obj);
        }
        List<C0DQP> list = this.LLILLL;
        s sVar = this.LLILZ;
        Map<String, String> map2 = this.LLILZIL;
        C054000Hq c054000Hq = this.LLILZLL;
        for (C0DQP c0dqp : list) {
            List<Aweme> listLIZ = c0dqp.LIZ();
            for (Aweme aweme : listLIZ) {
                c642440PHu2.LIZLLL(new AwS589S0100000_10(aweme, 428));
                C651640PhC.LIZIZ.getClass();
                C651640PhC.LIZ(aweme, c0dqp, false, false);
                C651640PhC.LIZJ(aweme, c0dqp);
            }
            if (sVar != null) {
                objLIZ = C0DYC.LIZ(sVar, "*_search_lynx_context_token_type");
            } else {
                objLIZ = null;
            }
            if (!(objLIZ instanceof String) || (str = (String) objLIZ) == null) {
                str = "";
            }
            if (C293270BeX.LIZ(str)) {
                C651640PhC c651640PhC = C651640PhC.LIZIZ;
                ArrayList<String> arrayList = c0dqp.LJII;
                c651640PhC.getClass();
                C651640PhC.LIZLLL(arrayList);
            }
            if (C301260BrQ.LIZ()) {
                C0QAQ.LIZ(listLIZ, map2, c054000Hq, null, 0);
            }
        }
        c642440PHu2.LIZJ(new C0PLW(this.LLIZ, this.LLIZLLLIL, this.LLILLL, this.LLJ, this.LLILZ, this.LLILZIL, this.LLILZLL));
        return Unit.LIZ;
    }
}
