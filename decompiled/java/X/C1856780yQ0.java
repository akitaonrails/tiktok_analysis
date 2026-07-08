package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0yQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856780yQ0 implements InterfaceC1856750yPx, InterfaceC1587906Jp {
    public final /* synthetic */ Message LL;
    public final /* synthetic */ List<BaseImage> LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ List<ImageAction> LLILZ;

    @Override // X.InterfaceC1856750yPx
    public final boolean LJLL() {
        return false;
    }

    @Override // X.InterfaceC1856750yPx
    public final boolean LL() {
        return true;
    }

    @Override // X.InterfaceC1856750yPx
    public final long LLIZ() {
        return 0L;
    }

    @Override // X.InterfaceC1856750yPx
    public final String LJJIJLIJ() {
        String str;
        Message message = this.LL;
        return (message == null || (str = message.uuid) == null) ? "" : str;
    }

    @Override // X.InterfaceC1856750yPx
    public final int LJJJLZIJ() {
        return this.LLILLJJLI.size();
    }

    @Override // X.InterfaceC1856750yPx
    public final float LJJJJLI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<ImageAction> LJZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<String> LLJJL() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<BaseImage> getImageData() {
        return this.LLILLJJLI;
    }

    public C1856780yQ0(Message message, List<BaseImage> list, float f, List<ImageAction> list2) {
        this.LL = message;
        this.LLILLJJLI = list;
        this.LLILLL = f;
        this.LLILZ = list2;
    }
}
