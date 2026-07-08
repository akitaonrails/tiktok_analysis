package X;

import com.ss.android.ugc.aweme.emoji.common.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ho7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager$sendDownloadResourcesEvent$1", f = "StickerResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C452090Ho7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StickerResourceManager LL;
    public final /* synthetic */ Resources LLILLJJLI;
    public final /* synthetic */ List<Emoji> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C452090Ho7(StickerResourceManager stickerResourceManager, Resources resources, List<? extends Emoji> list, InterfaceC1364105Vn<? super C452090Ho7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = stickerResourceManager;
        this.LLILLJJLI = resources;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452090Ho7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResourceManager@d1ec.sendDownloadResourcesEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerResourceManager@d1ec.sendDownloadResourcesEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
