package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.182o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.SeaEcLiveFeedCard$showCardIfNeeded$1", f = "SeaEcLiveFeedCard.kt", l = {160, 233, 234}, m = "invokeSuspend")
public final class C212204182o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public AnonymousClass1830 LLILLL;
    public int LLILZ;
    public final /* synthetic */ C212203182n LLILZIL;
    public final /* synthetic */ LiveRoomStruct LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ Context LLJILLL;
    public final /* synthetic */ boolean LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C212204182o(C212203182n c212203182n, LiveRoomStruct liveRoomStruct, String str, boolean z, Long l, boolean z2, Map<String, String> map, String str2, long j, Context context, boolean z3, InterfaceC1364105Vn<? super C212204182o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c212203182n;
        this.LLILZLL = liveRoomStruct;
        this.LLIZ = str;
        this.LLIZLLLIL = z;
        this.LLJ = l;
        this.LLJI = z2;
        this.LLJIJIL = map;
        this.LLJILJIL = str2;
        this.LLJILJILJ = j;
        this.LLJILLL = context;
        this.LLJJ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C212204182o(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0607 A[Catch: Exception -> 0x06ce, TryCatch #3 {Exception -> 0x06ce, blocks: (B:332:0x061f, B:322:0x0601, B:323:0x0603, B:325:0x0607, B:328:0x060e, B:316:0x05ec, B:318:0x05f0), top: B:411:0x05ec }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x060e A[Catch: Exception -> 0x06ce, TryCatch #3 {Exception -> 0x06ce, blocks: (B:332:0x061f, B:322:0x0601, B:323:0x0603, B:325:0x0607, B:328:0x060e, B:316:0x05ec, B:318:0x05f0), top: B:411:0x05ec }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0631 A[Catch: Exception -> 0x06cc, TRY_ENTER, TryCatch #5 {Exception -> 0x06cc, blocks: (B:339:0x0631, B:341:0x0640, B:342:0x0642, B:344:0x064c, B:345:0x0650, B:347:0x065a, B:349:0x065e, B:350:0x0662, B:351:0x0666, B:356:0x067d, B:358:0x0681, B:360:0x0690, B:361:0x0692, B:363:0x069c, B:364:0x06a0, B:366:0x06aa, B:368:0x06ae, B:369:0x06b2, B:370:0x06b6), top: B:415:0x062f }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x067d A[Catch: Exception -> 0x06cc, TryCatch #5 {Exception -> 0x06cc, blocks: (B:339:0x0631, B:341:0x0640, B:342:0x0642, B:344:0x064c, B:345:0x0650, B:347:0x065a, B:349:0x065e, B:350:0x0662, B:351:0x0666, B:356:0x067d, B:358:0x0681, B:360:0x0690, B:361:0x0692, B:363:0x069c, B:364:0x06a0, B:366:0x06aa, B:368:0x06ae, B:369:0x06b2, B:370:0x06b6), top: B:415:0x062f }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0710 A[PHI: r4 r5
      0x0710: PHI (r4v6 X.182n) = (r4v41 X.182n), (r4v42 X.182n), (r4v43 X.182n), (r4v44 X.182n) binds: [B:381:0x06f2, B:383:0x06fe, B:357:0x067f, B:370:0x06b6] A[DONT_GENERATE, DONT_INLINE]
      0x0710: PHI (r5v8 X.1830) = (r5v7 X.1830), (r5v7 X.1830), (r5v9 X.1830), (r5v9 X.1830) binds: [B:381:0x06f2, B:383:0x06fe, B:357:0x067f, B:370:0x06b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.182n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.182n] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212204182o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
