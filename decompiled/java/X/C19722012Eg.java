package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.12Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19722012Eg extends AbstractC1664470tPp<C18VS, AnonymousClass0066, C12EW> implements C18VS, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C18VO.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 386));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19722012Eg.class, "sessionInfo", "getSessionInfo()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19722012Eg.class, "inputApi", "getInputApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatInputFeatureApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJ = 8;
    }

    private final C214799194j B3() {
        return (C214799194j) this.LLIZ.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<AnonymousClass0066> o2() {
        return AFwS218S0000000_29.get$arr$(303);
    }

    public final C18VO q3() {
        return (C18VO) this.LLILZLL.getValue(this, LLIZLLLIL[1]);
    }

    public final C18UJ v3() {
        return (C18UJ) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12EW> w2() {
        return new AwS573S0100000_29(this, 758);
    }

    @Override // X.C18VS
    public void hide() {
        B3().LLLLIL();
    }

    @Override // X.C18VS
    public void show() {
        B3().LLLLL(this.LLILLL);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final C19A3 getParentScene() {
        return this.LLILLL;
    }

    public C19722012Eg(C19A3 c19a3, C1DRG c1drg) {
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
    }
}
