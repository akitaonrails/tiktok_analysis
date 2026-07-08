package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.SocialEditRootScene$doCustomInSingleModeAction$1$1", f = "SocialEditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C564340MBk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1455250nyN LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564340MBk(C1455250nyN c1455250nyN, String str, InterfaceC1364105Vn<? super C564340MBk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1455250nyN;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564340MBk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        C1C7U.LIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = C1429320nIY.LIZIZ(this.LL.getEditModel());
        if (!C2286708xd.LIZJ(strLIZIZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1$1");
            return unit;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLIZIZ);
        CoverPublishModel coverPublishModel = this.LL.getEditModel().getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapDecodeFile)) != null) {
            bitmapDecodeFile = bitmapMergeCoverText;
        } else if (bitmapDecodeFile == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1$1");
            return unit2;
        }
        if (this.LLILLJJLI != null) {
            if (C493401w4.LIZ()) {
                C0MH8.LJIIZILJ(C0MH8.LIZ, this.LL.getEditModel(), bitmapDecodeFile, 0, 5, this.LLILLJJLI, 0, null, AFwS239S0000000_8.get$arr$(291), 100);
            } else {
                C1455250nyN c1455250nyN = this.LL;
                String str = this.LLILLJJLI;
                c1455250nyN.getClass();
                if (str != null && str.length() != 0) {
                    C0VSV c0vsv = new C0VSV(str);
                    try {
                        try {
                            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                            c0vsv.flush();
                            C0CNO.LIZLLL(0L, new AwS552S0100000_8((Function0) null, (Function0<Unit>) 969));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                c0vsv.close();
                                throw th;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw th;
                            }
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    try {
                        c0vsv.close();
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            C1440950nbJ.LIZJ(this.LL.getEditModel(), str2);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SocialEditRootScene@8880.doCustomInSingleModeAction$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
