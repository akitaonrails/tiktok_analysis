package X;

import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0kau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem$prepareUrlToLoad$1", f = "AwemeCardAssem.kt", l = {}, m = "invokeSuspend")
public final class C1325380kau extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImageComponent LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ AwemeCardAssem LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ShapeDrawable LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ AbstractC1335900krs LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325380kau(ImageComponent imageComponent, C869590Y9l c869590Y9l, AwemeCardAssem awemeCardAssem, String str, ShapeDrawable shapeDrawable, boolean z, String str2, AbstractC1335900krs abstractC1335900krs, InterfaceC1364105Vn<? super C1325380kau> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imageComponent;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = awemeCardAssem;
        this.LLILZ = str;
        this.LLILZIL = shapeDrawable;
        this.LLILZLL = z;
        this.LLIZ = str2;
        this.LLIZLLLIL = abstractC1335900krs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325380kau(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C592490NLr c592490NLrLIZ;
        C1335740krc c1335740krc;
        final File file;
        String str;
        List<String> list;
        C1C7U.LIZ("AwemeCardAssem@3383.prepareUrlToLoad$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get(C06TB.DEFAULT.getSpace());
        ImageComponent imageComponent = this.LL;
        if (imageComponent != null && (list = imageComponent.urls) != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c592490NLrLIZ = C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(UriProtector.parse((String) ListProtector.get(this.LL.urls, 0))), null);
            if (interfaceC1326920kdO != null && interfaceC1326920kdO.LJII(c592490NLrLIZ)) {
                C869590Y9l c869590Y9l = this.LLILLJJLI;
                AwemeCardAssem awemeCardAssem = this.LLILLL;
                ShapeDrawable shapeDrawable = this.LLILZIL;
                boolean z2 = this.LLILZLL;
                String str2 = this.LLIZ;
                AbstractC1335900krs abstractC1335900krs = this.LLIZLLLIL;
                ImageComponent imageComponent2 = this.LL;
                awemeCardAssem.getClass();
                AwemeCardAssem.Xp(c869590Y9l, awemeCardAssem, shapeDrawable, z2, str2, abstractC1335900krs, AwemeCardAssem.fq(imageComponent2));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AwemeCardAssem@3383.prepareUrlToLoad$1");
                return unit;
            }
        } else {
            c592490NLrLIZ = null;
        }
        ImageComponent imageComponent3 = this.LL;
        if (imageComponent3 != null && (str = imageComponent3.id) != null) {
            String str3 = this.LLILZ;
            C869590Y9l c869590Y9l2 = this.LLILLJJLI;
            AwemeCardAssem awemeCardAssem2 = this.LLILLL;
            ShapeDrawable shapeDrawable2 = this.LLILZIL;
            boolean z3 = this.LLILZLL;
            String str4 = this.LLIZ;
            AbstractC1335900krs abstractC1335900krs2 = this.LLIZLLLIL;
            if (!a0.LJJIIZI(str3, str, false)) {
                awemeCardAssem2.getClass();
                AwemeCardAssem.Xp(c869590Y9l2, awemeCardAssem2, shapeDrawable2, z3, str4, abstractC1335900krs2, AwemeCardAssem.fq(imageComponent3));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AwemeCardAssem@3383.prepareUrlToLoad$1");
                return unit2;
            }
        }
        Uri uri = UriProtector.parse(this.LLILZ);
        InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
        if (interfaceC1325460kb2LIZJ != null && interfaceC1325460kb2LIZJ.LJIIIZ(uri)) {
            InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null));
            if ((interfaceC1317730kOZLJIIJ instanceof C1335740krc) && (c1335740krc = (C1335740krc) interfaceC1317730kOZLJIIJ) != null && (file = c1335740krc.LIZ) != null && c592490NLrLIZ != null) {
                if (interfaceC1326920kdO != null) {
                    try {
                        try {
                            interfaceC1326920kdO.LJIIIIZZ(c592490NLrLIZ, new InterfaceC1327040kda() { // from class: X.0kaj
                                @Override // X.InterfaceC1327040kda
                                public final void LIZ(C1335560krK c1335560krK) throws Throwable {
                                    C0VSP c0vsp = new C0VSP(file);
                                    try {
                                        try {
                                            C2106208My.LIZ(c0vsp, c1335560krK);
                                            C2107108Nh.LIZ(c1335560krK, null);
                                            C2107108Nh.LIZ(c0vsp, null);
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    while (true) {
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C2107108Nh.LIZ(c1335560krK, th);
                                                            throw th;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                th = null;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        try {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                TryCatchGuardChecker.doCheck(th);
                                                C2107108Nh.LIZ(c0vsp, th);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th = null;
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(c0vsp, th);
                                            throw th;
                                        }
                                    }
                                }
                            });
                            C869590Y9l c869590Y9l3 = this.LLILLJJLI;
                            AwemeCardAssem awemeCardAssem3 = this.LLILLL;
                            ShapeDrawable shapeDrawable3 = this.LLILZIL;
                            boolean z4 = this.LLILZLL;
                            String str5 = this.LLIZ;
                            AbstractC1335900krs abstractC1335900krs3 = this.LLIZLLLIL;
                            ImageComponent imageComponent4 = this.LL;
                            awemeCardAssem3.getClass();
                            AwemeCardAssem.Xp(c869590Y9l3, awemeCardAssem3, shapeDrawable3, z4, str5, abstractC1335900krs3, AwemeCardAssem.fq(imageComponent4));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C869590Y9l c869590Y9l4 = this.LLILLJJLI;
                            AwemeCardAssem awemeCardAssem4 = this.LLILLL;
                            ShapeDrawable shapeDrawable4 = this.LLILZIL;
                            boolean z5 = this.LLILZLL;
                            String str6 = this.LLIZ;
                            AbstractC1335900krs abstractC1335900krs4 = this.LLIZLLLIL;
                            ImageComponent imageComponent5 = this.LL;
                            awemeCardAssem4.getClass();
                            AwemeCardAssem.Xp(c869590Y9l4, awemeCardAssem4, shapeDrawable4, z5, str6, abstractC1335900krs4, AwemeCardAssem.fq(imageComponent5));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C869590Y9l c869590Y9l5 = this.LLILLJJLI;
                        AwemeCardAssem awemeCardAssem5 = this.LLILLL;
                        ShapeDrawable shapeDrawable5 = this.LLILZIL;
                        boolean z6 = this.LLILZLL;
                        String str7 = this.LLIZ;
                        AbstractC1335900krs abstractC1335900krs5 = this.LLIZLLLIL;
                        ImageComponent imageComponent6 = this.LL;
                        awemeCardAssem5.getClass();
                        AwemeCardAssem.Xp(c869590Y9l5, awemeCardAssem5, shapeDrawable5, z6, str7, abstractC1335900krs5, AwemeCardAssem.fq(imageComponent6));
                        throw th;
                    }
                } else {
                    C869590Y9l c869590Y9l32 = this.LLILLJJLI;
                    AwemeCardAssem awemeCardAssem32 = this.LLILLL;
                    ShapeDrawable shapeDrawable32 = this.LLILZIL;
                    boolean z42 = this.LLILZLL;
                    String str52 = this.LLIZ;
                    AbstractC1335900krs abstractC1335900krs32 = this.LLIZLLLIL;
                    ImageComponent imageComponent42 = this.LL;
                    awemeCardAssem32.getClass();
                    AwemeCardAssem.Xp(c869590Y9l32, awemeCardAssem32, shapeDrawable32, z42, str52, abstractC1335900krs32, AwemeCardAssem.fq(imageComponent42));
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("AwemeCardAssem@3383.prepareUrlToLoad$1");
                return unit3;
            }
        } else {
            C869590Y9l c869590Y9l6 = this.LLILLJJLI;
            AwemeCardAssem awemeCardAssem6 = this.LLILLL;
            ShapeDrawable shapeDrawable6 = this.LLILZIL;
            boolean z7 = this.LLILZLL;
            String str8 = this.LLIZ;
            AbstractC1335900krs abstractC1335900krs6 = this.LLIZLLLIL;
            ImageComponent imageComponent7 = this.LL;
            awemeCardAssem6.getClass();
            AwemeCardAssem.Xp(c869590Y9l6, awemeCardAssem6, shapeDrawable6, z7, str8, abstractC1335900krs6, AwemeCardAssem.fq(imageComponent7));
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AwemeCardAssem@3383.prepareUrlToLoad$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
