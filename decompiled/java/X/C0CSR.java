package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraAlbumAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCameraAlbumAction$open$1", f = "StoryCameraAlbumAction.kt", l = {}, m = "invokeSuspend")
public final class C0CSR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryCameraAlbumAction LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSR(StoryCameraAlbumAction storyCameraAlbumAction, Context context, String str, Bundle bundle, InterfaceC1364105Vn<? super C0CSR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyCameraAlbumAction;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCameraAlbumAction@673c.open$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C298680BnG.LIZ()) {
            this.LL.realOpenAlbumV2(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        } else {
            this.LL.realOpenAlbum(this.LLILLJJLI, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryCameraAlbumAction@673c.open$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
