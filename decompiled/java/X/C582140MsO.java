package X;

import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C582140MsO implements Function1 {
    public final /* synthetic */ PlayerController LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    public /* synthetic */ C582140MsO(PlayerController playerController, Aweme aweme, boolean z, int i) {
        this.LL = playerController;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PlayerController.LLILZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, (Aweme) obj);
    }
}
