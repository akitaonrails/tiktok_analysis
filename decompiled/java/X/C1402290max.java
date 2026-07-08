package X;

import com.ss.android.ugc.aweme.DanmakuLandscapePresentAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.model.IDanmakuData;

/* JADX INFO: renamed from: X.0max, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402290max implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$0(C1402290max c1402290max) {
    }

    public static final /* synthetic */ void LIZIZ$1(C1402290max c1402290max) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
        }
    }

    public static final void LIZ$0(C1402290max c1402290max) {
        DanmakuLandscapePresentAssem.Ep((DanmakuLandscapePresentAssem) c1402290max.l0, (IDanmakuData) c1402290max.l1);
    }

    public static final void LIZ$1(C1402290max c1402290max) {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) c1402290max.l0;
        IDanmakuData iDanmakuData = (IDanmakuData) c1402290max.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = DanmakuPresentAssem.LLLLII;
        danmakuPresentAssem.Ep(iDanmakuData, true);
    }

    public C1402290max(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
