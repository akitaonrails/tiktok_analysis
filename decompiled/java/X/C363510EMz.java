package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;

/* JADX INFO: renamed from: X.0EMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363510EMz {
    public static final /* synthetic */ int LIZ = 0;

    public static EffectPointModel LIZ(C348380DlE c348380DlE, boolean z, int i) {
        int startPoint;
        int endPoint;
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUuid(c348380DlE.LIZ);
        effectPointModel.setStartPoint((int) c348380DlE.LIZIZ);
        effectPointModel.setEndPoint((int) c348380DlE.LIZJ);
        if (z) {
            startPoint = i - effectPointModel.getEndPoint();
        } else {
            startPoint = effectPointModel.getStartPoint();
        }
        effectPointModel.setUiStartPoint(startPoint);
        if (z) {
            endPoint = i - effectPointModel.getStartPoint();
        } else {
            endPoint = effectPointModel.getEndPoint();
        }
        effectPointModel.setUiEndPoint(endPoint);
        effectPointModel.setSelectedColor(c348380DlE.LJIIIIZZ);
        effectPointModel.setKey(c348380DlE.LJFF);
        effectPointModel.setType(c348380DlE.LJIIIZ);
        effectPointModel.setIndex(c348380DlE.LJIILIIL);
        effectPointModel.setSelectFrom(c348380DlE.LJIILJJIL);
        effectPointModel.setEntrancePoint(c348380DlE.LJIILL);
        effectPointModel.setChallenge(c348380DlE.LJIILLIIL);
        effectPointModel.setIsFromEditPro(Boolean.valueOf(c348380DlE.LJIIZILJ));
        effectPointModel.setFromEnd(false);
        effectPointModel.setResDir(c348380DlE.LIZLLL);
        effectPointModel.setName(c348380DlE.LJII);
        effectPointModel.setDuration(effectPointModel.getEndPoint() - effectPointModel.getStartPoint());
        effectPointModel.setCategory(c348380DlE.LJIIJ);
        effectPointModel.setExtra(c348380DlE.LJ);
        effectPointModel.setResourceId(c348380DlE.LJIIL);
        effectPointModel.setMagic(c348380DlE.LJIJ);
        effectPointModel.setIconUrl(c348380DlE.LJIJJ);
        effectPointModel.fileUrl = c348380DlE.LJIJJLI;
        effectPointModel.source = c348380DlE.LJJIFFI;
        effectPointModel.designerId = c348380DlE.LJJ;
        effectPointModel.designerEncryptedId = c348380DlE.LJJI;
        effectPointModel.searchModel = (EffectSearchModel) C051R.LIZ(c348380DlE.LJIL, EffectSearchModel.class);
        return effectPointModel;
    }
}
