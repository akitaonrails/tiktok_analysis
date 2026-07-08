package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532200pyU extends C1530890pwN {
    public final InterfaceC1532190pyT LLILZLL;
    public final InterfaceC1532190pyT LLIZ;

    @Override // X.C1530890pwN, X.InterfaceC1532190pyT
    public final String getFilepath() {
        String filepath = this.LLILZLL.getFilepath();
        return filepath == null ? this.LLIZ.getFilepath() : filepath;
    }

    @Override // X.C1530890pwN, X.InterfaceC1532190pyT
    public final Map<String, String> getHttpResponseHeaders() {
        Map<String, String> httpResponseHeaders = this.LLILZLL.getHttpResponseHeaders();
        return httpResponseHeaders == null ? this.LLIZ.getHttpResponseHeaders() : httpResponseHeaders;
    }

    @Override // X.C1530890pwN, X.InterfaceC1532190pyT
    public final Integer getResourceSize() {
        Integer resourceSize = this.LLILZLL.getResourceSize();
        return resourceSize == null ? this.LLIZ.getResourceSize() : resourceSize;
    }

    @Override // X.C1530890pwN, X.InterfaceC1532190pyT
    public final String getResourceUniqueId() {
        String resourceUniqueId = this.LLILZLL.getResourceUniqueId();
        return resourceUniqueId == null ? this.LLIZ.getResourceUniqueId() : resourceUniqueId;
    }

    @Override // X.C1530890pwN, X.InterfaceC1532190pyT
    public final Long getVersion() {
        Long version = this.LLILZLL.getVersion();
        return version == null ? this.LLIZ.getVersion() : version;
    }

    public C1532200pyU(InterfaceC1532190pyT interfaceC1532190pyT, InterfaceC1532190pyT interfaceC1532190pyT2) {
        super(null, null, null, null, null, 31);
        this.LLILZLL = interfaceC1532190pyT;
        this.LLIZ = interfaceC1532190pyT2;
    }
}
