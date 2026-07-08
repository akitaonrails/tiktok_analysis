package Y;

import X.C0C64;
import X.C0CHQ;
import X.C0MAY;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1428470nHB;
import X.C1449720npS;
import X.C1449830npd;
import X.C1463670oBx;
import X.C1660680tJi;
import X.C201955140j;
import X.C349220Dma;
import X.C350300DoK;
import X.C421020Gf6;
import X.C559780LxQ;
import X.C571470MbB;
import X.C571480MbC;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.cut_ui.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS203S0300000_8 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS203S0300000_8 aObjectS203S0300000_8) {
        MediaItem mediaItem = (MediaItem) aObjectS203S0300000_8.l0;
        C559780LxQ c559780LxQ = (C559780LxQ) aObjectS203S0300000_8.l1;
        C421020Gf6 c421020Gf6 = (C421020Gf6) aObjectS203S0300000_8.l2;
        if (mediaItem.isMutable) {
            c559780LxQ.LLILLJJLI.invoke(mediaItem, Integer.valueOf(c421020Gf6.getAdapterPosition()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS203S0300000_8 aObjectS203S0300000_8) {
        Context context = (Context) aObjectS203S0300000_8.l0;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) aObjectS203S0300000_8.l1;
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) aObjectS203S0300000_8.l2;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getString(2131822625));
        c1397580mTM.LIZIZ(context.getResources().getString(2131822622));
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LIZLLL = onDismissListener;
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS203S0300000_8 aObjectS203S0300000_8) {
        Intent intent = (Intent) aObjectS203S0300000_8.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS203S0300000_8.l1;
        Context context = (Context) aObjectS203S0300000_8.l2;
        C1428470nHB.LLIIZ(intent, videoPublishEditModel);
        C1660680tJi.LIZ().LJIIJ(context, intent);
        C201955140j.LJIILJJIL(C0MAY.LIZIZ, "DraftEditHelper after openVideoPublishPage");
        return null;
    }

    public static final Object invoke$3(AObjectS203S0300000_8 aObjectS203S0300000_8) {
        boolean z;
        boolean z2;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS203S0300000_8.l0;
        Context context = (Context) aObjectS203S0300000_8.l1;
        Intent intent = (Intent) aObjectS203S0300000_8.l2;
        if (TextUtils.isEmpty(videoPublishEditModel.getNleData()) || (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_single_canvas_photo_use_edit_model_recover_draft", true, true) && videoPublishEditModel.isNLECanvas())) {
            z = true;
        } else {
            z = false;
        }
        if (C349220Dma.LIZ(videoPublishEditModel.getAudioEnhanceParam()) && (C571480MbC.LIZIZ() || C571480MbC.LIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            C0CHQ.LIZ().LJJIZ();
            C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 4);
            NLEEditor nLEEditor = c1463670oBxLIZLLL.LIZLLL().LIZ;
            if (z2) {
                C1449830npd c1449830npd = C1449830npd.LIZ;
                C571470MbB c571470MbB = new C571470MbB(context, intent, nLEEditor, c1463670oBxLIZLLL, videoPublishEditModel);
                c1449830npd.getClass();
                C1449830npd.LIZ(c571470MbB);
            } else {
                nLEEditor.done();
                videoPublishEditModel.setNleData(nLEEditor.store());
                if (C350300DoK.LIZ()) {
                    videoPublishEditModel.setNleModel(nLEEditor.getModel());
                    videoPublishEditModel.setNleDataChange(false);
                }
            }
            C201955140j.LJIILJJIL(C0MAY.LIZIZ, "DraftEditHelper has converted NLE from editModel");
        }
        C0MAY c0may = C0MAY.LIZIZ;
        C201955140j.LJIILJJIL(c0may, "DraftEditHelper has converted NLE from editModel");
        if (z && z2) {
            return null;
        }
        C1428470nHB.LLIIZ(intent, videoPublishEditModel);
        C1660680tJi.LIZ().LJIIJ(context, intent);
        C201955140j.LJIILJJIL(c0may, "DraftEditHelper after openVideoPublishPage");
        return null;
    }

    public AObjectS203S0300000_8(Context context, Intent intent, VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.l0 = videoPublishEditModel;
            this.l1 = context;
            this.l2 = intent;
        } else {
            this.l0 = intent;
            this.l1 = videoPublishEditModel;
            this.l2 = context;
        }
    }

    public AObjectS203S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
