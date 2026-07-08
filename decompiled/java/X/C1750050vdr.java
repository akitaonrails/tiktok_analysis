package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750050vdr extends C11DP<Object> {
    public final boolean LLILLL;
    public final InterfaceC1398040mU6 LLILZ;
    public final C01GW<String> LLILZIL;

    @Override // X.C11DY
    public final void LLLFZ(C19465311Dn c19465311Dn) {
        c19465311Dn.LJFF(new AwS605S0100000_26(this, 559), new AwS605S0100000_26(this, 560), null);
        c19465311Dn.LJFF(new AwS605S0100000_26(this, 561), AFwS232S0000000_4.get$arr$(186), null);
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LL.LIZIZ(i);
    }

    public C1750050vdr(LifecycleOwner lifecycleOwner, boolean z, C194378112y c194378112y) {
        super(lifecycleOwner, new AbstractC339510DSr<Object>() { // from class: X.0mU0
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Object obj, Object obj2) {
                if ((obj instanceof NewFaceStickerBean) && (obj2 instanceof NewFaceStickerBean)) {
                    return Intrinsics.LJFF(obj, obj2);
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Object obj, Object obj2) {
                if ((obj instanceof NewFaceStickerBean) && (obj2 instanceof NewFaceStickerBean)) {
                    NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) obj;
                    NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) obj2;
                    if (Intrinsics.LJFF(newFaceStickerBean.id, newFaceStickerBean2.id) && Intrinsics.LJFF(newFaceStickerBean.name, newFaceStickerBean2.name) && Intrinsics.LJFF(newFaceStickerBean.iconUrl, newFaceStickerBean2.iconUrl) && Intrinsics.LJFF(newFaceStickerBean.relatedAweme, newFaceStickerBean2.relatedAweme) && newFaceStickerBean.featureVideoSource == newFaceStickerBean2.featureVideoSource) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }, (InterfaceC19464611Dg) null);
        this.LLILLL = z;
        this.LLILZ = c194378112y;
        this.LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(373));
    }
}
