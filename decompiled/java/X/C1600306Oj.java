package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06Oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1600306Oj extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C1634706af LLILZIL;
    public TuxSheet LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final Set<EnumC1596306Mv> LLJ;
    public final Set<C067L> LLJI;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LIZ();
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLIZLLLIL.getValue();
    }

    @Override // X.C06O6
    public final void LJ() {
        super.LJ();
        TuxSheet tuxSheet = this.LLILZLL;
        if (tuxSheet == null || !C494501wF.LIZ(tuxSheet)) {
            return;
        }
        TuxSheet tuxSheet2 = this.LLILZLL;
        if (tuxSheet2 != null) {
            tuxSheet2.dismissAllowingStateLoss();
        }
        this.LLILZLL = null;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLJ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLJI;
    }

    public C1600306Oj(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = (C1634706af) c1600706On.LJIIJJI;
        this.LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(999));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1065));
        this.LLJ = Collections.singleton(EnumC1596306Mv.PERSONALIZED_STICKER_RECOMMEND_POPUP);
        this.LLJI = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (this.LLILZIL.LJII.getValue() == null) {
            return new C06OH("PanelStateVM missing");
        }
        if (!(r0.getPanelType().getValue() instanceof C1629106Zl)) {
            return new C06OH("Keyboard is showing");
        }
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1600406Ok
            if (r0 == 0) goto L35
            r4 = r7
            X.06Ok r4 = (X.C1600406Ok) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L6e
            X.C155000ia.LIZIZ(r3)
        L22:
            X.06On r0 = r5.LLILZ
            X.19EG r3 = r0.LIZLLL
            if (r3 != 0) goto L3b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L35:
            X.06Ok r4 = new X.06Ok
            r4.<init>(r5, r7)
            goto L12
        L3b:
            X.0mIc r1 = new X.0mIc
            r0 = 0
            r1.<init>(r0, r0)
            X.06oy r0 = new X.06oy
            r0.<init>(r3)
            com.bytedance.tux.sheet.sheet.TuxSheet r2 = r1.LIZ
            r2.LLJJIII = r0
            X.06w8 r1 = new X.06w8
            r0 = 8
            r1.<init>(r5, r0)
            r2.LLILLJJLI = r1
            androidx.fragment.app.FragmentManager r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "PersonalizedStickerRecommendSheetView"
            r2.show(r1, r0)
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            X.0Hqj r0 = r0.getImStickerInputPanelService()
            r0.LJIIL()
            r5.LLILZLL = r2
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600306Oj.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
