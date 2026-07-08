package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.task.ChoosePreFetchMusicTask$runTask$1", f = "ChoosePreFetchMusicTask.kt", l = {31}, m = "invokeSuspend")
public final class C526260KkS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C523590Kg9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526260KkS(C523590Kg9 c523590Kg9, InterfaceC1364105Vn<? super C526260KkS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c523590Kg9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526260KkS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChoosePreFetchMusicTask@d2a4.runTask$1");
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
            ITemplateMusicService iTemplateMusicServiceLIZ = C524940KiK.LIZ();
            if (iTemplateMusicServiceLIZ != null) {
                String str = this.LLILLJJLI.LLIZLLLIL;
                this.LL = 1;
                obj = iTemplateMusicServiceLIZ.LIZIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChoosePreFetchMusicTask@d2a4.runTask$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LLJIJIL.invoke();
            this.LLILLJJLI.LJIIJ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChoosePreFetchMusicTask@d2a4.runTask$1");
            return unit;
        }
        if (obj != null) {
            this.LLILLJJLI.LLJI.invoke((AVMusic) obj);
        } else {
            this.LLILLJJLI.LLJIJIL.invoke();
        }
        this.LLILLJJLI.LJIIJ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChoosePreFetchMusicTask@d2a4.runTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
