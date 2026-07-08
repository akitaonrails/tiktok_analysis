package X;

import Y.ACListenerS129S0200000_27;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS80S0301000_28;

/* JADX INFO: renamed from: X.0zcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903040zcc implements InterfaceC1903260zcy {
    public final /* synthetic */ MultiViewModel LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC1903260zcy
    public final void LIZ() {
    }

    @Override // X.InterfaceC1903260zcy
    public final InterfaceC1903320zd4 LIZJ() {
        C1902740zc8 c1902740zc8 = C1902740zc8.LIZ;
        final MultiViewModel multiViewModel = this.LIZ;
        c1902740zc8.getClass();
        return new InterfaceC1903320zd4() { // from class: X.0zcg
            @Override // X.InterfaceC1903320zd4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1903320zd4
            public final void LIZ(InboxEntrancePod inboxEntrancePod) {
                String str;
                boolean zLIZLLL = inboxEntrancePod.LIZLLL();
                MultiViewModel multiViewModel2 = multiViewModel;
                if (zLIZLLL) {
                    str = "unarchive";
                } else {
                    str = "archive";
                }
                multiViewModel2.SQ2("click", str, inboxEntrancePod, null);
            }
        };
    }

    @Override // X.InterfaceC1903260zcy
    public final void LJ(int i) {
        C1902740zc8 c1902740zc8 = C1902740zc8.LIZ;
        View view = this.LIZIZ;
        c1902740zc8.getClass();
        C1902740zc8.LIZ(i, view);
    }

    public C1903040zcc(View view, MultiViewModel multiViewModel) {
        this.LIZ = multiViewModel;
        this.LIZIZ = view;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0mGz] */
    @Override // X.InterfaceC1903260zcy
    public final void LIZLLL(int i, InboxEntrancePod inboxEntrancePod) {
        Activity activityLIZ;
        int i2;
        int iIntValue;
        LJFF(i, inboxEntrancePod);
        Context context = this.LIZIZ.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            View view = this.LIZIZ;
            MultiViewModel multiViewModel = this.LIZ;
            C1902740zc8 c1902740zc8 = C1902740zc8.LIZ;
            Resources resources = view.getContext().getResources();
            if (i == 7) {
                i2 = 2131830287;
            } else {
                i2 = 2131830280;
            }
            String string = resources.getString(i2);
            AwS80S0301000_28 awS80S0301000_28 = new AwS80S0301000_28(i, multiViewModel, inboxEntrancePod, this, 1);
            c1902740zc8.getClass();
            C259800zU c259800zU = new C259800zU();
            TuxTextView tuxTextView = new TuxTextView(activityLIZ, null, 6, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, new C1361400lX0(activityLIZ, R.style.y0));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView.setTextColor(iIntValue);
            tuxTextView.setText(2131845371);
            tuxTextView.setTuxFont(42);
            C786410Ut5.h9(tuxTextView, new ACListenerS129S0200000_27(awS80S0301000_28, c259800zU, 38));
            ?? c1389910mGz = new C1389910mGz(activityLIZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJIIJ(string);
            c1389910mGz.LIZ.LIZLLL = 3;
            c1389910mGz.LIZ.LJ = new AwS595S0100000_16(tuxTextView, 325);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activityLIZ));
            c1389910mGz.LIZLLL(new AwS571S0100000_27(c259800zU, (C259800zU<C1389910mGz>) 1293));
            c259800zU.element = c1389910mGz;
            c1389910mGz.LJIIJJI();
        }
    }

    public final void LJFF(int i, InboxEntrancePod inboxEntrancePod) {
        int i2;
        int i3 = 1;
        if (i == 7) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        MultiViewModel multiViewModel = this.LIZ;
        C1902740zc8.LIZ.getClass();
        InboxEntranceCell inboxEntranceCellLIZJ = C1902740zc8.LIZJ(i2, inboxEntrancePod);
        CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = multiViewModel.LLJL;
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        InboxEntrancePod inboxEntrancePodBQ2 = multiViewModel.BQ2(inboxEntranceCell.cellId, inboxEntranceCell.entranceKey);
        if (inboxEntrancePodBQ2 != null) {
            copyOnWriteArrayList.remove(inboxEntrancePodBQ2);
        }
        multiViewModel.OQ2(inboxEntrancePod.entranceCell, inboxEntranceCellLIZJ, true);
        MultiViewModel multiViewModel2 = this.LIZ;
        multiViewModel2.getClass();
        C2252408s6.LJII(new AwS429S0200000_28(multiViewModel2, inboxEntrancePod, 128));
        C1904220zeW c1904220zeW = C1904220zeW.LL;
        InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod.entranceCell;
        EntranceKey entranceKey = new EntranceKey(inboxEntranceCell2.cellId, inboxEntranceCell2.entranceKey);
        if (i != 7) {
            i3 = 0;
        }
        c1904220zeW.getClass();
        C1904220zeW.LJJII(entranceKey, i3);
    }

    @Override // X.InterfaceC1903260zcy
    public final void LIZIZ(InboxEntranceCell inboxEntranceCell, int i, Function0<Unit> function0, Function0<Unit> function02) {
        C1902740zc8.LIZ.getClass();
        C1902740zc8.LIZIZ(inboxEntranceCell, i, function0, function02);
    }
}
