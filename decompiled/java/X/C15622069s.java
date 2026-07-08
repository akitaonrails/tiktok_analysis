package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler$handleQuotedMediaVideoClick$1", f = "DefaultQuotedMessageClickHandler.kt", l = {364}, m = "invokeSuspend")
public final class C15622069s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DefaultQuotedMessageClickHandler LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15622069s(DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler, View view, String str, long j, InterfaceC1364105Vn<? super C15622069s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = defaultQuotedMessageClickHandler;
        this.LLILLL = view;
        this.LLILZ = str;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15622069s(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r2 == null) goto L21;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            r27 = this;
            r2 = r28
            java.lang.String r10 = "DefaultQuotedMessageClickHandler@b1e6.handleQuotedMediaVideoClick$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            r3 = r27
            int r0 = r3.LL
            r15 = 0
            r8 = 1
            if (r0 == 0) goto L22
            if (r0 != r8) goto L69
            X.C155000ia.LIZIZ(r2)
        L18:
            X.0Y9l r2 = (X.C869590Y9l) r2
            if (r2 != 0) goto L71
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L22:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility r0 = r0.LIZ()
            if (r0 == 0) goto L52
            java.util.List r0 = r0.vi2()
            if (r0 == 0) goto L52
            long r6 = r3.LLILZIL
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.0Y9l r0 = (X.C869590Y9l) r0
            long r4 = r0.getMsgId()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L39
        L4e:
            X.0Y9l r2 = (X.C869590Y9l) r2
            if (r2 != 0) goto L71
        L52:
            X.1DFB r4 = X.C0PEM.LIZJ
            X.069o r2 = new X.069o
            long r0 = r3.LLILZIL
            r2.<init>(r0, r15)
            r3.LL = r8
            java.lang.Object r2 = X.C23250099c.LJI(r3, r4, r2)
            if (r2 != r9) goto L18
            X.C1C7U.LIZIZ(r10)
            return r9
        L67:
            r2 = r15
            goto L4e
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L71:
            X.0I8i r0 = com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi r1 = X.C461620I8i.LIZ()
            if (r1 == 0) goto L8c
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
            boolean r0 = r0.isMediaMsgMasking()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = r1.LJIILIIL(r2, r0)
        L8c:
            X.06oX r11 = com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper.LIZ
            android.view.View r0 = r3.LLILLL
            android.content.Context r12 = r0.getContext()
            X.0Z92 r14 = X.C0Z92.NORMAL
            X.0ZSh r16 = X.EnumC899970ZSh.REPLY_MEDIA_VIDEO
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r0.LL
            android.view.View r13 = r3.LLILLL
            java.lang.String r0 = r3.LLILZ
            r20 = 0
            r21 = 0
            java.lang.String r22 = "click_quoted_message"
            r26 = 14336(0x3800, float:2.0089E-41)
            r18 = r2
            r19 = r1
            r23 = r20
            r24 = r20
            r25 = r20
            r17 = r0
            X.C1720706oX.LIZIZ(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15622069s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
