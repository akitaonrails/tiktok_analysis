package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145370fuZ extends C09AY implements Function1<C449901p3, C449901p3> {
    public final /* synthetic */ AbstractC1145470fuj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145370fuZ(AbstractC1145470fuj abstractC1145470fuj) {
        super(1);
        this.LL = abstractC1145470fuj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C449901p3 invoke(C449901p3 c449901p3) {
        C291001Au c291001Au = new C291001Au(this.LL);
        c449901p3.getClass();
        return new C449901p3((C291001Au<? extends AbstractC1145470fuj>) c291001Au);
    }
}
