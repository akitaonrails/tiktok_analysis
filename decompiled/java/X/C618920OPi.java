package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardUtils", f = "BulletinBoardUtils.kt", l = {749}, m = "subscribeBulletin")
public final class C618920OPi extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public User LLILZ;
    public Function1 LLILZIL;
    public C19EG LLILZLL;
    public boolean LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C618910OPh LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618920OPi(C618910OPh c618910OPh, InterfaceC1364105Vn<? super C618920OPi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c618910OPh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardUtils@33ce.subscribeBulletin$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLJ.LJIIIIZZ(null, 0L, null, false, null, null, null, null, null, this);
        C1C7U.LIZIZ("BulletinBoardUtils@33ce.subscribeBulletin$1");
        return objLJIIIIZZ;
    }
}
