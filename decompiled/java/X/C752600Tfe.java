package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetAdapter$showDeleteAlert$1$1", f = "SlotsBottomSheetAdapter.kt", l = {232}, m = "invokeSuspend")
public final class C752600Tfe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ DialogC780480UjW LLILLL;
    public final /* synthetic */ InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ C756080TlG LLILZLL;
    public final /* synthetic */ DialogInterface LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752600Tfe(DialogC780480UjW dialogC780480UjW, InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC, View view, C756080TlG c756080TlG, DialogInterface dialogInterface, InterfaceC1364105Vn<? super C752600Tfe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = dialogC780480UjW;
        this.LLILZ = interfaceC1124060fMC;
        this.LLILZIL = view;
        this.LLILZLL = c756080TlG;
        this.LLIZ = dialogInterface;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752600Tfe(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("SlotsBottomSheetAdapter@97d8.showDeleteAlert$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String string = null;
        if (i != 0) {
            if (i == 1) {
                arrayList = (ArrayList) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C786410Ut5.L4(this.LLILLL);
            arrayList = new ArrayList();
            C1DFB c1dfb = C0PEM.LIZJ;
            C752590Tfd c752590Tfd = new C752590Tfd(arrayList, this.LLILZLL, this.LLILZ, null);
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c752590Tfd) == objLJFF) {
                C1C7U.LIZIZ("SlotsBottomSheetAdapter@97d8.showDeleteAlert$1$1");
                return objLJFF;
            }
        }
        DialogC780480UjW dialogC780480UjW = this.LLILLL;
        dialogC780480UjW.dismiss();
        C785410UrT.LIZ(dialogC780480UjW);
        if (arrayList.isEmpty()) {
            InterfaceC752610Tff interfaceC752610TffLIZJ = this.LLILZ.LLILZLL().LIZJ();
            if (interfaceC752610TffLIZJ != null) {
                interfaceC752610TffLIZJ.LIZ(this.LLILZIL, "before_live_dialog_item");
            }
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Boolean.valueOf(((Boolean) next).booleanValue() & ((Boolean) it2.next()).booleanValue());
                }
                if (((Boolean) next).booleanValue()) {
                    InterfaceC752610Tff interfaceC752610TffLIZJ2 = this.LLILZ.LLILZLL().LIZJ();
                    if (interfaceC752610TffLIZJ2 != null) {
                        interfaceC752610TffLIZJ2.LIZ(this.LLILZIL, "before_live_dialog_item");
                    }
                } else {
                    Context context = this.LLILZLL.LL.getContext();
                    if (context != null) {
                        string = context.getString(2131834210);
                    }
                    C766270U4b.LJIIJJI(string);
                }
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        this.LLIZ.dismiss();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlotsBottomSheetAdapter@97d8.showDeleteAlert$1$1");
        return unit;
    }
}
