package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider$provideCustomEvents$2$1$invoke$3", f = "LiveEventCtaAnchorProvider.kt", l = {128}, m = "invokeSuspend")
public final class C1580860rEy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LiveEventCtaAnchorProvider LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ LiveEventModule LLILZIL;
    public final /* synthetic */ n LLILZLL;
    public final /* synthetic */ AnchorCommonStruct LLIZ;
    public final /* synthetic */ WeakReference<C704830Rkn> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580860rEy(boolean z, LiveEventCtaAnchorProvider liveEventCtaAnchorProvider, Aweme aweme, LiveEventModule liveEventModule, n nVar, AnchorCommonStruct anchorCommonStruct, WeakReference<C704830Rkn> weakReference, String str, InterfaceC1364105Vn<? super C1580860rEy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = liveEventCtaAnchorProvider;
        this.LLILZ = aweme;
        this.LLILZIL = liveEventModule;
        this.LLILZLL = nVar;
        this.LLIZ = anchorCommonStruct;
        this.LLIZLLLIL = weakReference;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1580860rEy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C704830Rkn c704830Rkn;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C19EG c19egLIZ;
        User author;
        User author2;
        C1C7U.LIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String uid = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C468920IaA c468920IaA = new C468920IaA(this.LLILLJJLI, this.LLILLL, this.LLJ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c468920IaA);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            if (this.LLILLJJLI) {
                LiveEventCtaAnchorProvider liveEventCtaAnchorProvider = this.LLILLL;
                Aweme aweme = this.LLILZ;
                liveEventCtaAnchorProvider.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_cancel");
                liveEventCtaAnchorProvider.LIZ(c474500IjALIZ, aweme);
                if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                    uid = author2.getUid();
                }
                c474500IjALIZ.LJJII(uid, "anchor_id");
                c474500IjALIZ.LJJII("anchor", "register_position");
                c474500IjALIZ.LIZ();
            } else {
                LiveEventCtaAnchorProvider liveEventCtaAnchorProvider2 = this.LLILLL;
                Aweme aweme2 = this.LLILZ;
                liveEventCtaAnchorProvider2.getClass();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_event_register_success");
                liveEventCtaAnchorProvider2.LIZ(c474500IjALIZ2, aweme2);
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    uid = author.getUid();
                }
                c474500IjALIZ2.LJJII(uid, "anchor_id");
                c474500IjALIZ2.LJJII("anchor", "register_position");
                c474500IjALIZ2.LIZ();
            }
        } else {
            this.LLILZIL.subscribed = this.LLILLJJLI;
            this.LLILZLL.LJJIIJ("live_event_info", GsonProtectorUtils.toJson((Gson) this.LLILLL.LLILLJJLI.getValue(), this.LLILZIL));
            this.LLIZ.setExtra(this.LLILZLL.toString());
            C1440005kM.LIZ(new C2038007yc("fallback", Collections.singletonList("sync_state_action_timing"), C0RY8.LIZ(this.LLILZ.getAid())));
            WeakReference<C704830Rkn> weakReference = this.LLIZLLLIL;
            if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c19egLIZ = C0O0B.LIZ(c690870R8bInvoke)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131837960);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
