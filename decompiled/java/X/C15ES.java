package X;

import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15ES, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ES implements InterfaceC20488315Ez<C15EY> {
    public final ILiveMatchService LIZ;
    public String LIZIZ = "";

    @Override // X.InterfaceC20488315Ez
    public final boolean LIZIZ() {
        GiftModeMeta giftModeMetaLJIIIIZZ;
        String str;
        InterfaceC973730bRj interfaceC973730bRjYf2 = this.LIZ.yf2(false);
        if (interfaceC973730bRjYf2 == null || (giftModeMetaLJIIIIZZ = interfaceC973730bRjYf2.LJIIIIZZ()) == null || giftModeMetaLJIIIIZZ.giftId == 0 || (str = giftModeMetaLJIIIIZZ.giftNameKey) == null || a0.LJJJIL(str)) {
            return false;
        }
        this.LIZIZ = giftModeMetaLJIIIIZZ.giftNameKey;
        return true;
    }

    public C15ES(ILiveMatchService iLiveMatchService) {
        this.LIZ = iLiveMatchService;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // X.InterfaceC20488315Ez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C15EY> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C15ET
            if (r0 == 0) goto L66
            r5 = r10
            X.15ET r5 = (X.C15ET) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L6c
            X.C155000ia.LIZIZ(r4)
        L22:
            X.15EY r3 = new X.15EY
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r6 = 0
            r1[r6] = r4
            r0 = 2131843044(0x7f1157e4, float:1.9319441E38)
            java.lang.String r4 = X.C497740JfY.LJIJJ(r0, r1)
            r5 = 0
            r8 = 14
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L38:
            X.C155000ia.LIZIZ(r4)
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bV5 r0 = r0.LIZLLL()
            if (r0 == 0) goto L57
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2 r0 = r0.LJJII()
        L49:
            boolean r0 = X.C156900it.LJIIIZ(r0)
            if (r0 == 0) goto L59
            r0 = 2131853767(0x7f1181c7, float:1.934119E38)
            java.lang.String r4 = X.C497740JfY.LJIJI(r0)
            goto L22
        L57:
            r0 = 0
            goto L49
        L59:
            X.0ft0 r1 = X.C1144400ft0.LIZ
            java.lang.String r0 = r9.LIZIZ
            r5.LLILLL = r2
            java.lang.Object r4 = r1.LIZ(r0, r5)
            if (r4 != r3) goto L22
            return r3
        L66:
            X.15ET r5 = new X.15ET
            r5.<init>(r9, r10)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15ES.LIZ(X.05Vn):java.lang.Object");
    }
}
