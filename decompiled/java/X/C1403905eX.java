package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$Video$1$1", f = "PurePreviewMediaEngine.kt", l = {}, m = "invokeSuspend")
public final class C1403905eX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SocMediaResource LLILLL;
    public final /* synthetic */ C05P0<Bitmap> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1403905eX(InterfaceC497601wk interfaceC497601wk, Context context, SocMediaResource socMediaResource, C05P0<Bitmap> c05p0, InterfaceC1364105Vn<? super C1403905eX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = context;
        this.LLILLL = socMediaResource;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1403905eX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurePreviewMediaEngine@cdc6.Video$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL(this.LL, C0PEM.LIZJ, null, new C1404005eY(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.Video$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
