package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1508505vP extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C1508505vP(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel) {
        super(1, smartReplySuggestedReplyViewModel, SmartReplySuggestedReplyViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        InterfaceC904740ZeS interfaceC904740ZeS2 = interfaceC904740ZeS;
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = (SmartReplySuggestedReplyViewModel) this.receiver;
        smartReplySuggestedReplyViewModel.getClass();
        if (interfaceC904740ZeS2 instanceof C1509705vb) {
            Iterator<C869590Y9l> it2 = ((C1509705vb) interfaceC904740ZeS2).LIZ.iterator();
            if (it2.hasNext()) {
                Long lValueOf = Long.valueOf(it2.next().getIndex());
                while (it2.hasNext()) {
                    Long lValueOf2 = Long.valueOf(it2.next().getIndex());
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    C869590Y9l c869590Y9l = smartReplySuggestedReplyViewModel.LLJIJIL;
                    if (c869590Y9l != null && Long.valueOf(c869590Y9l.getIndex()).longValue() < jLongValue) {
                        smartReplySuggestedReplyViewModel.wQ2();
                        C1508405vO c1508405vO = smartReplySuggestedReplyViewModel.LLJJIJI;
                        if (c1508405vO != null) {
                            c1508405vO.LIZLLL = System.currentTimeMillis();
                            c1508405vO.LJ = "new_message";
                            C1508705vR.LL.getClass();
                            C1508705vR.LJIIJ(c1508405vO);
                        }
                        smartReplySuggestedReplyViewModel.LLJJIJI = null;
                    }
                }
            }
        } else if (interfaceC904740ZeS2 instanceof C06SA) {
            smartReplySuggestedReplyViewModel.wQ2();
            C1508405vO c1508405vO2 = smartReplySuggestedReplyViewModel.LLJJIJI;
            if (c1508405vO2 != null) {
                c1508405vO2.LIZLLL = System.currentTimeMillis();
                c1508405vO2.LJ = "new_message";
                C1508705vR.LL.getClass();
                C1508705vR.LJIIJ(c1508405vO2);
            }
            smartReplySuggestedReplyViewModel.LLJJIJI = null;
            if (smartReplySuggestedReplyViewModel.LLJILJIL && !smartReplySuggestedReplyViewModel.LLJILJILJ) {
                C23250099c.LIZLLL(smartReplySuggestedReplyViewModel.LLIZ, null, null, new C1505705ux(smartReplySuggestedReplyViewModel, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
