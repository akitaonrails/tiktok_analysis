package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.GetAndInsertAwemeOperator$invoke$2$1", f = "GetAndInsertAwemeOperator.kt", l = {47}, m = "invokeSuspend")
public final class C1234580iES extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<C189200o6<Aweme>> LLILLJJLI;
    public final /* synthetic */ C1234590iET LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1234580iES(AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957, C1234590iET c1234590iET, User user, InterfaceC1364105Vn<? super C1234580iES> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1234590iET;
        this.LLILZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234580iES(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "GetAndInsertAwemeOperator@8e7d.invoke$2$1"
            X.C1C7U.LIZ(r9)
            r0 = 202366(0x3167e, float:2.83575E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L3c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r8 == 0) goto L23
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L23:
            throw r1
        L24:
            X.C155000ia.LIZIZ(r11)
            X.0957<X.00o6<com.ss.android.ugc.aweme.feed.model.Aweme>> r0 = r10.LLILLJJLI
            if (r0 == 0) goto La5
            r10.LL = r1
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r2) goto L3f
            if (r8 == 0) goto L38
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L38:
            X.C1C7U.LIZIZ(r9)
            return r2
        L3c:
            X.C155000ia.LIZIZ(r11)
        L3f:
            X.00o6 r11 = (X.C189200o6) r11
            java.lang.Object r7 = r11.m10unboximpl()
            X.0iET r3 = r10.LLILLL
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r7)
            java.lang.String r6 = "@LinkRelation_Video"
            java.lang.String r5 = "recommend_feed"
            if (r2 == 0) goto L65
            X.1E8n r1 = X.C2276471E8n.LIZIZ
            java.lang.String r0 = "GetAndInsert get aweme fail"
            r1.LIZJ(r5, r2, r6, r0)
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.LIZJ
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L65
            X.C2196008j0.LIZIZ(r0, r2)
        L65:
            X.0iET r4 = r10.LLILLL
            com.ss.android.ugc.aweme.profile.model.User r1 = r10.LLILZ
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto La2
            r3 = r7
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            r4.LJ = r3
            if (r1 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSharer(r3, r1)
        L79:
            r4.LJ = r3
            X.0iEJ r2 = new X.0iEJ
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r4.LIZ
            r0 = 0
            r2.<init>(r1, r3, r0)
            r2.LIZ()
            X.1E8n r2 = X.C2276471E8n.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "GetAndInsert insert "
            r1.append(r0)
            java.lang.String r0 = r4.LIZIZ
            r1.append(r0)
            r0 = 33
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LIZIZ(r5, r6, r0)
        La2:
            X.C189200o6.m1boximpl(r7)
        La5:
            X.0iET r1 = r10.LLILLL
            r0 = 0
            r1.LIZLLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r8 == 0) goto Lb1
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb1:
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1234580iES.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
