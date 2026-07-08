package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.064Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.ShareHelper$downloadVideoAsync$2", f = "ShareHelper.kt", l = {745}, m = "invokeSuspend")
public final class C064Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Boolean>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ Aweme LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ SharePackage LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064Y(Context context, View view, Aweme aweme, String str, SharePackage sharePackage, InterfaceC1364105Vn<? super C064Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = context;
        this.LLILZLL = view;
        this.LLIZ = aweme;
        this.LLIZLLLIL = str;
        this.LLJ = sharePackage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064Y(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("ShareHelper@8fdf.downloadVideoAsync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            Context context = this.LLILZIL;
            View view = this.LLILZLL;
            Aweme aweme = this.LLIZ;
            String str = this.LLIZLLLIL;
            final SharePackage sharePackage = this.LLJ;
            this.LL = context;
            this.LLILLJJLI = view;
            this.LLILLL = str;
            this.LLILZ = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            final C238400w2 c238400w22 = new C238400w2();
            c238400w22.element = System.currentTimeMillis();
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            Activity activityLIZ = C1388190mED.LIZ(context);
            boolean zLJFF = Intrinsics.LJFF(str, "instagram");
            int i2 = sharePackage.extras.getInt("page_type");
            AbstractC1375080lt4 abstractC1375080lt4 = new AbstractC1375080lt4() { // from class: X.064Z
                @Override // X.AbstractC1375080lt4
                public final void LIZ(String str2) {
                    c238400w22.element = System.currentTimeMillis();
                    sharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    InterfaceC20236714Gf<Pair<String, Boolean>> interfaceC20236714Gf = c2252611DEt;
                    Pair pair = new Pair(null, Boolean.FALSE);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC20236714Gf.resumeWith(pair);
                }

                @Override // X.AbstractC1375080lt4
                public final void LIZJ(String str2) {
                    c238400w22.element = System.currentTimeMillis();
                    sharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    InterfaceC20236714Gf<Pair<String, Boolean>> interfaceC20236714Gf = c2252611DEt;
                    Pair pair = new Pair(null, Boolean.FALSE);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC20236714Gf.resumeWith(pair);
                }

                @Override // X.AbstractC1375080lt4
                public final void LJFF(String str2, String str3, boolean z) {
                    c238400w22.element = System.currentTimeMillis();
                    sharePackage.extras.putLong("download_duration", c238400w22.element - c238400w2.element);
                    InterfaceC20236714Gf<Pair<String, Boolean>> interfaceC20236714Gf = c2252611DEt;
                    Pair pair = new Pair(str2, Boolean.TRUE);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC20236714Gf.resumeWith(pair);
                }
            };
            String string = sharePackage.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            c1373540lqa.getClass();
            C1373540lqa.LIZJ(activityLIZ, view, aweme, zLJFF, i2, str, abstractC1375080lt4, string, sharePackage);
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("ShareHelper@8fdf.downloadVideoAsync$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareHelper@8fdf.downloadVideoAsync$2");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
