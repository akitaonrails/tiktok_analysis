package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.datamanager.ItemIconFetcher$refreshStickerIcons$3$1", f = "ItemIconFetcher.kt", l = {}, m = "invokeSuspend")
public final class C352940Dsa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC352930DsZ LL;
    public final /* synthetic */ NLETrackSlot LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C352950Dsb LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352940Dsa(InterfaceC352930DsZ interfaceC352930DsZ, NLETrackSlot nLETrackSlot, String str, C352950Dsb c352950Dsb, InterfaceC1364105Vn<? super C352940Dsa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC352930DsZ;
        this.LLILLJJLI = nLETrackSlot;
        this.LLILLL = str;
        this.LLILZ = c352950Dsb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352940Dsa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ItemIconFetcher@d71.refreshStickerIcons$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL(this.LLILLJJLI.getUUID(), this.LLILLL);
        this.LLILZ.LJ = this.LLILLL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ItemIconFetcher@d71.refreshStickerIcons$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
