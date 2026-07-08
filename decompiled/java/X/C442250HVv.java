package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.ame.StickerDetailBannerComposeKt$loadImage$1$1", f = "StickerDetailBannerCompose.kt", l = {290}, m = "invokeSuspend")
public final class C442250HVv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C442260HVw LLILLJJLI;
    public final /* synthetic */ C05P0<C442290HVz> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442250HVv(C442260HVw c442260HVw, C05P0<C442290HVz> c05p0, InterfaceC1364105Vn<? super C442250HVv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c442260HVw;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442250HVv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C442290HVz c442290HVz;
        C1C7U.LIZ("StickerDetailBannerComposeKt@4d5f.loadImage$1$1");
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
            Uri uri = UriProtector.parse(this.LLILLJJLI.LIZ);
            EnumC1331380kka enumC1331380kka = EnumC1331380kka.IMMEDIATE;
            this.LL = 1;
            C01GW c01gw = C342540Dbo.LIZ;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C442200HVq(uri, enumC1331380kka, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerDetailBannerComposeKt@4d5f.loadImage$1$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C05P0<C442290HVz> c05p0 = this.LLILLL;
        if (zBooleanValue) {
            C442260HVw c442260HVw = this.LLILLJJLI;
            c442290HVz = new C442290HVz(c442260HVw.LIZIZ, c442260HVw.LIZ);
        } else {
            c442290HVz = new C442290HVz(this.LLILLJJLI.LIZJ, "");
        }
        c05p0.setValue(c442290HVz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerDetailBannerComposeKt@4d5f.loadImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
