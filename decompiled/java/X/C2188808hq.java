package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager$getStickerByTopicId$2", f = "AddYoursStickerManager.kt", l = {112}, m = "invokeSuspend")
public final class C2188808hq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<AddYoursStickerStruct> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2188808hq(boolean z, C259800zU<AddYoursStickerStruct> c259800zU, long j, InterfaceC1364105Vn<? super C2188808hq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2188808hq(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AddYoursStickerManager@2b80.getStickerByTopicId$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L16
            X.00zU r3 = r8.LLILLJJLI
            X.00zU r4 = r8.LL
            goto L57
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L35
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r3 = r8.LLILZIL
            android.util.LruCache<java.lang.Long, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r2 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZIZ
            long r0 = r8.LLILZLL
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            java.lang.Object r0 = r2.get(r0)
            r3.element = r0
        L35:
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r3 = r8.LLILZIL
            T r0 = r3.element
            if (r0 != 0) goto L83
            long r0 = r8.LLILZLL     // Catch: java.lang.Exception -> L5f
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L5f
            r8.LL = r3     // Catch: java.lang.Exception -> L5f
            r8.LLILLJJLI = r3     // Catch: java.lang.Exception -> L5f
            r8.LLILLL = r5     // Catch: java.lang.Exception -> L5f
            X.08ho r1 = X.C2188608ho.LIZ     // Catch: java.lang.Exception -> L5f
            java.lang.String r0 = ""
            java.lang.Object r9 = r1.LIZIZ(r2, r0, r8)     // Catch: java.lang.Exception -> L5f
            if (r9 != r4) goto L55
            X.C1C7U.LIZIZ(r7)
            return r4
        L55:
            r4 = r3
            goto L5a
        L57:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L62
        L5a:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp r9 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp) r9     // Catch: java.lang.Exception -> L62
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r9.sticker     // Catch: java.lang.Exception -> L62
            goto L81
        L5f:
            r2 = move-exception
            r4 = r3
            goto L63
        L62:
            r2 = move-exception
        L63:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "getAddYoursStickerByQA error, "
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AddYoursStickerManager"
            X.C1720106oR.LIZ(r0, r1)
            r3 = r4
            r0 = r6
        L81:
            r3.element = r0
        L83:
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r0 = r8.LLILZIL
            T r4 = r0.element
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r4 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r4
            if (r4 == 0) goto La4
            java.lang.Long r0 = r4.getTopicId()
            boolean r0 = X.C08A4.LIZIZ(r0)
            if (r0 != 0) goto L96
            r4 = r6
        L96:
            if (r4 == 0) goto La4
            long r2 = r8.LLILZLL
            android.util.LruCache<java.lang.Long, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r1 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r1.put(r0, r4)
            r6 = r4
        La4:
            X.C1C7U.LIZIZ(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2188808hq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
