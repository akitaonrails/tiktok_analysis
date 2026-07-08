package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler$handleQuotedGifClick$1", f = "DefaultQuotedMessageClickHandler.kt", l = {402}, m = "invokeSuspend")
public final class C15616069m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DefaultQuotedMessageClickHandler LLILLJJLI;
    public final /* synthetic */ GifContent LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15616069m(DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler, GifContent gifContent, View view, long j, InterfaceC1364105Vn<? super C15616069m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = defaultQuotedMessageClickHandler;
        this.LLILLL = gifContent;
        this.LLILZ = view;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15616069m(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r10 == null) goto L23;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1"
            X.C1C7U.LIZ(r0)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            if (r0 == 0) goto L1f
            if (r0 != r7) goto L6e
            X.C155000ia.LIZIZ(r10)
        L13:
            X.0Y9l r10 = (X.C869590Y9l) r10
            if (r10 != 0) goto L76
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L1f:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility r0 = r0.LIZ()
            r5 = 0
            if (r0 == 0) goto L53
            java.util.List r0 = r0.vi2()
            if (r0 == 0) goto L53
            long r3 = r9.LLILZIL
            java.util.Iterator r8 = r0.iterator()
        L37:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r10 = r8.next()
            r0 = r10
            X.0Y9l r0 = (X.C869590Y9l) r0
            long r1 = r0.getMsgId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6a
            r0 = 1
        L4d:
            if (r0 == 0) goto L37
        L4f:
            X.0Y9l r10 = (X.C869590Y9l) r10
            if (r10 != 0) goto L76
        L53:
            X.1DFB r3 = X.C0PEM.LIZJ
            X.069l r2 = new X.069l
            long r0 = r9.LLILZIL
            r2.<init>(r0, r5)
            r9.LL = r7
            java.lang.Object r10 = X.C23250099c.LJI(r9, r3, r2)
            if (r10 != r6) goto L13
            java.lang.String r0 = "DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1"
            X.C1C7U.LIZIZ(r0)
            return r6
        L6a:
            r0 = 0
            goto L4d
        L6c:
            r10 = r5
            goto L4f
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler r3 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler r2 = r3.LLIZLLLIL
            if (r2 != 0) goto L92
            monitor-enter(r3)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler r2 = r3.LLIZLLLIL     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L91
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r3.LL     // Catch: java.lang.Throwable -> L8e
            androidx.fragment.app.Fragment r0 = r3.LLILLJJLI     // Catch: java.lang.Throwable -> L8e
            com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler r2 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L8e
            r3.LLIZLLLIL = r2     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L91:
            monitor-exit(r3)
        L92:
            com.ss.android.ugc.aweme.im.message.content.GifContent r1 = r9.LLILLL
            android.view.View r0 = r9.LLILZ
            r2.Qw2(r1, r10, r0)
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "DefaultQuotedMessageClickHandler@b1e6.handleQuotedGifClick$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15616069m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
