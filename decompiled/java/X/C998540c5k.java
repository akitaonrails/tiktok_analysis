package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998540c5k extends C09AY implements Function0<ViewOnLayoutChangeListenerC998530c5j> {
    public final /* synthetic */ C999500c7I LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998540c5k(C999500c7I c999500c7I) {
        super(0);
        this.LL = c999500c7I;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewOnLayoutChangeListenerC998530c5j invoke() {
        return new ViewOnLayoutChangeListenerC998530c5j(this.LL);
    }
}
