package com.bytedance.android.live.liveinteract.gamelink.model;

import X.C01GW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C924810aAp;
import X.EnumC918970a1P;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_DATA_HOLDER")
public final class GameLinkDataHolder extends MultiGuestDataHolder {
    public static final C01GW<GameLinkDataHolder> LJLI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(33));
    public boolean LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public BeInvitedDialogUICtrlCmd LJJLIIJ;
    public boolean LJJLIL;
    public String LJJLJ;
    public boolean LJJLL;
    public boolean LJJZ;
    public String LJL;
    public final HashSet<String> LJJLJLI = new HashSet<>();
    public final C01GW LJJZZI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(34));
    public final HashSet<Long> LJJZZIII = new HashSet<>();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder
    public final void LJIIZILJ(boolean z) {
        super.LJIIZILJ(z);
        C20441214yg.LIZIZ("GameLinkDataHolder", "onLinkMicDisconnect");
        this.LJIIIZ = true;
        ((Map) this.LJJZZI.getValue()).clear();
        this.LJJJI = 0;
        LJJIIJ(null);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder
    public final void LJIL(String str) {
        super.LJIL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("GameLinkDataHolder", C2188811AlT.LIZIZ(sbLIZ));
        LJJIII(0);
        this.LJJLIL = false;
        this.LJJJLIIL = 0;
        this.LJJJLL = -1;
        LJJIFFI(EnumC918970a1P.NORMAL);
        this.LJJJZ = 0L;
        this.LJJL = 0L;
        this.LJJLI = null;
        C924810aAp.LJ().LJJIIZ = 2;
        LJJIIJ(null);
        HashSet<Long> hashSet = this.LJJZZIII;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.LJL = null;
        LJJ(null);
        this.LJJLL = false;
        this.LJJLIIIJLJLI = false;
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJIIIZ = true;
        ((Map) this.LJJZZI.getValue()).clear();
        this.LJJLJLI.clear();
        this.LJJJI = 0;
        this.LJJZ = false;
    }
}
