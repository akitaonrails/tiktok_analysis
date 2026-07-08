package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20397314rb extends C09AY implements Function0<C951190arN> {
    public final /* synthetic */ C20398214rk LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20397314rb(View view, C20398214rk c20398214rk) {
        super(0);
        this.LL = c20398214rk;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14rC] */
    @Override // kotlin.jvm.functions.Function0
    public final C951190arN invoke() {
        final C951190arN c951190arN = new C951190arN();
        final C20398214rk c20398214rk = this.LL;
        final View view = this.LLILLJJLI;
        final ?? r1 = new InterfaceC20412914u7() { // from class: X.14rC
            @Override // X.InterfaceC20412914u7
            public final long LIZJ() {
                MutableLiveData<Long> mutableLiveData;
                Long value;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLJJ) == null || (value = mutableLiveData.getValue()) == null) {
                    return 0L;
                }
                return value.longValue();
            }

            @Override // X.InterfaceC20412914u7
            public final long LLJJ() {
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (playbook = value.playbook) == null) {
                    return 0L;
                }
                return playbook.playbookId;
            }

            @Override // X.InterfaceC20412914u7
            public final void LIZ(Playbook playbook, boolean z) {
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                long j;
                boolean z2;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook2;
                C20398214rk c20398214rk2 = c20398214rk;
                C978410bZH c978410bZH = new C978410bZH("favorite", "favorite", 1);
                Iterator<?> it2 = c20398214rk2.N5().LL.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if ((next instanceof C1868360yig) && ((C1868360yig) next).LIZ.playbookId == playbook.playbookId) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (z) {
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    DataChannel dataChannel = c20398214rk2.LLILLJJLI;
                    if (i < 0) {
                        i = 0;
                    }
                    int i2 = i + 1;
                    PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk2.LL;
                    if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C978360bZC.LJIILL(dataChannel, "click", playbook, "favorite", i2, z2, true, null, Integer.valueOf(C20385714pj.LIZ(c20398214rk2.LL)), 0, null, null, 3712);
                }
                C978360bZC.LJJIIZ(playbook.playbookId, c978410bZH);
                DataChannel dataChannel2 = c20398214rk2.LLILLJJLI;
                if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
                    long j2 = playbook.playbookId;
                    PlaybookContent playbookContent = playbook.content;
                    if (playbookContent != null) {
                        j = playbookContent.playbookContentId;
                    } else {
                        j = 0;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJIFFI(new C20382814pG(j2, j, playbook.isUpdatedVersion, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2056), "favoritesList", C978360bZC.LIZJ, C20394214r6.LIZ(c20398214rk2.LL), false);
                }
            }

            @Override // X.InterfaceC20412914u7
            public final void LIZIZ(Playbook playbook, C20412114tz c20412114tz) {
                long j;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value;
                Playbook playbook2;
                PlaybookAnchorViewModel playbookAnchorViewModel = c20398214rk.LL;
                if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook2 = value.playbook) != null) {
                    j = playbook2.playbookId;
                } else {
                    j = 0;
                }
                if (view.getContext() != null) {
                    C20398214rk c20398214rk2 = c20398214rk;
                    View view2 = view;
                    C951190arN c951190arN2 = c951190arN;
                    C20394714rB c20394714rB = C20394714rB.LIZ;
                    DataChannel dataChannel = c20398214rk2.LLILLJJLI;
                    Context context = view2.getContext();
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = c20398214rk2.LL;
                    C951190arN c951190arNN5 = c20398214rk2.N5();
                    PlaybookAnchorViewModel playbookAnchorViewModel3 = c20398214rk2.LL;
                    c20394714rB.getClass();
                    C20406514t5 c20406514t5LIZJ = C20394714rB.LIZJ(playbook, c951190arNN5, playbookAnchorViewModel3);
                    C20395214rG c20395214rG = new C20395214rG(c20398214rk2, c20412114tz, c951190arN2, j);
                    c20394714rB.getClass();
                    C20394714rB.LJ(dataChannel, context, playbook, playbookAnchorViewModel2, c20406514t5LIZJ, null, null, c20395214rG);
                }
            }
        };
        final DataChannel dataChannel = c20398214rk.LLILLJJLI;
        c951190arN.LLLI(C1868360yig.class, new AbstractC960460b6K<C1868360yig, C20412014ty>(r1, dataChannel) { // from class: X.14s9
            public final InterfaceC20412914u7 LIZIZ;
            public final DataChannel LIZJ;

            {
                this.LIZIZ = r1;
                this.LIZJ = dataChannel;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20412014ty(C786410Ut5.Td(layoutInflater, R.layout.h_b, viewGroup, false), this.LIZIZ, this.LIZJ);
            }
        });
        return c951190arN;
    }
}
