package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.EditRootScene$doCustomInSingleModeAction$1$1", f = "EditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C563410M7v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1455260nyO LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563410M7v(C1455260nyO c1455260nyO, String str, InterfaceC1364105Vn<? super C563410M7v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1455260nyO;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563410M7v(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        C1C7U.LIZ("EditRootScene@37d3.doCustomInSingleModeAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL.LLLFZ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        String strLIZIZ = C1429320nIY.LIZIZ(videoPublishEditModel);
        if (!C2286708xd.LIZJ(strLIZIZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditRootScene@37d3.doCustomInSingleModeAction$1$1");
            return unit;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLIZIZ);
        VideoPublishEditModel videoPublishEditModel3 = this.LL.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        CoverPublishModel coverPublishModel = videoPublishEditModel3.getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapDecodeFile)) != null) {
            bitmapDecodeFile = bitmapMergeCoverText;
        } else if (bitmapDecodeFile == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EditRootScene@37d3.doCustomInSingleModeAction$1$1");
            return unit2;
        }
        if (this.LLILLJJLI != null) {
            if (C493401w4.LIZ()) {
                C0MH8 c0mh8 = C0MH8.LIZ;
                VideoPublishEditModel videoPublishEditModel4 = this.LL.LLLFZ;
                if (videoPublishEditModel4 == null) {
                    videoPublishEditModel4 = null;
                }
                C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel4, bitmapDecodeFile, 0, 5, this.LLILLJJLI, 0, null, AFwS239S0000000_8.get$arr$(167), 100);
            } else {
                C1455260nyO c1455260nyO = this.LL;
                String str = this.LLILLJJLI;
                c1455260nyO.getClass();
                if (str.length() != 0) {
                    C0VSV c0vsv = new C0VSV(str);
                    try {
                        try {
                            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                            c0vsv.flush();
                            C0CNO.LIZLLL(0L, new AwS552S0100000_8((Function0) null, (Function0<Unit>) 643));
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        try {
                            c0vsv.close();
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c0vsv.close();
                            throw th;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th;
                        }
                    }
                }
            }
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            VideoPublishEditModel videoPublishEditModel5 = this.LL.LLLFZ;
            if (videoPublishEditModel5 != null) {
                videoPublishEditModel2 = videoPublishEditModel5;
            }
            C1440950nbJ.LIZJ(videoPublishEditModel2, str2);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditRootScene@37d3.doCustomInSingleModeAction$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
