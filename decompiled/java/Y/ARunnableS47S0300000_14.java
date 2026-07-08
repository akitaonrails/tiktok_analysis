package Y;

import X.C0Y3I;
import X.C0Y60;
import X.C0Y8T;
import X.C1361400lX0;
import X.C195R;
import X.C1C7U;
import X.C2188811AlT;
import X.C310700CFw;
import X.C545820Lau;
import X.C855100Xga;
import X.C856140XiG;
import X.C867550Y1p;
import X.C867560Y1q;
import X.C869590Y9l;
import X.C907170ZiN;
import X.InterfaceC1439070nYH;
import X.InterfaceC856560Xiw;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.experiment.IMSafDelayedTransitionParam;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS47S0300000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String conversationId = ((C0Y8T) this.l0).getConversationId();
        StringBuilder sb = (StringBuilder) this.l1;
        sb.append(conversationId);
        sb.append("_");
        C0Y8T c0y8t = (C0Y8T) ((ConcurrentHashMap) ((C0Y60) this.l2).LIZ).get(conversationId);
        if (c0y8t != null && c0y8t.getUpdatedTime() > ((C0Y8T) this.l0).getUpdatedTime()) {
            ((C0Y60) this.l2).LJIILIIL.LIZLLL().LJII("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId);
        }
        ((ConcurrentHashMap) ((C0Y60) this.l2).LIZ).put(conversationId, (C0Y8T) this.l0);
    }

    public final void LIZ$1() {
        Context contextLIZIZ;
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) this.l0;
        if (!imageEditRootScene.LLLII || (contextLIZIZ = C545820Lau.LIZIZ(imageEditRootScene)) == null) {
            return;
        }
        InterfaceC1439070nYH interfaceC1439070nYH = (InterfaceC1439070nYH) this.l1;
        ImageEditRootScene imageEditRootScene2 = (ImageEditRootScene) this.l0;
        InterfaceC856560Xiw interfaceC856560Xiw = (InterfaceC856560Xiw) this.l2;
        if (interfaceC1439070nYH.LJJIJ()) {
            VideoPublishEditModel videoPublishEditModel = imageEditRootScene2.LLJL;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            contextLIZIZ = new C1361400lX0(contextLIZIZ, interfaceC1439070nYH.LJIILL(contextLIZIZ, videoPublishEditModel.creativeModel));
        }
        Iterator<Integer> it2 = interfaceC856560Xiw.LIZIZ().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publish");
            sbLIZ.append(iIntValue);
            C856140XiG.LIZ(contextLIZIZ, new C855100Xga(C2188811AlT.LIZIZ(sbLIZ), iIntValue));
        }
    }

    public static final void run$0(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ChatRootFragment@2e5a.releaseEnterTransitionAfterListSkeleton$$inlined$doOnPreDraw$1");
        try {
            boolean z = true;
            if (C310700CFw.LIZ() && ((IMSafDelayedTransitionParam) C310700CFw.LIZIZ.getValue()).releaseAfterNextFrame) {
                ((View) aRunnableS47S0300000_14.l1).postOnAnimation(new ARunnableS114S0100000_14((ChatRootFragment) aRunnableS47S0300000_14.l2, 0));
            } else {
                ChatRootFragment chatRootFragment = (ChatRootFragment) aRunnableS47S0300000_14.l2;
                chatRootFragment.getClass();
                boolean zLIZLLL = C195R.LIZLLL(chatRootFragment);
                IIMChatPerfLogger.LIZ.getClass();
                IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
                if (iIMChatPerfLoggerLIZ != null) {
                    if (!iIMChatPerfLoggerLIZ.LJIILJJIL() || zLIZLLL) {
                        z = false;
                    }
                    iIMChatPerfLoggerLIZ.LJIILL(z);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatRootFragment@2e5a.releaseEnterTransitionAfterListSkeleton$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConversationListModel@a5c5.insertOrUpdateConversation$1");
        try {
            aRunnableS47S0300000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConversationListModel@a5c5.insertOrUpdateConversation$1");
    }

    public static final void run$2(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToSubmitList$1$1$2");
        try {
            ((MessageListSubmitListAbilityImpl) aRunnableS47S0300000_14.l0).LJFF().getState().LJIIZILJ((List) aRunnableS47S0300000_14.l1, new ARunnableS113S0100000_13((Function0) aRunnableS47S0300000_14.l2, (Function0<Unit>) 103));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageListSubmitListAbilityImpl@4ce5.subscribeToSubmitList$1$1$2");
    }

    public static final void run$3(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditRootScene@a14e.preloadPublishResolution$2");
        try {
            aRunnableS47S0300000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditRootScene@a14e.preloadPublishResolution$2");
    }

    public static final void run$4(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BatchUnmarkUpdater@c3f2.update$2");
        try {
            ((C867560Y1q) aRunnableS47S0300000_14.l0).LIZ.LJIIZILJ().getDomain().LIZ.LJJIIZ(new C0Y3I("handleBatchUnmark"), (List) aRunnableS47S0300000_14.l1, (HashMap) aRunnableS47S0300000_14.l2, -1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BatchUnmarkUpdater@c3f2.update$2");
    }

    public static final void run$5(ARunnableS47S0300000_14 aRunnableS47S0300000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MarkUpdater@e8d.update$1");
        try {
            ((C867550Y1p) aRunnableS47S0300000_14.l0).LIZ.LJIIZILJ().getDomain().LIZ.LJJIIZ(new C0Y3I("command message: mark"), Collections.singletonList((C869590Y9l) aRunnableS47S0300000_14.l1), (HashMap) aRunnableS47S0300000_14.l2, -1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarkUpdater@e8d.update$1");
    }

    public ARunnableS47S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
