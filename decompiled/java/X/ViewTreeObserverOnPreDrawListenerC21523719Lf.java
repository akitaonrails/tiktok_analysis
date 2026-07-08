package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ViewTreeObserverOnPreDrawListenerC21523719Lf implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC21523719Lf viewTreeObserverOnPreDrawListenerC21523719Lf) {
        ((C21462318yz) viewTreeObserverOnPreDrawListenerC21523719Lf.l0).postInvalidateOnAnimation();
        ((C21462318yz) viewTreeObserverOnPreDrawListenerC21523719Lf.l0).getClass();
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC21523719Lf viewTreeObserverOnPreDrawListenerC21523719Lf) {
        AiChatRoomRootScene aiChatRoomRootScene = (AiChatRoomRootScene) viewTreeObserverOnPreDrawListenerC21523719Lf.l0;
        aiChatRoomRootScene.LLLLL(0.0f, 1.0f, new AwS576S0100000_32(aiChatRoomRootScene, 705));
        C786410Ut5.D3(((AiChatRoomRootScene) viewTreeObserverOnPreDrawListenerC21523719Lf.l0).mView.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC21523719Lf);
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC21523719Lf viewTreeObserverOnPreDrawListenerC21523719Lf) {
        ((C214833195r) viewTreeObserverOnPreDrawListenerC21523719Lf.l0).LJIJJLI(false);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC21523719Lf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
