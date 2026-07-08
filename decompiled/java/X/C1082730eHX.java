package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyPanelAlphaOptSetting;

/* JADX INFO: renamed from: X.0eHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082730eHX extends C1082630eHN {
    public C1082730eHX(AbstractC1080560eE2 abstractC1080560eE2) {
        super(C1079590eCT.LJII, abstractC1080560eE2);
    }

    @Override // X.C1082630eHN
    public final boolean LIZJ(C1082760eHa c1082760eHa) {
        if (c1082760eHa.LIZ.LJ == EnumC766540U5c.BEAUTY_PANEL && LiveBeautyPanelAlphaOptSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }
}
