package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.bottombar.selection.AlbumBottomSelectionListComponent$sceneActions$1$3$1", f = "AlbumBottomSelectionListComponent.kt", l = {79}, m = "invokeSuspend")
public final class C526330KkZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C526450Kkl LLILLJJLI;
    public final /* synthetic */ TikTokMediaModel LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526330KkZ(C526450Kkl c526450Kkl, TikTokMediaModel tikTokMediaModel, View view, InterfaceC1364105Vn<? super C526330KkZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c526450Kkl;
        this.LLILLL = tikTokMediaModel;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526330KkZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$3$1");
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
            C526070Kk9 c526070Kk9 = new C526070Kk9(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c05yc.emit(c526070Kk9, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumBottomSelectionListComponent@160f.sceneActions$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
