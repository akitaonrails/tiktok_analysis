package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC982270bfV implements InterfaceC977410bXf {
    public final boolean LL;
    public final DataChannel LLILLJJLI;
    public final Function0<EnumC974260bSa> LLILLL;
    public final List<C954460awe> LLILZ;
    public C981480beE LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC977410bXf
    public final void LJIIIZ(C982460bfo c982460bfo) {
    }

    public abstract String LJIIL();

    public boolean LJIJ() {
        return false;
    }

    public void LJIJI(List<C954460awe> list) {
    }

    public void LJIIJ() {
        LJIILIIL("commonReset");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZIL = null;
        this.LLIZ = false;
    }

    public void LJIIZILJ() {
        LJIILIIL("onTakeTheStageStart");
    }

    public final void LJIJJ() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        StringBuilder sb = new StringBuilder("prepareViewOnce curStatus:");
        sb.append(this.LLILLL.invoke());
        sb.append(", initialLinkedMicUserList:");
        List<C954460awe> list = this.LLILZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C954460awe> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        sb.append(arrayList);
        LJIILIIL(sb.toString());
        LJIJI(this.LLILZ);
    }

    @Override // X.InterfaceC977430bXh
    public void onUnload() {
        LJIILIIL("onUnload");
        LJIIJ();
        this.LLILZLL = false;
    }

    @Override // X.InterfaceC977410bXf
    public void LIZ(AbstractC982800bgM abstractC982800bgM) {
        EnumC974260bSa enumC974260bSaInvoke = this.LLILLL.invoke();
        if (abstractC982800bgM instanceof C982670bg9) {
            if (enumC974260bSaInvoke.compareTo(EnumC974260bSa.START) >= 0 && enumC974260bSaInvoke.compareTo(EnumC974260bSa.FINISH) < 0) {
                if (!LJIJ()) {
                    LJIIJJI("by_CompetitionSettlementStartMessage", true);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceiveMessage discard CompetitionSettlementStartMessage when in ");
                sbLIZ.append(enumC974260bSaInvoke);
                sbLIZ.append(" state");
                LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC977430bXh
    public void LIZLLL(MatchBaseWidget matchBaseWidget) {
        LJIILIIL("onLoad");
    }

    public final void LJIILIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("take_the_stage_bar_");
        sbLIZ.append(LJIIL());
        C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public final void LJIILJJIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("take_the_stage_bar_");
        sbLIZ.append(LJIIL());
        C20441214yg.LJ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public void LJIILL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinalCallStart anim:");
        sbLIZ.append(z);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        if (r5 == r0) goto L51;
     */
    @Override // X.InterfaceC977410bXf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJ(X.EnumC974260bSa r8, X.C981480beE r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC982270bfV.LJ(X.0bSa, X.0beE):void");
    }

    public final void LJIIJJI(String str, boolean z) {
        if (!this.LLIZ) {
            this.LLIZ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doFinalCallStartOnce source:");
            sbLIZ.append(str);
            sbLIZ.append(" anim:");
            sbLIZ.append(z);
            LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
            LJIJJ();
            LJIILL(z);
        }
    }

    public void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSettleResult resultType:");
        sbLIZ.append(enumC982500bfs);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC982270bfV(boolean z, DataChannel dataChannel, Function0<? extends EnumC974260bSa> function0, List<C954460awe> list) {
        this.LL = z;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = function0;
        this.LLILZ = list;
    }
}
