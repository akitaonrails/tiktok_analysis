package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent$updateExtractColor$1", f = "PhotoDynamicBgColorComponent.kt", l = {279, 292}, m = "invokeSuspend")
public final class C0SKQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public PhotosViewHolderV3 LLILLL;
    public int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ PhotoDynamicBgColorComponent LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ Aweme LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SKQ(boolean z, PhotoDynamicBgColorComponent photoDynamicBgColorComponent, int i, float f, Aweme aweme, boolean z2, InterfaceC1364105Vn<? super C0SKQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = photoDynamicBgColorComponent;
        this.LLIZ = i;
        this.LLIZLLLIL = f;
        this.LLJ = aweme;
        this.LLJI = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SKQ(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0240 A[Catch: all -> 0x0397, Exception -> 0x0399, TryCatch #14 {Exception -> 0x0399, all -> 0x0397, blocks: (B:151:0x023c, B:153:0x0240, B:155:0x024d, B:157:0x0255, B:162:0x0273, B:164:0x0277, B:166:0x0281, B:169:0x0287, B:171:0x028b, B:172:0x0290, B:190:0x030b, B:191:0x0324, B:192:0x0328, B:194:0x032e, B:196:0x0334, B:198:0x033c, B:199:0x0349, B:204:0x0367, B:207:0x036d, B:208:0x0370, B:210:0x0380, B:211:0x0389, B:214:0x038f, B:177:0x02a0, B:178:0x02b2, B:180:0x02b6, B:182:0x02bc, B:186:0x02c9, B:187:0x02e2, B:188:0x02e7, B:189:0x02f9), top: B:255:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0277 A[Catch: all -> 0x0397, Exception -> 0x0399, TryCatch #14 {Exception -> 0x0399, all -> 0x0397, blocks: (B:151:0x023c, B:153:0x0240, B:155:0x024d, B:157:0x0255, B:162:0x0273, B:164:0x0277, B:166:0x0281, B:169:0x0287, B:171:0x028b, B:172:0x0290, B:190:0x030b, B:191:0x0324, B:192:0x0328, B:194:0x032e, B:196:0x0334, B:198:0x033c, B:199:0x0349, B:204:0x0367, B:207:0x036d, B:208:0x0370, B:210:0x0380, B:211:0x0389, B:214:0x038f, B:177:0x02a0, B:178:0x02b2, B:180:0x02b6, B:182:0x02bc, B:186:0x02c9, B:187:0x02e2, B:188:0x02e7, B:189:0x02f9), top: B:255:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b2 A[Catch: all -> 0x0397, Exception -> 0x0399, TryCatch #14 {Exception -> 0x0399, all -> 0x0397, blocks: (B:151:0x023c, B:153:0x0240, B:155:0x024d, B:157:0x0255, B:162:0x0273, B:164:0x0277, B:166:0x0281, B:169:0x0287, B:171:0x028b, B:172:0x0290, B:190:0x030b, B:191:0x0324, B:192:0x0328, B:194:0x032e, B:196:0x0334, B:198:0x033c, B:199:0x0349, B:204:0x0367, B:207:0x036d, B:208:0x0370, B:210:0x0380, B:211:0x0389, B:214:0x038f, B:177:0x02a0, B:178:0x02b2, B:180:0x02b6, B:182:0x02bc, B:186:0x02c9, B:187:0x02e2, B:188:0x02e7, B:189:0x02f9), top: B:255:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032e A[Catch: all -> 0x0397, Exception -> 0x0399, TryCatch #14 {Exception -> 0x0399, all -> 0x0397, blocks: (B:151:0x023c, B:153:0x0240, B:155:0x024d, B:157:0x0255, B:162:0x0273, B:164:0x0277, B:166:0x0281, B:169:0x0287, B:171:0x028b, B:172:0x0290, B:190:0x030b, B:191:0x0324, B:192:0x0328, B:194:0x032e, B:196:0x0334, B:198:0x033c, B:199:0x0349, B:204:0x0367, B:207:0x036d, B:208:0x0370, B:210:0x0380, B:211:0x0389, B:214:0x038f, B:177:0x02a0, B:178:0x02b2, B:180:0x02b6, B:182:0x02bc, B:186:0x02c9, B:187:0x02e2, B:188:0x02e7, B:189:0x02f9), top: B:255:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0367 A[Catch: all -> 0x0397, Exception -> 0x0399, TRY_ENTER, TryCatch #14 {Exception -> 0x0399, all -> 0x0397, blocks: (B:151:0x023c, B:153:0x0240, B:155:0x024d, B:157:0x0255, B:162:0x0273, B:164:0x0277, B:166:0x0281, B:169:0x0287, B:171:0x028b, B:172:0x0290, B:190:0x030b, B:191:0x0324, B:192:0x0328, B:194:0x032e, B:196:0x0334, B:198:0x033c, B:199:0x0349, B:204:0x0367, B:207:0x036d, B:208:0x0370, B:210:0x0380, B:211:0x0389, B:214:0x038f, B:177:0x02a0, B:178:0x02b2, B:180:0x02b6, B:182:0x02bc, B:186:0x02c9, B:187:0x02e2, B:188:0x02e7, B:189:0x02f9), top: B:255:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: all -> 0x039b, Exception -> 0x03a1, TRY_ENTER, TryCatch #13 {Exception -> 0x03a1, all -> 0x039b, blocks: (B:15:0x0046, B:23:0x005b, B:27:0x0069, B:31:0x007a, B:49:0x00ab, B:22:0x0059), top: B:256:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131 A[Catch: all -> 0x0223, Exception -> 0x022a, TRY_ENTER, TryCatch #18 {Exception -> 0x022a, all -> 0x0223, blocks: (B:17:0x004a, B:19:0x0050, B:21:0x0056, B:25:0x0061, B:29:0x006f, B:33:0x0086, B:36:0x008e, B:42:0x009a, B:45:0x00a2, B:55:0x00c1, B:57:0x00c5, B:59:0x00d2, B:61:0x00da, B:63:0x00e4, B:66:0x00ea, B:68:0x00ee, B:69:0x00f3, B:72:0x011a, B:74:0x0122, B:75:0x012b, B:78:0x0131, B:80:0x0135, B:82:0x013b, B:85:0x0160, B:87:0x0168, B:88:0x0171), top: B:249:0x004a }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [long] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [long] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SKQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
