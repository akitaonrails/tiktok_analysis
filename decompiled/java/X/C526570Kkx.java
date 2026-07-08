package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.AlbumSelectionDataComponent$unselect$2", f = "AlbumSelectionDataComponent.kt", l = {88}, m = "invokeSuspend")
public final class C526570Kkx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526590Kkz LLILLJJLI;
    public final /* synthetic */ TikTokMediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526570Kkx(C526590Kkz c526590Kkz, TikTokMediaModel tikTokMediaModel, InterfaceC1364105Vn<? super C526570Kkx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526590Kkz;
        this.LLILLL = tikTokMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526570Kkx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumSelectionDataComponent@18aa.unselect$2");
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
            C05YC<InterfaceC525940Kjw> c05yc = this.LLILLJJLI.LLILZ;
            C525930Kjv c525930Kjv = new C525930Kjv(this.LLILLL);
            this.LL = 1;
            if (c05yc.emit(c525930Kjv, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumSelectionDataComponent@18aa.unselect$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumSelectionDataComponent@18aa.unselect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
