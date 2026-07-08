package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.anchor;

import X.C01E9;
import X.C01EG;
import X.C1954807lC;
import X.C299601Ec;
import X.C320501Md;
import X.InterfaceC421301kR;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownAnchorViewModel extends BaseCountdownViewModel {
    public final HashSet<String> LLIZLLLIL = new HashSet<>();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final String getTag() {
        return "CountdownAnchorViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void AQ2(C299601Ec c299601Ec) {
        long jLongValue;
        boolean z;
        boolean z2;
        long j;
        String str;
        C01E9 c01e9LJIIJJI;
        Long lWQ2 = BaseCountdownViewModel.wQ2(c299601Ec.LIZJ);
        long jLongValue2 = 0;
        if (lWQ2 != null) {
            jLongValue = lWQ2.longValue();
        } else {
            jLongValue = 0;
        }
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        boolean z3 = true;
        boolean zLJIJJ = false;
        if (linkerMediaChangeOperator != null) {
            z = true;
        } else {
            z = false;
        }
        if (jLongValue > 0 && linkerMediaChangeOperator == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            if (linkerMediaChangeOperator == null || linkerMediaChangeOperator.operatorType != 1 || z2) {
                z3 = false;
            }
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ != null && (c01e9LJIIJJI = interfaceC421301kRLIZIZ.LJIIJJI(c299601Ec.LIZJ)) != null) {
                j = c01e9LJIIJJI.LJ;
            } else {
                j = 0;
            }
            Long l = this.LLILLJJLI.LIZJ.get(c299601Ec.LIZJ);
            if (l != null) {
                jLongValue2 = l.longValue();
            }
            long j2 = c299601Ec.LJ;
            long j3 = j2 - jLongValue2;
            Boolean boolValueOf = Boolean.valueOf(this.LLILLL.contains(c299601Ec.LIZJ));
            boolean z4 = c299601Ec.LJIIIZ.autoExpand;
            long j4 = c299601Ec.LJII;
            if (z2) {
                str = "other";
            } else if (z3) {
                str = "moderator_end";
            } else {
                str = "anchor_end";
            }
            long j5 = c299601Ec.LIZ;
            String str2 = c299601Ec.LIZJ;
            InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ2 != null) {
                zLJIJJ = interfaceC421301kRLIZIZ2.LJIJJ(c299601Ec.LIZJ);
            }
            C320501Md.LIZIZ(j2, j3, boolValueOf, z4, j4, str, j, j5, str2, zLJIJJ, this.LLIZLLLIL.contains(c299601Ec.LIZJ));
        }
        this.LLIZLLLIL.remove(c299601Ec.LIZJ);
        super.AQ2(c299601Ec);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void BQ2(C299601Ec c299601Ec) {
        String str;
        Object obj;
        super.BQ2(c299601Ec);
        HashSet<String> hashSet = this.LLIZLLLIL;
        LinkerMediaChangeOperator linkerMediaChangeOperator = c299601Ec.LJIIJ;
        if (linkerMediaChangeOperator != null && linkerMediaChangeOperator.operatorType == 1) {
            hashSet.add(c299601Ec.LIZJ);
        } else {
            hashSet.remove(c299601Ec.LIZJ);
        }
        long j = c299601Ec.LJ;
        Boolean boolValueOf = Boolean.valueOf(this.LLILLL.contains(c299601Ec.LIZJ));
        boolean z = c299601Ec.LJIIIZ.autoExpand;
        long j2 = c299601Ec.LJII;
        long j3 = c299601Ec.LIZ;
        String str2 = c299601Ec.LIZJ;
        boolean zContains = this.LLIZLLLIL.contains(str2);
        Map mapLIZ = C320501Md.LIZ();
        HashMap map = (HashMap) mapLIZ;
        map.put("link_id", str2);
        map.put("guest_id", String.valueOf(j3));
        map.put("duration", String.valueOf(j));
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!zContains) {
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                str = "1";
            } else if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                if (boolValueOf != null) {
                    throw new C1954807lC();
                }
                str = "";
            }
        } else {
            str = "";
        }
        map.put("is_customed_dur", str);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_expand_guest", obj);
        map.put("countdown_target", String.valueOf(j2));
        if (zContains) {
            str3 = "1";
        }
        map.put("is_multi_guest_moderator", str3);
        C320501Md.LJ("livesdk_anchor_guest_countdown_start", mapLIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void vQ2(String str) {
        this.LLIZLLLIL.clear();
        super.vQ2("on onDestroy");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void zQ2(C299601Ec c299601Ec) {
        CQ2(c299601Ec, "timeout");
        super.zQ2(c299601Ec);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void CQ2(C299601Ec c299601Ec, String str) {
        long j;
        boolean zLJIJJ;
        C01E9 c01e9LJIIJJI;
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        long jLongValue = 0;
        if (interfaceC421301kRLIZIZ != null && (c01e9LJIIJJI = interfaceC421301kRLIZIZ.LJIIJJI(c299601Ec.LIZJ)) != null) {
            j = c01e9LJIIJJI.LJ;
        } else {
            j = 0;
        }
        Long l = this.LLILLJJLI.LIZJ.get(c299601Ec.LIZJ);
        if (l != null) {
            jLongValue = l.longValue();
        }
        long j2 = c299601Ec.LJ;
        long j3 = j2 - jLongValue;
        Boolean boolValueOf = Boolean.valueOf(this.LLILLL.contains(c299601Ec.LIZJ));
        boolean z = c299601Ec.LJIIIZ.autoExpand;
        long j4 = c299601Ec.LJII;
        long j5 = c299601Ec.LIZ;
        String str2 = c299601Ec.LIZJ;
        InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ2 != null) {
            zLJIJJ = interfaceC421301kRLIZIZ2.LJIJJ(c299601Ec.LIZJ);
        } else {
            zLJIJJ = false;
        }
        C320501Md.LIZIZ(j2, j3, boolValueOf, z, j4, str, j, j5, str2, zLJIJJ, this.LLIZLLLIL.contains(c299601Ec.LIZJ));
    }
}
