package X;

import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS55S0010000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UC6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC6 implements Runnable {
    public DataChannel LL;
    public C0UC8 LLILLJJLI;
    public boolean LLILLL;

    public final void LIZ() {
        String str;
        String str2;
        String str3;
        ((EffectRelatedApi) C482260Ivg.LIZJ(EffectRelatedApi.class)).finishEffectTask(3).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.08DF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.finishEffectTask$1");
                C20441214yg.LIZIZ("Effect", "finish task successful!");
                C1C7U.LIZIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.finishEffectTask$1");
            }
        }, new C09JN() { // from class: X.08DE
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.finishEffectTask$2");
                C20441214yg.LJ("Effect", "finish task failed!");
                C1C7U.LIZIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.finishEffectTask$2");
            }
        });
        C0UC4.LJIIIIZZ = true;
        DataChannel dataChannel = this.LL;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(C0U9L.class) : null;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C0UC4.LJIIZILJ;
        C0UC8 c0uc8 = this.LLILLJJLI;
        String str4 = "";
        if (c0uc8 == null || (str = c0uc8.LIZIZ) == null) {
            str = "";
        }
        boolean zContainsKey = concurrentHashMap.containsKey(str);
        C0UC4 c0uc4 = C0UC4.LIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_sticker_effective_use");
        c474500IjALIZ.LJIJJLI(this.LL);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL ? 1 : 0), "is_new_anchor_guide");
        C0UC4.LJJIJIIJI(c474500IjALIZ, this.LLILLJJLI);
        C0UC8 c0uc82 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(c0uc82 != null ? Boolean.valueOf(c0uc82.LJIILLIIL) : null) ? 1 : 0), "is_same_effect_scene");
        C0UC4.LJIIL(c474500IjALIZ, this.LLILLJJLI);
        C0UC4.LJIILLIIL(c474500IjALIZ);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 689);
        HashMap<Long, Long> map = C0UC4.LJJIII;
        C0UC8 c0uc83 = this.LLILLJJLI;
        Long l = map.get(c0uc83 != null ? Long.valueOf(c0uc83.LIZ) : null);
        c474500IjALIZ.LJJIIZ(Long.valueOf(l != null ? l.longValue() : -1L), "favorite_source_app_id", awS556S0100000_12);
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(objGg0, Boolean.TRUE) ? 1 : 0), "is_preview_apply");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ry(), "link_id");
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(zContainsKey), "is_preload", AFwS199S0000000_12.get$arr$(220));
        AwS55S0010000_12 awS55S0010000_12 = new AwS55S0010000_12(zContainsKey, 5);
        C0UC8 c0uc84 = this.LLILLJJLI;
        if (c0uc84 == null || (str2 = c0uc84.LIZIZ) == null) {
            str2 = "";
        }
        Boolean bool = concurrentHashMap.get(str2);
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(bool != null ? bool.booleanValue() : false), "is_downloaded", awS55S0010000_12);
        C0UC8 c0uc85 = this.LLILLJJLI;
        if (c0uc85 != null) {
            if (Intrinsics.LJFF(c0uc85.LIZIZ, C0UAS.LIZIZ)) {
                c474500IjALIZ.LJJII("1", "is_entrance_default");
            } else {
                c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_entrance_default");
            }
        }
        Map<String, String> map2 = C0UC4.LJJI;
        if (map2 != null && map2.containsKey("enter_from")) {
            Map<String, String> map3 = C0UC4.LJJI;
            if (map3 != null && (str3 = map3.get("enter_from")) != null) {
                str4 = str3;
            }
            c474500IjALIZ.LJJII(str4, "enter_from");
        } else if (C500260Jjc.LJIJ(dataChannelGlobal)) {
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        }
        c474500IjALIZ.LJJIJL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStickerLogManager$ReportStickerEffectUseRunnable@5eca.run");
    }
}
