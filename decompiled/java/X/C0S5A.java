package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0S5A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5A extends C20698515z5 {
    public final InterfaceC665370Q7z LLIZLLLIL;
    public final Aweme LLJ;
    public String LLJI;
    public EnumC1390800mIQ LLJIJIL;
    public final Function1<Boolean, Unit> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final DialogInterfaceOnDismissListenerC738790SyT LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    @Override // X.C20698515z5, X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.C20698515z5, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final void kc() {
        this.LLJJIJI = true;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final void yu() {
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final void iQ() {
        TranslationAbility translationAbility = (TranslationAbility) this.LLJJ.getValue();
        if (translationAbility != null) {
            translationAbility.ww0(EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE);
        }
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final void qu() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LLJJI.getValue();
        if (cLACaptionAbility != null) {
            cLACaptionAbility.jS0(AnonymousClass1629.TOGGLE_ENABLE, false);
        }
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final C160B vf() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LLJJI.getValue();
        if (cLACaptionAbility != null) {
            return cLACaptionAbility.vf();
        }
        return null;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final boolean w1() {
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LLJJI.getValue();
        if (cLACaptionAbility != null) {
            return cLACaptionAbility.w1();
        }
        return true;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final DialogInterface.OnDismissListener aR() {
        return this.LLJJIII;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final Aweme getAweme() {
        return this.LLJ;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final String getEnterFrom() {
        return this.LLJI;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final EnumC1390800mIQ getEnterMethod() {
        return this.LLJIJIL;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final InterfaceC665370Q7z rx() {
        return this.LLIZLLLIL;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final boolean t5() {
        return this.LLJJIJI;
    }

    @Override // X.C20698515z5
    public final void LIZ(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.C20698515z5, X.InterfaceC20698115z1
    public final void Ol(EnumC715590S5d enumC715590S5d) {
        TranslationAbility translationAbility = (TranslationAbility) this.LLJJ.getValue();
        if (translationAbility != null) {
            translationAbility.Ol(enumC715590S5d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0S5A(C19EG c19eg, InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, String str, EnumC1390800mIQ enumC1390800mIQ, Function1<? super Boolean, Unit> function1) {
        super(aweme, str, enumC1390800mIQ, c19eg.getSupportFragmentManager(), c19eg);
        this.LLIZLLLIL = interfaceC665370Q7z;
        this.LLJ = aweme;
        this.LLJI = str;
        this.LLJIJIL = enumC1390800mIQ;
        this.LLJILJIL = function1;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1361));
        this.LLJILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1360));
        this.LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1362));
        this.LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1359));
        this.LLJJIII = new DialogInterfaceOnDismissListenerC738790SyT(this, 0);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(323));
        Integer numLJIILL = C20703515zt.LJIILL(aweme);
        if (numLJIILL != null) {
            numLJIILL.intValue();
        }
    }
}
