package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;

/* JADX INFO: renamed from: X.0tNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1663140tNg {
    public boolean isInTikTokRegion;

    public final String getShowBeautyToast(Context context) {
        return context.getResources().getString(2131848065);
    }

    public final boolean isCorrectRegion(BeautyCategoryExtra beautyCategoryExtra) {
        if (this.isInTikTokRegion) {
            return beautyCategoryExtra.regionT;
        }
        return beautyCategoryExtra.regionM;
    }

    public final void setIsInProperRegion(boolean z) {
        this.isInTikTokRegion = z;
    }

    public final void setIsInTikTokRegion(boolean z) {
        this.isInTikTokRegion = z;
    }
}
