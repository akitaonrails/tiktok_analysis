package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.bottombar.selection.AlbumBottomSelectionListComponent$sceneActions$1$2$1", f = "AlbumBottomSelectionListComponent.kt", l = {74}, m = "invokeSuspend")
public final class C526340Kka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526450Kkl LLILLJJLI;
    public final /* synthetic */ TikTokMediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526340Kka(C526450Kkl c526450Kkl, TikTokMediaModel tikTokMediaModel, InterfaceC1364105Vn<? super C526340Kka> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526450Kkl;
        this.LLILLL = tikTokMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526340Kka(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$2$1");
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
            C05YC<InterfaceC526090KkB> c05yc = this.LLILLJJLI.LLJJJ;
            C526080KkA c526080KkA = new C526080KkA(this.LLILLL);
            this.LL = 1;
            if (c05yc.emit(c526080KkA, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
