package Y;

import X.C00CG;
import X.C09JN;
import X.C13BV;
import X.C1C7U;
import X.C2097608Jq;
import X.C410901il;
import X.C955400ayA;
import X.C960610b6Z;
import X.C960790b6r;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S1101100_15 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse$Cell>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse$Cell>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final void accept$0(AfS1S1101100_15 afS1S1101100_15, Object obj) {
        String str;
        ?? LJ;
        ?? LJ2;
        int i;
        ?? arrayList;
        ?? arrayList2;
        boolean z;
        SearchRivalsResponse.ResponseData responseData;
        SearchRivalsResponse.ResponseData responseData2;
        List<SearchRivalsResponse.Cell> list;
        SearchRivalsResponse.ResponseData responseData3;
        List<SearchRivalsResponse.Cell> list2;
        SearchRivalsResponse.ResponseData responseData4;
        SearchRivalsResponse.ResponseData responseData5;
        Map<Long, RivalExtraInfo> map;
        SearchRivalsResponse.ResponseData responseData6;
        Map<Long, RivalExtraInfo> map2;
        SearchRivalsResponse.ResponseData responseData7;
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.fetchResultListData$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (Intrinsics.LJFF(afS1S1101100_15.s0, ((C960610b6Z) afS1S1101100_15.l1).LLJILLL)) {
            C960610b6Z c960610b6Z = (C960610b6Z) afS1S1101100_15.l1;
            c960610b6Z.LLJJ = C00CG.NONE;
            c960610b6Z.LLJILJILJ = 0;
            c960610b6Z.LLJIJIL = false;
            C13BV c13bv = C13BV.INSTANCE;
            c960610b6Z.LLILLJJLI = c13bv;
            c960610b6Z.LLILLL = c13bv;
            c960610b6Z.LLILZ = -1;
            if (baseResponse != null && (responseData7 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
                str = responseData7.searchId;
            } else {
                str = null;
            }
            c960610b6Z.LLIZLLLIL = str;
            if (baseResponse != null && (responseData6 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (map2 = responseData6.rivalExtraInfos) != null) {
                LJ = new LinkedHashMap();
                for (Map.Entry<Long, RivalExtraInfo> entry : map2.entrySet()) {
                    if (entry.getKey() != null || entry.getValue() != null) {
                        LJ.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            c960610b6Z.LLJ = LJ;
            C960610b6Z c960610b6Z2 = (C960610b6Z) afS1S1101100_15.l1;
            if (baseResponse != null && (responseData5 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (map = responseData5.rivalUserToExtraInfos) != null) {
                LJ2 = new LinkedHashMap();
                for (Map.Entry<Long, RivalExtraInfo> entry2 : map.entrySet()) {
                    if (entry2.getKey() != null || entry2.getValue() != null) {
                        LJ2.put(entry2.getKey(), entry2.getValue());
                    }
                }
            } else {
                LJ2 = C2097608Jq.LJ();
            }
            c960610b6Z2.LLJI = LJ2;
            C960610b6Z c960610b6Z3 = (C960610b6Z) afS1S1101100_15.l1;
            if (baseResponse != null && (responseData4 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
                i = responseData4.nextOffset;
            } else {
                i = 0;
            }
            c960610b6Z3.LLJILJIL = i;
            if (baseResponse != null && (responseData3 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list2 = responseData3.cellList) != null) {
                arrayList = new ArrayList();
                for (SearchRivalsResponse.Cell cell : list2) {
                    if (cell.cellType != 3) {
                        arrayList.add(cell);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c960610b6Z3.LLILLJJLI = arrayList;
            C960610b6Z c960610b6Z4 = (C960610b6Z) afS1S1101100_15.l1;
            if (baseResponse != null && (responseData2 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list = responseData2.cellList) != null) {
                arrayList2 = new ArrayList();
                for (SearchRivalsResponse.Cell cell2 : list) {
                    if (cell2.cellType == 3) {
                        arrayList2.add(cell2);
                    }
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            c960610b6Z4.LLILLL = arrayList2;
            C960610b6Z c960610b6Z5 = (C960610b6Z) afS1S1101100_15.l1;
            if (baseResponse != null && (responseData = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
                z = responseData.hasMore;
            } else {
                z = false;
            }
            int i2 = afS1S1101100_15.i2;
            c960610b6Z5.getClass();
            c960610b6Z5.LLILZIL = new C410901il();
            if (!c960610b6Z5.LLILLJJLI.isEmpty()) {
                c960610b6Z5.LJJIIJ(0, i2);
            }
            if (!c960610b6Z5.LLILLL.isEmpty()) {
                c960610b6Z5.LJJII();
                c960610b6Z5.LJJIIJ(1, i2);
            }
            if (z && c960610b6Z5.LJJIIJZLJL()) {
                c960610b6Z5.LLILZIL.add(new C960790b6r());
                c960610b6Z5.LLILZ = c960610b6Z5.LLILZIL.size() - 1;
            }
            c960610b6Z5.LLILZIL = c960610b6Z5.LLILZIL;
            C960610b6Z c960610b6Z6 = (C960610b6Z) afS1S1101100_15.l1;
            MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) c960610b6Z6.LL;
            if (multiCoHostSearchContract$AbsView != null) {
                multiCoHostSearchContract$AbsView.SR(c960610b6Z6.LJJIIJZLJL());
            }
            long jElapsedRealtime = 0;
            if (afS1S1101100_15.j3 != 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - afS1S1101100_15.j3;
            }
            C955400ayA c955400ayA = C955400ayA.LIZ;
            Integer numValueOf = Integer.valueOf(afS1S1101100_15.i2);
            String str2 = ((C960610b6Z) afS1S1101100_15.l1).LLIZLLLIL;
            if (str2 == null) {
                str2 = "";
            }
            C955400ayA.LJLL(jElapsedRealtime, numValueOf, str2, afS1S1101100_15.s0, true);
        }
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.fetchResultListData$1");
    }

    public static final void accept$1(AfS1S1101100_15 afS1S1101100_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.fetchResultListData$2");
        Throwable th = (Throwable) obj;
        if (Intrinsics.LJFF(afS1S1101100_15.s0, ((C960610b6Z) afS1S1101100_15.l1).LLJILLL)) {
            ((C960610b6Z) afS1S1101100_15.l1).LLILZIL.clear();
            MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) ((C960610b6Z) afS1S1101100_15.l1).LL;
            if (multiCoHostSearchContract$AbsView != null) {
                multiCoHostSearchContract$AbsView.RR(th);
            }
            long jElapsedRealtime = 0;
            if (afS1S1101100_15.j3 != 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - afS1S1101100_15.j3;
            }
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJLL(jElapsedRealtime, Integer.valueOf(afS1S1101100_15.i2), "", afS1S1101100_15.s0, false);
            ((C960610b6Z) afS1S1101100_15.l1).LLJILJIL = 0;
        }
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.fetchResultListData$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S1101100_15(int r2, long r3, X.C960610b6Z r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L11
            r0 = r1
            r0.s0 = r6
            r0.l1 = r5
            r0.j3 = r3
            r0.i2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.s0 = r6
            r0.l1 = r5
            r0.i2 = r2
            r0.j3 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S1101100_15.<init>(int, long, X.0b6Z, java.lang.String, int):void");
    }
}
