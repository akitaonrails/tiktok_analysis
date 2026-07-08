package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftTrayInfo;

/* JADX INFO: renamed from: X.0feY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135440feY extends AbstractC1135510fef<C1085970eMl> {
    public C1135440feY(C1135360feQ c1135360feQ) {
        super(c1135360feQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1135370feR
    public final InterfaceC1897807c0 LIZ(C1135320feM c1135320feM) {
        T t = c1135320feM.LIZ;
        if (((C1085970eMl) t).LIZ.mTrayInfo != null) {
            GiftTrayInfo giftTrayInfo = ((C1085970eMl) t).LIZ.mTrayInfo;
            ImageModel imageModel = null;
            if (giftTrayInfo != null && giftTrayInfo.mDynamicImg != null) {
                GiftTrayInfo giftTrayInfo2 = ((C1085970eMl) t).LIZ.mTrayInfo;
                if (giftTrayInfo2 != null) {
                    imageModel = giftTrayInfo2.mDynamicImg;
                }
                C1324570kZb.LJIIIIZZ(imageModel);
            }
        }
        return C1135550fej.LIZ;
    }
}
