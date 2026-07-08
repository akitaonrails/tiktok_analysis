package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler$streakPet$1$1", f = "ChatRoomAssembler2.kt", l = {460, 461}, m = "invokeSuspend")
public final class C1520505xL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatRoomAssembler LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520505xL(Fragment fragment, ChatRoomAssembler chatRoomAssembler, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatRoomAssembler;
        this.LLILLL = fragment;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1520505xL(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomAssembler@5031.streakPet$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = C1583306Hv.LIZ().assembleDelay;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1");
                return objLJFF;
            }
        }
        ChatRoomAssembler chatRoomAssembler = this.LLILLJJLI;
        C1598406Nq c1598406Nq = chatRoomAssembler.LJIIJ;
        if (c1598406Nq == null) {
            synchronized (chatRoomAssembler) {
                c1598406Nq = chatRoomAssembler.LJIIJ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    chatRoomAssembler.LJIIJ = c1598406Nq;
                }
            }
        }
        AbstractC2252651DEx abstractC2252651DEx = c1598406Nq.LIZIZ;
        C1520405xK c1520405xK = new C1520405xK(this.LLILLL, this.LLILLJJLI, null, this.LLILZ);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2252651DEx, c1520405xK) == objLJFF) {
            C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
