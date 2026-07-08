package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.AbstractC1145640fv0;
import X.C1144890ftn;
import X.C1144910ftp;
import X.C1144920ftq;
import X.C1145600fuw;
import X.C1145680fv4;
import X.C1145690fv5;
import X.C1145700fv6;
import X.C1145710fv7;
import X.C1145740fvA;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C915980Zwa;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchBottomNoticeViewModel extends AssemViewModel<C1145740fvA> {
    public static final List<C13IQ<? extends AbstractC1145640fv0>> LLILLJJLI = C1697810uHb.LJIIJJI(C13LE.LIZ(C1144910ftp.class), C13LE.LIZ(C1144920ftq.class), C13LE.LIZ(C1145680fv4.class), C13LE.LIZ(C1144890ftn.class), C13LE.LIZ(C1145700fv6.class), C13LE.LIZ(C1145710fv7.class), C13LE.LIZ(C1145690fv5.class));
    public AbstractC1145640fv0 LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0fvA
        };
    }

    public final boolean vQ2(C1145600fuw c1145600fuw) {
        AbstractC1145640fv0 abstractC1145640fv0 = this.LL;
        if (!C915980Zwa.LJFF().GU() || abstractC1145640fv0 == null) {
            return true;
        }
        AbstractC1145640fv0 abstractC1145640fv02 = c1145600fuw.LIZ;
        if (Intrinsics.LJFF(abstractC1145640fv02, abstractC1145640fv0) && Intrinsics.LJFF(abstractC1145640fv02, C1145690fv5.LIZ)) {
            return true;
        }
        List<C13IQ<? extends AbstractC1145640fv0>> list = LLILLJJLI;
        int iIndexOf = list.indexOf(C13LE.LIZ(abstractC1145640fv0.getClass()));
        int iIndexOf2 = list.indexOf(C13LE.LIZ(abstractC1145640fv02.getClass()));
        if (iIndexOf2 != -1 && (iIndexOf == -1 || iIndexOf2 < iIndexOf)) {
            return true;
        }
        return false;
    }
}
