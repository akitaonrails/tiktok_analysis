package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS197S1100000_22;

/* JADX INFO: renamed from: X.0oHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466900oHA implements InterfaceC1478005qU {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1428790nHh> c09aj) throws Throwable {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1466900oHA c1466900oHA, C09AJ c09aj) {
        C1C7U.LIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$3");
        ((C11RK) c1466900oHA.l1).onNext(new C0L7F("stage_fetch_template", 0.0f, null, 12));
        C0LE8.LIZIZ(((C1428780nHg) c1466900oHA.l2).LIZJ);
        InterfaceC523450Kfv interfaceC523450KfvLJIIIIZZ = C0CHQ.LIZ().LJIIIIZZ();
        String str = c1466900oHA.s0;
        C1428780nHg c1428780nHg = (C1428780nHg) c1466900oHA.l2;
        C573920Mf8 c573920Mf8 = c1428780nHg.LIZIZ;
        C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        interfaceC523450KfvLJIIIIZZ.LJII(str, c573920Mf8.LJ, c573920Mf8.LIZLLL, "anchor", null, new C1428800nHi(c1428780nHg, str, c19482611Ke, (C11RK) c1466900oHA.l1), new AwS197S1100000_22(c19482611Ke, c1466900oHA.s0, 0));
        C1C7U.LIZIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$3");
    }

    public static final void subscribe$1(C1466900oHA c1466900oHA, C09AJ c09aj) throws Throwable {
        TextStickerData textStickerData;
        String textStr;
        String textStr2;
        Bitmap bitmapDecodeFile;
        C1C7U.LIZ("CanvasEmbeddedAttributionLinkStickerView$Companion@6704.getTextBitmapFilePath$1");
        try {
            textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), ((StickerItemModel) c1466900oHA.l1).extra, TextStickerData.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            textStickerData = null;
        }
        if (textStickerData == null || (textStr = textStickerData.getTextStr()) == null) {
            textStr = "";
        }
        C19630711rF.LIZ(textStr);
        String str = ((StickerItemModel) c1466900oHA.l1).path;
        if (str != null && str.length() != 0 && C2286708xd.LIZJ(((StickerItemModel) c1466900oHA.l1).path) && (bitmapDecodeFile = BitmapFactory.decodeFile(((StickerItemModel) c1466900oHA.l1).path)) != null) {
            c09aj.onNext(new C1441050nbT(((StickerItemModel) c1466900oHA.l1).path, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()));
            c09aj.onComplete();
            C1C7U.LIZIZ("CanvasEmbeddedAttributionLinkStickerView$Companion@6704.getTextBitmapFilePath$1");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1466900oHA.s0);
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (textStickerData != null && (textStr2 = textStickerData.getTextStr()) != null) {
            View viewSd = C786410Ut5.Sd(R.layout.d1w, C786410Ut5.ne((Context) c1466900oHA.l2), null);
            ((TextView) viewSd.findViewById(R.id.title)).setText(textStr2);
            viewSd.setPadding(0, 0, 0, 0);
            viewSd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            viewSd.layout(0, 0, viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewSd.getMeasuredWidth(), viewSd.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), viewSd);
            C1441050nbT c1441050nbT = new C1441050nbT(strLIZIZ, 1, 1);
            c1441050nbT.LIZIZ = bitmapCreateBitmap.getWidth();
            c1441050nbT.LIZJ = bitmapCreateBitmap.getHeight();
            C1441060nbU.LIZIZ(bitmapCreateBitmap, strLIZIZ);
            c09aj.onNext(c1441050nbT);
            c09aj.onComplete();
        } else {
            c09aj.onError(new Exception("save failed"));
        }
        C1C7U.LIZIZ("CanvasEmbeddedAttributionLinkStickerView$Companion@6704.getTextBitmapFilePath$1");
    }

    public C1466900oHA(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj;
    }
}
