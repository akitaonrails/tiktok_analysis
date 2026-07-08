package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762400vxm extends ConstraintLayout {
    public C1763720vzu LL;
    public AppCompatImageView LLILLJJLI;
    public PdpViewModel LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public C1762410vxn LLILZLL;
    public final Set<String> LLIZ;
    public InterfaceC1748810vbr LLIZLLLIL;
    public C1762950vyf LLJ;
    public List<? extends InterfaceC1763190vz3> LLJI;
    public InterfaceC1763230vz7 LLJIJIL;
    public Function1<? super Integer, Unit> LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public C1508390pM5 LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public Boolean LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public List<Image> LLJJIJIL;

    private final C1762200vxS getHalfPageAnimator() {
        return (C1762200vxS) this.LLJJ.getValue();
    }

    public final AppCompatImageView getCommerceHeaderPagerEmptyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.egs);
            this.LLILLJJLI = (AppCompatImageView) callbackFindViewById;
        }
        return (AppCompatImageView) callbackFindViewById;
    }

    public final C1763720vzu getCommerceHeaderPagerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.egr);
            this.LL = (C1763720vzu) callbackFindViewById;
        }
        return (C1763720vzu) callbackFindViewById;
    }

    public final int getMediaCount() {
        C1762950vyf c1762950vyf = this.LLJ;
        if (c1762950vyf == null) {
            c1762950vyf = null;
        }
        return c1762950vyf.LIZJ.size();
    }

    public final int getNumVideos() {
        C1762950vyf c1762950vyf = this.LLJ;
        if (c1762950vyf == null) {
            c1762950vyf = null;
        }
        List<MediaItem> list = c1762950vyf.LIZJ;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<MediaItem> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().type == 2 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final int getVideoIndex() {
        C1762950vyf c1762950vyf = this.LLJ;
        if (c1762950vyf == null) {
            c1762950vyf = null;
        }
        Iterator<MediaItem> it2 = c1762950vyf.LIZJ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final C1763720vzu getViewPager() {
        return getCommerceHeaderPagerFromXml();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Function1<? super Boolean, Unit> function1 = this.LLJILJILJ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public final C1762410vxn getHeaderPagerAdapter() {
        return this.LLILZLL;
    }

    public final Function1<Boolean, Unit> getOnHeaderTouchGesture() {
        return this.LLJILJILJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super Boolean, Unit> function1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && (function1 = this.LLJILJILJ) != null) {
                function1.invoke(Boolean.TRUE);
            }
        } else {
            Function1<? super Boolean, Unit> function12 = this.LLJILJILJ;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setCommerceHeaderPagerEmptyFromXml(AppCompatImageView appCompatImageView) {
        this.LLILLJJLI = appCompatImageView;
    }

    public final void setCommerceHeaderPagerFromXml(C1763720vzu c1763720vzu) {
        this.LL = c1763720vzu;
    }

    public final void setHeaderPagerAdapter(C1762410vxn c1762410vxn) {
        this.LLILZLL = c1762410vxn;
    }

    public final void setOnHeaderTouchGesture(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public C1762400vxm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0(MediaItem mediaItem, int i) {
        String uri;
        String str;
        boolean z;
        PromoSticker promoSticker;
        int i2 = mediaItem.type;
        String uri2 = "";
        String str2 = null;
        if (i2 == 1) {
            Image image = mediaItem.image;
            if (image == null || (uri = image.getUri()) == null || uri.length() == 0) {
                return;
            }
        } else if (i2 == 2) {
            uri = "";
        } else {
            return;
        }
        if (!this.LLIZ.contains(uri)) {
            this.LLIZ.add(uri);
            C1762410vxn c1762410vxn = this.LLILZLL;
            if (c1762410vxn == null || (promoSticker = c1762410vxn.LLJJIJIL) == null || (str = promoSticker.daInfo) == null || i != c1762410vxn.LLJJJ) {
                str = null;
            }
            PdpViewModel pdpViewModel = this.LLILLL;
            if (pdpViewModel == null) {
                pdpViewModel = null;
            }
            C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                String strValueOf = String.valueOf(getMediaCount());
                PdpViewModel pdpViewModel2 = this.LLILLL;
                if (pdpViewModel2 == null) {
                    pdpViewModel2 = null;
                }
                String strIH1 = pdpViewModel2.iH1(null);
                String str3 = mediaItem.category;
                if (str3 == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                int i3 = mediaItem.type;
                if (i3 == 1) {
                    Image image2 = mediaItem.image;
                    if (image2 != null && (uri2 = image2.getUri()) != null && uri2.length() != 0) {
                        z = false;
                        if (uri2 == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    Video video = mediaItem.video;
                    if (video != null) {
                        str2 = video.id;
                    }
                    str3 = "video";
                    z = true;
                }
                c1054004Ag.LJJIIZ(uri2, str3, "head_pic", z, Integer.valueOf(i), null, str2, "viewer", strValueOf, strIH1, str, null, null);
            }
        }
    }

    public C1762400vxm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = true;
        this.LLIZ = new LinkedHashSet();
        this.LLJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(128));
        this.LLJJIJIIJIL = 1.0f;
        C954703oH.LIZ(context, R.layout.ase, this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(final X.C1762950vyf r36, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r37, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r38, androidx.lifecycle.LifecycleRegistry r39, X.C1508390pM5 r40, java.lang.Boolean r41, X.InterfaceC1763730vzv r42, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker r43, java.util.List r44, kotlin.jvm.internal.AwS605S0100000_26 r45) {
        /*
            Method dump skipped, instruction units count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762400vxm.e0(X.0vyf, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, androidx.lifecycle.LifecycleRegistry, X.0pM5, java.lang.Boolean, X.0vzv, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker, java.util.List, kotlin.jvm.internal.AwS605S0100000_26):void");
    }
}
