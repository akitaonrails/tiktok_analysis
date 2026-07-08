package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZM9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZM9 {
    public static final LightInteractionStickerSetMessage LIZ;
    public static final Map<Pair<String, String>, String> LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;

    static {
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = new LightInteractionStickerSetMessage("50364166147", "44142529795", null, 2, CardStruct.IStatusCode.DEFAULT, "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/fire.webp", "tos-maliva-i-qj2ts5gcsk-us/64b9ad1b735746309ba25b0e4e00bb2b", null, "sticker", null, null, 0, 0, null);
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage2 = (LightInteractionStickerSetMessage) SettingsManager.LIZLLL().LJIIIIZZ("spark_sticker_default_config", LightInteractionStickerSetMessage.class, lightInteractionStickerSetMessage);
        if (lightInteractionStickerSetMessage2 != null) {
            lightInteractionStickerSetMessage = lightInteractionStickerSetMessage2;
        }
        LIZ = lightInteractionStickerSetMessage;
        LIZIZ = C2097608Jq.LJIIJ(new Pair(new Pair(lightInteractionStickerSetMessage.stickerId, lightInteractionStickerSetMessage.stickerSetId), EnumC895010Z9f.SPARK_V1.getLightInteractionName()));
        LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(436));
        LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(435));
    }
}
