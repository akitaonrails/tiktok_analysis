package X;

import Y.ARunnableS18S0201000_12;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.navi.model.ProfileNaviStaticImage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS120S0101000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCZ extends AbstractC21673619ry<C768360UCc> {
    public final List<C768350UCb> LL = new ArrayList();
    public AwS591S0100000_12 LLILLJJLI;
    public int LLILLL;
    public RecyclerView LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLI(List<C768350UCb> list) {
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        notifyDataSetChanged();
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.scrollToPosition(C767790U9x.LJFF);
    }

    public final void LLLII(int i) {
        if (i >= ((ArrayList) this.LL).size()) {
            return;
        }
        LLLFZ(this.LLILLL, 4);
        if (i == -1) {
            return;
        }
        this.LLILLL = i;
        if (!C767790U9x.LIZJ.containsKey(ListProtector.get(this.LL, i))) {
            LLLFZ(i, 3);
        }
    }

    public final void LLLIIIIL(int i) {
        if (i >= ((ArrayList) this.LL).size()) {
            return;
        }
        LLLFZ(C767790U9x.LJFF, 2);
        if (i == -1) {
            return;
        }
        C767790U9x.LJFF = i;
        LLLFZ(i, 1);
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LLILZ = recyclerView;
    }

    public final void LLLFZ(int i, Object obj) {
        try {
            RecyclerView recyclerView = this.LLILZ;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (recyclerView.isComputingLayout()) {
                RecyclerView recyclerView3 = this.LLILZ;
                if (recyclerView3 != null) {
                    recyclerView2 = recyclerView3;
                }
                HandlerHook.viewPost(recyclerView2, new ARunnableS18S0201000_12(i, this, obj, 7));
                return;
            }
            notifyItemChanged(i, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        UrlModel urlModel;
        C768360UCc c768360UCc = (C768360UCc) viewHolder;
        ViewGroup viewGroup = c768360UCc.LL;
        if (C767790U9x.LJFF == i) {
            if (C768880UEc.LIZ()) {
                i2 = R.drawable.f6j;
            } else {
                i2 = R.drawable.f6i;
            }
        } else {
            i2 = R.drawable.f6h;
        }
        viewGroup.setBackground(C0UDZ.LIZ(i2));
        ImageView imageView = c768360UCc.LLILLL;
        C500260Jjc.LJIILIIL(imageView);
        imageView.clearAnimation();
        ProfileNaviStaticImage profileNaviStaticImage = ((C768350UCb) ListProtector.get(this.LL, i)).LIZJ;
        if (profileNaviStaticImage != null && (urlModel = profileNaviStaticImage.thumbnailUrl) != null) {
            C1819620xS4.LIZ().LJIIIZ(urlModel.LIZ()).LJJI(c768360UCc.LLILLJJLI);
        } else {
            c768360UCc.LLILLJJLI.setImageDrawable(null);
        }
        C500260Jjc.LJLIIIL(500L, c768360UCc.itemView, new AwS120S0101000_12(i, this, 4));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C768360UCc c768360UCc = new C768360UCc(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hf9, viewGroup, false));
        try {
            View view = c768360UCc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c768360UCc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c768360UCc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C768360UCc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c768360UCc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c768360UCc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C768360UCc.class.getName();
        return c768360UCc;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2;
        C768360UCc c768360UCc = (C768360UCc) viewHolder;
        if (list.isEmpty()) {
            super.onBindViewHolder(c768360UCc, i, list);
            return;
        }
        for (Object obj : list) {
            if (Intrinsics.LJFF(obj, 1)) {
                ViewGroup viewGroup = c768360UCc.LL;
                if (C768880UEc.LIZ()) {
                    i2 = R.drawable.f6j;
                } else {
                    i2 = R.drawable.f6i;
                }
                viewGroup.setBackground(C0UDZ.LIZ(i2));
            } else if (Intrinsics.LJFF(obj, 2)) {
                c768360UCc.LL.setBackground(C0UDZ.LIZ(R.drawable.f6h));
            } else if (Intrinsics.LJFF(obj, 3)) {
                ImageView imageView = c768360UCc.LLILLL;
                C500260Jjc.LLFFF(imageView);
                imageView.startAnimation(AnimationUtils.loadAnimation(c768360UCc.itemView.getContext(), R.anim.gv));
            } else if (Intrinsics.LJFF(obj, 4)) {
                ImageView imageView2 = c768360UCc.LLILLL;
                C500260Jjc.LJIILIIL(imageView2);
                imageView2.clearAnimation();
            } else {
                super.onBindViewHolder(c768360UCc, i, list);
            }
        }
    }
}
