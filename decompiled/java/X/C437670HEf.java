package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$start$1$2", f = "SocialAvatarCreationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C437670HEf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HHC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437670HEf(C0HHC c0hhc, InterfaceC1364105Vn<? super C437670HEf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hhc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437670HEf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        int iIntValue;
        Bitmap bitmapDecodeByteArray;
        C1C7U.LIZ("SocialAvatarCreationServiceImpl@40e4.start$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C0HHC c0hhc = this.LL;
            Integer num = C437650HEd.LIZ().generationEstimationMinute;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            String quantityString = c0hhc.LIZ.getResources().getQuantityString(2131755679, iIntValue, C2286608xc.LJ(iIntValue));
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(quantityString);
            c1389890mGx.LJIIJJI();
            C0HMP.LIZ.getClass();
            byte[] bytes = C0HMP.LIZJ().getBytes(C0HMP.LJ("key_effect_header_image"), null);
            if (bytes != null && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length)) != null) {
                C0HMP.LIZIZ(bitmapDecodeByteArray);
            }
        }
        C439470HLd.LIZ.getClass();
        C20684815ws.LJIILLIIL("ttsocial_show_generating_avatar_from_effect_toast", new C2344009Gk().LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.start$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
