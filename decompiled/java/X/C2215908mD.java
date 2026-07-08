package X;

/* JADX INFO: renamed from: X.08mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.CheckNotDeletedStep", f = "CheckNotDeletedStep.kt", l = {67}, m = "execute")
public final class C2215908mD extends AbstractC23140094w {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C873610YOx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215908mD(C873610YOx c873610YOx, InterfaceC1364105Vn<? super C2215908mD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c873610YOx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckNotDeletedStep@6552.execute$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = this.this$0.LIZ(null, this);
        C1C7U.LIZIZ("CheckNotDeletedStep@6552.execute$1");
        return objLIZ;
    }
}
