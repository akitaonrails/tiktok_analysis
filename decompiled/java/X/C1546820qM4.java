package X;

import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.lynx.hybrid.i18n.storage.I18nResBundle;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546820qM4 extends C09AY implements Function1<C189200o6<? extends Pair<? extends String, ? extends String>>, Unit> {
    public final /* synthetic */ Function1<C189200o6<C1536580q5Y>, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SparkI18nManager.Meta LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1546870qM9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1546820qM4(Function1<? super C189200o6<C1536580q5Y>, Unit> function1, String str, SparkI18nManager.Meta meta, boolean z, C1546870qM9 c1546870qM9) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = str;
        this.LLILLL = meta;
        this.LLILZ = z;
        this.LLILZIL = c1546870qM9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C189200o6<? extends Pair<? extends String, ? extends String>> c189200o6) {
        String strLIZJ;
        I18nResBundle i18nResBundle;
        Object objM10unboximpl = c189200o6.m10unboximpl();
        Function1<C189200o6<C1536580q5Y>, Unit> function1 = this.LL;
        String str = this.LLILLJJLI;
        SparkI18nManager.Meta meta = this.LLILLL;
        boolean z = this.LLILZ;
        C1546870qM9 c1546870qM9 = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            Pair pair = (Pair) objM10unboximpl;
            C1536580q5Y c1536580q5Y = new C1536580q5Y((String) pair.getSecond(), false, System.currentTimeMillis(), str, meta, (String) pair.getFirst());
            C189200o6.m2constructorimpl(c1536580q5Y);
            function1.invoke(C189200o6.m1boximpl(c1536580q5Y));
            if (z) {
                SparkI18nManager.LIZ.getClass();
                strLIZJ = SparkI18nManager.LJI(meta);
            } else {
                SparkI18nManager.LIZ.getClass();
                strLIZJ = SparkI18nManager.LIZJ(meta);
            }
            SparkI18nManager.LIZ.getClass();
            I18nResBundle i18nResBundleLIZIZ = SparkI18nManager.LIZIZ().LIZIZ(strLIZJ);
            if (i18nResBundleLIZIZ != null) {
                SparkI18nManager.ResDetail resDetail = meta.detail;
                i18nResBundle = I18nResBundle.LIZ(i18nResBundleLIZIZ, resDetail.publicPath, resDetail.fileHash, resDetail.languageTags, C2097608Jq.LJIIL(i18nResBundleLIZIZ.content, C2097908Jt.LIZJ(new Pair(str, pair.getSecond()))), 0L, 232);
            } else {
                SparkI18nManager.ResDetail resDetail2 = meta.detail;
                i18nResBundle = new I18nResBundle(resDetail2.publicPath, resDetail2.fileHash, resDetail2.languageTags, null, C2097908Jt.LIZJ(new Pair(str, pair.getSecond())), 0L, null, 0L, 232, null);
            }
            c1546870qM9.LIZJ(strLIZJ, i18nResBundle);
        }
        Function1<C189200o6<C1536580q5Y>, Unit> function12 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl != null) {
            C098200Yq c098200Yq = new C098200Yq(thM5exceptionOrNullimpl);
            C189200o6.m2constructorimpl(c098200Yq);
            function12.invoke(C189200o6.m1boximpl(c098200Yq));
        }
        return Unit.LIZ;
    }
}
