package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* JADX INFO: renamed from: X.0KkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526140KkG implements InterfaceC2495909qH {
    public final /* synthetic */ MvChoosePhotoScene LL;

    @Override // X.InterfaceC2495909qH
    public final int getPriority() {
        return 600;
    }

    public C526140KkG(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LL = mvChoosePhotoScene;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // X.InterfaceC2495909qH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLIIIL(X.C525700KjY r12, X.InterfaceC2495009q8 r13, X.InterfaceC1364105Vn<? super X.InterfaceC2499409qq> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C526150KkH
            if (r0 == 0) goto L90
            r3 = r14
            X.0KkH r3 = (X.C526150KkH) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r10 = r3.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L67
            if (r0 != r2) goto L97
            X.C155000ia.LIZIZ(r10)
        L25:
            return r10
        L26:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r11.LL
            java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r0.selectMediaModel
            r0.clear()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r11.LL
            java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r1 = r0.selectMediaModel
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r12.LIZ
            r1.addAll(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r6 = r11.LL
            r3.LL = r12
            r3.LLILLJJLI = r13
            r3.getClass()
            r3.LLILZIL = r5
            X.099m r5 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r5.<init>(r0)
            kotlin.jvm.internal.AwS587S0100000_8 r1 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 182(0xb6, float:2.55E-43)
            r1.<init>(r5, r0)
            r6.processLibraryBeforeFinish(r1)
            java.lang.Object r10 = r5.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r10 != r0) goto L64
            X.C099Q.LIZJ(r3)
        L64:
            if (r10 != r4) goto L6e
            return r4
        L67:
            X.09q8 r13 = r3.LLILLJJLI
            X.0KjY r12 = r3.LL
            X.C155000ia.LIZIZ(r10)
        L6e:
            android.content.Intent r10 = (android.content.Intent) r10
            if (r10 == 0) goto L9f
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r6 = r12.LIZ
            X.0L99 r7 = r12.LIZIZ
            boolean r8 = r12.LIZJ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9 = r12.LIZLLL
            X.0KjY r5 = new X.0KjY
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 0
            r3.LL = r0
            r3.LLILLJJLI = r0
            r3.getClass()
            r3.LLILZIL = r2
            java.lang.Object r10 = r13.LIZ(r5, r3)
            if (r10 != r4) goto L25
            return r4
        L90:
            X.0KkH r3 = new X.0KkH
            r3.<init>(r11, r14)
            goto L12
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9f:
            X.09qC r1 = new X.09qC
            java.lang.String r0 = "processLibraryBeforeFinish"
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526140KkG.LJLIIIL(X.0KjY, X.09q8, X.05Vn):java.lang.Object");
    }
}
