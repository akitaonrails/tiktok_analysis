package X;

import android.content.Context;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20382814pG {
    public long LIZ;
    public long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final String LJFF;
    public final String LJI;
    public Playbook LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final Map<String, String> LJIILIIL;
    public Function1<? super Context, ? extends View> LJIILJJIL;
    public final Function1<Context, View> LJIILL;
    public final Function1<Long, Unit> LJIILLIIL;
    public final Function1<Long, Unit> LJIIZILJ;
    public final Function1<Long, Unit> LJIJ;
    public final Function1<Playbook, Unit> LJIJI;
    public final Function1<Long, Unit> LJIJJ;
    public final Function1<Long, Unit> LJIJJLI;
    public final Function2<Context, String, View> LJIL;
    public final List<C20386614ps> LJJ;
    public final Function1<String, Unit> LJJI;
    public final Function2<String, Integer, Unit> LJJIFFI;
    public final Function1<String, Unit> LJJII;
    public final Function1<Long, Boolean> LJJIII;
    public final String LJJIIJ;
    public final String LJJIIJZLJL;
    public Function0<Boolean> LJJIIZ;
    public final boolean LJJIIZI;
    public boolean LJJIJ;

    public final String toString() {
        return "OpenDetailParams(playbookId=" + this.LIZ + ", playContentId=" + this.LIZIZ + ", autoFavorite=" + this.LIZJ + ", allowEdit=" + this.LIZLLL + ", clickOutsideShowPolyDialog=" + this.LJ + ", showFrom=" + this.LJFF + ", fromForLiveTakeAppLog=" + this.LJI + ", playbook=" + this.LJII + ", isFavoriteWithDetailPlaybookEnable=" + this.LJIIIIZZ + ", isShowStartSuccessToast=" + this.LJIIIZ + ", autoScrollStep=" + this.LJIIJ + ", needToAddPanelPage=" + this.LJIIJJI + ", panelEntrance=" + this.LJIIL + ", functionNameToParamsMap=" + this.LJIILIIL + ", fetchPlaybookDetailCustomFooterView=" + this.LJIILJJIL + ", fetchPlaybookDetailCustomHeaderView=" + this.LJIILL + ", onPlaybookDetailDialogShow=" + this.LJIILLIIL + ", onPlaybookDetailDialogDataShowSuccess=" + this.LJIIZILJ + ", onPlaybookDetailDialogDismiss=" + this.LJIJ + ", onPlaybookUpdate=" + this.LJIJI + ", onClickStartPlaybook=" + this.LJIJJ + ", onStartSuccess=" + this.LJIJJLI + ", onBizDataReady=" + this.LJIL + ", playbookDetailFooterButtonParams=" + this.LJJ + ", onPlaybookEntityPagePrepareShow=" + this.LJJI + ", onPlaybookEntityPageShow=" + this.LJJIFFI + ", onPlaybookEntityPageDismiss=" + this.LJJII + ", playbookDetailDismissByUserHandler=" + this.LJJIII + ", detailType=" + this.LJJIIJ + ", businessType=" + this.LJJIIJZLJL + ", outerIsEditClickable=" + this.LJJIIZ + ", forceShowViewMoreButtonWhenNotInLiveRoom=" + this.LJJIIZI + ", isFromLiveCenter=" + this.LJJIJ + ')';
    }

    public C20382814pG(long j, long j2, boolean z, boolean z2, boolean z3, String str, String str2, Playbook playbook, boolean z4, int i, String str3, Map map, AwS221S0300000_12 awS221S0300000_12, AwS55S1000000_4 awS55S1000000_4, Function1 function1, Function1 function12, Function1 function13, AwS591S0100000_12 awS591S0100000_12, Function1 function14, Function1 function15, List list, Function1 function16, Function2 function2, Function1 function17, Function1 function18, String str4, String str5, boolean z5, int i2) {
        boolean z6;
        boolean z7;
        String str6 = str2;
        String str7 = str;
        boolean z8 = z3;
        boolean z9 = z;
        boolean z10 = z2;
        boolean z11 = z5;
        String str8 = str4;
        Function1 function19 = function18;
        Function1 function110 = function17;
        Function2 function22 = function2;
        Function1 function111 = function16;
        List list2 = list;
        Function1 function112 = function15;
        Function1 function113 = function14;
        Function1 function114 = function13;
        Map map2 = map;
        Function1 function115 = function12;
        AwS55S1000000_4 awS55S1000000_42 = awS55S1000000_4;
        String str9 = str3;
        AwS221S0300000_12 awS221S0300000_122 = awS221S0300000_12;
        AwS591S0100000_12 awS591S0100000_122 = awS591S0100000_12;
        int i3 = i;
        Function1 function116 = function1;
        boolean z12 = z4;
        Playbook playbook2 = playbook;
        long j3 = (i2 & 1) != 0 ? 0L : j;
        long j4 = (i2 & 2) == 0 ? j2 : 0L;
        z9 = (i2 & 4) != 0 ? false : z9;
        z10 = (i2 & 8) != 0 ? false : z10;
        z8 = (i2 & 16) != 0 ? false : z8;
        str7 = (i2 & 32) != 0 ? "normal" : str7;
        str6 = (i2 & 64) != 0 ? "fun_kit" : str6;
        playbook2 = (i2 & 128) != 0 ? null : playbook2;
        if ((i2 & 256) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        z12 = (i2 & 512) != 0 ? true : z12;
        i3 = (i2 & 1024) != 0 ? 0 : i3;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        str9 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str9;
        map2 = (i2 & 8192) != 0 ? null : map2;
        awS221S0300000_122 = (i2 & 16384) != 0 ? null : awS221S0300000_122;
        awS55S1000000_42 = (32768 & i2) != 0 ? null : awS55S1000000_42;
        function116 = (65536 & i2) != 0 ? null : function116;
        function115 = (131072 & i2) != 0 ? null : function115;
        function114 = (262144 & i2) != 0 ? null : function114;
        awS591S0100000_122 = (524288 & i2) != 0 ? null : awS591S0100000_122;
        function113 = (1048576 & i2) != 0 ? null : function113;
        function112 = (2097152 & i2) != 0 ? null : function112;
        list2 = (8388608 & i2) != 0 ? null : list2;
        function111 = (16777216 & i2) != 0 ? null : function111;
        function22 = (33554432 & i2) != 0 ? null : function22;
        function110 = (67108864 & i2) != 0 ? null : function110;
        function19 = (134217728 & i2) != 0 ? null : function19;
        str8 = (268435456 & i2) != 0 ? "playbook_detail" : str8;
        String str10 = (536870912 & i2) == 0 ? str5 : "";
        z11 = (i2 & Integer.MIN_VALUE) != 0 ? false : z11;
        this.LIZ = j3;
        this.LIZIZ = j4;
        this.LIZJ = z9;
        this.LIZLLL = z10;
        this.LJ = z8;
        this.LJFF = str7;
        this.LJI = str6;
        this.LJII = playbook2;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = z12;
        this.LJIIJ = i3;
        this.LJIIJJI = z7;
        this.LJIIL = str9;
        this.LJIILIIL = map2;
        this.LJIILJJIL = awS221S0300000_122;
        this.LJIILL = awS55S1000000_42;
        this.LJIILLIIL = function116;
        this.LJIIZILJ = function115;
        this.LJIJ = function114;
        this.LJIJI = awS591S0100000_122;
        this.LJIJJ = function113;
        this.LJIJJLI = function112;
        this.LJIL = null;
        this.LJJ = list2;
        this.LJJI = function111;
        this.LJJIFFI = function22;
        this.LJJII = function110;
        this.LJJIII = function19;
        this.LJJIIJ = str8;
        this.LJJIIJZLJL = str10;
        this.LJJIIZ = null;
        this.LJJIIZI = z11;
        this.LJJIJ = false;
    }
}
