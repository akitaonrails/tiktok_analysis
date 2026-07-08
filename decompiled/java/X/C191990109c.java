package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.109c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191990109c extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C191983108v LL;
    public final /* synthetic */ C109U LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C191976108o LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191990109c(C191983108v c191983108v, C109U c109u, boolean z, int i, C191976108o c191976108o) {
        super(0);
        this.LL = c191983108v;
        this.LLILLJJLI = c109u;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = c191976108o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C191983108v c191983108v = this.LL;
        C109U c109u = this.LLILLJJLI;
        c191983108v.LIZLLL(c109u.LLJILJIL.LLILLL.getValue(), Integer.valueOf(this.LLILZ), c109u.LLJILJILJ.LIZLLL, this.LLILLL);
        this.LLILZIL.getClass();
        return Unit.LIZ;
    }
}
