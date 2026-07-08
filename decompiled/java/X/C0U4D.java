package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;

/* JADX INFO: renamed from: X.0U4D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.list.LiveStickerListAdapter$createImageLoadListener$1$1", f = "LiveStickerListAdapter.kt", l = {}, m = "invokeSuspend")
public final class C0U4D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ C0U4E LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4D(LiveEffect liveEffect, C0U4E c0u4e, InterfaceC1364105Vn<? super C0U4D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
        this.LLILLJJLI = c0u4e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U4D(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<String> list;
        C1C7U.LIZ("LiveStickerListAdapter@834d.createImageLoadListener$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UrlModel icon = this.LL.getIcon();
        if (icon != null && (list = icon.urlList) != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        C1819620xS4.LIZIZ(str, new AwS591S0100000_12(this.LLILLJJLI, 675));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveStickerListAdapter@834d.createImageLoadListener$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
