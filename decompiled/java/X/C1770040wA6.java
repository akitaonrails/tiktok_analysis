package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$showVideoGuide$1", f = "EcVideoGuideVM.kt", l = {}, m = "invokeSuspend")
public final class C1770040wA6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcVideoGuideVM LL;
    public final /* synthetic */ C1770080wAA LLILLJJLI;
    public final /* synthetic */ C1770090wAB LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770040wA6(EcVideoGuideVM ecVideoGuideVM, C1770080wAA c1770080wAA, C1770090wAB c1770090wAB, String str, InterfaceC1364105Vn<? super C1770040wA6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecVideoGuideVM;
        this.LLILLJJLI = c1770080wAA;
        this.LLILLL = c1770090wAB;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1770040wA6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x051a A[Catch: all -> 0x055c, CancellationException -> 0x0571, TryCatch #2 {CancellationException -> 0x0571, all -> 0x055c, blocks: (B:122:0x02dd, B:124:0x02f8, B:126:0x0303, B:128:0x030e, B:130:0x0312, B:132:0x0316, B:134:0x031e, B:135:0x0320, B:137:0x0324, B:139:0x032c, B:144:0x0336, B:146:0x033a, B:148:0x0342, B:151:0x0348, B:155:0x0355, B:157:0x035d, B:159:0x0361, B:162:0x036c, B:164:0x037c, B:165:0x037e, B:167:0x038e, B:170:0x0396, B:172:0x03ad, B:173:0x03af, B:175:0x03bb, B:176:0x03bd, B:178:0x03c7, B:181:0x03cf, B:183:0x03e9, B:186:0x03f1, B:189:0x0418, B:191:0x0421, B:193:0x0425, B:198:0x0446, B:200:0x049f, B:202:0x04a3, B:204:0x04a8, B:205:0x04b5, B:211:0x04c2, B:213:0x04ca, B:215:0x04ce, B:221:0x04db, B:223:0x04df, B:226:0x04e5, B:229:0x0502, B:235:0x050e, B:237:0x0512, B:238:0x0516, B:240:0x051a, B:241:0x051c, B:243:0x0522, B:244:0x0527, B:185:0x03ef, B:180:0x03cd, B:142:0x0331, B:247:0x0558), top: B:255:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0522 A[Catch: all -> 0x055c, CancellationException -> 0x0571, TryCatch #2 {CancellationException -> 0x0571, all -> 0x055c, blocks: (B:122:0x02dd, B:124:0x02f8, B:126:0x0303, B:128:0x030e, B:130:0x0312, B:132:0x0316, B:134:0x031e, B:135:0x0320, B:137:0x0324, B:139:0x032c, B:144:0x0336, B:146:0x033a, B:148:0x0342, B:151:0x0348, B:155:0x0355, B:157:0x035d, B:159:0x0361, B:162:0x036c, B:164:0x037c, B:165:0x037e, B:167:0x038e, B:170:0x0396, B:172:0x03ad, B:173:0x03af, B:175:0x03bb, B:176:0x03bd, B:178:0x03c7, B:181:0x03cf, B:183:0x03e9, B:186:0x03f1, B:189:0x0418, B:191:0x0421, B:193:0x0425, B:198:0x0446, B:200:0x049f, B:202:0x04a3, B:204:0x04a8, B:205:0x04b5, B:211:0x04c2, B:213:0x04ca, B:215:0x04ce, B:221:0x04db, B:223:0x04df, B:226:0x04e5, B:229:0x0502, B:235:0x050e, B:237:0x0512, B:238:0x0516, B:240:0x051a, B:241:0x051c, B:243:0x0522, B:244:0x0527, B:185:0x03ef, B:180:0x03cd, B:142:0x0331, B:247:0x0558), top: B:255:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770040wA6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
