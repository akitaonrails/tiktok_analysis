package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647520PaY extends C09AY implements Function0<TemplateData> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ C0PGG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SparkContext LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647520PaY(String str, Map<String, ? extends Object> map, C0PGG c0pgg, String str2, SparkContext sparkContext, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = c0pgg;
        this.LLILZ = str2;
        this.LLILZIL = sparkContext;
        this.LLILZLL = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.tasm.TemplateData invoke() throws org.json.JSONException {
        /*
            r8 = this;
            java.lang.String r7 = r8.LL
            r6 = 1
            if (r7 == 0) goto L6c
            X.0PGG r2 = r8.LLILLL
            java.lang.String r5 = r8.LLILZ
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.LLILLJJLI
            com.bytedance.hybrid.spark.SparkContext r3 = r8.LLILZIL
            java.lang.String r1 = r8.LLILZLL
            X.0PGG r0 = X.C0PGG.LOCAL_CACHE_DATA
            if (r2 != r0) goto L4c
            com.lynx.tasm.TemplateData r2 = com.lynx.tasm.TemplateData.LJIIIIZZ(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L6c
            if (r2 == 0) goto L6c
            com.lynx.tasm.TemplateData r0 = com.lynx.tasm.TemplateData.LJIIIIZZ(r1)
            r2.LJIJJLI(r0)
        L28:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r0 = "hitPreload"
            r2.LJIILIIL(r0, r1)
            java.lang.String r0 = "isPreload"
            r2.LJIILIIL(r0, r1)
            java.lang.String r1 = "isReload"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.LJIILIIL(r1, r0)
            X.0PGG r1 = r8.LLILLL
            X.0PGG r0 = X.C0PGG.EMPTY_DATA
            if (r1 == r0) goto L42
            r6 = 0
        L42:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "isEmptyData"
            r2.LJIILIIL(r0, r1)
            return r2
        L4c:
            X.0PaK r2 = X.C647380PaK.LJIIIIZZ
            X.0PaW r0 = X.C647500PaW.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = X.C647500PaW.LIZIZ
            if (r4 != 0) goto L5b
            java.util.Map r4 = X.C2097608Jq.LJ()
        L5b:
            java.util.Map r0 = X.C647500PaW.LIZLLL(r5, r4)
            java.util.Map r0 = X.C2097608Jq.LJIIL(r1, r0)
            r2.getClass()
            com.lynx.tasm.TemplateData r2 = X.C647380PaK.LIZJ(r5, r7, r0, r3)
            if (r2 != 0) goto L28
        L6c:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.LLILLJJLI
            if (r5 == 0) goto L8f
            java.lang.String r4 = r8.LLILZ
            com.bytedance.hybrid.spark.SparkContext r3 = r8.LLILZIL
            X.0PaK r2 = X.C647380PaK.LJIIIIZZ
            X.0PaW r0 = X.C647500PaW.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = X.C647500PaW.LIZIZ
            java.util.Map r0 = X.C647500PaW.LIZLLL(r4, r5)
            java.util.Map r1 = X.C2097608Jq.LJIIL(r1, r0)
            r2.getClass()
            java.lang.String r0 = ""
            com.lynx.tasm.TemplateData r2 = X.C647380PaK.LIZJ(r4, r0, r1, r3)
            goto L28
        L8f:
            com.lynx.tasm.TemplateData r2 = new com.lynx.tasm.TemplateData
            r2.<init>()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647520PaY.invoke():java.lang.Object");
    }
}
