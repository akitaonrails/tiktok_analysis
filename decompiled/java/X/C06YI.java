package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media.PhotoSwapInlineEntranceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media.PhotoSwapInlineEntranceAssem$onCreate$2$1", f = "PhotoSwapInlineEntranceAssem.kt", l = {94}, m = "invokeSuspend")
public final class C06YI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;
    public final /* synthetic */ PhotoSwapInlineEntranceAssem LLILZ;
    public final /* synthetic */ C1684506ih LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YI(SessionInfo sessionInfo, PhotoSwapInlineEntranceAssem photoSwapInlineEntranceAssem, C1684506ih c1684506ih, C013C c013c, InterfaceC1364105Vn<? super C06YI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sessionInfo;
        this.LLILZ = photoSwapInlineEntranceAssem;
        this.LLILZIL = c1684506ih;
        this.LLILZLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06YI c06yi = new C06YI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c06yi.LLILLJJLI = obj;
        return c06yi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            IPromptUnifiedFrequencyController.LIZ.getClass();
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
            String uuid = this.LLILLL.getUuid();
            EnumC1674506h5 enumC1674506h5 = EnumC1674506h5.PHOTO_SWAP_INTRO;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyControllerLIZ.LJII(uuid, enumC1674506h5, null, System.currentTimeMillis(), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1");
            return unit;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C06YJ(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSwapInlineEntranceAssem@a2f5.onCreate$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
