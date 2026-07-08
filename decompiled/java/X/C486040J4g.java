package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0J4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486040J4g implements C0J5P {
    public final /* synthetic */ C486050J4h LIZ;
    public final /* synthetic */ C0IOY LIZIZ;

    public C486040J4g(C486050J4h c486050J4h, C0IOT c0iot) {
        this.LIZ = c486050J4h;
        this.LIZIZ = c0iot;
    }

    @Override // X.C0J5P
    public final void LIZ(List<? extends Aweme> list, InterfaceC486120J4o interfaceC486120J4o) {
        this.LIZIZ.onSuccess(C485990J4b.LIZIZ(list, interfaceC486120J4o, this.LIZ.LIZIZ));
    }

    @Override // X.C0J5P
    public final void onFail(int i, String str) {
        this.LIZIZ.onFail(i);
    }
}
