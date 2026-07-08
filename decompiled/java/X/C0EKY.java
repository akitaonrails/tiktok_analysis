package X;

import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EKY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKY extends AbstractC19622511pv<InfoStickerModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public final C01GW LLILZLL;
    public int LLIZ;
    public final EnumC1466150oFx LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EKY.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EKY.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EKY.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C0E48 LJJLI() {
        return (C0E48) this.LLILZLL.getValue();
    }

    @Override // X.AbstractC19622511pv
    public final EnumC1466150oFx LJJIJLIJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C0EKY(C1DRG c1drg) {
        super(InfoStickerModel.class);
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C0EOK.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC361710EGb.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 683));
        this.LLIZ = -1;
        this.LLIZLLLIL = EnumC1466150oFx.INFO;
    }

    @Override // X.AbstractC19622511pv
    public final void LJJIJL(StickerModel stickerModel) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        List<C0FEO> listKd2;
        C0FEO next;
        InfoStickerModel infoStickerModel = (InfoStickerModel) stickerModel;
        C0E48 c0e48LJJLI = LJJLI();
        if (c0e48LJJLI != null) {
            NLETrackSlot nLETrackSlotLIZ = C357150DzN.LIZ(infoStickerModel, C350870DpF.LJI(c0e48LJJLI));
            if (nLETrackSlotLIZ != null) {
                nLETrackSlotLIZ.setExtra("infoStickerModel", C357150DzN.LIZIZ(infoStickerModel));
            }
            C0E48 c0e48LJJLI2 = LJJLI();
            C0FFP c0ffpLJJIL = null;
            if (c0e48LJJLI2 != null) {
                nLETrackSlotLLLLLLIL = c0e48LJJLI2.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            if (nLETrackSlotLLLLLLIL == null) {
                InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) this.LLILZ.getValue(this, LLJ[1]);
                if (interfaceC361710EGb != null) {
                    interfaceC361710EGb.LR1(true);
                    return;
                }
                return;
            }
            C0EOK c0eok = (C0EOK) this.LLILLL.getValue(this, LLJ[0]);
            if (c0eok != null && (listKd2 = c0eok.Kd2()) != null) {
                Iterator<C0FEO> it2 = listKd2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LJLI().getUuid(), nLETrackSlotLLLLLLIL.getUUID())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FEO c0feo = next;
                if (c0feo != null) {
                    c0ffpLJJIL = c0feo.LJJIL();
                }
            }
            if (c0ffpLJJIL instanceof C363850EOh) {
                C354270Duj.LIZ(200L, new AwS406S0200000_5(c0ffpLJJIL, this, 63));
                return;
            }
            InterfaceC361710EGb interfaceC361710EGb2 = (InterfaceC361710EGb) this.LLILZ.getValue(this, LLJ[1]);
            if (interfaceC361710EGb2 == null) {
                return;
            }
            interfaceC361710EGb2.LR1(true);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJI(StickerModel stickerModel) {
        C0E55 player;
        this.LLIZ = ((InfoStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLI = LJJLI();
        if (c0e48LJJLI != null && (player = c0e48LJJLI.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJJ(StickerModel stickerModel) {
        C201955140j.LJFF("elfredUndoRedo", "onMoveEndDelegate");
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJLL(StickerModel stickerModel) {
        C0E55 player;
        this.LLIZ = ((InfoStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLI = LJJLI();
        if (c0e48LJJLI != null && (player = c0e48LJJLI.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJZI(StickerModel stickerModel) {
        C201955140j.LJFF("elfredUndoRedo", "onStickerRotateEndDelegate");
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJLIIL(StickerModel stickerModel) {
        C0E55 player;
        this.LLIZ = ((InfoStickerModel) stickerModel).getId();
        C0E48 c0e48LJJLI = LJJLI();
        if (c0e48LJJLI != null && (player = c0e48LJJLI.getPlayer()) != null) {
            player.pause(false);
        }
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJLZIJ(StickerModel stickerModel) {
        C201955140j.LJFF("elfredUndoRedo", "onStickerScaleEndDelegate");
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJZ(StickerModel stickerModel, MotionEvent motionEvent) {
        InfoStickerModel infoStickerModel = (InfoStickerModel) stickerModel;
        if (motionEvent != null && motionEvent.getAction() == 1 && this.LLIZ == infoStickerModel.getBaseStickerModel().getId()) {
            this.LLIZ = -1;
            C354270Duj.LIZ(0L, new AwS406S0200000_5(this, infoStickerModel, 62));
        }
    }
}
