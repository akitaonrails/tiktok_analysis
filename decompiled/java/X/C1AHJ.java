package X;

import Y.ACListenerS135S0200000_33;
import android.content.Context;
import android.graphics.Rect;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.realtime.FixFlashCardUiPaddingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHJ extends C1AHE {
    public final AbstractC21673619ry LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final LiveIconView LLILZLL;
    public final ViewGroup LLIZ;
    public C11JF LLIZLLLIL;
    public C11JF LLJ;
    public final Map<C1AHM, String> LLJI;
    public ImageSpan LLJIJIL;

    public static int T5(int i) {
        switch (i) {
            case 1:
            case 4:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return 0;
        }
    }

    public final void R5() {
        IHostAction iHostAction;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LL.getDataChannel());
        Long lValueOf = roomLJJLIIIIJ != null ? Long.valueOf(roomLJJLIIIIJ.getId()) : null;
        Context context = this.LL.getContext();
        if (lValueOf == null || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null) {
            return;
        }
        iHostAction.openPromotePage(lValueOf.toString(), context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.0xBf, X.19ry] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.0xBf, X.19ry] */
    @Override // X.C1AHE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(int r15) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AHJ.P5(int):void");
    }

    public C1AHJ(View view, C1AHD c1ahd) {
        Long lValueOf;
        IHostAction iHostAction;
        super(view, c1ahd);
        this.LLJI = C2097608Jq.LJIIIIZZ(new Pair(C1AHM.TRAFFIC, "not_enough_traffic"), new Pair(C1AHM.PRIVATE, "special_account"), new Pair(C1AHM.REUSE, "boosting_or_boosted"), new Pair(C1AHM.RISK, "tns"), new Pair(C1AHM.GATED, "special_account"), new Pair(C1AHM.UNKNOWN, "unknown"));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.se0);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ibl);
        this.LLIZ = viewGroup;
        N5();
        LiveCenterStructureOpt liveCenterStructureOpt = LiveCenterStructureOpt.INSTANCE;
        if (liveCenterStructureOpt.isEnable()) {
            this.LLILLL = (C16F5) view.findViewById(R.id.dey);
            if (viewGroup != null) {
                C500260Jjc.LJIILIIL(viewGroup);
            }
        } else {
            this.LLILLL = (C16F5) view.findViewById(R.id.sdu);
            C16F5 c16f5 = (C16F5) view.findViewById(R.id.sds);
            this.LLILZ = c16f5;
            this.LLILZIL = (C16F5) view.findViewById(R.id.c94);
            this.LLILZLL = (LiveIconView) view.findViewById(R.id.sdt);
            if (c16f5 != null) {
                c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        c1ahd.LJ(new AwS612S0100000_33(c1ahd, 198));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 3);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LL.getDataChannel());
        if (roomLJJLIIIIJ != null) {
            lValueOf = Long.valueOf(roomLJJLIIIIJ.getId());
        } else {
            lValueOf = null;
        }
        Context context = this.LL.getContext();
        if (lValueOf != null && (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) != null) {
            iHostAction.preloadPromoteModule(lValueOf.toString(), context);
        }
        LiveIconView liveIconView = this.LLILZLL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS135S0200000_33(c1ahd, this, 13));
        }
        if (recyclerView != null) {
            if (liveCenterStructureOpt.isEnable()) {
                recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
                C1809430xBd c1809430xBd = new C1809430xBd(new AwS612S0100000_33(this, 199));
                this.LLILLJJLI = c1809430xBd;
                recyclerView.setAdapter(c1809430xBd);
            } else {
                recyclerView.setLayoutManager(gridLayoutManager);
                C1809460xBg c1809460xBg = new C1809460xBg(new AwS612S0100000_33(this, 200));
                this.LLILLJJLI = c1809460xBg;
                recyclerView.setAdapter(c1809460xBg);
            }
            if (FixFlashCardUiPaddingSetting.INSTANCE.enable()) {
                final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                recyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DXJ
                    public final int LL;

                    {
                        this.LL = iLIZIZ;
                    }

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                        GridLayoutManager gridLayoutManager2;
                        int i;
                        int childAdapterPosition;
                        RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null && (i = gridLayoutManager2.LLILLJJLI) > 0 && (childAdapterPosition = recyclerView2.getChildAdapterPosition(view2)) >= 0 && childAdapterPosition % i < i - 1) {
                            rect.right = this.LL;
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(final X.C1AHK r13, android.graphics.drawable.Drawable r14) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AHJ.S5(X.1AHK, android.graphics.drawable.Drawable):void");
    }
}
