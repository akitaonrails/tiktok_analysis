package X;

/* JADX INFO: renamed from: X.0wIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.adapter.video.BaseMMKVideoAdapterDelegate", f = "BaseMMKVideoAdapterDelegate.kt", l = {52}, m = "preloadAweme$suspendImpl")
public final class C1775270wIX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbstractC1775220wIS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775270wIX(AbstractC1775220wIS abstractC1775220wIS, InterfaceC1364105Vn<? super C1775270wIX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1775220wIS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMMKVideoAdapterDelegate@ec2f.preloadAweme$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = AbstractC1775220wIS.LJIIIIZZ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("BaseMMKVideoAdapterDelegate@ec2f.preloadAweme$1");
        return objLJIIIIZZ;
    }
}
