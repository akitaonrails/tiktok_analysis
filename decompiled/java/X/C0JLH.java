package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0JLH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLH extends C09AY implements Function1<C0JLJ, C0JLJ> {
    public final /* synthetic */ SMBPreviewResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLH(SMBPreviewResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JLJ invoke(C0JLJ c0jlj) {
        C0JLD c0jld = new C0JLD(this.LL);
        c0jlj.getClass();
        return new C0JLJ(c0jld);
    }
}
