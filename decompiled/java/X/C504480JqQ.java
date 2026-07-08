package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.HomePageResponse;

/* JADX INFO: renamed from: X.0JqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504480JqQ extends C09AY implements Function1<C506330JtP, C506330JtP> {
    public final /* synthetic */ C470590Icr<HomePageResponse.ResponseData> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504480JqQ(C470590Icr<HomePageResponse.ResponseData> c470590Icr) {
        super(1);
        this.LL = c470590Icr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C506330JtP invoke(C506330JtP c506330JtP) {
        return C506330JtP.LIZ(c506330JtP, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(this.LL.data), 4095);
    }
}
