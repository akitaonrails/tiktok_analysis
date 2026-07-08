package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1083530eIp;
import X.C1119170fEJ;
import X.C1203130hPj;
import X.C14K9;
import X.C20373514nl;
import X.C20373814no;
import X.C20390614qW;
import X.C20392914qt;
import X.C20396514rT;
import X.C20632315oP;
import X.C20736316Cj;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C978360bZC;
import X.InterfaceC1203170hPn;
import X.InterfaceC20403914sf;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListV2Dialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicNonMGPlaybookFixTechSwitchSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookFavoritesListV2Dialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIgkyPio+IDs2OwklOjsFegElKCM8Lw==";
    public final DataChannel LLJZIJLIL;
    public final PlaybookAnchorViewModel LLL;
    public final boolean LLLF;
    public volatile boolean LLLFF;
    public final C20392914qt LLLFFI;
    public final Set<Long> LLLFZ;
    public C20632315oP LLLI;
    public C1203130hPj LLLII;
    public int LLLIIII;
    public final C01GW LLLIIIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hb0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854123));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJ = Collections.singletonList(VR());
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20632315oP c20632315oP = this.LLLI;
        if (c20632315oP != null) {
            c20632315oP.LJI((AbstractC712240Rwk) this.LLLIIIIL.getValue());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        return C20373514nl.LIZ(this.LLLF);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/playbooklist/PlaybookFavoritesListV2Dialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM9MIRI5VBiqezqppeR88H7JodE8qoO/lAxrNmWSBsUPBtMnSi2Hvohz+Og==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LIZIZ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.14qt] */
    public PlaybookFavoritesListV2Dialog(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel) {
        boolean zBooleanValue;
        Boolean bool;
        this.LLJZIJLIL = dataChannel;
        this.LLL = playbookAnchorViewModel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C1083530eIp.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLLF = zBooleanValue;
        this.LLLFFI = new InterfaceC20403914sf() { // from class: X.14qt
            @Override // X.InterfaceC20403914sf
            public final long LLJJ() {
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook;
                PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZ.LLL;
                if (playbookAnchorViewModel2 == null || (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null) {
                    return 0L;
                }
                return playbook.playbookId;
            }

            @Override // X.InterfaceC20403914sf
            public final long m2() {
                MutableLiveData<Long> mutableLiveData;
                Long value;
                PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZ.LLL;
                if (playbookAnchorViewModel2 == null || (mutableLiveData = playbookAnchorViewModel2.LLJJ) == null || (value = mutableLiveData.getValue()) == null) {
                    return 0L;
                }
                return value.longValue();
            }

            @Override // X.InterfaceC20403914sf
            public final void n2() {
                this.LIZ.sl();
            }

            @Override // X.InterfaceC20403914sf
            public final void o2(Playbook playbook, C1117360fBO c1117360fBO, C978410bZH c978410bZH) {
                boolean z;
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                long j;
                EnumC20429314wl enumC20429314wlLIZ;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook2;
                Iterator<?> it2 = c1117360fBO.LL.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if ((next instanceof C20390914qZ) && ((C20390914qZ) next).LIZ.playbookId == playbook.playbookId) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = this.LIZ;
                DataChannel dataChannel2 = playbookFavoritesListV2Dialog.LLJZIJLIL;
                if (i < 0) {
                    i = 0;
                }
                int i2 = i + 1;
                PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookFavoritesListV2Dialog.LLL;
                if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                    z = true;
                } else {
                    z = false;
                }
                C978360bZC.LJIILL(dataChannel2, "click", playbook, "favorite", i2, z, false, null, null, 0, null, null, 4032);
                long j2 = playbook.playbookId;
                if (c978410bZH != null) {
                    C978360bZC.LJJIIZ(j2, c978410bZH);
                }
                DataChannel dataChannel3 = this.LIZ.LLJZIJLIL;
                if (dataChannel3 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel3)) != null) {
                    long j3 = playbook.playbookId;
                    PlaybookContent playbookContent = playbook.content;
                    if (playbookContent != null) {
                        j = playbookContent.playbookContentId;
                    } else {
                        j = 0;
                    }
                    C20382814pG c20382814pG = new C20382814pG(j3, j, playbook.isUpdatedVersion, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -8);
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    if (LinkMicNonMGPlaybookFixTechSwitchSetting.INSTANCE.isEnable()) {
                        enumC20429314wlLIZ = C20394214r6.LIZ(this.LIZ.LLL);
                    } else {
                        enumC20429314wlLIZ = null;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJIFFI(c20382814pG, "favorites item click", c915190ZvJ2, enumC20429314wlLIZ, false);
                }
            }

            @Override // X.InterfaceC20403914sf
            public final void p2(Playbook playbook, C1117360fBO c1117360fBO, C20402114sN c20402114sN) {
                long j;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook2;
                PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZ.LLL;
                if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null) {
                    j = playbook2.playbookId;
                } else {
                    j = 0;
                }
                Context context = this.LIZ.getContext();
                if (context != null) {
                    PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = this.LIZ;
                    C20394714rB c20394714rB = C20394714rB.LIZ;
                    DataChannel dataChannel2 = playbookFavoritesListV2Dialog.LLJZIJLIL;
                    PlaybookAnchorViewModel playbookAnchorViewModel3 = playbookFavoritesListV2Dialog.LLL;
                    c20394714rB.getClass();
                    C20394714rB.LJ(dataChannel2, context, playbook, playbookAnchorViewModel3, C20394714rB.LIZJ(playbook, c1117360fBO, playbookAnchorViewModel3), null, null, new C20393214qw(c1117360fBO, playbookFavoritesListV2Dialog, c20402114sN, j));
                }
            }
        };
        this.LLLFZ = new LinkedHashSet();
        this.LLLIIIIL = C452501pT.LIZIZ(new C20373814no(this));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<List<Playbook>> mutableLiveData;
        super.onViewCreated(view, bundle);
        if (this.LLLF) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v7
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                viewFindViewById2.setBackgroundColor(QM(requireContext()));
            }
        }
        this.LLLFF = false;
        this.LLLII = (C1203130hPj) view.findViewById(R.id.z02);
        this.LLLI = (C20632315oP) view.findViewById(R.id.viewPager);
        final C20396514rT c20396514rT = new C20396514rT(this, this.LLL, this.LLLFFI, new C20390614qW(this), this.LLJZIJLIL);
        C20632315oP c20632315oP = this.LLLI;
        if (c20632315oP != null) {
            c20632315oP.setAdapter(c20396514rT);
        }
        C1203130hPj c1203130hPj = this.LLLII;
        if (c1203130hPj != null) {
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.14nm
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    C20632315oP c20632315oP2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSelectedChange pos:");
                    sbLIZ.append(i);
                    sbLIZ.append(", selected:");
                    sbLIZ.append(z);
                    sbLIZ.append(", from:");
                    sbLIZ.append(abstractC1203190hPp);
                    C20441214yg.LIZIZ("PlaybookFavoritesListV2Dialog", C2188811AlT.LIZIZ(sbLIZ));
                    PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = this.LIZ;
                    playbookFavoritesListV2Dialog.LLLIIII = i;
                    C20632315oP c20632315oP3 = playbookFavoritesListV2Dialog.LLLI;
                    if ((c20632315oP3 != null && c20632315oP3.getCurrentItem() == i) || (c20632315oP2 = this.LIZ.LLLI) == null) {
                        return;
                    }
                    c20632315oP2.LJ(i, true);
                }
            });
        }
        C20632315oP c20632315oP2 = this.LLLI;
        if (c20632315oP2 != null) {
            c20632315oP2.LIZIZ((AbstractC712240Rwk) this.LLLIIIIL.getValue());
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJILJILJ) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14nr
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Integer numValueOf;
                    MutableLiveData<Boolean> mutableLiveData2;
                    Boolean value;
                    List list = (List) obj;
                    PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog = this.LL;
                    C1203130hPj c1203130hPj2 = playbookFavoritesListV2Dialog.LLLII;
                    if (c1203130hPj2 != null) {
                        if (!playbookFavoritesListV2Dialog.LLLFF) {
                            this.LL.LLLFF = true;
                            PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog2 = this.LL;
                            C20396514rT c20396514rT2 = c20396514rT;
                            playbookFavoritesListV2Dialog2.getClass();
                            String strLIZ = C01EI.LIZ(0, "PlaybookFavoritesListV2Dialog");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("update favoritePlaybookListLiveData size:");
                            if (list != null) {
                                numValueOf = Integer.valueOf(list.size());
                            } else {
                                numValueOf = null;
                            }
                            sbLIZ.append(numValueOf);
                            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                            ArrayList arrayList = new ArrayList();
                            List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("All");
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list) {
                                    if (((Playbook) obj2).isMyFavorite) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                if (arrayList2.size() > 0) {
                                    listLJIILJJIL.add("Favorite");
                                }
                            }
                            if (list != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : list) {
                                    if (((Playbook) obj3).isMyCreation) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                    listLJIILJJIL.add("My");
                                }
                            }
                            PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookFavoritesListV2Dialog2.LLL;
                            if (playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLJIJIL) != null && (value = mutableLiveData2.getValue()) != null && value.booleanValue() && list != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : list) {
                                    if (((Playbook) obj4).playbookType == 1) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                if (arrayList4.size() > 0) {
                                    listLJIILJJIL.add("PGC");
                                }
                            }
                            for (String strLJIJI : listLJIILJJIL) {
                                int iHashCode = strLJIJI.hashCode();
                                if (iHashCode != 2508) {
                                    if (iHashCode != 65921) {
                                        if (iHashCode == 1115434428 && strLJIJI.equals("Favorite")) {
                                            strLJIJI = C497740JfY.LJIJI(2131854122);
                                        }
                                    } else if (strLJIJI.equals("All")) {
                                        strLJIJI = C497740JfY.LJIJI(2131854120);
                                    }
                                } else if (strLJIJI.equals("My")) {
                                    strLJIJI = C497740JfY.LJIJI(2131854121);
                                }
                                arrayList.add(new C1203140hPk(strLJIJI, null, 14));
                            }
                            c1203130hPj2.setChips(arrayList);
                            c20396514rT2.LLJILLL = listLJIILJJIL;
                            c20396514rT2.notifyDataSetChanged();
                            c1203130hPj2.LIZ(0, true, C1203200hPq.LIZ);
                        }
                        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                        final PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog3 = this.LL;
                        final C20396514rT c20396514rT3 = c20396514rT;
                        iHostUser.requestLivePermission(new InterfaceC472150IfN() { // from class: X.14qX
                            @Override // X.InterfaceC472150IfN
                            public final void onFailed(Throwable th) {
                                DataChannel dataChannel = playbookFavoritesListV2Dialog3.LLJZIJLIL;
                                if (dataChannel != null) {
                                    dataChannel.zW(UserHasLivePermission.class, Boolean.FALSE);
                                }
                                c20396514rT3.notifyDataSetChanged();
                            }

                            @Override // X.InterfaceC472150IfN
                            public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
                                boolean zBooleanValue;
                                DataChannel dataChannel = playbookFavoritesListV2Dialog3.LLJZIJLIL;
                                if (dataChannel != null) {
                                    if (bool != null) {
                                        zBooleanValue = bool.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    dataChannel.zW(UserHasLivePermission.class, Boolean.valueOf(zBooleanValue));
                                }
                                c20396514rT3.notifyDataSetChanged();
                            }
                        }, "playbook_favorites_list");
                    }
                }
            });
        }
    }
}
