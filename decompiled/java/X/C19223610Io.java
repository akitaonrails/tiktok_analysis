package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19223610Io extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<? extends C19223110Ij> LL;
    public final C193M LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final boolean LLILZ;
    public final VideoPublishEditModel LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public static int LLLII() {
        if (C10BZ.LIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        return 0;
    }

    public static Integer LLLI(Context context) {
        if (C10BZ.LIZ()) {
            return C1308910kAL.LIZJ(R.attr.a1b, context);
        }
        if (C291370BbT.LIZ()) {
            return C1308910kAL.LIZJ(R.attr.a1e, context);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int i2 = ((C19223110Ij) ListProtector.get(this.LL, i)).LIZ;
        if (i2 == 1003) {
            C19223110Ij c19223110Ij = (C19223110Ij) ListProtector.get(this.LL, i);
            Pair<Class<Object>, Class<Object>> pair = c19223110Ij.LJIIJJI;
            if (pair != null) {
                Class<Object> first = pair.getFirst();
                Class<Object> second = pair.getSecond();
                C193M c193m = this.LLILLJJLI;
                if (c193m != null) {
                    return c193m.IN(first, second, c19223110Ij.LJIILJJIL);
                }
                return i2;
            }
            throw new IllegalArgumentException("alsDataType is null");
        }
        return i2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C193M c193m;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof AbstractC1738640vLS) && (c193m = this.LLILLJJLI) != null) {
            c193m.JF1((AbstractC1738640vLS) viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C193M c193m;
        super.onViewRecycled(viewHolder);
        if ((viewHolder instanceof AbstractC1738640vLS) && (c193m = this.LLILLJJLI) != null) {
            c193m.M42((AbstractC1738640vLS) viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C19223810Iq)) {
            if (viewHolder instanceof AbstractC1738640vLS) {
                C19223110Ij c19223110Ij = (C19223110Ij) ListProtector.get(this.LL, i);
                Pair<? extends C1664690tQB<Object>, ? extends Object> pair = c19223110Ij.LJIIL;
                C193M c193m = this.LLILLJJLI;
                if (c193m != null) {
                    c193m.q61(this.LLILLL, c19223110Ij.LJIILIIL, (AbstractC1738640vLS) viewHolder, pair.getFirst(), pair.getSecond());
                }
                if (this.LLILZ) {
                    AbstractC1738640vLS abstractC1738640vLS = (AbstractC1738640vLS) viewHolder;
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "post_process_ui_optimize", true) != 1 && (abstractC1738640vLS instanceof AbstractC214739192b)) {
                        ((AbstractC214739192b) abstractC1738640vLS).LL.setIcon((C419910GdJ) null);
                    }
                    boolean z = c19223110Ij.LJIIZILJ;
                    boolean z2 = c19223110Ij.LJIJ;
                    Integer num = c19223110Ij.LJIILLIIL;
                    boolean z3 = abstractC1738640vLS instanceof InterfaceC1738650vLT;
                    if (abstractC1738640vLS instanceof AbstractC214739192b) {
                        ((AbstractC214739192b) abstractC1738640vLS).LL.LJ(z, z2);
                        return;
                    }
                    View view = abstractC1738640vLS.itemView;
                    boolean z4 = !z3;
                    C384050F3z c384050F3z = new C384050F3z();
                    if (num != null) {
                        c384050F3z.LIZ = C1308910kAL.LIZJ(num.intValue(), view.getContext());
                    }
                    if (z) {
                        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(18));
                        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(18));
                    }
                    if (z2) {
                        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(18));
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(view.getContext())});
                    layerDrawable.setLayerInset(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
                    view.setBackground(layerDrawable);
                    if (!z4) {
                        return;
                    }
                    C426750GoL.LJIIL(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
                    return;
                }
                return;
            }
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLFZ;
        if (i != 1001) {
            if (i != 1004) {
                if (i != 1005) {
                    if (i >= 100000) {
                        C193M c193m = this.LLILLJJLI;
                        if (c193m == null || (viewHolderLLLFZ = c193m.ke1(i, viewGroup)) == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Not support viewType=");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d9t, viewGroup, false);
                        Integer numLLLI = LLLI(viewGroup.getContext());
                        if (numLLLI != null) {
                            int iIntValue = numLLLI.intValue();
                            viewTd.setBackgroundColor(iIntValue);
                            View viewFindViewById = viewTd.findViewById(R.id.olb);
                            if (viewFindViewById != null) {
                                viewFindViewById.setBackgroundColor(iIntValue);
                            }
                            C426750GoL.LJIIL(viewTd, Integer.valueOf(LLLII()), null, Integer.valueOf(LLLII()), null, 26);
                        }
                        viewHolderLLLFZ = new C19223810Iq(viewTd);
                    }
                } else {
                    viewHolderLLLFZ = LLLFZ(viewGroup, viewGroup.getContext().getString(2131844989), false);
                }
            } else {
                viewHolderLLLFZ = LLLFZ(viewGroup, C10BV.LIZ(viewGroup.getContext(), this.LLILZIL), true);
            }
        } else {
            viewHolderLLLFZ = LLLFZ(viewGroup, viewGroup.getContext().getString(2131848271), true);
        }
        try {
            View view = viewHolderLLLFZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLLLFZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLFZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLFZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLFZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLFZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLFZ.getClass().getName();
        return viewHolderLLLFZ;
    }

    public static C19223810Iq LLLFZ(ViewGroup viewGroup, CharSequence charSequence, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d9u, viewGroup, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.y3n);
        textView.setText(charSequence);
        if (!z) {
            if ((viewTd instanceof ViewGroup) && (layoutParams = viewTd.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            }
            C426750GoL.LJIIIZ(textView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))), null, null, false, 29);
        }
        C426750GoL.LJIIL(viewTd, Integer.valueOf(LLLII()), null, Integer.valueOf(LLLII()), null, 26);
        Integer numLLLI = LLLI(viewGroup.getContext());
        if (numLLLI != null) {
            viewTd.setBackgroundColor(numLLLI.intValue());
        }
        return new C19223810Iq(viewTd);
    }

    public C19223610Io(List list, C193M c193m, LifecycleOwner lifecycleOwner, boolean z, VideoPublishEditModel videoPublishEditModel) {
        this.LL = list;
        this.LLILLJJLI = c193m;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = z;
        this.LLILZIL = videoPublishEditModel;
    }
}
