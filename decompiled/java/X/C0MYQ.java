package X;

import Y.ACallableS415S0100000_8;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS587S0100000_8;
import lth.o;

/* JADX INFO: renamed from: X.0MYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYQ extends AbstractC365870EWb {
    public final C554970Lpf LIZ;

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 14;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 1200;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C0MYQ(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        if (this.LIZ.LJ.LIZ.soundEffectInfoModel.soundEffectList.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0MYK] */
    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        boolean z = true;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C554970Lpf c554970Lpf = this.LIZ;
        LifecycleOwner lifecycleOwner = c554970Lpf.LIZIZ;
        AwemeDraft awemeDraft = c554970Lpf.LJ;
        DraftSoundEffectProcessor draftSoundEffectProcessor = new DraftSoundEffectProcessor(awemeDraft, new C0MYU() { // from class: X.0MYK
            @Override // X.C0MYU
            public final void LIZ(List list) {
                int i;
                C554970Lpf c554970Lpf2 = this.LIZ.LIZ;
                AwemeDraft awemeDraft2 = c554970Lpf2.LIZLLL;
                IDraftListener iDraftListener = c554970Lpf2.LJFF;
                Boolean boolLJIILLIIL = C570560MZi.LJIILLIIL(awemeDraft2, list);
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("soundEffect clearSoundEffectAndRefreshDraft called, isRemoved:");
                sbLIZ.append(boolLJIILLIIL.toString());
                C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
                if (boolLJIILLIIL.booleanValue()) {
                    ArrayList<String> arrayList = C0MYD.LIZ;
                    C391360FWc.LJ("", new AwS406S0200000_5(awemeDraft2, (AwemeDraft) new C259800zU(), (C259800zU<DraftFileSaveResult>) 21));
                    C0MYD.LJII(awemeDraft2);
                    C0MYD.LJIIL(awemeDraft2);
                    o.LJIL.LJI().LIZIZ().LJFF(new C545640Lac(awemeDraft2, new C0M2T("DraftEditHelper", 2)));
                    if (iDraftListener != null) {
                        iDraftListener.onUpdated(new IDraftListener.UpdateParams(awemeDraft2, false));
                    }
                }
                awemeDraft2.LIZ.soundEffectInfoModel.shouldShowRemoveToast = boolLJIILLIIL.booleanValue();
                Boolean boolLJIILLIIL2 = C570560MZi.LJIILLIIL(this.LIZ.LIZ.LJ, list);
                this.LIZ.LIZ.LJ.LIZ.soundEffectInfoModel.shouldShowRemoveToast = boolLJIILLIIL2.booleanValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                this.LIZ.getClass();
                sbLIZ2.append("DraftSoundEffectRestoreHandler");
                sbLIZ2.append(" ; restore done ... ;  isSoundEffectILLegal: ");
                sbLIZ2.append(boolLJIILLIIL2);
                C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                DraftFileRestoreResult[] draftFileRestoreResultArr = new DraftFileRestoreResult[1];
                C0MYQ c0myq = this.LIZ;
                if (!boolLJIILLIIL2.booleanValue()) {
                    i = 0;
                } else {
                    i = -3000;
                }
                DraftFileRestoreException draftFileRestoreException = new DraftFileRestoreException(i, null, "SoundEffect");
                c0myq.getClass();
                draftFileRestoreResultArr[0] = C365890EWd.LIZ(c0myq, null, false, draftFileRestoreException);
                ArrayList arrayListLJ = C1697810uHb.LJ(draftFileRestoreResultArr);
                C189200o6.m2constructorimpl(arrayListLJ);
                interfaceC20236714Gf.resumeWith(arrayListLJ);
            }
        });
        if (lifecycleOwner != null) {
            C571760Mbe.LIZ(lifecycleOwner, draftSoundEffectProcessor);
        }
        ((ArrayList) draftSoundEffectProcessor.LLILLL).clear();
        ((ArrayList) draftSoundEffectProcessor.LLILZ).clear();
        for (SoundEffect soundEffect : awemeDraft.LIZ.soundEffectInfoModel.soundEffectList) {
            ((ArrayList) draftSoundEffectProcessor.LLILLL).add(soundEffect);
            ((ArrayList) draftSoundEffectProcessor.LLILZ).add(new C570670MZt(C356670Dyb.LIZ(soundEffect), 14));
        }
        if (((ArrayList) draftSoundEffectProcessor.LLILLL).size() == 0) {
            z = false;
        }
        if (!z) {
            C15O7.LIZIZ(new ACallableS415S0100000_8(draftSoundEffectProcessor, 14), C15O7.LJIIIIZZ, null);
        } else {
            C15O7.LIZJ(new ACallableS415S0100000_8(draftSoundEffectProcessor, 15)).LJ(new C581190Mqr(draftSoundEffectProcessor, 4), C15O7.LJIIIIZZ, null);
        }
        c2252611DEt.LJJII(new AwS587S0100000_8(this, 698));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
