package X;

/* JADX INFO: renamed from: X.0LfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitGenerationDraftComponent", f = "AIPortraitGenerationDraftComponent.kt", l = {111, 119}, m = "executeSaveDraftInternal-gIAlu-s")
public final class C548650LfT extends AbstractC23140094w {
    public C548630LfR LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C548630LfR LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548650LfT(C548630LfR c548630LfR, InterfaceC1364105Vn<? super C548650LfT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c548630LfR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitGenerationDraftComponent@2dc5.executeSaveDraftInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZ1 = this.LLILLL.Z1(null, this);
        if (objZ1 == C099R.LJFF()) {
            C1C7U.LIZIZ("AIPortraitGenerationDraftComponent@2dc5.executeSaveDraftInternal$1");
            return objZ1;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objZ1);
        C1C7U.LIZIZ("AIPortraitGenerationDraftComponent@2dc5.executeSaveDraftInternal$1");
        return c189200o6M1boximpl;
    }
}
