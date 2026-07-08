package X;

import Y.ACListenerS165S0100000_31;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;

/* JADX INFO: renamed from: X.15yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694215yO extends C20692915yB {
    public final PushSelectedSubPageItem LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC20694415yQ LLILZLL;

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        boolean z = this.LLILZIL;
        PushSelectedSubPageItem pushSelectedSubPageItem = this.LLILZ;
        return new C20693415yG(z, pushSelectedSubPageItem.title, null, pushSelectedSubPageItem.description, new ACListenerS165S0100000_31(this, 10), 7034);
    }

    public C20694215yO(PushSelectedSubPageItem pushSelectedSubPageItem, boolean z, C20306214cu c20306214cu) {
        this.LLILZ = pushSelectedSubPageItem;
        this.LLILZIL = z;
        this.LLILZLL = c20306214cu;
    }
}
