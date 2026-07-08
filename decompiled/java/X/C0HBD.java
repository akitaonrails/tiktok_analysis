package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarImageUtils$combineAvatarAndBackground$2", f = "SocialAvatarImageUtils.kt", l = {84, 85, 92, 161}, m = "invokeSuspend")
public final class C0HBD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public C05XL LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C0HFS LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBD(Context context, C0HFS c0hfs, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0hfs;
        this.LLIZLLLIL = context;
        this.LLJ = str;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBD(this.LLIZLLLIL, this.LLIZ, this.LLJ, interfaceC1364105Vn, this.LLJI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBD.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
