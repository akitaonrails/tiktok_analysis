package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine$ComposeThumbnail$2$1$1$bgColor$1", f = "PurePreviewMediaEngine.kt", l = {}, m = "invokeSuspend")
public final class C1404205ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>>, Object> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404205ea(SocMediaResource socMediaResource, Bitmap bitmap, InterfaceC1364105Vn<? super C1404205ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socMediaResource;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1404205ea(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1$1$bgColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<Integer, Integer> pairLIZIZ = C0L21.LIZIZ(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("PurePreviewMediaEngine@cdc6.ComposeThumbnail$2$1$1$bgColor$1");
        return pairLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
