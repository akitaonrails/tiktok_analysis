package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;

/* JADX INFO: renamed from: X.15cL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20557515cL extends AbstractC20560815cs<AdaptionPaddingValues, AdaptionPaddingValues> {
    public final AdaptionPaddingValues LLIZ;
    public final String LLILZLL = "base_progress";
    public final EnumC1783170wVH LLIZLLLIL = EnumC1783170wVH.MANAGER;

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC20561515cz, X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LLIZLLLIL;
    }

    public C20557515cL(AdaptionPaddingValues adaptionPaddingValues) {
        this.LLIZ = adaptionPaddingValues;
        new C0T9Y() { // from class: X.15cq
        };
    }

    @Override // X.AbstractC20561515cz
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZJ(AdaptionPaddingValues adaptionPaddingValues) {
        float fFloatValue;
        Float f = this.LLILZIL;
        if (f != null) {
            fFloatValue = f.floatValue();
            if (fFloatValue > 1.0f) {
                fFloatValue = 1.0f;
            }
        } else {
            fFloatValue = 0.0f;
        }
        AdaptionPaddingValues adaptionPaddingValues2 = new AdaptionPaddingValues(((int) ((this.LLIZ.getLeft() - adaptionPaddingValues.getLeft()) * fFloatValue)) + adaptionPaddingValues.getLeft(), ((int) ((this.LLIZ.getTop() - adaptionPaddingValues.getTop()) * fFloatValue)) + adaptionPaddingValues.getTop(), ((int) ((this.LLIZ.getRight() - adaptionPaddingValues.getRight()) * fFloatValue)) + adaptionPaddingValues.getRight(), ((int) ((this.LLIZ.getBottom() - adaptionPaddingValues.getBottom()) * fFloatValue)) + adaptionPaddingValues.getBottom());
        this.LLILZ = adaptionPaddingValues2;
        LIZLLL(adaptionPaddingValues2);
    }
}
