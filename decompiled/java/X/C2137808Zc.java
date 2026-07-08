package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$copyDefaultVideoToLocal$2$1", f = "WelcomeVideoWidget.kt", l = {}, m = "invokeSuspend")
public final class C2137808Zc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WelcomeVideoWidget LL;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2137808Zc(WelcomeVideoWidget welcomeVideoWidget, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn, InterfaceC1364105Vn<? super C2137808Zc> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = welcomeVideoWidget;
        this.LLILLJJLI = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2137808Zc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        C1C7U.LIZ("WelcomeVideoWidget@634e.copyDefaultVideoToLocal$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        WelcomeVideoWidget welcomeVideoWidget = this.LL;
        Context context = welcomeVideoWidget.LL;
        String str = welcomeVideoWidget.LLIZLLLIL;
        C844470XAv.LIZ.getClass();
        File fileX2 = C786410Ut5.x2(C844470XAv.LIZ());
        if (fileX2 == null || (absolutePath = fileX2.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        c2137908Zd.LIZIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(absolutePath);
        if (c0vsj.exists() || c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getAbsoluteFile());
            sbLIZ.append("/");
            sbLIZ.append(str);
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            c0vsj2.exists();
            try {
                if (C2106108Mx.LIZIZ(context.getAssets().open(str), new C0VSV(c0vsj2))) {
                    c0vsj2.getAbsolutePath();
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILLJJLI;
        C189200o6.m2constructorimpl(true);
        interfaceC1364105Vn.resumeWith(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WelcomeVideoWidget@634e.copyDefaultVideoToLocal$2$1");
        return unit;
    }
}
