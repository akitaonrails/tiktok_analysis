package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioFetcher$start$1", f = "ReuseAudioFetcher.kt", l = {68}, m = "invokeSuspend")
public final class C2218408mc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20019813Uu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218408mc(C20019813Uu c20019813Uu, InterfaceC1364105Vn<? super C2218408mc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20019813Uu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2218408mc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReuseAudioFetcher@f825.start$1");
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
            C20019813Uu c20019813Uu = this.LLILLJJLI;
            if (c20019813Uu.LIZIZ == null) {
                c20019813Uu.LIZIZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C20019513Ur(c20019813Uu, c20019813Uu.LIZ, null), 2);
            }
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            if (anonymousClass0956.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("ReuseAudioFetcher@f825.start$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReuseAudioFetcher@f825.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
