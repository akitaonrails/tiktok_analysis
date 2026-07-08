package X;

import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;

/* JADX INFO: renamed from: X.0COt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC313010COt extends AbstractC312990COr {
    public abstract void LJII(SettingCombineModel settingCombineModel);

    public abstract boolean LJIIIIZZ(SettingCombineModel settingCombineModel);

    @Override // X.AbstractC312990COr
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        boolean zLJIIIIZZ = LJIIIIZZ(settingCombineModel);
        if (zLJIIIIZZ) {
            LJII(settingCombineModel);
        }
        return zLJIIIIZZ;
    }
}
