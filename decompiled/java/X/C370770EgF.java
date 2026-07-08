package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0EgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.FrameLoader", f = "FrameLoader.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 128}, m = "loadFrame")
public final class C370770EgF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public InterfaceC370850EgN LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C370720EgA LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370770EgF(C370720EgA c370720EgA, InterfaceC1364105Vn<? super C370770EgF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c370720EgA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FrameLoader@2ec2.loadFrame$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, null, null, null, null, null, false, null, this);
        C1C7U.LIZIZ("FrameLoader@2ec2.loadFrame$1");
        return objLIZJ;
    }
}
