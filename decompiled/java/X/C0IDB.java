package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileCell;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0IDB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDB extends ViewOutlineProvider {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            case 2:
                getOutline$2(this, view, outline);
                break;
            case 3:
                getOutline$3(this, view, outline);
                break;
            case 4:
                getOutline$4(this, view, outline);
                break;
            case 5:
                getOutline$5(this, view, outline);
                break;
            case 6:
                getOutline$6(this, view, outline);
                break;
            case 7:
                getOutline$7(this, view, outline);
                break;
            case 8:
                getOutline$8(this, view, outline);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                getOutline$9(this, view, outline);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                getOutline$10(this, view, outline);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                getOutline$11(this, view, outline);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                getOutline$12(this, view, outline);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                getOutline$13(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C0IDB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C0IDB c0idb, View view, Outline outline) {
        int width;
        int height;
        if (outline != null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            ((C429770GtD) c0idb.l0).getClass();
            outline.setRoundRect(0, 0, width, height, C497740JfY.LIZIZ(12.0f));
        }
    }

    public static final void getOutline$1(C0IDB c0idb, View view, Outline outline) {
        float strokeWidth = ((C418450Gax) c0idb.l0).LLIZLLLIL.getStrokeWidth() / 2;
        float f = 1;
        int i = (int) (strokeWidth - f);
        outline.setRoundRect(i, i, (int) ((view.getWidth() - strokeWidth) + f), view.getHeight() + 1, ((C418450Gax) c0idb.l0).LLJ);
    }

    public static final void getOutline$10(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(8.0f, ((EcStoreLiveAssem) c0idb.l0).getContext()));
    }

    public static final void getOutline$11(C0IDB c0idb, View view, Outline outline) {
        if (view != null) {
            AdProductTileCell adProductTileCell = (AdProductTileCell) c0idb.l0;
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(4.0f, adProductTileCell.itemView.getContext()));
            }
        }
    }

    public static final void getOutline$12(C0IDB c0idb, View view, Outline outline) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) c0idb.l0;
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(8.0f, frameLayout.getContext()));
            }
        }
    }

    public static final void getOutline$13(C0IDB c0idb, View view, Outline outline) {
        if (view != null) {
            View view2 = (View) c0idb.l0;
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(8.0f, view2.getContext()));
            }
        }
    }

    public static final void getOutline$2(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((AbstractC443520HaI) c0idb.l0).LJI);
    }

    public static final void getOutline$3(C0IDB c0idb, View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((float[]) c0idb.l0)[0]);
        }
    }

    public static final void getOutline$4(C0IDB c0idb, View view, Outline outline) {
        if (((Float) c0idb.l0) != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Float) c0idb.l0).floatValue());
        }
    }

    public static final void getOutline$5(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Integer) c0idb.l0).intValue());
    }

    public static final void getOutline$6(C0IDB c0idb, View view, Outline outline) {
        Object c098200Yq;
        try {
            c098200Yq = Float.valueOf(view.getResources().getDimension(((C432110Gwz) c0idb.l0).LIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Float fValueOf = Float.valueOf(10.0f);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = fValueOf;
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), ((Number) c098200Yq).floatValue());
    }

    public static final void getOutline$7(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(8.0f, ((C676180Qfg) c0idb.l0).getContext()));
    }

    public static final void getOutline$8(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(4.0f, ((C676180Qfg) c0idb.l0).getContext()));
    }

    public static final void getOutline$9(C0IDB c0idb, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C417620GZc) c0idb.l0).LL);
    }
}
