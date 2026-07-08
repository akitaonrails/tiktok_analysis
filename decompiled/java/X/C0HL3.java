package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HL3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.BaseSocialAvatarCreationVM$uploadImageAndGenerateSocialAvatarImpl$3", f = "BaseSocialAvatarCreationVM.kt", l = {}, m = "invokeSuspend")
public final class C0HL3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BaseSocialAvatarCreationVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL3(String str, BaseSocialAvatarCreationVM baseSocialAvatarCreationVM, InterfaceC1364105Vn<? super C0HL3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = baseSocialAvatarCreationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HL3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSocialAvatarCreationVM@d207.uploadImageAndGenerateSocialAvatarImpl$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LL);
        if (bitmapDecodeFile != null) {
            BaseSocialAvatarCreationVM baseSocialAvatarCreationVM = this.LLILLJJLI;
            C2252321DDq c2252321DDq = baseSocialAvatarCreationVM.LLJJIJIIJIL;
            while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1696790uFx(bitmapDecodeFile))) {
            }
            baseSocialAvatarCreationVM.LLILLJJLI.getClass();
            C0HMP.LIZIZ(bitmapDecodeFile);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCreationVM@d207.uploadImageAndGenerateSocialAvatarImpl$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
