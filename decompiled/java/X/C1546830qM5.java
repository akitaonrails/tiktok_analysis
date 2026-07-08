package X;

import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.lynx.hybrid.i18n.storage.I18nResBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546830qM5 extends C09AY implements Function1<C189200o6<? extends Pair<? extends String, ? extends String>>, Unit> {
    public final /* synthetic */ SparkI18nManager.Meta LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546830qM5(SparkI18nManager.Meta meta, String str, String str2, JSONObject jSONObject, long j) {
        super(1);
        this.LL = meta;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = jSONObject;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C189200o6<? extends Pair<? extends String, ? extends String>> c189200o6) throws JSONException {
        C1546970qMJ c1546970qMJ;
        Object c098200Yq;
        Function1<Throwable, Unit> function1;
        Object objM10unboximpl = c189200o6.m10unboximpl();
        SparkI18nManager.Meta meta = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        JSONObject jSONObject = this.LLILZ;
        long j = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            Pair pair = (Pair) objM10unboximpl;
            SparkI18nManager.LIZ.getClass();
            C1546870qM9 c1546870qM9LIZIZ = SparkI18nManager.LIZIZ();
            if (c1546870qM9LIZIZ != null) {
                EnumC1546920qME enumC1546920qME = EnumC1546920qME.GeckoChannel;
                C1124004aU c1124004aU = new C1124004aU(str2);
                int i = C1546940qMG.LIZ[enumC1546920qME.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c1546970qMJ = c1546870qM9LIZIZ.LJ;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1546970qMJ = c1546870qM9LIZIZ.LIZLLL;
                }
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                Iterator<T> it2 = c1124004aU.invoke(c1546970qMJ.LIZ.getAllKey()).iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(c1546970qMJ.LIZ.getStringSet((String) it2.next(), C08CX.INSTANCE));
                }
                for (String str3 : linkedHashSet) {
                    SparkI18nManager.LIZ.getClass();
                    C1546870qM9 c1546870qM9LIZIZ2 = SparkI18nManager.LIZIZ();
                    if (c1546870qM9LIZIZ2 != null) {
                        try {
                            c098200Yq = (Unit) c1546870qM9LIZIZ2.LIZJ.LIZJ(str3, new C1546890qMB(c1546870qM9LIZIZ2, str3, c1546870qM9LIZIZ2.LIZIZ(str3)));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null && (function1 = c1546870qM9LIZIZ2.LIZIZ) != null) {
                            function1.invoke(thM5exceptionOrNullimpl);
                        }
                        C189200o6.m7isFailureimpl(c098200Yq);
                    }
                }
            }
            SparkI18nManager.LIZ.getClass();
            C1546870qM9 c1546870qM9LIZIZ3 = SparkI18nManager.LIZIZ();
            if (c1546870qM9LIZIZ3 != null) {
                String strLIZJ = SparkI18nManager.LIZJ(meta);
                SparkI18nManager.ResDetail resDetail = meta.detail;
                c1546870qM9LIZIZ3.LIZJ(strLIZJ, new I18nResBundle(resDetail.publicPath, resDetail.fileHash, resDetail.languageTags, null, C2097908Jt.LIZJ(new Pair(str, pair.getSecond())), System.currentTimeMillis(), str2, 0L, 136, null));
            }
            jSONObject.put("cdn_url", pair.getFirst());
            jSONObject.put("state", 1);
            SparkI18nManager.LJII(jSONObject, j);
            C1490740otc.LIZ.LIZ("update by gecko success.", EnumC1490770otf.I, "i18n");
        }
        JSONObject jSONObject2 = this.LLILZ;
        long j2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl2 != null) {
            jSONObject2.put("state", 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load error, ");
            sbLIZ.append(thM5exceptionOrNullimpl2);
            jSONObject2.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
            SparkI18nManager.LIZ.getClass();
            SparkI18nManager.LJII(jSONObject2, j2);
        }
        return Unit.LIZ;
    }
}
