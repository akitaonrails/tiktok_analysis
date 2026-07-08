package X;

import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449730HkJ {
    public static final List<EnumC449720HkI> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC449720HkI.FAV_STICKER);
        if (C294720Bgs.LIZ()) {
            arrayList.add(EnumC449720HkI.POPULAR_STICKER);
        }
        arrayList.add(EnumC449720HkI.SYSTEM_EMOJI);
        arrayList.add(EnumC449720HkI.AIMOJI);
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        if (c454640HsE.LIZIZ().getImAiSelfStickerService().LJI()) {
            arrayList.add(EnumC449720HkI.AISELF);
        }
        if (c454640HsE.LIZIZ().getImStreakStickerService().LJ()) {
            arrayList.add(EnumC449720HkI.STREAK_STICKER);
        }
        arrayList.add(EnumC449720HkI.SET_STICKERS);
        return arrayList;
    }
}
