package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.StoreStickerCardReusedUISlot;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.MixStudioIdDropdownViewModel;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;

/* JADX INFO: renamed from: X.0IDR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDR implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(C0IDR c0idr, View view) {
    }

    public static final void onViewAttachedToWindow$9(C0IDR c0idr, View view) {
    }

    public static final void onViewDetachedFromWindow$4(C0IDR c0idr, View view) {
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
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
            case 8:
                onViewAttachedToWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewAttachedToWindow$9(this, view);
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
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewDetachedFromWindow$9(this, view);
                break;
        }
    }

    public C0IDR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(C0IDR c0idr, View view) {
        ((ReusedSkeletonUIContentAssem) c0idr.l0).dp();
    }

    public static final void onViewAttachedToWindow$2(C0IDR c0idr, View view) {
        ((GifCardReusedUISlot) c0idr.l0).LLJLL.LIZIZ("sticker_store");
    }

    public static final void onViewAttachedToWindow$3(C0IDR c0idr, View view) {
        StoreStickerCardReusedUISlot storeStickerCardReusedUISlot = (StoreStickerCardReusedUISlot) c0idr.l0;
        storeStickerCardReusedUISlot.LLJZ.LIZIZ(storeStickerCardReusedUISlot.Bp());
    }

    public static final void onViewAttachedToWindow$4(C0IDR c0idr, View view) {
        ((View) c0idr.l0).removeOnAttachStateChangeListener(c0idr);
        C786410Ut5.T4(view, 0.0f);
        view.animate().alpha(1.0f).setDuration(200L).start();
    }

    public static final void onViewAttachedToWindow$5(C0IDR c0idr, View view) {
        ((C441190HRt) c0idr.l0).LLIZ.setCurrentState(Lifecycle.State.CREATED);
        ((C441190HRt) c0idr.l0).LLIZ.setCurrentState(Lifecycle.State.STARTED);
        ((C441190HRt) c0idr.l0).LLIZ.setCurrentState(Lifecycle.State.RESUMED);
        C441190HRt c441190HRt = (C441190HRt) c0idr.l0;
        if (!c441190HRt.LLJILJIL) {
            c441190HRt.LLJILJIL = true;
            MixStudioIdDropdownViewModel mixStudioIdDropdownViewModelLJIIL = c441190HRt.LJIIL();
            c441190HRt.selectSubscribe(mixStudioIdDropdownViewModelLJIIL, new C2217381BqS() { // from class: X.0HRz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C0HRK) obj).LLILLL);
                }
            }, new C2217381BqS() { // from class: X.0HRs
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HRK) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0HRI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HRK) obj).LLILZ;
                }
            }, C736820SvI.LIZIZ(mixStudioIdDropdownViewModelLJIIL.usedInReusedScene), null, new C0IE5(c441190HRt, 6));
            C736680Sv4.LJIIIZ(c441190HRt, c441190HRt.LJIIL(), new C2217381BqS() { // from class: X.0HS0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C0HRK) obj).LLILLL);
                }
            }, new C2217381BqS() { // from class: X.0HRy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HRK) obj).LL;
                }
            }, C736820SvI.LJ(), new AwS655S0100000_6(c441190HRt, 11), 8);
            C736680Sv4.LJIIIIZZ(c441190HRt, c441190HRt.LJIIL(), new C2217381BqS() { // from class: X.0HRM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0HRK) obj).LLILLJJLI;
                }
            }, null, new AwS620S0100000_6(c441190HRt, 135), 6);
        }
    }

    public static final void onViewAttachedToWindow$6(C0IDR c0idr, View view) {
        ((BaseSkeletonUISlotAssem) c0idr.l0).getClass();
    }

    public static final void onViewAttachedToWindow$7(C0IDR c0idr, View view) {
        C036E.LIZ.LIZ(((Lemon8ImageAssem) c0idr.l0).LLJLLIL);
    }

    public static final void onViewAttachedToWindow$8(C0IDR c0idr, View view) {
        if (view.getViewTreeObserver().isAlive()) {
            C786410Ut5.y3(view.getViewTreeObserver(), (ViewTreeObserver.OnPreDrawListener) c0idr.l0);
        }
    }

    public static final void onViewDetachedFromWindow$0(C0IDR c0idr, View view) {
        try {
            C0XQ7.LJFF().LJIILLIIL((InterfaceC427710Gpt) c0idr.l0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void onViewDetachedFromWindow$1(C0IDR c0idr, View view) {
        ((ReusedSkeletonUIContentAssem) c0idr.l0).getClass();
    }

    public static final void onViewDetachedFromWindow$2(C0IDR c0idr, View view) {
        ((GifCardReusedUISlot) c0idr.l0).LLJLL.LIZLLL("sticker_store");
    }

    public static final void onViewDetachedFromWindow$3(C0IDR c0idr, View view) {
        StoreStickerCardReusedUISlot storeStickerCardReusedUISlot = (StoreStickerCardReusedUISlot) c0idr.l0;
        storeStickerCardReusedUISlot.LLJZ.LIZLLL(storeStickerCardReusedUISlot.Bp());
    }

    public static final void onViewDetachedFromWindow$5(C0IDR c0idr, View view) {
        AnonymousClass0956 anonymousClass0956 = ((C441190HRt) c0idr.l0).LLJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C441190HRt c441190HRt = (C441190HRt) c0idr.l0;
        c441190HRt.LLJIJIL = null;
        c441190HRt.LLIZ.setCurrentState(Lifecycle.State.DESTROYED);
    }

    public static final void onViewDetachedFromWindow$6(C0IDR c0idr, View view) {
        ((BaseSkeletonUISlotAssem) c0idr.l0).getClass();
    }

    public static final void onViewDetachedFromWindow$7(C0IDR c0idr, View view) {
        C036E.LIZ.LIZLLL(((Lemon8ImageAssem) c0idr.l0).LLJLLIL);
    }

    public static final void onViewDetachedFromWindow$8(C0IDR c0idr, View view) {
        if (view.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(view.getViewTreeObserver(), (ViewTreeObserver.OnPreDrawListener) c0idr.l0);
        }
    }

    public static final void onViewDetachedFromWindow$9(C0IDR c0idr, View view) {
        ((C423960Gjq) c0idr.l0).dismiss();
    }
}
