package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager$getStickerByTopicText$2", f = "AddYoursStickerManager.kt", l = {137}, m = "invokeSuspend")
public final class C2188908hr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<AddYoursStickerStruct> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2188908hr(boolean z, C259800zU<AddYoursStickerStruct> c259800zU, String str, InterfaceC1364105Vn<? super C2188908hr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2188908hr(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AddYoursStickerManager@2b80.getStickerByTopicText$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L16
            X.00zU r4 = r8.LLILLJJLI
            X.00zU r5 = r8.LL
            goto L4d
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L31
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r2 = r8.LLILZIL
            android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r1 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZJ
            java.lang.String r0 = r8.LLILZLL
            java.lang.Object r0 = r1.get(r0)
            r2.element = r0
        L31:
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r4 = r8.LLILZIL
            T r0 = r4.element
            if (r0 != 0) goto L79
            java.lang.String r1 = r8.LLILZLL     // Catch: java.lang.Exception -> L55
            r8.LL = r4     // Catch: java.lang.Exception -> L55
            r8.LLILLJJLI = r4     // Catch: java.lang.Exception -> L55
            r8.LLILLL = r5     // Catch: java.lang.Exception -> L55
            X.08ho r0 = X.C2188608ho.LIZ     // Catch: java.lang.Exception -> L55
            java.lang.Object r9 = r0.LIZIZ(r3, r1, r8)     // Catch: java.lang.Exception -> L55
            if (r9 != r6) goto L4b
            X.C1C7U.LIZIZ(r7)
            return r6
        L4b:
            r5 = r4
            goto L50
        L4d:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L58
        L50:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp r9 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp) r9     // Catch: java.lang.Exception -> L58
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r9.sticker     // Catch: java.lang.Exception -> L58
            goto L77
        L55:
            r2 = move-exception
            r5 = r4
            goto L59
        L58:
            r2 = move-exception
        L59:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "getStickerByTopicText error, "
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AddYoursStickerManager"
            X.C1720106oR.LIZ(r0, r1)
            r4 = r5
            r0 = r3
        L77:
            r4.element = r0
        L79:
            X.00zU<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r0 = r8.LLILZIL
            T r2 = r0.element
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r2 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r2
            if (r2 == 0) goto L96
            java.lang.Long r0 = r2.getTopicId()
            boolean r0 = X.C08A4.LIZIZ(r0)
            if (r0 != 0) goto L8c
            r2 = r3
        L8c:
            if (r2 == 0) goto L96
            java.lang.String r1 = r8.LLILZLL
            android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r0 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZJ
            r0.put(r1, r2)
            r3 = r2
        L96:
            X.C1C7U.LIZIZ(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2188908hr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
