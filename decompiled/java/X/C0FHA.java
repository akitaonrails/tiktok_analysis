package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FHA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHA extends C388270FKf {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public C388810FMh LIZLLL;
    public final C1664680tQA<TextStickerModel> LJ;
    public final LifecycleOwner LJFF;
    public final C0FF8 LJI;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        C388200FJy c388200FJy = this.LIZJ;
        if (c388200FJy.LJIIIZ.LJJIIJ) {
            return;
        }
        C1664680tQA<C387990FJd> c1664680tQA = c388200FJy.LJIIJ;
        if (c1664680tQA.LIZ.LIZIZ == C0FHM.VISIBLE) {
            c1664680tQA.LIZLLL(AFwS234S0000000_5.get$arr$(530), true);
        }
    }

    public C0FHA(ViewGroup viewGroup, C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        C1664680tQA<TextStickerModel> c1664680tQA = c388200FJy.LJ;
        this.LJ = c1664680tQA;
        LifecycleOwner lifecycleOwner = c388200FJy.LIZLLL;
        this.LJFF = lifecycleOwner;
        this.LJI = c388200FJy.LJFF;
        C388810FMh c388810FMh = (C388810FMh) viewGroup.findViewById(R.id.e8b);
        this.LIZLLL = c388810FMh;
        if (c388810FMh != null) {
            c388810FMh.setColorChangeListener(new InterfaceC388860FMm() { // from class: X.0FH8
                @Override // X.InterfaceC388860FMm
                public final void LIZ(int i) {
                    C0FGR c0fgrLIZJ;
                    C0FGR c0fgrLIZJ2;
                    SubTemplateStyle subTemplateStyle;
                    if (this.LIZ.LJ.LIZ.getTextTemplateModel().enableTextTemplate) {
                        C0FAS.LIZIZ(this.LIZ.LJ.LIZ);
                    }
                    if (!this.LIZ.LJ.LIZ.getTextTemplateModel().enableTextTemplate) {
                        this.LIZ.LJ.LIZ.getTextTemplateModel().editedColor = true;
                    }
                    if (C0F8Y.LJIIIZ(this.LIZ.LJ.LIZ)) {
                        SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(this.LIZ.LJ.LIZ.getCompatModel().getSelectSlotIndex(), this.LIZ.LJ.LIZ.getCompatModel().getSubTemplates());
                        if (subTemplateInfo != null && (subTemplateStyle = subTemplateInfo.style) != null) {
                            Integer numValueOf = Integer.valueOf(subTemplateStyle.color);
                            if (numValueOf.intValue() != this.LIZ.LJ.LIZ.getColor()) {
                                this.LIZ.LJ.LIZLLL(new AwS20S0001000_5(numValueOf.intValue(), 35), true);
                            }
                        }
                    }
                    this.LIZ.LJ.LIZLLL(new AwS20S0001000_5(i, 36), true);
                    C0FF8 c0ff8 = this.LIZ.LJI;
                    if (c0ff8 != null && (c0fgrLIZJ2 = c0ff8.LIZJ()) != null) {
                        c0fgrLIZJ2.LJIIZILJ(this.LIZ.LJ.LIZ, C0FHF.CLICK.getValue());
                    }
                    C0FF8 c0ff82 = this.LIZ.LJI;
                    if (c0ff82 != null && (c0fgrLIZJ = c0ff82.LIZJ()) != null) {
                        c0fgrLIZJ.LJIIJ(this.LIZ.LJ.LIZ);
                    }
                }
            });
        }
        C388810FMh c388810FMh2 = this.LIZLLL;
        if (c388810FMh2 != null) {
            c388810FMh2.setOnColorShowListener(new C0FHE() { // from class: X.0FH9
                @Override // X.C0FHE
                public final void LIZ(int i) {
                    C0FGR c0fgrLIZJ;
                    C0FF8 c0ff8 = this.LIZ.LJI;
                    if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                        c0fgrLIZJ.LIZ(i);
                    }
                }
            });
        }
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F9R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getColor());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1111));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.0F8s
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextTemplateModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextTemplateModel((TextTemplateModel) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1115));
        c388200FJy.LJ(new AwS584S0100000_5(this, 1119), C13LE.LIZ(C0FHG.class));
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FHC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZIZ;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1121));
    }
}
