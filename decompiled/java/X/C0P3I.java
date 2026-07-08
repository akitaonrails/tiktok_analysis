package X;

import com.ss.android.ugc.aweme.vibefeed.cache.VibeInteractRecord;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.InlineMessageInfo;
import com.ss.android.ugc.aweme.vibefeed.model.VibeReachResponse;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0P3I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel$sendInteractReachMsg$1", f = "VibeFeedConsumeViewModel.kt", l = {252, 265, 292}, m = "invokeSuspend")
public final class C0P3I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VibeFeedConsumeViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C0P3O LLIZ;
    public final /* synthetic */ VibeInteractRecord LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0P3I(VibeFeedConsumeViewModel vibeFeedConsumeViewModel, String str, String str2, String str3, C0P3O c0p3o, VibeInteractRecord vibeInteractRecord, Map<String, String> map, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C0P3I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = vibeFeedConsumeViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c0p3o;
        this.LLIZLLLIL = vibeInteractRecord;
        this.LLJ = map;
        this.LLJI = function0;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0P3I c0p3i = new C0P3I(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c0p3i.LLILLJJLI = obj;
        return c0p3i;
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        Boolean bool;
        ?? r9;
        Integer num;
        Integer num2;
        boolean zZQ2;
        Object objN0 = obj;
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(objN0);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objN0);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
                return unit2;
            }
            C155000ia.LIZIZ(objN0);
            r9 = 1;
        } else {
            C155000ia.LIZIZ(objN0);
            Object obj2 = this.LLILLJJLI;
            C0P3H c0p3h = (C0P3H) this.LLILLL.LL.getValue().getOperator();
            String str = this.LLILZ;
            String str2 = this.LLILLL.LLJI;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            C0P3O c0p3o = this.LLIZ;
            VibeInteractRecord vibeInteractRecord = this.LLIZLLLIL;
            if (vibeInteractRecord != null && (num2 = vibeInteractRecord.likedCnt) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJ = C2286608xc.LJ(iIntValue);
            VibeInteractRecord vibeInteractRecord2 = this.LLIZLLLIL;
            if (vibeInteractRecord2 != null && (num = vibeInteractRecord2.sendMsgCnt) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer numLJ2 = C2286608xc.LJ(iIntValue2);
            VibeInteractRecord vibeInteractRecord3 = this.LLIZLLLIL;
            if (vibeInteractRecord3 != null) {
                bool = vibeInteractRecord3.sendReminderToday;
            } else {
                bool = null;
            }
            InlineMessageInfo inlineMessageInfo = new InlineMessageInfo(numLJ, numLJ2, Boolean.valueOf(C1575980r76.LIZLLL(bool)));
            EnumC912680ZrG enumC912680ZrG = this.LLILLL.LLILZLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            r9 = 1;
            objN0 = c0p3h.n0(str, str2, str3, str4, c0p3o, inlineMessageInfo, enumC912680ZrG, this);
            if (objN0 == objLJFF) {
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
                return objLJFF;
            }
        }
        VibeReachResponse vibeReachResponse = (VibeReachResponse) objN0;
        if (vibeReachResponse == null) {
            Function0<Unit> function0 = this.LLJI;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C05D1 c05d1 = new C05D1(function0, null);
            this.LLILLJJLI = null;
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c05d1) == objLJFF) {
                C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
            return unit22;
        }
        this.LLILLL.LLJ.LIZIZ = r9;
        int i2 = C0P3P.LIZ[this.LLIZ.ordinal()];
        String str5 = "";
        if (i2 != r9) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        zZQ2 = false;
                    } else {
                        C0P31 c0p31 = this.LLILLL.LLILZ;
                        if (c0p31 != null) {
                            C0P3K[] c0p3kArr = new C0P3K[2];
                            c0p3kArr[0] = C0P3K.SEND_INLINE_MSG;
                            c0p3kArr[r9] = C0P3K.SEND_CO_LIKE_CARD;
                            c0p31.LJIJI(C1697810uHb.LJIIJJI(c0p3kArr));
                        }
                        VibeFeedConsumeViewModel vibeFeedConsumeViewModel = this.LLILLL;
                        String str6 = vibeReachResponse.coLikeContentPb;
                        if (str6 != null) {
                            str5 = str6;
                        }
                        zZQ2 = vibeFeedConsumeViewModel.zQ2("ci_share_feed_group_summary", str5, this.LLILZIL, this.LLJ);
                    }
                } else {
                    C0P31 c0p312 = this.LLILLL.LLILZ;
                    if (c0p312 != null) {
                        C0P3K[] c0p3kArr2 = new C0P3K[2];
                        c0p3kArr2[0] = C0P3K.SEND_INLINE_MSG;
                        c0p3kArr2[r9] = C0P3K.SEND_CO_LIKE_CARD;
                        c0p312.LJIJI(C1697810uHb.LJIIJJI(c0p3kArr2));
                    }
                    VibeFeedConsumeViewModel vibeFeedConsumeViewModel2 = this.LLILLL;
                    String str7 = vibeReachResponse.coLikeContentPb;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    zZQ2 = vibeFeedConsumeViewModel2.zQ2("ci_share_feed_summary", str5, this.LLILZIL, this.LLJ);
                }
            } else {
                C0P31 c0p313 = this.LLILLL.LLILZ;
                if (c0p313 != null) {
                    c0p313.LJIJI(Collections.singletonList(C0P3K.SEND_INLINE_MSG));
                }
                VibeFeedConsumeViewModel vibeFeedConsumeViewModel3 = this.LLILLL;
                String str8 = vibeReachResponse.reminderContentPb;
                if (str8 != null) {
                    str5 = str8;
                }
                zZQ2 = vibeFeedConsumeViewModel3.zQ2("ci_share_feed_group_notice", str5, this.LLILZIL, this.LLJ);
            }
        } else {
            C0P31 c0p314 = this.LLILLL.LLILZ;
            if (c0p314 != null) {
                c0p314.LJIJI(Collections.singletonList(C0P3K.SEND_INLINE_MSG));
            }
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel4 = this.LLILLL;
            String str9 = vibeReachResponse.reminderContentPb;
            if (str9 != null) {
                str5 = str9;
            }
            zZQ2 = vibeFeedConsumeViewModel4.zQ2("ci_share_feed_notice", str5, this.LLILZIL, this.LLJ);
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C05D0 c05d0 = new C05D0(null, this.LLJIJIL, zZQ2);
        this.LLILLJJLI = null;
        this.LL = 3;
        if (C23250099c.LJI(this, abstractC2238408pq2, c05d0) == objLJFF) {
            C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.sendInteractReachMsg$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
