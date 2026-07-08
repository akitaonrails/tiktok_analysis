package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$uploadAndSaveAvatars$2", f = "SocialAvatarReviewFragment.kt", l = {837, 843, 853, 882}, m = "invokeSuspend")
public final class C0HDN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C436980HBo LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SocialAvatarReviewFragment LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDN(SocialAvatarReviewFragment socialAvatarReviewFragment, boolean z, boolean z2, Context context, InterfaceC1364105Vn<? super C0HDN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = socialAvatarReviewFragment;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HDN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
