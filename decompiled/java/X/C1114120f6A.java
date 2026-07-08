package X;

import Y.ALAdapterS2S0400000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.FeedbackAnimChannel;
import com.bytedance.android.live.FeedbackMessageChannel;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenSelfCommentUpdateOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimatorWithLayerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS104S0110000_17;
import kotlin.jvm.internal.AwS51S0100100_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114120f6A extends AbstractC21674919sB {
    public final Runnable LLIZLLLIL;
    public final Runnable LLJ;
    public final TimeInterpolator LLJI = new AccelerateDecelerateInterpolator();
    public final ArrayList<RecyclerView.ViewHolder> LLJIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJILJIL = new ArrayList<>();
    public final ArrayList<C1114160f6E> LLJILJILJ = new ArrayList<>();
    public final ArrayList<C1114140f6C> LLJILLL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LLJJ = new ArrayList<>();
    public final ArrayList<ArrayList<C1114160f6E>> LLJJI = new ArrayList<>();
    public final ArrayList<ArrayList<C1114140f6C>> LLJJIII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJIJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LLJJJ = new ArrayList<>();
    public Function0<Unit> LLJJJIL = AFwS205S0000000_17.get$arr$(396);
    public final Map<String, String> LLJJJJ = new LinkedHashMap();
    public String LLJJJJJIL = "none";
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    @Override // X.AbstractC21673719rz
    public final void LJIIL() {
        for (int size = this.LLJILJILJ.size() - 1; -1 < size; size--) {
            C1114160f6E c1114160f6E = (C1114160f6E) ListProtector.get(this.LLJILJILJ, size);
            View view = c1114160f6E.LIZ.itemView;
            C786410Ut5.ed(view, 0.0f);
            if (this.LLJJJJLIIL) {
                C786410Ut5.T4(view, 1.0f);
            }
            C786410Ut5.Jc(view, 0.0f);
            LJIIIZ(c1114160f6E.LIZ);
            ListProtector.remove(this.LLJILJILJ, size);
        }
        for (int size2 = this.LLJIJIL.size() - 1; -1 < size2; size2--) {
            LJIIIZ((RecyclerView.ViewHolder) ListProtector.get(this.LLJIJIL, size2));
            ListProtector.remove(this.LLJIJIL, size2);
        }
        for (int size3 = this.LLJILJIL.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJILJIL, size3);
            C786410Ut5.ed(viewHolder.itemView, 0.0f);
            if (this.LLJJJJLIIL) {
                C786410Ut5.T4(viewHolder.itemView, 1.0f);
            }
            LJJIIJ(viewHolder);
            ListProtector.remove(this.LLJILJIL, size3);
        }
        for (int size4 = this.LLJILLL.size() - 1; -1 < size4; size4--) {
            C1114140f6C c1114140f6C = (C1114140f6C) ListProtector.get(this.LLJILLL, size4);
            RecyclerView.ViewHolder viewHolder2 = c1114140f6C.LIZ;
            if (viewHolder2 != null) {
                LJJIJIIJI(c1114140f6C, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c1114140f6C.LIZIZ;
            if (viewHolder3 != null) {
                LJJIJIIJI(c1114140f6C, viewHolder3);
            }
        }
        this.LLJILLL.clear();
        if (LJIIZILJ()) {
            for (int size5 = this.LLJJI.size() - 1; -1 < size5; size5--) {
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJI, size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    C1114160f6E c1114160f6E2 = (C1114160f6E) ListProtector.get(arrayList, size6);
                    View view2 = c1114160f6E2.LIZ.itemView;
                    C786410Ut5.ed(view2, 0.0f);
                    if (this.LLJJJJLIIL) {
                        C786410Ut5.T4(view2, 1.0f);
                    }
                    C786410Ut5.Jc(view2, 0.0f);
                    LJIIIZ(c1114160f6E2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LLJJI.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.LLJJ.size() - 1; -1 < size7; size7--) {
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJJ, size7);
                for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    View view3 = viewHolder4.itemView;
                    C786410Ut5.ed(view3, 0.0f);
                    if (this.LLJJJJLIIL) {
                        C786410Ut5.T4(view3, 1.0f);
                    }
                    LJJIIJ(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LLJJ.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.LLJJIII.size() - 1; -1 < size9; size9--) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJIII, size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    C1114140f6C c1114140f6C2 = (C1114140f6C) ListProtector.get(arrayList3, size10);
                    RecyclerView.ViewHolder viewHolder5 = c1114140f6C2.LIZ;
                    if (viewHolder5 != null) {
                        LJJIJIIJI(c1114140f6C2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = c1114140f6C2.LIZIZ;
                    if (viewHolder6 != null) {
                        LJJIJIIJI(c1114140f6C2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.LLJJIII.remove(arrayList3);
                    }
                }
            }
            LJJIIZ(this.LLJJIJIL);
            LJJIIZ(this.LLJJIJIIJIL);
            LJJIIZ(this.LLJJIJI);
            LJJIIZ(this.LLJJJ);
            LJIIJ();
        }
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJILJIL.isEmpty() && this.LLJILLL.isEmpty() && this.LLJILJILJ.isEmpty() && this.LLJIJIL.isEmpty() && this.LLJJIJIIJIL.isEmpty() && this.LLJJIJIL.isEmpty() && this.LLJJIJI.isEmpty() && this.LLJJJ.isEmpty() && this.LLJJI.isEmpty() && this.LLJJ.isEmpty() && this.LLJJIII.isEmpty()) ? false : true;
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJI() {
        boolean z = !this.LLJIJIL.isEmpty();
        boolean z2 = !this.LLJILJILJ.isEmpty();
        boolean z3 = !this.LLJILLL.isEmpty();
        boolean z4 = !this.LLJILJIL.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.ViewHolder viewHolder : this.LLJIJIL) {
                View view = viewHolder.itemView;
                C1114150f6D c1114150f6DLJJIJIIJIL = LJJIJIIJIL(view);
                this.LLJJIJIL.add(viewHolder);
                c1114150f6DLJJIJIIJIL.LIZ.setDuration(this.LLILZ);
                c1114150f6DLJJIJIIJIL.LIZ.alpha(0.0f);
                c1114150f6DLJJIJIIJIL.LIZ(new ALAdapterS2S0400000_17(view, viewHolder, c1114150f6DLJJIJIIJIL, this, 4));
                c1114150f6DLJJIJIIJIL.LIZ.start();
            }
            this.LLJIJIL.clear();
            if (z2) {
                ArrayList<C1114160f6E> arrayList = new ArrayList<>();
                arrayList.addAll(this.LLJILJILJ);
                this.LLJJI.add(arrayList);
                this.LLJILJILJ.clear();
                ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(arrayList, this, 86);
                if (z) {
                    ((C1114160f6E) ListProtector.get(arrayList, 0)).LIZ.itemView.postOnAnimationDelayed(aRunnableS86S0200000_17, this.LLILZ);
                } else {
                    aRunnableS86S0200000_17.run();
                }
            }
            if (z3) {
                ArrayList<C1114140f6C> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLJILLL);
                this.LLJJIII.add(arrayList2);
                this.LLJILLL.clear();
                ARunnableS86S0200000_17 aRunnableS86S0200000_172 = new ARunnableS86S0200000_17(arrayList2, this, 85);
                if (z) {
                    RecyclerView.ViewHolder viewHolder2 = ((C1114140f6C) ListProtector.get(arrayList2, 0)).LIZ;
                    if (viewHolder2 != null) {
                        viewHolder2.itemView.postOnAnimationDelayed(aRunnableS86S0200000_172, this.LLILZ);
                    }
                } else {
                    aRunnableS86S0200000_172.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.LLJILJIL);
                this.LLJJ.add(arrayList3);
                this.LLJILJIL.clear();
                ARunnableS86S0200000_17 aRunnableS86S0200000_173 = new ARunnableS86S0200000_17(arrayList3, this, 84);
                if (!z && !z2 && !z3) {
                    aRunnableS86S0200000_173.run();
                    return;
                }
                long j = (z2 && this.LLJJJJLIIL) ? this.LLILZIL : z ? this.LLILZ : 0L;
                View view2 = ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView;
                if (j > 0 || !LivePublicScreenAnimatorWithLayerSetting.INSTANCE.frameAlign()) {
                    view2.postOnAnimationDelayed(aRunnableS86S0200000_173, j);
                } else {
                    aRunnableS86S0200000_173.run();
                }
            }
        }
    }

    public final void LJJIIZI() {
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    public static final void LJJIIZ(List<? extends RecyclerView.ViewHolder> list) {
        View view;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(arrayList, size);
            if (viewHolder != null && (view = viewHolder.itemView) != null) {
                LJJIJIIJIL(view).LIZ.cancel();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public static C1114150f6D LJJIJIIJIL(View view) {
        if (view.getTag(R.id.yu3) == null) {
            C1114150f6D c1114150f6D = new C1114150f6D(view);
            view.setTag(R.id.yu3, c1114150f6D);
            return c1114150f6D;
        }
        return (C1114150f6D) view.getTag(R.id.yu3);
    }

    @Override // X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        LJJIJIIJIL(view).LIZ.cancel();
        int size = this.LLJILJILJ.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C1114160f6E) ListProtector.get(this.LLJILJILJ, size)).LIZ == viewHolder) {
                    C786410Ut5.ed(view, 0.0f);
                    C786410Ut5.Jc(view, 0.0f);
                    LJIIIZ(viewHolder);
                    ListProtector.remove(this.LLJILJILJ, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJIJ(viewHolder, this.LLJILLL);
        if (this.LLJIJIL.remove(viewHolder)) {
            C786410Ut5.T4(view, 1.0f);
            LJIIIZ(viewHolder);
        }
        if (this.LLJILJIL.remove(viewHolder)) {
            if (this.LLJJJJLIIL) {
                C786410Ut5.T4(view, 1.0f);
            } else {
                C786410Ut5.ed(view, 0.0f);
            }
            LJJIIJ(viewHolder);
        }
        int size2 = this.LLJJIII.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                ArrayList arrayList = (ArrayList) ListProtector.get(this.LLJJIII, size2);
                LJJIJ(viewHolder, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LLJJIII, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LLJJI.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LLJJI, size3);
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        if (((C1114160f6E) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                            C786410Ut5.ed(view, 0.0f);
                            C786410Ut5.Jc(view, 0.0f);
                            LJIIIZ(viewHolder);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LLJJI, size3);
                            }
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        int size5 = this.LLJJ.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LLJJ, size5);
                if (arrayList3.remove(viewHolder)) {
                    if (this.LLJJJJLIIL) {
                        C786410Ut5.T4(view, 1.0f);
                    } else {
                        C786410Ut5.ed(view, 0.0f);
                    }
                    LJJIIJ(viewHolder);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LLJJ, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LLJJIJIL.remove(viewHolder);
        this.LLJJIJI.remove(viewHolder);
        this.LLJJJ.remove(viewHolder);
        this.LLJJIJIIJIL.remove(viewHolder);
        LJJIIZI();
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJJ(long j) {
        LJJIJL(Long.valueOf(j), "state_add_duration", new AwS51S0100100_17(this, j, 7));
    }

    @Override // X.AbstractC21673719rz
    public final void LJIJJLI(long j) {
        LJJIJL(Long.valueOf(j), "state_change_duration", new AwS51S0100100_17(this, j, 8));
    }

    @Override // X.AbstractC21673719rz
    public final void LJIL(long j) {
        LJJIJL(Long.valueOf(j), "state_move_duration", new AwS51S0100100_17(this, j, 9));
    }

    @Override // X.AbstractC21673719rz
    public final void LJJ(long j) {
        LJJIJL(Long.valueOf(j), "state_remove_duration", new AwS51S0100100_17(this, j, 10));
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        LJJIJIL(viewHolder);
        if (this.LLJJJJLIIL) {
            C786410Ut5.T4(viewHolder.itemView, 0.0f);
        } else if (this.LLJILJIL.isEmpty()) {
            int bottom = ((View) viewHolder.itemView.getParent()).getBottom();
            int bottom2 = viewHolder.itemView.getBottom();
            C786410Ut5.ed(viewHolder.itemView, (bottom - bottom2) + r1.getHeight());
        } else {
            C786410Ut5.ed(viewHolder.itemView, ((RecyclerView.ViewHolder) C13LP.LJJLIIIJJI(this.LLJILJIL)).itemView.getTranslationY() + viewHolder.itemView.getHeight());
        }
        this.LLJILJIL.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        LJJIJIL(viewHolder);
        this.LLJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final void LJJIIJZLJL(RecyclerView.ViewHolder viewHolder) {
        C1111050f1D c1111050f1D;
        C1109770ez9 c1109770ez9;
        InterfaceC1109650eyx interfaceC1109650eyx;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if ((viewHolder instanceof C1111050f1D) && (c1111050f1D = (C1111050f1D) viewHolder) != null && (((c1109770ez9 = c1111050f1D.LL) == null || !c1109770ez9.LJJ) && (interfaceC1109650eyx = (AbstractC1110800f0o) c1111050f1D.LLILLJJLI) != null && (interfaceC1109650eyx instanceof InterfaceC1112720f3u))) {
            InterfaceC1112720f3u interfaceC1112720f3u = (InterfaceC1112720f3u) interfaceC1109650eyx;
            if (interfaceC1112720f3u.LJIILIIL() && !interfaceC1112720f3u.LJJIFFI().LIZ) {
                View view = c1111050f1D.LLJILJILJ;
                if (view != null) {
                    ValueAnimator valueAnimator = c1111050f1D.LLJILLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    C786410Ut5.LJLLLLLL(0, view);
                    C786410Ut5.T4(view, 0.0f);
                    ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.6666667f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(1200L);
                    C786410Ut5.Pd(duration);
                    c1111050f1D.LLJILLL = duration;
                    interfaceC1112720f3u.LJJIFFI().LIZ = true;
                    int[] iArr = new int[2];
                    c1111050f1D.itemView.getLocationInWindow(iArr);
                    if (iArr[0] > 0 || iArr[1] > 0) {
                        if (c1111050f1D.itemView.getLayoutDirection() != 1) {
                            iArr[0] = iArr[0] + c1111050f1D.itemView.getMeasuredWidth();
                        }
                        iArr[1] = iArr[1] + (c1111050f1D.itemView.getMeasuredHeight() / 2);
                        C1109770ez9 c1109770ez92 = c1111050f1D.LL;
                        if (c1109770ez92 != null && (dataChannel2 = c1109770ez92.LJIIIZ) != null) {
                            dataChannel2.zW(FeedbackAnimChannel.class, iArr);
                        }
                    }
                }
                C1109770ez9 c1109770ez93 = c1111050f1D.LL;
                if (c1109770ez93 != null && (dataChannel = c1109770ez93.LJIIIZ) != null) {
                    dataChannel.zW(FeedbackMessageChannel.class, interfaceC1112720f3u.LJJIFFI().LIZIZ);
                }
            }
        }
        this.LLJJJIL.invoke();
    }

    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder) {
        C1114150f6D c1114150f6DLJJIJIIJIL = LJJIJIIJIL(viewHolder.itemView);
        c1114150f6DLJJIJIIJIL.LIZ.setInterpolator(this.LLJI);
        LJIIJJI(viewHolder);
    }

    public final void LJJIL(boolean z) {
        LJJIJL(Boolean.valueOf(z), "state_add_opt", new AwS104S0110000_17(this, z, 3));
    }

    public C1114120f6A(Runnable runnable, Runnable runnable2) {
        this.LLIZLLLIL = runnable;
        this.LLJ = runnable2;
        LJIJJ(300L);
        LJIL(300L);
    }

    @Override // X.AbstractC21673719rz
    public final boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<? extends Object> list) {
        if (list.isEmpty() && !LJII(viewHolder)) {
            return false;
        }
        return true;
    }

    public final void LJJIJ(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            C1114140f6C c1114140f6C = (C1114140f6C) ListProtector.get(list, size);
            if (LJJIJIIJI(c1114140f6C, viewHolder) && c1114140f6C.LIZ == null && c1114140f6C.LIZIZ == null) {
                list.remove(c1114140f6C);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean LJJIJIIJI(C1114140f6C c1114140f6C, RecyclerView.ViewHolder viewHolder) {
        if (c1114140f6C.LIZIZ == viewHolder) {
            c1114140f6C.LIZIZ = null;
        } else if (c1114140f6C.LIZ == viewHolder) {
            c1114140f6C.LIZ = null;
        } else {
            return false;
        }
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            if (viewHolder != null) {
                View view2 = viewHolder.itemView;
                if (view2 != null) {
                    C786410Ut5.Jc(view2, 0.0f);
                }
                View view3 = viewHolder.itemView;
                if (view3 != null) {
                    C786410Ut5.ed(view3, 0.0f);
                }
            }
        }
        LJIIIZ(viewHolder);
        return true;
    }

    public final void LJJIJL(Object obj, String str, Function1<Object, Unit> function1) {
        if (Intrinsics.LJFF(this.LLJJJJJIL, "save")) {
            this.LLJJJJ.put(str, obj.toString());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveOrSetAnimState | saveState:");
            sbLIZ.append(this.LLJJJJJIL);
            sbLIZ.append(", key:");
            sbLIZ.append(str);
            sbLIZ.append(", value:");
            sbLIZ.append(obj);
            C20441214yg.LJIIIZ("TranslateAddAnimator", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        function1.invoke(obj);
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        if (!this.LLJJJJLIIL) {
            LJJIJIL(viewHolder);
        }
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            LJIIIZ(viewHolder);
            return false;
        }
        if (this.LLJJJJLIIL) {
            LJJIJIL(viewHolder);
        }
        if (i5 != 0) {
            C786410Ut5.Jc(view, -i5);
        }
        if (i6 != 0) {
            C786410Ut5.ed(view, -i6);
        }
        this.LLJILJILJ.add(new C1114160f6E(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        AbstractC1111020f1A abstractC1111020f1A;
        if (viewHolder == viewHolder2) {
            if ((viewHolder2 instanceof C1111130f1L) && (abstractC1111020f1A = (AbstractC1111020f1A) viewHolder2) != null && (abstractC1111020f1A.LLILLJJLI instanceof C1110280ezy) && LivePublicScreenSelfCommentUpdateOptSetting.INSTANCE.isAnimationOptEnabled()) {
                viewHolder2.setIsRecyclable(true);
                return false;
            }
            return LJJII(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        LJJIJIL(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        C786410Ut5.Jc(viewHolder.itemView, translationX);
        C786410Ut5.ed(viewHolder.itemView, translationY);
        C786410Ut5.T4(viewHolder.itemView, alpha);
        if (viewHolder2 != null) {
            LJJIJIL(viewHolder2);
            C786410Ut5.Jc(viewHolder2.itemView, -i5);
            C786410Ut5.ed(viewHolder2.itemView, -i6);
            C786410Ut5.T4(viewHolder2.itemView, 0.0f);
        }
        this.LLJILLL.add(new C1114140f6C(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}
