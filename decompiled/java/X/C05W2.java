package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.ChatInviteAcceptResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05W2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.viewmodel.ChatInviteViewModelImpl$acceptChatInvite$1", f = "ChatInviteViewModelImpl.kt", l = {56}, m = "invokeSuspend")
public final class C05W2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MutableLiveData LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ChatInviteViewModelImpl LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05W2(ChatInviteViewModelImpl chatInviteViewModelImpl, String str, InterfaceC1364105Vn<? super C05W2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = chatInviteViewModelImpl;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05W2 c05w2 = new C05W2(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05w2.LLILLL = obj;
        return c05w2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveData liveData;
        LiveData liveData2;
        Long lLJIILIIL;
        LiveData liveData3;
        Integer numLJ;
        LiveData liveData4;
        MutableLiveData<Integer> mutableLiveData;
        int iIntValue;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        C1C7U.LIZ("ChatInviteViewModelImpl@bfd4.acceptChatInvite$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                MutableLiveData<Integer> mutableLiveData4 = this.LL;
                liveData = (LiveData) this.LLILLL;
                try {
                    C155000ia.LIZIZ(obj);
                    liveData3 = liveData;
                    mutableLiveData3 = mutableLiveData4;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    numLJ = C2286608xc.LJ(-1);
                    liveData4 = liveData;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MutableLiveData<Integer> mutableLiveData5 = this.LLILZ.LL;
            try {
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(curUserId)) != null) {
                    ChatInviteViewModelImpl chatInviteViewModelImpl = this.LLILZ;
                    String str = this.LLILZIL;
                    long jLongValue = lLJIILIIL.longValue();
                    TikTokImApi tikTokImApi = chatInviteViewModelImpl.LLILLL;
                    this.LLILLL = mutableLiveData5;
                    this.LL = mutableLiveData5;
                    this.LLILLJJLI = 1;
                    obj = tikTokImApi.acceptChatInvite(str, jLongValue, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("ChatInviteViewModelImpl@bfd4.acceptChatInvite$1");
                        return objLJFF;
                    }
                    liveData3 = mutableLiveData5;
                    mutableLiveData3 = mutableLiveData5;
                } else {
                    liveData2 = mutableLiveData5;
                    mutableLiveData2 = mutableLiveData5;
                    iIntValue = -1;
                    liveData = liveData2;
                    mutableLiveData = mutableLiveData2;
                    numLJ = C2286608xc.LJ(iIntValue);
                    liveData4 = mutableLiveData;
                }
            } catch (Exception e2) {
                e = e2;
                liveData = mutableLiveData5;
                TryCatchGuardChecker.doCheck(e);
                numLJ = C2286608xc.LJ(-1);
                liveData4 = liveData;
            }
            liveData4.setValue(numLJ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatInviteViewModelImpl@bfd4.acceptChatInvite$1");
            return unit;
        }
        Integer num = ((ChatInviteAcceptResponse) obj).acceptStatus;
        liveData2 = liveData3;
        mutableLiveData2 = mutableLiveData3;
        if (num == null) {
            iIntValue = -1;
            liveData = liveData2;
            mutableLiveData = mutableLiveData2;
        } else {
            iIntValue = num.intValue();
            liveData = liveData3;
            mutableLiveData = mutableLiveData3;
        }
        numLJ = C2286608xc.LJ(iIntValue);
        liveData4 = mutableLiveData;
        liveData4.setValue(numLJ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatInviteViewModelImpl@bfd4.acceptChatInvite$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
