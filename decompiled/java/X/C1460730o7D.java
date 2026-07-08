package X;

import Y.ACListenerS156S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.os.Bundle;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460730o7D extends C1462090o9P {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZ;
    public final Function1<Boolean, Unit> LLLLLZL;
    public final C1664740tQG LLLLZ;
    public final C1664740tQG LLLLZI;
    public final C1664740tQG LLLLZIL;
    public boolean LLLLZLL;
    public final C01GW LLLLZLLIL;
    public final C01GW LLLLZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460730o7D.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1460730o7D.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1460730o7D.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        LLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.C1462070o9N, X.InterfaceC1444170ngV
    public final boolean C1() {
        boolean zC1 = super.C1();
        if (zC1 || !LLLLLLLLLL().LJIILIIL()) {
            return zC1;
        }
        return true;
    }

    @Override // X.C1462070o9N
    public final C124T LLLLJI() {
        C124U c124u = (C124U) C786410Ut5.LJLLLL((ViewStub) requireViewById(R.id.view_stub_textmode_sticker_layout));
        c124u.setBackEventCallBack(new ACListenerS156S0100000_22(this, 33));
        return c124u;
    }

    @Override // X.C1462070o9N
    public final void LLLLIL(int i) {
        AnonymousClass1233 anonymousClass1233;
        LLLLLLLLLL().LIZIZ(i);
        C196925122x c196925122xLLLLLLZ = LLLLLLZ();
        if ((c196925122xLLLLLLZ instanceof AnonymousClass1233) && (anonymousClass1233 = (AnonymousClass1233) c196925122xLLLLLLZ) != null) {
            anonymousClass1233.setStickerTextColor(i);
        }
    }

    @Override // X.C1462070o9N, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C385670FAf<Boolean> c385670FAfMo;
        super.onActivityCreated(bundle);
        LLLLLJIL().ww2().observe(this, new AObserverS225S0100000_22(this, 111));
        C122Q c122q = this.LLLLLJLJLL;
        if (c122q != null && (c385670FAfMo = c122q.mo()) != null) {
            c385670FAfMo.LIZ(this, new AObjectS245S0100000_22(this, 200));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1460730o7D(C1DRG c1drg, Function1<? super Boolean, Unit> function1, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        super(c1drg, z, interfaceC1462140o9U);
        this.LLLLLZL = function1;
        this.LLLLZ = C1664770tQJ.LIZIZ(this.LLJILLL, C19EG.class, null);
        this.LLLLZI = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC1457600o2A.class, null);
        this.LLLLZIL = C1664770tQJ.LIZIZ(this.LLJILLL, InterfaceC1453430nvR.class, null);
        this.LLLLZLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(251));
        this.LLLLZLLLI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(250));
    }
}
