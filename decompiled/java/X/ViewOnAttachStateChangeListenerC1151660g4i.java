package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.multiimageloader.IMultiImageLoader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewOnAttachStateChangeListenerC1151660g4i implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1151660g4i viewOnAttachStateChangeListenerC1151660g4i, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1151660g4i viewOnAttachStateChangeListenerC1151660g4i, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1151660g4i viewOnAttachStateChangeListenerC1151660g4i, View view) {
        ImageView imageView;
        ImageModel imageModel;
        C09RD c09rd = new C09RD((ViewGroup) view);
        List list = (List) viewOnAttachStateChangeListenerC1151660g4i.l0;
        C1087670ePV c1087670ePV = (C1087670ePV) viewOnAttachStateChangeListenerC1151660g4i.l1;
        Iterator<View> it2 = c09rd.iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view2 = (View) c09re.next();
                List urls = null;
                if ((view2 instanceof ImageView) && (imageView = (ImageView) view2) != null) {
                    if (list != null) {
                        Object tag = imageView.getTag();
                        if (Intrinsics.LJFF(tag, "top")) {
                            ((IMultiImageLoader) C1161920gLG.LIZJ(IMultiImageLoader.class)).Q90((Bitmap) ListProtector.get(list, 0), imageView);
                        } else if (Intrinsics.LJFF(tag, "bottom")) {
                            ((IMultiImageLoader) C1161920gLG.LIZJ(IMultiImageLoader.class)).Q90((Bitmap) ListProtector.get(list, 1), imageView);
                        } else if (Intrinsics.LJFF(tag, "halo")) {
                            ((IMultiImageLoader) C1161920gLG.LIZJ(IMultiImageLoader.class)).Q90((Bitmap) ListProtector.get(list, 2), imageView);
                        }
                    } else {
                        Object tag2 = imageView.getTag();
                        if (Intrinsics.LJFF(tag2, "top")) {
                            ImageModel imageModel2 = c1087670ePV.LIZ;
                            if (imageModel2 != null) {
                                urls = imageModel2.getUrls();
                            }
                        } else if (Intrinsics.LJFF(tag2, "bottom")) {
                            ImageModel imageModel3 = c1087670ePV.LIZJ;
                            if (imageModel3 != null) {
                                urls = imageModel3.getUrls();
                            }
                        } else if (Intrinsics.LJFF(tag2, "halo") && (imageModel = c1087670ePV.LIZIZ) != null) {
                            urls = imageModel.getUrls();
                        }
                        C1819620xS4.LIZ().LIZJ(urls).LJJI(imageView);
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1151660g4i viewOnAttachStateChangeListenerC1151660g4i, View view) {
        Long lValueOf;
        C20441214yg.LIZIZ(((C1126870fQj) viewOnAttachStateChangeListenerC1151660g4i.l0).LLJJJ, "onViewAttachedToWindow landscape");
        C1126870fQj c1126870fQj = (C1126870fQj) viewOnAttachStateChangeListenerC1151660g4i.l0;
        AbstractC1126600fQI<?> abstractC1126600fQI = c1126870fQj.LLIZLLLIL;
        View view2 = (View) viewOnAttachStateChangeListenerC1151660g4i.l1;
        C1295960jpS c1295960jpS = c1126870fQj.LLJJJJ;
        C1324720kZq c1324720kZq = c1126870fQj.LLILZIL;
        C1324720kZq c1324720kZq2 = c1126870fQj.LLJJLIIIJLLLLLLLZ;
        C1324720kZq c1324720kZq3 = c1126870fQj.LLJJJJJIL;
        C520690KbT c520690KbT = c1126870fQj.LLJJJIL;
        C16F5 c16f5 = c1126870fQj.LLILZ;
        ImageView imageView = c1126870fQj.LLJLIL;
        C16F5 c16f52 = c1126870fQj.LLJL;
        View view3 = c1126870fQj.LLJI;
        C16F5 c16f53 = c1126870fQj.LLJILJIL;
        if (abstractC1126600fQI != null) {
            lValueOf = Long.valueOf(abstractC1126600fQI.LJFF());
        } else {
            lValueOf = null;
        }
        AbstractC1126600fQI<?> abstractC1126600fQI2 = ((C1126870fQj) viewOnAttachStateChangeListenerC1151660g4i.l0).LLIZLLLIL;
        int iLIZLLL = 0;
        if (abstractC1126600fQI2 != null) {
            iLIZLLL = abstractC1126600fQI2.LIZLLL();
        }
        C1126920fQo.LIZ(view2, c1295960jpS, c1324720kZq, c1324720kZq2, c1324720kZq3, c520690KbT, c16f5, imageView, c16f52, view3, c16f53, lValueOf, Integer.valueOf(iLIZLLL));
        ((C1126870fQj) viewOnAttachStateChangeListenerC1151660g4i.l0).getClass();
    }

    public ViewOnAttachStateChangeListenerC1151660g4i(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
