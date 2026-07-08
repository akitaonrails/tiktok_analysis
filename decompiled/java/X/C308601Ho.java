package X;

import com.bytedance.android.livesdk.hints.GiftHintsManager;

/* JADX INFO: renamed from: X.01Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.hints.GiftHintsManager", f = "GiftHintsManager.kt", l = {111}, m = "fetchHints")
public final class C308601Ho extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GiftHintsManager LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C308601Ho(GiftHintsManager giftHintsManager, InterfaceC1364105Vn<? super C308601Ho> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = giftHintsManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftHintsManager@be32.fetchHints$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("GiftHintsManager@be32.fetchHints$1");
        return objLIZ;
    }
}
