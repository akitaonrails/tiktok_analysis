package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS445S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem$checkAndInitGuideBubble$1$2$result$1", f = "ECPhotoSearchBubbleAssem.kt", l = {}, m = "invokeSuspend")
public final class C595970NZb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends ECSystemPhotoModel>>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595970NZb(Context context, InterfaceC1364105Vn<? super C595970NZb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595970NZb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECPhotoSearchBubbleAssem@ae92.checkAndInitGuideBubble$1$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        C634750Ov3.LIZ(this.LL, new AwS445S0200000_9(c013c, (C013C) c259800zU, (C259800zU<ECSystemPhotoModel>) 34), true);
        Pair pair = new Pair(Boolean.valueOf(c013c.element), c259800zU.element);
        C1C7U.LIZIZ("ECPhotoSearchBubbleAssem@ae92.checkAndInitGuideBubble$1$2$result$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends ECSystemPhotoModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
