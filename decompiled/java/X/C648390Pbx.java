package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648390Pbx {
    public static final List<AbstractC648060PbQ> LIZ(final C647830Pb3 c647830Pb3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C648790Pcb(c647830Pb3));
        arrayList.add(new AbstractC648060PbQ(c647830Pb3) { // from class: X.0PcE
            public final C01GW LLILLJJLI;

            @Override // X.AbstractC648060PbQ
            public final void LJFF() {
                C650300Pf2.LIZLLL.LIZ((InterfaceC650320Pf4) this.LLILLJJLI.getValue());
            }

            @Override // X.AbstractC648060PbQ
            public final void LJI() {
                C650300Pf2.LIZLLL.LJFF((InterfaceC650320Pf4) this.LLILLJJLI.getValue());
            }

            {
                super(c647830Pb3);
                this.LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(c647830Pb3, 1049));
            }
        });
        arrayList.add(new C0PH4(c647830Pb3));
        arrayList.add(new C648450Pc3(c647830Pb3));
        arrayList.add(new C648460Pc4(c647830Pb3));
        arrayList.add(new AbstractC648060PbQ(c647830Pb3) { // from class: X.0Pc9
            public final C01GW LLILLJJLI;

            @Override // X.AbstractC648060PbQ
            public final void LJ() {
                C650300Pf2.LIZLLL.LIZ((InterfaceC650320Pf4) this.LLILLJJLI.getValue());
            }

            {
                super(c647830Pb3);
                this.LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(c647830Pb3, 1051));
            }
        });
        arrayList.add(new AbstractC648060PbQ(c647830Pb3) { // from class: X.0Pbv
            @Override // X.AbstractC648060PbQ
            public final void LJFF() {
                EventBus.LIZLLL().LJIJJ(this);
            }

            @Override // X.AbstractC648060PbQ
            public final void LJI() {
                EventBus.LIZLLL().LJJI(this);
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onCollectMusicEvent(C0OGJ c0ogj) {
                try {
                    C647830Pb3 c647830Pb32 = this.LL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("music_id", c0ogj.LIZ);
                    jSONObject.put("collect_status", c0ogj.LIZIZ);
                    c647830Pb32.LIZ("changeMusicCollectState", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        arrayList.add(new AbstractC648060PbQ(c647830Pb3) { // from class: X.0Pcw
            @Override // X.AbstractC648060PbQ
            public final void LJFF() {
                EventBus.LIZLLL().LJIJJ(this);
            }

            @Override // X.AbstractC648060PbQ
            public final void LJI() {
                EventBus.LIZLLL().LJJI(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
            @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onExitTabHorizontalVideo(X.C649030Pcz r6) {
                /*
                    r5 = this;
                    X.0Pb3 r0 = r5.LL
                    X.19EG r4 = r0.LIZJ
                    if (r4 != 0) goto L7
                    return
                L7:
                    androidx.fragment.app.Fragment r3 = r0.LIZ
                    r2 = 0
                    if (r3 == 0) goto L20
                    android.content.Context r0 = r3.getContext()
                    if (r0 == 0) goto L43
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                L16:
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L28
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L37
                L20:
                    r3 = r2
                L21:
                    boolean r0 = X.C651290Pgd.LJIIIZ(r4, r3)
                    if (r0 != 0) goto L45
                    return
                L28:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L20
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L37
                    goto L20
                L35:
                    if (r3 == 0) goto L20
                L37:
                    boolean r0 = r3 instanceof X.InterfaceC214902198i
                    if (r0 == 0) goto L3e
                    X.198i r3 = (X.InterfaceC214902198i) r3
                    goto L21
                L3e:
                    androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                    goto L35
                L43:
                    r1 = r2
                    goto L16
                L45:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C649000Pcw.onExitTabHorizontalVideo(X.0Pcz):void");
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onTransferSearchHorizontalEvent(C649010Pcx c649010Pcx) throws Throwable {
                String string;
                String str;
                long j;
                long j2;
                Integer numValueOf;
                String str2;
                int iIntValue;
                boolean zBooleanValue;
                int iIntValue2;
                String str3;
                List<? extends Map<?, ?>> list;
                C1537480q70 hybridContext;
                List<? extends Map<?, ?>> list2;
                InterfaceC1541990qEH interfaceC1541990qEH;
                Long l;
                Boolean bool;
                Integer num;
                String str4;
                C647830Pb3 c647830Pb32 = this.LL;
                C19EG c19eg = c647830Pb32.LIZJ;
                if (c19eg == null) {
                    return;
                }
                SAFHelper sAFHelper = SAFHelper.LIZ;
                Fragment fragment = c647830Pb32.LIZ;
                sAFHelper.getClass();
                Integer numLJJIJIL = SAFHelper.LJJIJIL(fragment, c19eg);
                String strLJIIIIZZ = null;
                if (numLJJIJIL != null) {
                    string = numLJJIJIL.toString();
                } else {
                    string = null;
                }
                if (!Intrinsics.LJFF(c649010Pcx.LIZLLL, string)) {
                    C651000PgA c651000PgA = c649010Pcx.LIZIZ;
                    if (c651000PgA != null) {
                        str4 = c651000PgA.LJIIIIZZ;
                    } else {
                        str4 = null;
                    }
                    if (!Intrinsics.LJFF(str4, string)) {
                        return;
                    }
                }
                C647830Pb3 c647830Pb33 = this.LL;
                JSONObject jSONObject = new JSONObject();
                SearchHorizontalData searchHorizontalData = c649010Pcx.LIZ;
                if (searchHorizontalData == null || (str = searchHorizontalData.rawDataDiff) == null) {
                    str = "";
                }
                jSONObject.put("raw_data_diff", str);
                C651000PgA c651000PgA2 = c649010Pcx.LIZIZ;
                long jLongValue = -1;
                if (c651000PgA2 != null) {
                    j = c651000PgA2.LJFF;
                } else {
                    j = -1;
                }
                jSONObject.put("cursor", j);
                C651000PgA c651000PgA3 = c649010Pcx.LIZIZ;
                if (c651000PgA3 != null) {
                    j2 = c651000PgA3.LJI;
                } else {
                    j2 = 0;
                }
                jSONObject.put("count", j2);
                SearchHorizontalData searchHorizontalData2 = c649010Pcx.LIZ;
                if (searchHorizontalData2 != null) {
                    numValueOf = Integer.valueOf(searchHorizontalData2.status_code);
                } else {
                    numValueOf = null;
                }
                jSONObject.put("code", numValueOf);
                SearchHorizontalData searchHorizontalData3 = c649010Pcx.LIZ;
                if (searchHorizontalData3 != null) {
                    str2 = searchHorizontalData3.status_msg;
                } else {
                    str2 = null;
                }
                jSONObject.put("err_msg", str2);
                C651000PgA c651000PgA4 = c649010Pcx.LIZIZ;
                if (c651000PgA4 != null && (num = c651000PgA4.LJII) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                jSONObject.put("tab_index", iIntValue);
                SearchHorizontalData searchHorizontalData4 = c649010Pcx.LIZ;
                if (searchHorizontalData4 != null && (bool = searchHorizontalData4.hasMore) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                jSONObject.put("has_more", zBooleanValue);
                SearchHorizontalData searchHorizontalData5 = c649010Pcx.LIZ;
                if (searchHorizontalData5 != null && (l = searchHorizontalData5.newCursor) != null) {
                    jLongValue = l.longValue();
                }
                jSONObject.put("new_cursor", jLongValue);
                jSONObject.put("total_video_count", c649010Pcx.LIZJ);
                Integer num2 = c649010Pcx.LJ;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = -1;
                }
                jSONObject.put("session_id", iIntValue2);
                DynamicPatch dynamicPatch = this.LL.LJIIIIZZ;
                if (dynamicPatch != null) {
                    str3 = dynamicPatch.schema;
                } else {
                    str3 = null;
                }
                if (C20039613b0.LIZ(str3)) {
                    ViewParent viewParent = this.LL.LJ;
                    if ((viewParent instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) viewParent) != null) {
                        hybridContext = interfaceC1541990qEH.getHybridContext();
                    } else {
                        hybridContext = null;
                    }
                    SearchHorizontalData searchHorizontalData6 = c649010Pcx.LIZ;
                    if (searchHorizontalData6 != null && (list2 = searchHorizontalData6.LLILLJJLI) != null) {
                        C647380PaK.LJIIIIZZ.getClass();
                        List listLJIIIIZZ = C647380PaK.LJIIIIZZ(hybridContext, list2);
                        if ((listLJIIIIZZ instanceof List) && listLJIIIIZZ != null) {
                            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(listLJIIIIZZ);
                        }
                    }
                    jSONObject.put("aweme_list", strLJIIIIZZ);
                } else {
                    SearchHorizontalData searchHorizontalData7 = c649010Pcx.LIZ;
                    if (searchHorizontalData7 != null) {
                        list = searchHorizontalData7.LLILLJJLI;
                    } else {
                        list = null;
                    }
                    List listLJIIJJI = C1697810uHb.LJIIJJI("aweme_id", "aweme_type", "group_id", "author", "desc", "video", "create_time", "rawdata", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "room", "user_digged", "search_desc", "statistics");
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Map<?, ?> map : list) {
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                            for (Object obj : listLJIIJJI) {
                                linkedHashMap.put(obj, map.get(obj));
                            }
                            arrayList2.add(linkedHashMap);
                        }
                        strLJIIIIZZ = C1741890vQh.LJIIIIZZ(arrayList2);
                    }
                    jSONObject.put("aweme_list", strLJIIIIZZ);
                }
                c647830Pb33.LIZ("TransferSearchHorizontalData", jSONObject);
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onTransferSearchHorizontalEventV2(AnonymousClass0853 anonymousClass0853) throws Throwable {
                String string;
                C647830Pb3 c647830Pb32 = this.LL;
                C19EG c19eg = c647830Pb32.LIZJ;
                if (c19eg == null) {
                    return;
                }
                SAFHelper sAFHelper = SAFHelper.LIZ;
                Fragment fragment = c647830Pb32.LIZ;
                sAFHelper.getClass();
                Integer numLJJIJIL = SAFHelper.LJJIJIL(fragment, c19eg);
                if (numLJJIJIL != null) {
                    string = numLJJIJIL.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(anonymousClass0853.LIZIZ, string)) {
                    C647830Pb3 c647830Pb33 = this.LL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("response", anonymousClass0853.LIZ);
                    C648850Pch c648850Pch = c647830Pb33.LJIILL;
                    if (c648850Pch != null) {
                        c648850Pch.LIZ.LIZ("TransferSearchHorizontalDataV2", jSONObject);
                    }
                }
            }
        });
        arrayList.add(new AbstractC648060PbQ(c647830Pb3) { // from class: X.0PLv
            @Override // X.AbstractC648060PbQ
            public final void LJFF() {
                EventBus.LIZLLL().LJIJJ(this);
            }

            @Override // X.AbstractC648060PbQ
            public final void LJI() {
                EventBus.LIZLLL().LJJI(this);
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onCommentDiggChangedEvent(C035B c035b) {
                ComponentCallbacks2 componentCallbacks2LJFF;
                C647830Pb3 c647830Pb32 = this.LL;
                C19EG c19eg = c647830Pb32.LIZJ;
                if (c19eg == null) {
                    return;
                }
                Fragment parentFragment = c647830Pb32.LIZ;
                InterfaceC214902198i interfaceC214902198i = null;
                if (parentFragment != null) {
                    Context context = parentFragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        while (true) {
                            if (parentFragment instanceof InterfaceC214902198i) {
                                interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                                break;
                            } else {
                                parentFragment = parentFragment.getParentFragment();
                                if (parentFragment == null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (C651290Pgd.LJIIIZ(c19eg, interfaceC214902198i)) {
                    try {
                        C647830Pb3 c647830Pb33 = this.LL;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", c035b.LIZ);
                        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c035b.LIZIZ);
                        c647830Pb33.LIZ("changeCommentDiggState", jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LIZJ("search_jsb_json");
                    }
                }
            }
        });
        return arrayList;
    }
}
