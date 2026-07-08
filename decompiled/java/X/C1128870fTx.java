package X;

import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128870fTx implements InterfaceC1131100fXY {
    public final long LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public final Room LJFF;
    public final int LJI;
    public final C1126150fPZ LJII;
    public InterfaceC1125320fOE LJIIIZ;
    public long LJIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public long LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public List<Long> LJJI;
    public List<Long> LJJIFFI;
    public long LJJII;
    public List<Long> LJJIII;
    public String LJJIIJ;
    public GiftGalleryExtra LJJIIJZLJL;
    public C1123400fL8 LJJIIZ;
    public long LJJIIZI;
    public int LJJIJ;
    public String LJJIJIIJI;
    public int LJJIJIIJIL;
    public String LJJIJIL;
    public int LJJIJL;
    public String LJJIJLIJ;
    public int LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public C1125860fP6 LJJJI;
    public boolean LJJJIL;
    public long LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public boolean LJJJJZI;
    public int LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public boolean LJJJZ;
    public boolean LJJL;
    public Boolean LJJLI;
    public boolean LJJLIIIIJ;
    public int LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public C1125300fOC LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public List<String> LJJLIIIJLLLLLLLZ;
    public Gift LJJLIIJ;
    public int LJJLIL;
    public long LJJLJ;
    public int LJJLJLI;
    public String LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public C1126160fPa LJL;
    public InterfaceC1125350fOH LJLI;
    public String LJLIIIL;
    public Map<String, ? extends Object> LJLIIL;
    public C1129370fUl LJLIL;
    public boolean LJLILLLLZI;
    public EnumC1130940fXI LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Long LJLJJLL;
    public C1132880faQ LJLJL;
    public int LJLJLJ;
    public final C1130500fWa LJLJLLL;
    public boolean LJLL;
    public EnumC1131060fXU LJIIIIZZ = EnumC1131060fXU.NONE;
    public String LJIIJ = "click";
    public int LJIIJJI = -1;
    public long LJIILIIL = -1;
    public String LJIJI = CardStruct.IStatusCode.DEFAULT;
    public String LJJ = "click_icon";

    @Override // X.InterfaceC1131100fXY
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIJL() {
        this.LJJJJLL = true;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJJI() {
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLZ() {
        this.LJIJ = 0;
    }

    @Override // X.InterfaceC1131100fXY
    public final Map<String, Long> LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("is_incentive_task_pre_reward", Long.valueOf(this.LJJL ? 1L : 0L));
            linkedHashMap.put("reward_task", Long.valueOf(this.LJJZZI));
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GiftSendEvent", e);
            return linkedHashMap;
        }
    }

    @Override // X.InterfaceC1131100fXY
    public final List<Long> LJIIJ() {
        List<C1125380fOK> list;
        C1126160fPa c1126160fPa = this.LJL;
        if (c1126160fPa == null || (list = c1126160fPa.LIZIZ) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1125380fOK> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZ.getId()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIIJZLJL() {
        this.LJIJJLI = 97;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJJJIL() {
        return this.LJII.LIZ == EnumC1129230fUX.SPECIAL_GIFT_COMBO ? "live_stream" : !Intrinsics.LJFF(this.LJJIJIIJI, "lynx") ? "gift_panel" : "lynx";
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJJJIZL() {
        C1126160fPa c1126160fPa = this.LJL;
        List<C1125380fOK> list = c1126160fPa != null ? c1126160fPa.LIZIZ : null;
        int size = 1;
        if (list != null && (!list.isEmpty())) {
            size = list.size();
        }
        return this.LJIJ * this.LIZLLL * size;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJJLIIIJLLLLLLLZ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("enter_from", this.LJLJLLL.LIZ);
            if (this.LJJL) {
                str = "prereward";
            } else {
                int i = this.LJJLIIIJ;
                str = (i == 1 || i == 2) ? "exchange" : "success";
            }
            jSONObject.putOpt("flow_type", str);
            jSONObject.putOpt("live_income_gift_task", this.LJLJLLL.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GiftSendEvent", e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJLIIL() {
        return this.LJJIIZI > 0;
    }

    @Override // X.InterfaceC1131100fXY
    public final Room LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LIZIZ() {
        return this.LJLIIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1132880faQ LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJ() {
        return this.LJJLIIIJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJI() {
        return this.LJJJJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final InterfaceC1125350fOH LJII() {
        return this.LJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJIIIIZZ() {
        return this.LJJJJJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJIIJJI() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final Map<String, Object> LJIILIIL() {
        return this.LJLIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final EnumC1131060fXU LJIILJJIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJIILL() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJIILLIIL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJIIZILJ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJIJ() {
        return this.LJJJLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJIJI() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final EnumC1130940fXI LJIJJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJIJJLI() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final List<Long> LJIL() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJI() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJIFFI() {
        return this.LJJJJLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJII() {
        return this.LJJLJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final Boolean LJJIIJ() {
        return this.LJJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJIJ() {
        return this.LJJZZIII;
    }

    @Override // X.InterfaceC1131100fXY
    public final InterfaceC1125320fOE LJJIJIIJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJJIJIL() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJIL() {
        return this.LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final List<Long> LJJIZ() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJJJJ() {
        return this.LJJII;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJJJI() {
        return this.LJJJJJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJJJJJ() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJJJJL() {
        return this.LJJJJZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJJJL() {
        return this.LJJJJIZL;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1126150fPZ LJJJJZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJJJJZI() {
        return this.LJJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJJJLIIL() {
        return this.LJJJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJJLL() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1125300fOC LJJJLZIJ() {
        return this.LJJLIIIJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJJZ() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJL() {
        return this.LJJJLZIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJLI() {
        return this.LJJJZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJJLIIIJ() {
        return this.LJJJJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJLIIIJILLIZJL() {
        return this.LJJZZI;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1123400fL8 LJJLIIIJJI() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1126160fPa LJJLIIIJJIZ() {
        return this.LJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJLIIIJLJLI() {
        return this.LJJLIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJLIIJ() {
        return this.LJJLIIIIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1129370fUl LJJLIL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJZ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJJZZI() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJJZZIII() {
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJL() {
        return this.LJJJJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final List<Long> LJLI() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC1131100fXY
    public final long LJLIIIL() {
        return this.LJJLJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJLIL() {
        return this.LJJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJLILLLLZI() {
        return this.LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJLJJL() {
        return this.LJJLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJLJJLL() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJLJL() {
        return this.LJJLIIIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean LJLJLLL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJLLJ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1125860fP6 LJLLL() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LJLLLLLL() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LJZ() {
        return this.LJIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final Gift LJZI() {
        return this.LJJLIIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final C1130500fWa LJZL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final String LL() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int LLD() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC1131100fXY
    public final String getClickType() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getComboButtonAwaitBehaviour() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getCount() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getDiamondCount() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final long getEffectId() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final String getGiftExtra() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final GiftGalleryExtra getGiftExtraForClient() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final long getGiftId() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final long getGiftMagicResultId() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getGiftType() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final boolean getGuardianGiftClickSponsor() {
        return this.LJLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final String getNotificationType() {
        return this.LJJLIIIJLJLI;
    }

    @Override // X.InterfaceC1131100fXY
    public final List<String> getOutfitGiftIds() {
        return this.LJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getRetryCount() {
        return this.LJJZ;
    }

    @Override // X.InterfaceC1131100fXY
    public final String getSource() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final String getStreamGoalEntrance() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getTabId() {
        return this.LJI;
    }

    @Override // X.InterfaceC1131100fXY
    public final Long getToMemberId() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC1131100fXY
    public final int getToastDelaySeconds() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LIZLLL(boolean z) {
        this.LJJLIIIJL = z;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJIIIZ(long j) {
        this.LJIIL = j;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIII(int i) {
        this.LJJZ = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIIZ(boolean z) {
        this.LJJL = z;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIJIIJIL(int i) {
        this.LJJJLIIL = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJIJLIJ(int i) {
        this.LJJLIIIJ = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJJ(C1132880faQ c1132880faQ) {
        this.LJLJL = c1132880faQ;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJJJLI(EnumC1131060fXU enumC1131060fXU) {
        this.LJIIIIZZ = enumC1131060fXU;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJLIIIIJ(int i) {
        this.LJJZZI = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJLIIIJL(String str) {
        this.LJLJLLL.LIZIZ = str;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJLJ(Long l) {
        this.LJLJJLL = l;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJLJLI(Boolean bool) {
        this.LJJLI = bool;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJJLL(String str) {
        this.LJJ = str;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLJI(C1123400fL8 c1123400fL8) {
        this.LJJIIZ = c1123400fL8;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLJJI(boolean z) {
        this.LJJLIIIJILLIZJL = z;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLJLJ(int i) {
        this.LJIL = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLL(int i) {
        this.LJJLJLI = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLLI(boolean z) {
        this.LJJJJJ = z;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLLILLLL(boolean z) {
        this.LJJLIIIIJ = z;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LJLLLL(C1125860fP6 c1125860fP6) {
        this.LJJJI = c1125860fP6;
    }

    @Override // X.InterfaceC1131100fXY
    public final void LLF(long j) {
        this.LJJJJ = j;
    }

    @Override // X.InterfaceC1131100fXY
    public final void setCount(int i) {
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC1131100fXY
    public final void setSource(String str) {
        this.LJLJJI = str;
    }

    public C1128870fTx(long j, int i, int i2, boolean z, Room room, int i3, C1126150fPZ c1126150fPZ) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = room;
        this.LJI = i3;
        this.LJII = c1126150fPZ;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJI = c13bv;
        this.LJJIFFI = c13bv;
        this.LJJIJ = -1;
        this.LJJIJIIJI = "";
        this.LJJIJIIJIL = -1;
        this.LJJIJIL = "unknown";
        this.LJJIJL = -1;
        this.LJJIJLIJ = "";
        this.LJJLIIIIJ = true;
        this.LJJLIIIJL = true;
        this.LJJZZI = -1;
        this.LJLIIIL = "";
        this.LJLIL = new C1129370fUl(false, false, 0, 0, null, 0L, 63);
        this.LJLILLLLZI = true;
        this.LJLJLLL = new C1130500fWa();
    }
}
