package X;

import X.C1092580eXQ;
import Y.ACListenerS90S0300000_26;
import Y.ARunnableS11S1100000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.model.ColorDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.PriceDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.TuxTagDO;
import com.bytedance.pipo.ttpay.model.FinancialProductDO;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1720900usq extends AbstractC1720840usk<FinancialProductDO> implements InterfaceC1092590eXR {
    public C1720880uso LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1092590eXR
    public final void LIZLLL(Object obj, String str) {
        C1720880uso c1720880uso;
        String amount;
        PriceDO priceTag;
        if (Intrinsics.LJFF(str, "MSG_TYPE_PRICE_UPDATE") && (obj instanceof Boolean)) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            View view = this.LLILLJJLI;
            if (view != null && (c1720880uso = (C1720880uso) view.findViewById(R.id.rst)) != null) {
                if (zBooleanValue) {
                    FinancialProductDO financialProductDO = (FinancialProductDO) this.LLILLL;
                    if (financialProductDO == null || (priceTag = financialProductDO.getPriceTag()) == null || (amount = priceTag.getAmount()) == null) {
                        amount = "";
                    }
                } else {
                    amount = "******";
                }
                TuxTextView tuxTextView = c1720880uso.LL;
                if (tuxTextView != null) {
                    HandlerHook.viewPost(tuxTextView, new ARunnableS11S1100000_6(c1720880uso, amount, 0));
                }
            }
        }
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, FinancialProductDO financialProductDO, EnumC1720670usT enumC1720670usT) {
        InterfaceC1720050urT interfaceC1720050urT;
        InterfaceC1720050urT interfaceC1720050urT2;
        InterfaceC1720050urT interfaceC1720050urT3;
        Integer numLJIILIIL;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        FinancialProductDO financialProductDO2 = financialProductDO;
        super.LJFF(view, financialProductDO2, enumC1720670usT);
        ImageView imageView = (ImageView) view.findViewById(R.id.rxr);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.w1a);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.wgz);
        this.LLILZ = (C1720880uso) view.findViewById(R.id.rst);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.x0r);
        InterfaceC1720050urT interfaceC1720050urT4 = null;
        if (financialProductDO2.getProductIcon() == null) {
            C786410Ut5.LJZI(8, imageView);
        } else {
            C786410Ut5.LJZI(0, imageView);
            ImageDO productIcon = financialProductDO2.getProductIcon();
            C1721300utU c1721300utU = C1721300utU.LIZ;
            C1720760usc c1720760usc = this.LL;
            if (c1720760usc != null) {
                interfaceC1720050urT = c1720760usc.LIZIZ;
            } else {
                interfaceC1720050urT = null;
            }
            c1721300utU.getClass();
            C1721300utU.LJIJI(imageView, productIcon, interfaceC1720050urT);
        }
        if (financialProductDO2.getStatusIcon() == null) {
            C786410Ut5.LJZI(8, imageView2);
        } else {
            C786410Ut5.LJZI(0, imageView2);
            ImageDO statusIcon = financialProductDO2.getStatusIcon();
            C1721300utU c1721300utU2 = C1721300utU.LIZ;
            C1720760usc c1720760usc2 = this.LL;
            if (c1720760usc2 != null) {
                interfaceC1720050urT2 = c1720760usc2.LIZIZ;
            } else {
                interfaceC1720050urT2 = null;
            }
            c1721300utU2.getClass();
            C1721300utU.LJIJI(imageView2, statusIcon, interfaceC1720050urT2);
        }
        if (financialProductDO2.getTitle() == null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            TextDO title = financialProductDO2.getTitle();
            C1721300utU c1721300utU3 = C1721300utU.LIZ;
            C1720760usc c1720760usc3 = this.LL;
            if (c1720760usc3 != null) {
                interfaceC1720050urT3 = c1720760usc3.LIZIZ;
            } else {
                interfaceC1720050urT3 = null;
            }
            c1721300utU3.getClass();
            C1721300utU.LJIL(interfaceC1720050urT3, title, tuxTextView);
            C786410Ut5.h9(tuxTextView, new ACListenerS90S0300000_26(title, financialProductDO2, this, 6));
            if (financialProductDO2.getArrowIcon() != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = C1721300utU.LJJI(financialProductDO2.getArrowIcon().getName());
                c419910GdJ.LIZIZ = C1721300utU.LJJIII(view.getContext(), financialProductDO2.getArrowIcon().getWidth());
                c419910GdJ.LIZJ = C1721300utU.LJIILLIIL(view.getContext(), financialProductDO2.getArrowIcon().getHeight());
                ColorDO color = financialProductDO2.getArrowIcon().getColor();
                if (color != null) {
                    numLJIILIIL = C1721300utU.LJIILIIL(color, view.getContext(), null);
                } else {
                    numLJIILIIL = null;
                }
                c419910GdJ.LIZLLL = numLJIILIIL;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            }
        }
        if (financialProductDO2.getPriceTag() == null) {
            C1720880uso c1720880uso = this.LLILZ;
            if (c1720880uso != null) {
                int visibility = c1720880uso.getVisibility();
                c1720880uso.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1720880uso);
            }
            if (financialProductDO2.getSubTitle() != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                C1721300utU c1721300utU4 = C1721300utU.LIZ;
                C1720760usc c1720760usc4 = this.LL;
                if (c1720760usc4 != null) {
                    interfaceC1720050urT4 = c1720760usc4.LIZIZ;
                }
                TextDO subTitle = financialProductDO2.getSubTitle();
                c1721300utU4.getClass();
                C1721300utU.LJIL(interfaceC1720050urT4, subTitle, tuxTextView2);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            C1720880uso c1720880uso2 = this.LLILZ;
            if (c1720880uso2 != null) {
                int visibility2 = c1720880uso2.getVisibility();
                c1720880uso2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c1720880uso2);
            }
            PriceDO priceTag = financialProductDO2.getPriceTag();
            C1720880uso c1720880uso3 = this.LLILZ;
            if (c1720880uso3 != null) {
                c1720880uso3.setData(priceTag);
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        if (financialProductDO2.getTag() == null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            C1721300utU c1721300utU5 = C1721300utU.LIZ;
            TuxTagDO tag = financialProductDO2.getTag();
            c1721300utU5.getClass();
            C1721300utU.LJIJJLI(tuxTextView3, tag);
        }
        C1092580eXQ.LIZ("MSG_TYPE_PRICE_UPDATE", this);
        C1720760usc c1720760usc5 = this.LL;
        if (c1720760usc5 != null && (lifecycleOwner = c1720760usc5.LIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.ttpay.portal.financial.BaseFinancialProductCard$onBindView$1$5
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1092580eXQ.LIZJ("MSG_TYPE_PRICE_UPDATE", this.LL);
                    }
                }
            });
        }
    }
}
