package X;

import Y.AfS171S0100000_2;
import Y.AfS181S0100000_12;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.IllegalReviewDialog;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0UVT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVT extends C0JSV<C0UVU> implements WeakHandler.IHandler {
    public static final Spannable LLJIJIL = new SpannableString("");
    public final String LL;
    public final long LLILLJJLI;
    public C11JF LLILZIL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public IllegalReviewDialog LLJI;
    public int LLILZ = 10;
    public int LLILZLL = 1;
    public final WeakHandler LLILLL = new WeakHandler(this);

    public final void LJJJJLL() {
        this.LLILLL.removeMessages(1);
        this.LLILLL.removeMessages(2);
        this.LLILZLL = 1;
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
            this.LLILZIL = null;
        }
        T t = this.mView;
        if (t != 0) {
            ((C0UVU) t).DE(false);
            this.LLIZ = false;
        }
        IllegalReviewDialog illegalReviewDialog = this.LLJI;
        if (illegalReviewDialog != null) {
            illegalReviewDialog.dismiss();
        }
    }

    public final void LJJJJZI() {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((C0UVU) t).cG();
        C464950ILd c464950ILd = C464950ILd.LJI;
        WeakHandler weakHandler = this.LLILLL;
        long j = this.LLILLJJLI;
        c464950ILd.getClass();
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).unblockRoom(j).LJIILIIL(new C0UO0()).LJJLL(C0J1R.LIZIZ, new AfS171S0100000_2((Object) weakHandler, 27));
    }

    @Override // X.C0JSV
    public final void detachView() {
        super.detachView();
        this.LLILLL.removeMessages(1);
        this.LLILLL.removeMessages(2);
    }

    public C0UVT(long j) {
        this.LLILLJJLI = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131853431));
        sbLIZ.append("（%ds）");
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJJJLI(RemindMessage remindMessage) {
        Spannable spannableLJIILIIL;
        T t = this.mView;
        if (t != 0 && remindMessage != null) {
            int i = remindMessage.noticeType;
            if (2 == i) {
                if (this.LLILZLL == 1) {
                    this.LLILZLL = 2;
                    this.LLILZ = 10;
                    ((C0UVU) t).hM(C497740JfY.LJIJI(2131853432));
                    C0UVU c0uvu = (C0UVU) this.mView;
                    Spannable spannable = LLJIJIL;
                    C1133830fbx.LJIILIIL(remindMessage.violationReason, "");
                    if (remindMessage.supportDisplayText()) {
                        spannableLJIILIIL = C1133830fbx.LJIILIIL(remindMessage.baseMessage.displayText, "");
                    } else {
                        spannableLJIILIIL = spannable;
                    }
                    CharSequence charSequence = spannableLJIILIIL;
                    if (spannableLJIILIIL == spannable) {
                        charSequence = spannableLJIILIIL;
                        if (!TextUtils.isEmpty(remindMessage.content)) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C497740JfY.LJIJI(2131856868));
                            C786410Ut5.o2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.a6p)), 8, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.insert(0, (CharSequence) (C497740JfY.LJIJI(2131853532) + remindMessage.content + "\n"));
                            charSequence = spannableStringBuilder;
                        }
                    }
                    c0uvu.EB(charSequence);
                    String strK4 = C786410Ut5.k4(Locale.getDefault(), this.LL, new Object[]{Integer.valueOf(this.LLILZ)});
                    ((C0UVU) this.mView).f5();
                    ((C0UVU) this.mView).Lj(strK4, false);
                    ((C0UVU) this.mView).DE(true);
                    this.LLILLL.sendEmptyMessageDelayed(1, 600000L);
                    C11JF c11jf = this.LLILZIL;
                    if (c11jf == null || c11jf.isDisposed()) {
                        this.LLILZIL = (C11JF) C19490011Na.LIZLLL(0L, 10L, 1000L, 1000L, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJIIJZLJL(new C786170Ush(this, 1)).LJJLJLI(new AfS181S0100000_12(this, 29));
                        return;
                    }
                    return;
                }
                return;
            }
            if (3 != i || this.LLILZLL == 1) {
                return;
            }
            ((C0UVU) t).GK();
            LJJJJLL();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        T t = this.mView;
        if (t != 0 && this.LLILZLL != 1) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 25 && (HandlerHook.getMessageObj(message.obj) instanceof C501520Jle) && this.mView != 0) {
                        LJJJJLL();
                        return;
                    }
                    return;
                }
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C01QD.LIZ().LIZ().getReviewInfo(this.LLILLJJLI).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(this, 27), new AfS181S0100000_12(this, 28));
                return;
            }
            ((C0UVU) t).UI();
        }
    }
}
