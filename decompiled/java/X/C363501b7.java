package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarGeckoResourceUtil$preloadGeckoResource$1$1$2", f = "SocialAvatarGeckoResourceUtil.kt", l = {}, m = "invokeSuspend")
public final class C363501b7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1533790q13 LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, File, String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363501b7(C1533790q13 c1533790q13, InterfaceC1631620sYq<? super Boolean, ? super File, ? super String, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C363501b7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1533790q13;
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363501b7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533810q15 c1533810q15;
        C1533810q15 c1533810q152;
        C1C7U.LIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1533790q13 c1533790q13 = this.LL;
        if (c1533790q13 != null) {
            C1533790q13.LJIIJ(c1533790q13);
        }
        C1533790q13 c1533790q132 = this.LL;
        if (c1533790q132 != null) {
            c1533810q15 = c1533790q132.LIZLLL;
        } else {
            c1533810q15 = null;
        }
        String.valueOf(c1533810q15);
        C1533790q13 c1533790q133 = this.LL;
        if (c1533790q133 != null && c1533790q133.LIZIZ) {
            File fileLJIIJ = C1533790q13.LJIIJ(c1533790q133);
            InterfaceC1631620sYq<Boolean, File, String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(true, fileLJIIJ, null);
            }
        } else {
            InterfaceC1631620sYq<Boolean, File, String, Unit> interfaceC1631620sYq2 = this.LLILLJJLI;
            if (interfaceC1631620sYq2 != null) {
                C1533790q13 c1533790q134 = this.LL;
                if (c1533790q134 != null) {
                    c1533810q152 = c1533790q134.LIZLLL;
                } else {
                    c1533810q152 = null;
                }
                interfaceC1631620sYq2.invoke(false, null, String.valueOf(c1533810q152));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
