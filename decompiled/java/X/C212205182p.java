package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.182p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$showCardIfNeeded$1", f = "EcLiveProductCard.kt", l = {221, 500, 501, 502}, m = "invokeSuspend")
public final class C212205182p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C212206182q LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ LiveRoomStruct LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Long LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ long LLJJ;
    public final /* synthetic */ Context LLJJI;
    public final /* synthetic */ boolean LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C212205182p(C212206182q c212206182q, boolean z, LiveRoomStruct liveRoomStruct, String str, boolean z2, Long l, Map<String, String> map, String str2, long j, Context context, boolean z3, InterfaceC1364105Vn<? super C212205182p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c212206182q;
        this.LLIZLLLIL = z;
        this.LLJ = liveRoomStruct;
        this.LLJI = str;
        this.LLJIJIL = z2;
        this.LLJILJIL = l;
        this.LLJILJILJ = map;
        this.LLJILLL = str2;
        this.LLJJ = j;
        this.LLJJI = context;
        this.LLJJIII = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C212205182p c212205182p = new C212205182p(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c212205182p.LLILZLL = obj;
        return c212205182p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0812 A[Catch: Exception -> 0x0873, TryCatch #11 {Exception -> 0x0873, blocks: (B:455:0x0853, B:449:0x0838, B:442:0x0816, B:444:0x081c, B:446:0x0824, B:450:0x083b, B:452:0x083f, B:438:0x080c, B:439:0x080e, B:441:0x0812, B:433:0x07f4, B:435:0x07f8), top: B:518:0x07f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x081c A[Catch: Exception -> 0x0873, TryCatch #11 {Exception -> 0x0873, blocks: (B:455:0x0853, B:449:0x0838, B:442:0x0816, B:444:0x081c, B:446:0x0824, B:450:0x083b, B:452:0x083f, B:438:0x080c, B:439:0x080e, B:441:0x0812, B:433:0x07f4, B:435:0x07f8), top: B:518:0x07f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x083f A[Catch: Exception -> 0x0873, TryCatch #11 {Exception -> 0x0873, blocks: (B:455:0x0853, B:449:0x0838, B:442:0x0816, B:444:0x081c, B:446:0x0824, B:450:0x083b, B:452:0x083f, B:438:0x080c, B:439:0x080e, B:441:0x0812, B:433:0x07f4, B:435:0x07f8), top: B:518:0x07f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0860 A[Catch: Exception -> 0x0875, TRY_ENTER, TryCatch #9 {Exception -> 0x0875, blocks: (B:460:0x0860, B:461:0x086c), top: B:516:0x085e }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x086c A[Catch: Exception -> 0x0875, TRY_LEAVE, TryCatch #9 {Exception -> 0x0875, blocks: (B:460:0x0860, B:461:0x086c), top: B:516:0x085e }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08a7 A[PHI: r3 r5
      0x08a7: PHI (r3v6 ??) = (r3v67 ??), (r3v68 ??), (r3v69 ??) binds: [B:466:0x0897, B:468:0x08a3, B:461:0x086c] A[DONT_GENERATE, DONT_INLINE]
      0x08a7: PHI (r5v6 ??) = (r5v180 ??), (r5v181 ??), (r5v182 ??) binds: [B:466:0x0897, B:468:0x08a3, B:461:0x086c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v130, types: [T] */
    /* JADX WARN: Type inference failed for: r1v182 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v39, types: [X.1833] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.182y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v52, types: [X.182y] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.182y, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.182y] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.182q] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.182q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v165, types: [X.182q] */
    /* JADX WARN: Type inference failed for: r5v172 */
    /* JADX WARN: Type inference failed for: r5v173 */
    /* JADX WARN: Type inference failed for: r5v174 */
    /* JADX WARN: Type inference failed for: r5v175 */
    /* JADX WARN: Type inference failed for: r5v176 */
    /* JADX WARN: Type inference failed for: r5v177 */
    /* JADX WARN: Type inference failed for: r5v178 */
    /* JADX WARN: Type inference failed for: r5v179 */
    /* JADX WARN: Type inference failed for: r5v180 */
    /* JADX WARN: Type inference failed for: r5v181 */
    /* JADX WARN: Type inference failed for: r5v182 */
    /* JADX WARN: Type inference failed for: r5v183 */
    /* JADX WARN: Type inference failed for: r5v184 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.182q] */
    /* JADX WARN: Type inference failed for: r5v61, types: [X.17w6] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.182q, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212205182p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
