package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.views.SocialAvatarNewStickersCollageView$load$1$bitmapForegroundDeferred$1", f = "SocialAvatarNewStickersCollageView.kt", l = {104}, m = "invokeSuspend")
public final class C433360Gz0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C416810GVz LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433360Gz0(C416810GVz c416810GVz, String str, InterfaceC1364105Vn<? super C433360Gz0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c416810GVz;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433360Gz0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarNewStickersCollageView@3d11.load$1$bitmapForegroundDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0HBV c0hbv = C0HBV.LIZ;
            Context context = this.LLILLJJLI.getContext();
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0hbv.LIZJ(context, str, this, true);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarNewStickersCollageView@3d11.load$1$bitmapForegroundDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarNewStickersCollageView@3d11.load$1$bitmapForegroundDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
