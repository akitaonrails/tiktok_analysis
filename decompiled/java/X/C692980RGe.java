package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692980RGe extends FrameLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public C0RFT LL;
    public List<InteractStickerStruct> LLILLJJLI;
    public C705930RmZ LLILLL;
    public Aweme LLILZ;
    public long LLILZIL;
    public String LLILZLL;
    public final InterfaceC694960RNu LLIZ;

    public final C11NJ getCompositeDisposable() {
        C0RFT c0rft = this.LL;
        if (c0rft != null) {
            return c0rft.LIZIZ();
        }
        return null;
    }

    public final void LIZJ(boolean z) {
        this.LLILZIL++;
        if (!z) {
            this.LLILZLL = null;
        }
        this.LLILLJJLI.clear();
        this.LLILLL = null;
        this.LLILZ = null;
        C0RFT c0rft = this.LL;
        if (c0rft != null) {
            c0rft.destroy();
        }
        this.LL = null;
    }

    public final void LJ(int i) {
        Aweme aweme = this.LLILZ;
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (aid.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aid);
            sbLIZ.append('#');
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!Intrinsics.LJFF(this.LLILZLL, strLIZIZ) && this.LLIZ.LIZIZ(i, aweme)) {
                this.LLILZLL = strLIZIZ;
            }
        }
    }

    public C692980RGe(Context context, AttributeSet attributeSet) {
        InterfaceC694960RNu interfaceC694960RNuLIZ;
        super(context, attributeSet);
        this.LLILLJJLI = new ArrayList();
        IECommercePhotoService iECommercePhotoService = (IECommercePhotoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommercePhotoService.class));
        this.LLIZ = (iECommercePhotoService == null || (interfaceC694960RNuLIZ = iECommercePhotoService.LIZ()) == null) ? C694950RNt.LIZ : interfaceC694960RNuLIZ;
    }

    public static void LIZ(C692980RGe c692980RGe, RectF rectF) {
        c692980RGe.getLayoutParams().width = (int) rectF.width();
        c692980RGe.getLayoutParams().height = (int) rectF.height();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c692980RGe);
        c692980RGe.setTranslationY(0.0f);
    }

    public final void LIZIZ(List<? extends InteractStickerStruct> list, Aweme aweme, C705930RmZ c705930RmZ, C2189821An6 c2189821An6) {
        C0OD3.LIZ.getClass();
        List<InteractStickerStruct> listLIZJ = C0OD3.LIZJ(list);
        this.LLILLJJLI = listLIZJ;
        C19602911ml.LIZ.getClass();
        this.LLILLJJLI = C19602911ml.LIZLLL(listLIZJ);
        this.LLILLL = c705930RmZ;
        this.LLILZ = aweme;
        C19602911ml.LIZ(aweme, c705930RmZ, c2189821An6);
        C0RFT c0rft = this.LL;
        if (c0rft != null) {
            c0rft.LIZLLL(this.LLILLJJLI, null, c705930RmZ, aweme);
        }
    }

    public static void LIZLLL(C692980RGe c692980RGe, C1866270yfJ c1866270yfJ, boolean z, C705930RmZ c705930RmZ, LifecycleOwner lifecycleOwner) {
        boolean z2;
        int width;
        int height;
        C0RFT c0rft;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Integer numValueOf = Integer.valueOf(c692980RGe.getLayoutParams().width);
        if (numValueOf.intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            width = numValueOf.intValue();
        } else {
            width = c692980RGe.getWidth();
        }
        Integer numValueOf2 = Integer.valueOf(c692980RGe.getLayoutParams().height);
        if (numValueOf2.intValue() > 0) {
            height = numValueOf2.intValue();
        } else {
            height = c692980RGe.getHeight();
        }
        c692980RGe.LL = StickerContainerService.LIZ().LJIJI();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c692980RGe.getContext());
        if (c19egLIZIZ != null && (c0rft = c692980RGe.LL) != null) {
            EnumC19589411ka enumC19589411ka = EnumC19589411ka.INTERACT;
            C19592311l3 c19592311l3 = new C19592311l3(width, height, 1.0f);
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = c19egLIZIZ;
            }
            c0rft.LIZJ(new C19591211ks(enumC19589411ka, c692980RGe, c19592311l3, c19egLIZIZ, c1866270yfJ, c705930RmZ, null, null, null, null, z, lifecycleOwner2, null, null, 13248));
        }
    }
}
