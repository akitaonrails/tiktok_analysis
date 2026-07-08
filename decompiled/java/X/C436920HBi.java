package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$generateImages$2", f = "SocialAvatarEditViewModel.kt", l = {504, 507, 508, 509, 510}, m = "invokeSuspend")
public final class C436920HBi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C436980HBo>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C099G LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SocialAvatarEditViewModel LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436920HBi(SocialAvatarEditViewModel socialAvatarEditViewModel, Context context, boolean z, InterfaceC1364105Vn<? super C436920HBi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = socialAvatarEditViewModel;
        this.LLIZ = context;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C436920HBi c436920HBi = new C436920HBi(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c436920HBi.LLILZIL = obj;
        return c436920HBi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C436920HBi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C436980HBo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
