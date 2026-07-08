package X;

import Y.ARunnableS131S0100000_31;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20534115Wp implements IFrameSlot, InterfaceC20533915Wn {
    public Room LL;
    public IFrameSlot.SlotViewModel LLILLJJLI;
    public C20534015Wo LLILLL;
    public View LLILZ;
    public C20534415Ws LLILZIL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJIJJ(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceC20533915Wn
    public final void LIZ() {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        AnimatorSet animatorSet;
        C20534415Ws c20534415Ws = this.LLILZIL;
        if (c20534415Ws != null && (animatorSet = c20534415Ws.LIZIZ) != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            C21213217zu c21213217zu = C21213217zu.LIZ;
            Room room = this.LL;
            C21212917zr c21212917zrLIZIZ = c21213217zu.LIZIZ(room != null ? Long.valueOf(room.getId()) : null);
            if (c21212917zrLIZIZ != null) {
                c21212917zrLIZIZ.LIZLLL("show_anim", "screen_clear", false);
            }
        }
        IFrameSlot.SlotViewModel slotViewModel2 = this.LLILLJJLI;
        if (slotViewModel2 != null) {
            C21207817z2.LIZIZ(slotViewModel2, false);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        C20534015Wo c20534015Wo = this.LLILLL;
        if (c20534015Wo != null) {
            View view = this.LLILZ;
            if (view == null) {
                view = null;
            }
            ((TextView) view.findViewById(R.id.jb4)).setText(c20534015Wo.LIZ);
            View view2 = this.LLILZ;
            if (view2 == null) {
                view2 = null;
            }
            ImageView imageView = (ImageView) view2.findViewById(R.id.jas);
            if (imageView != null && (bitmap3 = (Bitmap) C13LP.LJJJLZIJ(0, c20534015Wo.LIZIZ)) != null) {
                imageView.setImageBitmap(bitmap3);
            }
            View view3 = this.LLILZ;
            if (view3 == null) {
                view3 = null;
            }
            ImageView imageView2 = (ImageView) view3.findViewById(R.id.jau);
            if (imageView2 != null && (bitmap2 = (Bitmap) C13LP.LJJJLZIJ(1, c20534015Wo.LIZIZ)) != null) {
                imageView2.setImageBitmap(bitmap2);
            }
            View view4 = this.LLILZ;
            if (view4 == null) {
                view4 = null;
            }
            ImageView imageView3 = (ImageView) view4.findViewById(R.id.jax);
            if (imageView3 != null && (bitmap = (Bitmap) C13LP.LJJJLZIJ(2, c20534015Wo.LIZIZ)) != null) {
                imageView3.setImageBitmap(bitmap);
            }
            View view5 = this.LLILZ;
            if (view5 == null) {
                view5 = null;
            }
            HandlerHook.viewPost(view5, new ARunnableS131S0100000_31(this, 2));
        }
        return null;
    }

    @Override // X.InterfaceC20533915Wn
    public final void onFail() {
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, false);
        }
        C1440005kM.LIZ(new C591940NJo(7, false));
    }

    @Override // X.InterfaceC20533915Wn
    public final void LIZIZ(C20534015Wo c20534015Wo) {
        this.LLILLL = c20534015Wo;
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, true);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJIJI(Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bw1, null, false);
        this.LLILZ = viewTd;
        if (viewTd == null) {
            viewTd = null;
        }
        View viewFindViewById = viewTd.findViewById(R.id.jb0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZ(8));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewTd.getContext()));
        View view = this.LLILZ;
        if (view == null) {
            return null;
        }
        return view;
    }
}
