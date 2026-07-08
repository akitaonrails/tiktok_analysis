package X;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21523419Lc implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            default:
                return false;
        }
    }

    public C21523419Lc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C21523419Lc c21523419Lc, Message message) {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        Pair<Boolean, String> value2;
        if (message.what == 1) {
            AbstractC21194217wq abstractC21194217wq = (AbstractC21194217wq) c21523419Lc.l0;
            InterfaceC21180617ue interfaceC21180617ue = abstractC21194217wq.LLILZ;
            if ((interfaceC21180617ue == null || interfaceC21180617ue.LJIL(abstractC21194217wq)) && (slotViewModel2 = ((AbstractC21194217wq) c21523419Lc.l0).LLJIJIL) != null && (mutableLiveData2 = slotViewModel2.LL) != null && (value2 = mutableLiveData2.getValue()) != null && Intrinsics.LJFF(value2.first, Boolean.TRUE)) {
                ((AbstractC21194217wq) c21523419Lc.l0).LJJIJIIJI().LLLLLLIL();
                return true;
            }
        } else {
            AbstractC21194217wq abstractC21194217wq2 = (AbstractC21194217wq) c21523419Lc.l0;
            InterfaceC21180617ue interfaceC21180617ue2 = abstractC21194217wq2.LLILZ;
            if ((interfaceC21180617ue2 == null || interfaceC21180617ue2.LJIL(abstractC21194217wq2)) && (slotViewModel = ((AbstractC21194217wq) c21523419Lc.l0).LLJIJIL) != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, Boolean.TRUE)) {
                ((AbstractC21194217wq) c21523419Lc.l0).LJJIFFI();
                if (!C1906580ziK.LJI()) {
                    ((AbstractC21194217wq) c21523419Lc.l0).LJJJJZ("time_out");
                    ((AbstractC21194217wq) c21523419Lc.l0).LLJI.LJIIIIZZ = "time_out";
                }
                ((AbstractC21194217wq) c21523419Lc.l0).LJJIJLIJ().LJIIJ();
                return true;
            }
        }
        return true;
    }

    public static final boolean handleMessage$1(C21523419Lc c21523419Lc, Message message) {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        AbstractC21194117wp abstractC21194117wp = (AbstractC21194117wp) c21523419Lc.l0;
        InterfaceC21180717uf interfaceC21180717uf = abstractC21194117wp.LLILZ;
        if ((interfaceC21180717uf != null && !interfaceC21180717uf.LJIILL(abstractC21194117wp)) || (slotViewModel = ((AbstractC21194117wp) c21523419Lc.l0).LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, Boolean.TRUE)) {
            return true;
        }
        ((AbstractC21194117wp) c21523419Lc.l0).LJJIFFI();
        if (!ActivityStack.isAppBackGround()) {
            ((AbstractC21194117wp) c21523419Lc.l0).LJJJLZIJ("time_out");
            ((AbstractC21194117wp) c21523419Lc.l0).LLJI.LJIIIIZZ = "time_out";
        }
        ((AbstractC21194117wp) c21523419Lc.l0).LJJIJL().LJIIJ();
        return true;
    }
}
