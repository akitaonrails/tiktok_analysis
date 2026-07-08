package X;

import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$isResValid$2", f = "DraftAlgorithmModelRestoreHandler.kt", l = {}, m = "invokeSuspend")
public final class C371960EiA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C371970EiB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371960EiA(C371970EiB c371970EiB, InterfaceC1364105Vn<? super C371960EiA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c371970EiB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371960EiA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<StickerItemModel> list;
        C1C7U.LIZ("DraftAlgorithmModelRestoreHandler@5648.isResValid$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.LJ.getClass();
        AudioEnhanceParam audioEnhanceParam = this.LL.LIZ.LJ.LJJJJIZL.audioEnhanceParam;
        boolean z = false;
        if (audioEnhanceParam != null && C349220Dma.LIZ(audioEnhanceParam) && !C1661710tLN.LIZ("unet_denoise_44k_music_model_v1.0")) {
            this.LL.LJ.getFirst().add("requirement_ftgru");
            this.LL.LJ.getSecond().put("requirement_ftgru", C1697810uHb.LJ("unet_denoise_44k_music_model_v1.0"));
        }
        InfoStickerModel infoStickerModelLJFF = this.LL.LIZ.LJ.LJFF();
        if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null && !list.isEmpty()) {
            Iterator<StickerItemModel> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                StickerItemModel next = it2.next();
                String str = next.pinAlgorithmFile;
                if (str != null && str.length() != 0) {
                    if (next != null && (!C1661710tLN.LIZ("objectTracking"))) {
                        Boolean.valueOf(((ArrayList) this.LL.LIZLLL).add("objectTracking"));
                    }
                }
            }
        }
        if (this.LL.LIZ.LJ.LJJJJIZL.editMusicSyncMode) {
            boolean z2 = C1444820nhY.LIZ;
            if (C1444820nhY.LIZIZ && !C1661710tLN.LIZ("VideoMontage")) {
                ((ArrayList) this.LL.LIZLLL).add("VideoMontage");
            }
        }
        if (((ArrayList) this.LL.LIZJ).isEmpty() && ((ArrayList) this.LL.LIZLLL).isEmpty() && this.LL.LJ.getFirst().isEmpty()) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("DraftAlgorithmModelRestoreHandler@5648.isResValid$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
