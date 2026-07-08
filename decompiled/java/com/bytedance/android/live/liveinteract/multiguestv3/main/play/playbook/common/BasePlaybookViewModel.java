package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common;

import X.AbstractC20384214pU;
import X.C01EI;
import X.C01GW;
import X.C01NB;
import X.C0UO0;
import X.C11NJ;
import X.C11S5;
import X.C13AA;
import X.C19487311Lz;
import X.C1AZW;
import X.C20359414lU;
import X.C20360614lg;
import X.C20361214lm;
import X.C20362314lx;
import X.C20377014oK;
import X.C20379114of;
import X.C2188811AlT;
import X.C405101hp;
import X.C452501pT;
import X.C470590Icr;
import X.C480460Ism;
import X.C515801zg;
import X.C516201zk;
import X.C5182020e;
import X.EnumC20429314wl;
import X.InterfaceC170900l9;
import X.InterfaceC20378014oU;
import X.InterfaceC500101x9;
import android.util.LongSparseArray;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BasePlaybookViewModel extends ViewModel {
    public final DataChannel LL;
    public EnumC20429314wl LLIZ;
    public EnumC20429314wl LLIZLLLIL;
    public final MutableLiveData<ActivePlaybook> LLILLJJLI = new MutableLiveData<>(null);
    public final MutableLiveData<C20379114of> LLILLL = new MutableLiveData<>(null);
    public final MutableLiveData<C20379114of> LLILZ = new MutableLiveData<>(null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(406));
    public final LongSparseArray<C13AA> LLILZLL = new LongSparseArray<>();
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1452));
    public final C01GW LLJI = C452501pT.LIZIZ(new C5182020e(this, 312));

    public abstract AbstractC20384214pU wQ2();

    public abstract String xQ2();

    public final C11NJ vQ2() {
        return (C11NJ) this.LLILZIL.getValue();
    }

    public final boolean yQ2() {
        ActivePlaybook value;
        Playbook playbook;
        Playbook playbook2;
        if (this.LLILLL.getValue() == null) {
            return false;
        }
        C20379114of value2 = this.LLILLL.getValue();
        Long lValueOf = null;
        Long lValueOf2 = (value2 == null || (playbook2 = value2.LIZ) == null) ? null : Long.valueOf(playbook2.playbookId);
        MutableLiveData<ActivePlaybook> mutableLiveData = this.LLILLJJLI;
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        }
        return Intrinsics.LJFF(lValueOf2, lValueOf);
    }

    public void clearCache() {
        C1AZW.LJIIJ(12, C01EI.LIZ(207, xQ2()), "clearCache", null, null);
        C1AZW.LJIIJ(12, C01EI.LIZ(0, wQ2().LJIJJ()), "clearCache", null, null);
        vQ2().LJ();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        C1AZW.LJIIJ(12, C01EI.LIZ(192, xQ2()), "onCleared", null, null);
        super.onCleared();
        AbstractC20384214pU abstractC20384214pUWQ2 = wQ2();
        abstractC20384214pUWQ2.LJI.remove(this.LLJ.getValue());
        abstractC20384214pUWQ2.LJII.remove(this.LLJI.getValue());
        abstractC20384214pUWQ2.LJIILIIL();
    }

    public void onInit() {
        C1AZW.LJIIJ(12, C01EI.LIZ(182, xQ2()), "onInit", null, null);
        AbstractC20384214pU abstractC20384214pUWQ2 = wQ2();
        abstractC20384214pUWQ2.LJJIFFI();
        abstractC20384214pUWQ2.LJI.add((InterfaceC20378014oU) this.LLJ.getValue());
        abstractC20384214pUWQ2.LJII.add((InterfaceC500101x9) this.LLJI.getValue());
    }

    public BasePlaybookViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final int CQ2(C20359414lU c20359414lU) {
        C20379114of value;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        if (c20359414lU != null && (value = this.LLILLL.getValue()) != null && (c20360614lg = value.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), c20359414lU)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final int DQ2(C20361214lm c20361214lm) {
        C20379114of value;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        if (c20361214lm != null && (value = this.LLILLL.getValue()) != null && (c20360614lg = value.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C20361214lm next = it3.next();
                        if (C20362314lx.LIZ(next, c20361214lm)) {
                            if (next != null) {
                                return i;
                            }
                        }
                    }
                }
                i++;
            }
        }
        return -1;
    }

    public final boolean zQ2(Playbook playbook) {
        ActivePlaybook value;
        Playbook playbook2;
        if (playbook == null || (value = this.LLILLJJLI.getValue()) == null || (playbook2 = value.playbook) == null || playbook.playbookId != playbook2.playbookId) {
            return false;
        }
        return true;
    }

    public static int EQ2(C20361214lm c20361214lm, C20379114of c20379114of) {
        List<C20359414lU> list;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C20361214lm next = it3.next();
                        if (C20362314lx.LIZ(next, c20361214lm)) {
                            if (next != null) {
                                return i;
                            }
                        }
                    }
                }
                i++;
            }
            return -1;
        }
        return -1;
    }

    public final void AQ2(Playbook playbook, boolean z) {
        AbstractC20384214pU abstractC20384214pUWQ2 = wQ2();
        String strLIZ = C01EI.LIZ(0, abstractC20384214pUWQ2.LJIJJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markDetailDialogDismiss, playbookId=");
        sbLIZ.append(playbook.playbookId);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20377014oK c20377014oK = abstractC20384214pUWQ2.LJ.get(PlaybookUtilKt.LIZIZ(playbook));
        if (c20377014oK != null) {
            c20377014oK.LJFF(false, z);
        }
        abstractC20384214pUWQ2.LJIIJ(null);
    }

    public final void BQ2(Playbook playbook, int i, InterfaceC170900l9<C470590Icr<PlaybookReviewResponse.ResponseData>> interfaceC170900l9) {
        long j;
        AbstractC20384214pU abstractC20384214pUWQ2 = wQ2();
        PlaybookReviewParams playbookReviewParams = new PlaybookReviewParams();
        playbookReviewParams.playbookId = playbook.playbookId;
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            j = playbookContent.playbookContentId;
        } else {
            j = 0;
        }
        playbookReviewParams.playbookContentId = j;
        playbookReviewParams.reviewScene = i;
        abstractC20384214pUWQ2.getClass();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).review(playbookReviewParams), abstractC20384214pUWQ2.LJIJJ(), "review").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C516201zk(abstractC20384214pUWQ2, 226))).LJFF(new C0UO0()), vQ2(), new C515801zg(this, interfaceC170900l9, 11), new C515801zg(this, interfaceC170900l9, 12), 24);
    }
}
