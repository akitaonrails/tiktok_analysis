package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$saveDraft$1$1", f = "EffectEditVM.kt", l = {612, 609}, m = "invokeSuspend")
public final class C1736560vI6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public CKEDraftExtraInfo LLILLJJLI;
    public CKEDraftInfo LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1736830vIX LLILZLL;
    public final /* synthetic */ EffectEditVM LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ DraftSavedExtraData LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736560vI6(C1736830vIX c1736830vIX, EffectEditVM effectEditVM, String str, DraftSavedExtraData draftSavedExtraData, InterfaceC1364105Vn<? super C1736560vI6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1736830vIX;
        this.LLIZ = effectEditVM;
        this.LLIZLLLIL = str;
        this.LLJ = draftSavedExtraData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1736560vI6(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8 A[PHI: r1
      0x00f8: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:51:0x00f5, B:36:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1736560vI6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
