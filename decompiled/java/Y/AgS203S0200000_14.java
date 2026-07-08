package Y;

import X.AnonymousClass0617;
import X.C013C;
import X.C0I6Y;
import X.C0YM2;
import X.C0ZSW;
import X.C0ZU2;
import X.C0ZU9;
import X.C0ZVX;
import X.C1295960jpS;
import X.C1459980o60;
import X.C1464760oDi;
import X.C15438062q;
import X.C1887407aK;
import X.C1954807lC;
import X.C20243914Iz;
import X.C786410Ut5;
import X.C861250XqV;
import X.C869590Y9l;
import X.C881530Yi7;
import X.C910690Zo3;
import X.C910970ZoV;
import X.EnumC861260XqW;
import X.InterfaceC1364105Vn;
import X.InterfaceC1417050myl;
import X.InterfaceC1482905rH;
import X.InterfaceC346701Wf;
import X.InterfaceC879010Ye3;
import X.InterfaceC900060ZSq;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorVM;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.effect.EffectProfileListFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class AgS203S0200000_14 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS203S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean andSet = ((C0ZU9) agS203S0200000_14.l0).LIZIZ.LLIZLLLIL.getAndSet(false);
        ((C0ZU9) agS203S0200000_14.l0).LIZLLL.LIZJ(new C1887407aK(((C0ZU2) agS203S0200000_14.l1).LIZ(((C0ZU9) agS203S0200000_14.l0).LIZIZ.LIZ()), andSet));
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean andSet = ((C0ZU9) agS203S0200000_14.l0).LIZJ.LLIZLLLIL.getAndSet(false);
        ((C0ZU9) agS203S0200000_14.l0).LJ.LIZJ(new C1887407aK(((C0ZU2) agS203S0200000_14.l1).LIZ(((C0ZU9) agS203S0200000_14.l0).LIZJ.LIZ()), andSet));
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1417050myl interfaceC1417050mylLIZJ;
        C1464760oDi c1464760oDi = (C1464760oDi) obj;
        boolean z = true;
        if (c1464760oDi == null || (c1464760oDi.LIZ != UsageStatus.SUCCESS_APPLY && !c1464760oDi.LIZ())) {
            z = false;
        }
        if (((C013C) agS203S0200000_14.l0).element && !z && (interfaceC1417050mylLIZJ = ((C1459980o60) agS203S0200000_14.l1).LIZJ()) != null) {
            interfaceC1417050mylLIZJ.lJ1();
        }
        ((C013C) agS203S0200000_14.l0).element = z;
        ((C1459980o60) agS203S0200000_14.l1).LJI();
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c5, code lost:
    
        r4.add(r0);
        r10 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS203S0200000_14 r19, java.lang.Object r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS203S0200000_14.emit$2(Y.AgS203S0200000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$3(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0ZVX c0zvxSp;
        if (((Map) obj).containsKey(C0I6Y.LIZ((InterfaceC900060ZSq) agS203S0200000_14.l0).getUuid()) && (c0zvxSp = ((DynamicCardReusedUISlot) agS203S0200000_14.l1).sp()) != null) {
            c0zvxSp.LJI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i = C861250XqV.LIZ[((EnumC861260XqW) obj).ordinal()];
        if (i != 1) {
            if (i == 2) {
                View viewFindViewById = ((View) agS203S0200000_14.l0).findViewById(R.id.brl);
                if (viewFindViewById != null) {
                    C786410Ut5.I7(new ACListenerS131S0200000_29((View) agS203S0200000_14.l0, (EffectProfileListFragment) agS203S0200000_14.l1, 38), viewFindViewById);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS203S0200000_14 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C861840XrS
            if (r0 == 0) goto L46
            r7 = r10
            X.0XrS r7 = (X.C861840XrS) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            kotlin.collections.IndexedValue r3 = new kotlin.collections.IndexedValue
            java.lang.Object r2 = r8.l1
            X.00cf r2 = (X.C118300cf) r2
            int r1 = r2.element
            int r0 = r1 + 1
            r2.element = r0
            if (r1 < 0) goto L54
            r3.<init>(r1, r9)
            r7.LLILLL = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L22
            return r6
        L46:
            X.0XrS r7 = new X.0XrS
            r7.<init>(r8, r10)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L54:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS203S0200000_14.emit$5(Y.AgS203S0200000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$6(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String strLIZ;
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        Object second = pair.getSecond();
        if (zBooleanValue && second == C0ZSW.NO_MASK) {
            C1295960jpS c1295960jpS = (C1295960jpS) ((C910970ZoV) agS203S0200000_14.l0).LIZLLL.getValue();
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
                if (!c1295960jpS.isAnimating() && (strLIZ = ((IDMGeckoCommonChannelManager) ServiceManager.get().getService(IDMGeckoCommonChannelManager.class)).LIZ()) != null) {
                    C20243914Iz.LIZ(c1295960jpS, strLIZ, new AwS558S0100000_14(c1295960jpS, 1430));
                    c1295960jpS.addAnimatorListener(new C910690Zo3(c1295960jpS, new AwS558S0100000_14(c1295960jpS, 1431)));
                }
            }
            PhotoSwapAnimationAbility photoSwapAnimationAbility = (PhotoSwapAnimationAbility) ((C910970ZoV) agS203S0200000_14.l0).LJ.getValue();
            if (photoSwapAnimationAbility != null) {
                photoSwapAnimationAbility.gE0(((C869590Y9l) agS203S0200000_14.l1).getUuid());
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, (String) it2.next()));
        }
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = ((C881530Yi7) agS203S0200000_14.l0).LJIJJ();
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) agS203S0200000_14.l1;
        C881530Yi7 c881530Yi7 = (C881530Yi7) agS203S0200000_14.l0;
        Iterator<InterfaceC1482905rH> it3 = copyOnWriteArrayListLJIJJ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(interfaceC879010Ye3, arrayList, c881530Yi7.LIZIZ(), c881530Yi7.LLILLJJLI);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS203S0200000_14 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C891650YyR
            if (r0 == 0) goto L43
            r4 = r7
            X.0YyR r4 = (X.C891650YyR) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0Y8T r6 = (X.C0Y8T) r6
            java.lang.Object r0 = r5.l1
            X.0Z6T r0 = (X.C0Z6T) r0
            boolean r0 = r0.LIZIZ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L43:
            X.0YyR r4 = new X.0YyR
            r4.<init>(r5, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS203S0200000_14.emit$8(Y.AgS203S0200000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$9(AgS203S0200000_14 agS203S0200000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue() && !((UnreadIndicatorAssemV2) agS203S0200000_14.l0).No().getState().LLILLJJLI) {
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((UnreadIndicatorAssemV2) agS203S0200000_14.l0, 1599);
            Long lZo = UnreadIndicatorAssemV2.Zo((RecyclerView) agS203S0200000_14.l1, awS558S0100000_14);
            if (lZo != null) {
                long jLongValue = lZo.longValue();
                int iLJIIL = ((ChatLinearLayoutManager) ((RecyclerView) agS203S0200000_14.l1).getLayoutManager()).LJIIL() + 1;
                UnreadIndicatorVM unreadIndicatorVMNo = ((UnreadIndicatorAssemV2) agS203S0200000_14.l0).No();
                SessionInfo sessionInfoJo = ((UnreadIndicatorAssemV2) agS203S0200000_14.l0).Jo();
                if (sessionInfoJo != null) {
                    sessionInfoJo.getConversationId();
                }
                unreadIndicatorVMNo.xQ2(iLJIIL, jLongValue);
                ((RecyclerView) agS203S0200000_14.l1).addOnScrollListener(new AsS31S0200000_14(awS558S0100000_14, (UnreadIndicatorAssemV2) agS203S0200000_14.l0, 1));
            } else {
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }
}
