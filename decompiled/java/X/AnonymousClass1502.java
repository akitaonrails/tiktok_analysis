package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1502, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.AbsMusicTabView$changeLyricEffectToggleState$1", f = "AbsMusicTabView.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass1502 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC204610154m LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MusicModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1502(AbstractC204610154m abstractC204610154m, boolean z, MusicModel musicModel, InterfaceC1364105Vn<? super AnonymousClass1502> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC204610154m;
        this.LLILLJJLI = z;
        this.LLILLL = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1502(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsMusicTabView@e88d.changeLyricEffectToggleState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ().LJIIL.LJIIJ(this.LLILLL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsMusicTabView@e88d.changeLyricEffectToggleState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
