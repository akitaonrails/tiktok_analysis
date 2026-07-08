package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0swa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cameraspec.ChangeCameraSpecComponent$showCover$result$1", f = "ChangeCameraSpecComponent.kt", l = {486}, m = "invokeSuspend")
public final class C1646340swa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EnumC1448590nnd LLILLL;
    public final /* synthetic */ C1649170t19 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646340swa(EnumC1448590nnd enumC1448590nnd, C1649170t19 c1649170t19, InterfaceC1364105Vn<? super C1646340swa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC1448590nnd;
        this.LLILZ = c1649170t19;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1646340swa c1646340swa = new C1646340swa(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1646340swa.LLILLJJLI = obj;
        return c1646340swa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapLIZ;
        C1C7U.LIZ("ChangeCameraSpecComponent@58a7.showCover$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            int ratio = (int) (540 / this.LLILLL.getRatio());
            C1649170t19 c1649170t19 = this.LLILZ;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c1649170t19.getCameraApiComponent().St2().LJLJL(540, ratio, new InterfaceC2173471A4j() { // from class: X.0swb
                @Override // X.InterfaceC2173471A4j
                public final void LIZ(int i2, Bitmap bitmap) {
                    if (c2252611DEt.isCancelled()) {
                        c2252611DEt.LJJIFFI(null, new Pair(Boolean.TRUE, null));
                        return;
                    }
                    InterfaceC20236714Gf<Pair<Boolean, Bitmap>> interfaceC20236714Gf = c2252611DEt;
                    Boolean bool = Boolean.FALSE;
                    if (i2 != 0) {
                        bitmap = null;
                    }
                    interfaceC20236714Gf.LJJIFFI(null, new Pair(bool, bitmap));
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangeCameraSpecComponent@58a7.showCover$result$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.getSecond();
        if (bitmap != null) {
            bitmapLIZ = C1100070ejV.LIZ(bitmap, 0.5f, 20.0f, false);
            if (bitmapLIZ == null) {
                bitmapLIZ = bitmap.copy(Bitmap.Config.RGB_565, false);
            }
        } else {
            bitmapLIZ = null;
        }
        Pair pair2 = new Pair(pair.getFirst(), bitmapLIZ);
        C1C7U.LIZIZ("ChangeCameraSpecComponent@58a7.showCover$result$1");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
