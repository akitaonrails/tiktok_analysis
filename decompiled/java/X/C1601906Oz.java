package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06Oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$aiMojiConfig$1$1", f = "CommonMessageListConfig.kt", l = {392}, m = "invokeSuspend")
public final class C1601906Oz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IIMSocialAvatarService LLILLJJLI;
    public final /* synthetic */ UIContentAssem LLILLL;
    public final /* synthetic */ C01GW<MessagePowerListAbility> LLILZ;
    public final /* synthetic */ C01GW<ChatroomEventAbility> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1601906Oz(IIMSocialAvatarService iIMSocialAvatarService, UIContentAssem uIContentAssem, C01GW<? extends MessagePowerListAbility> c01gw, C01GW<? extends ChatroomEventAbility> c01gw2, InterfaceC1364105Vn<? super C1601906Oz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iIMSocialAvatarService;
        this.LLILLL = uIContentAssem;
        this.LLILZ = c01gw;
        this.LLILZIL = c01gw2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1601906Oz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.aiMojiConfig$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final C259800zU c259800zU = new C259800zU();
            C05YD<IMSocialAvatarStatus> c05ydLJJLI = this.LLILLJJLI.LJJLI(null, false);
            final UIContentAssem uIContentAssem = this.LLILLL;
            final C01GW<MessagePowerListAbility> c01gw = this.LLILZ;
            final C01GW<ChatroomEventAbility> c01gw2 = this.LLILZIL;
            InterfaceC346701Wf<? super IMSocialAvatarStatus> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.06P1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    List<C869590Y9l> listVi2;
                    if (Intrinsics.LJFF(c259800zU.element, obj2)) {
                        return Unit.LIZ;
                    }
                    c259800zU.element = obj2;
                    boolean z = !(obj2 instanceof C1754806u2);
                    UIContentAssem uIContentAssem2 = uIContentAssem;
                    MessagePowerListAbility value = c01gw.getValue();
                    ChatroomEventAbility value2 = c01gw2.getValue();
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
                    if (z) {
                        if (value == null || (listVi2 = value.vi2()) == null) {
                            listVi2 = C13BV.INSTANCE;
                        }
                        int size = listVi2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C869590Y9l c869590Y9l = (C869590Y9l) ListProtector.get(listVi2, i2);
                            if (Intrinsics.LJFF(c869590Y9l.getLocalCache(508), Boolean.TRUE)) {
                                c869590Y9l.putLocalCache(508, Boolean.FALSE);
                                if (value2 != null) {
                                    value2.QU0(new C06S8(new C0Y3I("aimoji refresh"), Collections.singletonList(c869590Y9l)));
                                }
                            }
                        }
                        ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(uIContentAssem2), ChatRoomFakeMsgOperatorAbility.class, null);
                        if (chatRoomFakeMsgOperatorAbility != null) {
                            C1684506ih c1684506ih = new C1684506ih();
                            c1684506ih.LIZLLL(11);
                            c1684506ih.LIZJ = "uuid-aimoji-sticker-panel-inline";
                            chatRoomFakeMsgOperatorAbility.y52(c1684506ih, null);
                        }
                    }
                    if (value2 != null) {
                        value2.QU0(new C06S8(new C0Y3I("aimoji setup by MessageListAssem"), C13BV.INSTANCE));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c05ydLJJLI.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.aiMojiConfig$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
