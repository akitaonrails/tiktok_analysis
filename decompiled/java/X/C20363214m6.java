package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibility;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363214m6 extends AbstractC20368114mt {
    public final PlaybookAnchorViewModel LLILLJJLI;
    public final DataChannel LLILLL;
    public final View LLILZ;
    public final C16F5 LLILZIL;
    public final LinearLayout LLILZLL;
    public final LiveIconView LLIZ;
    public final C16F5 LLIZLLLIL;
    public final C16F5 LLJ;
    public final C16F5 LLJI;
    public final LinearLayout LLJIJIL;
    public final Set<Long> LLJILJIL;
    public boolean LLJILJILJ;
    public final C20363414m8 LLJILLL;
    public final C20363614mA LLJJ;
    public final C20363514m9 LLJJI;

    @Override // X.AbstractC20368114mt
    public final void LIZ() {
        this.LLJILJILJ = true;
        LIZLLL(this.LLILLJJLI.LLILZ.getValue());
        LIZIZ();
    }

    public final void LIZIZ() {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20361214lm c20361214lm;
        Playbook playbook;
        int iLQ2 = this.LLILLJJLI.LQ2();
        C20379114of value = this.LLILLJJLI.LLILZ.getValue();
        if (value == null || (c20360614lg = value.LIZIZ) == null || (list = c20360614lg.LIZIZ) == null || iLQ2 < 0 || iLQ2 >= list.size() || (c20361214lm = (C20361214lm) C13LP.LJJJLL(((C20359414lU) ListProtector.get(list, iLQ2)).LIZJ)) == null || this.LLJILJIL.contains(Long.valueOf(c20361214lm.LIZIZ))) {
            return;
        }
        this.LLJILJIL.add(Long.valueOf(c20361214lm.LIZIZ));
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        DataChannel dataChannel = this.LLILLL;
        String str = c20361214lm.LIZ;
        int iDQ2 = this.LLILLJJLI.DQ2(c20361214lm) + 1;
        C20379114of value2 = this.LLILLJJLI.LLILLL.getValue();
        long j = (value2 == null || (playbook = value2.LIZ) == null) ? 0L : playbook.playbookId;
        boolean zYQ2 = this.LLILLJJLI.yQ2();
        C20379114of value3 = this.LLILLJJLI.LLILLL.getValue();
        C978360bZC.LJIILJJIL(dataChannel, "show", str, iDQ2, j, zYQ2, null, value3 != null ? value3.LIZ : null, c20361214lm.LIZLLL, false, 1600);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            this.LLILLJJLI.LLILZ.observe(lifecycleOwner, this.LLJJ);
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.BQ2(lifecycleOwner, LiveCenterVisibility.class, this.LLJJI);
            }
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
        playbookAnchorViewModel.LLJJJJJIL.LJJIII.add(this.LLJILLL);
        LIZLLL(this.LLILLJJLI.LLILZ.getValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            this.LLILLJJLI.LLILZ.removeObserver(this.LLJJ);
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.GQ2(lifecycleOwner, LiveCenterVisibility.class, this.LLJJI);
            }
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLJJLI;
        playbookAnchorViewModel.LLJJJJJIL.LJJIII.remove(this.LLJILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C20379114of r18) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20363214m6.LIZLLL(X.14of):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.14m8] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.14mA] */
    public C20363214m6(Context context, PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel) {
        super(context, null, 0);
        this.LLILLJJLI = playbookAnchorViewModel;
        this.LLILLL = dataChannel;
        this.LLJILJIL = new LinkedHashSet();
        this.LLJILLL = new InterfaceC20365114mP() { // from class: X.14m8
            @Override // X.InterfaceC20365114mP
            public final void LIZ() {
                C20363214m6 c20363214m6 = this.LIZ;
                c20363214m6.LIZLLL(c20363214m6.LLILLJJLI.LLILZ.getValue());
            }
        };
        this.LLJJ = new Observer() { // from class: X.14mA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.LIZLLL((C20379114of) obj);
            }
        };
        this.LLJJI = new C20363514m9(this);
        C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(context)), R.layout.dwo, this, true);
        this.LLILZ = findViewById(R.id.qs9);
        this.LLILZIL = (C16F5) findViewById(R.id.qsa);
        this.LLILZLL = (LinearLayout) findViewById(R.id.qsg);
        this.LLIZ = (LiveIconView) findViewById(R.id.qsf);
        this.LLIZLLLIL = (C16F5) findViewById(R.id.qsh);
        this.LLJ = (C16F5) findViewById(R.id.qse);
        this.LLJI = (C16F5) findViewById(R.id.qsd);
        this.LLJIJIL = (LinearLayout) findViewById(R.id.qsb);
    }

    public static void LIZJ(final C16F5 c16f5, CharSequence charSequence, final int i, final int i2) {
        if (TextUtils.equals(c16f5.getText(), charSequence)) {
            return;
        }
        C21382118m3.LIZJ(c16f5, 0);
        c16f5.setTextSize(2, i);
        c16f5.setText(charSequence);
        HandlerHook.viewPost(c16f5, new Runnable() { // from class: X.0T8E
            public final /* synthetic */ int LLILLL = 14;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PlaybookLiveCenterStepsViewImplV2@81de.setTextWithAutoSizeReset$1");
                try {
                    if (c16f5.getLineCount() >= i2) {
                        C21382118m3.LIZIZ(c16f5, this.LLILLL, i, 1, 2);
                        final C16F5 c16f52 = c16f5;
                        HandlerHook.viewPost(c16f52, new Runnable() { // from class: X.0T8D
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                C1C7U.LIZ("PlaybookLiveCenterStepsViewImplV2@81de.setTextWithAutoSizeReset$1$1");
                                try {
                                    c16f52.requestLayout();
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("PlaybookLiveCenterStepsViewImplV2@81de.setTextWithAutoSizeReset$1$1");
                            }
                        });
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PlaybookLiveCenterStepsViewImplV2@81de.setTextWithAutoSizeReset$1");
            }
        });
    }
}
