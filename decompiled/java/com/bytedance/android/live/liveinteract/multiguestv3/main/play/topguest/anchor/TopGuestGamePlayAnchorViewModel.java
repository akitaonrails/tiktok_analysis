package com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor;

import X.AnonymousClass0950;
import X.C01ZI;
import X.C01ZO;
import X.C09IC;
import X.C09IR;
import X.C2252331DDr;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: loaded from: classes.dex */
public final class TopGuestGamePlayAnchorViewModel extends BaseTopGuestGamePlayViewModel {
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;
    public final C01ZO LLILZLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel
    public final String wQ2() {
        return "TopGuestGamePlayAnchorViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel
    public final /* bridge */ /* synthetic */ C01ZI vQ2() {
        return this.LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01ZO] */
    public TopGuestGamePlayAnchorViewModel(final DataChannel dataChannel) {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZLL = new C01ZI(dataChannel) { // from class: X.01ZO
            public final C01ZM LJIJJ = new C01ZL() { // from class: X.01ZM
                public static JSONArray LJ() throws JSONException {
                    JSONArray jSONArray = new JSONArray();
                    InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
                    List<LinkUser> listLIZLLL = interfaceC954180awCUU1 != null ? interfaceC954180awCUU1.LIZLLL() : null;
                    C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                    if (listLIZLLL != null) {
                        ArrayList<Long> arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                        Iterator<LinkUser> it2 = listLIZLLL.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().userId);
                        }
                        for (Long l : arrayList) {
                            if (l != null) {
                                l.longValue();
                                C930480aJy c930480aJy = C930480aJy.LIZ;
                                long jLongValue = l.longValue();
                                c930480aJy.getClass();
                                if (!C930480aJy.LJIJJ(Long.valueOf(jLongValue))) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("guest_id", l.longValue());
                                    jSONObject.put("guest_rank", c01zrLIZIZ != null ? Integer.valueOf(c01zrLIZIZ.LIZ(l.longValue())) : null);
                                    jSONObject.put("guest_point", c01zrLIZIZ != null ? Long.valueOf(c01zrLIZIZ.LIZIZ(l.longValue())) : null);
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                    }
                    return jSONArray;
                }

                @Override // X.C01ZL
                public final boolean LIZLLL(TopGuestMetaContent topGuestMetaContent, String str) {
                    if (!super.LIZLLL(topGuestMetaContent, "anchor start game") || this.LIZLLL == 0 || topGuestMetaContent == null) {
                        return false;
                    }
                    HashMap map = new HashMap();
                    C404301hh.LIZIZ(map);
                    map.put("top_guests_id", String.valueOf(topGuestMetaContent.playId));
                    map.put("guest_info", LJ().toString());
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_top_guests_apply");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LIZ();
                    this.LJFF = 0;
                    return true;
                }

                @Override // X.C01ZL
                public final boolean LIZJ(TopGuestMetaContent topGuestMetaContent, int i, String str) {
                    if (!super.LIZJ(topGuestMetaContent, i, str) || this.LIZLLL == 0 || topGuestMetaContent == null) {
                        return false;
                    }
                    long jLIZ = LIZ(this.LIZLLL, System.currentTimeMillis());
                    HashMap map = new HashMap();
                    C404301hh.LIZIZ(map);
                    map.put("top_guests_id", String.valueOf(topGuestMetaContent.playId));
                    map.put("end_reason", str);
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    map.put("total_duration", String.valueOf(jLIZ / j));
                    map.put("other_play_duration", String.valueOf(this.LIZIZ / j));
                    map.put("guest_info", LJ().toString());
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_top_guests_end");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LIZ();
                    this.LJFF = 1;
                    return true;
                }
            };

            @Override // X.C01ZI
            public final String LJFF() {
                return "TopGuestGamePlayAnchorModel";
            }

            @Override // X.C01ZI
            public final void LJIIIIZZ() {
                this.LJIILJJIL = (C917810ZzX.LJIIIIZZ() || C917810ZzX.LJII()) ? "switch_cohost" : "live_end";
                super.LJIIIIZZ();
            }

            @Override // X.C01ZI
            public final /* bridge */ /* synthetic */ C01ZL LJI() {
                return this.LJIJJ;
            }
        };
    }
}
