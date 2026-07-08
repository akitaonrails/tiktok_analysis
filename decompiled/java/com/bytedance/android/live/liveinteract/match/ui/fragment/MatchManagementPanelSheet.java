package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.C1119170fEJ;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16F5;
import X.C1819620xS4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C475510Ikn;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C944330agJ;
import X.C955400ayA;
import X.C955410ayB;
import X.C955540ayO;
import X.C955580ayS;
import X.C973660bRc;
import X.C973830bRt;
import X.C976480bWA;
import X.C976800bWg;
import X.C979690bbL;
import X.EnumC919170a1j;
import X.EnumC944810ah5;
import X.InterfaceC973730bRj;
import X.InterfaceC978780bZs;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.MatchPlaybookCapabilityShowEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchManagementPanelSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyHELIOSPCYkZzo6ZiM+KCg+LSs4ZwIyPCYkBC49KSIpJCo9PBUtJyo/Gy0pLDs=";
    public LinearLayout LLJLLL;
    public DataChannel LLJZ;
    public C979690bbL LLL;
    public Function1<? super Function1<? super Boolean, Unit>, Unit> LLJZIJLIL = AFwS250S0000000_15.get$arr$(38);
    public final Map<Long, C973830bRt> LLLF = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853734));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.cqr, new ACListenerS150S0100000_15(this, 49)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    public static MutableLiveData uS() {
        InterfaceC973730bRj interfaceC973730bRjYf2;
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        if (iLiveMatchServiceLJFF == null || (interfaceC973730bRjYf2 = iLiveMatchServiceLJFF.yf2(false)) == null) {
            return null;
        }
        return interfaceC973730bRjYf2.LJJJJIZL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        super.onDestroyView();
        ((LinkedHashMap) this.LLLF).clear();
        C979690bbL c979690bbL = this.LLL;
        if (c979690bbL == null || (weakReference = c979690bbL.LIZ) == null || (interfaceC978780bZs = weakReference.get()) == null) {
            return;
        }
        interfaceC978780bZs.LIZIZ(true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        boolean z;
        List list;
        List<C976800bWg> list2;
        int width;
        int height;
        int i;
        int iIntValue;
        super.onViewCreated(view, bundle);
        this.LLJLLL = (LinearLayout) view.findViewById(R.id.o2j);
        this.LLJZ = C475510Ikn.LJ(this);
        Context context = getContext();
        if (context != null) {
            C20441214yg.LJIIIZ("MatchManagementPanelSheet", "showDataForNewArch");
            MutableLiveData mutableLiveDataUS = uS();
            if (mutableLiveDataUS != null) {
                List<C976480bWA> list3 = (List) mutableLiveDataUS.getValue();
                if (list3 != null) {
                    int i2 = 0;
                    for (C976480bWA c976480bWA : list3) {
                        i2++;
                        List<C976800bWg> list4 = c976480bWA.LJFF;
                        if (list4 != null) {
                            int i3 = 0;
                            for (C976800bWg c976800bWg : (ArrayList) list4) {
                                i3++;
                                long j = c976800bWg.LIZ;
                                long j2 = c976800bWg.LJ;
                                long j3 = c976800bWg.LJII;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("matchWidget.findWindowById(uid) = null! userName = ");
                                sbLIZ.append(c976800bWg.LIZJ);
                                C20441214yg.LIZIZ("MatchManagementPanelSheet", C2188811AlT.LIZIZ(sbLIZ));
                                if (j3 > 0 && C915980Zwa.LJFF().Nt()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    j3 = 0;
                                }
                                String strLIZ = C944330agJ.LIZ(j2 - j3);
                                if (z) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZ);
                                    sbLIZ2.append('+');
                                    strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                }
                                LinearLayout linearLayout = this.LLJLLL;
                                if (linearLayout != null) {
                                    C973830bRt c973830bRt = new C973830bRt(context);
                                    String str = c976800bWg.LIZJ;
                                    ImageModel imageModel = c976800bWg.LIZLLL;
                                    int i4 = i2 - 1;
                                    if (!TextUtils.isEmpty(str) && imageModel != null) {
                                        C16F5 c16f5 = c973830bRt.LLILLJJLI;
                                        if (c16f5 != null) {
                                            c16f5.setText(str);
                                        }
                                        C16F5 c16f52 = c973830bRt.LLILZ;
                                        if (c16f52 != null) {
                                            c16f52.setText(strLIZ);
                                        }
                                        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                                        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                                        C1324720kZq c1324720kZq = c973830bRt.LL;
                                        if (c1324720kZq != null) {
                                            width = c1324720kZq.getWidth();
                                        } else {
                                            width = 0;
                                        }
                                        C1324720kZq c1324720kZq2 = c973830bRt.LL;
                                        if (c1324720kZq2 != null) {
                                            height = c1324720kZq2.getHeight();
                                        } else {
                                            height = 0;
                                        }
                                        c1324610kZfLJIIIZ.LJ = width;
                                        c1324610kZfLJIIIZ.LJFF = height;
                                        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                                        c1324610kZfLJIIIZ.LJJI(c973830bRt.LL);
                                        C1324720kZq c1324720kZq3 = c973830bRt.LLILLL;
                                        if (c1324720kZq3 != null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("getTeamIcon: realIndexTeams ");
                                            sbLIZ3.append(i4);
                                            C20441214yg.LJ("MatchManageItemView", C2188811AlT.LIZIZ(sbLIZ3));
                                            if (i4 >= 0 && i4 < c973830bRt.LLILZLL.size()) {
                                                iIntValue = ((Number) ListProtector.get(c973830bRt.LLILZLL, i4)).intValue();
                                            } else {
                                                iIntValue = ((Number) ListProtector.get(c973830bRt.LLILZLL, 0)).intValue();
                                            }
                                            c1324720kZq3.setActualImageResource(iIntValue);
                                        }
                                        C1324720kZq c1324720kZq4 = c973830bRt.LLILZIL;
                                        if (c1324720kZq4 != null) {
                                            c1324720kZq4.setActualImageResource(R.drawable.f25);
                                        }
                                        C1324720kZq c1324720kZq5 = c973830bRt.LLILZIL;
                                        if (c1324720kZq5 != null) {
                                            if (z) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            C786410Ut5.LLJJIII(c1324720kZq5, i);
                                        }
                                    }
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                                    MutableLiveData mutableLiveDataUS2 = uS();
                                    if (mutableLiveDataUS2 != null && (list = (List) mutableLiveDataUS2.getValue()) != null && i2 == list.size() && (list2 = c976480bWA.LJFF) != null && i3 == ((ArrayList) list2).size()) {
                                        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                    }
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c973830bRt);
                                    c973830bRt.setLayoutParams(layoutParams);
                                    this.LLLF.put(Long.valueOf(j), c973830bRt);
                                    linearLayout.addView(c973830bRt);
                                }
                            }
                        }
                    }
                }
                mutableLiveDataUS.observe(getViewLifecycleOwner(), new AObserverS219S0100000_15(this, 114));
            }
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C915980Zwa.LJFF().RY(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C973660bRc.LJIIIIZZ, "pk_icon");
        if (Intrinsics.LJFF("pk_icon", "pk_icon") || Intrinsics.LJFF("pk_icon", "plaza_icon")) {
            linkedHashMap.put("icon_style", C973660bRc.LJJIL("pk_icon"));
        }
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        C973660bRc.LIZJ(linkedHashMap, false);
        C973660bRc.LJFF(linkedHashMap);
        C973660bRc.LJI(linkedHashMap);
        C973660bRc.LIZ(linkedHashMap);
        C973660bRc.LJIILL(linkedHashMap);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C955400ayA.LJII(linkedHashMap);
        if (C955580ayS.LJ != 0 && (Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIIIZ) || Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJIJJLI))) {
            linkedHashMap.put(C973660bRc.LJJIJIL, String.valueOf(C955580ayS.LJ));
        }
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        c973660bRc.LJLLLLLL("livesdk_pk_management_panel_show", "1", EnumC944810ah5.MANUAL_PK.getType(), strLIZIZ, linkedHashMap);
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, MatchPlaybookCapabilityShowEvent.class, new AwS594S0100000_15(this, 130));
        }
        C979690bbL c979690bbL = this.LLL;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h7i, viewGroup, false);
    }
}
