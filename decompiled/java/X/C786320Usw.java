package X;

import android.widget.ImageView;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.utils.FeedForestFetchRequestController;

/* JADX INFO: renamed from: X.0Usw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786320Usw implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C786320Usw(Object obj, C05P0<C1294720jnS> c05p0) {
        this.$t = c05p0;
        this.l0 = obj;
    }

    public static final void onResult$0(C786320Usw c786320Usw, Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) c786320Usw.l0;
        C1295960jpS c1295960jpS = bottomLeftSlotWidget.LLIZLLLIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = bottomLeftSlotWidget.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public static final void onResult$1(C786320Usw c786320Usw, Object obj) {
        C1295960jpS c1295960jpS = ((C785060Uqu) c786320Usw.l0).LLJI;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = ((C785060Uqu) c786320Usw.l0).LLJ;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
    }

    public static final void onResult$2(C786320Usw c786320Usw, Object obj) {
        ((FeedForestFetchRequestController) c786320Usw.l0).LIZ(EnumC742810TBv.LOTTIE_COMPOSITION_FAILED, (Throwable) obj);
    }

    public static final void onResult$3(C786320Usw c786320Usw, Object obj) {
        ((IIconSlot.SlotViewModel) c786320Usw.l0).LLJJIJI.setValue(Boolean.FALSE);
    }

    public static final void onResult$4(C786320Usw c786320Usw, Object obj) {
        ((C05P0) c786320Usw.l0).setValue(obj);
    }
}
