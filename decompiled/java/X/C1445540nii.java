package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1445540nii extends C2217421BqW implements Function2<List<? extends PhotoModeImageUrlModel>, InterfaceC1445690nix, Unit> {
    public C1445540nii(C1445720nj0 c1445720nj0) {
        super(2, c1445720nj0, C1445720nj0.class, "downloadPhotoModeResourceNew", "downloadPhotoModeResourceNew(Ljava/util/List;Lcom/ss/android/ugc/aweme/shortvideo/editpost/ImageDownloadListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends PhotoModeImageUrlModel> list, InterfaceC1445690nix interfaceC1445690nix) {
        C1445720nj0 c1445720nj0 = (C1445720nj0) this.receiver;
        c1445720nj0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C23250099c.LIZLLL(c1445720nj0.LIZ, null, null, new C1445710niz(c1445720nj0, list, jCurrentTimeMillis, new AtomicInteger(0), new AtomicInteger(0), new AtomicReference(null), interfaceC1445690nix, atomicInteger, null), 3);
        return Unit.LIZ;
    }
}
