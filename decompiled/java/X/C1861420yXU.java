package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl$switch2SubConversation$13$1", f = "IMessageAbility.kt", l = {1065, 1080, 1087}, m = "invokeSuspend")
public final class C1861420yXU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public int LLILZ;
    public final /* synthetic */ MessageAbilityImpl LLILZIL;
    public final /* synthetic */ ConversationInfo LLILZLL;
    public final /* synthetic */ MessageViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861420yXU(MessageViewModel messageViewModel, MessageAbilityImpl messageAbilityImpl, ConversationInfo conversationInfo, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = messageAbilityImpl;
        this.LLILZLL = conversationInfo;
        this.LLIZ = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861420yXU(this.LLIZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:8:0x0022). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1861420yXU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r13, com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl r14, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C1861480yXa
            if (r0 == 0) goto L5b
            r12 = r3
            X.0yXa r12 = (X.C1861480yXa) r12
            int r2 = r12.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r12.LLILLJJLI = r2
        L14:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L61
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0yae r4 = r13.LLJJJJ
            if (r4 == 0) goto L59
            X.1E8R r11 = new X.1E8R
            kotlin.jvm.internal.AwS393S0200000_27 r2 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 53
            r2.<init>(r14, r15, r0)
            kotlin.jvm.internal.AwS393S0200000_27 r1 = new kotlin.jvm.internal.AwS393S0200000_27
            r0 = 54
            r1.<init>(r14, r15, r0)
            r11.<init>(r2, r1)
            r6 = 0
            r8 = 2
            r9 = 0
            r13 = 41
            r12.LLILLJJLI = r5
            r7 = r6
            r10 = r5
            java.lang.Object r1 = X.C1863380yae.LJIJJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r3) goto L24
            return r3
        L59:
            r0 = 0
            goto L2a
        L5b:
            X.0yXa r12 = new X.0yXa
            r12.<init>(r3)
            goto L14
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1861420yXU.LIZ(com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel, com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo, X.05Vn):java.lang.Object");
    }
}
