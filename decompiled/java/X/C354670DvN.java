package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateFreezeTask", f = "TemplateFreezeTask.kt", l = {145, 153}, m = "start")
public final class C354670DvN extends AbstractC23140094w {
    public Function1 LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C354660DvM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354670DvN(C354660DvM c354660DvM, InterfaceC1364105Vn<? super C354670DvN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c354660DvM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFreezeTask@41d5.start$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("TemplateFreezeTask@41d5.start$1");
        return objLIZ;
    }
}
