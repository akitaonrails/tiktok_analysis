package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$warmUpFirstScreenAssetsSuspend$2", f = "MediaProvider.kt", l = {}, m = "invokeSuspend")
public final class C1418605gu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C540820LIy LLILLJJLI;
    public final /* synthetic */ List<SocMediaResource> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0L20 LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C238400w2 LLIZ;
    public final /* synthetic */ List<SocMediaResource> LLIZLLLIL;
    public final /* synthetic */ C0L20 LLJ;
    public final /* synthetic */ C238400w2 LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418605gu(C540820LIy c540820LIy, List<SocMediaResource> list, int i, C0L20 c0l20, boolean z, C238400w2 c238400w2, List<SocMediaResource> list2, C0L20 c0l202, C238400w2 c238400w22, InterfaceC1364105Vn<? super C1418605gu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c540820LIy;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = c0l20;
        this.LLILZLL = z;
        this.LLIZ = c238400w2;
        this.LLIZLLLIL = list2;
        this.LLJ = c0l202;
        this.LLJI = c238400w22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418605gu c1418605gu = new C1418605gu(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1418605gu.LL = obj;
        return c1418605gu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1418505gt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null), 3);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1418705gv(this.LLILLJJLI, this.LLIZLLLIL, this.LLJ, this.LLILZLL, this.LLJI, null), 3);
        C1C7U.LIZIZ("MediaProvider@7017.warmUpFirstScreenAssetsSuspend$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
