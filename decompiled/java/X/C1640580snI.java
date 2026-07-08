package X;

import Y.AsS51S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640580snI extends C1640560snG {
    public final LifecycleOwner LJJIL;
    public final int LJJIZ;
    public int LJJJ;

    @Override // X.AbstractC1640400sn0
    public final C0DXR LJJIIJ() {
        return C1641230soL.LIZJ() ? new C1337790kuv(4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), AnonymousClass0206.get$arr$(240)) : new C1337790kuv(3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))), AnonymousClass0206.get$arr$(241));
    }

    @Override // X.C1640560snG, X.AbstractC1640400sn0
    public final LifecycleOwner LJIIIZ() {
        return this.LJJIL;
    }

    @Override // X.C1640560snG, X.AbstractC1640400sn0
    public final int LJIIJ() {
        return this.LJJIZ;
    }

    @Override // X.AbstractC1640400sn0
    public final void LJIILIIL(LifecycleOwner lifecycleOwner) {
        super.LJIILIIL(lifecycleOwner);
        LJIIJJI().addOnScrollListener(new AsS51S0100000_25(this, 3));
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView LJJIIZ(View view) {
        int iLIZIZ;
        RecyclerView recyclerViewLJJIIZ = super.LJJIIZ(view);
        if (C1641230soL.LIZJ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        C426750GoL.LJIIL(recyclerViewLJJIIZ, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))), Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))), 16);
        return recyclerViewLJJIIZ;
    }

    public final void LJJIJIIJI(int i) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        AbstractC1637470siH abstractC1637470siH;
        boolean z;
        RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = LJIIJJI().findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1637460siG) && (abstractC1637470siH = (AbstractC1637470siH) viewHolderFindViewHolderForAdapterPosition) != null) {
                C1324800kZy imageView = abstractC1637470siH.LL.getImageView();
                if ((imageView instanceof C1324790kZx) && imageView != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    imageView.LIZJ(z);
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // X.C1640560snG, X.AbstractC1640400sn0
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, final AwS674S0100000_25 awS674S0100000_25) {
        Pair<FrameLayout, C1662850tND> pairLJII;
        if (C1641230soL.LIZJ()) {
            pairLJII = C1640600snK.LIZJ(viewGroup.getContext());
        } else {
            pairLJII = C1640600snK.LJII(viewGroup.getContext());
        }
        final FrameLayout first = pairLJII.getFirst();
        final C1662850tND second = pairLJII.getSecond();
        return new AbstractC1637470siH<Effect>(first, second, awS674S0100000_25) { // from class: X.0siG
            @Override // X.AbstractC1637470siH
            public final void V2(Effect effect) {
                Effect effect2 = effect;
                int iLIZ = this.itemView.getLayoutParams().width - ((int) C11VU.LIZ(24.0f));
                List<String> urlList = effect2.getIconUrl().getUrlList();
                if ((!urlList.isEmpty()) && urlList != null) {
                    C1324750kZt.LJIILJJIL(this.LL.getImageView(), urlList, iLIZ, iLIZ, null, null, new C1636130sg7(effect2), null);
                }
                this.itemView.setContentDescription(effect2.getName());
            }
        };
    }

    @Override // X.C1640560snG, X.AbstractC1640400sn0
    public final /* bridge */ /* synthetic */ void LIZJ(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC1641420soe enumC1641420soe, Integer num) {
        LIZJ(viewHolder, i, effect, enumC1641420soe, num);
    }

    @Override // X.C1640560snG
    /* JADX INFO: renamed from: LJJIJ */
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        boolean z;
        if ((viewHolder instanceof C1637460siG) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            int i2 = this.LJJJ;
            abstractC1637470siH.I5(i, enumC1641420soe, num, effect);
            C1324800kZy imageView = abstractC1637470siH.LL.getImageView();
            if ((imageView instanceof C1324790kZx) && imageView != null) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                imageView.LIZJ(z);
            }
        }
    }

    public C1640580snI(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, Function1 function1) {
        super(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, i, false, false, true, z, function1);
        this.LJJIL = lifecycleOwner;
        this.LJJIZ = i;
    }
}
