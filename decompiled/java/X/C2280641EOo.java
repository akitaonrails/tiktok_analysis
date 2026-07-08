package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1EOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280641EOo implements IAwemeService {
    public static final C2280641EOo LIZIZ = new C2280641EOo();
    public final /* synthetic */ IAwemeService LIZ = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Ar(String str) {
        return this.LIZ.Ar(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Br(int i, String str) {
        this.LIZ.Br(i, str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Cr() {
        this.LIZ.Cr();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Dr(Aweme aweme, long j) {
        this.LIZ.Dr(aweme, j);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Er(String str) {
        return this.LIZ.Er(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Fr(String str) {
        return this.LIZ.Fr(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Gr(String str) {
        return this.LIZ.Gr(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Hr(String str) {
        this.LIZ.Hr(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Ir(int i, Aweme aweme) {
        return this.LIZ.Ir(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme LLILLL(Aweme aweme) {
        return this.LIZ.LLILLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme LLILZ(String str) {
        return this.LIZ.LLILZ(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void clearCache() {
        this.LIZ.clearCache();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void sr(long j, String str) {
        this.LIZ.sr(j, str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme tr(int i, String str) {
        return this.LIZ.tr(i, str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void ur(long j, String str) {
        this.LIZ.ur(j, str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme vr(Aweme aweme) {
        return this.LIZ.vr(aweme);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final boolean wr(Aweme aweme) {
        return this.LIZ.wr(aweme);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme xr(String str) {
        return this.LIZ.xr(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void yr(int i, String str) {
        this.LIZ.yr(i, str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme zr(String str) {
        return this.LIZ.zr(str);
    }
}
