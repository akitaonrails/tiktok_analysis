package X;

/* JADX INFO: renamed from: X.0JVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.repo.SuggestEmotePageRepo$operator$1", f = "SuggestEmotePageRepo.kt", l = {82, 88}, m = "submitEmoteList")
public final class C493000JVa extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0JVZ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493000JVa(C0JVZ c0jvz, InterfaceC1364105Vn<? super C493000JVa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0jvz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SuggestEmotePageRepo@7020.operator$1$submitEmoteList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objY = this.LLILLJJLI.Y(null, null, null, this);
        C1C7U.LIZIZ("SuggestEmotePageRepo@7020.operator$1$submitEmoteList$1");
        return objY;
    }
}
