package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.189B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189B extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C21241518Ar LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189B(C21241518Ar c21241518Ar, C013C c013c) {
        super(0);
        this.LL = c013c;
        this.LLILLJJLI = c21241518Ar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.LL.element = true;
        return Boolean.valueOf(((C18EH) this.LLILLJJLI.LIZJ.getValue()).LIZJ(this.LLILLJJLI.LJ));
    }
}
