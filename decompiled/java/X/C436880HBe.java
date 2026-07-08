package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarTaskHandler$generateImages$2", f = "SocialAvatarTaskHandler.kt", l = {207, 210, 211, 212, 213}, m = "invokeSuspend")
public final class C436880HBe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C436980HBo>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C099G LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C436960HBm LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ C0HFS LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436880HBe(Context context, C436960HBm c436960HBm, C0HFS c0hfs, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c436960HBm;
        this.LLIZ = context;
        this.LLIZLLLIL = c0hfs;
        this.LLJ = z;
        this.LLJI = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C436880HBe c436880HBe = new C436880HBe(this.LLIZ, this.LLILZLL, this.LLIZLLLIL, interfaceC1364105Vn, this.LLJ, this.LLJI);
        c436880HBe.LLILZIL = obj;
        return c436880HBe;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C436880HBe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C436980HBo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
