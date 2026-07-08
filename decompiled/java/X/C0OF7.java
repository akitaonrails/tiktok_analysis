package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0OF7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.addtodsp.feed.button.MusicAddToDspClickEvent", f = "MusicAddToDspClickEvent.kt", l = {48}, m = "invoke")
public final class C0OF7 extends AbstractC23140094w {
    public VideoItemParams LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C616520OGc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OF7(C616520OGc c616520OGc, InterfaceC1364105Vn<? super C0OF7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c616520OGc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAddToDspClickEvent@7e1.invoke$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.invoke(null, null, this);
        C1C7U.LIZIZ("MusicAddToDspClickEvent@7e1.invoke$1");
        return objLIZ;
    }
}
