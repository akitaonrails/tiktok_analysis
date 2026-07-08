package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionStrategyService;
import java.util.List;

/* JADX INFO: renamed from: X.162B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162B implements ICaptionStrategyService {
    public static final C162B LIZIZ = new C162B();
    public final /* synthetic */ ICaptionStrategyService LIZ = (ICaptionStrategyService) ServiceManager.get().getService(ICaptionStrategyService.class);

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final C05YD<Boolean> Ug() {
        return this.LIZ.Ug();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final boolean Vg(Aweme aweme) {
        return this.LIZ.Vg(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Wg(int i) {
        this.LIZ.Wg(i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Xg() {
        this.LIZ.Xg();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Yg() {
        this.LIZ.Yg();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void Zg(long j, String str) {
        this.LIZ.Zg(j, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void ah(String str, String str2) {
        this.LIZ.ah(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void bh(Integer num, List list) {
        this.LIZ.bh(num, list);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final int ch(Aweme aweme) {
        return this.LIZ.ch(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final C01S9<C207042160a> dh() {
        return this.LIZ.dh();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionStrategyService
    public final void eh(Aweme aweme, C00I7 c00i7) {
        this.LIZ.eh(aweme, c00i7);
    }
}
