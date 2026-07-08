package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OF6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.addtodsp.feed.button.MusicAddToDspClickEvent$invoke$2", f = "MusicAddToDspClickEvent.kt", l = {}, m = "invokeSuspend")
public final class C0OF6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ AddSongContextData LLILLL;
    public final /* synthetic */ Music LLILZ;
    public final /* synthetic */ C610010NwF LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OF6(C19EG c19eg, Fragment fragment, AddSongContextData addSongContextData, Music music, C610010NwF c610010NwF, InterfaceC1364105Vn<? super C0OF6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
        this.LLILLL = addSongContextData;
        this.LLILZ = music;
        this.LLILZIL = c610010NwF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OF6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAddToDspClickEvent@7e1.invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C633020OsG.LIZIZ.LJJIJLIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
        C1C7U.LIZIZ("MusicAddToDspClickEvent@7e1.invoke$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
