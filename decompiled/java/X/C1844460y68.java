package X;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0y68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844460y68 {
    public final View LIZ;
    public final C01GW LIZIZ = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1265));
    public final C01GW LIZJ = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1266));
    public final C01GW LIZLLL = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1263));
    public final C01GW LJ = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1264));

    public C1844460y68(View view) {
        this.LIZ = view;
    }

    public final void LIZJ(int i) {
        ImageView imageView = (ImageView) this.LIZIZ.getValue();
        if (imageView != null) {
            int visibility = imageView.getVisibility();
            imageView.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, imageView);
        }
    }

    public final void LIZ(CohostPanelBanner cohostPanelBanner, boolean z) {
        ImageModel imageModel;
        C1324720kZq c1324720kZq = (C1324720kZq) this.LIZLLL.getValue();
        if (c1324720kZq != null && (imageModel = cohostPanelBanner.arrowImage) != null && (!TextUtils.isEmpty(imageModel.getUri()))) {
            if (z) {
                C786410Ut5.Yb(c1324720kZq, -1.0f);
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
        }
    }

    public final void LIZIZ(CohostPanelBanner cohostPanelBanner, boolean z) {
        ImageModel imageModel;
        C19RX c19rx;
        C19RC c19rc = (C19RC) this.LIZIZ.getValue();
        if (c19rc == null) {
            return;
        }
        if (((z && (imageModel = cohostPanelBanner.rightImageRtl) != null) || (imageModel = cohostPanelBanner.rightImage) != null) && (!TextUtils.isEmpty(imageModel.getUri()))) {
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI((View) this.LIZIZ.getValue());
        }
        float fLIZIZ = C962250b9D.LIZIZ();
        if (z) {
            C19RX shapeAppearanceModel = c19rc.getShapeAppearanceModel();
            shapeAppearanceModel.getClass();
            C19RY c19ry = new C19RY(shapeAppearanceModel);
            C21540919Rv c21540919RvLIZ = C21539119Rd.LIZ(0);
            c19ry.LIZ = c21540919RvLIZ;
            float fLIZIZ2 = C19RY.LIZIZ(c21540919RvLIZ);
            if (fLIZIZ2 != -1.0f) {
                c19ry.LIZLLL(fLIZIZ2);
            }
            c19ry.LIZLLL(fLIZIZ);
            c19rx = new C19RX(c19ry);
        } else {
            C19RX shapeAppearanceModel2 = c19rc.getShapeAppearanceModel();
            shapeAppearanceModel2.getClass();
            C19RY c19ry2 = new C19RY(shapeAppearanceModel2);
            C21540919Rv c21540919RvLIZ2 = C21539119Rd.LIZ(0);
            c19ry2.LIZIZ = c21540919RvLIZ2;
            float fLIZIZ3 = C19RY.LIZIZ(c21540919RvLIZ2);
            if (fLIZIZ3 != -1.0f) {
                c19ry2.LJFF = new C1844490y6B(fLIZIZ3);
            }
            c19ry2.LJFF = new C1844490y6B(fLIZIZ);
            c19rx = new C19RX(c19ry2);
        }
        c19rc.setShapeAppearanceModel(c19rx);
    }

    public final void LIZLLL(final CohostPanelBanner cohostPanelBanner, boolean z) {
        List<TextPiece> list;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        String string;
        final C16F5 c16f5 = (C16F5) this.LIZJ.getValue();
        if (c16f5 == null) {
            return;
        }
        String str = "";
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(cohostPanelBanner.bannerTitle, "");
        if (spannableLJIILIIL != null && (string = spannableLJIILIIL.toString()) != null) {
            str = string;
        }
        CharSequence text = c16f5.getText();
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, text)) {
            c16f5.setText(spannableLJIILIIL);
        }
        Text text2 = cohostPanelBanner.bannerTitle;
        TextPiece textPiece = null;
        if (text2 != null && (list = text2.pieces) != null) {
            Iterator<TextPiece> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextPiece next = it2.next();
                if (next.type == EnumC1133850fbz.IMAGE.getPieceType()) {
                    textPiece = next;
                    break;
                }
            }
            TextPiece textPiece2 = textPiece;
            if (textPiece2 != null && textPiece2.type == EnumC1133850fbz.IMAGE.getPieceType() && (textPieceImage = textPiece2.imageValue) != null && (imageModel = textPieceImage.imageModel) != null) {
                ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModel, new InterfaceC177000m8() { // from class: X.0y66
                    @Override // X.InterfaceC177000m8
                    public final void LIZ(Bitmap bitmap) {
                        c16f5.setText(C1133830fbx.LJIILIIL(cohostPanelBanner.bannerTitle, ""));
                    }
                });
            }
        }
        if (z && (c16f5 instanceof C1096900eeO)) {
            C1096900eeO c1096900eeO = (C1096900eeO) c16f5;
            Text text3 = cohostPanelBanner.bannerTitle;
            c1096900eeO.LJJJJI();
            c1096900eeO.LLJJ = true;
            c1096900eeO.LJJJJIZL(text3);
        }
    }
}
