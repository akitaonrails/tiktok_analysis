package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.socialavatar.data.IMSocialAvatarStatusManager$startStateCombination$1", f = "IMSocialAvatarStatusManager.kt", l = {}, m = "invokeSuspend")
public final class C438860HIu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C439110HJt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438860HIu(C439110HJt c439110HJt, InterfaceC1364105Vn<? super C438860HIu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439110HJt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C438860HIu c438860HIu = new C438860HIu(this.LLILLJJLI, interfaceC1364105Vn);
        c438860HIu.LL = obj;
        return c438860HIu;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSocialAvatarStatusManager@4f1f.startStateCombination$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.LLILLJJLI.LJ.getValue();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = this.LLILLJJLI.LJFF.getValue();
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = this.LLILLJJLI.LJI.getValue();
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C438870HIv(this.LLILLJJLI, c259800zU, c259800zU2, c259800zU3, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C438880HIw(this.LLILLJJLI, c259800zU2, c259800zU, c259800zU3, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C438890HIx(this.LLILLJJLI, c259800zU3, c259800zU, c259800zU2, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.startStateCombination$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
