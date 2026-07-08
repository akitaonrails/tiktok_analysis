package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyIntroBannerViewModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1509205vW extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C1509205vW(SmartReplyIntroBannerViewModel smartReplyIntroBannerViewModel) {
        super(1, smartReplyIntroBannerViewModel, SmartReplyIntroBannerViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        InterfaceC904740ZeS interfaceC904740ZeS2 = interfaceC904740ZeS;
        SmartReplyIntroBannerViewModel smartReplyIntroBannerViewModel = (SmartReplyIntroBannerViewModel) this.receiver;
        smartReplyIntroBannerViewModel.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessageEvent: ");
        sbLIZ.append(interfaceC904740ZeS2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC904740ZeS2 instanceof C06SA) {
            C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
            String strVQ2 = smartReplyIntroBannerViewModel.vQ2();
            if (strVQ2 == null) {
                strVQ2 = "";
            }
            c1500205u4.getClass();
            if (C1500205u4.LIZ(strVQ2)) {
                C869590Y9l c869590Y9l = ((C06SA) interfaceC904740ZeS2).LIZJ;
                CopyOnWriteArrayList<String> copyOnWriteArrayList = C1500205u4.LLILZIL;
                if (!copyOnWriteArrayList.contains(c869590Y9l.getConversationId()) && C0ZDX.LJJJJIZL(c869590Y9l) && !C0ZDX.LJJJJL(c869590Y9l) && copyOnWriteArrayList.size() < 3) {
                    copyOnWriteArrayList.addIfAbsent(c869590Y9l.getConversationId());
                }
            }
        }
        return Unit.LIZ;
    }
}
