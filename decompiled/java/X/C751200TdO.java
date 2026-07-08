package X;

import android.widget.CompoundButton;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.controller.FilterCommentController$update$1", f = "FilterCommentController.kt", l = {292}, m = "invokeSuspend")
public final class C751200TdO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C751260TdU LLILLJJLI;
    public final /* synthetic */ HashMap<Integer, Boolean> LLILLL;
    public final /* synthetic */ Observer<Unit> LLILZ;
    public final /* synthetic */ CompoundButton LLILZIL;
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751200TdO(C751260TdU c751260TdU, HashMap<Integer, Boolean> map, Observer<Unit> observer, CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InterfaceC1364105Vn<? super C751200TdO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c751260TdU;
        this.LLILLL = map;
        this.LLILZ = observer;
        this.LLILZIL = compoundButton;
        this.LLILZLL = onCheckedChangeListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751200TdO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        C1C7U.LIZ("FilterCommentController@ed1e.update$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z4 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C751260TdU c751260TdU = this.LLILLJJLI;
                HashMap<Integer, Boolean> map = this.LLILLL;
                DataChannel dataChannel = c751260TdU.LJFF;
                this.LL = 1;
                if (c751260TdU.LIZJ(map, dataChannel, this) == objLJFF) {
                    C1C7U.LIZIZ("FilterCommentController@ed1e.update$1");
                    return objLJFF;
                }
            }
            CommentSwitchSettings commentSwitchSettings = this.LLILLJJLI.LJIIJ;
            HashMap<Integer, Boolean> map2 = this.LLILLL;
            Boolean bool = map2.get(C2286608xc.LJ(13));
            if (bool != null) {
                if (bool.booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                commentSwitchSettings.chatSpamComments = C750850Tcp.LIZIZ(z3);
            }
            Boolean bool2 = map2.get(C2286608xc.LJ(4));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                commentSwitchSettings.chatL2 = C750850Tcp.LIZIZ(z2);
            }
            Boolean bool3 = map2.get(C2286608xc.LJ(8));
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                commentSwitchSettings.chatCommunityFlagged = C750850Tcp.LIZIZ(z);
            }
            Boolean bool4 = map2.get(C2286608xc.LJ(9));
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    z4 = false;
                }
                commentSwitchSettings.chatCommunityFlaggedReview = C750850Tcp.LIZIZ(z4);
            }
            DataChannelGlobal.LLILZ.FQ2(FilterCommentChangeEvent.class, this.LLILLJJLI.LJIIJ);
            Observer<Unit> observer = this.LLILZ;
            if (observer != null) {
                observer.onChanged(Unit.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C751260TdU c751260TdU2 = this.LLILLJJLI;
            CompoundButton compoundButton = this.LLILZIL;
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LLILZLL;
            c751260TdU2.getClass();
            if (onCheckedChangeListener != null) {
                if (compoundButton != null) {
                    C786410Ut5.w7(compoundButton, null);
                }
                if (compoundButton != null) {
                    compoundButton.toggle();
                }
                if (compoundButton != null) {
                    C786410Ut5.w7(compoundButton, onCheckedChangeListener);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FilterCommentController@ed1e.update$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
