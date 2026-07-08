package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper$downLoadWithResult$result$1", f = "ReplaceDownloadHelper.kt", l = {117}, m = "invokeSuspend")
public final class C1509405vY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1403205eQ>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C14DL LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1509405vY(Aweme aweme, C14DL c14dl, String str, InterfaceC1364105Vn<? super C1509405vY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c14dl;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1509405vY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r2 = r19
            java.lang.String r8 = "ReplaceDownloadHelper@3470.downLoadWithResult$result$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r1 = X.C099R.LJFF()
            r3 = r18
            int r0 = r3.LL
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 != r4) goto Lac
            X.C155000ia.LIZIZ(r2)
        L17:
            X.C1C7U.LIZIZ(r8)
            return r2
        L1b:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLILLJJLI
            r2 = 0
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r0.getPlayAddrH264()
            if (r5 == 0) goto L78
            java.lang.String r0 = r5.getBitRatedRatioUri()
        L33:
            java.lang.String r12 = X.C08HM.LIZJ(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            X.14DL r6 = r3.LLILLL
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r3.LLILLJJLI
            if (r5 == 0) goto L4f
            java.util.List r5 = r5.getUrlList()
            if (r5 == 0) goto L4f
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r0)
            if (r0 != 0) goto L51
        L4f:
            java.lang.String r0 = ""
        L51:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r6.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L61:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.C1382800m5W.LIZ(r7, r0)
            if (r0 == 0) goto L61
            r6.add(r0)
            goto L61
        L77:
            r5 = r2
        L78:
            r0 = r2
            goto L33
        L7a:
            r13.addAll(r6)
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L17
            android.app.Activity r16 = r0.LIZIZ()
            if (r16 == 0) goto L17
            X.14DL r11 = r3.LLILLL
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r3.LLILLJJLI
            java.lang.String r14 = r3.LLILZ
            X.05vl r15 = new X.05vl
            X.14Ci r0 = X.EnumC20226614Ci.NORMAL_EDIT
            r15.<init>(r0, r4)
            r3.LL = r4
            r11.getClass()
            X.05eO r9 = new X.05eO
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = X.C2296808zG.LJ(r9, r3)
            if (r2 != r1) goto L17
            X.C1C7U.LIZIZ(r8)
            return r1
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509405vY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1403205eQ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
