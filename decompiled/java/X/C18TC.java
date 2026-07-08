package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18TC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TC extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final C18TE LLIZLLLIL = new Object() { // from class: X.18TE
    };
    public static final int LLJ = 8;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public final C05YF LLILLL = this;
    public final C18UJ LLILZ = (C18UJ) getDiContainer().LJII(C18UJ.class, null);
    public final InterfaceC497601wk LLILZIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C18TD LLILZLL = new InterfaceC1727306pb() { // from class: X.18TD
        @Override // X.InterfaceC1727306pb
        public final void LIZ(int i, int i2) {
            AIChatGenChatRoomModel aIChatGenChatRoomModel = this.LIZ.LLILZ.LJ.chatRoomModel;
            if (aIChatGenChatRoomModel != null) {
                aIChatGenChatRoomModel.quota = i2;
            }
        }
    };
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(129));

    private final void G2() {
        C18T2 c18t2 = C18T2.LIZ;
        String str = this.LLILZ.LIZLLL;
        c18t2.getClass();
        C18T2.LIZJ = str;
        AIChatGenChatRoomModel aIChatGenChatRoomModel = this.LLILZ.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null) {
            C1727006pY.LIZ.getClass();
            aIChatGenChatRoomModel.quota = C1727006pY.LIZIZ();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C21289118Sz(this, null), 3);
        C432070Gwv.LJ(this.LL.requireFragmentActivity());
    }

    private final void W1() {
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LL);
        if (abstractC214814194yLIZ != null) {
            abstractC214814194yLIZ.finish();
            return;
        }
        Activity activity = this.LL.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    private final ICrashReportService X1() {
        return (ICrashReportService) this.LLIZ.getValue();
    }

    private final CreationChatRoomEnterParams Z1() {
        Bundle bundle = this.LL.mArguments;
        Serializable serializable = bundle != null ? bundle.getSerializable("enter_params") : null;
        if (serializable instanceof CreationChatRoomEnterParams) {
            return (CreationChatRoomEnterParams) serializable;
        }
        return null;
    }

    private final void w2() {
        C1727006pY.LIZ.getClass();
        C1727006pY.LIZ();
        C09IC.LJJI(this.LLILZIL, new C861640Xr8(new C18T8(null), C21163117rp.LIZIZ().LJ()));
    }

    private final void H2() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0J8O(null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        CreationChatRoomEnterParams creationChatRoomEnterParamsZ1 = Z1();
        if (creationChatRoomEnterParamsZ1 == null) {
            W1();
        } else {
            ICrashReportService iCrashReportServiceX1 = X1();
            String str = creationChatRoomEnterParamsZ1.shootWay;
            if (str == null) {
                str = "";
            }
            iCrashReportServiceX1.setCustomTag("ct_ai_chat", str);
            G2();
            C1727006pY c1727006pY = C1727006pY.LIZ;
            C18TD c18td = this.LLILZLL;
            c1727006pY.getClass();
            C1727006pY.LIZLLL.add(c18td);
        }
        H2();
        w2();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1727006pY c1727006pY = C1727006pY.LIZ;
        C18TD c18td = this.LLILZLL;
        c1727006pY.getClass();
        C1727006pY.LIZLLL.remove(c18td);
        X1().setCustomTag("ct_ai_chat", "");
        C2296808zG.LIZJ(this.LLILZIL, null);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final AbstractC214814194y o2() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.18TD] */
    public C18TC(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }
}
