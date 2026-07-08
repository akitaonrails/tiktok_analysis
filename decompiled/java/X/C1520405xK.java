package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS101S0400000_2;
import njp.a;

/* JADX INFO: renamed from: X.05xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler$streakPet$1$1$1", f = "ChatRoomAssembler2.kt", l = {}, m = "invokeSuspend")
public final class C1520405xK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ ChatRoomAssembler LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520405xK(Fragment fragment, ChatRoomAssembler chatRoomAssembler, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = chatRoomAssembler;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1520405xK c1520405xK = new C1520405xK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c1520405xK.LL = obj;
        return c1520405xK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        IStreakPetService.LIZ.getClass();
        IStreakPetService iStreakPetServiceLIZ = C1586906Jf.LIZ();
        C19719912Dl c19719912DlLJFF = iStreakPetServiceLIZ.LJFF();
        if (c19719912DlLJFF == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
            return unit;
        }
        C19719912Dl c19719912DlLJ = iStreakPetServiceLIZ.LJ();
        if (c19719912DlLJ == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
            return unit2;
        }
        C19719912Dl c19719912DlLJIIIIZZ = iStreakPetServiceLIZ.LJIIIIZZ();
        if (c19719912DlLJIIIIZZ == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
            return unit3;
        }
        C2296808zG.LJFF(interfaceC497601wk);
        if (!this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
            return unit4;
        }
        ChatRoomAssembler chatRoomAssembler = this.LLILLL;
        Fragment fragment = this.LLILLJJLI;
        chatRoomAssembler.LIZIZ(fragment, this.LLILZ, new AwS101S0400000_2(fragment, (Fragment) c19719912DlLJFF, (C13IQ<? extends UISlotAssem>) c19719912DlLJ, (C13IQ<? extends AbstractC738140SxQ>) c19719912DlLJIIIIZZ, (C13IQ<? extends AbstractC738140SxQ>) 4));
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomAssembler@5031.streakPet$1$1$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
