package X;

import android.graphics.Bitmap;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624760sNm implements InterfaceC1622430sK1 {
    public final DraftEffect LIZ;

    @Override // X.InterfaceC1622430sK1
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    public C1624760sNm(DraftEffect draftEffect) {
        this.LIZ = draftEffect;
    }

    @Override // X.InterfaceC1622430sK1
    public final UploadableMobileEffect2 LIZIZ(List<UploadableMobileEffect2> list) {
        Object obj;
        Iterator<UploadableMobileEffect2> it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            UploadableMobileEffect2 next = it2.next();
            DraftInfo draftInfo = next.draftInfo;
            if (draftInfo != null) {
                obj = draftInfo.draftId;
            }
            if (Intrinsics.LJFF(obj, this.LIZ.getDraft().getDraftId())) {
                obj = next;
                break;
            }
        }
        return (UploadableMobileEffect2) obj;
    }

    @Override // X.InterfaceC1622430sK1
    public final C1622440sK2 LIZLLL(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        String hintKey;
        String draftId = this.LIZ.getDraft().getDraftId();
        EffectHint effectHint = this.LIZ.getDraft().getEffectHint();
        if (effectHint == null || (hintKey = effectHint.getHintKey()) == null) {
            hintKey = "";
        }
        uploadableMobileEffect2.draftInfo = new DraftInfo(draftId, false, true, hintKey);
        uploadableMobileEffect2.effectName = this.LIZ.getDraft().getName();
        FaceStickerBean faceStickerBeanLIZIZ = C1441210nbj.LIZIZ(this.LIZ, null, null, null);
        faceStickerBeanLIZIZ.setStickerId(CastLongProtector.parseLong(uploadableMobileEffect2.effectId));
        faceStickerBeanLIZIZ.setName(this.LIZ.getDraft().getName());
        faceStickerBeanLIZIZ.setAddToAnchor(false);
        faceStickerBeanLIZIZ.setEffectModerationStatus(1);
        return new C1622440sK2(AFwS214S0000000_25.get$arr$(602), 0, faceStickerBeanLIZIZ);
    }

    @Override // X.InterfaceC1622430sK1
    public final Object LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1364105Vn<? super UIAnnotationErrorCode> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1626070sPt(uploadableMobileEffect2, this, null));
    }

    @Override // X.InterfaceC1622430sK1
    public final Object LIZ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, Bitmap bitmap, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1626080sPu(uploadableMobileEffect2, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
