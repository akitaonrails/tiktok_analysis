package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarImageUtils$combineAvatarAndBackgroundForStory$2", f = "SocialAvatarImageUtils.kt", l = {196, 198, 248}, m = "invokeSuspend")
public final class C0HBR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C05XL LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ C0HFS LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Bitmap LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBR(Context context, Bitmap bitmap, C0HFS c0hfs, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c0hfs;
        this.LLJ = context;
        this.LLJI = z;
        this.LLJIJIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HFS c0hfs = this.LLIZLLLIL;
        return new C0HBR(this.LLJ, this.LLJIJIL, c0hfs, interfaceC1364105Vn, this.LLJI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0306  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
