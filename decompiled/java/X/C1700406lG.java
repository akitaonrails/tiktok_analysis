package X;

import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06lG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.DMAIGroupShotAnchorMaker$whenMyAnchorClicked$1", f = "DMAIGroupShotAnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C1700406lG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700406lG(C19EG c19eg, int i, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C1700406lG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1700406lG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1682806iQ abstractC1682806iQLIZ;
        C1C7U.LIZ("DMAIGroupShotAnchorMaker@860f.whenMyAnchorClicked$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1700606lI c1700606lI = C1700606lI.LIZIZ;
        C19EG c19eg = this.LL;
        AIGroupShotEntry.InChat.InChatAnchor inChatAnchor = AIGroupShotEntry.InChat.InChatAnchor.INSTANCE;
        if (this.LLILLJJLI == 3) {
            abstractC1682806iQLIZ = new C1682706iP(this.LLILLL);
        } else {
            abstractC1682806iQLIZ = C1682506iN.LIZ(this.LLILLL);
        }
        c1700606lI.LIZJ(c19eg, inChatAnchor, abstractC1682806iQLIZ, this.LLILZ, this.LLILZIL, this.LLILZLL, C2286608xc.LJ(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAIGroupShotAnchorMaker@860f.whenMyAnchorClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
