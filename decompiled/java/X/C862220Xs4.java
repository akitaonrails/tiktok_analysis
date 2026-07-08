package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel$init$2", f = "CommerceMusicSubstituteMusicListViewModel.kt", l = {73}, m = "invokeSuspend")
public final class C862220Xs4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceMusicSubstituteMusicListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862220Xs4(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, InterfaceC1364105Vn<? super C862220Xs4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceMusicSubstituteMusicListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862220Xs4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicListViewModel@a764.init$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ScopedMusicPlayer scopedMusicPlayer = this.LLILLJJLI.LLILLJJLI;
            if (scopedMusicPlayer == null) {
                scopedMusicPlayer = null;
            }
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(scopedMusicPlayer.LLILLL);
            AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLJJLI, 38);
            this.LL = 1;
            if (anonymousClass0951LIZIZ.collect(agS307S0100000_27, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceMusicSubstituteMusicListViewModel@a764.init$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
