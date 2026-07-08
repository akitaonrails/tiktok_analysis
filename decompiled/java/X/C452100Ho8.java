package X;

import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ho8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager$downloadResources$1", f = "StickerResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C452100Ho8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StickerResourceManager LL;
    public final /* synthetic */ Resources LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452100Ho8(StickerResourceManager stickerResourceManager, Resources resources, InterfaceC1364105Vn<? super C452100Ho8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = stickerResourceManager;
        this.LLILLJJLI = resources;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452100Ho8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResourceManager@d1ec.downloadResources$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ(this.LLILLJJLI, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerResourceManager@d1ec.downloadResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
