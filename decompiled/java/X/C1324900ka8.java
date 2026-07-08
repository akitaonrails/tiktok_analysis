package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.slideslip.ab.ColorGradientEffectPanelEntrance;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ka8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1324900ka8 extends C2217421BqW implements Function2<C1322110kVd, String, Unit> {
    public C1324900ka8(C1630020sWG c1630020sWG) {
        super(2, c1630020sWG, C1630020sWG.class, "loadImage", "loadImage(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V", 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1322110kVd c1322110kVd, String str) {
        InterfaceC1291910jiv c1291240jhq;
        InterfaceC1291910jiv c1291240jhq2;
        C1322110kVd c1322110kVd2 = c1322110kVd;
        String str2 = str;
        C1630020sWG c1630020sWG = (C1630020sWG) this.receiver;
        c1630020sWG.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image loading started: ");
        sbLIZ.append(str2);
        C1628270sTR.LIZIZ("CameraEffectCarouselScene", C2188811AlT.LIZIZ(sbLIZ));
        if (C097T.LIZ()) {
            Uri uri = UriProtector.parse(str2);
            if (((Boolean) C267500Ae4.LIZ.getValue()).booleanValue()) {
                c1291240jhq2 = new C1291790jij(str2);
            } else {
                c1291240jhq2 = new C1291240jhq();
            }
            c1630020sWG.LLLLLJLJLL(c1322110kVd2, uri, c1291240jhq2, (C1320700kTM) c1630020sWG.LLLFF.getValue());
        } else {
            Uri uri2 = UriProtector.parse(str2);
            if (((Boolean) C267500Ae4.LIZ.getValue()).booleanValue()) {
                c1291240jhq = new C1291790jij(str2);
            } else {
                c1291240jhq = new C1291240jhq();
            }
            C1320700kTM c1320700kTM = (C1320700kTM) c1630020sWG.LLLFF.getValue();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri2);
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.LJFF = true;
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            c1325700kbQLIZLLL.LJIILIIL = c1291240jhq;
            if (C286940BMm.LIZ()) {
                C1324770kZv.LIZ(c1325700kbQLIZLLL);
            }
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd2.getController();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            c1322110kVd2.setController(abstractC1320710kTNLIZ);
            if (ColorGradientEffectPanelEntrance.INSTANCE.isEnabled()) {
                InterfaceC1320200kSY interfaceC1320200kSYLJIIIIZZ = abstractC1320710kTNLIZ.LJIIIIZZ();
                if ((interfaceC1320200kSYLJIIIIZZ instanceof InterfaceC1320200kSY) && interfaceC1320200kSYLJIIIIZZ != null) {
                    interfaceC1320200kSYLJIIIIZZ.LIZJ(new C1628260sTQ(c1630020sWG, uri2.toString()), C822690WPb.LIZ());
                }
            }
        }
        return Unit.LIZ;
    }
}
