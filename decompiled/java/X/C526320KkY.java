package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.bottombar.selection.AlbumBottomSelectionListComponent$sceneActions$1$1$1", f = "AlbumBottomSelectionListComponent.kt", l = {68}, m = "invokeSuspend")
public final class C526320KkY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526450Kkl LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TikTokMediaModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526320KkY(C526450Kkl c526450Kkl, int i, int i2, TikTokMediaModel tikTokMediaModel, InterfaceC1364105Vn<? super C526320KkY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526450Kkl;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = tikTokMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526320KkY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$1$1");
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
            C526060Kk8 c526060Kk8 = new C526060Kk8(this.LLILLL, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            if (c05yc.emit(c526060Kk8, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
