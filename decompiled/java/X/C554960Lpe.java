package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandler$restore$2", f = "DraftCreativeRestoreHandler.kt", l = {250, 251, 253, 254, 265, 266, 267, 268, 269, 270, 271, 272, 273, 275, 279}, m = "invokeSuspend")
public final class C554960Lpe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<DraftFileRestoreResult>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C372000EiE LLILZ;
    public C0F4R LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C366430EYf LLIZ;
    public final /* synthetic */ InterfaceC1635410sex LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554960Lpe(C366430EYf c366430EYf, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1364105Vn<? super C554960Lpe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c366430EYf;
        this.LLIZLLLIL = interfaceC1635410sex;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554960Lpe(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0677 A[Catch: all -> 0x076c, TryCatch #0 {all -> 0x076c, blocks: (B:224:0x0667, B:225:0x0671, B:227:0x0677, B:236:0x0692, B:237:0x06b1, B:239:0x06c0, B:241:0x06c6, B:242:0x06ca, B:244:0x06d0, B:246:0x06de, B:248:0x06ec, B:250:0x06f4, B:252:0x06fa, B:254:0x0700, B:255:0x0706, B:257:0x070c, B:259:0x0720, B:260:0x0728, B:262:0x072e, B:264:0x073c, B:266:0x0746, B:271:0x0753, B:272:0x0759), top: B:407:0x0667 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06b1 A[Catch: all -> 0x076c, TryCatch #0 {all -> 0x076c, blocks: (B:224:0x0667, B:225:0x0671, B:227:0x0677, B:236:0x0692, B:237:0x06b1, B:239:0x06c0, B:241:0x06c6, B:242:0x06ca, B:244:0x06d0, B:246:0x06de, B:248:0x06ec, B:250:0x06f4, B:252:0x06fa, B:254:0x0700, B:255:0x0706, B:257:0x070c, B:259:0x0720, B:260:0x0728, B:262:0x072e, B:264:0x073c, B:266:0x0746, B:271:0x0753, B:272:0x0759), top: B:407:0x0667 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ab  */
    /* JADX WARN: Type inference failed for: r14v18, types: [X.0EWb] */
    /* JADX WARN: Type inference failed for: r14v19, types: [X.0F4R] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554960Lpe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
