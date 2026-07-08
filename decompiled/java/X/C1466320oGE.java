package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0oGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466320oGE extends AbstractC1442160ndG<LocationStickerModel> {
    public final Context LIZJ;
    public final String LIZLLL;
    public final C0FKI LJ;

    @Override // X.AbstractC1442160ndG
    public final EnumC1466150oFx LIZJ() {
        return EnumC1466150oFx.LOCATION;
    }

    @Override // X.AbstractC1442160ndG
    public final String LIZ(StickerModel stickerModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("/location_sticker/");
        sbLIZ.append(((LocationStickerModel) stickerModel).getId());
        sbLIZ.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1442160ndG
    public final View LIZIZ(StickerModel stickerModel) {
        String str;
        LocationStickerModel locationStickerModel = (LocationStickerModel) stickerModel;
        C19623411q4 c19623411q4 = new C19623411q4(this.LIZJ, null);
        if (!locationStickerModel.getUseCapsuleStyle()) {
            c19623411q4.LJJJJJ(new AwS601S0100000_22(this, 643));
        }
        locationStickerModel.getInteractStickerStruct();
        c19623411q4.LLJJLIIIJLLLLLLLZ = EnumC993860byC.COMPILE;
        PoiData poiData = locationStickerModel.getPoiData();
        if (poiData == null || (str = poiData.name) == null) {
            str = "";
        }
        c19623411q4.setText(str);
        c19623411q4.LLJL = locationStickerModel.getUseCapsuleStyle();
        c19623411q4.LJJJJI(C11VU.LJII(locationStickerModel.getTextSize(), c19623411q4.getContext()));
        c19623411q4.LJJJJLI(locationStickerModel.getTheme());
        return c19623411q4;
    }

    @Override // X.AbstractC1442160ndG
    public final StickerModel LIZLLL(StickerModel stickerModel, int i, int i2) {
        LocationStickerModel locationStickerModel = (LocationStickerModel) stickerModel;
        return locationStickerModel.copy(BaseStickerModel.copy$default(locationStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, i, i2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null), locationStickerModel.theme, locationStickerModel.poiData, locationStickerModel.clickable, locationStickerModel.textSize, locationStickerModel.isCutOff, locationStickerModel.useCapsuleStyle);
    }

    public C1466320oGE(Context context, C1440500naa c1440500naa, C0FKI c0fki, String str) {
        super(context, c1440500naa);
        this.LIZJ = context;
        this.LIZLLL = str;
        this.LJ = c0fki;
    }
}
