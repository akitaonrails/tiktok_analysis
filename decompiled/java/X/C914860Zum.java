package X;

import android.graphics.Rect;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.CohostUserInfo;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0Zum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914860Zum implements InterfaceC952240at4 {
    public static final C914860Zum LIZ = new C914860Zum();

    @Override // X.InterfaceC952240at4
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC975810bV5 LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC952240at4
    public final boolean LJ(InterfaceC915230ZvN interfaceC915230ZvN) {
        return true;
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC975870bVB LJFF() {
        return null;
    }

    @Override // X.InterfaceC952240at4
    public final void LJII() {
    }

    @Override // X.InterfaceC952240at4
    public final void LJIIIIZZ(String str) {
    }

    @Override // X.InterfaceC952240at4
    public final boolean LJIIL(InterfaceC915230ZvN interfaceC915230ZvN) {
        return true;
    }

    @Override // X.InterfaceC952240at4
    public final void setIsAnchor(boolean z) {
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC978510bZR LJI() {
        return new InterfaceC978510bZR() { // from class: X.00io
            public final MutableLiveData LIZ = new MutableLiveData(null);
            public final MutableLiveData LIZIZ = new MutableLiveData(0);
            public Text LIZJ;

            @Override // X.InterfaceC978510bZR
            public final long LIZIZ() {
                return 0L;
            }

            @Override // X.InterfaceC978510bZR
            public final void LIZJ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12) {
            }

            @Override // X.InterfaceC978510bZR
            public final List<GiftMode> LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC978510bZR
            public final void LJ(long j) {
            }

            @Override // X.InterfaceC978510bZR
            public final void LJII(GiftMode giftMode) {
            }

            @Override // X.InterfaceC978510bZR
            public final void LJIIIZ(long j) {
            }

            @Override // X.InterfaceC978510bZR
            public final void LJIIJ(List<GiftMode> list) {
            }

            @Override // X.InterfaceC978510bZR
            public final void LJIIJJI(int i) {
            }

            @Override // X.InterfaceC978510bZR
            public final Text LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC978510bZR
            public final LiveData<GiftMode> LJI() {
                return this.LIZ;
            }

            @Override // X.InterfaceC978510bZR
            public final LiveData<Integer> LJIIIIZZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC978510bZR
            public final void LJFF(Text text) {
                this.LIZJ = text;
            }
        };
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC955420ayC LIZ() {
        return new InterfaceC955420ayC() { // from class: X.0aqP
            @Override // X.InterfaceC955780aym
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final ActivePlaybook LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LIZJ() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LIZLLL(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJFF(C951420ark c951420ark) {
            }

            @Override // X.InterfaceC955420ayC
            public final String LJI(long j) {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LJIIIIZZ(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJIIJ(C943870afZ c943870afZ) {
            }

            @Override // X.InterfaceC955780aym
            public final C497860Jfk LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJIIL() {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final int LJIILL() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJIJ(List<Long> list) {
            }

            @Override // X.InterfaceC955780aym
            public final String LJIJJ() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LJIL(List<Integer> list) {
            }

            @Override // X.InterfaceC955420ayC
            public final TagV2 LJJ() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final long LJJI() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final Room LJJIFFI() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final RivalExtraInfo LJJIII() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJIIJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC955420ayC
            public final int LJJIIJZLJL() {
                return 0;
            }

            @Override // X.InterfaceC955780aym
            public final void LJJIIZ(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJIIZI(boolean z) {
            }

            @Override // X.InterfaceC955780aym
            public final String LJJIJIIJI() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final int LJJIJIL() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final long LJJIJL() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJJIJLIJ() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJIL(long j, Map<String, String> map) {
            }

            @Override // X.InterfaceC955420ayC
            public final long LJJJ() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJJJI() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJJJJI() {
                return false;
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJJJ(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final int LJJJJJL() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJJL(Integer num) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJJLI(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJJLL() {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJJZ(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJLIIL(String str) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJLL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJLZIJ() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJJZ() {
            }

            @Override // X.InterfaceC955780aym
            public final String LJJL() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLI(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final long LJJLIIIIJ() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final String LJJLIIIJ() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLIIIJILLIZJL(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLIIIJJI(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJJLIIIJJIZ() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLIIIJL(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final int LJJLIIIJLJLI() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLIIIJLLLLLLLZ(RivalExtraInfo rivalExtraInfo) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLIIJ() {
            }

            @Override // X.InterfaceC955420ayC
            public final int LJJLIL() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLJ(int i, String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJLJLI(Room room) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJLL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJZ(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJJZZI(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJZZIII() {
            }

            @Override // X.InterfaceC955420ayC
            public final String LJL() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final String LJLI() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final int LJLIIL() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJLIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final RivalExtraInfo LJLJI() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLJJI() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLJJL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLJJLL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLJL(EnumC955660aya enumC955660aya, boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLJLJ(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLLI(RivalsListsData.TopHostInfo topHostInfo) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLLILLLL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLLJ(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLLL(long j, String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final long LJLLLLLL() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final void LJLZ(RivalExtraInfo rivalExtraInfo) {
            }

            @Override // X.InterfaceC955420ayC
            public final String LJZ() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LJZI(ActivePlaybook activePlaybook) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LJZL(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final long LL() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLD(Room room) {
            }

            @Override // X.InterfaceC955420ayC
            public final C951420ark LLFF() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final String LLFFF() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LLFII(TagV2 tagV2) {
            }

            @Override // X.InterfaceC955420ayC
            public final C943870afZ LLIFFJFJJ(Integer num) {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLII() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIIII(JoinGroupMessageExtra.RivalExtra rivalExtra) {
            }

            @Override // X.InterfaceC955420ayC
            public final Map<String, String> LLIIIILZ(long j) {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final Room LLIIIJ() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIIIL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIIIZ() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIIJLIL(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIIL(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final int LLIILII() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIILZL(EnumC955660aya enumC955660aya) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLIIZ(EnumC944980ahM enumC944980ahM) {
                return false;
            }

            @Override // X.InterfaceC955780aym
            public final String LLIL() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LLILII(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLILIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final GiftGalleryBadgeInfo LLILL() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLILLIZIL(int i) {
            }

            @Override // X.InterfaceC955420ayC
            public final long LLILLJJLI() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final String LLILLL() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLILZ(long j, String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLILZIL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLILZLL(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLIZLLLIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJ() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJI(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJIJIL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJILJILJ(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJILLL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final String LLJJ() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJJI(C955540ayO c955540ayO) {
            }

            @Override // X.InterfaceC955420ayC
            public final String LLJJIII() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJJIJI(List<Integer> list) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJJIJIIJIL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJJIJIL() {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJJJ(List<Long> list) {
            }

            @Override // X.InterfaceC955780aym
            public final long LLJJJIL() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final String LLJJJJ(long j) {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLJJJJJIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final String LLJJJJLIIL() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLJJLIIIJLLLLLLLZ() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJLIL(long j) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLJLILLLLZIIL() {
                return false;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJLL() {
            }

            @Override // X.InterfaceC955420ayC
            public final long LLJLLIL() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJLLL(boolean z) {
            }

            @Override // X.InterfaceC955420ayC
            public final void LLJZIJLIL(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final JoinGroupMessageExtra.RivalExtra LLLF() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void LLLFF(EnumC955660aya enumC955660aya) {
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LLLFFI() {
                return false;
            }

            @Override // X.InterfaceC955780aym
            public final void LLLI(boolean z) {
            }

            @Override // X.InterfaceC955780aym
            public final void LLLIIII(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final long getBattleId() {
                return 0L;
            }

            @Override // X.InterfaceC955780aym
            public final long getChannelId() {
                return 0L;
            }

            @Override // X.InterfaceC955420ayC
            public final C943870afZ getEnterFrom() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final String getLogId() {
                return "";
            }

            @Override // X.InterfaceC955420ayC
            public final Integer getTagType() {
                return 0;
            }

            @Override // X.InterfaceC955420ayC
            public final Map<String, String> getTrackInfo() {
                return null;
            }

            @Override // X.InterfaceC955420ayC
            public final void setLogId(String str) {
            }

            @Override // X.InterfaceC955420ayC
            public final void setTrackParams(Map<String, String> map) {
            }

            @Override // X.InterfaceC955420ayC
            public final Map<C955540ayO, Map<Long, Long>> LJIILJJIL() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final Map<String, String> LJIJJLI() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final Map<Long, Map<String, String>> LJJII() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final List<Object> LJJIZ() {
                return new ArrayList();
            }

            @Override // X.InterfaceC955780aym
            public final Map<Long, Long> LLJJL() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final Map<String, String> LLLFZ() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final Map<String, String> getTrackParams() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC955420ayC
            public final boolean LJIJI() {
                return !LLLIIIIL().isEmpty();
            }

            public static final List<Integer> LLLIIIIL() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC955420ayC
            public final C955540ayO LJIILLIIL() {
                return C955540ayO.LIZIZ;
            }

            @Override // X.InterfaceC955420ayC
            public final EnumC955660aya LJIIZILJ() {
                return EnumC955660aya.IDLE;
            }

            @Override // X.InterfaceC955420ayC
            public final EnumC955660aya LJJJIL() {
                return EnumC955660aya.IDLE;
            }

            @Override // X.InterfaceC955420ayC
            public final List<Integer> LJJJJZI() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC955420ayC
            public final List<Long> LJLIIIL() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC955420ayC
            public final List<Long> LJLJLLL() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC955420ayC
            public final EnumC955660aya LLI() {
                return EnumC955660aya.IDLE;
            }

            @Override // X.InterfaceC955420ayC
            public final EnumC944980ahM LLIIJI() {
                return EnumC944980ahM.DISABLED;
            }

            @Override // X.InterfaceC955420ayC
            public final RivalsListsData.TopHostInfo LLL() {
                return RivalsListsData.TopHostInfo.LIZ;
            }

            @Override // X.InterfaceC955420ayC
            public final EnumC955660aya getAnchorType() {
                return EnumC955660aya.IDLE;
            }
        };
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC944340agK LIZJ() {
        return new InterfaceC944340agK() { // from class: X.0Icd
            @Override // X.InterfaceC955780aym
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC955780aym
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC944340agK
            public final void LJII(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final C497860Jfk LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC955780aym
            public final String LJIJJ() {
                return "";
            }

            @Override // X.InterfaceC955780aym
            public final void LJJIIZ(String str) {
            }

            @Override // X.InterfaceC955780aym
            public final String LJJIJIIJI() {
                return "";
            }

            @Override // X.InterfaceC944340agK
            public final C945320ahu LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC944340agK
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC944340agK
            public final void LJJJJIZL(Map<Long, ? extends Map<Long, CohostUserInfo>> map) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJJJ(String str) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJJZ(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJJLL(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final String LJJL() {
                return "";
            }

            @Override // X.InterfaceC955780aym
            public final void LJJLL(String str) {
            }

            @Override // X.InterfaceC955780aym
            public final void LJJZZIII() {
            }

            @Override // X.InterfaceC944340agK
            public final void LJLILLLLZI(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC944340agK
            public final void LJLLLL(long j, EnumC470470Icf enumC470470Icf) {
            }

            @Override // X.InterfaceC944340agK
            public final C945320ahu LLF() {
                return null;
            }

            @Override // X.InterfaceC944340agK
            public final boolean LLFZ() {
                return false;
            }

            @Override // X.InterfaceC955780aym
            public final String LLIL() {
                return "";
            }

            @Override // X.InterfaceC944340agK
            public final void LLJILJIL(long j) {
            }

            @Override // X.InterfaceC955780aym
            public final long LLJJJIL() {
                return 0L;
            }

            @Override // X.InterfaceC955780aym
            public final void LLLI(boolean z) {
            }

            @Override // X.InterfaceC944340agK
            public final void LLLII(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC955780aym
            public final void LLLIIII(long j) {
            }

            @Override // X.InterfaceC944340agK
            public final Boolean Tn(long j) {
                return null;
            }

            @Override // X.InterfaceC955780aym
            public final long getBattleId() {
                return 0L;
            }

            @Override // X.InterfaceC955780aym
            public final long getChannelId() {
                return 0L;
            }

            @Override // X.InterfaceC955780aym
            public final Map<Long, Long> LLJJL() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC944340agK
            public final Map<Long, Boolean> LLJL() {
                return new LinkedHashMap();
            }

            @Override // X.InterfaceC944340agK
            public final long LJJIJ() {
                return C158B.LIZ();
            }

            @Override // X.InterfaceC944340agK
            public final Map<Long, Map<Long, CohostUserInfo>> LLJZ() {
                return C2097608Jq.LJ();
            }
        };
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC955970az5 LJIIIZ() {
        return new InterfaceC955970az5() { // from class: X.0Zul
            @Override // X.InterfaceC955970az5
            public final void LIZIZ(Rect rect) {
            }

            @Override // X.InterfaceC955970az5
            public final void LIZJ(long j, CohostABInfo cohostABInfo) {
            }

            @Override // X.InterfaceC955970az5
            public final Rect LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC955970az5
            public final void LJ() {
            }

            @Override // X.InterfaceC955970az5
            public final void LJFF(Rect rect) {
            }

            @Override // X.InterfaceC955970az5
            public final void LJI(long j) {
            }

            @Override // X.InterfaceC955970az5
            public final CohostABInfo LJII(long j) {
                return null;
            }

            @Override // X.InterfaceC955970az5
            public final Rect LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC955970az5
            public final long LJIIIZ() {
                return 0L;
            }

            @Override // X.InterfaceC955970az5
            public final Set<Long> LIZ() {
                return new LinkedHashSet();
            }
        };
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC955780aym LJIIJ() {
        return C0IYG.LIZ;
    }

    @Override // X.InterfaceC952240at4
    public final InterfaceC955780aym LJIIJJI(boolean z) {
        return C0IYG.LIZ;
    }
}
