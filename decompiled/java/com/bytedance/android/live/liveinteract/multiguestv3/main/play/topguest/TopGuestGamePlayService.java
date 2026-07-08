package com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest;

import X.AbstractC354801Zi;
import X.C01KE;
import X.C01ZR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C354301Zd;
import X.InterfaceC948500an2;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor.TopGuestGamePlayAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "TOP_GUEST")
public final class TopGuestGamePlayService<VM extends BaseTopGuestGamePlayViewModel> implements C01ZR {
    public static final /* synthetic */ int LIZIZ = 0;
    public final VM LIZ;

    @Override // X.C01ZR
    public final boolean LIZLLL() {
        TopGuestMetaContent topGuestMetaContent = this.LIZ.vQ2().LJIIIIZZ;
        return topGuestMetaContent != null && topGuestMetaContent.topGuestStatus == 1;
    }

    @Override // X.C01ZR
    public final void LJ() {
        VM vm = this.LIZ;
        String strWQ2 = vm.wQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClear, source: ");
        sbLIZ.append("sei");
        C20441214yg.LIZIZ(strWQ2, C2188811AlT.LIZIZ(sbLIZ));
        vm.vQ2().LJII();
    }

    @Override // X.C01ZR
    public final long getPlayId() {
        TopGuestMetaContent topGuestMetaContent = this.LIZ.vQ2().LJIIIIZZ;
        if (topGuestMetaContent != null) {
            return topGuestMetaContent.playId;
        }
        return 0L;
    }

    public TopGuestGamePlayService(VM vm) {
        this.LIZ = vm;
    }

    @Override // X.C01ZR
    public final int LIZ(long j) {
        Integer num = this.LIZ.vQ2().LJIIJ.get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.C01ZR
    public final long LIZIZ(long j) {
        Long l = this.LIZ.vQ2().LJIIIZ.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.C01ZR
    public final void LIZJ(final String str) {
        TopGuestGamePlayAnchorViewModel topGuestGamePlayAnchorViewModel;
        VM vm = this.LIZ;
        if ((vm instanceof TopGuestGamePlayAnchorViewModel) && (topGuestGamePlayAnchorViewModel = (TopGuestGamePlayAnchorViewModel) vm) != null) {
            new AbstractC354801Zi(str) { // from class: X.01Zf
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C354501Zf) && Intrinsics.LJFF(this.LIZ, ((C354501Zf) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OpenTopGuestGamePlayPanel(source=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                }
            };
            C01KE.LIZIZ(ViewModelKt.getViewModelScope(topGuestGamePlayAnchorViewModel), new C354301Zd(topGuestGamePlayAnchorViewModel, null));
        }
    }
}
