package X;

import Y.ACListenerS165S0100000_31;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;

/* JADX INFO: renamed from: X.15yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694315yP extends C20692915yB {
    public final PushSelectedSubPageItem LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1689550u4H LLILZLL;

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        boolean z = this.LLILZIL;
        PushSelectedSubPageItem pushSelectedSubPageItem = this.LLILZ;
        return new C20693415yG(z, pushSelectedSubPageItem.title, null, pushSelectedSubPageItem.description, new ACListenerS165S0100000_31(this, 73), 7034);
    }

    public C20694315yP(PushSelectedSubPageItem pushSelectedSubPageItem, boolean z, C1689540u4G c1689540u4G) {
        this.LLILZ = pushSelectedSubPageItem;
        this.LLILZIL = z;
        this.LLILZLL = c1689540u4G;
    }
}
