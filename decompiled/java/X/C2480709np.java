package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinLottieImageWidget$showLottieImage$2$2", f = "BulletinLottieImageWidget.kt", l = {}, m = "invokeSuspend")
public final class C2480709np extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1294720jnS LL;
    public final /* synthetic */ C2481009ns LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ BulletinGeckoResourceModel LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480709np(C1294720jnS c1294720jnS, C2481009ns c2481009ns, Function0<Unit> function0, BulletinGeckoResourceModel bulletinGeckoResourceModel, Function0<Unit> function02, InterfaceC1364105Vn<? super C2480709np> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1294720jnS;
        this.LLILLJJLI = c2481009ns;
        this.LLILLL = function0;
        this.LLILZ = bulletinGeckoResourceModel;
        this.LLILZIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2480709np(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinLottieImageWidget@f8b2.showLottieImage$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            C2481009ns c2481009ns = this.LLILLJJLI;
            C1295960jpS c1295960jpS = c2481009ns.LIZLLL;
            if (c1295960jpS != null) {
                c1295960jpS.addAnimatorListener(c2481009ns.LJII);
            }
            C2481009ns c2481009ns2 = this.LLILLJJLI;
            if (c2481009ns2.LJFF == EnumC2480809nq.LLILLJJLI) {
                C1295960jpS c1295960jpS2 = c2481009ns2.LIZLLL;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.setComposition(this.LL);
                }
                if (this.LLILLL != null) {
                    C2481009ns c2481009ns3 = this.LLILLJJLI;
                    if (!C0OS8.LJI()) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c2481009ns3.LIZIZ);
                        sbLIZ.append("-BulletinLottieImageWidget: LoadLottieImage: need Awaiting_sync,  playWhenLoaded: ");
                        sbLIZ.append(c2481009ns3.LJI);
                        sbLIZ.append(' ');
                        C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LLILLJJLI.LJFF = EnumC2480809nq.LLILZIL;
                    this.LLILLL.invoke();
                } else {
                    C2481009ns c2481009ns4 = this.LLILLJJLI;
                    if (!C0OS8.LJI()) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c2481009ns4.LIZIZ);
                        sbLIZ2.append("-BulletinLottieImageWidget: LoadLottieImage: Just Loaded, playWhenLoaded: ");
                        sbLIZ2.append(c2481009ns4.LJI);
                        sbLIZ2.append(' ');
                        C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C2481009ns c2481009ns5 = this.LLILLJJLI;
                    c2481009ns5.LJFF = EnumC2480809nq.LLILLL;
                    if (c2481009ns5.LJI) {
                        c2481009ns5.LJIILJJIL();
                    }
                }
            }
        } else {
            C2481009ns c2481009ns6 = this.LLILLJJLI;
            if (!C0OS8.LJI()) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c2481009ns6.LIZIZ);
                sbLIZ3.append("-BulletinLottieImageWidget: LoadLottieImage: Lottie File parse failed, fallback to static image");
                C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.LLILLJJLI.LJI(this.LLILZ, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showLottieImage$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
