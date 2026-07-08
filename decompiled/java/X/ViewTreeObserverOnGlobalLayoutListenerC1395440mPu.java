package X;

import X.C1C7U;
import X.InterfaceC1395470mPx;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ILandscapeFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.input.view.CommonKeyboardFakePopupWindow$handler$1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1395440mPu extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final Keva LLJI = Keva.getRepo("common_keyboard_cache_value");
    public static int LLJIJIL;
    public final Context LL;
    public final View LLILLJJLI;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final CommonKeyboardFakePopupWindow$handler$1 LLIZLLLIL;
    public InterfaceC1395470mPx LLJ;
    public final int LLILLL = 6;
    public final Rect LLIZ = new Rect();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activityLIZIZ;
        ILandscapeFeedService iLandscapeFeedService;
        int iLJIIIIZZ;
        Activity activityLIZIZ2;
        Activity activityLIZ;
        Window window;
        View decorView;
        View viewFindViewById;
        View viewFindViewById2;
        if (this.LLILZ == 0) {
            Activity activityLIZ2 = C1388190mED.LIZ(this.LL);
            if (activityLIZ2 == null || (viewFindViewById2 = activityLIZ2.findViewById(R.id.eu1)) == null) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                iLJIIIIZZ = (abstractC1387200mCcLJ == null || (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ2)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.eu1)) == null) ? C12ES.LJIIIIZZ(C1388190mED.LIZ(this.LL)) : viewFindViewById.getHeight();
            } else {
                iLJIIIIZZ = viewFindViewById2.getHeight();
            }
            this.LLILZ = iLJIIIIZZ;
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            this.LLILZ = view.getHeight();
        }
        getContentView().getWindowVisibleDisplayFrame(this.LLIZ);
        int i = this.LLIZ.bottom;
        if (i > this.LLILZ) {
            this.LLILZ = i;
        }
        int i2 = this.LLILZ - i;
        Activity activityLIZ3 = C1388190mED.LIZ(this.LL);
        boolean z = (activityLIZ3 == null || (iLandscapeFeedService = (ILandscapeFeedService) PluggableExtentionKt.pluggableSpi$default(ILandscapeFeedService.class, false, false, false, 14, null)) == null || !iLandscapeFeedService.LIZ(activityLIZ3)) ? false : true;
        double d = i2;
        int i3 = this.LLILZ;
        if (d <= ((double) i3) * 0.62d || z) {
            boolean z2 = i2 > i3 / this.LLILLL;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (Intrinsics.LJFF((abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ), this.LL)) {
                if (z2) {
                    this.LLILZIL = true;
                    int i4 = this.LLILZLL;
                    if (i2 != i4 && i2 > i4) {
                        Message messageObtainMessage = obtainMessage(1);
                        messageObtainMessage.arg1 = i2;
                        removeMessages(1);
                        C786410Ut5.LJLJLJ(this.LLIZLLLIL, messageObtainMessage, 0L);
                    }
                    if (this.LLILZLL != i2 && i2 > 0) {
                        InterfaceC1395470mPx interfaceC1395470mPx = this.LLJ;
                        if (interfaceC1395470mPx != null) {
                            interfaceC1395470mPx.j(i2);
                        }
                        int i5 = LLJIJIL;
                        if (i5 == 0) {
                            i5 = LLJI.getInt("key_board_height", 0);
                        }
                        if (i5 != i2) {
                            LLJIJIL = i2;
                            LLJI.storeInt("key_board_height", i2);
                        }
                    }
                    this.LLILZLL = i2;
                    return;
                }
            } else if (!this.LLILZIL || z2) {
                return;
            }
            if (this.LLILZIL) {
                this.LLILZIL = false;
                this.LLILZLL = 0;
                InterfaceC1395470mPx interfaceC1395470mPx2 = this.LLJ;
                if (interfaceC1395470mPx2 != null) {
                    interfaceC1395470mPx2.LLILII();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.friendstab.ui.input.view.CommonKeyboardFakePopupWindow$handler$1] */
    public ViewTreeObserverOnGlobalLayoutListenerC1395440mPu(C19EG c19eg, View view) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLIZLLLIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.friendstab.ui.input.view.CommonKeyboardFakePopupWindow$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("CommonKeyboardFakePopupWindow@167d.handler$1");
                super.handleMessage(message);
                InterfaceC1395470mPx interfaceC1395470mPx = this.LL.LLJ;
                if (interfaceC1395470mPx != null) {
                    interfaceC1395470mPx.LLLLZI(message.arg1);
                }
                C1C7U.LIZIZ("CommonKeyboardFakePopupWindow@167d.handler$1");
            }
        };
        View view2 = new View(c19eg);
        view2.setId(R.id.m2n);
        setContentView(view2);
        setWidth(0);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
        setWindowLayoutType(1003);
    }
}
