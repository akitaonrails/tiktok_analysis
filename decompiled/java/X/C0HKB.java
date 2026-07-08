package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$performUploadProcessInBackground$1", f = "SocialAvatarCreationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0HKB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarGenerateData LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HKB(SocialAvatarGenerateData socialAvatarGenerateData, String str, InterfaceC1364105Vn<? super C0HKB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarGenerateData;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HKB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeFile;
        C1C7U.LIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.generationScene != 7 && (bitmapDecodeFile = BitmapFactory.decodeFile(this.LLILLJJLI)) != null) {
            C0HMP.LIZ.getClass();
            C0HMP.LIZIZ(bitmapDecodeFile);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
