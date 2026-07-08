package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ezu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110240ezu extends AbstractC1112930f4F<InterfaceC1112060f2q> {
    public final C1110250ezv LJIILLIIL;
    public final C1110260ezw LJIIZILJ;

    @Override // X.AbstractC1112930f4F
    public final MGetTranslationRequest.Text LJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        InterfaceC1112060f2q interfaceC1112060f2q2 = interfaceC1112060f2q;
        if (interfaceC1112060f2q2 instanceof C1110310f01) {
            this.LJIILLIIL.getClass();
            return C1110250ezv.LIZ((C1110310f01) interfaceC1112060f2q2);
        }
        if (interfaceC1112060f2q2 instanceof C1110230ezt) {
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q2;
            getClass();
            MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
            text.text = String.valueOf(((LiveIntroMessage) abstractC1110800f0o.LJIL).content);
            CommonMessageData commonMessageData = abstractC1110800f0o.LJIL.baseMessage;
            if (commonMessageData != null) {
                text.msgId = commonMessageData.messageId;
                text.roomMessageHeatLevel = commonMessageData.roomMessageHeatLevel;
            }
            text.textSource = 1;
            return text;
        }
        return null;
    }

    @Override // X.AbstractC1112930f4F
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final boolean LIZ(InterfaceC1112060f2q interfaceC1112060f2q) {
        boolean zLJIIIZ = LJIIIZ(interfaceC1112060f2q);
        if (super.LIZ(interfaceC1112060f2q) && zLJIIIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(X.InterfaceC1112060f2q r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1110310f01
            java.lang.String r2 = "un"
            r4 = 1
            if (r0 == 0) goto L44
            r3 = r6
            X.0f0o r3 = (X.AbstractC1110800f0o) r3
            boolean r0 = r3.LIZJ
            if (r0 != 0) goto L44
            boolean r0 = r6 instanceof X.C1110280ezy
            if (r0 != 0) goto L44
            MESSAGE extends X.0ffY r0 = r3.LJIL
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            java.lang.String r0 = r0.contentLanguage
            int r0 = r0.length()
            if (r0 <= 0) goto L44
            MESSAGE extends X.0ffY r0 = r3.LJIL
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            java.lang.String r0 = r0.contentLanguage
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L44
            MESSAGE extends X.0ffY r0 = r3.LJIL
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            java.lang.String r1 = r0.contentLanguage
            java.lang.String r0 = r5.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L44
            MESSAGE extends X.0ffY r0 = r3.LJIL
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            java.lang.String r0 = r0.contentLanguage
            boolean r0 = r5.LIZJ(r0)
            if (r0 != 0) goto L80
        L44:
            boolean r0 = r5.LJFF
            if (r0 != 0) goto L81
            boolean r0 = r6 instanceof X.C1110230ezt
            if (r0 == 0) goto L81
            X.0f0o r6 = (X.AbstractC1110800f0o) r6
            MESSAGE extends X.0ffY r0 = r6.LJIL
            com.bytedance.android.livesdk.model.message.LiveIntroMessage r0 = (com.bytedance.android.livesdk.model.message.LiveIntroMessage) r0
            java.lang.String r0 = r0.contentLanguage
            int r0 = r0.length()
            if (r0 <= 0) goto L81
            MESSAGE extends X.0ffY r0 = r6.LJIL
            com.bytedance.android.livesdk.model.message.LiveIntroMessage r0 = (com.bytedance.android.livesdk.model.message.LiveIntroMessage) r0
            java.lang.String r0 = r0.contentLanguage
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L81
            MESSAGE extends X.0ffY r0 = r6.LJIL
            com.bytedance.android.livesdk.model.message.LiveIntroMessage r0 = (com.bytedance.android.livesdk.model.message.LiveIntroMessage) r0
            java.lang.String r1 = r0.contentLanguage
            java.lang.String r0 = r5.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L81
            MESSAGE extends X.0ffY r0 = r6.LJIL
            com.bytedance.android.livesdk.model.message.LiveIntroMessage r0 = (com.bytedance.android.livesdk.model.message.LiveIntroMessage) r0
            java.lang.String r0 = r0.contentLanguage
            boolean r0 = r5.LIZJ(r0)
            if (r0 == 0) goto L81
        L80:
            return r4
        L81:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1110240ezu.LJIIIZ(X.0f2q):boolean");
    }

    @Override // X.AbstractC1112930f4F
    public final List LIZLLL(List list, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) it2.next();
            if (interfaceC1112060f2q instanceof C1110310f01) {
                this.LJIILLIIL.getClass();
                C1110250ezv.LIZIZ(map, (C1110310f01) interfaceC1112060f2q);
            } else if (interfaceC1112060f2q instanceof C1110230ezt) {
                C1110230ezt c1110230ezt = (C1110230ezt) interfaceC1112060f2q;
                getClass();
                MGetTranslationResponse.Data.Translation translation = (MGetTranslationResponse.Data.Translation) map.get(((LiveIntroMessage) c1110230ezt.LJIL).content);
                if (translation != null && translation.translated) {
                    c1110230ezt.LJJIJIIJIL = true;
                    c1110230ezt.LJJIJIL = translation.translation;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ezw] */
    public C1110240ezu(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z, Looper looper) {
        super(lifecycleOwner, j, j2, str, true, z, looper);
        this.LJIILLIIL = new C1110250ezv();
        this.LJIIZILJ = new AbstractC1110270ezx<C1110230ezt>() { // from class: X.0ezw
        };
    }
}
