package X;

import Y.AsS51S0100000_25;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640610snL extends AbstractC1640400sn0<ProviderEffect> {
    public final InterfaceC1640330smt<ProviderEffect> LJJIJIL;
    public final boolean LJJIJL;
    public int LJJIJLIJ;

    @Override // X.AbstractC1640400sn0
    public final void LJJI() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        if (this.LJJIJL && AbstractC1640400sn0.LJIILL(LJIIJJI())) {
            RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
            if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int iLJIILLIIL = LJIILLIIL(C13LQ.LJJJJZI(staggeredGridLayoutManager.LJIJ(null)));
            int iLJIILLIIL2 = LJIILLIIL(C13LQ.LJJJJLI(staggeredGridLayoutManager.LJIJJ(null)));
            if (iLJIILLIIL < iLJIILLIIL2 && iLJIILLIIL <= iLJIILLIIL2) {
                int i = iLJIILLIIL;
                while (true) {
                    C1634100scq c1634100scq = (C1634100scq) C13LP.LJJJLZIJ(i, LJIIIIZZ().getData());
                    if (c1634100scq != null) {
                        arrayList.add(c1634100scq.LIZ);
                    }
                    if (i == iLJIILLIIL2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.LJJ.onNext(new Pair(arrayList, Integer.valueOf(iLJIILLIIL)));
            }
        }
    }

    @Override // X.AbstractC1640400sn0
    public final C0DXR LJJIIJ() {
        int i = this.LJFF;
        Float fValueOf = Float.valueOf(12.0f);
        return new C1337790kuv(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), AFwS214S0000000_25.get$arr$(547));
    }

    @Override // X.AbstractC1640400sn0
    public final void LJIILIIL(LifecycleOwner lifecycleOwner) {
        super.LJIILIIL(lifecycleOwner);
        LJIIJJI().addOnScrollListener(new AsS51S0100000_25(this, 8));
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView LJJIIZ(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.w6_);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setItemViewCacheSize(this.LJFF);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
        C426750GoL.LJIIL(recyclerView, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        return recyclerView;
    }

    public final void LJJIJ(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iLJJJJZI;
        int iLJJJJLI;
        AbstractC1637470siH abstractC1637470siH;
        boolean z;
        RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null || (iLJJJJZI = C13LQ.LJJJJZI(staggeredGridLayoutManager.LJIJ(null))) > (iLJJJJLI = C13LQ.LJJJJLI(staggeredGridLayoutManager.LJIJJ(null)))) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = LJIIJJI().findViewHolderForAdapterPosition(iLJJJJZI);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1638210sjT) && (abstractC1637470siH = (AbstractC1637470siH) viewHolderFindViewHolderForAdapterPosition) != null) {
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
            if (iLJJJJZI != iLJJJJLI) {
                iLJJJJZI++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25) {
        Context context = viewGroup.getContext();
        C1641160soE c1641160soE = new C1641160soE(new ContextThemeWrapper(context, R.style.y0));
        c1641160soE.LJ = (int) C11VU.LIZIZ(93.0f, context);
        c1641160soE.LJFF = (int) C11VU.LIZIZ(93.0f, context);
        c1641160soE.LJIIIZ = false;
        c1641160soE.LJIIZILJ = false;
        c1641160soE.LJJ = true;
        c1641160soE.LJIIIIZZ = R.drawable.aoo;
        View viewLIZ = c1641160soE.LIZ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewLIZ);
        viewLIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(viewLIZ);
        Pair pair = new Pair(frameLayout, viewLIZ);
        return new C1638210sjT((View) pair.getFirst(), (C1662850tND) pair.getSecond(), awS674S0100000_25);
    }

    @Override // X.AbstractC1640400sn0
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i, ProviderEffect providerEffect, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        float fFloatValue;
        String height;
        Float fLJIIIIZZ;
        String width;
        Float fLJIIIIZZ2;
        ProviderEffect providerEffect2 = providerEffect;
        if ((viewHolder instanceof C1638210sjT) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            AbstractC1637470siH abstractC1637470siH2 = (AbstractC1637470siH) viewHolder;
            ViewGroup.LayoutParams layoutParams = abstractC1637470siH2.LL.getLayoutParams();
            boolean z = false;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(0, 0);
            }
            float fLJII = (C11VU.LJII(C390810FTz.LIZJ(abstractC1637470siH2.LL.getContext()), abstractC1637470siH2.LL.getContext()) - 56.0f) / this.LJFF;
            ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
            float fFloatValue2 = 1.0f;
            if (sticker_info != null && (width = sticker_info.getWidth()) != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(width)) != null) {
                fFloatValue = fLJIIIIZZ2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            float f = fLJII / fFloatValue;
            ProviderEffect.StickerBean sticker_info2 = providerEffect2.getSticker_info();
            if (sticker_info2 != null && (height = sticker_info2.getHeight()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(height)) != null) {
                fFloatValue2 = fLJIIIIZZ.floatValue();
            }
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) (fFloatValue2 * f))));
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) fLJII)));
            C1662850tND c1662850tND = abstractC1637470siH2.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND);
            c1662850tND.setLayoutParams(layoutParams);
            int i2 = this.LJJIJLIJ;
            abstractC1637470siH.I5(i, enumC1641420soe, num, providerEffect2);
            C1324800kZy imageView = abstractC1637470siH.LL.getImageView();
            if ((imageView instanceof C1324790kZx) && imageView != null) {
                if (i2 == 0) {
                    z = true;
                }
                imageView.LIZJ(z);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1640610snL(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, boolean z) {
        boolean z2 = true;
        super(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, 3, false, z2, z2, z, null, 1024);
        this.LJJIJIL = interfaceC1640330smt;
        this.LJJIJL = true;
    }
}
