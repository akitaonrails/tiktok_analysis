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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0bZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978620bZc extends AbstractC497840Jfi implements InterfaceC955420ayC {
    public static final C978620bZc LIZ = new C978620bZc();
    public static List<Integer> LIZIZ;
    public static List<Integer> LIZJ;

    @Override // X.InterfaceC955420ayC
    public final String LJJLIIIJ() {
        return "";
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJZIJLIL(String str) {
    }

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZIZ = c13bv;
        LIZJ = c13bv;
    }

    @Override // X.InterfaceC955420ayC
    public final ActivePlaybook LIZIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJLJ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LIZJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIIIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJLZIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLJ = true;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIILIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<C955540ayO, Map<Long, Long>> LJIILJJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLIIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJIILL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIILL;
    }

    @Override // X.InterfaceC955420ayC
    public final C955540ayO LJIILLIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJFF;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LJIIZILJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LJIJJLI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLILLLLZI;
    }

    @Override // X.InterfaceC955420ayC
    public final TagV2 LJJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final Room LJJIFFI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<Long, Map<String, String>> LJJII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLIL;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalExtraInfo LJJIII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJIIJZLJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIIZILJ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJIJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJIJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJIJLIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIIJZLJL;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Object> LJJIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LJJJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJJJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLJ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJJJJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJLZIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIIZ = false;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final long LJJLIIIIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJJLIIIJJIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJLIIIJLJLI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIJI;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final int LJJLIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIILLIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJLI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Long> LJLIIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJZZIII;
    }

    @Override // X.InterfaceC955420ayC
    public final int LJLIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJLIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalExtraInfo LJLJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final List<Long> LJLJLLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final long LJLLLLLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final C951420ark LLFF() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLFFF() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIL;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya LLI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final Room LLIIIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIJJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIIZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIIJ = true;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC944980ahM LLIIJI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        EnumC944980ahM enumC944980ahMLIZIZ = C464550IJp.LIZIZ().LIZIZ();
        return enumC944980ahMLIZIZ == null ? EnumC944980ahM.DISABLED : enumC944980ahMLIZIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final int LLIILII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIILJJIL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLILIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final GiftGalleryBadgeInfo LLILL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC955420ayC
    public final long LLILLJJLI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJJI;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLILLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIJLIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLIZLLLIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIII = true;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJLIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJIII() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJLL;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJJJJJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJJJLIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJJLIIIJLLLLLLLZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJIZL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLJLILLLLZIIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIII;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIIJZLJL = true;
        C464550IJp.LIZIZ().LJJIIZ = LIZ();
    }

    @Override // X.InterfaceC955420ayC
    public final long LLJLLIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJ;
    }

    @Override // X.InterfaceC955420ayC
    public final RivalsListsData.TopHostInfo LLL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIFFI;
    }

    @Override // X.InterfaceC955420ayC
    public final JoinGroupMessageExtra.RivalExtra LLLF() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJLIIIJLJLI;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLLFFI() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJI;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LLLFZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLIIL;
    }

    @Override // X.InterfaceC955420ayC
    public final EnumC955660aya getAnchorType() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJJL;
    }

    @Override // X.InterfaceC955420ayC
    public final C943870afZ getEnterFrom() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJIIZI;
    }

    @Override // X.InterfaceC955420ayC
    public final String getLogId() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJZI;
    }

    @Override // X.InterfaceC955420ayC
    public final Integer getTagType() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJZ;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> getTrackInfo() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJJJJJ;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> getTrackParams() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJLJLLL;
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LJIJI() {
        return !LLLIIIIL().isEmpty();
    }

    public static final List<Integer> LLLIIIIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC955420ayC
    public final List<Integer> LJJJJZI() {
        return LIZIZ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LIZLLL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJJI = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJFF(C951420ark c951420ark) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJ = c951420ark;
    }

    @Override // X.InterfaceC955420ayC
    public final String LJI(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return (String) ((LinkedHashMap) C464550IJp.LIZIZ().LJL).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIIIZZ(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJZ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIIJ(C943870afZ c943870afZ) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIIZI = c943870afZ;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIJ(List<Long> list) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJZZIII = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJIL(List<Integer> list) {
        LIZJ = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIIJ(Map<String, String> map) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJJ = map;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIIZI(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLL = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJL(Integer num) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJZ = num;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJJLI(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIILLIIL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJJLIIL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJLIIL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLI(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJJL = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJILLIZJL(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIJI = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJJI(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJ = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJL(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIJ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLIIIJLLLLLLLZ(RivalExtraInfo rivalExtraInfo) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIL = rivalExtraInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLJLI(Room room) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJ = room;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJZ(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLJLI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJZZI(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJLLLLLLLZ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIIJ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJJLL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJJLL = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJLJ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJLIJ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJJI = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLI(RivalsListsData.TopHostInfo topHostInfo) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIFFI = topHostInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLILLLL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJLL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLJ(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIILJJIL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLZ(RivalExtraInfo rivalExtraInfo) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJI = rivalExtraInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJZI(ActivePlaybook activePlaybook) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJLJ = activePlaybook;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJZL(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJLZIJ = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLD(Room room) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIJJLI = room;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLFII(TagV2 tagV2) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJL = tagV2;
    }

    @Override // X.InterfaceC955420ayC
    public final C943870afZ LLIFFJFJJ(Integer num) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        String enterFromForSourceType = (String) ((LinkedHashMap) C464550IJp.LIZIZ().LJLJL).get(num);
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
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJLJLI = rivalExtra;
    }

    @Override // X.InterfaceC955420ayC
    public final Map<String, String> LLIIIILZ(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return (Map) ((LinkedHashMap) C464550IJp.LIZIZ().LJJII).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIIL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIJLIL(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIIZILJ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIIL(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLL = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIILZL(EnumC955660aya enumC955660aya) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        EnumC955660aya enumC955660aya2 = EnumC955660aya.IDLE;
        linkCrossRoomDataHolderLIZIZ.LJJJJLL = enumC955660aya2;
        linkCrossRoomDataHolderLIZIZ.LJJJJL = enumC955660aya;
        if (linkCrossRoomDataHolderLIZIZ.LJJJJJL == enumC955660aya2) {
            linkCrossRoomDataHolderLIZIZ.LJJJJJL = enumC955660aya;
        }
    }

    @Override // X.InterfaceC955420ayC
    public final boolean LLIIZ(EnumC944980ahM enumC944980ahM) {
        DataChannel dataChannel;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        EnumC944980ahM enumC944980ahMLIZIZ = linkCrossRoomDataHolderLIZIZ.LIZIZ();
        if (enumC944980ahMLIZIZ == null) {
            enumC944980ahMLIZIZ = EnumC944980ahM.DISABLED;
        }
        if (enumC944980ahM.ordinal() - enumC944980ahMLIZIZ.ordinal() > 1) {
            EnumC944980ahM enumC944980ahM2 = EnumC944980ahM.CONNECTION_START;
            if (enumC944980ahMLIZIZ.compareTo(enumC944980ahM2) < 0 && enumC944980ahM == EnumC944980ahM.CONNECTION_SUCCEED) {
                DataChannel dataChannel2 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.zW(LinkerStateChannel.class, enumC944980ahM2);
                }
            } else {
                EnumC944980ahM enumC944980ahM3 = EnumC944980ahM.CONNECTION_FINISH;
                if (enumC944980ahMLIZIZ.compareTo(enumC944980ahM3) < 0 && enumC944980ahM.equals(EnumC944980ahM.CONNECTION_FINISH_SUCCEED) && (dataChannel = linkCrossRoomDataHolderLIZIZ.LIZIZ) != null) {
                    dataChannel.zW(LinkerStateChannel.class, enumC944980ahM3);
                }
            }
        }
        if (enumC944980ahM.compareTo(enumC944980ahMLIZIZ) > 0) {
            DataChannel dataChannel3 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
            if (dataChannel3 != null) {
                dataChannel3.zW(LinkerStateChannel.class, enumC944980ahM);
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILII(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIILL = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILLIZIL(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIJ = i;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZIL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZLL(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJILLIZJL = giftGalleryBadgeInfo;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJI(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJI = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJIJIL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIJJ = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJILJILJ(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJIL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJILLL(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIJL = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJI(C955540ayO c955540ayO) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJFF = c955540ayO;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJI(List<Integer> list) {
        LIZIZ = list;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJIJIIJIL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJJJ(List<Long> list) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLI = list;
    }

    @Override // X.InterfaceC955420ayC
    public final String LLJJJJ(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        String str = (String) ((LinkedHashMap) C464550IJp.LIZIZ().LJJIL).get(Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return C464550IJp.LIZIZ().LJJIJL;
        }
        return str;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLIL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJLIIIJJIZ = j;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLJLLL(boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJIZL = z;
    }

    @Override // X.InterfaceC955420ayC
    public final void LLLFF(EnumC955660aya enumC955660aya) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJLI = enumC955660aya;
    }

    @Override // X.InterfaceC955420ayC
    public final void setLogId(String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJJJZI = str;
    }

    @Override // X.InterfaceC955420ayC
    public final void setTrackParams(Map<String, String> map) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJLLL = map;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJIL(long j, Map<String, String> map) {
        Long lValueOf = Long.valueOf(j);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJII.put(lValueOf, map);
    }

    @Override // X.InterfaceC955420ayC
    public final void LJJLJ(int i, String str) {
        Integer numValueOf = Integer.valueOf(i);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJLJL.put(numValueOf, str);
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLJL(EnumC955660aya enumC955660aya, boolean z) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        if (linkCrossRoomDataHolderLIZIZ.LJJJJLI != EnumC955660aya.IDLE && !z) {
            return;
        }
        linkCrossRoomDataHolderLIZIZ.LJJJJLI = enumC955660aya;
    }

    @Override // X.InterfaceC955420ayC
    public final void LJLLL(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJL.put(lValueOf, str);
    }

    @Override // X.InterfaceC955420ayC
    public final void LLILZ(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJJIL.put(lValueOf, str);
    }
}
