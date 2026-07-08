package X;

import android.widget.FrameLayout;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.editorpro.components.api.text.editpanel.IEPTextEditPanelService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ESn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364950ESn extends C09AY implements Function1<C539960LFq, Unit> {
    public final /* synthetic */ h0<Boolean> LL;
    public final /* synthetic */ C0ETT LLILLJJLI;
    public final /* synthetic */ C372830EjZ LLILLL;
    public final /* synthetic */ IEPTextEditPanelService LLILZ;
    public final /* synthetic */ C372480Ej0 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ InterfaceC362350EIn LLIZLLLIL;
    public final /* synthetic */ Function2<VideoPublishEditModel, Boolean, AbstractC2217051Bpv> LLJ;
    public final /* synthetic */ C372350Ein LLJI;
    public final /* synthetic */ C372500Ej2 LLJIJIL;
    public final /* synthetic */ Function1<Boolean, Boolean> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364950ESn(int i, int i2, h0 h0Var, C372830EjZ c372830EjZ, IEPTextEditPanelService iEPTextEditPanelService, C372500Ej2 c372500Ej2, C372480Ej0 c372480Ej0, C372350Ein c372350Ein, InterfaceC362350EIn interfaceC362350EIn, C0ETT c0ett, AwS584S0100000_5 awS584S0100000_5, C0ET7 c0et7) {
        super(1);
        this.LL = h0Var;
        this.LLILLJJLI = c0ett;
        this.LLILLL = c372830EjZ;
        this.LLILZ = iEPTextEditPanelService;
        this.LLILZIL = c372480Ej0;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = interfaceC362350EIn;
        this.LLJ = c0et7;
        this.LLJI = c372350Ein;
        this.LLJIJIL = c372500Ej2;
        this.LLJILJIL = awS584S0100000_5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C539960LFq c539960LFq) {
        boolean z;
        int i;
        int i2;
        C539960LFq c539960LFq2 = c539960LFq;
        C365090ETb.LIZIZ();
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
        C372480Ej0 c372480Ej0 = this.LLILZIL;
        EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C0E9C.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC359950E9h.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, InterfaceC359950E9h.class, C0E9C.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej0, 176));
        C372480Ej0 c372480Ej02 = this.LLILZIL;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register slotUIComponent ");
        sbLIZ2.append(C385710FAj.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC361710EGb.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, InterfaceC361710EGb.class, C385710FAj.class, C0FBI.class, R.id.gtp, enumC371580EhY, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej02, 169));
        C372480Ej0 c372480Ej03 = this.LLILZIL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register slotUIComponent ");
        sbLIZ3.append(C0E7Z.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(C0E5S.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0E5S.class, C0E7Z.class, C359740E8m.class, R.id.ygy, enumC371580EhY, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej03, 171));
        C372480Ej0 c372480Ej04 = this.LLILZIL;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("register slotUIComponent ");
        sbLIZ4.append(C373420EkW.class.getName());
        sbLIZ4.append(" api ");
        sbLIZ4.append(InterfaceC360800ECo.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, InterfaceC360800ECo.class, C373420EkW.class, C373410EkV.class, R.id.gcu, enumC371580EhY, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej04, 173));
        C372480Ej0 c372480Ej05 = this.LLILZIL;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("register slotUIComponent ");
        sbLIZ5.append(C361870EGr.class.getName());
        sbLIZ5.append(" api ");
        sbLIZ5.append(C0EGY.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0EGY.class, C361870EGr.class, C0EJ9.class, R.id.gcv, enumC371580EhY, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej05, 174));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("register component ");
        sbLIZ6.append(C365080ETa.class.getName());
        sbLIZ6.append(" api ");
        sbLIZ6.append(C0EFH.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0EFH.class, C365080ETa.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 732));
        if (C273440Ane.LIZ()) {
            h0<Boolean> h0Var = this.LL;
            C372480Ej0 c372480Ej06 = this.LLILZIL;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("register component ");
            sbLIZ7.append(C0EXU.class.getName());
            sbLIZ7.append(" api ");
            sbLIZ7.append(InterfaceC366350EXx.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var, InterfaceC366350EXx.class, C0EXU.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej06, 159));
        }
        h0<Boolean> h0Var2 = this.LL;
        C372480Ej0 c372480Ej07 = this.LLILZIL;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("register component ");
        sbLIZ8.append(C0EGB.class.getName());
        sbLIZ8.append(" api ");
        sbLIZ8.append(C0EC7.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var2, C0EC7.class, C0EGB.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej07, 160));
        h0<Boolean> h0Var3 = this.LL;
        C372480Ej0 c372480Ej08 = this.LLILZIL;
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("register component ");
        sbLIZ9.append(C359930E9f.class.getName());
        sbLIZ9.append(" api ");
        sbLIZ9.append(InterfaceC376600Epe.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var3, InterfaceC376600Epe.class, C359930E9f.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej08, 161));
        h0<Boolean> h0Var4 = this.LL;
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("register component ");
        sbLIZ10.append(C365620EVc.class.getName());
        sbLIZ10.append(" api ");
        sbLIZ10.append(C0E4L.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ10));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var4, C0E4L.class, C365620EVc.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 737));
        if (C301710Bs9.LIZ(null) || this.LLILLJJLI.LIZJ) {
            h0<Boolean> h0Var5 = this.LL;
            C372480Ej0 c372480Ej09 = this.LLILZIL;
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("register component ");
            sbLIZ11.append(C0E9L.class.getName());
            sbLIZ11.append(" api ");
            sbLIZ11.append(InterfaceC358970E5n.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ11));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var5, InterfaceC358970E5n.class, C0E9L.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej09, 163));
        }
        if (this.LLILLJJLI.LJJI) {
            h0<Boolean> h0Var6 = this.LL;
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("register component ");
            sbLIZ12.append(C197016126k.class.getName());
            sbLIZ12.append(" api ");
            sbLIZ12.append(InterfaceC365660EVg.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ12));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var6, InterfaceC365660EVg.class, C197016126k.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 740));
        }
        h0<Boolean> h0Var7 = this.LL;
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("register component ");
        sbLIZ13.append(C351690DqZ.class.getName());
        sbLIZ13.append(" api ");
        sbLIZ13.append(C0ENB.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ13));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var7, C0ENB.class, C351690DqZ.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 742));
        C372830EjZ c372830EjZ = this.LLILLL;
        if (c372830EjZ != null) {
            h0<Boolean> h0Var8 = this.LL;
            C0ETT c0ett = this.LLILLJJLI;
            C372480Ej0 c372480Ej010 = this.LLILZIL;
            int i3 = this.LLILZLL;
            int i4 = this.LLIZ;
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("register component ");
            sbLIZ14.append(C0EVO.class.getName());
            sbLIZ14.append(" api ");
            sbLIZ14.append(InterfaceC362230EIb.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ14));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var8, InterfaceC362230EIb.class, C0EVO.class, new C364980ESq(new C0ET4(), c539960LFq2, c372480Ej010, c372830EjZ, i3, i4));
            C1403010mc7.LIZ.getCommerceService();
            int iLIZ = C1465270oEX.LIZ();
            if (c0ett.LJFF || c0ett.LJIILLIIL || (C266750Acr.LIZ(iLIZ) && !c0ett.LIZIZ)) {
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append("register component ");
                sbLIZ15.append(C377450Er1.class.getName());
                sbLIZ15.append(" api ");
                sbLIZ15.append(InterfaceC377490Er5.class.getName());
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ15));
                c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var8, InterfaceC377490Er5.class, C377450Er1.class, new AwS214S0300000_5(new C0ET4(), c539960LFq2, c372480Ej010, c372830EjZ, 23));
            }
        }
        h0<Boolean> h0Var9 = this.LL;
        InterfaceC362350EIn interfaceC362350EIn = this.LLIZLLLIL;
        C1659700tI8.LIZ("register component " + C0EIN.class.getName() + " api " + C0EIW.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var9, C0EIW.class, C0EIN.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, interfaceC362350EIn, 162));
        if (C0C1M.LIZ()) {
            h0<Boolean> h0Var10 = this.LL;
            C1659700tI8.LIZ("register component " + C1458160o34.class.getName() + " api " + InterfaceC1465140oEK.class.getName());
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var10, InterfaceC1465140oEK.class, C1458160o34.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 739));
        }
        Function2<VideoPublishEditModel, Boolean, AbstractC2217051Bpv> function2 = this.LLJ;
        C1659700tI8.LIZ("register component " + C364970ESp.class.getName() + " api " + C0ER1.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0ER1.class, C364970ESp.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, function2, 164));
        C372480Ej0 c372480Ej011 = this.LLILZIL;
        C1659700tI8.LIZ("register component " + C0FE8.class.getName() + " api " + C0EOK.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, C0EOK.class, C0FE8.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej011, 165));
        C372480Ej0 c372480Ej012 = this.LLILZIL;
        C1659700tI8.LIZ("register component " + C0EPI.class.getName() + " api " + C0EJ3.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, C0EJ3.class, C0EPI.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej012, 166));
        C372480Ej0 c372480Ej013 = this.LLILZIL;
        C1659700tI8.LIZ("register component " + C0EQI.class.getName() + " api " + C0EHC.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0EHC.class, C0EQI.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej013, 168));
        C372350Ein c372350Ein = this.LLJI;
        C1659700tI8.LIZ("register component " + C0EPL.class.getName() + " api " + C0EPP.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0EPP.class, C0EPL.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372350Ein, 170));
        C372480Ej0 c372480Ej014 = this.LLILZIL;
        C1659700tI8.LIZ("register component " + C360580EBs.class.getName() + " api " + C0EB6.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn2, null, C0EB6.class, C360580EBs.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej014, 172));
        C372480Ej0 c372480Ej015 = this.LLILZIL;
        C372830EjZ c372830EjZ2 = this.LLILLL;
        C1659700tI8.LIZ("register component " + C356720Dyg.class.getName() + " api " + C0E0G.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, C0E0G.class, C356720Dyg.class, new AwS214S0300000_5(new C0ET4(), c539960LFq2, c372480Ej015, c372830EjZ2, 19));
        C372500Ej2 c372500Ej2 = this.LLJIJIL;
        C372480Ej0 c372480Ej016 = this.LLILZIL;
        Function1<Boolean, Boolean> function1 = this.LLJILJIL;
        C1659700tI8.LIZ("register slotUIComponent " + C0EZJ.class.getName() + " api " + InterfaceC362600EJm.class.getName());
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC362600EJm.class, C0EZJ.class, C0EZS.class, R.id.io1, enumC371580EhY, new AwS103S0400000_5(new C0ET4(), c539960LFq2, c372500Ej2, c372480Ej016, function1, 3));
        C0LEK c0lek = c539960LFq2.LIZ;
        C559610Lx9 c559610Lx9 = new C559610Lx9(c0lek, "sticker_preview");
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append("register component ");
        sbLIZ16.append(C0EB8.class.getName());
        sbLIZ16.append(" api ");
        sbLIZ16.append(InterfaceC372990Ejp.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ16));
        c0lek.LIZ("sticker_preview", enumC1642750sqn2, null, InterfaceC372990Ejp.class, C0EB8.class, new AwS584S0100000_5(new C0ET4(), c559610Lx9, 749));
        if (C301750BsD.LIZ()) {
            C372480Ej0 c372480Ej017 = this.LLILZIL;
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("register slotUIComponent ");
            sbLIZ17.append(C19519311Yh.class.getName());
            sbLIZ17.append(" api ");
            sbLIZ17.append(InterfaceC362470EIz.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ17));
            c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC362470EIz.class, C19519311Yh.class, C19520211Yq.class, R.id.voice_clone_panel_container, enumC371580EhY, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej017, 177));
        }
        if (this.LLILLJJLI.LJ) {
            C372480Ej0 c372480Ej018 = this.LLILZIL;
            C1659700tI8.LIZ("register component " + C363810EOd.class.getName() + " api " + InterfaceC357820E1c.class.getName());
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC357820E1c.class, C363810EOd.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej018, 175));
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append("register component ");
            sbLIZ18.append(C363860EOi.class.getName());
            sbLIZ18.append(" api ");
            sbLIZ18.append(InterfaceC363820EOe.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ18));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC363820EOe.class, C363860EOi.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 747));
            C372480Ej0 c372480Ej019 = this.LLILZIL;
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append("register component ");
            sbLIZ19.append(C1465350oEf.class.getName());
            sbLIZ19.append(" api ");
            sbLIZ19.append(InterfaceC1465230oET.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ19));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC1465230oET.class, C1465350oEf.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej019, 179));
        }
        C372480Ej0 c372480Ej020 = this.LLILZIL;
        C372830EjZ c372830EjZ3 = this.LLILLL;
        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
        sbLIZ20.append("register component ");
        sbLIZ20.append(C373630Ekr.class.getName());
        sbLIZ20.append(" api ");
        sbLIZ20.append(C0EFV.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ20));
        EnumC1642750sqn enumC1642750sqn3 = enumC1642750sqn2;
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, C0EFV.class, C373630Ekr.class, new AwS214S0300000_5(new C0ET4(), c539960LFq2, c372480Ej020, c372830EjZ3, 20));
        if (C351230Dpp.LJ(null)) {
            C372480Ej0 c372480Ej021 = this.LLILZIL;
            C372830EjZ c372830EjZ4 = this.LLILLL;
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("register component ");
            sbLIZ21.append(C0F2W.class.getName());
            sbLIZ21.append(" api ");
            sbLIZ21.append(InterfaceC361310EEn.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ21));
            enumC1642750sqn3 = enumC1642750sqn3;
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, InterfaceC361310EEn.class, C0F2W.class, new AwS214S0300000_5(new C0ET4(), c539960LFq2, c372480Ej021, c372830EjZ4, 22));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_transition_guide", true, false)) {
            C372480Ej0 c372480Ej022 = this.LLILZIL;
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("register component ");
            sbLIZ22.append(C366860EZw.class.getName());
            sbLIZ22.append(" api ");
            sbLIZ22.append(C0EFW.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ22));
            enumC1642750sqn3 = enumC1642750sqn3;
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, C0EFW.class, C366860EZw.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej022, 181));
        }
        C372480Ej0 c372480Ej023 = this.LLILZIL;
        StringBuilder sbLIZ23 = C2188811AlT.LIZ();
        sbLIZ23.append("register component ");
        sbLIZ23.append(C376420EpM.class.getName());
        sbLIZ23.append(" api ");
        sbLIZ23.append(InterfaceC372610EjD.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ23));
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC372610EjD.class, C376420EpM.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej023, 182));
        if (this.LLILLJJLI.LJIJJ) {
            StringBuilder sbLIZ24 = C2188811AlT.LIZ();
            sbLIZ24.append("register component ");
            sbLIZ24.append(C0ECA.class.getName());
            sbLIZ24.append(" api ");
            sbLIZ24.append(C0EGQ.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ24));
            enumC1642750sqn3 = enumC1642750sqn3;
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, C0EGQ.class, C0ECA.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 751));
        }
        if (C1458070o2v.LJFF()) {
            StringBuilder sbLIZ25 = C2188811AlT.LIZ();
            sbLIZ25.append("register component ");
            sbLIZ25.append(C0ETR.class.getName());
            sbLIZ25.append(" api ");
            sbLIZ25.append(C0ET5.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ25));
            enumC1642750sqn3 = enumC1642750sqn3;
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, C0ET5.class, C0ETR.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 752));
        }
        if (C365010ESt.LIZ(this.LLILLJJLI)) {
            C372480Ej0 c372480Ej024 = this.LLILZIL;
            StringBuilder sbLIZ26 = C2188811AlT.LIZ();
            sbLIZ26.append("register component ");
            sbLIZ26.append(C376630Eph.class.getName());
            sbLIZ26.append(" api ");
            sbLIZ26.append(InterfaceC376440EpO.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ26));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn3, null, InterfaceC376440EpO.class, C376630Eph.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej024, 184));
        }
        if ((this.LLILLJJLI.LIZJ && C357610E0h.LIZ()) || this.LLILLJJLI.LJIIJ || C357620E0i.LIZ()) {
            EnumC371580EhY enumC371580EhY2 = EnumC371580EhY.HIDE;
            h0<Boolean> h0Var11 = this.LL;
            C372480Ej0 c372480Ej025 = this.LLILZIL;
            StringBuilder sbLIZ27 = C2188811AlT.LIZ();
            sbLIZ27.append("register slotUIComponent ");
            sbLIZ27.append(C377280Eqk.class.getName());
            sbLIZ27.append(" api ");
            sbLIZ27.append(InterfaceC376450EpP.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ27));
            c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var11, InterfaceC376450EpP.class, C377280Eqk.class, C380350Evh.class, R.id.b_0, enumC371580EhY2, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej025, 178));
        }
        if (this.LLILLJJLI.LJI) {
            i2 = 0;
            z = true;
            i = 31744;
            this.LLILZ.LIZIZ(new C0FAJ(c539960LFq2, this.LLILZIL, EnumC371580EhY.HIDE, enumC1642750sqn, this.LL));
        } else {
            z = true;
            i = 31744;
            i2 = 0;
            IEPTextEditPanelService iEPTextEditPanelService = this.LLILZ;
            C372480Ej0 c372480Ej026 = this.LLILZIL;
            iEPTextEditPanelService.LIZ(new C0FAJ(c539960LFq2, c372480Ej026, EnumC371580EhY.HIDE, enumC1642750sqn, this.LL), (FrameLayout) c372480Ej026.requireViewById(R.id.gcx), (FrameLayout) this.LLILZIL.requireViewById(R.id.w60));
        }
        C0ET3.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIJ(i, i2, "ep_caption_panel_in_editing", z) != 0 && C295900Bim.LIZ() && C338630DPh.LIZ()) {
            EnumC371580EhY enumC371580EhY3 = EnumC371580EhY.HIDE;
            C372480Ej0 c372480Ej027 = this.LLILZIL;
            StringBuilder sbLIZ28 = C2188811AlT.LIZ();
            sbLIZ28.append("register slotUIComponent ");
            sbLIZ28.append(C371830Ehx.class.getName());
            sbLIZ28.append(" api ");
            sbLIZ28.append(InterfaceC365030ESv.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ28));
            c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC365030ESv.class, C371830Ehx.class, C371870Ei1.class, R.id.h9q, enumC371580EhY3, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej027, 180));
        }
        if (this.LLILLJJLI.LJIIJ) {
            h0<Boolean> h0Var12 = this.LL;
            C372480Ej0 c372480Ej028 = this.LLILZIL;
            StringBuilder sbLIZ29 = C2188811AlT.LIZ();
            sbLIZ29.append("register component ");
            sbLIZ29.append(C377590ErF.class.getName());
            sbLIZ29.append(" api ");
            sbLIZ29.append(InterfaceC377650ErL.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ29));
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, h0Var12, InterfaceC377650ErL.class, C377590ErF.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej028, 185));
            EnumC371580EhY enumC371580EhY4 = EnumC371580EhY.HIDE;
            C372480Ej0 c372480Ej029 = this.LLILZIL;
            C0ETT c0ett2 = this.LLILLJJLI;
            StringBuilder sbLIZ30 = C2188811AlT.LIZ();
            sbLIZ30.append("register slotUIComponent ");
            sbLIZ30.append(C377730ErT.class.getName());
            sbLIZ30.append(" api ");
            sbLIZ30.append(InterfaceC377410Eqx.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ30));
            c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC377410Eqx.class, C377730ErT.class, AbstractC376010Eoh.class, R.id.gcw, enumC371580EhY4, new AwS214S0300000_5(new C0ET4(), c539960LFq2, c372480Ej029, c0ett2, 21));
            C372480Ej0 c372480Ej030 = this.LLILZIL;
            StringBuilder sbLIZ31 = C2188811AlT.LIZ();
            sbLIZ31.append("register slotUIComponent ");
            sbLIZ31.append(C382480Ez8.class.getName());
            sbLIZ31.append(" api ");
            sbLIZ31.append(InterfaceC376000Eog.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ31));
            c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC376000Eog.class, C382480Ez8.class, C0FC1.class, R.id.gcw, enumC371580EhY4, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej030, 167));
            C372830EjZ c372830EjZ5 = this.LLILLL;
            if (c372830EjZ5 != null) {
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append("register component ");
                sbLIZ32.append(C0ELO.class.getName());
                sbLIZ32.append(" api ");
                sbLIZ32.append(InterfaceC363160ELq.class.getName());
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ32));
                c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC363160ELq.class, C0ELO.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372830EjZ5, 183));
            }
            C1659700tI8.LIZ("register component " + C363150ELp.class.getName() + " api " + InterfaceC363170ELr.class.getName());
            c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC363170ELr.class, C363150ELp.class, new AwS584S0100000_5(new C0ET4(), c539960LFq2, 734));
        }
        C372480Ej0 c372480Ej031 = this.LLILZIL;
        C1659700tI8.LIZ("register component " + C2244708qr.class.getName() + " api " + InterfaceC361290EEl.class.getName());
        c539960LFq2.LIZ.LIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC361290EEl.class, C2244708qr.class, new AwS371S0200000_5(new C0ET4(), c539960LFq2, c372480Ej031, 158));
        return Unit.LIZ;
    }
}
