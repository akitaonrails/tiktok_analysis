package X;

import Y.ARunnableS16S0101000_5;
import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0FRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390230FRt extends C388270FKf {
    public final ViewGroup LIZIZ;
    public final C390250FRv LIZJ;
    public C19614411oc LIZLLL;
    public final C1664680tQA<AddYoursStickerModel> LJ;
    public int LJFF;
    public int LJI;
    public final int LJII;
    public final C01GW LJIIIIZZ;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        InterfaceC390170FRn interfaceC390170FRn = this.LIZJ.LJI;
        if (interfaceC390170FRn != null) {
            boolean z = C0FS1.LLJJIJIIJIL;
            boolean z2 = C0FS1.LLJJIJIIJIL;
            String topicText = this.LJ.LIZ.getTopicText();
            if (topicText == null) {
                topicText = "";
            }
            String addYoursEnterMethod = this.LJ.LIZ.getAddYoursEnterMethod();
            interfaceC390170FRn.LIZJ(topicText, addYoursEnterMethod != null ? addYoursEnterMethod : "", z2);
        }
    }

    public final C19614411oc LJIIIIZZ() {
        C19614411oc c19614411oc = this.LIZLLL;
        if (c19614411oc != null) {
            return c19614411oc;
        }
        return null;
    }

    public final Integer LJIIIZ() {
        EnumC390270FRx enumC390270FRx = this.LIZJ.LJIIL;
        if (enumC390270FRx != EnumC390270FRx.SMALL_BLUE && enumC390270FRx != EnumC390270FRx.SMALL_YELLOW) {
            return Integer.valueOf(LJIIIIZZ().getContentEditText().getWidth());
        }
        if (LJIIIIZZ().getParent() instanceof ViewGroup) {
            return Integer.valueOf((C0FV2.LIZIZ(LJIIIIZZ().getContext()) - (this.LJII * 2)) - C1919207fS.LJIIJ());
        }
        return null;
    }

    public final void LJIIJ() {
        EnumC390270FRx enumC390270FRx = this.LIZJ.LJIIL;
        if (enumC390270FRx == EnumC390270FRx.SMALL_BLUE || enumC390270FRx == EnumC390270FRx.SMALL_YELLOW) {
            C390290FRz contentEditText = LJIIIIZZ().getContentEditText();
            Integer numLJIIIZ = LJIIIZ();
            if (numLJIIIZ != null) {
                int iIntValue = numLJIIIZ.intValue();
                String strValueOf = String.valueOf(C2204961BRm.B(contentEditText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUeBwlhe8kYnXMyYIOGO4ZwZg5EKSXAW4Hbwlm35A==", null)));
                C19591311kt c19591311kt = C19591311kt.LIZ;
                Context context = contentEditText.getContext();
                c19591311kt.getClass();
                float fFloatValue = 14.0f;
                if (C19591311kt.LJI(context, strValueOf, 14.0f) <= iIntValue) {
                    this.LIZJ.LJ.LIZLLL(new AwS3S0000001_5(14.0f, 16), true);
                    this.LIZJ.LJFF.LIZLLL(new AwS3S0000001_5(14.0f, 17), true);
                    this.LIZJ.LJ.LIZLLL(new AwS3S0000001_5(1.0f, 18), true);
                    return;
                }
                float fMin = Math.min(contentEditText.getTextSize(), 14.0f);
                Context context2 = contentEditText.getContext();
                String strValueOf2 = String.valueOf(C2204961BRm.B(contentEditText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUeBwlhe8kYnXMyYIOGO4ZwZg5EKSXAW4Hbwlm35A==", null)));
                Float fValueOf = Float.valueOf(fMin);
                if (fValueOf != null) {
                    c19591311kt.getClass();
                    fFloatValue = fValueOf.floatValue();
                }
                c19591311kt.getClass();
                int iLJI = C19591311kt.LJI(context2, strValueOf2, fFloatValue);
                if (iLJI > iIntValue) {
                    while (iLJI > iIntValue && fFloatValue > 6.0f) {
                        fFloatValue -= 2;
                        iLJI = C19591311kt.LJI(context2, strValueOf2, fFloatValue);
                    }
                }
                this.LIZJ.LJ.LIZLLL(new AwS3S0000001_5(fFloatValue, 16), true);
                this.LIZJ.LJFF.LIZLLL(new AwS3S0000001_5(fFloatValue, 17), true);
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(LJIIIIZZ(), new ARunnableS16S0101000_5(iIntValue, this, 4));
            }
        }
    }

    public C390230FRt(ViewGroup viewGroup, C390250FRv c390250FRv) {
        super(c390250FRv);
        this.LIZIZ = viewGroup;
        this.LIZJ = c390250FRv;
        C1664680tQA<AddYoursStickerModel> c1664680tQA = c390250FRv.LJ;
        this.LJ = c1664680tQA;
        this.LJII = C1919207fS.LIZJ();
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 152));
        C19614411oc c19614411oc = new C19614411oc(viewGroup.getContext(), c390250FRv.LJIIJJI.LIZJ.invoke());
        c19614411oc.LIZIZ(c390250FRv.LIZLLL, c1664680tQA);
        this.LIZLLL = c19614411oc;
        viewGroup.addView(LJIIIIZZ());
        C390290FRz contentEditText = LJIIIIZZ().getContentEditText();
        contentEditText.LLIZ.add(new AwS619S0100000_5(this, 46));
        C390290FRz contentEditText2 = LJIIIIZZ().getContentEditText();
        contentEditText2.LLIZLLLIL.add(new AwS619S0100000_5(this, 47));
        final C390290FRz contentEditText3 = LJIIIIZZ().getContentEditText();
        contentEditText3.setImeOptions(6);
        contentEditText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0FRw
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) throws Throwable {
                if (i != 6) {
                    return false;
                }
                Editable editableB = C2204961BRm.B(contentEditText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUeBwlhe8kYnXMyYIOGO4ZwZg5EKSXAW4Hbwlm35A==", null));
                if (editableB != null && editableB.length() != 0) {
                    this.LIZJ.LJIIJJI.LJI.invoke(contentEditText3);
                }
                return true;
            }
        });
        LJIIIIZZ().getContentEditText().addTextChangedListener(new C0FX5(this, 0));
        c390250FRv.LJ.LIZ(new C2217381BqS() { // from class: X.0FFW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AddYoursStickerModel) obj).getBaseStickerModel();
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0ESF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }).LJIIIZ(c390250FRv.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 887));
    }
}
