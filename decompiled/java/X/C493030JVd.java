package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.UpdateEmoteRequest;

/* JADX INFO: renamed from: X.0JVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493030JVd implements C0JUA {
    @Override // X.C0JUA
    public final C11O8 LJII(String str) {
        C480460Ism.LIZ().getClass();
        return C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getEmotesDetail(true, str, 1), EnumC510330Jzr.EMOTE, "sub_wave_emote", null, new LinkedHashMap(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // X.C0JUA
    public final C11O8 LJJIIZI(List list) {
        UpdateEmoteRequest updateEmoteRequest = new UpdateEmoteRequest();
        updateEmoteRequest.emoteList = list;
        updateEmoteRequest.isCustomSubwaveRewards = true;
        C480460Ism.LIZ().getClass();
        return ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).updateEmotes(updateEmoteRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    @Override // X.C0JUA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(android.content.Context r9, X.C0JUY r10, com.bytedance.android.livesdkapi.host.IHostSubscription.Params r11, X.InterfaceC1364105Vn<? super com.bytedance.android.live.base.model.emoji.EmoteModel> r12) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C493030JVd.j0(android.content.Context, X.0JUY, com.bytedance.android.livesdkapi.host.IHostSubscription$Params, X.05Vn):java.lang.Object");
    }
}
