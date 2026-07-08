package X;

import com.bytedance.android.starship.solaria.profile.repository.ProfileQueryParams;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileApi;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0epS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103760epS extends C09AY implements Function0<SolariaProfileApi> {
    public C1103760epS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.starship.solaria.profile.repository.SolariaProfileApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SolariaProfileApi invoke() {
        ?? Create;
        InterfaceC2661011f interfaceC2661011f = (InterfaceC2661011f) C1103770epT.LIZIZ.getValue();
        return (interfaceC2661011f == null || (Create = interfaceC2661011f.create(SolariaProfileApi.class)) == 0) ? new SolariaProfileApi() { // from class: X.0epN
            public final C1103720epO LIZ = new C11NZ<n>() { // from class: X.0epO
                @Override // X.C11NZ
                public final void LJJZZIII(InterfaceC626120Oh8<? super n> interfaceC626120Oh8) {
                }
            };

            @Override // com.bytedance.android.starship.solaria.profile.repository.SolariaProfileApi
            public final C11NZ<n> fetchProfiles() {
                return this.LIZ;
            }

            @Override // com.bytedance.android.starship.solaria.profile.repository.SolariaProfileApi
            public final C11NZ<n> fetchProfiles(ProfileQueryParams profileQueryParams) {
                return this.LIZ;
            }
        } : Create;
    }
}
