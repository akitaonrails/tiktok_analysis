package X;

import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06lH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.DMAIGroupShotAnchorMaker$whenMyAnchorClicked$2", f = "DMAIGroupShotAnchorMaker.kt", l = {96}, m = "invokeSuspend")
public final class C1700506lH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700506lH(C19EG c19eg, String str, String str2, String str3, InterfaceC1364105Vn<? super C1700506lH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1700506lH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMAIGroupShotAnchorMaker@860f.whenMyAnchorClicked$2");
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
            C1700606lI c1700606lI = C1700606lI.LIZIZ;
            C19EG c19eg = this.LLILLJJLI;
            AIGroupShotEntry.OutChat.OutChatAnchor outChatAnchor = AIGroupShotEntry.OutChat.OutChatAnchor.INSTANCE;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            this.LL = 1;
            if (c1700606lI.LIZ(c19eg, outChatAnchor, str, str2, str3, this) == objLJFF) {
                C1C7U.LIZIZ("DMAIGroupShotAnchorMaker@860f.whenMyAnchorClicked$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAIGroupShotAnchorMaker@860f.whenMyAnchorClicked$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
