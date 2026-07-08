package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadArgument;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ly1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareVM$encodeAndSaveResources$1", f = "SocialAvatarDownloadShareVM.kt", l = {46, 52}, m = "invokeSuspend")
public final class C1378150ly1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialAvatarDownloadArgument LLILLL;
    public final /* synthetic */ SocialAvatarDownloadShareVM LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378150ly1(SocialAvatarDownloadArgument socialAvatarDownloadArgument, SocialAvatarDownloadShareVM socialAvatarDownloadShareVM, Context context, InterfaceC1364105Vn<? super C1378150ly1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarDownloadArgument;
        this.LLILZ = socialAvatarDownloadShareVM;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1378150ly1 c1378150ly1 = new C1378150ly1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1378150ly1.LLILLJJLI = obj;
        return c1378150ly1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:34:0x0080, B:35:0x0083, B:38:0x0089, B:40:0x008d, B:41:0x0099, B:27:0x005e, B:28:0x0061, B:30:0x0072, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0050, B:42:0x00a6, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be, B:49:0x00c5, B:50:0x00c6, B:51:0x00cd), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:34:0x0080, B:35:0x0083, B:38:0x0089, B:40:0x008d, B:41:0x0099, B:27:0x005e, B:28:0x0061, B:30:0x0072, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0050, B:42:0x00a6, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be, B:49:0x00c5, B:50:0x00c6, B:51:0x00cd), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:34:0x0080, B:35:0x0083, B:38:0x0089, B:40:0x008d, B:41:0x0099, B:27:0x005e, B:28:0x0061, B:30:0x0072, B:11:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0050, B:42:0x00a6, B:43:0x00ad, B:44:0x00ae, B:45:0x00b5, B:46:0x00b6, B:47:0x00bd, B:48:0x00be, B:49:0x00c5, B:50:0x00c6, B:51:0x00cd), top: B:56:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1378150ly1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
