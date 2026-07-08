package X;

import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.cla.et.newet.ExpandSubtitleEvent;
import com.ss.android.ugc.aweme.cla.et.newet.HideSubtitleEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS12S0120000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import njp.a;

/* JADX INFO: renamed from: X.15yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$initCaptionToggle$3", f = "CaptionsPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C20697915yz extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ CaptionsPanelFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20697915yz(CaptionsPanelFragment captionsPanelFragment, boolean z, InterfaceC1364105Vn<? super C20697915yz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = captionsPanelFragment;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20697915yz c20697915yz = new C20697915yz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c20697915yz.LL = ((Boolean) obj).booleanValue();
        return c20697915yz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC20698115z1 interfaceC20698115z12;
        int i;
        InterfaceC20698115z1 interfaceC20698115z13;
        C20698415z4 c20698415z4;
        InterfaceC20698115z1 interfaceC20698115z14;
        C1C7U.LIZ("CaptionsPanelFragment@ac5.initCaptionToggle$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        CaptionsPanelFragment captionsPanelFragment = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C19292910dr c19292910dr = captionsPanelFragment.LLJIJIL;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS12S0120000_31(captionsPanelFragment, z, z2, 1));
        }
        C20693915yL c20693915yL = captionsPanelFragment.LLJILJIL;
        if (c20693915yL != null) {
            c20693915yL.LJI(new AwS610S0100000_31(captionsPanelFragment, 549));
        }
        AbstractC1604130rqV abstractC1604130rqVHS = captionsPanelFragment.hS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsPanelFragment onCaptionToggleChanged: ");
        sbLIZ.append(z);
        sbLIZ.append(", captionsAvailable: ");
        sbLIZ.append(z2);
        sbLIZ.append(", getIsMasterTranslationToggleOn: ");
        sbLIZ.append(C746760TRa.LIZ().LJLILLLLZI());
        abstractC1604130rqVHS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C746760TRa.LIZ().LJLILLLLZI() && (c20698415z4 = captionsPanelFragment.LLILLJJLI) != null && (interfaceC20698115z14 = c20698415z4.LIZ) != null) {
            interfaceC20698115z14.Ol(EnumC715590S5d.TOGGLE_CAPTION);
        }
        boolean zLIZJ = C299060Bns.LIZJ();
        if (z) {
            C20698415z4 c20698415z42 = captionsPanelFragment.LLILLJJLI;
            if (c20698415z42 != null && (interfaceC20698115z13 = c20698415z42.LIZ) != null) {
                interfaceC20698115z13.qu();
            }
            if (z2) {
                i = 2131834709;
            } else {
                i = 2131828830;
            }
            if (!zLIZJ || !z2) {
                C1389890mGx c1389890mGx = new C1389890mGx(captionsPanelFragment);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
        } else if (!zLIZJ) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(captionsPanelFragment);
            c1389890mGx2.LJIIIZ(2131834708);
            c1389890mGx2.LJIIJJI();
        }
        InterfaceC665370Q7z interfaceC665370Q7zRx = null;
        if (z) {
            C20698415z4 c20698415z43 = captionsPanelFragment.LLILLJJLI;
            if (c20698415z43 != null && (interfaceC20698115z12 = c20698415z43.LIZ) != null) {
                interfaceC665370Q7zRx = interfaceC20698115z12.rx();
            }
            C207069161b.LIZJ(ExpandSubtitleEvent.class, interfaceC665370Q7zRx, new AnonymousClass0174(), C13BV.INSTANCE);
        } else {
            C20698415z4 c20698415z44 = captionsPanelFragment.LLILLJJLI;
            if (c20698415z44 != null && (interfaceC20698115z1 = c20698415z44.LIZ) != null) {
                interfaceC665370Q7zRx = interfaceC20698115z1.rx();
            }
            C207069161b.LIZJ(HideSubtitleEvent.class, interfaceC665370Q7zRx, new AnonymousClass0174(), C13BV.INSTANCE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionsPanelFragment@ac5.initCaptionToggle$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
