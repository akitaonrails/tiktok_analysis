package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1445550nij extends C2217421BqW implements Function2<List<? extends PhotoModeImageUrlModel>, InterfaceC1445690nix, Unit> {
    public C1445550nij(C1445720nj0 c1445720nj0) {
        super(2, c1445720nj0, C1445720nj0.class, "downloadPhotoModeResource", "downloadPhotoModeResource(Ljava/util/List;Lcom/ss/android/ugc/aweme/shortvideo/editpost/ImageDownloadListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends PhotoModeImageUrlModel> list, InterfaceC1445690nix interfaceC1445690nix) {
        C1445720nj0 c1445720nj0 = (C1445720nj0) this.receiver;
        c1445720nj0.getClass();
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C118300cf c118300cf3 = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C23250099c.LIZLLL(c1445720nj0.LIZ, null, null, new C1445650nit(list, c118300cf2, c118300cf, interfaceC1445690nix, c1445720nj0, c118300cf3, c259800zU, jCurrentTimeMillis, null), 3);
        return Unit.LIZ;
    }
}
