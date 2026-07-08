package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.socialavatar.SAEffectPopupFragment$refreshHeaderView$1$1$1", f = "SAEffectPopupFragment.kt", l = {263}, m = "invokeSuspend")
public final class C433250Gyp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SmartImageView LLILLJJLI;
    public final /* synthetic */ SAEffectPopupFragment LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433250Gyp(SmartImageView smartImageView, SAEffectPopupFragment sAEffectPopupFragment, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C433250Gyp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = smartImageView;
        this.LLILLL = sAEffectPopupFragment;
        this.LLILZ = bitmap;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433250Gyp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C433270Gyr c433270Gyr = new C433270Gyr(this.LLILLL, this.LLILZ, this.LLILZIL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c433270Gyr);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.setImageDrawable(new BitmapDrawable(this.LLILLJJLI.getResources(), (Bitmap) obj));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SAEffectPopupFragment@c7eb.refreshHeaderView$1$1$1");
        return unit;
    }
}
