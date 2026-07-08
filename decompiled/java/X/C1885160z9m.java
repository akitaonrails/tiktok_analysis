package X;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0z9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885160z9m extends AbstractC21673619ry<C1885170z9n> {
    public C1885170z9n LLILLJJLI;
    public final /* synthetic */ GameLiveCard LLILZ;
    public final C1885440zAE LL = new Object() { // from class: X.0zAE
    };
    public final Set<WeakReference<InterfaceC1885180z9o>> LLILLL = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ.LLJJJ).size() + (!C1883500z76.LIZIZ(this.LLILZ) ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zAE] */
    public C1885160z9m(GameLiveCard gameLiveCard) {
        this.LLILZ = gameLiveCard;
    }

    public static final void LLLFZ(TextView textView) {
        if (C497740JfY.LJJ()) {
            if (textView != null) {
                textView.setGravity(5);
                if (textView != null) {
                    textView.setLayoutDirection(1);
                    textView.setTextDirection(1);
                    return;
                }
                return;
            }
            return;
        }
        if (textView == null) {
            return;
        }
        textView.setGravity(3);
        if (textView == null) {
            return;
        }
        textView.setLayoutDirection(0);
        textView.setTextDirection(0);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= ((ArrayList) this.LLILZ.LLJJJ).size()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C1885170z9n c1885170z9n = (C1885170z9n) viewHolder;
        InterfaceC1885180z9o interfaceC1885180z9oI5 = c1885170z9n.I5();
        if (interfaceC1885180z9oI5 != null) {
            interfaceC1885180z9oI5.LIZIZ();
        }
        super.onViewRecycled(c1885170z9n);
    }

    public static final void LLLI(TuxIconView tuxIconView, boolean z) {
        int i;
        if (tuxIconView == null) {
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_speaker_x_mark_ltr;
        } else {
            i = R.raw.icon_speaker_2_ltr;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.exp);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, final int r13) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1885160z9m.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:4)(1:18)|5|(3:7|(1:9)|10)(13:(1:17)|12|(1:14)|15|41|19|(1:21)|24|43|25|(3:39|27|(3:29|32|(1:34)))|37|38)|11|12|(0)|15|41|19|(0)|24|43|25|(0)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:19:0x0045, B:21:0x0049), top: B:41:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r7, int r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1885160z9m.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
