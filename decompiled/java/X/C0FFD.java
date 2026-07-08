package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FFD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0FFD extends C0FFE<TextStickerModel> {
    public final TextStickerModel LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final C390420FSm LJIILL;
    public final InterfaceC388760FMc LJIILLIIL;
    public final InterfaceC386690FEd LJIIZILJ;
    public final C0FKI LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public abstract LifecycleOwner LJJIJIL();

    public abstract void LJJJLL();

    public abstract void LJJJLZIJ();

    public abstract void LJJL();

    public final C1664680tQA<TextStickerModel> LJJJZ() {
        return (C1664680tQA) this.LJIJJ.getValue();
    }

    @Override // X.C0FFE, X.C0FTJ
    public final boolean LJII() {
        return super.LJII() && !C0F8Y.LJIIJ(LJJJZ().LIZ);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final boolean LJIJJLI() {
        return super.LJIJJLI() && !C0F8Y.LJIIJ(LJJJZ().LIZ);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final Integer LJJI() {
        TTSModel ttsModel;
        if (!C0F8Y.LJI(LJJJZ().LIZ) || (ttsModel = LJJJZ().LIZ.getTtsModel()) == null) {
            return null;
        }
        return Integer.valueOf(ttsModel.audioTrackDuration);
    }

    @Override // X.C0FFE
    public void LJJJIL() {
        super.LJJJIL();
        LJJJZ().LIZ(new C2217371BqR() { // from class: X.0FEf
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextStrWithLineBreak();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextStrWithLineBreak((String) obj2);
            }
        }).LJIIIZ(LJJIJIL(), Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1));
    }

    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return LJJJZ().LIZ;
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJZ().LIZLLL(new AwS584S0100000_5(baseStickerModel, 2), true);
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LJJIJ().LIZLLL(new AwS3S0000001_5(f, 0), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS20S0010000_5(z, 0), true);
        LJJJZ().LIZLLL(new AwS20S0010000_5(z, 1), true);
        super.setVisible(z);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIZILJ(EnumC390580FTc enumC390580FTc, float f) {
        LJJIJ().LIZLLL(new AwS584S0100000_5(enumC390580FTc, 3), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJ(float f, float f2, C00E4 c00e4) {
        long maxTargetEnd;
        NLEEditor nLEEditorLJI;
        NLEModel model;
        InterfaceC386690FEd interfaceC386690FEd = this.LJIIZILJ;
        if (interfaceC386690FEd != null && (nLEEditorLJI = interfaceC386690FEd.LJI()) != null && (model = nLEEditorLJI.getModel()) != null) {
            maxTargetEnd = model.getMaxTargetEnd();
        } else {
            maxTargetEnd = 0;
        }
        long j = maxTargetEnd / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (c00e4 == C00E4.ON_GOING && j > 0) {
            super.LJIIJ(0.0f, j, c00e4);
        } else {
            super.LJIIJ(f, f2, c00e4);
        }
    }

    public C0FFD(Context context, TextStickerModel textStickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, textStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = textStickerModel;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = c390420FSm;
        InterfaceC388760FMc interfaceC388760FMc = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LJIILLIIL = interfaceC388760FMc;
        this.LJIIZILJ = interfaceC388760FMc.LIZIZ();
        this.LJIJ = interfaceC388760FMc.LJJ();
        this.LJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 17));
        this.LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 16));
    }
}
