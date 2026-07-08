package X;

import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import defpackage.r2;

/* JADX INFO: renamed from: X.0ybm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.internal.net.MessageRemote", f = "MessageRemote.kt", l = {437, 455}, m = "getTakoOpChunkRequest")
public final class C1864080ybm extends AbstractC23140094w {
    public r2 LL;
    public Object LLILLJJLI;
    public EntryDoc LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1863980ybc LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864080ybm(C1863980ybc c1863980ybc, InterfaceC1364105Vn<? super C1864080ybm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1863980ybc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRemote@c2f6.getTakoOpChunkRequest$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIJJ = this.LLILZIL.LJIJJ(null, this);
        C1C7U.LIZIZ("MessageRemote@c2f6.getTakoOpChunkRequest$1");
        return objLJIJJ;
    }
}
