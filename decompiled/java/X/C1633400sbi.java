package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$handleError$2", f = "StreamFetchOrchestrator.kt", l = {222, 227, 230}, m = "invokeSuspend")
public final class C1633400sbi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public PanelInfoModel LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1633200sbO LLILZIL;
    public final /* synthetic */ C1633200sbO LLILZLL;
    public final /* synthetic */ AnonymousClass0957<Pair<HorizontalEffectsModel, PanelInfoModel>> LLIZ;
    public final /* synthetic */ C1633470sbp LLIZLLLIL;
    public final /* synthetic */ InterfaceC1633630sc5 LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1633400sbi(C1633200sbO c1633200sbO, C1633200sbO c1633200sbO2, AnonymousClass0957<? extends Pair<HorizontalEffectsModel, ? extends PanelInfoModel>> anonymousClass0957, C1633470sbp c1633470sbp, InterfaceC1633630sc5 interfaceC1633630sc5, int i, InterfaceC1364105Vn<? super C1633400sbi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1633200sbO;
        this.LLILZLL = c1633200sbO2;
        this.LLIZ = anonymousClass0957;
        this.LLIZLLLIL = c1633470sbp;
        this.LLJ = interfaceC1633630sc5;
        this.LLJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1633400sbi c1633400sbi = new C1633400sbi(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1633400sbi.LLILZ = obj;
        return c1633400sbi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1633400sbi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
