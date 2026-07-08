package X;

import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeTrackingSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0b4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959210b4J extends AbstractC497830Jfh implements InterfaceC955420ayC {
    public EnumC955660aya LJIIIZ;
    public EnumC955660aya LJIIJ;
    public EnumC955660aya LJIIJJI;
    public EnumC955660aya LJIIL;
    public C955540ayO LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public Room LJIJ;
    public RivalExtraInfo LJIJI;
    public Room LJIJJ;
    public RivalExtraInfo LJIJJLI;
    public C951420ark LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public final Map<Long, String> LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public final List<Object> LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public boolean LJJIJIIJI;
    public Integer LJJIJIIJIL;
    public String LJJIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public GiftGalleryBadgeInfo LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public TagV2 LJJJI;
    public JoinGroupMessageExtra.RivalExtra LJJJIL;
    public long LJJJJ;
    public int LJJJJI;
    public String LJJJJIZL;
    public List<Long> LJJJJJ;
    public final Map<Long, String> LJJJJJL;
    public List<Long> LJJJJL;
    public boolean LJJJJLI;
    public long LJJJJLL;
    public long LJJJJZ;
    public boolean LJJJJZI;
    public Map<String, String> LJJJLIIL;
    public int LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public RivalsListsData.TopHostInfo LJJLIIIJILLIZJL;
    public final Map<Long, Map<String, String>> LJJLIIIJJI;
    public boolean LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public ActivePlaybook LJJLIIJ;
    public Map<String, String> LJJLIL;
    public boolean LJJLJ;
    public List<Integer> LJJLJLI;
    public List<Integer> LJJLL;
    public long LJJZ;
    public Map<C955540ayO, Map<Long, Long>> LJJZZI;
    public final Map<String, String> LJJZZIII;
    public final Map<Long, Map<String, String>> LJL;
    public final Map<String, String> LJLI;
    public final Map<Integer, String> LJLIIIL;

    @Override // X.InterfaceC955420ayC
    public final void LIZJ() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIL() {
        this.LJJLIIIJJIZ = true;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJLZIJ() {
        this.LJIILL = false;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJZ() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJI() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LLII() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJ() {
        this.LJJLIIIJ = true;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJIL() {
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLL() {
        this.LJIILJJIL = true;
        this.LJIILL = this.LIZIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC944980ahM LLIIJI() {
        EnumC944980ahM enumC944980ahM;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        return (dataChannel == null || (enumC944980ahM = (EnumC944980ahM) dataChannel.gg0(LinkerStateChannel.class)) == null) ? EnumC944980ahM.DISABLED : enumC944980ahM;
    }

    @Override // X.InterfaceC955420ayC
    public final C943870afZ getEnterFrom() {
        C959220b4K c959220b4K = C959220b4K.LIZ;
        return C959220b4K.LIZJ;
    }

    public C959210b4J() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initialChannelId=");
        sbLIZ.append(0L);
        C20441214yg.LJIIIZ("MultiHostDataHolderAnchorImpl", C2188811AlT.LIZIZ(sbLIZ));
        EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
        this.LJIIIZ = enumC955660aya;
        this.LJIIJ = enumC955660aya;
        this.LJIIJJI = enumC955660aya;
        this.LJIIL = enumC955660aya;
        this.LJIILIIL = C955540ayO.LIZIZ;
        this.LJIIZILJ = "";
        this.LJJ = "";
        this.LJJIFFI = "";
        this.LJJII = new LinkedHashMap();
        this.LJJIIJZLJL = new ArrayList();
        this.LJJIJ = "";
        this.LJJIJIIJIL = 0;
        this.LJJJJIZL = "";
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJJJJ = c13bv;
        this.LJJJJJL = new LinkedHashMap();
        this.LJJJJL = c13bv;
        this.LJJLIIIJILLIZJL = RivalsListsData.TopHostInfo.LIZ;
        this.LJJLIIIJJI = new LinkedHashMap();
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIL = new LinkedHashMap();
        this.LJJLJLI = c13bv;
        this.LJJLL = c13bv;
        this.LJJZZI = new LinkedHashMap();
        this.LJJZZIII = new LinkedHashMap();
        this.LJL = new LinkedHashMap();
        this.LJLI = new LinkedHashMap();
        this.LJLIIIL = new LinkedHashMap();
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIJI() {
        return !LLLIIIL().isEmpty();
    }

    @Override // X.InterfaceC955420ayC
    public final ActivePlaybook LIZIZ() {
        return this.LJJLIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIIIZ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<C955540ayO, Map<Long, Long>> LJIILJJIL() {
        return this.LJJZZI;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJIILL() {
        return this.LJJJLZIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final C955540ayO LJIILLIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LJIIZILJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LJIJJLI() {
        return this.LJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final TagV2 LJJ() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJI() {
        return this.LJJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Room LJJIFFI() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<Long, Map<String, String>> LJJII() {
        return this.LJL;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalExtraInfo LJJIII() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJIIJZLJL() {
        return this.LJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJIJIL() {
        return this.LJJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJIJL() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJIJLIJ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Object> LJJIZ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJJ() {
        return this.LJJJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJJI() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LJJJIL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJJJI() {
        return this.LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJJJJL() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Integer> LJJJJZI() {
        return this.LJJLJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJLIIIIJ() {
        return this.LJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJJLIIIJ() {
        return this.LJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJLIIIJJIZ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJLIIIJLJLI() {
        return this.LJJLIIIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJLIL() {
        return this.LJJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJL() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJLI() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Long> LJLIIIL() {
        return this.LJJJJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJLIIL() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJLIL() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalExtraInfo LJLJI() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Long> LJLJLLL() {
        return this.LJJJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJLLLLLL() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJZ() {
        return this.LJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final long LL() {
        return this.LJJJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final C951420ark LLFF() {
        return this.LJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLFFF() {
        return this.LJJJJIZL;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LLI() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Room LLIIIJ() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LLIILII() {
        return this.LJJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLILIL() {
        return this.LJJLIIIJLJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final GiftGalleryBadgeInfo LLILL() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LLILLJJLI() {
        return this.LJJJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLILLL() {
        return this.LJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLIZLLLIL() {
        return this.LJJLJ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJ() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJIII() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJJJJJIL() {
        return this.LJJLIIIJL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJJJLIIL() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJJLIIIJLLLLLLLZ() {
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJLILLLLZIIL() {
        return this.LJJLIIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final long LLJLLIL() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalsListsData.TopHostInfo LLL() {
        return this.LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC955420ayC
    public final JoinGroupMessageExtra.RivalExtra LLLF() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLLFFI() {
        return this.LJJJJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LLLFZ() {
        return this.LJJZZIII;
    }

    public final List<Integer> LLLIIIL() {
        return this.LJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya getAnchorType() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final String getLogId() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC955420ayC
    public final Integer getTagType() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> getTrackInfo() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> getTrackParams() {
        return this.LJJLIL;
    }

    @Override // X.InterfaceC955420ayC
    public final void LIZLLL(long j) {
        this.LJJIZ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJFF(C951420ark c951420ark) {
        this.LJIL = c951420ark;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJI(long j) {
        return (String) ((LinkedHashMap) this.LJJJJJL).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIIIZZ(int i) {
        this.LJIILLIIL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIJ(C943870afZ c943870afZ) {
        C959220b4K c959220b4K = C959220b4K.LIZ;
        C959220b4K.LIZJ = c943870afZ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIJ(List<Long> list) {
        this.LJJJJJ = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIL(List<Integer> list) {
        this.LJJLL = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIIJ(Map<String, String> map) {
        this.LJJJLIIL = map;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIIZI(boolean z) {
        this.LJJLJ = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJL(Integer num) {
        this.LJJIJIIJIL = num;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJLI(int i) {
        this.LJJJZ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJLIIL(String str) {
        this.LJJIIZ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLI(long j) {
        this.LJJJJZ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJILLIZJL(int i) {
        this.LJJLIIIIJ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJJI(boolean z) {
        this.LJJIII = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJL(int i) {
        this.LJJJJI = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJLLLLLLLZ(RivalExtraInfo rivalExtraInfo) {
        this.LJIJI = rivalExtraInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLJLI(Room room) {
        this.LJIJJ = room;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJZ(boolean z) {
        this.LJJLIIIJL = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJZZI(long j) {
        this.LJJJJ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJL(long j) {
        this.LJJIJL = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJLL(long j) {
        this.LJJZ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJLJ(String str) {
        this.LJJI = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLL(long j) {
        this.LJJJJLL = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLI(RivalsListsData.TopHostInfo topHostInfo) {
        this.LJJLIIIJILLIZJL = topHostInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLILLLL(String str) {
        this.LJJIJ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLJ(int i) {
        this.LJJJLL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLZ(RivalExtraInfo rivalExtraInfo) {
        this.LJIJJLI = rivalExtraInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJZI(ActivePlaybook activePlaybook) {
        this.LJJLIIJ = activePlaybook;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJZL(boolean z) {
        this.LJJIJIIJI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLD(Room room) {
        this.LJIJ = room;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLFII(TagV2 tagV2) {
        this.LJJJI = tagV2;
    }

    @Override // X.InterfaceC955420ayC
    public final C943870afZ LLIFFJFJJ(Integer num) {
        String enterFromForSourceType = (String) ((LinkedHashMap) this.LJLIIIL).get(num);
        if (enterFromForSourceType == null) {
            enterFromForSourceType = InteractionSourceTypeTrackingSetting.INSTANCE.getEnterFromForSourceType(num);
        }
        if (C123100dR.LIZ(enterFromForSourceType)) {
            return new C943870afZ(enterFromForSourceType);
        }
        return null;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIII(JoinGroupMessageExtra.RivalExtra rivalExtra) {
        this.LJJJIL = rivalExtra;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LLIIIILZ(long j) {
        return (Map) ((LinkedHashMap) this.LJJLIIIJJI).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIIL(String str) {
        this.LJJIJIL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIJLIL(int i) {
        this.LJJL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIL(boolean z) {
        this.LJJLIIIJLJLI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIILZL(EnumC955660aya enumC955660aya) {
        EnumC955660aya enumC955660aya2 = EnumC955660aya.IDLE;
        this.LJIIJJI = enumC955660aya2;
        this.LJIIJ = enumC955660aya;
        if (this.LJIIIZ != enumC955660aya2) {
            return;
        }
        this.LJIIIZ = enumC955660aya;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLIIZ(EnumC944980ahM enumC944980ahM) {
        EnumC944980ahM enumC944980ahMLLIIJI = LLIIJI();
        if (enumC944980ahM.ordinal() - enumC944980ahMLLIIJI.ordinal() > 1) {
            EnumC944980ahM enumC944980ahM2 = EnumC944980ahM.CONNECTION_START;
            if (enumC944980ahMLLIIJI.compareTo(enumC944980ahM2) < 0 && enumC944980ahM == EnumC944980ahM.CONNECTION_SUCCEED) {
                C20441214yg.LIZIZ("MultiHostDataHolderAnchorImpl", "updateLinkCrossState CONNECTION_START");
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
                if (dataChannel != null) {
                    dataChannel.zW(LinkerStateChannel.class, enumC944980ahM2);
                }
            } else {
                EnumC944980ahM enumC944980ahM3 = EnumC944980ahM.CONNECTION_FINISH;
                if (enumC944980ahMLLIIJI.compareTo(enumC944980ahM3) < 0 && enumC944980ahM.equals(EnumC944980ahM.CONNECTION_FINISH_SUCCEED)) {
                    C20441214yg.LIZIZ("MultiHostDataHolderAnchorImpl", "updateLinkCrossState CONNECTION_FINISH");
                    LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLLI;
                    DataChannel dataChannel2 = C464550IJp.LIZIZ().LIZIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(LinkerStateChannel.class, enumC944980ahM3);
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLinkCrossState targetState=");
        sbLIZ.append(enumC944980ahM);
        sbLIZ.append(", state=");
        sbLIZ.append(enumC944980ahMLLIIJI);
        C20441214yg.LIZIZ("MultiHostDataHolderAnchorImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC944980ahM.compareTo(enumC944980ahMLLIIJI) > 0) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = LinkCrossRoomDataHolder.LJLLI;
            DataChannel dataChannel3 = C464550IJp.LIZIZ().LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.zW(LinkerStateChannel.class, enumC944980ahM);
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILII(int i) {
        this.LJJJLZIJ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILLIZIL(int i) {
        this.LJJLI = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZIL(String str) {
        this.LJJJJIZL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZLL(boolean z) {
        this.LJJJJLI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        this.LJJIL = giftGalleryBadgeInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJI(boolean z) {
        this.LJJIIJ = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJIJIL(String str) {
        this.LJIIZILJ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJILJILJ(String str) {
        this.LJJIFFI = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJILLL(String str) {
        this.LJJ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJI(C955540ayO c955540ayO) {
        this.LJIILIIL = c955540ayO;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJI(List<Integer> list) {
        this.LJJLJLI = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJIIJIL(long j) {
        this.LJJIJLIJ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJJ(List<Long> list) {
        this.LJJJJL = list;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJJJ(long j) {
        String str = (String) ((LinkedHashMap) this.LJJII).get(Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return this.LJJ;
        }
        return str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLIL(long j) {
        this.LJJJ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLLL(boolean z) {
        this.LJJJJZI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJZIJLIL(String str) {
        this.LJJLIIIJLLLLLLLZ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLLFF(EnumC955660aya enumC955660aya) {
        this.LJIIL = enumC955660aya;
    }

    @Override // X.AbstractC497830Jfh
    public final void LLLIIIIL(String str) {
        super.LLLIIIIL(str);
        EnumC955660aya enumC955660aya = EnumC955660aya.IDLE;
        this.LJIIIZ = enumC955660aya;
        this.LJIIJ = enumC955660aya;
        this.LJIIL = enumC955660aya;
        this.LJIILIIL = C955540ayO.LIZIZ;
        this.LJIILJJIL = false;
        this.LJIILLIIL = 0;
        this.LJJJLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJIII = false;
        this.LJJIJIIJIL = 0;
        this.LJJIJIL = "";
        this.LJJIZ = 0L;
        this.LJJJ = 0L;
        this.LJJJJ = 0L;
        this.LJJJJI = 0;
        this.LJJJJIZL = "";
        this.LJJJJLI = false;
        this.LJJLIIIJ = false;
        this.LJJLIIIJILLIZJL = RivalsListsData.TopHostInfo.LIZ;
        ((LinkedHashMap) this.LJJLIIIJJI).clear();
        ((LinkedHashMap) this.LJJII).clear();
        this.LJJI = null;
        this.LJJLIIIJJIZ = false;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = false;
        this.LJJZZI = new LinkedHashMap();
        this.LJJLJ = false;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJLJLI = c13bv;
        this.LJJLL = c13bv;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(LinkerStateChannel.class, EnumC944980ahM.DISABLED);
        }
        ((LinkedHashMap) this.LJLIIIL).clear();
    }

    @Override // X.InterfaceC955420ayC
    public final void setLogId(String str) {
        this.LJJIIZI = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void setTrackParams(Map<String, String> map) {
        this.LJJLIL = map;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIL(long j, Map<String, String> map) {
        this.LJJLIIIJJI.put(Long.valueOf(j), map);
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLJ(int i, String str) {
        this.LJLIIIL.put(Integer.valueOf(i), str);
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJL(EnumC955660aya enumC955660aya, boolean z) {
        if (this.LJIIL != EnumC955660aya.IDLE && !z) {
            return;
        }
        this.LJIIL = enumC955660aya;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLL(long j, String str) {
        this.LJJJJJL.put(Long.valueOf(j), str);
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZ(long j, String str) {
        this.LJJII.put(Long.valueOf(j), str);
    }
}
