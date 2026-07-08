package X;

import Y.ALAdapterS2S0100000_5;
import Y.AObserverS209S0100000_5;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362780EKe extends AbstractC2255721DQs<InterfaceC364910ESj> implements InterfaceC364910ESj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C214799194j LL;
    public final C19A3 LLILLJJLI;
    public final CreativeBottomSheetBehavior<View> LLILLL;
    public final C1DRG LLILZ;
    public Function1<? super TextStickerModel, Unit> LLJ;
    public InterfaceC385510F9p LLJIJIL;
    public C09AE LLJILLL;
    public final C362770EKd LLJJ;
    public final C0EOK LLJJI;
    public final C0EJ3 LLJJIII;
    public final InterfaceC384330F5b LLJJIJI;
    public Integer LLJJIJIIJIL;
    public EnumC362260EIe LLJJIJIL;
    public final InterfaceC364910ESj LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C362760EKc.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC362840EKk.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC362820EKi.class, null);
    public final TextPaint LLJI = new TextPaint();
    public final h0<Boolean> LLJILJIL = new h0<>(Boolean.FALSE);
    public final Function0<Unit> LLJILJILJ = AFwS191S0000000_5.get$arr$(181);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C362780EKe.class, "panelContextData", "getPanelContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/template/ui/CaptionTemplatePanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C362780EKe.class, "navBarApi", "getNavBarApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/template/api/CaptionTemplateNavBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C362780EKe.class, "captionTemplateApi", "getCaptionTemplateApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/template/api/CaptionTemplateListApi;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJJIL = 8;
    }

    @Override // X.InterfaceC364910ESj
    public void D52() {
        View view;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator updateListener;
        C361860EGq c361860EGq;
        InterfaceC362230EIb interfaceC362230EIbLJIIJJI;
        EnumC362260EIe enumC362260EIePg0;
        C19A3 c19a3;
        View viewFindViewById;
        C361860EGq c361860EGq2;
        w2(false);
        C362760EKc c362760EKcC3 = c3();
        if ((c362760EKcC3 == null || (c361860EGq2 = c362760EKcC3.LLJIJIL) == null || !c361860EGq2.LIZ) ? false : true) {
            C362760EKc c362760EKcC32 = c3();
            if (c362760EKcC32 != null && (c19a3 = c362760EKcC32.LLJ) != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
            }
            C362760EKc c362760EKcC33 = c3();
            if (c362760EKcC33 != null) {
                interfaceC362230EIbLJIIJJI = c362760EKcC33.LJIIJJI();
                if (interfaceC362230EIbLJIIJJI != null) {
                    enumC362260EIePg0 = interfaceC362230EIbLJIIJJI.pg0();
                }
                this.LLJJIJIL = enumC362260EIePg0;
                if (enumC362260EIePg0 == EnumC362260EIe.MIN && interfaceC362230EIbLJIIJJI != null) {
                    interfaceC362230EIbLJIIJJI.td1(EnumC362260EIe.MAX);
                }
            } else {
                interfaceC362230EIbLJIIJJI = null;
            }
            enumC362260EIePg0 = null;
            this.LLJJIJIL = enumC362260EIePg0;
            if (enumC362260EIePg0 == EnumC362260EIe.MIN) {
                interfaceC362230EIbLJIIJJI.td1(EnumC362260EIe.MAX);
            }
        }
        C362760EKc c362760EKcC34 = c3();
        long j = (c362760EKcC34 == null || (c361860EGq = c362760EKcC34.LLJIJIL) == null || !c361860EGq.LIZ) ? 250L : 300L;
        C19A3 c19a32 = this.LLILLJJLI;
        if (c19a32 == null || (view = c19a32.mView) == null) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (viewPropertyAnimatorAnimate != null && (listener2 = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener = listener2.setUpdateListener(null)) != null) {
            updateListener.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view.animate();
        if (viewPropertyAnimatorAnimate2 != null) {
            viewPropertyAnimatorAnimate2.setInterpolator(C1619980sG4.LIZLLL());
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
        if (viewPropertyAnimatorAnimate3 == null || (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate3.translationY(0.0f)) == null || (duration = viewPropertyAnimatorTranslationY.setDuration(j)) == null || (listener = duration.setListener(new ALAdapterS2S0100000_5(this, 5))) == null) {
            return;
        }
        listener.start();
    }

    private final void Mf() {
        InterfaceC384330F5b interfaceC384330F5b;
        InterfaceC385510F9p interfaceC385510F9p = new InterfaceC385510F9p() { // from class: X.0EKf
            public final boolean LIZ;

            @Override // X.InterfaceC385510F9p
            public final void LIZ() {
            }

            @Override // X.InterfaceC385510F9p
            public final void LIZIZ() {
                C19A3 c19a3;
                View viewFindViewById;
                View view;
                View view2;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator listener;
                ViewPropertyAnimator updateListener;
                C214799194j c214799194j = this.LIZIZ.LL;
                if (c214799194j != null && (view2 = c214799194j.mView) != null && (viewPropertyAnimatorAnimate = view2.animate()) != null && (listener = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null) {
                    updateListener.cancel();
                }
                C214799194j c214799194j2 = this.LIZIZ.LL;
                if (c214799194j2 != null && (view = c214799194j2.mView) != null) {
                    C786410Ut5.T4(view, 1.0f);
                }
                C362760EKc c362760EKcC3 = this.LIZIZ.c3();
                if (c362760EKcC3 == null || (c19a3 = c362760EKcC3.LLJ) == null || (viewFindViewById = c19a3.findViewById(R.id.fk6)) == null) {
                    return;
                }
                C786410Ut5.T4(viewFindViewById, 1.0f);
            }

            @Override // X.InterfaceC385510F9p
            public final void LIZJ() {
                if (this.LIZ) {
                    return;
                }
                this.LIZIZ.LIZLLL();
            }

            @Override // X.InterfaceC385510F9p
            public final void O9() {
                if (this.LIZ) {
                    this.LIZIZ.LIZLLL();
                }
            }

            {
                VideoPublishEditModel editModel;
                C0EY2 c0ey2LJIIL;
                C362760EKc c362760EKcC3 = this.LIZIZ.c3();
                if (c362760EKcC3 != null && (c0ey2LJIIL = c362760EKcC3.LJIIL()) != null) {
                    editModel = c0ey2LJIIL.getEditModel();
                } else {
                    editModel = null;
                }
                this.LIZ = C1416310mxZ.LJIIZILJ(editModel);
            }
        };
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 != null && (interfaceC384330F5b = (InterfaceC384330F5b) c362760EKcC3.LLJJIJIIJIL.getValue(c362760EKcC3, C362760EKc.LLJJJJ[5])) != null) {
            interfaceC384330F5b.mp1(interfaceC385510F9p);
        }
        this.LLJIJIL = interfaceC385510F9p;
        W2().G4(new AwS549S0100000_5(this, 655));
        W2().rH2(new AwS549S0100000_5(this, 656));
        T2().Hi0(new InterfaceC386430FDd() { // from class: X.0EKj
            @Override // X.InterfaceC386430FDd
            public final void LIZIZ(AwS584S0100000_5 awS584S0100000_5) {
                this.LIZ.v3(awS584S0100000_5);
            }

            @Override // X.InterfaceC386430FDd
            public final void LIZ(boolean z, CaptionTemplateData captionTemplateData, boolean z2) {
                C362780EKe.W1(this.LIZ, z, z2, captionTemplateData, null);
            }

            @Override // X.InterfaceC386430FDd
            public final void LIZJ(boolean z, CustomCaptionTemplateData customCaptionTemplateData, boolean z2) {
                C362780EKe.W1(this.LIZ, z, z2, null, customCaptionTemplateData);
            }
        });
    }

    private final void i3() {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EOK c0eok;
        List<C0FFC> listC1;
        C0FFC next;
        TextStickerModel textStickerModelLJLI;
        List<C0FFC> listC12;
        C0EOK c0eok2 = this.LLJJI;
        if (c0eok2 != null && (listC12 = c0eok2.c1()) != null) {
            ArrayList arrayList = new ArrayList();
            for (C0FFC c0ffc : listC12) {
                if (C0F8Y.LJIIIIZZ(c0ffc.LJLI())) {
                    arrayList.add(c0ffc);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C0FFC) it2.next()).LJLI().getCaptionTemplateModel().everUsedCaptionTemplate = true;
                arrayList2.add(Unit.LIZ);
            }
        }
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 == null || (c0e48 = c362760EKcC3.LLILLJJLI) == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || (c0eok = (C0EOK) c362760EKcC3.LLJJ.getValue(c362760EKcC3, C362760EKc.LLJJJJ[1])) == null || (listC1 = c0eok.c1()) == null) {
            return;
        }
        Iterator<C0FFC> it3 = listC1.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.LJLI().getUuid(), nLETrackSlotLLLLLLIL.getUUID())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FFC c0ffc2 = next;
        if (c0ffc2 == null || (textStickerModelLJLI = c0ffc2.LJLI()) == null) {
            return;
        }
        T2().mv1(textStickerModelLJLI, this.LLJILJIL);
        this.LLJJIJIIJIL = Integer.valueOf(textStickerModelLJLI.getBaseStickerModel().getId());
        W2().OI0(C385050F7v.LJIIJJI(textStickerModelLJLI));
    }

    public final void G2() {
        Function0<Unit> function0;
        C0EOK c0eok = this.LLJJI;
        if (c0eok != null) {
            c0eok.LJLLLL(this.LLJJ);
        }
        w2(true);
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 != null && (function0 = c362760EKcC3.LLJILJILJ) != null) {
            function0.invoke();
        }
        C214799194j c214799194j = this.LL;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
    }

    public final void LIZLLL() {
        C19A3 c19a3;
        View viewFindViewById;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        View view;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator updateListener2;
        C214799194j c214799194j = this.LL;
        if (c214799194j != null && (view = c214799194j.mView) != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            if (viewPropertyAnimatorAnimate != null && (listener2 = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener2 = listener2.setUpdateListener(null)) != null) {
                updateListener2.cancel();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view.animate();
            if (viewPropertyAnimatorAnimate2 != null) {
                viewPropertyAnimatorAnimate2.setInterpolator(C1619980sG4.LIZLLL());
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
            if (viewPropertyAnimatorAnimate3 != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate3.alpha(0.0f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(300L)) != null) {
                duration2.start();
            }
        }
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 == null || (c19a3 = c362760EKcC3.LLJ) == null || (viewFindViewById = c19a3.findViewById(R.id.fk6)) == null) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate4 = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate4 != null && (listener = viewPropertyAnimatorAnimate4.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null) {
            updateListener.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate5 = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate5 != null) {
            viewPropertyAnimatorAnimate5.setInterpolator(C1619980sG4.LIZLLL());
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate6 = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate6 == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate6.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(300L)) == null) {
            return;
        }
        duration.start();
    }

    public final InterfaceC362820EKi T2() {
        return (InterfaceC362820EKi) this.LLIZLLLIL.getValue(this, LLJJJ[2]);
    }

    public final InterfaceC362840EKk W2() {
        return (InterfaceC362840EKk) this.LLIZ.getValue(this, LLJJJ[1]);
    }

    public final C362760EKc c3() {
        return (C362760EKc) this.LLILZLL.getValue(this, LLJJJ[0]);
    }

    public final void m3() {
        List<C0FFC> listC1;
        C0FFC next;
        TextStickerModel textStickerModelLJLI;
        C0EJ3 c0ej3;
        C0EOK c0eok = this.LLJJI;
        if (c0eok == null || (listC1 = c0eok.c1()) == null) {
            return;
        }
        Iterator<C0FFC> it2 = listC1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int iLIZ = C364540EQy.LIZ(next.LJLI());
            Integer num = this.LLJJIJIIJIL;
            if (num != null && iLIZ == num.intValue()) {
                break;
            }
        }
        C0FFC c0ffc = next;
        if (c0ffc == null || (textStickerModelLJLI = c0ffc.LJLI()) == null || (c0ej3 = this.LLJJIII) == null) {
            return;
        }
        c0ej3.ED2(textStickerModelLJLI, T2().e9());
    }

    @Override // X.InterfaceC364910ESj
    public boolean onBackPressed() {
        C385670FAf<C0FHM> c385670FAfS1;
        if (this.LLILLL.LJJI == 5) {
            return false;
        }
        InterfaceC384330F5b interfaceC384330F5b = this.LLJJIJI;
        if (((interfaceC384330F5b == null || (c385670FAfS1 = interfaceC384330F5b.S1()) == null) ? null : c385670FAfS1.LIZJ()) == C0FHM.VISIBLE) {
            return false;
        }
        kl1();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q3() {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362780EKe.q3():void");
    }

    private final void B3() {
        C0E55 c0e55LJIILIIL;
        NLETrackSlot nLETrackSlotLJIIJ;
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 == null || (c0e55LJIILIIL = c362760EKcC3.LJIILIIL()) == null) {
            return;
        }
        c0e55LJIILIIL.pause(false);
        C362760EKc c362760EKcC32 = c3();
        if (c362760EKcC32 == null || (nLETrackSlotLJIIJ = c362760EKcC32.LJIIJ()) == null) {
            return;
        }
        long startTime = nLETrackSlotLJIIJ.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        c0e55LJIILIIL.LJJIIZI(startTime + j, nLETrackSlotLJIIJ.getEndTime() - j, false, true);
    }

    private final void Xi() {
        C0E48 c0e48;
        C0E55 player;
        MutableLiveData mutableLiveDataLJIIIZ;
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 != null && (mutableLiveDataLJIIIZ = c362760EKcC3.LJIIIZ()) != null) {
            mutableLiveDataLJIIIZ.observe(this, new AObserverS209S0100000_5(this, 68));
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(this, new AObserverS209S0100000_5(this, 69));
        C362760EKc c362760EKcC32 = c3();
        if (c362760EKcC32 == null || (c0e48 = c362760EKcC32.LLILLJJLI) == null || (player = c0e48.getPlayer()) == null) {
            return;
        }
        player.LJJIIJZLJL(this.LLJILJILJ);
    }

    public final C09AE Z1() {
        return C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C362750EKb(this, null), 3);
    }

    @Override // X.InterfaceC364910ESj
    public void kl1() {
        View view;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        C361860EGq c361860EGq;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator updateListener;
        C362760EKc c362760EKcC3;
        InterfaceC362230EIb interfaceC362230EIbLJIIJJI;
        C19A3 c19a3;
        View viewFindViewById;
        C361860EGq c361860EGq2;
        C0E55 c0e55LJIILIIL;
        C0E55 c0e55LJIILIIL2;
        C362760EKc c362760EKcC32;
        InterfaceC384330F5b interfaceC384330F5b;
        Function0<Unit> function0;
        C362760EKc c362760EKcC33 = c3();
        if (c362760EKcC33 != null && (function0 = c362760EKcC33.LLJILJIL) != null) {
            function0.invoke();
        }
        C0EOK c0eok = this.LLJJI;
        if (c0eok != null) {
            c0eok.LJLLLL(this.LLJJ);
        }
        InterfaceC385510F9p interfaceC385510F9p = this.LLJIJIL;
        if (interfaceC385510F9p != null && (c362760EKcC32 = c3()) != null && (interfaceC384330F5b = (InterfaceC384330F5b) c362760EKcC32.LLJJIJIIJIL.getValue(c362760EKcC32, C362760EKc.LLJJJJ[5])) != null) {
            interfaceC384330F5b.hQ0(interfaceC385510F9p);
        }
        w2(true);
        C362760EKc c362760EKcC34 = c3();
        if (c362760EKcC34 != null && (c0e55LJIILIIL2 = c362760EKcC34.LJIILIIL()) != null) {
            c0e55LJIILIIL2.LJIJJLI();
        }
        C362760EKc c362760EKcC35 = c3();
        int i = 0;
        if (c362760EKcC35 != null && (c0e55LJIILIIL = c362760EKcC35.LJIILIIL()) != null) {
            c0e55LJIILIIL.pause(false);
        }
        C362760EKc c362760EKcC36 = c3();
        if ((c362760EKcC36 == null || (c361860EGq2 = c362760EKcC36.LLJIJIL) == null || !c361860EGq2.LIZ) ? false : true) {
            C362760EKc c362760EKcC37 = c3();
            if (c362760EKcC37 != null && (c19a3 = c362760EKcC37.LLJ) != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            EnumC362260EIe enumC362260EIe = this.LLJJIJIL;
            EnumC362260EIe enumC362260EIe2 = EnumC362260EIe.MIN;
            if (enumC362260EIe == enumC362260EIe2 && (c362760EKcC3 = c3()) != null && (interfaceC362230EIbLJIIJJI = c362760EKcC3.LJIIJJI()) != null) {
                interfaceC362230EIbLJIIJJI.td1(enumC362260EIe2);
            }
        }
        C19A3 c19a32 = this.LLILLJJLI;
        if (c19a32 == null || (view = c19a32.mView) == null) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (viewPropertyAnimatorAnimate != null && (listener2 = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener = listener2.setUpdateListener(null)) != null) {
            updateListener.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view.animate();
        if (viewPropertyAnimatorAnimate2 != null) {
            viewPropertyAnimatorAnimate2.setInterpolator(C1619980sG4.LIZLLL());
        }
        C362760EKc c362760EKcC38 = c3();
        if (c362760EKcC38 != null && (c361860EGq = c362760EKcC38.LLJIJIL) != null) {
            i = c361860EGq.LIZIZ;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view.animate();
        if (viewPropertyAnimatorAnimate3 == null || (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate3.translationY(i)) == null || (duration = viewPropertyAnimatorTranslationY.setDuration(300L)) == null || (listener = duration.setListener(new ALAdapterS2S0100000_5(this, 4))) == null) {
            return;
        }
        listener.start();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        i3();
        Xi();
        Mf();
        D52();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0E48 c0e48;
        C0E55 player;
        super.onDestroy();
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 == null || (c0e48 = c362760EKcC3.LLILLJJLI) == null || (player = c0e48.getPlayer()) == null) {
            return;
        }
        player.LIZ(this.LLJILJILJ);
    }

    public InterfaceC364910ESj H2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    private final void E3(List<TextStickerModel> list) {
        TextStickerModel next;
        C0EJ3 c0ej3 = this.LLJJIII;
        if (c0ej3 != null) {
            c0ej3.OZ0(list, false);
        }
        Iterator<TextStickerModel> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int iLIZ = C364540EQy.LIZ(next);
                Integer num = this.LLJJIJIIJIL;
                if (num != null && iLIZ == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TextStickerModel textStickerModel = next;
        if (textStickerModel != null) {
            T2().LJJLIIIJJIZ(textStickerModel);
            C0EJ3 c0ej32 = this.LLJJIII;
            if (c0ej32 != null) {
                c0ej32.xQ1(textStickerModel, true);
            }
        }
    }

    private final void w2(boolean z) {
        InterfaceC360800ECo interfaceC360800ECo;
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 != null && (interfaceC360800ECo = (InterfaceC360800ECo) c362760EKcC3.LLJJIJIL.getValue(c362760EKcC3, C362760EKc.LLJJJJ[6])) != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN, EnumC373450EkZ.UNDO}, null, Boolean.valueOf(z), null, null, 26);
            if (!z) {
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
            }
        }
    }

    public final void v3(Function1<? super TextStickerModel, Unit> function1) {
        C0FHM c0fhmLIZJ;
        Integer num;
        List<C0FFC> listC1;
        C0FFC next;
        TextStickerModel textStickerModelLJLI;
        VideoPublishEditModel editModel;
        C0EY2 c0ey2LJIIL;
        C362760EKc c362760EKcC3;
        InterfaceC361710EGb interfaceC361710EGb;
        C0EY2 c0ey2LJIIL2;
        C0E55 c0e55LJIILIIL;
        C385670FAf<C0FHM> c385670FAfS1;
        InterfaceC384330F5b interfaceC384330F5b = this.LLJJIJI;
        VideoPublishEditModel editModel2 = null;
        if (interfaceC384330F5b != null && (c385670FAfS1 = interfaceC384330F5b.S1()) != null) {
            c0fhmLIZJ = c385670FAfS1.LIZJ();
        } else {
            c0fhmLIZJ = null;
        }
        if (c0fhmLIZJ != C0FHM.VISIBLE && (num = this.LLJJIJIIJIL) != null) {
            int iIntValue = num.intValue();
            this.LLJ = function1;
            C0EOK c0eok = this.LLJJI;
            if (c0eok != null) {
                c0eok.LJLLLL(this.LLJJ);
            }
            C0EOK c0eok2 = this.LLJJI;
            if (c0eok2 != null) {
                c0eok2.LJJZZI(this.LLJJ);
            }
            C0EOK c0eok3 = this.LLJJI;
            if (c0eok3 != null && (listC1 = c0eok3.c1()) != null) {
                Iterator<C0FFC> it2 = listC1.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C364540EQy.LIZ(next.LJLI()) == iIntValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0FFC c0ffc = next;
                if (c0ffc != null && (textStickerModelLJLI = c0ffc.LJLI()) != null) {
                    C362760EKc c362760EKcC32 = c3();
                    if (c362760EKcC32 != null && (c0e55LJIILIIL = c362760EKcC32.LJIILIIL()) != null) {
                        c0e55LJIILIIL.pause(false);
                    }
                    C362760EKc c362760EKcC33 = c3();
                    if (c362760EKcC33 != null && (c0ey2LJIIL2 = c362760EKcC33.LJIIL()) != null) {
                        editModel = c0ey2LJIIL2.getEditModel();
                    } else {
                        editModel = null;
                    }
                    if (!C1416310mxZ.LJIIZILJ(editModel) && (c362760EKcC3 = c3()) != null && (interfaceC361710EGb = (InterfaceC361710EGb) c362760EKcC3.LLJJJ.getValue(c362760EKcC3, C362760EKc.LLJJJJ[7])) != null) {
                        interfaceC361710EGb.LR1(false);
                    }
                    textStickerModelLJLI.getCaptionTemplateModel().customTemplateData.hasEdited = true;
                    C0EJ3 c0ej3 = this.LLJJIII;
                    if (c0ej3 != null) {
                        c0ej3.Gu0(textStickerModelLJLI);
                    }
                    C362760EKc c362760EKcC34 = c3();
                    if (c362760EKcC34 != null && (c0ey2LJIIL = c362760EKcC34.LJIIL()) != null) {
                        editModel2 = c0ey2LJIIL.getEditModel();
                    }
                    u4.LJJLIIIIJ(editModel2, "caption_template_custom", 1, null, null, null, null, null, Boolean.TRUE, Boolean.valueOf(textStickerModelLJLI.isVERenderSticker()), 248);
                }
            }
        }
    }

    private final String o2(String str, TextFontModel textFontModel) {
        Context sceneContext;
        TextPaint textPaint = this.LLJI;
        textPaint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(textFontModel.fontSize)));
        textPaint.setTypeface(C0FI2.LJJI(textFontModel.fileName));
        C214799194j c214799194j = this.LL;
        if (c214799194j != null) {
            sceneContext = c214799194j.getSceneContext();
        } else {
            sceneContext = null;
        }
        return C385390F9d.LIZ(str, sceneContext, this.LLJI);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [X.0EKd] */
    public C362780EKe(C214799194j c214799194j, C19A3 c19a3, CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior, C1DRG c1drg) {
        C0EOK c0eok;
        C0EJ3 c0ej3;
        this.LL = c214799194j;
        this.LLILLJJLI = c19a3;
        this.LLILLL = creativeBottomSheetBehavior;
        this.LLILZ = c1drg;
        final Class<TextStickerModel> cls = TextStickerModel.class;
        this.LLJJ = new AbstractC19622511pv<TextStickerModel>(cls) { // from class: X.0EKd
            public final EnumC1466150oFx LLILLJJLI = EnumC1466150oFx.TEXT;

            @Override // X.AbstractC19622511pv
            public final EnumC1466150oFx LJJIJLIJ() {
                return this.LLILLJJLI;
            }

            @Override // X.AbstractC19622511pv
            public final void LJJJJLI(StickerModel stickerModel, boolean z) {
                VideoPublishEditModel editModel;
                View view;
                C361860EGq c361860EGq;
                C362760EKc c362760EKcC3;
                InterfaceC362230EIb interfaceC362230EIbLJIIJJI;
                C19A3 c19a32;
                View viewFindViewById;
                C0E5S c0e5s;
                C0E55 c0e55LJIILIIL;
                MutableLiveData mutableLiveDataLJIIIZ;
                C19A3 c19a33;
                View viewFindViewById2;
                C362760EKc c362760EKcC32;
                InterfaceC361710EGb interfaceC361710EGb;
                C0EY2 c0ey2LJIIL;
                TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
                this.LLILLL.W2().OI0(C385050F7v.LJIIJJI(textStickerModel));
                CaptionTemplateModel captionTemplateModel = textStickerModel.getCaptionTemplateModel();
                captionTemplateModel.customTemplateData = C363470EMv.LIZLLL(textStickerModel);
                captionTemplateModel.templateData = null;
                Function1<? super TextStickerModel, Unit> function1 = this.LLILLL.LLJ;
                if (function1 != null) {
                    function1.invoke(textStickerModel);
                }
                C362760EKc c362760EKcC33 = this.LLILLL.c3();
                if (c362760EKcC33 != null && (c0ey2LJIIL = c362760EKcC33.LJIIL()) != null) {
                    editModel = c0ey2LJIIL.getEditModel();
                } else {
                    editModel = null;
                }
                if (!C1416310mxZ.LJIIZILJ(editModel) && (c362760EKcC32 = this.LLILLL.c3()) != null && (interfaceC361710EGb = (InterfaceC361710EGb) c362760EKcC32.LLJJJ.getValue(c362760EKcC32, C362760EKc.LLJJJJ[7])) != null) {
                    interfaceC361710EGb.LR1(true);
                }
                C362780EKe c362780EKe = this.LLILLL;
                c362780EKe.LLJ = null;
                C362760EKc c362760EKcC34 = c362780EKe.c3();
                if (c362760EKcC34 != null && (c19a33 = c362760EKcC34.LLJ) != null && (viewFindViewById2 = c19a33.findViewById(R.id.fk6)) != null) {
                    C786410Ut5.T4(viewFindViewById2, 1.0f);
                }
                if (!textStickerModel.isNotEmptyModel()) {
                    C362760EKc c362760EKcC35 = this.LLILLL.c3();
                    if (c362760EKcC35 != null && (mutableLiveDataLJIIIZ = c362760EKcC35.LJIIIZ()) != null) {
                        mutableLiveDataLJIIIZ.removeObservers(this.LLILLL);
                    }
                    C362760EKc c362760EKcC36 = this.LLILLL.c3();
                    if (c362760EKcC36 != null && (c361860EGq = c362760EKcC36.LLJIJIL) != null && c361860EGq.LIZ) {
                        C362760EKc c362760EKcC37 = this.LLILLL.c3();
                        if (c362760EKcC37 != null && (c0e55LJIILIIL = c362760EKcC37.LJIILIIL()) != null) {
                            c0e55LJIILIIL.pause(false);
                        }
                        C362760EKc c362760EKcC38 = this.LLILLL.c3();
                        if (c362760EKcC38 != null && (c0e5s = (C0E5S) c362760EKcC38.LLJJI.getValue(c362760EKcC38, C362760EKc.LLJJJJ[2])) != null) {
                            c0e5s.w6(null, false, false);
                        }
                        C362760EKc c362760EKcC39 = this.LLILLL.c3();
                        if (c362760EKcC39 != null && (c19a32 = c362760EKcC39.LLJ) != null && (viewFindViewById = c19a32.findViewById(R.id.gct)) != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        }
                        C362780EKe c362780EKe2 = this.LLILLL;
                        EnumC362260EIe enumC362260EIe = c362780EKe2.LLJJIJIL;
                        EnumC362260EIe enumC362260EIe2 = EnumC362260EIe.MIN;
                        if (enumC362260EIe == enumC362260EIe2 && (c362760EKcC3 = c362780EKe2.c3()) != null && (interfaceC362230EIbLJIIJJI = c362760EKcC3.LJIIJJI()) != null) {
                            interfaceC362230EIbLJIIJJI.td1(enumC362260EIe2);
                        }
                    }
                    C354270Duj.LIZ(0L, new AwS549S0100000_5(this.LLILLL, 657));
                    return;
                }
                C214799194j c214799194j2 = this.LLILLL.LL;
                if (c214799194j2 == null || (view = c214799194j2.mView) == null) {
                    return;
                }
                C786410Ut5.T4(view, 1.0f);
            }
        };
        C362760EKc c362760EKcC3 = c3();
        if (c362760EKcC3 != null) {
            c0eok = (C0EOK) c362760EKcC3.LLJJ.getValue(c362760EKcC3, C362760EKc.LLJJJJ[1]);
        } else {
            c0eok = null;
        }
        this.LLJJI = c0eok;
        C362760EKc c362760EKcC32 = c3();
        if (c362760EKcC32 != null) {
            c0ej3 = (C0EJ3) c362760EKcC32.LLJJIJI.getValue(c362760EKcC32, C362760EKc.LLJJJJ[4]);
        } else {
            c0ej3 = null;
        }
        this.LLJJIII = c0ej3;
        C362760EKc c362760EKcC33 = c3();
        this.LLJJIJI = c362760EKcC33 != null ? (InterfaceC384330F5b) c362760EKcC33.LLJJIJIIJIL.getValue(c362760EKcC33, C362760EKc.LLJJJJ[5]) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void W1(X.C362780EKe r104, boolean r105, boolean r106, com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData r107, com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData r108) {
        /*
            Method dump skipped, instruction units count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362780EKe.W1(X.0EKe, boolean, boolean, com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData, com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData):void");
    }
}
