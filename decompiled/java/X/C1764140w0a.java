package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764140w0a extends AbstractC2172971A2l<C04G1, AbstractC1764160w0c<?>> {
    public final RecyclerView LLILLJJLI;
    public final InterfaceC665370Q7z LLILLL;
    public final Fragment LLILZ;
    public int LLILZIL;
    public final SparseArray<WeakReference<AbstractC1764160w0c<?>>> LLILZLL;
    public final PdpTriggerService LLIZ;
    public final Map<String, C1764170w0d> LLIZLLLIL;
    public EnumC1764120w0Y LLJ;

    @Override // X.AbstractC2172971A2l, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.LJFF.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            X.1A2m<T> r0 = r4.LL
            java.util.List<T> r0 = r0.LJFF
            java.lang.Object r3 = X.C13LP.LJJJLZIJ(r5, r0)
            X.04G1 r3 = (X.C04G1) r3
            r2 = 1
            if (r3 == 0) goto L24
            X.04FY r0 = r3.LJIJJLI
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "Myna"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != r2) goto L1d
            r2 = 3
        L1c:
            return r2
        L1d:
            X.04FY r0 = r3.LJIJJLI
            if (r0 == 0) goto L24
            java.lang.String r1 = r0.LIZ
            goto L25
        L24:
            r1 = 0
        L25:
            java.lang.String r0 = "image_style"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "size_guide_style"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "video_style"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3f
            r2 = 2
            return r2
        L3f:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764140w0a.getItemViewType(int):int");
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC1764160w0c abstractC1764160w0c = (AbstractC1764160w0c) viewHolder;
        this.LLILZLL.put(abstractC1764160w0c.getBindingAdapterPosition(), new WeakReference<>(abstractC1764160w0c));
        if (this.LLILZIL == abstractC1764160w0c.getBindingAdapterPosition() && this.LLILZIL != -1) {
            abstractC1764160w0c.LLJLL(abstractC1764160w0c.getBindingAdapterPosition(), this.LLJ);
        }
        super.onViewAttachedToWindow(abstractC1764160w0c);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.LLILZLL.remove(viewHolder.getBindingAdapterPosition());
        super.onViewDetachedFromWindow(viewHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9 A[Catch: all -> 0x00b0, CancellationException -> 0x0107, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0107, all -> 0x00b0, blocks: (B:34:0x0076, B:36:0x0082, B:38:0x008e, B:40:0x0093, B:42:0x009b, B:44:0x00a9), top: B:66:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764140w0a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        final AbstractC1764160w0c c1764050w0R;
        final InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        Fragment fragment = this.LLILZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c1764050w0R = new AbstractC1764160w0c<C1765000w1y>(viewGroup, interfaceC665370Q7z) { // from class: X.0w1H
                        @Override // X.AbstractC1764160w0c
                        public final /* bridge */ /* synthetic */ void T5(C1765000w1y c1765000w1y) {
                        }

                        {
                            super(new AbstractC1764180w0e(viewGroup.getContext()) { // from class: X.0w17
                                @Override // X.AbstractC1764180w0e
                                public final View LIZ(Context context) {
                                    SmartImageView smartImageView = new SmartImageView(context);
                                    smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                                    C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
                                    return smartImageView;
                                }
                            }, interfaceC665370Q7z);
                        }
                    };
                } else {
                    c1764050w0R = new C1764210w0h(viewGroup, interfaceC665370Q7z);
                }
            } else {
                c1764050w0R = new C1764200w0g(viewGroup, interfaceC665370Q7z, fragment);
            }
        } else {
            c1764050w0R = new C1764050w0R(viewGroup, interfaceC665370Q7z);
        }
        c1764050w0R.LLJJI = c1764050w0R.L5();
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0w0U
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:185:0x0485 A[PHI: r12
              0x0485: PHI (r12v7 boolean) = (r12v6 boolean), (r12v9 boolean), (r12v9 boolean), (r12v9 boolean) binds: [B:184:0x0484, B:180:0x0474, B:182:0x0478, B:175:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:190:0x04e2  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x0522  */
            /* JADX WARN: Removed duplicated region for block: B:215:0x052a  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x0542  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0544  */
            /* JADX WARN: Removed duplicated region for block: B:219:0x0547  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x04e7 A[SYNTHETIC] */
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r73) {
                /*
                    Method dump skipped, instruction units count: 1508
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1764080w0U.LIZ(android.view.View):void");
            }
        }, c1764050w0R.LL);
        c1764050w0R.onCreate();
        try {
            View view = c1764050w0R.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1764050w0R.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1764050w0R.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1764050w0R.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1764050w0R.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1764050w0R.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1764050w0R.getClass().getName();
        return c1764050w0R;
    }

    public C1764140w0a(RecyclerView recyclerView, InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment) {
        super(new AbstractC339510DSr<C04G1>() { // from class: X.0w1F
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C04G1 c04g1, C04G1 c04g12) {
                return Intrinsics.LJFF(c04g1, c04g12);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C04G1 c04g1, C04G1 c04g12) {
                C04G1 c04g13 = c04g1;
                C04G1 c04g14 = c04g12;
                if (Intrinsics.LJFF(c04g13.LJIJJLI.LIZLLL, c04g14.LJIJJLI.LIZLLL) && Intrinsics.LJFF(c04g13.LJIILIIL, c04g14.LJIILIIL)) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = recyclerView;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = fragment;
        this.LLILZIL = -1;
        this.LLILZLL = new SparseArray<>();
        this.LLIZ = new PdpTriggerService(new C1275304yt(false), fragment.getLifecycle());
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = EnumC1764120w0Y.NONE;
    }
}
