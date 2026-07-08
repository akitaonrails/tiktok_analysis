package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select;

import X.AbstractC712240Rwk;
import X.C1119170fEJ;
import X.C118300cf;
import X.C1203130hPj;
import X.C13LP;
import X.C1868330yid;
import X.C19412010x4;
import X.C1AZW;
import X.C20358014lG;
import X.C20359314lT;
import X.C20359414lU;
import X.C20360614lg;
import X.C20361214lm;
import X.C20370214nE;
import X.C20370814nK;
import X.C20371314nP;
import X.C20379114of;
import X.C20441214yg;
import X.C20632315oP;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C930480aJy;
import X.C978360bZC;
import X.C985720bl4;
import X.EnumC994540bzI;
import X.InterfaceC1203170hPn;
import X.InterfaceC19411910x3;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.select.PlaybookEditorSelectEntityDialog;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class PlaybookEditorSelectEntityDialog extends BasePlaybookSheetFragment implements InterfaceC19411910x3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiHELIOSOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms/LCM2KzFiGSMyMScjJiQWLCw4Jj0ALSkpKjsWJjElPTYXISQgJig=";
    public final BasePlaybookEditorViewModel LLJZIJLIL;
    public final DataChannel LLL;
    public final Function0<Long> LLLF;
    public final Function0<String> LLLFF;
    public final Function0<Boolean> LLLFFI;
    public final Function1<Integer, Unit> LLLFZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hb0;
    }

    public final boolean BS() {
        return this.LLJZIJLIL.LLILLL.LJII.getValue() == EnumC994540bzI.DESIGN;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(BS() ? "Add design" : C497740JfY.LJIJJ(2131854035, ""));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // X.InterfaceC19411910x3
    public final void Wt(C1868330yid c1868330yid) {
        String str;
        String str2;
        long jLongValue;
        boolean z;
        int i;
        C20379114of c20379114ofVQ2;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        List<C20361214lm> arrayList;
        ArrayList<C20361214lm> arrayList2 = null;
        if (c1868330yid.LIZIZ && !BS()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unselect ");
            sbLIZ.append(c1868330yid.LIZ.LIZ);
            sbLIZ.append('!');
            C20441214yg.LIZIZ("PlaybookSelectEntityDialog", C2188811AlT.LIZIZ(sbLIZ));
            BasePlaybookEditorViewModel basePlaybookEditorViewModel = this.LLJZIJLIL;
            C20361214lm c20361214lm = c1868330yid.LIZ;
            basePlaybookEditorViewModel.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unselectEntity playbookTask=");
            sbLIZ2.append(c20361214lm);
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
            MutableLiveData<ArrayList<C20361214lm>> mutableLiveData = basePlaybookEditorViewModel.LLILLL.LJFF;
            ArrayList<C20361214lm> value = mutableLiveData.getValue();
            if (value != null) {
                value.remove(c20361214lm);
                arrayList2 = value;
            }
            mutableLiveData.setValue(arrayList2);
            return;
        }
        if (c1868330yid.LIZIZ) {
            return;
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        String str3 = "";
        if (!c915190ZvJ.LIZIZ) {
            str = "";
        } else {
            str = c915190ZvJ.LIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("select ");
        sbLIZ3.append(c1868330yid.LIZ.LIZ);
        sbLIZ3.append('!');
        C20441214yg.LIZIZ("PlaybookSelectEntityDialog", C2188811AlT.LIZIZ(sbLIZ3));
        if (BS()) {
            str2 = "choose_design";
        } else {
            str2 = "choose_feature";
        }
        C978360bZC.LJIJ(str2, c1868330yid.LIZ.LIZ, this.LLLF.invoke(), this.LLLFF.invoke(), this.LLLFFI.invoke().booleanValue(), null, null);
        PlayRule playRule = c1868330yid.LIZ.LIZLLL;
        Long lInvoke = this.LLLF.invoke();
        long j = 0;
        if (lInvoke != null) {
            jLongValue = lInvoke.longValue();
        } else {
            jLongValue = 0;
        }
        C985720bl4.LJ(playRule, jLongValue, 0L, "edit", str);
        BasePlaybookEditorViewModel basePlaybookEditorViewModel2 = this.LLJZIJLIL;
        C20361214lm c20361214lm2 = c1868330yid.LIZ;
        basePlaybookEditorViewModel2.getClass();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("selectEntity playbookTask=");
        sbLIZ4.append(c20361214lm2);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ4), null, null);
        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
        if (c915190ZvJ2.LIZIZ) {
            str3 = c915190ZvJ2.LIZ;
        }
        int i2 = c20361214lm2.LIZJ.LJI;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C20358014lG.LIZIZ(i2, 2)) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854103));
                PlayRule playRule2 = c20361214lm2.LIZLLL;
                Playbook playbook = basePlaybookEditorViewModel2.LLILZIL;
                if (playbook != null) {
                    j = playbook.playbookId;
                }
                i = 1;
                C985720bl4.LIZLLL(playRule2, j, -3L, str3);
            } else {
                i = 1;
                if (C20358014lG.LIZIZ(c20361214lm2.LIZJ.LJI, 4)) {
                    C766270U4b.LIZLLL(2131854102);
                    PlayRule playRule3 = c20361214lm2.LIZLLL;
                    Playbook playbook2 = basePlaybookEditorViewModel2.LLILZIL;
                    if (playbook2 != null) {
                        j = playbook2.playbookId;
                    }
                    C985720bl4.LIZLLL(playRule3, j, -5L, str3);
                }
            }
        } else {
            i = 1;
            C20359414lU value2 = basePlaybookEditorViewModel2.LLILLL.LJI.getValue();
            if (basePlaybookEditorViewModel2.LLILLL.LJII.getValue() == EnumC994540bzI.DESIGN && value2 != null) {
                C930480aJy.LIZ.getClass();
                if (!C930480aJy.LJJ()) {
                    if (basePlaybookEditorViewModel2.LLILZ.LJ()) {
                        C766270U4b.LJIIJJI("You must wait for all feature configuration processes to complete.");
                    } else if (!BasePlaybookEditorViewModel.BQ2(c20361214lm2)) {
                        C766270U4b.LIZLLL(2131854102);
                    } else {
                        List listXQ2 = BasePlaybookEditorViewModel.xQ2(value2);
                        if (listXQ2.size() >= 10) {
                            C766270U4b.LJIIJJI("You can add up to 10 designs.");
                        } else {
                            String strZQ2 = BasePlaybookEditorViewModel.zQ2(c20361214lm2);
                            if (strZQ2 != null && strZQ2.length() != 0 && c20361214lm2.LIZJ.LJI == 0) {
                                if (!listXQ2.isEmpty()) {
                                    Iterator it2 = listXQ2.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(BasePlaybookEditorViewModel.zQ2((C20361214lm) it2.next()), strZQ2)) {
                                            C766270U4b.LJIIJJI("This design has already been added.");
                                            break;
                                        }
                                    }
                                    c20379114ofVQ2 = basePlaybookEditorViewModel2.vQ2(value2, Collections.singletonList(c20361214lm2));
                                    if (c20379114ofVQ2 == null && (c20360614lg = c20379114ofVQ2.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null && (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(0, list)) != null) {
                                        if (!c20359414lU.LIZJ.isEmpty()) {
                                            c20359414lU.LJI = true;
                                            for (C20361214lm c20361214lm3 : c20359414lU.LIZJ) {
                                                c20361214lm3.LJII = C20359314lT.LJ(c20361214lm3);
                                            }
                                            c20359414lU.LJFF = "auto";
                                            basePlaybookEditorViewModel2.DQ2(c20359414lU);
                                        }
                                        basePlaybookEditorViewModel2.HA2();
                                        PlayRule playRule4 = c20361214lm2.LIZLLL;
                                        Playbook playbook3 = basePlaybookEditorViewModel2.LLILZIL;
                                        if (playbook3 != null) {
                                            j = playbook3.playbookId;
                                        }
                                        C985720bl4.LIZLLL(playRule4, j, 0L, str3);
                                    } else {
                                        C766270U4b.LJIIJJI("Add design task failed.");
                                    }
                                } else {
                                    c20379114ofVQ2 = basePlaybookEditorViewModel2.vQ2(value2, Collections.singletonList(c20361214lm2));
                                    if (c20379114ofVQ2 == null) {
                                    }
                                    C766270U4b.LJIIJJI("Add design task failed.");
                                }
                            } else {
                                C766270U4b.LIZLLL(2131854102);
                            }
                        }
                    }
                }
                close(i);
            }
            ArrayList<C20361214lm> value3 = basePlaybookEditorViewModel2.LLILLL.LJFF.getValue();
            if (value3 == null) {
                value3 = new ArrayList<>();
            }
            value3.remove(c20361214lm2);
            value3.add(c20361214lm2);
            basePlaybookEditorViewModel2.LLILLL.LJFF.setValue(value3);
            PlayRule playRule5 = c20361214lm2.LIZLLL;
            Playbook playbook4 = basePlaybookEditorViewModel2.LLILZIL;
            if (playbook4 != null) {
                j = playbook4.playbookId;
            }
            C985720bl4.LIZLLL(playRule5, j, 0L, str3);
        }
        BasePlaybookEditorViewModel basePlaybookEditorViewModel3 = this.LLJZIJLIL;
        basePlaybookEditorViewModel3.getClass();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "applySelection", null, null);
        if (basePlaybookEditorViewModel3.LLILLL.LJII.getValue() == EnumC994540bzI.DESIGN) {
            return;
        }
        if (basePlaybookEditorViewModel3.LLILZ.LJ()) {
            C766270U4b.LJIIJJI("You must wait for all feature configuration processes to complete.");
            return;
        }
        C20359414lU value4 = basePlaybookEditorViewModel3.LLILLL.LJI.getValue();
        if (value4 != null) {
            ArrayList<C20361214lm> value5 = basePlaybookEditorViewModel3.LLILLL.LJFF.getValue();
            if (value5 == null || (arrayList = C13LP.LLIIII(value5)) == null) {
                arrayList = new ArrayList<>();
            }
            basePlaybookEditorViewModel3.vQ2(value4, arrayList);
        }
        basePlaybookEditorViewModel3.HA2();
        close(i);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLFZ.invoke(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        final C1203130hPj c1203130hPj = (C1203130hPj) view.findViewById(R.id.z02);
        c1203130hPj.setHorizontalMargin(18);
        final C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.viewPager);
        final C19412010x4 c19412010x4 = new C19412010x4(this, this.LLJZIJLIL, this, this.LLL);
        c20632315oP.setAdapter(c19412010x4);
        final C118300cf c118300cf = new C118300cf();
        c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.14nX
            @Override // X.InterfaceC1203170hPn
            public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                String str2;
                String str3;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSelectedChange pos:");
                sbLIZ.append(i);
                sbLIZ.append(", selected:");
                sbLIZ.append(z);
                sbLIZ.append(", from:");
                sbLIZ.append(abstractC1203190hPp);
                C20441214yg.LIZIZ("PlaybookSelectEntityDialog", C2188811AlT.LIZIZ(sbLIZ));
                c118300cf.element = i;
                if (c20632315oP.getCurrentItem() != i) {
                    c20632315oP.LJ(i, true);
                }
                if (z && (str2 = (String) C13LP.LJJJLZIJ(i, c19412010x4.LLJILJILJ)) != null) {
                    PlaybookEditorSelectEntityDialog playbookEditorSelectEntityDialog = this;
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    if (playbookEditorSelectEntityDialog.BS()) {
                        str3 = "choose_design";
                    } else {
                        str3 = "choose_feature";
                    }
                    C978360bZC.LJIJ(str3, str2, playbookEditorSelectEntityDialog.LLLF.invoke(), playbookEditorSelectEntityDialog.LLLFF.invoke(), playbookEditorSelectEntityDialog.LLLFFI.invoke().booleanValue(), null, null);
                }
            }
        });
        c20632315oP.LIZIZ(new AbstractC712240Rwk() { // from class: X.14na
            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                if (c118300cf.element != i) {
                    c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
                }
            }
        });
        this.LLJZIJLIL.LLILLL.LJ.observe(this, new Observer() { // from class: X.14nZ
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Set<String> setKeySet;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.LL.BS()) {
                    arrayList2.add("design");
                    arrayList.add(new C1203140hPk("design", null, 14));
                } else if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null) {
                    for (String strLJIJI : setKeySet) {
                        arrayList2.add(strLJIJI);
                        switch (strLJIJI.hashCode()) {
                            case -1074028481:
                                if (strLJIJI.equals("MultiGuest")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854027);
                                }
                                break;
                            case -260633137:
                                if (strLJIJI.equals("ServicePlus")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854030);
                                }
                                break;
                            case 61495950:
                                if (strLJIJI.equals("Enhance")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854025);
                                }
                                break;
                            case 635042390:
                                if (strLJIJI.equals("Interact")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854026);
                                }
                                break;
                            case 2023872564:
                                if (strLJIJI.equals("Cohost")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854024);
                                }
                                break;
                        }
                        arrayList.add(new C1203140hPk(strLJIJI, null, 14));
                    }
                }
                if (!Intrinsics.LJFF(c19412010x4.LLJILJILJ, arrayList2)) {
                    c1203130hPj.setChips(arrayList);
                    C19412010x4 c19412010x42 = c19412010x4;
                    c19412010x42.LLJILJILJ = arrayList2;
                    c19412010x42.notifyDataSetChanged();
                    c1203130hPj.LIZ(0, true, C1203200hPq.LIZ);
                }
            }
        });
        if (BS()) {
            C786410Ut5.LLLLLLL(c1203130hPj, 8);
        } else {
            C786410Ut5.LLLLLLL(c1203130hPj, 0);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        if (BS()) {
            str = "choose_design";
        } else {
            str = "choose_feature";
        }
        C978360bZC.LJIJJLI(this.LLLF.invoke(), str, this.LLLFF.invoke(), null, this.LLLFFI.invoke().booleanValue());
    }

    public PlaybookEditorSelectEntityDialog(BasePlaybookEditorViewModel basePlaybookEditorViewModel, DataChannel dataChannel, C20371314nP c20371314nP, C20370814nK c20370814nK, C20370214nE c20370214nE, AwS610S0100000_31 awS610S0100000_31) {
        this.LLJZIJLIL = basePlaybookEditorViewModel;
        this.LLL = dataChannel;
        this.LLLF = c20371314nP;
        this.LLLFF = c20370814nK;
        this.LLLFFI = c20370214nE;
        this.LLLFZ = awS610S0100000_31;
    }
}
