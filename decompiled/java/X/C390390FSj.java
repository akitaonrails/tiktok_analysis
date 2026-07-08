package X;

import Y.ACallableS238S0200000_5;
import android.content.Context;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C390390FSj implements C0FT7 {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final C0FUH LIZLLL;
    public final InterfaceC388760FMc LJ;
    public final LifecycleOwner LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(286));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(285));
    public final C0FUK LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final List<C0FTJ<StickerModel>> LJIIL;
    public final List<C0FTB> LJIILIIL;
    public final List<C0FUD> LJIILJJIL;
    public final List<AbstractC388880FMo<?>> LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;

    @Override // X.C0FT7
    public final C390340FSe Ja() {
        return new C390340FSe(this);
    }

    @Override // X.C0FT7
    public final void LIZJ() {
        for (C0FTJ c0ftj : (ArrayList) this.LJIIL) {
            if (c0ftj instanceof C0FFE) {
                C0FFE<? extends StickerModel> c0ffe = (C0FFE) c0ftj;
                if (c0ffe.LIZLLL()) {
                    LJIILL().LIZ().LIZIZ(c0ffe);
                }
            }
        }
    }

    @Override // X.C0FT7
    public final List<StickerModel> LIZLLL() {
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0FTJ<StickerModel>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJLI());
        }
        return arrayList;
    }

    @Override // X.C0FT7
    public final List<C0FEF> LJ() {
        List<C0FFO> list = this.LIZLLL.LJIIIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0FFO> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(LJIILLIIL().LIZ((EnumC1466150oFx) it3.next()).LIZIZ());
        }
        return arrayList2;
    }

    public final C0FTH LJIILL() {
        return (C0FTH) this.LJIIJ.getValue();
    }

    public final C390400FSk LJIILLIIL() {
        return (C390400FSk) this.LJIILLIIL.getValue();
    }

    public final C390420FSm LJIIZILJ() {
        return (C390420FSm) this.LJI.getValue();
    }

    @Override // X.C0FT7
    public final void Vv() {
        for (EnumC1466150oFx enumC1466150oFx : EnumC1466150oFx.values()) {
            List<C0FTJ<StickerModel>> listLLLLLZ = LLLLLZ(enumC1466150oFx);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLLLZ, 10));
            Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJLI());
            }
            T(arrayList, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FT7
    public final void initService() {
        C390420FSm c390420FSmLJIIZILJ = LJIIZILJ();
        c390420FSmLJIIZILJ.LIZ.put("StickerList", this.LJIIL);
        C390420FSm c390420FSmLJIIZILJ2 = LJIIZILJ();
        c390420FSmLJIIZILJ2.LIZ.put("StickerEventList", this.LJIILIIL);
        C390420FSm c390420FSmLJIIZILJ3 = LJIIZILJ();
        c390420FSmLJIIZILJ3.LIZ.put("StickerChangeInterceptorList", this.LJIILJJIL);
        C390420FSm c390420FSmLJIIZILJ4 = LJIIZILJ();
        String strLIZLLL = C13LE.LIZ(InterfaceC388760FMc.class).LIZLLL();
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        c390420FSmLJIIZILJ4.LIZ.put(strLIZLLL, this.LJ);
        LJIIZILJ().LIZLLL(this.LJIJ.getValue());
        LJIIZILJ().LIZLLL(this.LIZLLL);
        LJIIZILJ().LIZLLL(new C388990FMz(this.LJFF, LJIIZILJ()));
        LJIIZILJ().LIZLLL(LJIILL());
        Iterator<C0FFO> it2 = this.LIZLLL.LJIIIZ.iterator();
        while (it2.hasNext()) {
            AbstractC388880FMo abstractC388880FMoLIZ = it2.next().LJIJ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LJFF, this.LJ, LJIILL(), this.LIZLLL, LJIIZILJ());
            if (abstractC388880FMoLIZ != null) {
                ((ArrayList) this.LJIILL).add(abstractC388880FMoLIZ);
            }
        }
        ((C390510FSv) this.LJIIIZ.getValue()).LJFF = new C390370FSh(this);
        LJIILL().LJIIIIZZ = new C0FTC(this);
        LJIILL().LJIIIZ = new C0FT8(this);
        LJIILL().LJIIJ = new AwS584S0100000_5(this, 848);
        LJIILL().LJIIJJI = new AwS549S0100000_5(this, 1034);
        LJIILIIL(true);
        ((C1664690tQB) this.LJII.getValue()).LIZ(new C2217371BqR() { // from class: X.0FSw
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0FT5) obj).LIZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0FT5) obj).LIZ = ((Boolean) obj2).booleanValue();
            }
        }).LJIIIZ(this.LJFF, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 852));
    }

    @Override // X.C0FT7
    public final C0FUK ac() {
        return this.LJIIIIZZ;
    }

    public static void LJIJ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action", str);
        C20684815ws.LJIILLIIL("click_sticker_bubble", c0lab.LIZ);
    }

    @Override // X.C0FT7
    public final void Jp(C0FUD c0fud) {
        ((ArrayList) this.LJIILJJIL).add(c0fud);
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : list) {
            if ((c0ftj instanceof C0FFE) && c0ftj != null) {
                arrayList.add(c0ftj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0FFE) it2.next()).LJJIIZ(c0fud);
        }
    }

    @Override // X.C0FT7
    public final void LIZ(AddYoursStickerModel addYoursStickerModel) {
        C0FFE<? extends StickerModel> c0ffe;
        C0FTJ<StickerModel> c0ftjTq = tq(addYoursStickerModel.getId());
        if (c0ftjTq != null) {
            c0ftjTq.LJIIJJI(addYoursStickerModel);
            if ((c0ftjTq instanceof C0FFE) && (c0ffe = (C0FFE) c0ftjTq) != null) {
                LJIILL().LIZ().LIZIZ(c0ffe);
            }
        }
    }

    @Override // X.C0FT7
    public final void LJFF(Function1<? super C0FT5, Unit> function1) {
        function1.invoke(((C1664690tQB) this.LJII.getValue()).LIZ);
    }

    @Override // X.C0FT7
    public final void LJI(Function1<? super Map<Integer, String>, Unit> function1) {
        C15O7.LIZJ(new ACallableS238S0200000_5(this, function1, 0));
    }

    @Override // X.C0FT7
    public final void LJII(EnumC1466150oFx enumC1466150oFx) {
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((C0FTJ) obj).getStickerType() == enumC1466150oFx) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((C0FTJ) it2.next()).getStickerId()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LJIIJ(((Number) it3.next()).intValue(), null, true, EnumC356070Dxd.COMMIT);
        }
    }

    @Override // X.C0FT7
    public final void LJIIIIZZ(int i) {
        LJIILL().LJIIJ.invoke(Integer.valueOf(i));
    }

    @Override // X.C0FT7
    public final List<StickerModel> LJIIIZ(EnumC1466150oFx enumC1466150oFx) {
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : list) {
            if (c0ftj.getStickerType() == enumC1466150oFx) {
                arrayList.add(c0ftj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0FTJ) it2.next()).LJLI());
        }
        return arrayList2;
    }

    @Override // X.C0FT7
    public final void LJIIJJI(int i) {
        Object next;
        boolean z;
        TextStickerModel textStickerModel;
        TextTemplateModel textTemplateModel;
        C0FK0 c0fk0LJIILLIIL;
        TextStickerModel textStickerModel2;
        TextTemplateModel textTemplateModel2;
        Iterator it2 = ((ArrayList) this.LJIIL).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (((C0FTJ) next).getStickerId() != i);
        C0FTJ<? extends StickerModel> c0ftj = (C0FTJ) next;
        if (c0ftj == null) {
            return;
        }
        StickerModel stickerModelLJLI = c0ftj.LJLI();
        boolean z2 = stickerModelLJLI instanceof TextStickerModel;
        if (z2 && (textStickerModel2 = (TextStickerModel) stickerModelLJLI) != null && (textTemplateModel2 = textStickerModel2.getTextTemplateModel()) != null && textTemplateModel2.enableTextTemplate && C444960Hcc.LIZIZ()) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.LIZ);
            c1233040iBy.LIZIZ(2131850124);
            c1233040iBy.LIZLLL();
            return;
        }
        C0FF8 c0ff8LIZ = this.LJ.LIZ();
        if (c0ff8LIZ != null && (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) != null) {
            z = c0fk0LJIILLIIL.LIZJ;
        } else {
            z = false;
        }
        if (z2 && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && (textTemplateModel = textStickerModel.getTextTemplateModel()) != null && textTemplateModel.enableTextTemplate && !z) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(this.LIZ);
            c1233040iBy2.LIZIZ(2131850128);
            c1233040iBy2.LIZLLL();
        } else {
            c0ftj.setVisible(true);
            LIZIZ(stickerModelLJLI.getStickerType(), c0ftj, null, "", AFwS234S0000000_5.get$arr$(410));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0FFE<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> LJIIL(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390390FSj.LJIIL(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel):X.0FFE");
    }

    public final void LJIILIIL(boolean z) {
        if (z) {
            C0FUK c0fuk = this.LJIIIIZZ;
            c0fuk.LLILZIL.add(LJIILL().LJI());
            C0FUK c0fuk2 = this.LJIIIIZZ;
            c0fuk2.LLILZIL.add(LJIILL().LJFF());
            C0FUK c0fuk3 = this.LJIIIIZZ;
            c0fuk3.LLILZIL.add(LJIILL().LIZIZ());
            return;
        }
        C0FUK c0fuk4 = this.LJIIIIZZ;
        C0FTK c0ftkLJI = LJIILL().LJI();
        if (c0fuk4.LLILZIL.contains(c0ftkLJI)) {
            c0fuk4.LLILZIL.remove(c0ftkLJI);
        }
        C0FUK c0fuk5 = this.LJIIIIZZ;
        C0FSY c0fsyLJFF = LJIILL().LJFF();
        if (c0fuk5.LLILZIL.contains(c0fsyLJFF)) {
            c0fuk5.LLILZIL.remove(c0fsyLJFF);
        }
        C0FUK c0fuk6 = this.LJIIIIZZ;
        C390790FTx c390790FTxLIZIZ = LJIILL().LIZIZ();
        if (!c0fuk6.LLILZIL.contains(c390790FTxLIZIZ)) {
            return;
        }
        c0fuk6.LLILZIL.remove(c390790FTxLIZIZ);
    }

    public final void LJIILJJIL(EnumC356070Dxd enumC356070Dxd) {
        NLEEditor nLEEditorLJI;
        InterfaceC386690FEd interfaceC386690FEdLIZIZ;
        NLEEditor nLEEditorLJI2;
        int i = C350630Dor.LIZ[enumC356070Dxd.ordinal()];
        if (i != 1) {
            if (i == 2 && (interfaceC386690FEdLIZIZ = this.LJ.LIZIZ()) != null && (nLEEditorLJI2 = interfaceC386690FEdLIZIZ.LJI()) != null) {
                nLEEditorLJI2.commit();
                nLEEditorLJI2.done();
                return;
            }
            return;
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ2 = this.LJ.LIZIZ();
        if (interfaceC386690FEdLIZIZ2 == null || (nLEEditorLJI = interfaceC386690FEdLIZIZ2.LJI()) == null) {
            return;
        }
        nLEEditorLJI.commit();
    }

    @Override // X.C0FT7
    public final void LJJZZI(C0FTB c0ftb) {
        ((ArrayList) this.LJIILIIL).add(c0ftb);
    }

    @Override // X.C0FT7
    public final void LJLLLL(C0FTB c0ftb) {
        if (((ArrayList) this.LJIILIIL).contains(c0ftb)) {
            ((ArrayList) this.LJIILIIL).remove(c0ftb);
        }
    }

    @Override // X.C0FT7
    public <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx) {
        T t = (T) LJIILLIIL().LIZ(enumC1466150oFx).LIZIZ();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // X.C0FT7
    public final StickerModel LLJJIJI(int i) {
        C0FTJ<StickerModel> next;
        Iterator<C0FTJ<StickerModel>> it2 = this.LJIIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getStickerId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj = next;
        if (c0ftj == null) {
            return null;
        }
        return c0ftj.LJLI();
    }

    @Override // X.C0FT7
    public List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx) {
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : list) {
            if (c0ftj.getStickerType() == enumC1466150oFx) {
                arrayList.add(c0ftj);
            }
        }
        return arrayList;
    }

    @Override // X.C0FT7
    public final void ab(boolean z) {
        Iterator it2 = ((ArrayList) this.LJIIL).iterator();
        while (it2.hasNext()) {
            ((C0FTJ) it2.next()).setVisible(z);
        }
    }

    @Override // X.C0FT7
    public final void fm(C0FUG c0fug) {
        C0FFE c0ffe;
        for (C0FTJ<StickerModel> c0ftj : this.LJIIL) {
            if ((c0ftj instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj) != null) {
                c0ffe.LJJJJL(c0fug);
            }
        }
    }

    @Override // X.C0FT7
    public final void pm(C390500FSu c390500FSu) {
        C0FTK c0ftkLJI = LJIILL().LJI();
        c0ftkLJI.getClass();
        c390500FSu.getClass();
        c0ftkLJI.LLJILJIL = new RectF(c390500FSu.LIZLLL);
        c0ftkLJI.LJJIZ(c390500FSu.LIZLLL, c390500FSu.LJFF, c390500FSu.LIZIZ, c390500FSu.LJ, 0.0f, c390500FSu.LIZJ);
        c0ftkLJI.LJJIJLIJ(c390500FSu.LJFF, c390500FSu.LIZ);
    }

    @Override // X.C0FT7
    public final C0FTJ<StickerModel> tq(int i) {
        C0FTJ<StickerModel> next;
        Iterator<C0FTJ<StickerModel>> it2 = this.LJIIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getStickerId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.C0FT7
    public final void ur(Function1<? super C0FT5, C0FT5> function1) {
        ((C1664680tQA) this.LJII.getValue()).LIZLLL(function1, true);
    }

    @Override // X.C0FT7
    public final void Gk(int i, C0FUG c0fug) {
        Object next;
        C0FFE c0ffe;
        Iterator it2 = ((ArrayList) this.LJIIL).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (((C0FTJ) next).getStickerId() != i);
        if ((next instanceof C0FFE) && (c0ffe = (C0FFE) next) != null) {
            c0ffe.LIZ(c0fug);
        }
    }

    @Override // X.C0FT7
    public final void He(int i, C0FUG c0fug) {
        C0FTJ<StickerModel> next;
        C0FFE c0ffe;
        Iterator<C0FTJ<StickerModel>> it2 = this.LJIIL.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (next.getStickerId() != i);
        C0FTJ<StickerModel> c0ftj = next;
        if (c0ftj != null && (c0ftj instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj) != null) {
            c0ffe.LIZ(c0fug);
        }
    }

    @Override // X.C0FT7
    public final void T(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        C0ERI c0eri;
        if (list.isEmpty()) {
            return;
        }
        ArrayList<C0ERI> arrayList = new ArrayList();
        for (StickerModel stickerModel : list) {
            C0FTJ<StickerModel> c0ftjTq = tq(stickerModel.getId());
            if (c0ftjTq != null) {
                c0ftjTq.LJIL(stickerModel, false);
            }
            C0FFP c0ffpLIZIZ = null;
            if (c0ftjTq != null) {
                c0ffpLIZIZ = c0ftjTq.LIZIZ();
            }
            if ((c0ffpLIZIZ instanceof C0ERI) && (c0eri = (C0ERI) c0ffpLIZIZ) != null) {
                c0eri.LJIIJ = false;
                arrayList.add(c0eri);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0ERI) it2.next()).LIZLLL();
        }
        LJIILJJIL(enumC356070Dxd);
        for (C0ERI c0eri2 : arrayList) {
            c0eri2.LJIIJ = true;
            c0eri2.LIZIZ();
        }
    }

    @Override // X.C0FT7
    public StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) throws Exception {
        C0FFE<StickerModel> c0ffeLJIIL = LJIIL(stickerModel);
        C0FFP c0ffpLJJIL = c0ffeLJIIL.LJJIL();
        if (c0ffpLJJIL instanceof C0ERI) {
            c0ffpLJJIL.LIZLLL();
            C0ERI c0eri = (C0ERI) c0ffpLJJIL;
            c0eri.LJIIJ = true;
            LJIILJJIL(enumC356070Dxd);
            c0eri.LIZIZ();
        }
        return c0ffeLJIIL.LJLI();
    }

    @Override // X.C0FT7
    public final void k2(EnumC1466150oFx enumC1466150oFx, C0FUG c0fug) {
        C0FFE c0ffe;
        for (C0FTJ<StickerModel> c0ftj : this.LJIIL) {
            EnumC1466150oFx stickerType = null;
            if ((c0ftj instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj) != null) {
                stickerType = c0ffe.getStickerType();
            }
            if (stickerType == enumC1466150oFx) {
                ((C0FFE) c0ftj).LIZ(c0fug);
            }
        }
    }

    @Override // X.C0FT7
    public void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0ERI c0eri;
        C0FTJ<StickerModel> c0ftjTq = tq(stickerModel.getId());
        if (c0ftjTq != null) {
            c0ftjTq.LJIL(stickerModel, false);
        }
        C0FFP c0ffpLIZIZ = null;
        if (c0ftjTq != null) {
            c0ffpLIZIZ = c0ftjTq.LIZIZ();
        }
        if ((c0ffpLIZIZ instanceof C0ERI) && (c0eri = (C0ERI) c0ffpLIZIZ) != null) {
            c0eri.LJIIJ = false;
            c0eri.LIZLLL();
            LJIILJJIL(enumC356070Dxd);
            c0eri.LJIIJ = true;
            c0eri.LIZIZ();
        }
    }

    @Override // X.C0FT7
    public final void ql(int i, C0FUD c0fud) {
        Object next;
        C0FFE c0ffe;
        Iterator it2 = ((ArrayList) this.LJIIL).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (((C0FTJ) next).getStickerId() != i);
        if ((next instanceof C0FFE) && (c0ffe = (C0FFE) next) != null) {
            c0ffe.LJJIIZ(c0fud);
        }
    }

    @Override // X.C0FT7
    public final void rd(int i, EnumC1466150oFx enumC1466150oFx) {
        List<C0FTJ<StickerModel>> list = this.LJIIL;
        ArrayList<C0FTJ> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C0FTJ c0ftj = (C0FTJ) obj;
            if (enumC1466150oFx == null || c0ftj.getStickerType() == enumC1466150oFx) {
                arrayList.add(obj);
            }
        }
        for (C0FTJ c0ftj2 : arrayList) {
            BaseStickerModel baseModel = c0ftj2.LJLI().getBaseModel();
            if (baseModel.isManuallyClipped()) {
                float f = i;
                if (baseModel.getStartTime() >= f) {
                    LJIIJ(baseModel.getId(), "EXCEED_VIDEO_LENGTH", true, EnumC356070Dxd.COMMIT);
                } else if (baseModel.getEndTime() > f) {
                    c0ftj2.LJIIJ(baseModel.getStartTime(), f, C00E4.NORMAL);
                    List<C0FTB> list2 = this.LJIILIIL;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (ArrayList) list2) {
                        if (C13LQ.LJIILLIIL(c0ftj2.getStickerType(), ((C0FTB) obj2).LJJIJIL())) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0FTB) it2.next()).LJJIFFI(baseModel.getId());
                    }
                }
            } else {
                c0ftj2.LJIIJ(0.0f, i, C00E4.NORMAL);
                List<C0FTB> list3 = this.LJIILIIL;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (ArrayList) list3) {
                    if (C13LQ.LJIILLIIL(c0ftj2.getStickerType(), ((C0FTB) obj3).LJJIJIL())) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((C0FTB) it3.next()).LJJIFFI(baseModel.getId());
                }
            }
        }
    }

    @Override // X.C0FT7
    public final List<StickerModel> w3(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends StickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            C0FFE<StickerModel> c0ffeLJIIL = LJIIL(it2.next());
            c0ffeLJIIL.LJJIL().LIZLLL();
            arrayList.add(c0ffeLJIIL);
        }
        LJIILJJIL(enumC356070Dxd);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0FFP c0ffpLJJIL = ((C0FFE) it3.next()).LJJIL();
            if (c0ffpLJJIL instanceof C0ERI) {
                C0ERI c0eri = (C0ERI) c0ffpLJJIL;
                c0eri.LJIIJ = true;
                c0eri.LIZIZ();
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((C0FFE) it4.next()).LJLI());
        }
        return arrayList2;
    }

    @Override // X.C0FT7
    public final void M3(List<Integer> list, String str, EnumC356070Dxd enumC356070Dxd) {
        String str2;
        Object next;
        ArrayList<StickerModel> arrayList = new ArrayList();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            Iterator it3 = ((ArrayList) this.LJIIL).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((C0FTJ) next).getStickerId() == iIntValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FTJ c0ftj = (C0FTJ) next;
            if (c0ftj != null) {
                C0FFE c0ffe = (C0FFE) c0ftj;
                this.LJIIIIZZ.LJJIJIL(c0ffe.LJJIJIIJIL());
                C0FFP c0ffpLJJIL = c0ffe.LJJIL();
                if (c0ffpLJJIL instanceof C0ERI) {
                    ((C0ERI) c0ffpLJJIL).LJIIJ = false;
                }
                c0ftj.LLD(true);
                ((ArrayList) this.LJIIL).remove(c0ftj);
                arrayList.add(c0ffe.LJLI());
            }
        }
        if (((Boolean) C0AZY.LIZ.getValue()).booleanValue() && arrayList.isEmpty()) {
            return;
        }
        for (StickerModel stickerModel : arrayList) {
            for (C0FTB c0ftb : (ArrayList) this.LJIILIIL) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                c0ftb.LJIIJ(stickerModel, str2);
            }
        }
        LJIILJJIL(enumC356070Dxd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.tools.sticker.core.StickerModel] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.tools.sticker.core.StickerModel] */
    @Override // X.C0FT7
    public final StickerModel LJIIJ(int i, String str, boolean z, EnumC356070Dxd enumC356070Dxd) {
        C0FTJ<StickerModel> next;
        String str2;
        Iterator<C0FTJ<StickerModel>> it2 = this.LJIIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getStickerId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj = next;
        if (c0ftj == null) {
            return null;
        }
        C0FFE c0ffe = (C0FFE) c0ftj;
        this.LJIIIIZZ.LJJIJIL(c0ffe.LJJIJIIJIL());
        C0FFP c0ffpLJJIL = c0ffe.LJJIL();
        if (c0ffpLJJIL instanceof C0ERI) {
            ((C0ERI) c0ffpLJJIL).LJIIJ = false;
        }
        c0ffe.LLD(z);
        LJIILJJIL(enumC356070Dxd);
        ((ArrayList) this.LJIIL).remove(c0ftj);
        List<C0FTB> list = this.LJIILIIL;
        ArrayList<C0FTB> arrayList = new ArrayList();
        for (C0FTB c0ftb : list) {
            if (C13LQ.LJIILLIIL(c0ffe.getStickerType(), c0ftb.LJJIJIL())) {
                arrayList.add(c0ftb);
            }
        }
        for (C0FTB c0ftb2 : arrayList) {
            ?? LJLI = c0ffe.LJLI();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            c0ftb2.LJIIJ(LJLI, str2);
        }
        return c0ffe.LJLI();
    }

    @Override // X.C0FT7
    public final void LIZIZ(EnumC1466150oFx enumC1466150oFx, C0FTJ<? extends StickerModel> c0ftj, C388340FKm c388340FKm, String str, Function1<? super StickerModel, Unit> function1) {
        this.LJ.LJJII();
        this.LJ.LJJIIJ(2);
        new C390340FSe(this).LJIIIZ();
        C390510FSv c390510FSv = (C390510FSv) this.LJIIIZ.getValue();
        C390400FSk c390400FSk = c390510FSv.LIZLLL;
        c390400FSk.LIZ(enumC1466150oFx).LJI(c0ftj, c388340FKm, c390510FSv.LJFF, str, function1);
    }

    @Override // X.C0FT7
    public final void Ne(EnumC1466150oFx enumC1466150oFx, List<? extends StickerModel> list, String str, Function0<Unit> function0, Function0<Unit> function02) {
        LJIILLIIL().LIZ(enumC1466150oFx).LJFF(enumC1466150oFx, list, str, function0, function02);
    }

    public C390390FSj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, C0FUH c0fuh, InterfaceC388760FMc interfaceC388760FMc, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = frameLayout;
        this.LIZJ = frameLayout2;
        this.LIZLLL = c0fuh;
        this.LJ = interfaceC388760FMc;
        this.LJFF = lifecycleOwner;
        C0FUK c0fuk = new C0FUK();
        LJIIZILJ().LIZLLL(c0fuk);
        this.LJIIIIZZ = c0fuk;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1016));
        this.LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1013));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1014));
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList();
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1015));
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1012));
        this.LJIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1017));
    }
}
