package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS16S0401000_21;
import njp.a;

/* JADX INFO: renamed from: X.0lde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonShareManager$initShareChannelListener$channelListener$1$onChannelRealClicked$1", f = "SkeletonShareManager.kt", l = {196}, m = "invokeSuspend")
public final class C1365520lde extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1371590lnR LLILLL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLIZ;
    public final /* synthetic */ InterfaceC1362720lZ8 LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365520lde(C1371590lnR c1371590lnR, InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C259800zU<DialogC1389620mGW> c259800zU, InterfaceC1362720lZ8 interfaceC1362720lZ8, int i, InterfaceC1364105Vn<? super C1365520lde> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1371590lnR;
        this.LLILZ = interfaceC1369790lkX;
        this.LLILZIL = context;
        this.LLILZLL = view;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = interfaceC1362720lZ8;
        this.LLJ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1365520lde c1365520lde = new C1365520lde(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1365520lde.LLILLJJLI = obj;
        return c1365520lde;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, X.0mGW] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C1357480lQg(this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1");
                return objLJFF;
            }
        }
        final C1371590lnR c1371590lnR = this.LLILLL;
        final InterfaceC1362720lZ8 interfaceC1362720lZ8 = this.LLIZLLLIL;
        C0M7Y c0m7y = new C0M7Y() { // from class: X.0ldg
            @Override // X.C0M7Y
            public final View LIZIZ() {
                C1264130j07 c1264130j07 = c1371590lnR.LJJL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371590lnR.LJJZZI;
                return (View) c1264130j07.LIZ.get();
            }

            @Override // X.C0M7Y
            public final InterfaceC1362720lZ8 LIZ() {
                return interfaceC1362720lZ8;
            }
        };
        BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
        InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZ;
        Context context = this.LLILZIL;
        if (!baseSharePackage.LJII(interfaceC1369790lkX, context, this.LLILZLL, c0m7y, new AwS16S0401000_21(c1371590lnR, interfaceC1369790lkX, this.LLJ, context, interfaceC1362720lZ8, 2))) {
            if (C1366550lfJ.LIZ(this.LLILZ.key())) {
                C259800zU<DialogC1389620mGW> c259800zU = this.LLIZ;
                if (c259800zU.element == null) {
                    c259800zU.element = new DialogC1389620mGW(this.LLILZIL);
                    DialogC1389620mGW dialogC1389620mGW = this.LLIZ.element;
                    if (dialogC1389620mGW != null) {
                        dialogC1389620mGW.LJJLJ(R.string.txr);
                    }
                }
                InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
                if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZIZ() != null) {
                    C1369930lkl.LIZ(this.LLIZ.element);
                }
                C571830Mbl.LIZIZ(this.LLIZ.element);
            }
            C1371590lnR c1371590lnR2 = this.LLILLL;
            BaseSharePackage baseSharePackage2 = c1371590lnR2.LJIJJ;
            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LLILZ;
            baseSharePackage2.LJIJ(interfaceC1369790lkX2, new C1365530ldf(interfaceC1369790lkX2, this.LLILZIL, c1371590lnR2, this.LLJ, this.LLIZLLLIL, this.LLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkeletonShareManager@3a5b.initShareChannelListener$channelListener$1$onChannelRealClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
