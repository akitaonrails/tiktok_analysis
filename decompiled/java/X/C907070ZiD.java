package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbilityImpl;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS154S0101000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbilityImpl$scrollToMsgWithPos$1", f = "MessageListScrollAbilityImpl.kt", l = {}, m = "invokeSuspend")
public final class C907070ZiD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ MessageListScrollAbilityImpl LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ EnumC461200I6s LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C907070ZiD(int i, MessageListScrollAbilityImpl messageListScrollAbilityImpl, Function0<Unit> function0, EnumC461200I6s enumC461200I6s, boolean z, Function1<? super Integer, Unit> function1, Function0<Unit> function02, InterfaceC1364105Vn<? super C907070ZiD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = messageListScrollAbilityImpl;
        this.LLILLL = function0;
        this.LLILZ = enumC461200I6s;
        this.LLILZIL = z;
        this.LLILZLL = function1;
        this.LLIZ = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907070ZiD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final ChatLinearLayoutManager chatLinearLayoutManager;
        C1C7U.LIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C869590Y9l> listVi2 = this.LLILLJJLI.LIZ().vi2();
        if (listVi2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1");
            return unit;
        }
        if (listVi2.isEmpty()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1");
            return unit2;
        }
        int i = this.LL;
        if (i != -1 && i < listVi2.size()) {
            this.LLILLJJLI.LLIZ = false;
            Function0<Unit> function0 = this.LLILLL;
            if (function0 != null) {
                function0.invoke();
            }
            EnumC461200I6s enumC461200I6s = this.LLILZ;
            if (enumC461200I6s == EnumC461200I6s.TOP) {
                RecyclerView recyclerViewLLII = this.LLILLJJLI.LIZ().LLII();
                MessageListScrollAbilityImpl messageListScrollAbilityImpl = this.LLILLJJLI;
                final int i2 = this.LL;
                boolean z = this.LLILZIL;
                final Function1<Integer, Unit> function1 = this.LLILZLL;
                if (z) {
                    RecyclerView.LayoutManager layoutManager = messageListScrollAbilityImpl.LIZ().LLII().getLayoutManager();
                    if ((layoutManager instanceof ChatLinearLayoutManager) && layoutManager != null) {
                        final Context context = (Context) messageListScrollAbilityImpl.LLILLL.getValue();
                        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0H4m
                            @Override // X.C21674119s3, X.AbstractC21674019s2
                            public final void LJFF() {
                                super.LJFF();
                                Function1<Integer, Unit> function12 = function1;
                                if (function12 != null) {
                                    function12.invoke(Integer.valueOf(i2));
                                }
                            }
                        };
                        c21674119s3.LIZ = i2;
                        layoutManager.startSmoothScroll(c21674119s3);
                    }
                } else {
                    messageListScrollAbilityImpl.getClass();
                    if (recyclerViewLLII != null) {
                        recyclerViewLLII.scrollToPosition(i2);
                    }
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i2));
                    }
                }
            } else if (enumC461200I6s == EnumC461200I6s.MIDDLE) {
                RecyclerView.LayoutManager layoutManager2 = this.LLILLJJLI.LIZ().LLII().getLayoutManager();
                if ((layoutManager2 instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager2) != null) {
                    final MessageListScrollAbilityImpl messageListScrollAbilityImpl2 = this.LLILLJJLI;
                    final int i3 = this.LL;
                    final Function1<Integer, Unit> function12 = this.LLILZLL;
                    messageListScrollAbilityImpl2.getClass();
                    if (i3 - chatLinearLayoutManager.LJIIL() > 10) {
                        chatLinearLayoutManager.scrollToPosition(i3 - 10);
                        Boolean.valueOf(HandlerHook.viewPost(messageListScrollAbilityImpl2.LIZ().LLII(), new Runnable() { // from class: X.0ZiE
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1$1$1");
                                try {
                                    MessageListScrollAbilityImpl messageListScrollAbilityImpl3 = messageListScrollAbilityImpl2;
                                    int i4 = i3;
                                    ChatLinearLayoutManager chatLinearLayoutManager2 = chatLinearLayoutManager;
                                    C907090ZiF c907090ZiF = new C907090ZiF((Context) messageListScrollAbilityImpl3.LLILLL.getValue(), new AwS154S0101000_14(i4, function12, 3));
                                    c907090ZiF.LIZ = i4;
                                    chatLinearLayoutManager2.startSmoothScroll(c907090ZiF);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1$1$1");
                            }
                        }));
                    } else {
                        C907090ZiF c907090ZiF = new C907090ZiF((Context) messageListScrollAbilityImpl2.LLILLL.getValue(), new AwS154S0101000_14(i3, function12, 3));
                        c907090ZiF.LIZ = i3;
                        chatLinearLayoutManager.startSmoothScroll(c907090ZiF);
                    }
                }
            }
        } else {
            MessageListScrollAbilityImpl messageListScrollAbilityImpl3 = this.LLILLJJLI;
            Function0<Unit> function02 = this.LLILLL;
            Function1<Integer, Unit> function13 = this.LLILZLL;
            Function0<Unit> function03 = this.LLIZ;
            boolean z2 = this.LLILZIL;
            int i4 = messageListScrollAbilityImpl3.LLILZLL;
            if (i4 == 0) {
                messageListScrollAbilityImpl3.LLJILJILJ = function02;
                messageListScrollAbilityImpl3.LLJILLL = function13;
                messageListScrollAbilityImpl3.LLJJ = function03;
                messageListScrollAbilityImpl3.LLJILJIL = z2;
            }
            messageListScrollAbilityImpl3.LLIZ = true;
            int i5 = i4 + 1;
            messageListScrollAbilityImpl3.LLILZLL = i5;
            if (i5 > 10) {
                messageListScrollAbilityImpl3.LLIZ = false;
                messageListScrollAbilityImpl3.LLILZLL = 0;
                Function0<Unit> function04 = messageListScrollAbilityImpl3.LLJJ;
                if (function04 != null) {
                    function04.invoke();
                }
            } else {
                InterfaceC904700ZeO interfaceC904700ZeO = (InterfaceC904700ZeO) messageListScrollAbilityImpl3.LLILLJJLI.getValue();
                if (interfaceC904700ZeO != null) {
                    interfaceC904700ZeO.LIZJ();
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageListScrollAbilityImpl@bfde.scrollToMsgWithPos$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
