package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEffectManager$onPublishStatusUpdate$1$avatarBitmapTask$1", f = "SocialAvatarSyncLegoTask.kt", l = {195}, m = "invokeSuspend")
public final class C0H0O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0O(String str, InterfaceC1364105Vn<? super C0H0O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H0O(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarEffectManager@531.onPublishStatusUpdate$1$avatarBitmapTask$1");
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
            C0HEE c0hee = C0HEE.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c0hee.getClass();
            obj = C0HEE.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarEffectManager@531.onPublishStatusUpdate$1$avatarBitmapTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarEffectManager@531.onPublishStatusUpdate$1$avatarBitmapTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
