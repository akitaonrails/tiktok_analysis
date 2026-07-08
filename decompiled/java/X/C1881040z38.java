package X;

import android.content.Context;
import android.util.Size;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCardModel;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881040z38 extends AbstractC1882430z5N {
    public final int LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final String LLJJ;
    public final Function1<JSONObject, Unit> LLJJI;
    public C1881080z3C LLJJIII;
    public GameStationGameInfo LLJJIJI;
    public BriefGameTask LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILIIL() {
        super.LJIILIIL();
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) this.LLJJIJIL.getValue());
        LJIIIZ().LJIILJJIL().LIZLLL(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) this.LLJJJ.getValue());
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        C1881080z3C c1881080z3C = this.LLJJIII;
        if (c1881080z3C != null) {
            ((InterfaceC1880780z2i) this.LLJJIJIL.getValue()).LIZ(c1881080z3C);
        }
        this.LLJJIII = null;
    }

    public final void LJJIFFI() {
        PartnershipTask partnershipTask;
        PartnershipTask partnershipTask2;
        C1882410z5L c1882410z5LLJII = LJII();
        GameStationGameInfo gameStationGameInfo = this.LLJJIJI;
        C1882380z5I.LJI(c1882410z5LLJII, "game_id", gameStationGameInfo != null ? gameStationGameInfo.idStr : null);
        C1882410z5L c1882410z5LLJII2 = LJII();
        GameStationGameInfo gameStationGameInfo2 = this.LLJJIJI;
        C1882380z5I.LJI(c1882410z5LLJII2, "game_tag_id", gameStationGameInfo2 != null ? gameStationGameInfo2.gameTagId : null);
        C1882410z5L c1882410z5LLJII3 = LJII();
        BriefGameTask briefGameTask = this.LLJJIJIIJIL;
        C1882380z5I.LJI(c1882410z5LLJII3, "task_id", (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null) ? null : partnershipTask2.idStr);
        C1882410z5L c1882410z5LLJII4 = LJII();
        BriefGameTask briefGameTask2 = this.LLJJIJIIJIL;
        C1882380z5I.LJI(c1882410z5LLJII4, "promote_task_type", (briefGameTask2 == null || (partnershipTask = briefGameTask2.task) == null) ? null : Integer.valueOf(partnershipTask.taskType));
        C1882380z5I.LJI(LJII(), "author_id", this.LLJILLL.get("host_id"));
        C1882380z5I.LJI(LJII(), "host_id", this.LLJILLL.get("host_id"));
        C1882410z5L c1882410z5LLJII5 = LJII();
        BriefGameTask briefGameTask3 = this.LLJJIJIIJIL;
        C1882380z5I.LJI(c1882410z5LLJII5, "log_extra", briefGameTask3 != null ? briefGameTask3.logExtra : null);
        C1882410z5L c1882410z5LLJII6 = LJII();
        BriefGameTask briefGameTask4 = this.LLJJIJIIJIL;
        C1882380z5I.LJI(c1882410z5LLJII6, "extra_params", briefGameTask4 != null ? briefGameTask4.extraParams : null);
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        GameLivePartnershipPinCardModel gameLivePartnershipPinCardModel = new GameLivePartnershipPinCardModel();
        gameLivePartnershipPinCardModel.pinCardType = Integer.valueOf(this.LLJILJILJ);
        gameLivePartnershipPinCardModel.schemaExtras = this.LLJILLL;
        gameLivePartnershipPinCardModel.initialData = this.LLJJ;
        gameLivePartnershipPinCardModel.gameInfo = this.LLJJIJI;
        LJIJ(C1881030z37.LIZIZ(new C1881820z4O("\n            {\n                \"basic_info\": {\n                    \"cards\": [\n                        {\n                            \"card_class\": \"game_live_partnership_pin_card\",\n                            \"data_key_path\": [\n                                \"pin_card_type\",\n                                \"schema_extras\",\n                                \"initial_data\"\n                            ],\n                            \"top_margin\": 0\n                        }\n                    ]\n                }\n            }\n        ", new JSONObject(C476770Imp.LJ(gameLivePartnershipPinCardModel)))), true);
    }

    public final void LJIL(JSONObject jSONObject) {
        Object c098200Yq;
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (Intrinsics.LJFF(next, "game_info")) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    c098200Yq = null;
                    if (jSONObjectOptJSONObject != null) {
                        C1882410z5L c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(LJIIIZ());
                        String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                        if (strJ3 != null && strJ3.length() != 0) {
                            c098200Yq = C293501Bt.LIZ().LJIIIIZZ(strJ3, new TypeToken<GameStationGameInfo>() { // from class: X.0z3E
                            }.getType());
                        }
                        C1882380z5I.LJI(c1882410z5LLJIIIIZZ, "game_info", c098200Yq);
                        JSONObject jSONObjectLJ = C1882380z5I.LJ(LJIIIZ(), Collections.singletonList("schema_extras"));
                        jSONObjectLJ.put("game_info", jSONObjectOptJSONObject);
                        C1882380z5I.LJIIIZ(LJIIIZ(), "schema_extras", jSONObjectLJ);
                        LJIIIZ().LJIIJJI().LJIJJ(new C1881140z3I(jSONObject));
                        c098200Yq = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    C1882380z5I.LJIIIZ(LJIIIZ(), next, objOpt);
                    z = true;
                }
            }
        }
        if (z) {
            LJIIIZ().LJIIIIZZ();
        }
    }

    public final void LJJ(Map<String, String> map) {
        try {
            String str = map.get("card_info");
            BriefGameTask briefGameTask = null;
            Object objLJIIIIZZ = null;
            if (str != null) {
                if (str.length() != 0) {
                    objLJIIIIZZ = C293501Bt.LIZ().LJIIIIZZ(str, new TypeToken<BriefGameTask>() { // from class: X.0z3F
                    }.getType());
                }
                briefGameTask = (BriefGameTask) objLJIIIIZZ;
            }
            this.LLJJIJIIJIL = briefGameTask;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJJI(Map<String, String> map) {
        try {
            String str = map.get("game_info");
            GameStationGameInfo gameStationGameInfo = null;
            Object objLJIIIIZZ = null;
            if (str != null) {
                if (str.length() != 0) {
                    objLJIIIIZZ = C293501Bt.LIZ().LJIIIIZZ(str, new TypeToken<GameStationGameInfo>() { // from class: X.0z3G
                    }.getType());
                }
                gameStationGameInfo = (GameStationGameInfo) objLJIIIIZZ;
            }
            this.LLJJIJI = gameStationGameInfo;
            C1882380z5I.LJI(C1882380z5I.LJIIIIZZ(LJIIIZ()), "game_info", this.LLJJIJI);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1881040z38(Context context, Room room, DataChannel dataChannel, int i, Map<String, String> map, String str, Function1<? super JSONObject, Unit> function1) {
        super(context, "game_live_partnership_pin_card");
        this.LLJILJILJ = i;
        this.LLJILLL = map;
        this.LLJJ = str;
        this.LLJJI = function1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1881070z3B(this));
        this.LLJJIJIL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C1881060z3A(this));
        this.LLJJJ = c01gwLIZIZ2;
        LJIIIZ().LJI().LIZIZ("game_live_partnership_pin_card", GameLivePartnershipPinCard.class, null);
        LJIIIZ().LJIIJJI().LJIJI(new Size(-1, -1));
        LJIIIZ().LJ(new InterfaceC1882940z6C() { // from class: X.0z3D
            @Override // X.InterfaceC1882940z6C
            public final int LIZ(AbstractC1882890z67 abstractC1882890z67) {
                return 1;
            }
        });
        LJJ(map);
        LJJI(map);
        C1882380z5I.LJI(LJII(), "room_data", room);
        C1882380z5I.LJI(LJII(), "data_channel", dataChannel);
        C1882380z5I.LJI(LJII(), Scene.SCENE_SERVICE, 0);
        C1882380z5I.LJI(LJII(), "room_id", room != null ? room.getIdStr() : null);
        LJJIFFI();
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880780z2i.class, (InterfaceC1883360z6s) c01gwLIZIZ.getValue());
        LJIIIZ().LJIILJJIL().LIZJ(InterfaceC1880940z2y.class, (InterfaceC1883360z6s) c01gwLIZIZ2.getValue());
        C1881080z3C c1881080z3C = new C1881080z3C(this);
        this.LLJJIII = c1881080z3C;
        ((InterfaceC1880780z2i) c01gwLIZIZ.getValue()).LIZIZ(c1881080z3C);
    }
}
