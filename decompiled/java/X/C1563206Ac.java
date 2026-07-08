package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.bridge.CommonInboxChatListBridge$whenUserClickInboxTab$1", f = "CommonInboxChatListBridge.kt", l = {}, m = "invokeSuspend")
public final class C1563206Ac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MotionEvent LL;
    public final /* synthetic */ AbstractC883730Ylf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563206Ac(MotionEvent motionEvent, AbstractC883730Ylf abstractC883730Ylf, InterfaceC1364105Vn<? super C1563206Ac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = motionEvent;
        this.LLILLJJLI = abstractC883730Ylf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1563206Ac(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC884020Ym8 interfaceC884020Ym8;
        C1729706pz c1729706pz;
        C1C7U.LIZ("CommonInboxChatListBridge@c9d.whenUserClickInboxTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MotionEvent motionEvent = this.LL;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            IChatListEngine.LIZ.getClass();
            InterfaceC884990Ynh interfaceC884990YnhLJFF = C884160YmM.LIZ().LJFF(C13LE.LIZ(C1729706pz.class));
            if ((interfaceC884990YnhLJFF instanceof C1729706pz) && (c1729706pz = (C1729706pz) interfaceC884990YnhLJFF) != null) {
                if (!C1563306Ad.LIZ()) {
                    AbstractC883730Ylf.LJIIIIZZ.getClass();
                    C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AX(c1729706pz, null));
                } else {
                    for (C06AS c06as : c1729706pz.LIZIZ()) {
                        AbstractC883730Ylf.LJIIIIZZ.getClass();
                        C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AQ(c06as, null));
                    }
                }
            }
        }
        C1ED8.LIZ.getClass();
        if (((Boolean) C1ED8.LJIIL.getValue()).booleanValue() && (interfaceC884020Ym8 = this.LLILLJJLI.LJ) != null) {
            interfaceC884020Ym8.LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonInboxChatListBridge@c9d.whenUserClickInboxTab$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
